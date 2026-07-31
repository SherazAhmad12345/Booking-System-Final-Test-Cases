package AITests;

import static org.junit.Assert.*;

import java.nio.file.Files;
import java.nio.file.Path;

import org.junit.Test;

import administratorManagement.Administrator;
import dataManagement.MaintainAdministrator;

public class MaintainAdministratorTest {
    @Test
    public void savesLoadsSearchesAndAuthenticatesAdministrators() throws Exception {
        Path file = Files.createTempFile("admins", ".csv");
        MaintainAdministrator source = new MaintainAdministrator();
        source.addAdmin(new Administrator("Alice", "Strong1!", "alice@yorku.ca", 2, true));
        source.addAdmin(new Administrator("Bob", "Strong2!", "bob@yorku.ca", 8));
        source.save(file.toString());

        MaintainAdministrator loaded = new MaintainAdministrator();
        loaded.load(file.toString());
        assertEquals(file.toString(), loaded.path);
        assertEquals(2, loaded.admins.size());
        assertTrue(loaded.usernameExists("alice"));
        assertSame(loaded.admins.get(0), loaded.authenticate("ALICE", "Strong1!"));
        assertNull(loaded.authenticate("Alice", "bad"));
        assertEquals(9, loaded.nextId());
        assertTrue(loaded.admins.get(0).isChiefEventCoordinator());
    }

    @Test
    public void loadingMissingFileProducesEmptyCollection() throws Exception {
        MaintainAdministrator data = new MaintainAdministrator();
        data.addAdmin(new Administrator("old", "x", "old@yorku.ca", 1));
        Path missing = Files.createTempDirectory("missing-admin").resolve("none.csv");
        data.load(missing.toString());
        assertTrue(data.admins.isEmpty());
        assertEquals(1, data.nextId());
    }
}
