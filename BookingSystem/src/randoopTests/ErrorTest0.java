package randoopTests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test1");
        bookingManagment.BookingManager bookingManager0 = bookingManagment.BookingManager.getInstance();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        bookingManager0.extendBooking("Faculty", "ROOM OPTIONS");
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        bookingManagment.BookingManager bookingManager0 = bookingManagment.BookingManager.getInstance();
        bookingManagment.Booking booking2 = bookingManager0.getBooking("hi!");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double4 = bookingManager0.getTotalCost("");
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        bookingManagment.BookingManager bookingManager0 = bookingManagment.BookingManager.getInstance();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double2 = bookingManager0.getTotalCost("DASHBOARD");
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        bookingManagment.BookingManager bookingManager0 = bookingManagment.BookingManager.getInstance();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        bookingManager0.extendBooking("BOOKING", "DASHBOARD");
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test5");
        bookingManagment.BookingManager bookingManager0 = bookingManagment.BookingManager.getInstance();
        bookingManagment.Booking booking2 = bookingManager0.getBooking("hi!");
        bookingManagment.Booking booking4 = bookingManager0.getBooking("DASHBOARD");
        bookingManager0.cancelBooking("");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double8 = bookingManager0.getTotalCost("");
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test6");
        bookingManagment.BookingManager bookingManager0 = bookingManagment.BookingManager.getInstance();
        bookingManagment.Booking booking2 = bookingManager0.getBooking("hi!");
        bookingManagment.Booking booking4 = bookingManager0.getBooking("DASHBOARD");
        bookingManager0.cancelBooking("");
        java.util.List<bookingManagment.Booking> bookingList8 = bookingManager0.getBookingsForUser("EXTEND BOOKING");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        bookingManager0.extendBooking("PAYMENT", "CANCEL BOOKING");
    }

    @Test
    public void test7() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test7");
        bookingManagment.BookingManager bookingManager0 = bookingManagment.BookingManager.getInstance();
        bookingManagment.Booking booking2 = bookingManager0.getBooking("Partner");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double4 = bookingManager0.getTotalCost("Faculty [username=null, email=null, id=0]");
    }

    @Test
    public void test8() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test8");
        dataManagement.MaintainUser maintainUser0 = new dataManagement.MaintainUser();
        userManagement.User user3 = maintainUser0.authenticate("gui.BookingInformationPage[,0,0,0x0,invalid,layout=java.awt.GridBagLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", "MANAGE ROOMS");
        userManagement.Staff staff9 = new userManagement.Staff("MANAGE ROOMS", "DASHBOARD", "MANAGE ROOMS", (int) (byte) 100, "PAYMENT");
        int int10 = staff9.getHourlyRate();
        staff9.setOrgIdOrStudentNumber("LOGIN");
        maintainUser0.addUser((userManagement.User) staff9);
        userManagement.Staff staff14 = new userManagement.Staff();
        maintainUser0.addUser((userManagement.User) staff14);
        maintainUser0.path = "USER OPTIONS";
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean19 = maintainUser0.usernameExists("CREATE ROOM");
    }
}

