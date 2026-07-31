package AITests;

import static org.junit.Assert.*;

import java.nio.file.Files;
import java.nio.file.Path;

import org.junit.Test;

import dataManagement.MaintainUser;
import userManagement.Staff;
import userManagement.Student;

public class MaintainUserTest {
    @Test
    public void savesLoadsSearchesAndAuthenticatesUsers() throws Exception {
        Path file = Files.createTempFile("users", ".csv");
        MaintainUser source = new MaintainUser();
        source.addUser(new Student("Alice", "Strong1!", "alice@my.yorku.ca", 2, "S1"));
        source.addUser(new Staff("Bob", "Strong2!", "bob@yorku.ca", 8, "ORG"));
        source.save(file.toString());

        MaintainUser loaded = new MaintainUser();
        loaded.load(file.toString());
        assertEquals(file.toString(), loaded.path);
        assertEquals(2, loaded.users.size());
        assertTrue(loaded.usernameExists("alice"));
        assertTrue(loaded.emailExists("ALICE@MY.YORKU.CA"));
        assertSame(loaded.users.get(0), loaded.authenticate("ALICE", "Strong1!"));
        assertNull(loaded.authenticate("Alice", "bad"));
        assertEquals(9, loaded.nextId());
        assertEquals("Student", loaded.users.get(0).getUserType());
    }

    @Test
    public void loadingMissingFileClearsPreviousUsers() throws Exception {
        MaintainUser data = new MaintainUser();
        data.addUser(new Student("old", "x", "old@my.yorku.ca", 1, "S"));
        Path missing = Files.createTempDirectory("missing-user").resolve("none.csv");
        data.load(missing.toString());
        assertTrue(data.users.isEmpty());
        assertEquals(1, data.nextId());
    }
}
