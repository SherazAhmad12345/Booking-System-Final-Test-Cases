package randoopTests;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        java.util.Locale locale0 = null;
        javax.swing.JComponent.setDefaultLocale(locale0);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        int int0 = java.awt.image.ImageObserver.ERROR;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 64 + "'", int0 == 64);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        java.lang.String str0 = gui.AppFrame.CARD_PAYMENT;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "PAYMENT" + "'", str0.equals("PAYMENT"));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        int int0 = java.awt.Frame.NE_RESIZE_CURSOR;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        // The following exception was thrown during execution in test generation
        try {
            userManagement.User user6 = userManagement.UserFactory.createUser("hi!", "", "", "", (int) (short) 100, "PAYMENT");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Unknown user type: hi!");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension6 = null;
        bookingInformationPage1.setPreferredSize(dimension6);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray8 = bookingInformationPage1.getPropertyChangeListeners();
        java.lang.Class<?> wildcardClass9 = propertyChangeListenerArray8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(propertyChangeListenerArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        java.lang.String str0 = gui.AppFrame.CARD_DASHBOARD;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "DASHBOARD" + "'", str0.equals("DASHBOARD"));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        int int0 = javax.swing.WindowConstants.HIDE_ON_CLOSE;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.show(false);
        java.awt.Color color6 = bookingInformationPage1.getForeground();
        java.awt.FocusTraversalPolicy focusTraversalPolicy7 = null;
        bookingInformationPage1.setFocusTraversalPolicy(focusTraversalPolicy7);
        java.awt.Component component9 = bookingInformationPage1.getNextFocusableComponent();
        java.awt.Point point10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = component9.contains(point10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component9);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        boolean boolean0 = javax.swing.JFrame.isDefaultLookAndFeelDecorated();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.setVerifyInputWhenFocusTarget(true);
        java.awt.Insets insets6 = bookingInformationPage1.getInsets();
        java.awt.AWTEvent aWTEvent7 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingInformationPage1.dispatchEvent(aWTEvent7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.AWTEvent.getID()\" because \"e\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(insets6);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        int int0 = java.awt.Frame.SE_RESIZE_CURSOR;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        java.lang.String str0 = gui.AppFrame.CARD_LOGIN;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "LOGIN" + "'", str0.equals("LOGIN"));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        java.lang.String str0 = gui.AppFrame.CARD_MANAGE_ROOMS;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "MANAGE ROOMS" + "'", str0.equals("MANAGE ROOMS"));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        java.lang.String str0 = gui.PaymentPage.getPaymentType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "" + "'", str0.equals(""));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        java.lang.String str0 = gui.AppFrame.CARD_ROOM_OPTIONS;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ROOM OPTIONS" + "'", str0.equals("ROOM OPTIONS"));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        java.lang.String str0 = gui.AppFrame.CARD_WELCOME;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "WELCOME" + "'", str0.equals("WELCOME"));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        int int0 = java.awt.Frame.SW_RESIZE_CURSOR;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        int int0 = java.awt.Frame.TEXT_CURSOR;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.show(false);
        java.awt.Color color6 = bookingInformationPage1.getForeground();
        boolean boolean7 = bookingInformationPage1.isMaximumSizeSet();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        userManagement.Staff staff5 = new userManagement.Staff("LOGIN", "WELCOME", "hi!", (int) (short) 0, "ROOM OPTIONS");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        int int0 = java.awt.Frame.CROSSHAIR_CURSOR;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.io.PrintStream printStream2 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingInformationPage1.list(printStream2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintStream.println(Object)\" because \"out\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        boolean boolean1 = gui.BookingInformationPage.isValidDate("WELCOME");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        java.awt.Window[] windowArray0 = java.awt.Window.getWindows();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(windowArray0);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        java.lang.String str0 = gui.AppFrame.CARD_EXTEND_BOOKING;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "EXTEND BOOKING" + "'", str0.equals("EXTEND BOOKING"));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        java.util.List<javax.swing.JTextField> jTextFieldList0 = gui.BookingInformationPage.getInfo();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jTextFieldList0);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        boolean boolean1 = gui.BookingInformationPage.isValidDate("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.show(false);
        gui.AppFrame appFrame7 = null;
        gui.BookingInformationPage bookingInformationPage8 = new gui.BookingInformationPage(appFrame7);
        java.awt.Color color9 = null;
        bookingInformationPage8.setBackground(color9);
        bookingInformationPage8.show(false);
        java.awt.Color color13 = bookingInformationPage8.getForeground();
        bookingInformationPage8.removeNotify();
        java.awt.Event event15 = null;
        boolean boolean17 = bookingInformationPage8.gotFocus(event15, (java.lang.Object) false);
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component18 = bookingInformationPage1.add("WELCOME", (java.awt.Component) bookingInformationPage8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cannot add to layout: constraints must be a GridBagConstraint");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        bookingManagment.BookingManager bookingManager0 = bookingManagment.BookingManager.getInstance();
        bookingManagment.Booking booking2 = bookingManager0.getBooking("hi!");
        java.util.Date date6 = null;
        bookingManagment.Booking booking12 = new bookingManagment.Booking("hi!", "ROOM OPTIONS", "ROOM OPTIONS", date6, "ROOM OPTIONS", "gui.BookingInformationPage[,0,0,0x0,invalid,layout=java.awt.GridBagLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", (double) (-1), (double) (short) -1, (double) (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = bookingManager0.isRoomAvailableForExtension(booking12, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        gui.AppFrame appFrame0 = null;
        gui.RoomOptionsPage roomOptionsPage1 = new gui.RoomOptionsPage(appFrame0);
        gui.AppFrame appFrame2 = null;
        gui.BookingInformationPage bookingInformationPage3 = new gui.BookingInformationPage(appFrame2);
        java.awt.Color color4 = null;
        bookingInformationPage3.setBackground(color4);
        bookingInformationPage3.show(false);
        java.awt.LayoutManager layoutManager8 = bookingInformationPage3.getLayout();
        bookingInformationPage3.transferFocus();
        int int10 = roomOptionsPage1.getComponentZOrder((java.awt.Component) bookingInformationPage3);
        bookingInformationPage3.reshape(0, (int) (byte) 100, (int) (byte) -1, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        int int0 = java.awt.Frame.DEFAULT_CURSOR;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension6 = null;
        bookingInformationPage1.setPreferredSize(dimension6);
        gui.AppFrame appFrame8 = null;
        gui.BookingInformationPage bookingInformationPage9 = new gui.BookingInformationPage(appFrame8);
        java.awt.Color color10 = null;
        bookingInformationPage9.setBackground(color10);
        bookingInformationPage9.show(false);
        java.awt.LayoutManager layoutManager14 = bookingInformationPage9.getLayout();
        bookingInformationPage1.putClientProperty((java.lang.Object) layoutManager14, (java.lang.Object) 0);
        boolean boolean17 = bookingInformationPage1.isMaximumSizeSet();
        java.awt.Event event18 = null;
        gui.AppFrame appFrame19 = null;
        gui.BookingInformationPage bookingInformationPage20 = new gui.BookingInformationPage(appFrame19);
        java.awt.Color color21 = null;
        bookingInformationPage20.setBackground(color21);
        javax.swing.plaf.PanelUI panelUI23 = null;
        bookingInformationPage20.setUI(panelUI23);
        java.awt.event.FocusListener[] focusListenerArray25 = bookingInformationPage20.getFocusListeners();
        boolean boolean26 = bookingInformationPage1.lostFocus(event18, (java.lang.Object) focusListenerArray25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(focusListenerArray25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        int int0 = java.awt.image.ImageObserver.FRAMEBITS;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 16 + "'", int0 == 16);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension6 = null;
        bookingInformationPage1.setPreferredSize(dimension6);
        bookingInformationPage1.firePropertyChange("hi!", false, true);
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior12 = bookingInformationPage1.getBaselineResizeBehavior();
        java.awt.Font font13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.FontMetrics fontMetrics14 = bookingInformationPage1.getFontMetrics(font13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Font.hashCode()\" because \"font\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior12 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior12.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        gui.PaymentPage.setTypeOfPayment("gui.BookingInformationPage[,0,0,0x0,invalid,layout=java.awt.GridBagLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]");
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        java.lang.String str0 = gui.AppFrame.CARD_USER_OPTIONS;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "USER OPTIONS" + "'", str0.equals("USER OPTIONS"));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        bookingInformationPage1.repaint((int) (byte) 1, (int) (byte) 10, (int) '4', (int) (byte) 0);
        gui.AppFrame appFrame7 = null;
        gui.BookingInformationPage bookingInformationPage8 = new gui.BookingInformationPage(appFrame7);
        java.awt.Color color9 = null;
        bookingInformationPage8.setBackground(color9);
        bookingInformationPage8.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension13 = null;
        bookingInformationPage8.setPreferredSize(dimension13);
        java.awt.Event event15 = null;
        boolean boolean18 = bookingInformationPage8.mouseExit(event15, 10, (int) (byte) 10);
        java.lang.Object obj19 = bookingInformationPage1.getClientProperty((java.lang.Object) 10);
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        bookingInformationPage1.addPropertyChangeListener(propertyChangeListener20);
        java.awt.event.MouseListener[] mouseListenerArray22 = bookingInformationPage1.getMouseListeners();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mouseListenerArray22);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        javax.swing.JPopupMenu jPopupMenu2 = bookingInformationPage1.getComponentPopupMenu();
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Container container3 = jPopupMenu2.getParent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(jPopupMenu2);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.show(false);
        java.awt.Color color6 = bookingInformationPage1.getForeground();
        bookingInformationPage1.setEnabled(false);
        java.awt.Dimension dimension9 = bookingInformationPage1.preferredSize();
        int int10 = bookingInformationPage1.getComponentCount();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dimension9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        int int0 = java.awt.image.ImageObserver.SOMEBITS;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        java.awt.Event event4 = null;
        boolean boolean7 = bookingInformationPage1.mouseEnter(event4, 10, 0);
        gui.AppFrame appFrame8 = null;
        gui.PaymentPage paymentPage9 = new gui.PaymentPage(appFrame8);
        gui.AppFrame appFrame10 = null;
        gui.BookingInformationPage bookingInformationPage11 = new gui.BookingInformationPage(appFrame10);
        java.awt.Color color12 = null;
        bookingInformationPage11.setBackground(color12);
        bookingInformationPage11.show(false);
        java.awt.Color color16 = bookingInformationPage11.getForeground();
        bookingInformationPage11.setEnabled(false);
        java.awt.Dimension dimension19 = bookingInformationPage11.getPreferredSize();
        // The following exception was thrown during execution in test generation
        try {
            bookingInformationPage1.add((java.awt.Component) appFrame8, (java.lang.Object) bookingInformationPage11, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: illegal component position");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dimension19);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        userManagement.Partner partner5 = new userManagement.Partner("LOGIN", "MANAGE ROOMS", "WELCOME", (int) (short) -1, "PAYMENT");
        int int6 = partner5.getHourlyRate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 50 + "'", int6 == 50);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.show(false);
        java.awt.Color color6 = bookingInformationPage1.getForeground();
        gui.AppFrame appFrame7 = null;
        gui.BookingInformationPage bookingInformationPage8 = new gui.BookingInformationPage(appFrame7);
        java.awt.Color color9 = null;
        bookingInformationPage8.setBackground(color9);
        bookingInformationPage8.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension13 = null;
        bookingInformationPage8.setPreferredSize(dimension13);
        int int15 = bookingInformationPage1.getComponentZOrder((java.awt.Component) bookingInformationPage8);
        java.awt.Event event16 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = bookingInformationPage1.postEvent(event16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"id\" because \"evt\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        payment.InstitutionsBilling institutionsBilling5 = new payment.InstitutionsBilling((double) (short) 1, "hi!", "PAYMENT", "PAYMENT", (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            double double6 = institutionsBilling5.calculateCost();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        int int0 = java.awt.Frame.HAND_CURSOR;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        java.util.Date date3 = null;
        bookingManagment.Booking booking9 = new bookingManagment.Booking("hi!", "ROOM OPTIONS", "ROOM OPTIONS", date3, "ROOM OPTIONS", "gui.BookingInformationPage[,0,0,0x0,invalid,layout=java.awt.GridBagLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", (double) (-1), (double) (short) -1, (double) (-1));
        double double10 = booking9.getTotalCost();
        java.util.Date date11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = booking9.hasStarted(date11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        java.lang.String str0 = gui.AppFrame.CARD_BOOKING_INFORMATION;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "BOOKING" + "'", str0.equals("BOOKING"));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        gui.AppFrame appFrame0 = null;
        gui.RoomOptionsPage roomOptionsPage1 = new gui.RoomOptionsPage(appFrame0);
        roomOptionsPage1.setLocation(50, 0);
        java.awt.Graphics graphics5 = null;
        roomOptionsPage1.paint(graphics5);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.show(false);
        java.awt.Color color6 = bookingInformationPage1.getForeground();
        bookingInformationPage1.setEnabled(false);
        bookingInformationPage1.move(1, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color6);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        bookingInformationPage1.repaint((int) (byte) 1, (int) (byte) 10, (int) '4', (int) (byte) 0);
        gui.AppFrame appFrame7 = null;
        gui.BookingInformationPage bookingInformationPage8 = new gui.BookingInformationPage(appFrame7);
        java.awt.Color color9 = null;
        bookingInformationPage8.setBackground(color9);
        bookingInformationPage8.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension13 = null;
        bookingInformationPage8.setPreferredSize(dimension13);
        java.awt.Event event15 = null;
        boolean boolean18 = bookingInformationPage8.mouseExit(event15, 10, (int) (byte) 10);
        java.lang.Object obj19 = bookingInformationPage1.getClientProperty((java.lang.Object) 10);
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        bookingInformationPage1.addPropertyChangeListener(propertyChangeListener20);
        bookingInformationPage1.disable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        dataManagement.MaintainAdministrator maintainAdministrator0 = new dataManagement.MaintainAdministrator();
        administratorManagement.Administrator administrator3 = maintainAdministrator0.authenticate("", "MANAGE ROOMS");
        java.util.ArrayList<administratorManagement.Administrator> administratorList4 = maintainAdministrator0.admins;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(administrator3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(administratorList4);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        boolean boolean1 = userManagement.UserFactory.isStrongPassword("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension6 = null;
        bookingInformationPage1.setPreferredSize(dimension6);
        java.awt.Graphics graphics8 = null;
        bookingInformationPage1.paintComponents(graphics8);
        java.awt.Event event10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = bookingInformationPage1.postEvent(event10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"id\" because \"evt\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        boolean boolean1 = gui.BookingInformationPage.isValidDate("EXTEND BOOKING");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        dataManagement.MaintainUser maintainUser0 = new dataManagement.MaintainUser();
        userManagement.User user3 = maintainUser0.authenticate("", "PAYMENT");
        boolean boolean5 = maintainUser0.usernameExists("gui.BookingInformationPage[,0,0,0x0,invalid,layout=java.awt.GridBagLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.io.PrintWriter printWriter2 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingInformationPage1.list(printWriter2, 50);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.print(String)\" because \"out\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        bookingManagment.BookingManager bookingManager0 = bookingManagment.BookingManager.getInstance();
        java.util.Date date4 = null;
        bookingManagment.Booking booking10 = new bookingManagment.Booking("hi!", "ROOM OPTIONS", "ROOM OPTIONS", date4, "ROOM OPTIONS", "gui.BookingInformationPage[,0,0,0x0,invalid,layout=java.awt.GridBagLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", (double) (-1), (double) (short) -1, (double) (-1));
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = bookingManager0.isRoomAvailableForExtension(booking10, "PAYMENT");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingManager0);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        int int0 = javax.swing.JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        int int0 = javax.swing.JComponent.WHEN_FOCUSED;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = bookingManagment.Booking.combineDateAndTime(date0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension6 = null;
        bookingInformationPage1.setPreferredSize(dimension6);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray8 = bookingInformationPage1.getPropertyChangeListeners();
        bookingInformationPage1.show(false);
        java.awt.Event event11 = null;
        boolean boolean13 = bookingInformationPage1.gotFocus(event11, (java.lang.Object) (byte) 10);
        boolean boolean14 = bookingInformationPage1.isDoubleBuffered();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = bookingInformationPage1.areFocusTraversalKeysSet((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid focus traversal key identifier");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(propertyChangeListenerArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        gui.PaymentPage.setTypeOfPayment("WELCOME");
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension6 = null;
        bookingInformationPage1.setPreferredSize(dimension6);
        bookingInformationPage1.firePropertyChange("hi!", false, true);
        java.awt.event.MouseEvent mouseEvent12 = null;
        java.lang.String str13 = bookingInformationPage1.getToolTipText(mouseEvent12);
        gui.AppFrame appFrame14 = null;
        gui.BookingInformationPage bookingInformationPage15 = new gui.BookingInformationPage(appFrame14);
        java.awt.Color color16 = null;
        bookingInformationPage15.setBackground(color16);
        bookingInformationPage15.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension20 = null;
        bookingInformationPage15.setPreferredSize(dimension20);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray22 = bookingInformationPage15.getPropertyChangeListeners();
        boolean boolean23 = bookingInformationPage15.isOpaque();
        java.beans.VetoableChangeListener vetoableChangeListener24 = null;
        bookingInformationPage15.removeVetoableChangeListener(vetoableChangeListener24);
        java.awt.Event event26 = null;
        gui.AppFrame appFrame27 = null;
        gui.BookingInformationPage bookingInformationPage28 = new gui.BookingInformationPage(appFrame27);
        java.util.Locale locale29 = null;
        bookingInformationPage28.setLocale(locale29);
        boolean boolean31 = bookingInformationPage15.gotFocus(event26, (java.lang.Object) bookingInformationPage28);
        // The following exception was thrown during execution in test generation
        try {
            bookingInformationPage1.setComponentZOrder((java.awt.Component) bookingInformationPage28, 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: illegal component position");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(propertyChangeListenerArray22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        int int0 = java.awt.Frame.W_RESIZE_CURSOR;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        gui.AppFrame appFrame0 = null;
        gui.ManageRoomsPage manageRoomsPage1 = new gui.ManageRoomsPage(appFrame0);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.show(false);
        java.awt.LayoutManager layoutManager6 = bookingInformationPage1.getLayout();
        bookingInformationPage1.transferFocus();
        boolean boolean8 = bookingInformationPage1.isOpaque();
        java.awt.Graphics graphics9 = null;
        bookingInformationPage1.paint(graphics9);
        java.io.PrintWriter printWriter11 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingInformationPage1.list(printWriter11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(Object)\" because \"out\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        javax.swing.JPanel jPanel0 = gui.PaymentPage.getPanel();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jPanel0);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension6 = null;
        bookingInformationPage1.setPreferredSize(dimension6);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray8 = bookingInformationPage1.getPropertyChangeListeners();
        java.awt.Graphics graphics9 = null;
        bookingInformationPage1.printAll(graphics9);
        bookingInformationPage1.setFocusTraversalPolicyProvider(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(propertyChangeListenerArray8);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        bookingInformationPage1.repaint((int) (byte) 1, (int) (byte) 10, (int) '4', (int) (byte) 0);
        gui.AppFrame appFrame7 = null;
        gui.BookingInformationPage bookingInformationPage8 = new gui.BookingInformationPage(appFrame7);
        java.awt.Color color9 = null;
        bookingInformationPage8.setBackground(color9);
        bookingInformationPage8.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension13 = null;
        bookingInformationPage8.setPreferredSize(dimension13);
        java.awt.Event event15 = null;
        boolean boolean18 = bookingInformationPage8.mouseExit(event15, 10, (int) (byte) 10);
        java.lang.Object obj19 = bookingInformationPage1.getClientProperty((java.lang.Object) 10);
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        bookingInformationPage1.addPropertyChangeListener(propertyChangeListener20);
        bookingInformationPage1.setFocusCycleRoot(true);
        bookingInformationPage1.repaint((int) 'a', 100, 64, (int) '4');
        boolean boolean29 = bookingInformationPage1.isVisible();
        int int30 = bookingInformationPage1.getY();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension6 = null;
        bookingInformationPage1.setPreferredSize(dimension6);
        bookingInformationPage1.paintImmediately((int) (byte) 10, 10, 7, 64);
        bookingInformationPage1.resize(1, (int) (byte) 100);
        java.awt.Graphics graphics16 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingInformationPage1.printAll(graphics16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Graphics.setColor(java.awt.Color)\" because \"componentGraphics\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        int int0 = javax.swing.JComponent.UNDEFINED_CONDITION;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + (-1) + "'", int0 == (-1));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        java.lang.String str0 = gui.AppFrame.CARD_ADMINISTRATOR_OPTIONS;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ADMINISTRATOR OPTIONS" + "'", str0.equals("ADMINISTRATOR OPTIONS"));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        bookingManagment.BookingManager bookingManager0 = bookingManagment.BookingManager.getInstance();
        bookingManagment.Booking booking2 = bookingManager0.getBooking("hi!");
        java.util.Date date6 = null;
        bookingManagment.Booking booking12 = new bookingManagment.Booking("hi!", "ROOM OPTIONS", "ROOM OPTIONS", date6, "ROOM OPTIONS", "gui.BookingInformationPage[,0,0,0x0,invalid,layout=java.awt.GridBagLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", (double) (-1), (double) (short) -1, (double) (-1));
        java.lang.String str13 = booking12.getUserID();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = bookingManager0.isRoomAvailableForExtension(booking12, "PAYMENT");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        java.lang.String str0 = gui.AppFrame.CARD_SCAN_BADGE;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "SCAN BADGE" + "'", str0.equals("SCAN BADGE"));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        java.util.Date date3 = null;
        bookingManagment.Booking booking9 = new bookingManagment.Booking("hi!", "ROOM OPTIONS", "ROOM OPTIONS", date3, "ROOM OPTIONS", "gui.BookingInformationPage[,0,0,0x0,invalid,layout=java.awt.GridBagLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", (double) (-1), (double) (short) -1, (double) (-1));
        java.lang.String str10 = booking9.getUserID();
        java.util.Date date11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = booking9.hasExpired(date11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        java.lang.String str0 = javax.swing.JComponent.TOOL_TIP_TEXT_KEY;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ToolTipText" + "'", str0.equals("ToolTipText"));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        java.awt.Window[] windowArray0 = java.awt.Window.getOwnerlessWindows();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(windowArray0);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        java.lang.String str0 = gui.AppFrame.CARD_CREATE_NEW_ROOM;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "CREATE ROOM" + "'", str0.equals("CREATE ROOM"));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        int int0 = java.awt.Frame.NW_RESIZE_CURSOR;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        int int0 = java.awt.Frame.MAXIMIZED_BOTH;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        javax.swing.JPopupMenu jPopupMenu2 = bookingInformationPage1.getComponentPopupMenu();
        javax.accessibility.AccessibleContext accessibleContext3 = bookingInformationPage1.getAccessibleContext();
        java.awt.event.HierarchyListener hierarchyListener4 = null;
        bookingInformationPage1.removeHierarchyListener(hierarchyListener4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(jPopupMenu2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(accessibleContext3);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension6 = null;
        bookingInformationPage1.setPreferredSize(dimension6);
        bookingInformationPage1.paintImmediately((int) (byte) 10, 10, 7, 64);
        bookingInformationPage1.resize(1, (int) (byte) 100);
        javax.swing.KeyStroke keyStroke16 = null;
        java.awt.event.ActionListener actionListener17 = bookingInformationPage1.getActionForKeyStroke(keyStroke16);
        bookingInformationPage1.hide();
        boolean boolean19 = bookingInformationPage1.isManagingFocus();
        java.awt.event.MouseEvent mouseEvent20 = null;
        java.awt.Point point21 = bookingInformationPage1.getToolTipLocation(mouseEvent20);
        java.awt.event.MouseWheelListener mouseWheelListener22 = null;
        bookingInformationPage1.removeMouseWheelListener(mouseWheelListener22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(actionListener17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(point21);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        boolean boolean1 = userManagement.UserFactory.isStrongPassword("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        boolean boolean1 = gui.BookingInformationPage.isValidDate("LOGIN");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.show(false);
        java.awt.Color color6 = bookingInformationPage1.getForeground();
        java.awt.FocusTraversalPolicy focusTraversalPolicy7 = null;
        bookingInformationPage1.setFocusTraversalPolicy(focusTraversalPolicy7);
        boolean boolean9 = bookingInformationPage1.isFocusTraversalPolicyProvider();
        bookingInformationPage1.setBounds(0, (-1), 10, 8);
        bookingInformationPage1.enable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.show(false);
        java.awt.Color color6 = bookingInformationPage1.getForeground();
        java.awt.FocusTraversalPolicy focusTraversalPolicy7 = null;
        bookingInformationPage1.setFocusTraversalPolicy(focusTraversalPolicy7);
        int int9 = bookingInformationPage1.getX();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        int int0 = javax.swing.JComponent.WHEN_IN_FOCUSED_WINDOW;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        java.util.Date date3 = null;
        bookingManagment.Booking booking9 = new bookingManagment.Booking("hi!", "ROOM OPTIONS", "ROOM OPTIONS", date3, "ROOM OPTIONS", "gui.BookingInformationPage[,0,0,0x0,invalid,layout=java.awt.GridBagLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", (double) (-1), (double) (short) -1, (double) (-1));
        java.util.Date date10 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = booking9.isDepositForfeited(date10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        java.awt.Event event4 = null;
        boolean boolean7 = bookingInformationPage1.mouseEnter(event4, 10, 0);
        java.awt.event.FocusListener[] focusListenerArray8 = bookingInformationPage1.getFocusListeners();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(focusListenerArray8);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension6 = null;
        bookingInformationPage1.setPreferredSize(dimension6);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray8 = bookingInformationPage1.getPropertyChangeListeners();
        boolean boolean9 = bookingInformationPage1.isOpaque();
        java.beans.VetoableChangeListener vetoableChangeListener10 = null;
        bookingInformationPage1.removeVetoableChangeListener(vetoableChangeListener10);
        boolean boolean12 = bookingInformationPage1.isFocusCycleRoot();
        java.awt.LayoutManager layoutManager13 = null;
        bookingInformationPage1.setLayout(layoutManager13);
        java.awt.Component component15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component16 = bookingInformationPage1.add(component15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"parent\" because \"comp\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(propertyChangeListenerArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension6 = null;
        bookingInformationPage1.setPreferredSize(dimension6);
        java.awt.Event event8 = null;
        boolean boolean11 = bookingInformationPage1.mouseExit(event8, 10, (int) (byte) 10);
        java.awt.event.KeyListener[] keyListenerArray12 = bookingInformationPage1.getKeyListeners();
        java.awt.Image image13 = null;
        gui.AppFrame appFrame14 = null;
        gui.BookingInformationPage bookingInformationPage15 = new gui.BookingInformationPage(appFrame14);
        int int16 = bookingInformationPage1.checkImage(image13, (java.awt.image.ImageObserver) bookingInformationPage15);
        bookingInformationPage1.setFocusable(false);
        java.awt.Event event19 = null;
        boolean boolean22 = bookingInformationPage1.mouseUp(event19, (int) ' ', 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyListenerArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension6 = null;
        bookingInformationPage1.setPreferredSize(dimension6);
        java.awt.Event event8 = null;
        boolean boolean11 = bookingInformationPage1.mouseExit(event8, 10, (int) (byte) 10);
        java.awt.event.KeyListener[] keyListenerArray12 = bookingInformationPage1.getKeyListeners();
        java.awt.Image image13 = null;
        gui.AppFrame appFrame14 = null;
        gui.BookingInformationPage bookingInformationPage15 = new gui.BookingInformationPage(appFrame14);
        int int16 = bookingInformationPage1.checkImage(image13, (java.awt.image.ImageObserver) bookingInformationPage15);
        bookingInformationPage1.setFocusable(false);
        java.awt.im.InputContext inputContext19 = bookingInformationPage1.getInputContext();
        java.io.PrintStream printStream20 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingInformationPage1.list(printStream20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintStream.println(Object)\" because \"out\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyListenerArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputContext19);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        dataManagement.MaintainAdministrator maintainAdministrator0 = new dataManagement.MaintainAdministrator();
        administratorManagement.Administrator administrator3 = maintainAdministrator0.authenticate("", "MANAGE ROOMS");
        maintainAdministrator0.load("");
        maintainAdministrator0.load("EXTEND BOOKING");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(administrator3);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        javax.swing.JPopupMenu jPopupMenu2 = bookingInformationPage1.getComponentPopupMenu();
        javax.accessibility.AccessibleContext accessibleContext3 = bookingInformationPage1.getAccessibleContext();
        int int4 = bookingInformationPage1.getY();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(jPopupMenu2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(accessibleContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        int int0 = java.awt.Frame.S_RESIZE_CURSOR;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 9 + "'", int0 == 9);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension6 = null;
        bookingInformationPage1.setPreferredSize(dimension6);
        bookingInformationPage1.paintImmediately((int) (byte) 10, 10, 7, 64);
        bookingInformationPage1.transferFocusUpCycle();
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension6 = null;
        bookingInformationPage1.setPreferredSize(dimension6);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray8 = bookingInformationPage1.getPropertyChangeListeners();
        bookingInformationPage1.enableInputMethods(false);
        int int11 = bookingInformationPage1.getY();
        bookingInformationPage1.setOpaque(true);
        gui.AppFrame appFrame14 = null;
        gui.RoomOptionsPage roomOptionsPage15 = new gui.RoomOptionsPage(appFrame14);
        roomOptionsPage15.setLocation(50, 0);
        java.awt.Component component21 = roomOptionsPage15.findComponentAt((int) (byte) 10, 0);
        gui.AppFrame appFrame22 = null;
        gui.BookingInformationPage bookingInformationPage23 = new gui.BookingInformationPage(appFrame22);
        java.awt.Color color24 = null;
        bookingInformationPage23.setBackground(color24);
        bookingInformationPage23.show(false);
        java.awt.LayoutManager layoutManager28 = bookingInformationPage23.getLayout();
        roomOptionsPage15.setLayout(layoutManager28);
        bookingInformationPage1.setLayout(layoutManager28);
        java.io.PrintWriter printWriter31 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingInformationPage1.list(printWriter31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(Object)\" because \"out\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(propertyChangeListenerArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager28);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        userManagement.Staff staff5 = new userManagement.Staff("MANAGE ROOMS", "DASHBOARD", "MANAGE ROOMS", (int) (byte) 100, "PAYMENT");
        int int6 = staff5.getHourlyRate();
        staff5.setOrgIdOrStudentNumber("LOGIN");
        staff5.setId((int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 40 + "'", int6 == 40);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        gui.AppFrame appFrame0 = null;
        gui.RoomOptionsPage roomOptionsPage1 = new gui.RoomOptionsPage(appFrame0);
        roomOptionsPage1.setLocation(50, 0);
        java.awt.Component component7 = roomOptionsPage1.findComponentAt((int) (byte) 10, 0);
        java.awt.Font font8 = null;
        roomOptionsPage1.setFont(font8);
        java.awt.Component component12 = roomOptionsPage1.locate(0, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component12);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        int int0 = javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.setSize((int) (byte) 100, (-1));
        java.awt.FocusTraversalPolicy focusTraversalPolicy7 = null;
        bookingInformationPage1.setFocusTraversalPolicy(focusTraversalPolicy7);
        javax.swing.TransferHandler transferHandler9 = null;
        bookingInformationPage1.setTransferHandler(transferHandler9);
        javax.swing.KeyStroke keyStroke11 = null;
        bookingInformationPage1.unregisterKeyboardAction(keyStroke11);
        javax.swing.KeyStroke keyStroke13 = null;
        bookingInformationPage1.unregisterKeyboardAction(keyStroke13);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        java.util.Date date3 = null;
        bookingManagment.Booking booking9 = new bookingManagment.Booking("hi!", "ROOM OPTIONS", "ROOM OPTIONS", date3, "ROOM OPTIONS", "gui.BookingInformationPage[,0,0,0x0,invalid,layout=java.awt.GridBagLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", (double) (-1), (double) (short) -1, (double) (-1));
        java.lang.String str10 = booking9.getUserID();
        java.lang.String str11 = booking9.getUserID();
        java.util.Date date12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = booking9.isActiveAt(date12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        gui.AppFrame appFrame0 = null;
        gui.RoomOptionsPage roomOptionsPage1 = new gui.RoomOptionsPage(appFrame0);
        gui.AppFrame appFrame2 = null;
        gui.BookingInformationPage bookingInformationPage3 = new gui.BookingInformationPage(appFrame2);
        java.awt.Color color4 = null;
        bookingInformationPage3.setBackground(color4);
        bookingInformationPage3.show(false);
        java.awt.LayoutManager layoutManager8 = bookingInformationPage3.getLayout();
        bookingInformationPage3.transferFocus();
        int int10 = roomOptionsPage1.getComponentZOrder((java.awt.Component) bookingInformationPage3);
        bookingInformationPage3.layout();
        java.beans.VetoableChangeListener vetoableChangeListener12 = null;
        bookingInformationPage3.removeVetoableChangeListener(vetoableChangeListener12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension6 = null;
        bookingInformationPage1.setPreferredSize(dimension6);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray8 = bookingInformationPage1.getPropertyChangeListeners();
        boolean boolean9 = bookingInformationPage1.isOpaque();
        java.beans.VetoableChangeListener vetoableChangeListener10 = null;
        bookingInformationPage1.removeVetoableChangeListener(vetoableChangeListener10);
        java.awt.Event event12 = null;
        gui.AppFrame appFrame13 = null;
        gui.BookingInformationPage bookingInformationPage14 = new gui.BookingInformationPage(appFrame13);
        java.util.Locale locale15 = null;
        bookingInformationPage14.setLocale(locale15);
        boolean boolean17 = bookingInformationPage1.gotFocus(event12, (java.lang.Object) bookingInformationPage14);
        float float18 = bookingInformationPage14.getAlignmentX();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(propertyChangeListenerArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.5f + "'", float18 == 0.5f);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        gui.AppFrame appFrame0 = null;
        gui.PaymentPage paymentPage1 = new gui.PaymentPage(appFrame0);
        boolean boolean2 = paymentPage1.isFocusable();
        java.awt.event.MouseEvent mouseEvent3 = null;
        java.awt.Point point4 = paymentPage1.getPopupLocation(mouseEvent3);
        paymentPage1.firePropertyChange("USER OPTIONS", 'a', 'a');
        gui.AppFrame appFrame9 = null;
        gui.BookingInformationPage bookingInformationPage10 = new gui.BookingInformationPage(appFrame9);
        java.util.Locale locale11 = null;
        bookingInformationPage10.setLocale(locale11);
        java.awt.Dimension dimension13 = bookingInformationPage10.minimumSize();
        paymentPage1.setMaximumSize(dimension13);
        javax.swing.KeyStroke keyStroke15 = null;
        int int16 = paymentPage1.getConditionForKeyStroke(keyStroke15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(point4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dimension13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.setVerifyInputWhenFocusTarget(true);
        java.awt.GraphicsConfiguration graphicsConfiguration6 = bookingInformationPage1.getGraphicsConfiguration();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener7 = null;
        bookingInformationPage1.addHierarchyBoundsListener(hierarchyBoundsListener7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphicsConfiguration6);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        userManagement.Faculty faculty0 = new userManagement.Faculty();
        int int1 = faculty0.getHourlyRate();
        java.lang.String str2 = faculty0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 30 + "'", int1 == 30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Faculty [username=null, email=null, id=0]" + "'", str2.equals("Faculty [username=null, email=null, id=0]"));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        java.lang.String str0 = gui.AppFrame.ADMINISTRATORS_CSV_PATH;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "data/administrators.csv" + "'", str0.equals("data/administrators.csv"));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        gui.AppFrame appFrame0 = null;
        gui.RoomOptionsPage roomOptionsPage1 = new gui.RoomOptionsPage(appFrame0);
        gui.AppFrame appFrame2 = null;
        gui.BookingInformationPage bookingInformationPage3 = new gui.BookingInformationPage(appFrame2);
        java.awt.Color color4 = null;
        bookingInformationPage3.setBackground(color4);
        bookingInformationPage3.show(false);
        java.awt.LayoutManager layoutManager8 = bookingInformationPage3.getLayout();
        bookingInformationPage3.transferFocus();
        int int10 = roomOptionsPage1.getComponentZOrder((java.awt.Component) bookingInformationPage3);
        java.awt.event.ComponentListener componentListener11 = null;
        bookingInformationPage3.removeComponentListener(componentListener11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.show(false);
        java.awt.Color color6 = bookingInformationPage1.getForeground();
        java.awt.FocusTraversalPolicy focusTraversalPolicy7 = null;
        bookingInformationPage1.setFocusTraversalPolicy(focusTraversalPolicy7);
        boolean boolean9 = bookingInformationPage1.isFocusTraversalPolicyProvider();
        boolean boolean10 = bookingInformationPage1.isFocusCycleRoot();
        javax.swing.KeyStroke keyStroke11 = null;
        java.awt.event.ActionListener actionListener12 = bookingInformationPage1.getActionForKeyStroke(keyStroke11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(actionListener12);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.show(false);
        java.awt.Color color6 = bookingInformationPage1.getForeground();
        bookingInformationPage1.setEnabled(false);
        java.awt.Dimension dimension9 = bookingInformationPage1.preferredSize();
        bookingInformationPage1.layout();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = bookingInformationPage1.areFocusTraversalKeysSet((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid focus traversal key identifier");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dimension9);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.setVerifyInputWhenFocusTarget(true);
        java.awt.Insets insets6 = bookingInformationPage1.getInsets();
        java.awt.event.MouseWheelListener mouseWheelListener7 = null;
        bookingInformationPage1.removeMouseWheelListener(mouseWheelListener7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(insets6);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        userManagement.Partner partner5 = new userManagement.Partner("LOGIN", "MANAGE ROOMS", "WELCOME", (int) (short) -1, "PAYMENT");
        partner5.setOrgIdOrStudentNumber("WELCOME");
        partner5.setOrgIdOrStudentNumber("WELCOME");
        java.lang.String str10 = partner5.getOrgIdOrStudentNumber();
        java.lang.String str11 = partner5.getOrgIdOrStudentNumber();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "WELCOME" + "'", str10.equals("WELCOME"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "WELCOME" + "'", str11.equals("WELCOME"));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.setSize((int) (byte) 100, (-1));
        java.awt.FocusTraversalPolicy focusTraversalPolicy7 = null;
        bookingInformationPage1.setFocusTraversalPolicy(focusTraversalPolicy7);
        boolean boolean9 = bookingInformationPage1.isDoubleBuffered();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.show(false);
        java.awt.Color color6 = bookingInformationPage1.getForeground();
        bookingInformationPage1.removeNotify();
        java.awt.Event event8 = null;
        boolean boolean10 = bookingInformationPage1.gotFocus(event8, (java.lang.Object) false);
        java.awt.Font font11 = null;
        bookingInformationPage1.setFont(font11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.show(false);
        java.awt.Color color6 = bookingInformationPage1.getForeground();
        java.awt.FocusTraversalPolicy focusTraversalPolicy7 = null;
        bookingInformationPage1.setFocusTraversalPolicy(focusTraversalPolicy7);
        int int9 = bookingInformationPage1.countComponents();
        java.awt.Insets insets10 = bookingInformationPage1.insets();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(insets10);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        int int0 = java.awt.Frame.N_RESIZE_CURSOR;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        gui.AppFrame appFrame0 = null;
        // The following exception was thrown during execution in test generation
        try {
            gui.ExtendBookingPage.refreshBookings(appFrame0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"gui.AppFrame.getCurrentUser()\" because \"app\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        java.util.Date date3 = null;
        bookingManagment.Booking booking9 = new bookingManagment.Booking("hi!", "ROOM OPTIONS", "ROOM OPTIONS", date3, "ROOM OPTIONS", "gui.BookingInformationPage[,0,0,0x0,invalid,layout=java.awt.GridBagLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", (double) (-1), (double) (short) -1, (double) (-1));
        java.lang.String str10 = booking9.getUserID();
        java.util.Date date11 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = booking9.hasStarted(date11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        administratorManagement.ChiefEventCoordinator chiefEventCoordinator0 = administratorManagement.ChiefEventCoordinator.getInstance();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(chiefEventCoordinator0);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension6 = null;
        bookingInformationPage1.setPreferredSize(dimension6);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray8 = bookingInformationPage1.getPropertyChangeListeners();
        boolean boolean9 = bookingInformationPage1.isOpaque();
        java.beans.VetoableChangeListener vetoableChangeListener10 = null;
        bookingInformationPage1.removeVetoableChangeListener(vetoableChangeListener10);
        int int12 = bookingInformationPage1.getHeight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(propertyChangeListenerArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension6 = null;
        bookingInformationPage1.setPreferredSize(dimension6);
        bookingInformationPage1.paintImmediately((int) (byte) 10, 10, 7, 64);
        java.awt.Event event13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = bookingInformationPage1.postEvent(event13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"id\" because \"evt\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        float float0 = java.awt.Component.TOP_ALIGNMENT;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + 0.0f + "'", float0 == 0.0f);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.setVerifyInputWhenFocusTarget(true);
        java.awt.event.FocusListener[] focusListenerArray6 = bookingInformationPage1.getFocusListeners();
        java.awt.Cursor cursor7 = null;
        bookingInformationPage1.setCursor(cursor7);
        bookingInformationPage1.validate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(focusListenerArray6);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension6 = null;
        bookingInformationPage1.setPreferredSize(dimension6);
        bookingInformationPage1.firePropertyChange("hi!", false, true);
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior12 = bookingInformationPage1.getBaselineResizeBehavior();
        java.awt.event.InputMethodListener inputMethodListener13 = null;
        bookingInformationPage1.removeInputMethodListener(inputMethodListener13);
        java.awt.event.KeyListener keyListener15 = null;
        bookingInformationPage1.removeKeyListener(keyListener15);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior12 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior12.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        gui.AppFrame appFrame0 = null;
        gui.UserOptionPage userOptionPage1 = new gui.UserOptionPage(appFrame0);
        boolean boolean2 = userOptionPage1.getInheritsPopupMenu();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        int int2 = bookingInformationPage1.getHeight();
        java.awt.event.KeyListener keyListener3 = null;
        bookingInformationPage1.addKeyListener(keyListener3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension6 = null;
        bookingInformationPage1.setPreferredSize(dimension6);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray8 = bookingInformationPage1.getPropertyChangeListeners();
        boolean boolean9 = bookingInformationPage1.isOpaque();
        java.beans.VetoableChangeListener vetoableChangeListener10 = null;
        bookingInformationPage1.removeVetoableChangeListener(vetoableChangeListener10);
        java.awt.event.InputMethodListener[] inputMethodListenerArray12 = bookingInformationPage1.getInputMethodListeners();
        java.awt.event.MouseEvent mouseEvent13 = null;
        java.lang.String str14 = bookingInformationPage1.getToolTipText(mouseEvent13);
        // The following exception was thrown during execution in test generation
        try {
            javax.swing.InputMap inputMap16 = bookingInformationPage1.getInputMap((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: condition must be one of JComponent.WHEN_IN_FOCUSED_WINDOW, JComponent.WHEN_FOCUSED or JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(propertyChangeListenerArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(inputMethodListenerArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.util.Locale locale2 = null;
        bookingInformationPage1.setLocale(locale2);
        boolean boolean4 = bookingInformationPage1.hasFocus();
        java.awt.Event event5 = null;
        boolean boolean8 = bookingInformationPage1.mouseDrag(event5, 2, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.show(false);
        java.awt.Color color6 = bookingInformationPage1.getForeground();
        java.awt.FocusTraversalPolicy focusTraversalPolicy7 = null;
        bookingInformationPage1.setFocusTraversalPolicy(focusTraversalPolicy7);
        java.awt.Event event9 = null;
        boolean boolean11 = bookingInformationPage1.keyUp(event9, (int) (short) 100);
        java.awt.Event event12 = null;
        boolean boolean14 = bookingInformationPage1.lostFocus(event12, (java.lang.Object) 12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.util.Locale locale2 = null;
        bookingInformationPage1.setLocale(locale2);
        boolean boolean4 = bookingInformationPage1.hasFocus();
        java.beans.VetoableChangeListener vetoableChangeListener5 = null;
        bookingInformationPage1.addVetoableChangeListener(vetoableChangeListener5);
        bookingInformationPage1.requestFocus();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        gui.AppFrame appFrame0 = gui.AppFrame.getInstance();
        gui.AppFrame appFrame1 = null;
        gui.BookingInformationPage bookingInformationPage2 = new gui.BookingInformationPage(appFrame1);
        java.awt.Color color3 = null;
        bookingInformationPage2.setBackground(color3);
        bookingInformationPage2.show(false);
        java.awt.LayoutManager layoutManager7 = bookingInformationPage2.getLayout();
        gui.AppFrame appFrame8 = null;
        gui.BookingInformationPage bookingInformationPage9 = new gui.BookingInformationPage(appFrame8);
        java.awt.Color color10 = null;
        bookingInformationPage9.setBackground(color10);
        bookingInformationPage9.show(false);
        java.awt.Color color14 = bookingInformationPage9.getForeground();
        bookingInformationPage2.setBackground(color14);
        appFrame0.setBackground(color14);
        appFrame0.toFront();
        java.awt.Graphics graphics18 = null;
        appFrame0.paint(graphics18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(appFrame0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color14);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        java.util.Date date3 = null;
        bookingManagment.Booking booking9 = new bookingManagment.Booking("hi!", "ROOM OPTIONS", "ROOM OPTIONS", date3, "ROOM OPTIONS", "gui.BookingInformationPage[,0,0,0x0,invalid,layout=java.awt.GridBagLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", (double) (-1), (double) (short) -1, (double) (-1));
        java.lang.String str10 = booking9.getUserID();
        java.lang.String str11 = booking9.getStartTime();
        double double12 = booking9.getTotalCost();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = booking9.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "ROOM OPTIONS" + "'", str11.equals("ROOM OPTIONS"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        java.util.Date date3 = null;
        bookingManagment.Booking booking9 = new bookingManagment.Booking("hi!", "ROOM OPTIONS", "ROOM OPTIONS", date3, "ROOM OPTIONS", "gui.BookingInformationPage[,0,0,0x0,invalid,layout=java.awt.GridBagLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", (double) (-1), (double) (short) -1, (double) (-1));
        java.lang.String str10 = booking9.getUserID();
        java.lang.String str11 = booking9.getStartTime();
        double double12 = booking9.getTotalCost();
        java.util.Date date13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = booking9.hasStarted(date13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "ROOM OPTIONS" + "'", str11.equals("ROOM OPTIONS"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.show(false);
        java.awt.Color color6 = bookingInformationPage1.getForeground();
        java.awt.FocusTraversalPolicy focusTraversalPolicy7 = null;
        bookingInformationPage1.setFocusTraversalPolicy(focusTraversalPolicy7);
        java.awt.Component component9 = bookingInformationPage1.getNextFocusableComponent();
        java.awt.Graphics graphics10 = null;
        bookingInformationPage1.print(graphics10);
        int int12 = bookingInformationPage1.getWidth();
        boolean boolean13 = bookingInformationPage1.getInheritsPopupMenu();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        java.util.Date date3 = null;
        bookingManagment.Booking booking9 = new bookingManagment.Booking("hi!", "ROOM OPTIONS", "ROOM OPTIONS", date3, "ROOM OPTIONS", "gui.BookingInformationPage[,0,0,0x0,invalid,layout=java.awt.GridBagLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", (double) (-1), (double) (short) -1, (double) (-1));
        double double10 = booking9.getTotalCost();
        java.lang.String str11 = booking9.getRoomID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "ROOM OPTIONS" + "'", str11.equals("ROOM OPTIONS"));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.show(false);
        java.awt.Color color6 = bookingInformationPage1.getForeground();
        bookingInformationPage1.setEnabled(false);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = bookingInformationPage1.areFocusTraversalKeysSet(9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid focus traversal key identifier");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color6);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        bookingInformationPage1.repaint((int) (byte) 1, (int) (byte) 10, (int) '4', (int) (byte) 0);
        gui.AppFrame appFrame7 = null;
        gui.BookingInformationPage bookingInformationPage8 = new gui.BookingInformationPage(appFrame7);
        java.awt.Color color9 = null;
        bookingInformationPage8.setBackground(color9);
        bookingInformationPage8.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension13 = null;
        bookingInformationPage8.setPreferredSize(dimension13);
        java.awt.Event event15 = null;
        boolean boolean18 = bookingInformationPage8.mouseExit(event15, 10, (int) (byte) 10);
        java.lang.Object obj19 = bookingInformationPage1.getClientProperty((java.lang.Object) 10);
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        bookingInformationPage1.addPropertyChangeListener(propertyChangeListener20);
        int int24 = bookingInformationPage1.getBaseline((int) (short) 10, 4);
        java.awt.event.MouseListener[] mouseListenerArray25 = bookingInformationPage1.getMouseListeners();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mouseListenerArray25);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension6 = null;
        bookingInformationPage1.setPreferredSize(dimension6);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray8 = bookingInformationPage1.getPropertyChangeListeners();
        java.awt.Graphics graphics9 = null;
        bookingInformationPage1.printAll(graphics9);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = bookingInformationPage1.getBaseline((-1), 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Width and height must be >= 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(propertyChangeListenerArray8);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension6 = null;
        bookingInformationPage1.setPreferredSize(dimension6);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray8 = bookingInformationPage1.getPropertyChangeListeners();
        boolean boolean9 = bookingInformationPage1.isOpaque();
        java.beans.VetoableChangeListener vetoableChangeListener10 = null;
        bookingInformationPage1.removeVetoableChangeListener(vetoableChangeListener10);
        java.awt.Event event12 = null;
        gui.AppFrame appFrame13 = null;
        gui.BookingInformationPage bookingInformationPage14 = new gui.BookingInformationPage(appFrame13);
        java.util.Locale locale15 = null;
        bookingInformationPage14.setLocale(locale15);
        boolean boolean17 = bookingInformationPage1.gotFocus(event12, (java.lang.Object) bookingInformationPage14);
        javax.accessibility.AccessibleContext accessibleContext18 = bookingInformationPage1.getAccessibleContext();
        java.awt.event.KeyListener keyListener19 = null;
        bookingInformationPage1.addKeyListener(keyListener19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(propertyChangeListenerArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(accessibleContext18);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension6 = null;
        bookingInformationPage1.setPreferredSize(dimension6);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray8 = bookingInformationPage1.getPropertyChangeListeners();
        boolean boolean9 = bookingInformationPage1.isOpaque();
        java.beans.VetoableChangeListener vetoableChangeListener10 = null;
        bookingInformationPage1.removeVetoableChangeListener(vetoableChangeListener10);
        java.awt.event.InputMethodListener[] inputMethodListenerArray12 = bookingInformationPage1.getInputMethodListeners();
        java.awt.event.ActionListener actionListener13 = null;
        javax.swing.KeyStroke keyStroke15 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingInformationPage1.registerKeyboardAction(actionListener13, "DASHBOARD", keyStroke15, 30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: condition must be one of JComponent.WHEN_IN_FOCUSED_WINDOW, JComponent.WHEN_FOCUSED or JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(propertyChangeListenerArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(inputMethodListenerArray12);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        bookingManagment.Booking booking0 = gui.ExtendBookingPage.getSelectedBooking();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking0);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        dataManagement.MaintainAdministrator maintainAdministrator0 = new dataManagement.MaintainAdministrator();
        int int1 = maintainAdministrator0.nextId();
        boolean boolean3 = maintainAdministrator0.usernameExists("MANAGE ROOMS");
        maintainAdministrator0.save("ROOM OPTIONS");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension6 = null;
        bookingInformationPage1.setPreferredSize(dimension6);
        bookingInformationPage1.paintImmediately((int) (byte) 10, 10, 7, 64);
        java.awt.event.MouseMotionListener mouseMotionListener13 = null;
        bookingInformationPage1.addMouseMotionListener(mouseMotionListener13);
        javax.swing.InputMap inputMap16 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingInformationPage1.setInputMap((int) ' ', inputMap16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: condition must be one of JComponent.WHEN_IN_FOCUSED_WINDOW, JComponent.WHEN_FOCUSED or JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        gui.AppFrame appFrame0 = gui.AppFrame.getInstance();
        java.awt.event.WindowListener windowListener1 = null;
        appFrame0.addWindowListener(windowListener1);
        boolean boolean3 = appFrame0.isActive();
        java.awt.Window.Type type4 = null;
        // The following exception was thrown during execution in test generation
        try {
            appFrame0.setType(type4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: type should not be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(appFrame0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        userManagement.Staff staff5 = new userManagement.Staff("MANAGE ROOMS", "DASHBOARD", "MANAGE ROOMS", (int) (byte) 100, "PAYMENT");
        int int6 = staff5.getHourlyRate();
        staff5.setOrgIdOrStudentNumber("LOGIN");
        java.lang.String str9 = staff5.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 40 + "'", int6 == 40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "DASHBOARD" + "'", str9.equals("DASHBOARD"));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.show(false);
        java.awt.Color color6 = bookingInformationPage1.getForeground();
        java.awt.FocusTraversalPolicy focusTraversalPolicy7 = null;
        bookingInformationPage1.setFocusTraversalPolicy(focusTraversalPolicy7);
        boolean boolean9 = bookingInformationPage1.isFocusTraversalPolicyProvider();
        bookingInformationPage1.setBounds(0, (-1), 10, 8);
        java.awt.Graphics graphics15 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingInformationPage1.printAll(graphics15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Graphics.setColor(java.awt.Color)\" because \"componentGraphics\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.setSize((int) (byte) 100, (-1));
        java.awt.FocusTraversalPolicy focusTraversalPolicy7 = null;
        bookingInformationPage1.setFocusTraversalPolicy(focusTraversalPolicy7);
        java.awt.event.ContainerListener containerListener9 = null;
        bookingInformationPage1.addContainerListener(containerListener9);
        boolean boolean11 = bookingInformationPage1.isPaintingTile();
        java.awt.event.InputMethodListener inputMethodListener12 = null;
        bookingInformationPage1.removeInputMethodListener(inputMethodListener12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension6 = null;
        bookingInformationPage1.setPreferredSize(dimension6);
        bookingInformationPage1.firePropertyChange("hi!", false, true);
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior12 = bookingInformationPage1.getBaselineResizeBehavior();
        java.awt.GraphicsConfiguration graphicsConfiguration13 = bookingInformationPage1.getGraphicsConfiguration();
        boolean boolean14 = bookingInformationPage1.isMaximumSizeSet();
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior12 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior12.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphicsConfiguration13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.setSize((int) (byte) 100, (-1));
        java.awt.FocusTraversalPolicy focusTraversalPolicy7 = null;
        bookingInformationPage1.setFocusTraversalPolicy(focusTraversalPolicy7);
        java.awt.Graphics graphics9 = null;
        bookingInformationPage1.printAll(graphics9);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        javax.swing.JFrame.setDefaultLookAndFeelDecorated(false);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        gui.AppFrame appFrame0 = gui.AppFrame.getInstance();
        gui.AppFrame appFrame1 = null;
        gui.BookingInformationPage bookingInformationPage2 = new gui.BookingInformationPage(appFrame1);
        java.awt.Color color3 = null;
        bookingInformationPage2.setBackground(color3);
        bookingInformationPage2.show(false);
        java.awt.LayoutManager layoutManager7 = bookingInformationPage2.getLayout();
        gui.AppFrame appFrame8 = null;
        gui.BookingInformationPage bookingInformationPage9 = new gui.BookingInformationPage(appFrame8);
        java.awt.Color color10 = null;
        bookingInformationPage9.setBackground(color10);
        bookingInformationPage9.show(false);
        java.awt.Color color14 = bookingInformationPage9.getForeground();
        bookingInformationPage2.setBackground(color14);
        appFrame0.setBackground(color14);
        javax.swing.JRootPane jRootPane17 = appFrame0.getRootPane();
        gui.AppFrame appFrame18 = null;
        gui.BookingInformationPage bookingInformationPage19 = new gui.BookingInformationPage(appFrame18);
        java.awt.Color color20 = null;
        bookingInformationPage19.setBackground(color20);
        bookingInformationPage19.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension24 = null;
        bookingInformationPage19.setPreferredSize(dimension24);
        gui.AppFrame appFrame26 = null;
        gui.BookingInformationPage bookingInformationPage27 = new gui.BookingInformationPage(appFrame26);
        java.awt.Color color28 = null;
        bookingInformationPage27.setBackground(color28);
        bookingInformationPage27.show(false);
        java.awt.LayoutManager layoutManager32 = bookingInformationPage27.getLayout();
        bookingInformationPage19.putClientProperty((java.lang.Object) layoutManager32, (java.lang.Object) 0);
        appFrame0.setLayout(layoutManager32);
        java.awt.Point point37 = appFrame0.getMousePosition(false);
        appFrame0.setFocusCycleRoot(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(appFrame0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jRootPane17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(point37);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        payment.DebitCardPayment debitCardPayment5 = new payment.DebitCardPayment((double) (-1L), "ROOM OPTIONS", "LOGIN", "PAYMENT", 1);
        gui.PaymentPage.paymentMethod((payment.Payment) debitCardPayment5);
        // The following exception was thrown during execution in test generation
        try {
            double double7 = debitCardPayment5.calculateCost();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 12");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension6 = null;
        bookingInformationPage1.setPreferredSize(dimension6);
        gui.AppFrame appFrame8 = null;
        gui.BookingInformationPage bookingInformationPage9 = new gui.BookingInformationPage(appFrame8);
        java.awt.Color color10 = null;
        bookingInformationPage9.setBackground(color10);
        bookingInformationPage9.show(false);
        java.awt.LayoutManager layoutManager14 = bookingInformationPage9.getLayout();
        bookingInformationPage1.putClientProperty((java.lang.Object) layoutManager14, (java.lang.Object) 0);
        java.awt.event.MouseWheelListener[] mouseWheelListenerArray17 = bookingInformationPage1.getMouseWheelListeners();
        java.awt.Event event18 = null;
        boolean boolean20 = bookingInformationPage1.keyDown(event18, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mouseWheelListenerArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.show(false);
        java.awt.Color color6 = bookingInformationPage1.getForeground();
        java.awt.FocusTraversalPolicy focusTraversalPolicy7 = null;
        bookingInformationPage1.setFocusTraversalPolicy(focusTraversalPolicy7);
        java.awt.Component component9 = bookingInformationPage1.getNextFocusableComponent();
        bookingInformationPage1.setAlignmentY((float) 100);
        bookingInformationPage1.firePropertyChange("LOGIN", (byte) 0, (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component9);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        java.lang.String str0 = gui.ExtendBookingPage.endTimeInputField();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "" + "'", str0.equals(""));
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.show(false);
        java.awt.Color color6 = bookingInformationPage1.getForeground();
        bookingInformationPage1.setEnabled(false);
        java.awt.Dimension dimension9 = bookingInformationPage1.preferredSize();
        java.awt.Dimension dimension10 = bookingInformationPage1.getMinimumSize();
        java.awt.im.InputMethodRequests inputMethodRequests11 = bookingInformationPage1.getInputMethodRequests();
        java.awt.Image image12 = null;
        boolean boolean18 = bookingInformationPage1.imageUpdate(image12, 0, (int) (byte) 0, (int) (byte) 100, (int) (byte) 100, 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dimension9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dimension10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputMethodRequests11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension6 = null;
        bookingInformationPage1.setPreferredSize(dimension6);
        java.awt.Event event8 = null;
        boolean boolean11 = bookingInformationPage1.mouseExit(event8, 10, (int) (byte) 10);
        java.awt.event.KeyListener[] keyListenerArray12 = bookingInformationPage1.getKeyListeners();
        java.awt.Image image13 = null;
        gui.AppFrame appFrame14 = null;
        gui.BookingInformationPage bookingInformationPage15 = new gui.BookingInformationPage(appFrame14);
        int int16 = bookingInformationPage1.checkImage(image13, (java.awt.image.ImageObserver) bookingInformationPage15);
        java.awt.Insets insets17 = bookingInformationPage1.getInsets();
        java.io.PrintStream printStream18 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingInformationPage1.list(printStream18, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintStream.print(String)\" because \"out\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyListenerArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(insets17);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        gui.AppFrame appFrame0 = gui.AppFrame.getInstance();
        gui.AppFrame appFrame1 = null;
        gui.BookingInformationPage bookingInformationPage2 = new gui.BookingInformationPage(appFrame1);
        java.awt.Color color3 = null;
        bookingInformationPage2.setBackground(color3);
        bookingInformationPage2.show(false);
        java.awt.LayoutManager layoutManager7 = bookingInformationPage2.getLayout();
        gui.AppFrame appFrame8 = null;
        gui.BookingInformationPage bookingInformationPage9 = new gui.BookingInformationPage(appFrame8);
        java.awt.Color color10 = null;
        bookingInformationPage9.setBackground(color10);
        bookingInformationPage9.show(false);
        java.awt.Color color14 = bookingInformationPage9.getForeground();
        bookingInformationPage2.setBackground(color14);
        appFrame0.setBackground(color14);
        java.awt.Window.Type type17 = null;
        // The following exception was thrown during execution in test generation
        try {
            appFrame0.setType(type17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: type should not be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(appFrame0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color14);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension6 = null;
        bookingInformationPage1.setPreferredSize(dimension6);
        bookingInformationPage1.paintImmediately((int) (byte) 10, 10, 7, 64);
        bookingInformationPage1.resize(1, (int) (byte) 100);
        javax.swing.KeyStroke keyStroke16 = null;
        java.awt.event.ActionListener actionListener17 = bookingInformationPage1.getActionForKeyStroke(keyStroke16);
        bookingInformationPage1.hide();
        boolean boolean19 = bookingInformationPage1.isManagingFocus();
        javax.swing.border.Border border20 = null;
        bookingInformationPage1.setBorder(border20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(actionListener17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        bookingInformationPage1.repaint((int) (byte) 1, (int) (byte) 10, (int) '4', (int) (byte) 0);
        gui.AppFrame appFrame7 = null;
        gui.BookingInformationPage bookingInformationPage8 = new gui.BookingInformationPage(appFrame7);
        java.awt.Color color9 = null;
        bookingInformationPage8.setBackground(color9);
        bookingInformationPage8.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension13 = null;
        bookingInformationPage8.setPreferredSize(dimension13);
        java.awt.Event event15 = null;
        boolean boolean18 = bookingInformationPage8.mouseExit(event15, 10, (int) (byte) 10);
        java.lang.Object obj19 = bookingInformationPage1.getClientProperty((java.lang.Object) 10);
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        bookingInformationPage1.addPropertyChangeListener(propertyChangeListener20);
        bookingInformationPage1.setFocusCycleRoot(true);
        bookingInformationPage1.repaint((int) 'a', 100, 64, (int) '4');
        boolean boolean29 = bookingInformationPage1.isVisible();
        java.awt.Graphics graphics30 = null;
        bookingInformationPage1.printAll(graphics30);
        bookingInformationPage1.revalidate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension6 = null;
        bookingInformationPage1.setPreferredSize(dimension6);
        java.awt.Event event8 = null;
        boolean boolean11 = bookingInformationPage1.mouseExit(event8, 10, (int) (byte) 10);
        java.awt.image.ColorModel colorModel12 = bookingInformationPage1.getColorModel();
        float float13 = bookingInformationPage1.getAlignmentY();
        java.io.PrintStream printStream14 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingInformationPage1.list(printStream14, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintStream.print(String)\" because \"out\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(colorModel12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float13 + "' != '" + 0.5f + "'", float13 == 0.5f);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.show(false);
        java.awt.Color color6 = bookingInformationPage1.getForeground();
        gui.AppFrame appFrame7 = null;
        gui.BookingInformationPage bookingInformationPage8 = new gui.BookingInformationPage(appFrame7);
        java.awt.Color color9 = null;
        bookingInformationPage8.setBackground(color9);
        bookingInformationPage8.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension13 = null;
        bookingInformationPage8.setPreferredSize(dimension13);
        int int15 = bookingInformationPage1.getComponentZOrder((java.awt.Component) bookingInformationPage8);
        java.awt.Toolkit toolkit16 = bookingInformationPage8.getToolkit();
        boolean boolean17 = bookingInformationPage8.isDoubleBuffered();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toolkit16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        int int0 = java.awt.Frame.E_RESIZE_CURSOR;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 11 + "'", int0 == 11);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        javax.swing.plaf.PanelUI panelUI4 = null;
        bookingInformationPage1.setUI(panelUI4);
        gui.AppFrame appFrame6 = null;
        gui.BookingInformationPage bookingInformationPage7 = new gui.BookingInformationPage(appFrame6);
        java.awt.Color color8 = null;
        bookingInformationPage7.setBackground(color8);
        bookingInformationPage7.setSize((int) (byte) 100, (-1));
        bookingInformationPage7.requestFocus();
        gui.AppFrame appFrame14 = null;
        gui.BookingInformationPage bookingInformationPage15 = new gui.BookingInformationPage(appFrame14);
        java.awt.Color color16 = null;
        bookingInformationPage15.setBackground(color16);
        javax.swing.plaf.PanelUI panelUI18 = null;
        bookingInformationPage15.setUI(panelUI18);
        java.awt.Color color20 = bookingInformationPage15.getForeground();
        bookingInformationPage7.setForeground(color20);
        bookingInformationPage1.setForeground(color20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color20);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.show(false);
        java.awt.Color color6 = bookingInformationPage1.getForeground();
        gui.AppFrame appFrame7 = null;
        gui.BookingInformationPage bookingInformationPage8 = new gui.BookingInformationPage(appFrame7);
        java.awt.Color color9 = null;
        bookingInformationPage8.setBackground(color9);
        bookingInformationPage8.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension13 = null;
        bookingInformationPage8.setPreferredSize(dimension13);
        int int15 = bookingInformationPage1.getComponentZOrder((java.awt.Component) bookingInformationPage8);
        java.awt.event.MouseListener mouseListener16 = null;
        bookingInformationPage8.addMouseListener(mouseListener16);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener18 = null;
        bookingInformationPage8.addHierarchyBoundsListener(hierarchyBoundsListener18);
        gui.AppFrame appFrame21 = null;
        gui.RoomOptionsPage roomOptionsPage22 = new gui.RoomOptionsPage(appFrame21);
        gui.AppFrame appFrame23 = null;
        gui.BookingInformationPage bookingInformationPage24 = new gui.BookingInformationPage(appFrame23);
        java.awt.Color color25 = null;
        bookingInformationPage24.setBackground(color25);
        bookingInformationPage24.show(false);
        java.awt.LayoutManager layoutManager29 = bookingInformationPage24.getLayout();
        bookingInformationPage24.transferFocus();
        int int31 = roomOptionsPage22.getComponentZOrder((java.awt.Component) bookingInformationPage24);
        boolean boolean34 = roomOptionsPage22.contains(32, 10);
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component35 = bookingInformationPage8.add("data/administrators.csv", (java.awt.Component) roomOptionsPage22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: cannot add to layout: constraints must be a GridBagConstraint");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.setSize((int) (byte) 100, (-1));
        bookingInformationPage1.doLayout();
        java.awt.event.MouseMotionListener mouseMotionListener8 = null;
        bookingInformationPage1.removeMouseMotionListener(mouseMotionListener8);
        boolean boolean10 = bookingInformationPage1.isRequestFocusEnabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.setSize((int) (byte) 100, (-1));
        bookingInformationPage1.requestFocus();
        gui.AppFrame appFrame8 = null;
        gui.BookingInformationPage bookingInformationPage9 = new gui.BookingInformationPage(appFrame8);
        java.awt.Color color10 = null;
        bookingInformationPage9.setBackground(color10);
        javax.swing.plaf.PanelUI panelUI12 = null;
        bookingInformationPage9.setUI(panelUI12);
        java.awt.Color color14 = bookingInformationPage9.getForeground();
        bookingInformationPage1.setForeground(color14);
        javax.swing.JToolTip jToolTip16 = bookingInformationPage1.createToolTip();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jToolTip16);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.show(false);
        java.awt.Color color6 = bookingInformationPage1.getForeground();
        java.awt.FocusTraversalPolicy focusTraversalPolicy7 = null;
        bookingInformationPage1.setFocusTraversalPolicy(focusTraversalPolicy7);
        bookingInformationPage1.repaint((long) 64, 0, (int) (byte) 1, 16, 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color6);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension6 = null;
        bookingInformationPage1.setPreferredSize(dimension6);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray8 = bookingInformationPage1.getPropertyChangeListeners();
        bookingInformationPage1.show(false);
        java.awt.Event event11 = null;
        boolean boolean13 = bookingInformationPage1.gotFocus(event11, (java.lang.Object) (byte) 10);
        boolean boolean14 = bookingInformationPage1.isDoubleBuffered();
        java.awt.Event event15 = null;
        boolean boolean18 = bookingInformationPage1.mouseExit(event15, 50, (int) ' ');
        bookingInformationPage1.reshape((int) (short) 1, (int) (short) 1, 32, 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(propertyChangeListenerArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        bookingInformationPage1.repaint((int) (byte) 1, (int) (byte) 10, (int) '4', (int) (byte) 0);
        gui.AppFrame appFrame7 = null;
        gui.BookingInformationPage bookingInformationPage8 = new gui.BookingInformationPage(appFrame7);
        java.awt.Color color9 = null;
        bookingInformationPage8.setBackground(color9);
        bookingInformationPage8.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension13 = null;
        bookingInformationPage8.setPreferredSize(dimension13);
        java.awt.Event event15 = null;
        boolean boolean18 = bookingInformationPage8.mouseExit(event15, 10, (int) (byte) 10);
        java.lang.Object obj19 = bookingInformationPage1.getClientProperty((java.lang.Object) 10);
        java.awt.event.InputMethodListener inputMethodListener20 = null;
        bookingInformationPage1.addInputMethodListener(inputMethodListener20);
        int int22 = bookingInformationPage1.getY();
        int int23 = bookingInformationPage1.getX();
        java.util.Date date24 = null;
        boolean boolean25 = bookingInformationPage1.hasPassed(date24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        userManagement.Staff staff5 = new userManagement.Staff("MANAGE ROOMS", "DASHBOARD", "MANAGE ROOMS", (int) (byte) 100, "PAYMENT");
        int int6 = staff5.getHourlyRate();
        staff5.setUsername("Faculty [username=null, email=null, id=0]");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 40 + "'", int6 == 40);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        javax.swing.JPanel jPanel0 = gui.BookingInformationPage.getPanel();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jPanel0);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        payment.InstitutionsBilling institutionsBilling5 = new payment.InstitutionsBilling((double) (short) 1, "hi!", "PAYMENT", "PAYMENT", (int) '4');
        double double6 = institutionsBilling5.getFee();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = institutionsBilling5.getStatus();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 3.5d + "'", double6 == 3.5d);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        java.util.Date date3 = null;
        bookingManagment.Booking booking9 = new bookingManagment.Booking("hi!", "ROOM OPTIONS", "ROOM OPTIONS", date3, "ROOM OPTIONS", "gui.BookingInformationPage[,0,0,0x0,invalid,layout=java.awt.GridBagLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", (double) (-1), (double) (short) -1, (double) (-1));
        double double10 = booking9.getTotalCost();
        double double11 = booking9.getHourlyRate();
        double double12 = booking9.getDepositPaid();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        gui.AppFrame appFrame0 = null;
        gui.CancelBookingPage cancelBookingPage1 = new gui.CancelBookingPage(appFrame0);
        boolean boolean2 = cancelBookingPage1.isMinimumSizeSet();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        dataManagement.MaintainUser maintainUser0 = new dataManagement.MaintainUser();
        boolean boolean2 = maintainUser0.emailExists("Faculty");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        gui.AppFrame appFrame0 = gui.AppFrame.getInstance();
        gui.AppFrame appFrame1 = null;
        gui.BookingInformationPage bookingInformationPage2 = new gui.BookingInformationPage(appFrame1);
        java.awt.Color color3 = null;
        bookingInformationPage2.setBackground(color3);
        bookingInformationPage2.show(false);
        java.awt.LayoutManager layoutManager7 = bookingInformationPage2.getLayout();
        gui.AppFrame appFrame8 = null;
        gui.BookingInformationPage bookingInformationPage9 = new gui.BookingInformationPage(appFrame8);
        java.awt.Color color10 = null;
        bookingInformationPage9.setBackground(color10);
        bookingInformationPage9.show(false);
        java.awt.Color color14 = bookingInformationPage9.getForeground();
        bookingInformationPage2.setBackground(color14);
        appFrame0.setBackground(color14);
        appFrame0.toFront();
        javax.swing.TransferHandler transferHandler18 = appFrame0.getTransferHandler();
        java.lang.String str19 = appFrame0.getWarningString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(appFrame0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(transferHandler18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        gui.AppFrame appFrame0 = null;
        gui.PaymentPage paymentPage1 = new gui.PaymentPage(appFrame0);
        java.awt.Dimension dimension2 = paymentPage1.getPreferredSize();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dimension2);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        bookingInformationPage1.repaint((int) (byte) 1, (int) (byte) 10, (int) '4', (int) (byte) 0);
        gui.AppFrame appFrame7 = null;
        gui.BookingInformationPage bookingInformationPage8 = new gui.BookingInformationPage(appFrame7);
        java.awt.Color color9 = null;
        bookingInformationPage8.setBackground(color9);
        bookingInformationPage8.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension13 = null;
        bookingInformationPage8.setPreferredSize(dimension13);
        java.awt.Event event15 = null;
        boolean boolean18 = bookingInformationPage8.mouseExit(event15, 10, (int) (byte) 10);
        java.lang.Object obj19 = bookingInformationPage1.getClientProperty((java.lang.Object) 10);
        java.awt.event.InputMethodListener inputMethodListener20 = null;
        bookingInformationPage1.addInputMethodListener(inputMethodListener20);
        gui.AppFrame appFrame22 = null;
        gui.BookingInformationPage bookingInformationPage23 = new gui.BookingInformationPage(appFrame22);
        java.awt.Color color24 = null;
        bookingInformationPage23.setBackground(color24);
        bookingInformationPage23.setVerifyInputWhenFocusTarget(true);
        java.awt.event.FocusListener[] focusListenerArray28 = bookingInformationPage23.getFocusListeners();
        javax.swing.KeyStroke keyStroke29 = null;
        int int30 = bookingInformationPage23.getConditionForKeyStroke(keyStroke29);
        gui.AppFrame appFrame31 = null;
        gui.WelcomePage welcomePage32 = new gui.WelcomePage(appFrame31);
        gui.AppFrame appFrame33 = null;
        gui.BookingInformationPage bookingInformationPage34 = new gui.BookingInformationPage(appFrame33);
        java.awt.Color color35 = null;
        bookingInformationPage34.setBackground(color35);
        bookingInformationPage34.show(false);
        java.awt.LayoutManager layoutManager39 = bookingInformationPage34.getLayout();
        java.awt.Point point40 = null;
        java.awt.Point point41 = bookingInformationPage34.getLocation(point40);
        boolean boolean42 = welcomePage32.contains(point41);
        java.awt.Point point43 = bookingInformationPage23.getLocation(point41);
        boolean boolean44 = bookingInformationPage1.contains(point41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(focusListenerArray28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(point41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(point43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension6 = null;
        bookingInformationPage1.setPreferredSize(dimension6);
        java.awt.Event event8 = null;
        boolean boolean11 = bookingInformationPage1.mouseExit(event8, 10, (int) (byte) 10);
        java.awt.event.KeyListener[] keyListenerArray12 = bookingInformationPage1.getKeyListeners();
        java.awt.Image image13 = null;
        gui.AppFrame appFrame14 = null;
        gui.BookingInformationPage bookingInformationPage15 = new gui.BookingInformationPage(appFrame14);
        int int16 = bookingInformationPage1.checkImage(image13, (java.awt.image.ImageObserver) bookingInformationPage15);
        int int17 = bookingInformationPage1.getX();
        boolean boolean18 = bookingInformationPage1.isManagingFocus();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyListenerArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        java.util.Date date3 = null;
        bookingManagment.Booking booking9 = new bookingManagment.Booking("hi!", "ROOM OPTIONS", "ROOM OPTIONS", date3, "ROOM OPTIONS", "gui.BookingInformationPage[,0,0,0x0,invalid,layout=java.awt.GridBagLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", (double) (-1), (double) (short) -1, (double) (-1));
        double double10 = booking9.getTotalCost();
        double double11 = booking9.getHourlyRate();
        java.util.Date date12 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = booking9.hasStarted(date12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        gui.AppFrame appFrame0 = gui.AppFrame.getInstance();
        java.awt.event.WindowListener windowListener1 = null;
        appFrame0.addWindowListener(windowListener1);
        java.lang.String str3 = appFrame0.getTitle();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(appFrame0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "York's Booking Manager" + "'", str3.equals("York's Booking Manager"));
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        gui.AppFrame appFrame0 = gui.AppFrame.getInstance();
        gui.AppFrame appFrame1 = null;
        gui.BookingInformationPage bookingInformationPage2 = new gui.BookingInformationPage(appFrame1);
        java.awt.Color color3 = null;
        bookingInformationPage2.setBackground(color3);
        bookingInformationPage2.show(false);
        java.awt.LayoutManager layoutManager7 = bookingInformationPage2.getLayout();
        gui.AppFrame appFrame8 = null;
        gui.BookingInformationPage bookingInformationPage9 = new gui.BookingInformationPage(appFrame8);
        java.awt.Color color10 = null;
        bookingInformationPage9.setBackground(color10);
        bookingInformationPage9.show(false);
        java.awt.Color color14 = bookingInformationPage9.getForeground();
        bookingInformationPage2.setBackground(color14);
        appFrame0.setBackground(color14);
        boolean boolean17 = appFrame0.isFocused();
        java.awt.MenuBar menuBar18 = null;
        appFrame0.setMenuBar(menuBar18);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.awt.AWTKeyStroke> aWTKeyStrokeSet21 = appFrame0.getFocusTraversalKeys(30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid focus traversal key identifier");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(appFrame0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        java.util.Date date3 = null;
        bookingManagment.Booking booking9 = new bookingManagment.Booking("hi!", "ROOM OPTIONS", "ROOM OPTIONS", date3, "ROOM OPTIONS", "gui.BookingInformationPage[,0,0,0x0,invalid,layout=java.awt.GridBagLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", (double) (-1), (double) (short) -1, (double) (-1));
        java.lang.String str10 = booking9.getUserID();
        java.lang.String str11 = booking9.getUserID();
        java.lang.String str12 = booking9.getEndTime();
        java.lang.String str13 = booking9.getStartTime();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "gui.BookingInformationPage[,0,0,0x0,invalid,layout=java.awt.GridBagLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]" + "'", str12.equals("gui.BookingInformationPage[,0,0,0x0,invalid,layout=java.awt.GridBagLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "ROOM OPTIONS" + "'", str13.equals("ROOM OPTIONS"));
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        boolean boolean1 = userManagement.UserFactory.isStrongPassword("LOGIN");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        javax.swing.plaf.PanelUI panelUI4 = null;
        bookingInformationPage1.setUI(panelUI4);
        java.awt.Color color6 = bookingInformationPage1.getForeground();
        gui.AppFrame appFrame7 = gui.AppFrame.getInstance();
        gui.AppFrame appFrame8 = null;
        gui.BookingInformationPage bookingInformationPage9 = new gui.BookingInformationPage(appFrame8);
        java.awt.Color color10 = null;
        bookingInformationPage9.setBackground(color10);
        bookingInformationPage9.show(false);
        java.awt.LayoutManager layoutManager14 = bookingInformationPage9.getLayout();
        gui.AppFrame appFrame15 = null;
        gui.BookingInformationPage bookingInformationPage16 = new gui.BookingInformationPage(appFrame15);
        java.awt.Color color17 = null;
        bookingInformationPage16.setBackground(color17);
        bookingInformationPage16.show(false);
        java.awt.Color color21 = bookingInformationPage16.getForeground();
        bookingInformationPage9.setBackground(color21);
        appFrame7.setBackground(color21);
        javax.swing.JRootPane jRootPane24 = appFrame7.getRootPane();
        float float25 = jRootPane24.getAlignmentX();
        // The following exception was thrown during execution in test generation
        try {
            bookingInformationPage1.setComponentZOrder((java.awt.Component) jRootPane24, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: illegal component position");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(appFrame7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jRootPane24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float25 + "' != '" + 0.0f + "'", float25 == 0.0f);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        gui.AppFrame appFrame0 = gui.AppFrame.getInstance();
        gui.AppFrame appFrame1 = null;
        gui.BookingInformationPage bookingInformationPage2 = new gui.BookingInformationPage(appFrame1);
        java.awt.Color color3 = null;
        bookingInformationPage2.setBackground(color3);
        bookingInformationPage2.show(false);
        java.awt.LayoutManager layoutManager7 = bookingInformationPage2.getLayout();
        gui.AppFrame appFrame8 = null;
        gui.BookingInformationPage bookingInformationPage9 = new gui.BookingInformationPage(appFrame8);
        java.awt.Color color10 = null;
        bookingInformationPage9.setBackground(color10);
        bookingInformationPage9.show(false);
        java.awt.Color color14 = bookingInformationPage9.getForeground();
        bookingInformationPage2.setBackground(color14);
        appFrame0.setBackground(color14);
        boolean boolean17 = appFrame0.isFocused();
        java.awt.MenuBar menuBar18 = null;
        appFrame0.setMenuBar(menuBar18);
        appFrame0.setLocation(50, (int) (byte) 100);
        java.awt.Toolkit toolkit23 = appFrame0.getToolkit();
        java.io.PrintWriter printWriter24 = null;
        // The following exception was thrown during execution in test generation
        try {
            appFrame0.list(printWriter24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(Object)\" because \"out\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(appFrame0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toolkit23);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        gui.AppFrame appFrame0 = gui.AppFrame.getInstance();
        gui.AppFrame appFrame1 = null;
        gui.BookingInformationPage bookingInformationPage2 = new gui.BookingInformationPage(appFrame1);
        java.awt.Color color3 = null;
        bookingInformationPage2.setBackground(color3);
        bookingInformationPage2.show(false);
        java.awt.LayoutManager layoutManager7 = bookingInformationPage2.getLayout();
        gui.AppFrame appFrame8 = null;
        gui.BookingInformationPage bookingInformationPage9 = new gui.BookingInformationPage(appFrame8);
        java.awt.Color color10 = null;
        bookingInformationPage9.setBackground(color10);
        bookingInformationPage9.show(false);
        java.awt.Color color14 = bookingInformationPage9.getForeground();
        bookingInformationPage2.setBackground(color14);
        appFrame0.setBackground(color14);
        boolean boolean17 = appFrame0.isFocused();
        java.awt.MenuBar menuBar18 = null;
        appFrame0.setMenuBar(menuBar18);
        appFrame0.setLocation(50, (int) (byte) 100);
        java.awt.Toolkit toolkit23 = appFrame0.getToolkit();
        // The following exception was thrown during execution in test generation
        try {
            gui.CancelBookingPage.refreshBookings(appFrame0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"userManagement.User.getId()\" because the return value of \"gui.AppFrame.getCurrentUser()\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(appFrame0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toolkit23);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        gui.AppFrame appFrame0 = null;
        gui.PaymentPage paymentPage1 = new gui.PaymentPage(appFrame0);
        boolean boolean2 = paymentPage1.isFocusable();
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener3 = null;
        paymentPage1.addHierarchyBoundsListener(hierarchyBoundsListener3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension6 = null;
        bookingInformationPage1.setPreferredSize(dimension6);
        java.awt.Event event8 = null;
        boolean boolean11 = bookingInformationPage1.mouseExit(event8, 10, (int) (byte) 10);
        java.awt.event.KeyListener[] keyListenerArray12 = bookingInformationPage1.getKeyListeners();
        java.awt.Image image13 = null;
        gui.AppFrame appFrame14 = null;
        gui.BookingInformationPage bookingInformationPage15 = new gui.BookingInformationPage(appFrame14);
        int int16 = bookingInformationPage1.checkImage(image13, (java.awt.image.ImageObserver) bookingInformationPage15);
        bookingInformationPage1.setFocusable(false);
        java.awt.im.InputContext inputContext19 = bookingInformationPage1.getInputContext();
        java.awt.PopupMenu popupMenu20 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingInformationPage1.add(popupMenu20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"parent\" because \"popup\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyListenerArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(inputContext19);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        administratorManagement.Administrator administrator5 = new administratorManagement.Administrator("LOGIN", "EXTEND BOOKING", "BOOKING", (int) '4', false);
        java.lang.String str6 = administrator5.getAdminType();
        roomManagement.Room room8 = administrator5.selectRoomID("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Administrator" + "'", str6.equals("Administrator"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(room8);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.show(false);
        java.awt.Color color6 = bookingInformationPage1.getForeground();
        gui.AppFrame appFrame7 = null;
        gui.BookingInformationPage bookingInformationPage8 = new gui.BookingInformationPage(appFrame7);
        java.awt.Color color9 = null;
        bookingInformationPage8.setBackground(color9);
        bookingInformationPage8.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension13 = null;
        bookingInformationPage8.setPreferredSize(dimension13);
        int int15 = bookingInformationPage1.getComponentZOrder((java.awt.Component) bookingInformationPage8);
        java.awt.event.MouseListener mouseListener16 = null;
        bookingInformationPage8.addMouseListener(mouseListener16);
        java.awt.Event event18 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingInformationPage8.deliverEvent(event18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"x\" because \"e\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        gui.AppFrame appFrame0 = gui.AppFrame.getInstance();
        java.awt.event.WindowListener windowListener1 = null;
        appFrame0.addWindowListener(windowListener1);
        appFrame0.show();
        java.awt.Component component4 = null;
        // The following exception was thrown during execution in test generation
        try {
            appFrame0.remove(component4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"parent\" because \"comp\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(appFrame0);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension6 = null;
        bookingInformationPage1.setPreferredSize(dimension6);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray8 = bookingInformationPage1.getPropertyChangeListeners();
        boolean boolean9 = bookingInformationPage1.isOpaque();
        java.beans.VetoableChangeListener vetoableChangeListener10 = null;
        bookingInformationPage1.removeVetoableChangeListener(vetoableChangeListener10);
        java.awt.Event event12 = null;
        gui.AppFrame appFrame13 = null;
        gui.BookingInformationPage bookingInformationPage14 = new gui.BookingInformationPage(appFrame13);
        java.util.Locale locale15 = null;
        bookingInformationPage14.setLocale(locale15);
        boolean boolean17 = bookingInformationPage1.gotFocus(event12, (java.lang.Object) bookingInformationPage14);
        bookingInformationPage1.disable();
        java.awt.event.ContainerListener[] containerListenerArray19 = bookingInformationPage1.getContainerListeners();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(propertyChangeListenerArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(containerListenerArray19);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension6 = null;
        bookingInformationPage1.setPreferredSize(dimension6);
        java.awt.Event event8 = null;
        boolean boolean11 = bookingInformationPage1.mouseExit(event8, 10, (int) (byte) 10);
        java.awt.event.KeyListener[] keyListenerArray12 = bookingInformationPage1.getKeyListeners();
        java.awt.event.FocusListener focusListener13 = null;
        bookingInformationPage1.removeFocusListener(focusListener13);
        boolean boolean15 = bookingInformationPage1.isPaintingForPrint();
        javax.swing.border.Border border16 = null;
        bookingInformationPage1.setBorder(border16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyListenerArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        gui.AppFrame appFrame0 = gui.AppFrame.getInstance();
        gui.AppFrame appFrame1 = null;
        gui.BookingInformationPage bookingInformationPage2 = new gui.BookingInformationPage(appFrame1);
        java.awt.Color color3 = null;
        bookingInformationPage2.setBackground(color3);
        bookingInformationPage2.show(false);
        java.awt.LayoutManager layoutManager7 = bookingInformationPage2.getLayout();
        gui.AppFrame appFrame8 = null;
        gui.BookingInformationPage bookingInformationPage9 = new gui.BookingInformationPage(appFrame8);
        java.awt.Color color10 = null;
        bookingInformationPage9.setBackground(color10);
        bookingInformationPage9.show(false);
        java.awt.Color color14 = bookingInformationPage9.getForeground();
        bookingInformationPage2.setBackground(color14);
        appFrame0.setBackground(color14);
        appFrame0.toFront();
        java.awt.event.WindowStateListener[] windowStateListenerArray18 = appFrame0.getWindowStateListeners();
        userManagement.User user19 = null;
        appFrame0.setCurrentUser(user19);
        java.awt.Window.Type type21 = appFrame0.getType();
        // The following exception was thrown during execution in test generation
        try {
            appFrame0.setUndecorated(false);
            org.junit.Assert.fail("Expected exception of type java.awt.IllegalComponentStateException; message: The frame is displayable.");
        } catch (java.awt.IllegalComponentStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(appFrame0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(windowStateListenerArray18);
        org.junit.Assert.assertTrue("'" + type21 + "' != '" + java.awt.Window.Type.NORMAL + "'", type21.equals(java.awt.Window.Type.NORMAL));
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        gui.AppFrame appFrame0 = gui.AppFrame.getInstance();
        java.awt.event.WindowListener windowListener1 = null;
        appFrame0.addWindowListener(windowListener1);
        javax.swing.JRootPane jRootPane3 = appFrame0.getRootPane();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(appFrame0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jRootPane3);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        gui.AppFrame appFrame0 = gui.AppFrame.getInstance();
        gui.AppFrame appFrame1 = null;
        gui.BookingInformationPage bookingInformationPage2 = new gui.BookingInformationPage(appFrame1);
        java.awt.Color color3 = null;
        bookingInformationPage2.setBackground(color3);
        bookingInformationPage2.show(false);
        java.awt.LayoutManager layoutManager7 = bookingInformationPage2.getLayout();
        gui.AppFrame appFrame8 = null;
        gui.BookingInformationPage bookingInformationPage9 = new gui.BookingInformationPage(appFrame8);
        java.awt.Color color10 = null;
        bookingInformationPage9.setBackground(color10);
        bookingInformationPage9.show(false);
        java.awt.Color color14 = bookingInformationPage9.getForeground();
        bookingInformationPage2.setBackground(color14);
        appFrame0.setBackground(color14);
        boolean boolean17 = appFrame0.isFocused();
        java.awt.MenuComponent menuComponent18 = null;
        appFrame0.remove(menuComponent18);
        appFrame0.setFocusableWindowState(true);
        java.awt.Window[] windowArray22 = appFrame0.getOwnedWindows();
        // The following exception was thrown during execution in test generation
        try {
            gui.ExtendBookingPage.refreshBookings(appFrame0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"userManagement.User.getId()\" because the return value of \"gui.AppFrame.getCurrentUser()\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(appFrame0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color14);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(windowArray22);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.setVerifyInputWhenFocusTarget(true);
        java.awt.Graphics graphics6 = null;
        bookingInformationPage1.printAll(graphics6);
        // The following exception was thrown during execution in test generation
        try {
            bookingInformationPage1.remove((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        java.awt.Frame[] frameArray0 = java.awt.Frame.getFrames();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(frameArray0);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension6 = null;
        bookingInformationPage1.setPreferredSize(dimension6);
        java.awt.Event event8 = null;
        boolean boolean11 = bookingInformationPage1.mouseExit(event8, 10, (int) (byte) 10);
        java.awt.event.KeyListener[] keyListenerArray12 = bookingInformationPage1.getKeyListeners();
        java.awt.Image image13 = null;
        gui.AppFrame appFrame14 = null;
        gui.BookingInformationPage bookingInformationPage15 = new gui.BookingInformationPage(appFrame14);
        int int16 = bookingInformationPage1.checkImage(image13, (java.awt.image.ImageObserver) bookingInformationPage15);
        bookingInformationPage15.firePropertyChange("gui.BookingInformationPage[,0,0,0x0,invalid,layout=java.awt.GridBagLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", (int) (short) 1, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyListenerArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        gui.AppFrame appFrame0 = gui.AppFrame.getInstance();
        java.awt.event.WindowListener windowListener1 = null;
        appFrame0.addWindowListener(windowListener1);
        boolean boolean3 = appFrame0.isActive();
        int int4 = appFrame0.getExtendedState();
        boolean boolean5 = appFrame0.isFocusTraversable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(appFrame0);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        bookingInformationPage1.repaint((int) (byte) 1, (int) (byte) 10, (int) '4', (int) (byte) 0);
        gui.AppFrame appFrame7 = null;
        gui.BookingInformationPage bookingInformationPage8 = new gui.BookingInformationPage(appFrame7);
        java.awt.Color color9 = null;
        bookingInformationPage8.setBackground(color9);
        bookingInformationPage8.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension13 = null;
        bookingInformationPage8.setPreferredSize(dimension13);
        java.awt.Event event15 = null;
        boolean boolean18 = bookingInformationPage8.mouseExit(event15, 10, (int) (byte) 10);
        java.lang.Object obj19 = bookingInformationPage1.getClientProperty((java.lang.Object) 10);
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        bookingInformationPage1.addPropertyChangeListener(propertyChangeListener20);
        bookingInformationPage1.setFocusCycleRoot(true);
        bookingInformationPage1.repaint((int) 'a', 100, 64, (int) '4');
        boolean boolean29 = bookingInformationPage1.isVisible();
        java.awt.Graphics graphics30 = null;
        bookingInformationPage1.printAll(graphics30);
        java.awt.event.ContainerListener containerListener32 = null;
        bookingInformationPage1.addContainerListener(containerListener32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        java.lang.String str0 = gui.AppFrame.CARD_CHIEF_EVENT_COORDINATOR;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "MANAGE ADMINISTRATORS" + "'", str0.equals("MANAGE ADMINISTRATORS"));
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        gui.AppFrame appFrame0 = null;
        gui.RoomOptionsPage roomOptionsPage1 = new gui.RoomOptionsPage(appFrame0);
        gui.AppFrame appFrame2 = null;
        gui.BookingInformationPage bookingInformationPage3 = new gui.BookingInformationPage(appFrame2);
        java.awt.Color color4 = null;
        bookingInformationPage3.setBackground(color4);
        bookingInformationPage3.show(false);
        java.awt.LayoutManager layoutManager8 = bookingInformationPage3.getLayout();
        bookingInformationPage3.transferFocus();
        int int10 = roomOptionsPage1.getComponentZOrder((java.awt.Component) bookingInformationPage3);
        bookingInformationPage3.layout();
        java.awt.Point point13 = bookingInformationPage3.getMousePosition(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(point13);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.show(false);
        java.awt.Color color6 = bookingInformationPage1.getForeground();
        java.awt.FocusTraversalPolicy focusTraversalPolicy7 = null;
        bookingInformationPage1.setFocusTraversalPolicy(focusTraversalPolicy7);
        int int9 = bookingInformationPage1.countComponents();
        gui.AppFrame appFrame10 = null;
        gui.BookingInformationPage bookingInformationPage11 = new gui.BookingInformationPage(appFrame10);
        java.awt.Color color12 = null;
        bookingInformationPage11.setBackground(color12);
        bookingInformationPage11.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension16 = null;
        bookingInformationPage11.setPreferredSize(dimension16);
        bookingInformationPage11.paintImmediately((int) (byte) 10, 10, 7, 64);
        bookingInformationPage11.resize(1, (int) (byte) 100);
        javax.swing.KeyStroke keyStroke26 = null;
        java.awt.event.ActionListener actionListener27 = bookingInformationPage11.getActionForKeyStroke(keyStroke26);
        bookingInformationPage11.hide();
        boolean boolean29 = bookingInformationPage11.isManagingFocus();
        java.awt.event.MouseEvent mouseEvent30 = null;
        java.awt.Point point31 = bookingInformationPage11.getToolTipLocation(mouseEvent30);
        javax.accessibility.AccessibleContext accessibleContext32 = bookingInformationPage11.getAccessibleContext();
        java.awt.event.HierarchyListener hierarchyListener33 = null;
        bookingInformationPage11.removeHierarchyListener(hierarchyListener33);
        boolean boolean35 = bookingInformationPage11.isMaximumSizeSet();
        gui.AppFrame appFrame36 = null;
        gui.WelcomePage welcomePage37 = new gui.WelcomePage(appFrame36);
        welcomePage37.setVisible(false);
        // The following exception was thrown during execution in test generation
        try {
            bookingInformationPage1.add((java.awt.Component) bookingInformationPage11, (java.lang.Object) welcomePage37, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: illegal component position");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(actionListener27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(point31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(accessibleContext32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        gui.AppFrame appFrame0 = gui.AppFrame.getInstance();
        gui.AppFrame appFrame1 = null;
        gui.BookingInformationPage bookingInformationPage2 = new gui.BookingInformationPage(appFrame1);
        java.awt.Color color3 = null;
        bookingInformationPage2.setBackground(color3);
        bookingInformationPage2.show(false);
        java.awt.LayoutManager layoutManager7 = bookingInformationPage2.getLayout();
        gui.AppFrame appFrame8 = null;
        gui.BookingInformationPage bookingInformationPage9 = new gui.BookingInformationPage(appFrame8);
        java.awt.Color color10 = null;
        bookingInformationPage9.setBackground(color10);
        bookingInformationPage9.show(false);
        java.awt.Color color14 = bookingInformationPage9.getForeground();
        bookingInformationPage2.setBackground(color14);
        appFrame0.setBackground(color14);
        boolean boolean17 = appFrame0.isFocused();
        java.awt.MenuBar menuBar18 = null;
        appFrame0.setMenuBar(menuBar18);
        // The following exception was thrown during execution in test generation
        try {
            gui.CancelBookingPage.refreshBookings(appFrame0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"userManagement.User.getId()\" because the return value of \"gui.AppFrame.getCurrentUser()\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(appFrame0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color14);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.setSize((int) (byte) 100, (-1));
        java.awt.FocusTraversalPolicy focusTraversalPolicy7 = null;
        bookingInformationPage1.setFocusTraversalPolicy(focusTraversalPolicy7);
        javax.swing.TransferHandler transferHandler9 = null;
        bookingInformationPage1.setTransferHandler(transferHandler9);
        java.awt.event.MouseListener[] mouseListenerArray11 = bookingInformationPage1.getMouseListeners();
        java.awt.Event event12 = null;
        boolean boolean15 = bookingInformationPage1.mouseMove(event12, 16, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mouseListenerArray11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.setSize((int) (byte) 100, (-1));
        java.awt.FocusTraversalPolicy focusTraversalPolicy7 = null;
        bookingInformationPage1.setFocusTraversalPolicy(focusTraversalPolicy7);
        java.awt.Event event9 = null;
        boolean boolean11 = bookingInformationPage1.keyDown(event9, (int) '4');
        java.awt.Point point13 = bookingInformationPage1.getMousePosition(false);
        bookingInformationPage1.removeNotify();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(point13);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        gui.AppFrame appFrame0 = null;
        gui.RoomOptionsPage roomOptionsPage1 = new gui.RoomOptionsPage(appFrame0);
        roomOptionsPage1.setLocation(50, 0);
        java.awt.Component component7 = roomOptionsPage1.findComponentAt((int) (byte) 10, 0);
        java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListenerArray8 = roomOptionsPage1.getHierarchyBoundsListeners();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hierarchyBoundsListenerArray8);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        gui.ExtendBookingPage.clearField();
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        roomStatus.EnabledState enabledState0 = new roomStatus.EnabledState();
        java.lang.String str1 = enabledState0.getStatus();
        roomManagement.Room room5 = new roomManagement.Room("gui.BookingInformationPage[,0,0,0x0,invalid,layout=java.awt.GridBagLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", 10, "");
        boolean boolean6 = enabledState0.maintenanceAndRepairsFinished(room5);
        java.lang.String str7 = room5.getRoomLocation();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "ENABLED" + "'", str1.equals("ENABLED"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        administratorManagement.Administrator administrator5 = new administratorManagement.Administrator("LOGIN", "EXTEND BOOKING", "BOOKING", (int) '4', false);
        boolean boolean7 = administrator5.disableRoom("CREATE ROOM");
        java.lang.String str8 = administrator5.getUsername();
        java.lang.String str9 = administrator5.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "LOGIN" + "'", str8.equals("LOGIN"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "BOOKING" + "'", str9.equals("BOOKING"));
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        java.util.Date date3 = null;
        bookingManagment.Booking booking9 = new bookingManagment.Booking("gui.BookingInformationPage[,0,0,0x0,invalid,layout=java.awt.GridBagLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", "BOOKING", "ADMINISTRATOR OPTIONS", date3, "Other", "ROOM OPTIONS", (double) 32, (double) 40, (double) 12);
        booking9.setEndTime("MANAGE ROOMS");
        double double12 = booking9.getDepositPaid();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 32.0d + "'", double12 == 32.0d);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        bookingManagment.BookingManager bookingManager0 = bookingManagment.BookingManager.getInstance();
        bookingManagment.Booking booking2 = bookingManager0.getBooking("hi!");
        java.util.Date date6 = null;
        bookingManager0.createBooking("BOOKING", "PAYMENT", "WELCOME", date6, "WELCOME", "EXTEND BOOKING", (double) (byte) 1, (double) (-1), 100.0d);
        // The following exception was thrown during execution in test generation
        try {
            bookingManager0.extendBooking("MANAGE ROOMS", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"bookingManagment.Booking.setEndTime(String)\" because the return value of \"java.util.HashMap.get(Object)\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        dataManagement.MaintainUser maintainUser0 = new dataManagement.MaintainUser();
        userManagement.User user3 = maintainUser0.authenticate("gui.BookingInformationPage[,0,0,0x0,invalid,layout=java.awt.GridBagLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", "MANAGE ROOMS");
        userManagement.Staff staff9 = new userManagement.Staff("MANAGE ROOMS", "DASHBOARD", "MANAGE ROOMS", (int) (byte) 100, "PAYMENT");
        int int10 = staff9.getHourlyRate();
        staff9.setOrgIdOrStudentNumber("LOGIN");
        maintainUser0.addUser((userManagement.User) staff9);
        userManagement.Other other19 = new userManagement.Other("ROOM OPTIONS", "", "WELCOME", 32, "DASHBOARD");
        userManagement.Other other25 = new userManagement.Other("ROOM OPTIONS", "", "WELCOME", 32, "DASHBOARD");
        userManagement.Staff staff31 = new userManagement.Staff("LOGIN", "WELCOME", "hi!", (int) (short) 0, "ROOM OPTIONS");
        userManagement.Other other37 = new userManagement.Other("ROOM OPTIONS", "", "WELCOME", 32, "DASHBOARD");
        int int38 = other37.getHourlyRate();
        userManagement.Staff staff44 = new userManagement.Staff("MANAGE ROOMS", "DASHBOARD", "MANAGE ROOMS", (int) (byte) 100, "PAYMENT");
        userManagement.Staff staff50 = new userManagement.Staff("MANAGE ROOMS", "DASHBOARD", "MANAGE ROOMS", (int) (byte) 100, "PAYMENT");
        userManagement.Partner partner56 = new userManagement.Partner("LOGIN", "MANAGE ROOMS", "WELCOME", (int) (short) -1, "PAYMENT");
        partner56.setOrgIdOrStudentNumber("WELCOME");
        userManagement.User[] userArray59 = new userManagement.User[] { other19, other25, staff31, other37, staff44, staff50, partner56 };
        java.util.ArrayList<userManagement.User> userList60 = new java.util.ArrayList<userManagement.User>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<userManagement.User>) userList60, userArray59);
        maintainUser0.users = userList60;
        int int63 = maintainUser0.nextId();
        boolean boolean65 = maintainUser0.emailExists("PAYMENT");
        int int66 = maintainUser0.nextId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 40 + "'", int10 == 40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 50 + "'", int38 == 50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 101 + "'", int63 == 101);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 101 + "'", int66 == 101);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.setVerifyInputWhenFocusTarget(true);
        java.awt.Insets insets6 = bookingInformationPage1.getInsets();
        boolean boolean7 = bookingInformationPage1.isManagingFocus();
        boolean boolean8 = bookingInformationPage1.isVisible();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(insets6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.util.Locale locale2 = null;
        bookingInformationPage1.setLocale(locale2);
        java.awt.dnd.DropTarget dropTarget4 = bookingInformationPage1.getDropTarget();
        java.beans.PropertyChangeListener propertyChangeListener6 = null;
        bookingInformationPage1.removePropertyChangeListener("", propertyChangeListener6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(dropTarget4);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        boolean boolean2 = userManagement.UserFactory.isValidEmail("York's Booking Manager", "Faculty");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.show(false);
        java.awt.Color color6 = bookingInformationPage1.getForeground();
        int int7 = bookingInformationPage1.getWidth();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior8 = bookingInformationPage1.getBaselineResizeBehavior();
        boolean boolean11 = bookingInformationPage1.contains(101, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior8 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior8.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        int int0 = java.awt.Frame.MAXIMIZED_VERT;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        bookingInformationPage1.repaint((int) (byte) 1, (int) (byte) 10, (int) '4', (int) (byte) 0);
        gui.AppFrame appFrame7 = null;
        gui.BookingInformationPage bookingInformationPage8 = new gui.BookingInformationPage(appFrame7);
        java.awt.Color color9 = null;
        bookingInformationPage8.setBackground(color9);
        bookingInformationPage8.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension13 = null;
        bookingInformationPage8.setPreferredSize(dimension13);
        java.awt.Event event15 = null;
        boolean boolean18 = bookingInformationPage8.mouseExit(event15, 10, (int) (byte) 10);
        java.lang.Object obj19 = bookingInformationPage1.getClientProperty((java.lang.Object) 10);
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        bookingInformationPage1.addPropertyChangeListener(propertyChangeListener20);
        int int24 = bookingInformationPage1.getBaseline((int) (short) 10, 4);
        java.awt.Font font25 = null;
        bookingInformationPage1.setFont(font25);
        java.io.PrintStream printStream27 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingInformationPage1.list(printStream27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintStream.println(Object)\" because \"out\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.show(false);
        java.awt.Color color6 = bookingInformationPage1.getForeground();
        bookingInformationPage1.removeNotify();
        java.awt.Event event8 = null;
        boolean boolean10 = bookingInformationPage1.gotFocus(event8, (java.lang.Object) false);
        java.awt.LayoutManager layoutManager11 = bookingInformationPage1.getLayout();
        gui.AppFrame appFrame12 = gui.AppFrame.getInstance();
        gui.AppFrame appFrame13 = null;
        gui.BookingInformationPage bookingInformationPage14 = new gui.BookingInformationPage(appFrame13);
        java.awt.Color color15 = null;
        bookingInformationPage14.setBackground(color15);
        bookingInformationPage14.show(false);
        java.awt.LayoutManager layoutManager19 = bookingInformationPage14.getLayout();
        gui.AppFrame appFrame20 = null;
        gui.BookingInformationPage bookingInformationPage21 = new gui.BookingInformationPage(appFrame20);
        java.awt.Color color22 = null;
        bookingInformationPage21.setBackground(color22);
        bookingInformationPage21.show(false);
        java.awt.Color color26 = bookingInformationPage21.getForeground();
        bookingInformationPage14.setBackground(color26);
        appFrame12.setBackground(color26);
        boolean boolean29 = appFrame12.isFocused();
        java.awt.MenuComponent menuComponent30 = null;
        appFrame12.remove(menuComponent30);
        gui.SignUpPage signUpPage32 = new gui.SignUpPage(appFrame12);
        boolean boolean33 = appFrame12.isValidateRoot();
        java.awt.Graphics graphics34 = appFrame12.getGraphics();
        bookingInformationPage1.printAll(graphics34);
        bookingInformationPage1.enableInputMethods(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(appFrame12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color26);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphics34);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.setSize((int) (byte) 100, (-1));
        bookingInformationPage1.setAutoscrolls(false);
        gui.AppFrame appFrame9 = null;
        gui.BookingInformationPage bookingInformationPage10 = new gui.BookingInformationPage(appFrame9);
        java.awt.Color color11 = null;
        bookingInformationPage10.setBackground(color11);
        bookingInformationPage10.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension15 = null;
        bookingInformationPage10.setPreferredSize(dimension15);
        java.awt.Event event17 = null;
        boolean boolean20 = bookingInformationPage10.mouseExit(event17, 10, (int) (byte) 10);
        java.awt.event.KeyListener[] keyListenerArray21 = bookingInformationPage10.getKeyListeners();
        java.awt.Image image22 = null;
        gui.AppFrame appFrame23 = null;
        gui.BookingInformationPage bookingInformationPage24 = new gui.BookingInformationPage(appFrame23);
        int int25 = bookingInformationPage10.checkImage(image22, (java.awt.image.ImageObserver) bookingInformationPage24);
        javax.swing.JPopupMenu jPopupMenu26 = bookingInformationPage24.getComponentPopupMenu();
        bookingInformationPage1.setNextFocusableComponent((java.awt.Component) jPopupMenu26);
        java.awt.event.ComponentListener[] componentListenerArray28 = bookingInformationPage1.getComponentListeners();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyListenerArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 32 + "'", int25 == 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(jPopupMenu26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(componentListenerArray28);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension6 = null;
        bookingInformationPage1.setPreferredSize(dimension6);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray8 = bookingInformationPage1.getPropertyChangeListeners();
        bookingInformationPage1.enableInputMethods(false);
        int int11 = bookingInformationPage1.getY();
        bookingInformationPage1.setOpaque(true);
        boolean boolean14 = bookingInformationPage1.isDoubleBuffered();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(propertyChangeListenerArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        javax.swing.JFrame.setDefaultLookAndFeelDecorated(true);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        javax.swing.plaf.PanelUI panelUI4 = null;
        bookingInformationPage1.setUI(panelUI4);
        java.awt.event.FocusListener[] focusListenerArray6 = bookingInformationPage1.getFocusListeners();
        bookingInformationPage1.repaint();
        gui.AppFrame appFrame8 = null;
        gui.BookingInformationPage bookingInformationPage9 = new gui.BookingInformationPage(appFrame8);
        java.awt.Color color10 = null;
        bookingInformationPage9.setBackground(color10);
        bookingInformationPage9.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension14 = null;
        bookingInformationPage9.setPreferredSize(dimension14);
        java.awt.Graphics graphics16 = null;
        bookingInformationPage9.paintComponents(graphics16);
        java.awt.Event event18 = null;
        boolean boolean21 = bookingInformationPage9.mouseMove(event18, (int) (byte) -1, (int) 'a');
        gui.AppFrame appFrame22 = null;
        gui.BookingInformationPage bookingInformationPage23 = new gui.BookingInformationPage(appFrame22);
        java.awt.Color color24 = null;
        bookingInformationPage23.setBackground(color24);
        bookingInformationPage23.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension28 = null;
        bookingInformationPage23.setPreferredSize(dimension28);
        java.awt.Event event30 = null;
        boolean boolean33 = bookingInformationPage23.mouseExit(event30, 10, (int) (byte) 10);
        java.awt.event.KeyListener[] keyListenerArray34 = bookingInformationPage23.getKeyListeners();
        java.awt.Image image35 = null;
        gui.AppFrame appFrame36 = null;
        gui.BookingInformationPage bookingInformationPage37 = new gui.BookingInformationPage(appFrame36);
        int int38 = bookingInformationPage23.checkImage(image35, (java.awt.image.ImageObserver) bookingInformationPage37);
        gui.AppFrame appFrame39 = null;
        gui.BookingInformationPage bookingInformationPage40 = new gui.BookingInformationPage(appFrame39);
        java.awt.Color color41 = null;
        bookingInformationPage40.setBackground(color41);
        bookingInformationPage40.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension45 = null;
        bookingInformationPage40.setPreferredSize(dimension45);
        bookingInformationPage40.paintImmediately((int) (byte) 10, 10, 7, 64);
        java.lang.String str52 = bookingInformationPage40.toString();
        java.awt.Rectangle rectangle53 = null;
        java.awt.Rectangle rectangle54 = bookingInformationPage40.getBounds(rectangle53);
        java.awt.Rectangle rectangle55 = bookingInformationPage37.getBounds(rectangle53);
        java.awt.Rectangle rectangle56 = bookingInformationPage9.getBounds(rectangle53);
        // The following exception was thrown during execution in test generation
        try {
            bookingInformationPage1.computeVisibleRect(rectangle53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.Rectangle.setBounds(int, int, int, int)\" because \"visibleRect\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(focusListenerArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyListenerArray34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 32 + "'", int38 == 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "gui.BookingInformationPage[,0,0,0x0,invalid,layout=java.awt.GridBagLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]" + "'", str52.equals("gui.BookingInformationPage[,0,0,0x0,invalid,layout=java.awt.GridBagLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rectangle54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rectangle55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rectangle56);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        bookingInformationPage1.repaint((int) (byte) 1, (int) (byte) 10, (int) '4', (int) (byte) 0);
        gui.AppFrame appFrame7 = null;
        gui.BookingInformationPage bookingInformationPage8 = new gui.BookingInformationPage(appFrame7);
        java.awt.Color color9 = null;
        bookingInformationPage8.setBackground(color9);
        bookingInformationPage8.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension13 = null;
        bookingInformationPage8.setPreferredSize(dimension13);
        java.awt.Event event15 = null;
        boolean boolean18 = bookingInformationPage8.mouseExit(event15, 10, (int) (byte) 10);
        java.lang.Object obj19 = bookingInformationPage1.getClientProperty((java.lang.Object) 10);
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        bookingInformationPage1.addPropertyChangeListener(propertyChangeListener20);
        bookingInformationPage1.setFocusCycleRoot(true);
        bookingInformationPage1.repaint((int) 'a', 100, 64, (int) '4');
        boolean boolean29 = bookingInformationPage1.isVisible();
        javax.swing.event.AncestorListener ancestorListener30 = null;
        bookingInformationPage1.removeAncestorListener(ancestorListener30);
        javax.swing.KeyStroke keyStroke32 = null;
        bookingInformationPage1.unregisterKeyboardAction(keyStroke32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        gui.AppFrame appFrame0 = gui.AppFrame.getInstance();
        gui.AppFrame appFrame1 = null;
        gui.BookingInformationPage bookingInformationPage2 = new gui.BookingInformationPage(appFrame1);
        java.awt.Color color3 = null;
        bookingInformationPage2.setBackground(color3);
        bookingInformationPage2.show(false);
        java.awt.LayoutManager layoutManager7 = bookingInformationPage2.getLayout();
        gui.AppFrame appFrame8 = null;
        gui.BookingInformationPage bookingInformationPage9 = new gui.BookingInformationPage(appFrame8);
        java.awt.Color color10 = null;
        bookingInformationPage9.setBackground(color10);
        bookingInformationPage9.show(false);
        java.awt.Color color14 = bookingInformationPage9.getForeground();
        bookingInformationPage2.setBackground(color14);
        appFrame0.setBackground(color14);
        appFrame0.toFront();
        java.awt.event.WindowStateListener[] windowStateListenerArray18 = appFrame0.getWindowStateListeners();
        appFrame0.pack();
        java.awt.im.InputContext inputContext20 = appFrame0.getInputContext();
        appFrame0.setState(16);
        java.awt.Window.Type type23 = null;
        // The following exception was thrown during execution in test generation
        try {
            appFrame0.setType(type23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: type should not be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(appFrame0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(windowStateListenerArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(inputContext20);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.setVerifyInputWhenFocusTarget(true);
        java.awt.event.FocusListener[] focusListenerArray6 = bookingInformationPage1.getFocusListeners();
        javax.swing.KeyStroke keyStroke7 = null;
        int int8 = bookingInformationPage1.getConditionForKeyStroke(keyStroke7);
        gui.AppFrame appFrame9 = null;
        gui.WelcomePage welcomePage10 = new gui.WelcomePage(appFrame9);
        gui.AppFrame appFrame11 = null;
        gui.BookingInformationPage bookingInformationPage12 = new gui.BookingInformationPage(appFrame11);
        java.awt.Color color13 = null;
        bookingInformationPage12.setBackground(color13);
        bookingInformationPage12.show(false);
        java.awt.LayoutManager layoutManager17 = bookingInformationPage12.getLayout();
        java.awt.Point point18 = null;
        java.awt.Point point19 = bookingInformationPage12.getLocation(point18);
        boolean boolean20 = welcomePage10.contains(point19);
        java.awt.Point point21 = bookingInformationPage1.getLocation(point19);
        gui.AppFrame appFrame22 = null;
        gui.BookingInformationPage bookingInformationPage23 = new gui.BookingInformationPage(appFrame22);
        java.awt.Color color24 = null;
        bookingInformationPage23.setBackground(color24);
        bookingInformationPage23.show(false);
        java.awt.Color color28 = bookingInformationPage23.getForeground();
        bookingInformationPage1.setForeground(color28);
        java.awt.Event event30 = null;
        gui.AppFrame appFrame31 = null;
        gui.BookingInformationPage bookingInformationPage32 = new gui.BookingInformationPage(appFrame31);
        java.awt.Color color33 = null;
        bookingInformationPage32.setBackground(color33);
        bookingInformationPage32.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension37 = null;
        bookingInformationPage32.setPreferredSize(dimension37);
        bookingInformationPage32.firePropertyChange("hi!", false, true);
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior43 = bookingInformationPage32.getBaselineResizeBehavior();
        bookingInformationPage32.setAlignmentX((float) 1);
        boolean boolean46 = bookingInformationPage1.action(event30, (java.lang.Object) bookingInformationPage32);
        java.awt.Event event47 = null;
        boolean boolean50 = bookingInformationPage32.mouseDown(event47, (int) ' ', (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(focusListenerArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(point19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(point21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color28);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior43 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior43.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.setVerifyInputWhenFocusTarget(true);
        java.awt.Insets insets6 = bookingInformationPage1.getInsets();
        boolean boolean7 = bookingInformationPage1.getFocusTraversalKeysEnabled();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(insets6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension6 = null;
        bookingInformationPage1.setPreferredSize(dimension6);
        bookingInformationPage1.paintImmediately((int) (byte) 10, 10, 7, 64);
        java.lang.String str13 = bookingInformationPage1.toString();
        java.lang.Object obj14 = null;
        gui.AppFrame appFrame15 = null;
        gui.BookingInformationPage bookingInformationPage16 = new gui.BookingInformationPage(appFrame15);
        java.awt.Color color17 = null;
        bookingInformationPage16.setBackground(color17);
        java.awt.ComponentOrientation componentOrientation19 = null;
        bookingInformationPage16.setComponentOrientation(componentOrientation19);
        // The following exception was thrown during execution in test generation
        try {
            bookingInformationPage1.putClientProperty(obj14, (java.lang.Object) bookingInformationPage16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.toString()\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "gui.BookingInformationPage[,0,0,0x0,invalid,layout=java.awt.GridBagLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]" + "'", str13.equals("gui.BookingInformationPage[,0,0,0x0,invalid,layout=java.awt.GridBagLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]"));
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = bookingManagment.Booking.combineDateAndTime(date0, "Faculty [username=null, email=null, id=0]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        java.lang.String str0 = gui.AppFrame.USERS_CSV_PATH;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "data/users.csv" + "'", str0.equals("data/users.csv"));
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension6 = null;
        bookingInformationPage1.setPreferredSize(dimension6);
        bookingInformationPage1.paintImmediately((int) (byte) 10, 10, 7, 64);
        bookingInformationPage1.resize(1, (int) (byte) 100);
        javax.swing.KeyStroke keyStroke16 = null;
        java.awt.event.ActionListener actionListener17 = bookingInformationPage1.getActionForKeyStroke(keyStroke16);
        bookingInformationPage1.hide();
        boolean boolean19 = bookingInformationPage1.isManagingFocus();
        java.awt.event.MouseEvent mouseEvent20 = null;
        java.awt.Point point21 = bookingInformationPage1.getToolTipLocation(mouseEvent20);
        javax.accessibility.AccessibleContext accessibleContext22 = bookingInformationPage1.getAccessibleContext();
        java.awt.event.HierarchyListener hierarchyListener23 = null;
        bookingInformationPage1.removeHierarchyListener(hierarchyListener23);
        bookingInformationPage1.setLocation(6, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(actionListener17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(point21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(accessibleContext22);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension6 = null;
        bookingInformationPage1.setPreferredSize(dimension6);
        gui.AppFrame appFrame8 = null;
        gui.BookingInformationPage bookingInformationPage9 = new gui.BookingInformationPage(appFrame8);
        java.awt.Color color10 = null;
        bookingInformationPage9.setBackground(color10);
        bookingInformationPage9.show(false);
        java.awt.LayoutManager layoutManager14 = bookingInformationPage9.getLayout();
        bookingInformationPage1.putClientProperty((java.lang.Object) layoutManager14, (java.lang.Object) 0);
        boolean boolean17 = bookingInformationPage1.isMaximumSizeSet();
        java.awt.Font font18 = null;
        bookingInformationPage1.setFont(font18);
        bookingInformationPage1.firePropertyChange("BOOKING", '#', 'a');
        java.awt.dnd.DropTarget dropTarget24 = bookingInformationPage1.getDropTarget();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(dropTarget24);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        gui.AppFrame appFrame0 = gui.AppFrame.getInstance();
        gui.AppFrame appFrame1 = null;
        gui.BookingInformationPage bookingInformationPage2 = new gui.BookingInformationPage(appFrame1);
        java.awt.Color color3 = null;
        bookingInformationPage2.setBackground(color3);
        bookingInformationPage2.show(false);
        java.awt.LayoutManager layoutManager7 = bookingInformationPage2.getLayout();
        gui.AppFrame appFrame8 = null;
        gui.BookingInformationPage bookingInformationPage9 = new gui.BookingInformationPage(appFrame8);
        java.awt.Color color10 = null;
        bookingInformationPage9.setBackground(color10);
        bookingInformationPage9.show(false);
        java.awt.Color color14 = bookingInformationPage9.getForeground();
        bookingInformationPage2.setBackground(color14);
        appFrame0.setBackground(color14);
        javax.swing.JRootPane jRootPane17 = appFrame0.getRootPane();
        gui.AppFrame appFrame18 = null;
        gui.BookingInformationPage bookingInformationPage19 = new gui.BookingInformationPage(appFrame18);
        java.awt.Color color20 = null;
        bookingInformationPage19.setBackground(color20);
        bookingInformationPage19.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension24 = null;
        bookingInformationPage19.setPreferredSize(dimension24);
        gui.AppFrame appFrame26 = null;
        gui.BookingInformationPage bookingInformationPage27 = new gui.BookingInformationPage(appFrame26);
        java.awt.Color color28 = null;
        bookingInformationPage27.setBackground(color28);
        bookingInformationPage27.show(false);
        java.awt.LayoutManager layoutManager32 = bookingInformationPage27.getLayout();
        bookingInformationPage19.putClientProperty((java.lang.Object) layoutManager32, (java.lang.Object) 0);
        appFrame0.setLayout(layoutManager32);
        java.awt.Point point37 = appFrame0.getMousePosition(false);
        java.beans.PropertyChangeListener propertyChangeListener39 = null;
        appFrame0.addPropertyChangeListener("ROOM OPTIONS", propertyChangeListener39);
        appFrame0.setCursor(8);
        boolean boolean43 = appFrame0.isAutoRequestFocus();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(appFrame0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jRootPane17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(point37);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.show(false);
        java.awt.Color color6 = bookingInformationPage1.getForeground();
        bookingInformationPage1.setEnabled(false);
        java.awt.Dimension dimension9 = bookingInformationPage1.preferredSize();
        java.awt.Dimension dimension10 = bookingInformationPage1.getMinimumSize();
        java.beans.VetoableChangeListener[] vetoableChangeListenerArray11 = bookingInformationPage1.getVetoableChangeListeners();
        java.awt.Dimension dimension12 = bookingInformationPage1.getPreferredSize();
        java.awt.event.ComponentListener componentListener13 = null;
        bookingInformationPage1.removeComponentListener(componentListener13);
        gui.AppFrame appFrame15 = null;
        gui.BookingInformationPage bookingInformationPage16 = new gui.BookingInformationPage(appFrame15);
        java.awt.Color color17 = null;
        bookingInformationPage16.setBackground(color17);
        bookingInformationPage16.setVerifyInputWhenFocusTarget(true);
        java.awt.Insets insets21 = bookingInformationPage16.getInsets();
        java.awt.Dimension dimension22 = bookingInformationPage16.getPreferredSize();
        bookingInformationPage1.setPreferredSize(dimension22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dimension9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dimension10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vetoableChangeListenerArray11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dimension12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(insets21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dimension22);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        roomManagement.Room room3 = new roomManagement.Room("CREATE ROOM", 9, "SCAN BADGE");
        boolean boolean4 = room3.maintenanceAndRepairsFinished();
        java.lang.String str5 = room3.getStatus();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "ENABLED" + "'", str5.equals("ENABLED"));
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        gui.AppFrame appFrame0 = gui.AppFrame.getInstance();
        gui.AppFrame appFrame1 = null;
        gui.BookingInformationPage bookingInformationPage2 = new gui.BookingInformationPage(appFrame1);
        java.awt.Color color3 = null;
        bookingInformationPage2.setBackground(color3);
        bookingInformationPage2.show(false);
        java.awt.LayoutManager layoutManager7 = bookingInformationPage2.getLayout();
        gui.AppFrame appFrame8 = null;
        gui.BookingInformationPage bookingInformationPage9 = new gui.BookingInformationPage(appFrame8);
        java.awt.Color color10 = null;
        bookingInformationPage9.setBackground(color10);
        bookingInformationPage9.show(false);
        java.awt.Color color14 = bookingInformationPage9.getForeground();
        bookingInformationPage2.setBackground(color14);
        appFrame0.setBackground(color14);
        boolean boolean17 = appFrame0.isFocused();
        java.awt.MenuBar menuBar18 = null;
        appFrame0.setMenuBar(menuBar18);
        java.awt.Dialog.ModalExclusionType modalExclusionType20 = appFrame0.getModalExclusionType();
        appFrame0.validate();
        gui.AppFrame appFrame22 = null;
        gui.BookingInformationPage bookingInformationPage23 = new gui.BookingInformationPage(appFrame22);
        java.awt.Color color24 = null;
        bookingInformationPage23.setBackground(color24);
        bookingInformationPage23.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension28 = null;
        bookingInformationPage23.setPreferredSize(dimension28);
        bookingInformationPage23.paintImmediately((int) (byte) 10, 10, 7, 64);
        java.lang.String str35 = bookingInformationPage23.toString();
        java.awt.Rectangle rectangle36 = null;
        java.awt.Rectangle rectangle37 = bookingInformationPage23.getBounds(rectangle36);
        // The following exception was thrown during execution in test generation
        try {
            appFrame0.setBounds(rectangle36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"x\" because \"r\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(appFrame0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + modalExclusionType20 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType20.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "gui.BookingInformationPage[,0,0,0x0,invalid,layout=java.awt.GridBagLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]" + "'", str35.equals("gui.BookingInformationPage[,0,0,0x0,invalid,layout=java.awt.GridBagLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rectangle37);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension6 = null;
        bookingInformationPage1.setPreferredSize(dimension6);
        bookingInformationPage1.paintImmediately((int) (byte) 10, 10, 7, 64);
        bookingInformationPage1.resize(1, (int) (byte) 100);
        javax.swing.KeyStroke keyStroke16 = null;
        java.awt.event.ActionListener actionListener17 = bookingInformationPage1.getActionForKeyStroke(keyStroke16);
        bookingInformationPage1.setName("");
        gui.AppFrame appFrame20 = null;
        gui.BookingInformationPage bookingInformationPage21 = new gui.BookingInformationPage(appFrame20);
        java.awt.Color color22 = null;
        bookingInformationPage21.setBackground(color22);
        bookingInformationPage21.show(false);
        java.awt.Color color26 = bookingInformationPage21.getForeground();
        bookingInformationPage21.setEnabled(false);
        java.awt.Dimension dimension29 = bookingInformationPage21.preferredSize();
        java.awt.Dimension dimension30 = bookingInformationPage1.getSize(dimension29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(actionListener17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dimension29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dimension30);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.show(false);
        java.awt.Color color6 = bookingInformationPage1.getForeground();
        gui.AppFrame appFrame7 = null;
        gui.BookingInformationPage bookingInformationPage8 = new gui.BookingInformationPage(appFrame7);
        java.awt.Color color9 = null;
        bookingInformationPage8.setBackground(color9);
        bookingInformationPage8.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension13 = null;
        bookingInformationPage8.setPreferredSize(dimension13);
        int int15 = bookingInformationPage1.getComponentZOrder((java.awt.Component) bookingInformationPage8);
        java.awt.event.MouseListener mouseListener16 = null;
        bookingInformationPage8.addMouseListener(mouseListener16);
        bookingInformationPage8.resize(8, 8);
        float float21 = bookingInformationPage8.getAlignmentY();
        gui.AppFrame appFrame22 = null;
        gui.BookingInformationPage bookingInformationPage23 = new gui.BookingInformationPage(appFrame22);
        java.awt.Color color24 = null;
        bookingInformationPage23.setBackground(color24);
        javax.swing.plaf.PanelUI panelUI26 = null;
        bookingInformationPage23.setUI(panelUI26);
        java.awt.Color color28 = bookingInformationPage23.getForeground();
        bookingInformationPage8.setBackground(color28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 0.5f + "'", float21 == 0.5f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color28);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        roomManagement.Room room4 = new roomManagement.Room("gui.BookingInformationPage[,0,0,0x0,invalid,layout=java.awt.GridBagLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", 10, "");
        roomMonitoring.Sensor sensor5 = new roomMonitoring.Sensor("", room4);
        sensor5.sendData(true);
        sensor5.detectMovement();
        sensor5.notifyObservers();
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.show(false);
        java.awt.Color color6 = bookingInformationPage1.getForeground();
        gui.AppFrame appFrame7 = null;
        gui.BookingInformationPage bookingInformationPage8 = new gui.BookingInformationPage(appFrame7);
        java.awt.Color color9 = null;
        bookingInformationPage8.setBackground(color9);
        bookingInformationPage8.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension13 = null;
        bookingInformationPage8.setPreferredSize(dimension13);
        int int15 = bookingInformationPage1.getComponentZOrder((java.awt.Component) bookingInformationPage8);
        java.awt.event.MouseListener mouseListener16 = null;
        bookingInformationPage8.addMouseListener(mouseListener16);
        bookingInformationPage8.resize(8, 8);
        float float21 = bookingInformationPage8.getAlignmentY();
        bookingInformationPage8.requestFocus();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 0.5f + "'", float21 == 0.5f);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.setSize((int) (byte) 100, (-1));
        javax.swing.JPopupMenu jPopupMenu7 = null;
        bookingInformationPage1.setComponentPopupMenu(jPopupMenu7);
        java.awt.event.ContainerListener[] containerListenerArray9 = bookingInformationPage1.getContainerListeners();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(containerListenerArray9);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        gui.AppFrame appFrame0 = null;
        gui.WelcomePage welcomePage1 = new gui.WelcomePage(appFrame0);
        gui.AppFrame appFrame2 = null;
        gui.BookingInformationPage bookingInformationPage3 = new gui.BookingInformationPage(appFrame2);
        java.awt.Color color4 = null;
        bookingInformationPage3.setBackground(color4);
        bookingInformationPage3.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension8 = null;
        bookingInformationPage3.setPreferredSize(dimension8);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray10 = bookingInformationPage3.getPropertyChangeListeners();
        bookingInformationPage3.enableInputMethods(false);
        int int13 = bookingInformationPage3.getY();
        // The following exception was thrown during execution in test generation
        try {
            welcomePage1.setComponentZOrder((java.awt.Component) bookingInformationPage3, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: illegal component position");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(propertyChangeListenerArray10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension6 = null;
        bookingInformationPage1.setPreferredSize(dimension6);
        bookingInformationPage1.paintImmediately((int) (byte) 10, 10, 7, 64);
        java.lang.String str13 = bookingInformationPage1.toString();
        java.awt.Rectangle rectangle14 = null;
        java.awt.Rectangle rectangle15 = bookingInformationPage1.getBounds(rectangle14);
        boolean boolean16 = bookingInformationPage1.getIgnoreRepaint();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "gui.BookingInformationPage[,0,0,0x0,invalid,layout=java.awt.GridBagLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]" + "'", str13.equals("gui.BookingInformationPage[,0,0,0x0,invalid,layout=java.awt.GridBagLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rectangle15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        gui.AppFrame appFrame0 = null;
        gui.RoomOptionsPage roomOptionsPage1 = new gui.RoomOptionsPage(appFrame0);
        gui.AppFrame appFrame2 = null;
        gui.BookingInformationPage bookingInformationPage3 = new gui.BookingInformationPage(appFrame2);
        java.awt.Color color4 = null;
        bookingInformationPage3.setBackground(color4);
        bookingInformationPage3.show(false);
        java.awt.LayoutManager layoutManager8 = bookingInformationPage3.getLayout();
        bookingInformationPage3.transferFocus();
        int int10 = roomOptionsPage1.getComponentZOrder((java.awt.Component) bookingInformationPage3);
        boolean boolean13 = roomOptionsPage1.contains(32, 10);
        java.awt.event.KeyListener[] keyListenerArray14 = roomOptionsPage1.getKeyListeners();
        roomOptionsPage1.firePropertyChange("ADMINISTRATOR OPTIONS", (short) -1, (short) 10);
        java.lang.String str19 = roomOptionsPage1.getUIClassID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyListenerArray14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "PanelUI" + "'", str19.equals("PanelUI"));
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        int int0 = java.awt.image.ImageObserver.PROPERTIES;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        dataManagement.MaintainUser maintainUser0 = new dataManagement.MaintainUser();
        userManagement.User user3 = maintainUser0.authenticate("", "PAYMENT");
        boolean boolean5 = maintainUser0.emailExists("LOGIN");
        maintainUser0.save("ADMINISTRATOR OPTIONS");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        payment.InstitutionsBilling institutionsBilling5 = new payment.InstitutionsBilling((double) (short) 1, "hi!", "PAYMENT", "PAYMENT", (int) '4');
        double double6 = institutionsBilling5.getFee();
        // The following exception was thrown during execution in test generation
        try {
            double double7 = institutionsBilling5.calculateCost();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 3.5d + "'", double6 == 3.5d);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.setSize((int) (byte) 100, (-1));
        java.awt.FocusTraversalPolicy focusTraversalPolicy7 = null;
        bookingInformationPage1.setFocusTraversalPolicy(focusTraversalPolicy7);
        javax.swing.TransferHandler transferHandler9 = null;
        bookingInformationPage1.setTransferHandler(transferHandler9);
        java.awt.event.MouseListener[] mouseListenerArray11 = bookingInformationPage1.getMouseListeners();
        java.awt.Event event12 = null;
        boolean boolean15 = bookingInformationPage1.mouseUp(event12, 10, 5);
        java.beans.VetoableChangeListener[] vetoableChangeListenerArray16 = bookingInformationPage1.getVetoableChangeListeners();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mouseListenerArray11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vetoableChangeListenerArray16);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        javax.swing.JPopupMenu jPopupMenu2 = bookingInformationPage1.getComponentPopupMenu();
        javax.accessibility.AccessibleContext accessibleContext3 = bookingInformationPage1.getAccessibleContext();
        float float4 = bookingInformationPage1.getAlignmentX();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(jPopupMenu2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(accessibleContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float4 + "' != '" + 0.5f + "'", float4 == 0.5f);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        bookingInformationPage1.repaint((int) (byte) 1, (int) (byte) 10, (int) '4', (int) (byte) 0);
        gui.AppFrame appFrame7 = null;
        gui.BookingInformationPage bookingInformationPage8 = new gui.BookingInformationPage(appFrame7);
        java.awt.Color color9 = null;
        bookingInformationPage8.setBackground(color9);
        bookingInformationPage8.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension13 = null;
        bookingInformationPage8.setPreferredSize(dimension13);
        java.awt.Event event15 = null;
        boolean boolean18 = bookingInformationPage8.mouseExit(event15, 10, (int) (byte) 10);
        java.lang.Object obj19 = bookingInformationPage1.getClientProperty((java.lang.Object) 10);
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        bookingInformationPage1.addPropertyChangeListener(propertyChangeListener20);
        bookingInformationPage1.setFocusCycleRoot(true);
        java.awt.Toolkit toolkit24 = bookingInformationPage1.getToolkit();
        java.io.PrintStream printStream25 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingInformationPage1.list(printStream25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintStream.println(Object)\" because \"out\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toolkit24);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        gui.AppFrame appFrame0 = gui.AppFrame.getInstance();
        gui.AppFrame appFrame1 = null;
        gui.BookingInformationPage bookingInformationPage2 = new gui.BookingInformationPage(appFrame1);
        java.awt.Color color3 = null;
        bookingInformationPage2.setBackground(color3);
        bookingInformationPage2.show(false);
        java.awt.LayoutManager layoutManager7 = bookingInformationPage2.getLayout();
        gui.AppFrame appFrame8 = null;
        gui.BookingInformationPage bookingInformationPage9 = new gui.BookingInformationPage(appFrame8);
        java.awt.Color color10 = null;
        bookingInformationPage9.setBackground(color10);
        bookingInformationPage9.show(false);
        java.awt.Color color14 = bookingInformationPage9.getForeground();
        bookingInformationPage2.setBackground(color14);
        appFrame0.setBackground(color14);
        boolean boolean17 = appFrame0.isFocused();
        java.awt.MenuBar menuBar18 = null;
        appFrame0.setMenuBar(menuBar18);
        // The following exception was thrown during execution in test generation
        try {
            gui.ExtendBookingPage.refreshBookings(appFrame0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"userManagement.User.getId()\" because the return value of \"gui.AppFrame.getCurrentUser()\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(appFrame0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension6 = null;
        bookingInformationPage1.setPreferredSize(dimension6);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray8 = bookingInformationPage1.getPropertyChangeListeners();
        bookingInformationPage1.enableInputMethods(false);
        java.awt.event.FocusListener[] focusListenerArray11 = bookingInformationPage1.getFocusListeners();
        bookingInformationPage1.enable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(propertyChangeListenerArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(focusListenerArray11);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        gui.AppFrame appFrame0 = gui.AppFrame.getInstance();
        gui.AppFrame appFrame1 = null;
        gui.BookingInformationPage bookingInformationPage2 = new gui.BookingInformationPage(appFrame1);
        java.awt.Color color3 = null;
        bookingInformationPage2.setBackground(color3);
        bookingInformationPage2.show(false);
        java.awt.LayoutManager layoutManager7 = bookingInformationPage2.getLayout();
        gui.AppFrame appFrame8 = null;
        gui.BookingInformationPage bookingInformationPage9 = new gui.BookingInformationPage(appFrame8);
        java.awt.Color color10 = null;
        bookingInformationPage9.setBackground(color10);
        bookingInformationPage9.show(false);
        java.awt.Color color14 = bookingInformationPage9.getForeground();
        bookingInformationPage2.setBackground(color14);
        appFrame0.setBackground(color14);
        javax.swing.JRootPane jRootPane17 = appFrame0.getRootPane();
        gui.AppFrame appFrame18 = null;
        gui.BookingInformationPage bookingInformationPage19 = new gui.BookingInformationPage(appFrame18);
        java.awt.Color color20 = null;
        bookingInformationPage19.setBackground(color20);
        bookingInformationPage19.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension24 = null;
        bookingInformationPage19.setPreferredSize(dimension24);
        gui.AppFrame appFrame26 = null;
        gui.BookingInformationPage bookingInformationPage27 = new gui.BookingInformationPage(appFrame26);
        java.awt.Color color28 = null;
        bookingInformationPage27.setBackground(color28);
        bookingInformationPage27.show(false);
        java.awt.LayoutManager layoutManager32 = bookingInformationPage27.getLayout();
        bookingInformationPage19.putClientProperty((java.lang.Object) layoutManager32, (java.lang.Object) 0);
        appFrame0.setLayout(layoutManager32);
        java.awt.Point point37 = appFrame0.getMousePosition(false);
        java.beans.PropertyChangeListener propertyChangeListener39 = null;
        appFrame0.addPropertyChangeListener("ROOM OPTIONS", propertyChangeListener39);
        java.awt.event.MouseMotionListener mouseMotionListener41 = null;
        appFrame0.addMouseMotionListener(mouseMotionListener41);
        javax.swing.JMenuBar jMenuBar43 = null;
        appFrame0.setJMenuBar(jMenuBar43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(appFrame0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jRootPane17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(point37);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        bookingManagment.BookingManager bookingManager0 = bookingManagment.BookingManager.getInstance();
        bookingManagment.Booking booking2 = bookingManager0.getBooking("hi!");
        java.util.Date date6 = null;
        bookingManagment.Booking booking12 = new bookingManagment.Booking("gui.BookingInformationPage[,0,0,0x0,invalid,layout=java.awt.GridBagLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", "BOOKING", "ADMINISTRATOR OPTIONS", date6, "Other", "ROOM OPTIONS", (double) 32, (double) 40, (double) 12);
        booking12.setEndTime("MANAGE ROOMS");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = bookingManager0.isRoomAvailableForExtension(booking12, "data/users.csv");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        roomStatus.EnabledState enabledState0 = new roomStatus.EnabledState();
        java.lang.String str1 = enabledState0.getStatus();
        roomManagement.Room room5 = new roomManagement.Room("gui.BookingInformationPage[,0,0,0x0,invalid,layout=java.awt.GridBagLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", 10, "");
        boolean boolean6 = enabledState0.maintenanceAndRepairsFinished(room5);
        boolean boolean7 = room5.closeRoom();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "ENABLED" + "'", str1.equals("ENABLED"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        int int0 = java.awt.Frame.MAXIMIZED_HORIZ;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        dataManagement.MaintainAdministrator maintainAdministrator0 = new dataManagement.MaintainAdministrator();
        maintainAdministrator0.save("MANAGE ROOMS");
        administratorManagement.Administrator administrator5 = maintainAdministrator0.authenticate("MANAGE ROOMS", "ToolTipText");
        administratorManagement.Administrator administrator8 = maintainAdministrator0.authenticate("", "SCAN BADGE");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(administrator5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(administrator8);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension6 = null;
        bookingInformationPage1.setPreferredSize(dimension6);
        bookingInformationPage1.paintImmediately((int) (byte) 10, 10, 7, 64);
        bookingInformationPage1.resize(1, (int) (byte) 100);
        javax.swing.KeyStroke keyStroke16 = null;
        java.awt.event.ActionListener actionListener17 = bookingInformationPage1.getActionForKeyStroke(keyStroke16);
        bookingInformationPage1.hide();
        java.awt.LayoutManager layoutManager19 = bookingInformationPage1.getLayout();
        int int20 = bookingInformationPage1.getHeight();
        java.awt.event.ActionListener actionListener21 = null;
        javax.swing.KeyStroke keyStroke23 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingInformationPage1.registerKeyboardAction(actionListener21, "ADMINISTRATOR OPTIONS", keyStroke23, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: condition must be one of JComponent.WHEN_IN_FOCUSED_WINDOW, JComponent.WHEN_FOCUSED or JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(actionListener17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 100 + "'", int20 == 100);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        dataManagement.MaintainUser maintainUser0 = new dataManagement.MaintainUser();
        userManagement.User user3 = maintainUser0.authenticate("gui.BookingInformationPage[,0,0,0x0,invalid,layout=java.awt.GridBagLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", "MANAGE ROOMS");
        userManagement.Staff staff9 = new userManagement.Staff("MANAGE ROOMS", "DASHBOARD", "MANAGE ROOMS", (int) (byte) 100, "PAYMENT");
        int int10 = staff9.getHourlyRate();
        staff9.setOrgIdOrStudentNumber("LOGIN");
        maintainUser0.addUser((userManagement.User) staff9);
        userManagement.Other other19 = new userManagement.Other("ROOM OPTIONS", "", "WELCOME", 32, "DASHBOARD");
        userManagement.Other other25 = new userManagement.Other("ROOM OPTIONS", "", "WELCOME", 32, "DASHBOARD");
        userManagement.Staff staff31 = new userManagement.Staff("LOGIN", "WELCOME", "hi!", (int) (short) 0, "ROOM OPTIONS");
        userManagement.Other other37 = new userManagement.Other("ROOM OPTIONS", "", "WELCOME", 32, "DASHBOARD");
        int int38 = other37.getHourlyRate();
        userManagement.Staff staff44 = new userManagement.Staff("MANAGE ROOMS", "DASHBOARD", "MANAGE ROOMS", (int) (byte) 100, "PAYMENT");
        userManagement.Staff staff50 = new userManagement.Staff("MANAGE ROOMS", "DASHBOARD", "MANAGE ROOMS", (int) (byte) 100, "PAYMENT");
        userManagement.Partner partner56 = new userManagement.Partner("LOGIN", "MANAGE ROOMS", "WELCOME", (int) (short) -1, "PAYMENT");
        partner56.setOrgIdOrStudentNumber("WELCOME");
        userManagement.User[] userArray59 = new userManagement.User[] { other19, other25, staff31, other37, staff44, staff50, partner56 };
        java.util.ArrayList<userManagement.User> userList60 = new java.util.ArrayList<userManagement.User>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<userManagement.User>) userList60, userArray59);
        maintainUser0.users = userList60;
        boolean boolean64 = maintainUser0.usernameExists("SCAN BADGE");
        maintainUser0.load("");
        boolean boolean68 = maintainUser0.emailExists("DASHBOARD");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 40 + "'", int10 == 40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 50 + "'", int38 == 50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        float float0 = java.awt.Component.BOTTOM_ALIGNMENT;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float0 + "' != '" + 1.0f + "'", float0 == 1.0f);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = bookingManagment.Booking.combineDateAndTime(date0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        userManagement.Other other0 = new userManagement.Other();
        int int1 = other0.getId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension6 = null;
        bookingInformationPage1.setPreferredSize(dimension6);
        bookingInformationPage1.firePropertyChange("hi!", false, true);
        javax.swing.JToolTip jToolTip12 = bookingInformationPage1.createToolTip();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jToolTip12);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.show(false);
        java.awt.Color color6 = bookingInformationPage1.getForeground();
        java.awt.FocusTraversalPolicy focusTraversalPolicy7 = null;
        bookingInformationPage1.setFocusTraversalPolicy(focusTraversalPolicy7);
        boolean boolean9 = bookingInformationPage1.isFocusTraversalPolicyProvider();
        bookingInformationPage1.setBounds(0, (-1), 10, 8);
        bookingInformationPage1.setFocusTraversalPolicyProvider(true);
        bookingInformationPage1.transferFocus();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        payment.DebitCardPayment debitCardPayment5 = new payment.DebitCardPayment((double) (-1L), "ROOM OPTIONS", "LOGIN", "PAYMENT", 1);
        gui.PaymentPage.paymentMethod((payment.Payment) debitCardPayment5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = debitCardPayment5.getStatus();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 12");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension6 = null;
        bookingInformationPage1.setPreferredSize(dimension6);
        java.awt.Graphics graphics8 = null;
        bookingInformationPage1.paintComponents(graphics8);
        boolean boolean10 = bookingInformationPage1.isMinimumSizeSet();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        gui.AppFrame appFrame0 = gui.AppFrame.getInstance();
        gui.AppFrame appFrame1 = null;
        gui.BookingInformationPage bookingInformationPage2 = new gui.BookingInformationPage(appFrame1);
        java.awt.Color color3 = null;
        bookingInformationPage2.setBackground(color3);
        bookingInformationPage2.show(false);
        java.awt.LayoutManager layoutManager7 = bookingInformationPage2.getLayout();
        gui.AppFrame appFrame8 = null;
        gui.BookingInformationPage bookingInformationPage9 = new gui.BookingInformationPage(appFrame8);
        java.awt.Color color10 = null;
        bookingInformationPage9.setBackground(color10);
        bookingInformationPage9.show(false);
        java.awt.Color color14 = bookingInformationPage9.getForeground();
        bookingInformationPage2.setBackground(color14);
        appFrame0.setBackground(color14);
        appFrame0.toFront();
        java.awt.event.WindowStateListener[] windowStateListenerArray18 = appFrame0.getWindowStateListeners();
        appFrame0.pack();
        java.awt.im.InputContext inputContext20 = appFrame0.getInputContext();
        appFrame0.setState(16);
        gui.AppFrame appFrame23 = null;
        gui.BookingInformationPage bookingInformationPage24 = new gui.BookingInformationPage(appFrame23);
        java.awt.Color color25 = null;
        bookingInformationPage24.setBackground(color25);
        java.awt.ComponentOrientation componentOrientation27 = null;
        bookingInformationPage24.setComponentOrientation(componentOrientation27);
        boolean boolean29 = appFrame0.isFocusCycleRoot((java.awt.Container) bookingInformationPage24);
        gui.AppFrame appFrame30 = null;
        gui.BookingInformationPage bookingInformationPage31 = new gui.BookingInformationPage(appFrame30);
        java.awt.Color color32 = null;
        bookingInformationPage31.setBackground(color32);
        bookingInformationPage31.show(false);
        java.awt.Color color36 = bookingInformationPage31.getForeground();
        bookingInformationPage31.setEnabled(false);
        java.awt.Dimension dimension39 = bookingInformationPage31.preferredSize();
        java.awt.Dimension dimension40 = bookingInformationPage31.getMinimumSize();
        java.awt.Dimension dimension41 = bookingInformationPage24.getSize(dimension40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(appFrame0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(windowStateListenerArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(inputContext20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dimension39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dimension40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dimension41);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension6 = null;
        bookingInformationPage1.setPreferredSize(dimension6);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray8 = bookingInformationPage1.getPropertyChangeListeners();
        bookingInformationPage1.enableInputMethods(false);
        gui.AppFrame appFrame11 = gui.AppFrame.getInstance();
        java.awt.event.WindowListener windowListener12 = null;
        appFrame11.addWindowListener(windowListener12);
        boolean boolean14 = appFrame11.isActive();
        int int15 = appFrame11.getExtendedState();
        appFrame11.setAutoRequestFocus(false);
        administratorManagement.Administrator administrator18 = appFrame11.getCurrentAdministrator();
        boolean boolean19 = bookingInformationPage1.isAncestorOf((java.awt.Component) appFrame11);
        java.awt.event.FocusEvent.Cause cause20 = null;
        boolean boolean21 = bookingInformationPage1.requestFocusInWindow(cause20);
        java.io.PrintStream printStream22 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingInformationPage1.list(printStream22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintStream.println(Object)\" because \"out\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(propertyChangeListenerArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(appFrame11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(administrator18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        gui.AppFrame appFrame4 = null;
        gui.BookingInformationPage bookingInformationPage5 = new gui.BookingInformationPage(appFrame4);
        java.awt.Color color6 = null;
        bookingInformationPage5.setBackground(color6);
        bookingInformationPage5.setVerifyInputWhenFocusTarget(true);
        java.awt.Insets insets10 = bookingInformationPage5.getInsets();
        java.awt.Dimension dimension11 = bookingInformationPage5.getPreferredSize();
        bookingInformationPage1.setMaximumSize(dimension11);
        javax.swing.TransferHandler transferHandler13 = bookingInformationPage1.getTransferHandler();
        bookingInformationPage1.repaint(16, (int) 'a', (int) 'a', (int) (short) -1);
        javax.swing.border.Border border19 = bookingInformationPage1.getBorder();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(insets10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dimension11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(transferHandler13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(border19);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.setFocusable(false);
        javax.swing.plaf.PanelUI panelUI6 = null;
        bookingInformationPage1.setUI(panelUI6);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        gui.AppFrame appFrame0 = gui.AppFrame.getInstance();
        gui.AppFrame appFrame1 = null;
        gui.BookingInformationPage bookingInformationPage2 = new gui.BookingInformationPage(appFrame1);
        java.awt.Color color3 = null;
        bookingInformationPage2.setBackground(color3);
        bookingInformationPage2.show(false);
        java.awt.LayoutManager layoutManager7 = bookingInformationPage2.getLayout();
        gui.AppFrame appFrame8 = null;
        gui.BookingInformationPage bookingInformationPage9 = new gui.BookingInformationPage(appFrame8);
        java.awt.Color color10 = null;
        bookingInformationPage9.setBackground(color10);
        bookingInformationPage9.show(false);
        java.awt.Color color14 = bookingInformationPage9.getForeground();
        bookingInformationPage2.setBackground(color14);
        appFrame0.setBackground(color14);
        javax.swing.JRootPane jRootPane17 = appFrame0.getRootPane();
        gui.AppFrame appFrame18 = null;
        gui.BookingInformationPage bookingInformationPage19 = new gui.BookingInformationPage(appFrame18);
        java.awt.Color color20 = null;
        bookingInformationPage19.setBackground(color20);
        bookingInformationPage19.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension24 = null;
        bookingInformationPage19.setPreferredSize(dimension24);
        gui.AppFrame appFrame26 = null;
        gui.BookingInformationPage bookingInformationPage27 = new gui.BookingInformationPage(appFrame26);
        java.awt.Color color28 = null;
        bookingInformationPage27.setBackground(color28);
        bookingInformationPage27.show(false);
        java.awt.LayoutManager layoutManager32 = bookingInformationPage27.getLayout();
        bookingInformationPage19.putClientProperty((java.lang.Object) layoutManager32, (java.lang.Object) 0);
        appFrame0.setLayout(layoutManager32);
        // The following exception was thrown during execution in test generation
        try {
            appFrame0.setOpacity((float) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The value of opacity should be in the range [0.0f .. 1.0f].");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(appFrame0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jRootPane17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager32);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        bookingInformationPage1.repaint((int) (byte) 1, (int) (byte) 10, (int) '4', (int) (byte) 0);
        gui.AppFrame appFrame7 = null;
        gui.BookingInformationPage bookingInformationPage8 = new gui.BookingInformationPage(appFrame7);
        java.awt.Color color9 = null;
        bookingInformationPage8.setBackground(color9);
        bookingInformationPage8.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension13 = null;
        bookingInformationPage8.setPreferredSize(dimension13);
        java.awt.Event event15 = null;
        boolean boolean18 = bookingInformationPage8.mouseExit(event15, 10, (int) (byte) 10);
        java.lang.Object obj19 = bookingInformationPage1.getClientProperty((java.lang.Object) 10);
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        bookingInformationPage1.addPropertyChangeListener(propertyChangeListener20);
        int int24 = bookingInformationPage1.getBaseline((int) (short) 10, 4);
        java.awt.Font font25 = null;
        bookingInformationPage1.setFont(font25);
        java.lang.String str27 = bookingInformationPage1.getToolTipText();
        java.awt.Event event28 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingInformationPage1.deliverEvent(event28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"x\" because \"e\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        gui.AppFrame appFrame0 = gui.AppFrame.getInstance();
        gui.AppFrame appFrame1 = null;
        gui.BookingInformationPage bookingInformationPage2 = new gui.BookingInformationPage(appFrame1);
        java.awt.Color color3 = null;
        bookingInformationPage2.setBackground(color3);
        bookingInformationPage2.show(false);
        java.awt.LayoutManager layoutManager7 = bookingInformationPage2.getLayout();
        gui.AppFrame appFrame8 = null;
        gui.BookingInformationPage bookingInformationPage9 = new gui.BookingInformationPage(appFrame8);
        java.awt.Color color10 = null;
        bookingInformationPage9.setBackground(color10);
        bookingInformationPage9.show(false);
        java.awt.Color color14 = bookingInformationPage9.getForeground();
        bookingInformationPage2.setBackground(color14);
        appFrame0.setBackground(color14);
        javax.swing.JRootPane jRootPane17 = appFrame0.getRootPane();
        gui.AppFrame appFrame18 = null;
        gui.BookingInformationPage bookingInformationPage19 = new gui.BookingInformationPage(appFrame18);
        java.awt.Color color20 = null;
        bookingInformationPage19.setBackground(color20);
        bookingInformationPage19.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension24 = null;
        bookingInformationPage19.setPreferredSize(dimension24);
        gui.AppFrame appFrame26 = null;
        gui.BookingInformationPage bookingInformationPage27 = new gui.BookingInformationPage(appFrame26);
        java.awt.Color color28 = null;
        bookingInformationPage27.setBackground(color28);
        bookingInformationPage27.show(false);
        java.awt.LayoutManager layoutManager32 = bookingInformationPage27.getLayout();
        bookingInformationPage19.putClientProperty((java.lang.Object) layoutManager32, (java.lang.Object) 0);
        appFrame0.setLayout(layoutManager32);
        java.awt.Point point37 = appFrame0.getMousePosition(false);
        java.beans.PropertyChangeListener propertyChangeListener39 = null;
        appFrame0.addPropertyChangeListener("ROOM OPTIONS", propertyChangeListener39);
        appFrame0.setCursor(8);
        java.io.PrintStream printStream43 = null;
        // The following exception was thrown during execution in test generation
        try {
            appFrame0.list(printStream43, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintStream.print(String)\" because \"out\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(appFrame0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jRootPane17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(point37);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        java.util.Locale locale0 = javax.swing.JComponent.getDefaultLocale();
        javax.swing.JComponent.setDefaultLocale(locale0);
        javax.swing.JComponent.setDefaultLocale(locale0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        gui.AppFrame appFrame0 = gui.AppFrame.getInstance();
        gui.AppFrame appFrame1 = null;
        gui.BookingInformationPage bookingInformationPage2 = new gui.BookingInformationPage(appFrame1);
        java.awt.Color color3 = null;
        bookingInformationPage2.setBackground(color3);
        bookingInformationPage2.show(false);
        java.awt.LayoutManager layoutManager7 = bookingInformationPage2.getLayout();
        gui.AppFrame appFrame8 = null;
        gui.BookingInformationPage bookingInformationPage9 = new gui.BookingInformationPage(appFrame8);
        java.awt.Color color10 = null;
        bookingInformationPage9.setBackground(color10);
        bookingInformationPage9.show(false);
        java.awt.Color color14 = bookingInformationPage9.getForeground();
        bookingInformationPage2.setBackground(color14);
        appFrame0.setBackground(color14);
        boolean boolean17 = appFrame0.isFocused();
        java.awt.MenuBar menuBar18 = null;
        appFrame0.setMenuBar(menuBar18);
        java.awt.Image image20 = appFrame0.getIconImage();
        gui.AppFrame appFrame21 = null;
        gui.BookingInformationPage bookingInformationPage22 = new gui.BookingInformationPage(appFrame21);
        java.awt.Color color23 = null;
        bookingInformationPage22.setBackground(color23);
        bookingInformationPage22.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension27 = null;
        bookingInformationPage22.setPreferredSize(dimension27);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray29 = bookingInformationPage22.getPropertyChangeListeners();
        bookingInformationPage22.show(false);
        java.awt.Event event32 = null;
        boolean boolean35 = bookingInformationPage22.mouseMove(event32, 1, (int) (short) 100);
        gui.AppFrame appFrame36 = null;
        gui.BookingInformationPage bookingInformationPage37 = new gui.BookingInformationPage(appFrame36);
        java.util.Locale locale38 = null;
        bookingInformationPage37.setLocale(locale38);
        java.awt.Dimension dimension40 = bookingInformationPage37.minimumSize();
        bookingInformationPage22.setMinimumSize(dimension40);
        appFrame0.setSize(dimension40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(appFrame0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(image20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(propertyChangeListenerArray29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dimension40);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.show(false);
        java.awt.LayoutManager layoutManager6 = bookingInformationPage1.getLayout();
        bookingInformationPage1.transferFocus();
        boolean boolean8 = bookingInformationPage1.isOpaque();
        boolean boolean9 = javax.swing.JComponent.isLightweightComponent((java.awt.Component) bookingInformationPage1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        gui.AppFrame appFrame0 = gui.AppFrame.getInstance();
        gui.AppFrame appFrame1 = null;
        gui.BookingInformationPage bookingInformationPage2 = new gui.BookingInformationPage(appFrame1);
        java.awt.Color color3 = null;
        bookingInformationPage2.setBackground(color3);
        bookingInformationPage2.show(false);
        java.awt.LayoutManager layoutManager7 = bookingInformationPage2.getLayout();
        gui.AppFrame appFrame8 = null;
        gui.BookingInformationPage bookingInformationPage9 = new gui.BookingInformationPage(appFrame8);
        java.awt.Color color10 = null;
        bookingInformationPage9.setBackground(color10);
        bookingInformationPage9.show(false);
        java.awt.Color color14 = bookingInformationPage9.getForeground();
        bookingInformationPage2.setBackground(color14);
        appFrame0.setBackground(color14);
        boolean boolean17 = appFrame0.isFocused();
        java.awt.MenuBar menuBar18 = null;
        appFrame0.setMenuBar(menuBar18);
        java.awt.Dialog.ModalExclusionType modalExclusionType20 = appFrame0.getModalExclusionType();
        appFrame0.validate();
        appFrame0.setLocationByPlatform(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(appFrame0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + modalExclusionType20 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'", modalExclusionType20.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.setSize((int) (byte) 100, (-1));
        bookingInformationPage1.setAutoscrolls(false);
        gui.AppFrame appFrame9 = null;
        gui.BookingInformationPage bookingInformationPage10 = new gui.BookingInformationPage(appFrame9);
        java.awt.Color color11 = null;
        bookingInformationPage10.setBackground(color11);
        bookingInformationPage10.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension15 = null;
        bookingInformationPage10.setPreferredSize(dimension15);
        java.awt.Event event17 = null;
        boolean boolean20 = bookingInformationPage10.mouseExit(event17, 10, (int) (byte) 10);
        java.awt.event.KeyListener[] keyListenerArray21 = bookingInformationPage10.getKeyListeners();
        java.awt.Image image22 = null;
        gui.AppFrame appFrame23 = null;
        gui.BookingInformationPage bookingInformationPage24 = new gui.BookingInformationPage(appFrame23);
        int int25 = bookingInformationPage10.checkImage(image22, (java.awt.image.ImageObserver) bookingInformationPage24);
        javax.swing.JPopupMenu jPopupMenu26 = bookingInformationPage24.getComponentPopupMenu();
        bookingInformationPage1.setNextFocusableComponent((java.awt.Component) jPopupMenu26);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.awt.AWTKeyStroke> aWTKeyStrokeSet29 = jPopupMenu26.getFocusTraversalKeys((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyListenerArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 32 + "'", int25 == 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(jPopupMenu26);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension6 = null;
        bookingInformationPage1.setPreferredSize(dimension6);
        java.awt.Event event8 = null;
        boolean boolean11 = bookingInformationPage1.mouseExit(event8, 10, (int) (byte) 10);
        java.awt.event.KeyListener[] keyListenerArray12 = bookingInformationPage1.getKeyListeners();
        java.awt.Image image13 = null;
        gui.AppFrame appFrame14 = null;
        gui.BookingInformationPage bookingInformationPage15 = new gui.BookingInformationPage(appFrame14);
        int int16 = bookingInformationPage1.checkImage(image13, (java.awt.image.ImageObserver) bookingInformationPage15);
        int int17 = bookingInformationPage1.getX();
        boolean boolean18 = bookingInformationPage1.requestFocusInWindow();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyListenerArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        dataManagement.MaintainAdministrator maintainAdministrator0 = new dataManagement.MaintainAdministrator();
        boolean boolean2 = maintainAdministrator0.usernameExists("DASHBOARD");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension6 = null;
        bookingInformationPage1.setPreferredSize(dimension6);
        bookingInformationPage1.paintImmediately((int) (byte) 10, 10, 7, 64);
        java.awt.event.InputMethodListener inputMethodListener13 = null;
        bookingInformationPage1.removeInputMethodListener(inputMethodListener13);
        int int15 = bookingInformationPage1.getHeight();
        bookingInformationPage1.hide();
        java.awt.dnd.DropTarget dropTarget17 = null;
        bookingInformationPage1.setDropTarget(dropTarget17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension6 = null;
        bookingInformationPage1.setPreferredSize(dimension6);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray8 = bookingInformationPage1.getPropertyChangeListeners();
        bookingInformationPage1.show(false);
        java.awt.Event event11 = null;
        boolean boolean13 = bookingInformationPage1.gotFocus(event11, (java.lang.Object) (byte) 10);
        boolean boolean14 = bookingInformationPage1.isDoubleBuffered();
        bookingInformationPage1.addNotify();
        java.awt.Dimension dimension16 = bookingInformationPage1.getMinimumSize();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(propertyChangeListenerArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dimension16);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        gui.AppFrame appFrame0 = gui.AppFrame.getInstance();
        gui.AppFrame appFrame1 = null;
        gui.BookingInformationPage bookingInformationPage2 = new gui.BookingInformationPage(appFrame1);
        java.awt.Color color3 = null;
        bookingInformationPage2.setBackground(color3);
        bookingInformationPage2.show(false);
        java.awt.LayoutManager layoutManager7 = bookingInformationPage2.getLayout();
        gui.AppFrame appFrame8 = null;
        gui.BookingInformationPage bookingInformationPage9 = new gui.BookingInformationPage(appFrame8);
        java.awt.Color color10 = null;
        bookingInformationPage9.setBackground(color10);
        bookingInformationPage9.show(false);
        java.awt.Color color14 = bookingInformationPage9.getForeground();
        bookingInformationPage2.setBackground(color14);
        appFrame0.setBackground(color14);
        boolean boolean17 = appFrame0.isFocused();
        java.awt.MenuComponent menuComponent18 = null;
        appFrame0.remove(menuComponent18);
        int int20 = appFrame0.getComponentCount();
        dataManagement.MaintainAdministrator maintainAdministrator21 = appFrame0.getMaintainAdministrator();
        // The following exception was thrown during execution in test generation
        try {
            gui.ExtendBookingPage.refreshBookings(appFrame0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"userManagement.User.getId()\" because the return value of \"gui.AppFrame.getCurrentUser()\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(appFrame0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(maintainAdministrator21);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        gui.AppFrame appFrame0 = gui.AppFrame.getInstance();
        gui.AppFrame appFrame1 = null;
        gui.BookingInformationPage bookingInformationPage2 = new gui.BookingInformationPage(appFrame1);
        java.awt.Color color3 = null;
        bookingInformationPage2.setBackground(color3);
        bookingInformationPage2.show(false);
        java.awt.LayoutManager layoutManager7 = bookingInformationPage2.getLayout();
        gui.AppFrame appFrame8 = null;
        gui.BookingInformationPage bookingInformationPage9 = new gui.BookingInformationPage(appFrame8);
        java.awt.Color color10 = null;
        bookingInformationPage9.setBackground(color10);
        bookingInformationPage9.show(false);
        java.awt.Color color14 = bookingInformationPage9.getForeground();
        bookingInformationPage2.setBackground(color14);
        appFrame0.setBackground(color14);
        boolean boolean17 = appFrame0.isFocused();
        java.awt.MenuComponent menuComponent18 = null;
        appFrame0.remove(menuComponent18);
        gui.SignUpPage signUpPage20 = new gui.SignUpPage(appFrame0);
        java.awt.MenuBar menuBar21 = null;
        appFrame0.setMenuBar(menuBar21);
        boolean boolean23 = appFrame0.isAlwaysOnTopSupported();
        appFrame0.validate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(appFrame0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.show(false);
        java.awt.Color color6 = bookingInformationPage1.getForeground();
        bookingInformationPage1.removeNotify();
        java.awt.Event event8 = null;
        boolean boolean10 = bookingInformationPage1.gotFocus(event8, (java.lang.Object) false);
        java.awt.LayoutManager layoutManager11 = bookingInformationPage1.getLayout();
        gui.AppFrame appFrame12 = gui.AppFrame.getInstance();
        gui.AppFrame appFrame13 = null;
        gui.BookingInformationPage bookingInformationPage14 = new gui.BookingInformationPage(appFrame13);
        java.awt.Color color15 = null;
        bookingInformationPage14.setBackground(color15);
        bookingInformationPage14.show(false);
        java.awt.LayoutManager layoutManager19 = bookingInformationPage14.getLayout();
        gui.AppFrame appFrame20 = null;
        gui.BookingInformationPage bookingInformationPage21 = new gui.BookingInformationPage(appFrame20);
        java.awt.Color color22 = null;
        bookingInformationPage21.setBackground(color22);
        bookingInformationPage21.show(false);
        java.awt.Color color26 = bookingInformationPage21.getForeground();
        bookingInformationPage14.setBackground(color26);
        appFrame12.setBackground(color26);
        boolean boolean29 = appFrame12.isFocused();
        java.awt.MenuComponent menuComponent30 = null;
        appFrame12.remove(menuComponent30);
        gui.SignUpPage signUpPage32 = new gui.SignUpPage(appFrame12);
        boolean boolean33 = appFrame12.isValidateRoot();
        java.awt.Graphics graphics34 = appFrame12.getGraphics();
        bookingInformationPage1.printAll(graphics34);
        gui.AppFrame appFrame36 = null;
        gui.BookingInformationPage bookingInformationPage37 = new gui.BookingInformationPage(appFrame36);
        java.awt.Color color38 = null;
        bookingInformationPage37.setBackground(color38);
        bookingInformationPage37.show(false);
        java.awt.Color color42 = bookingInformationPage37.getForeground();
        bookingInformationPage37.removeNotify();
        java.awt.Event event44 = null;
        boolean boolean46 = bookingInformationPage37.gotFocus(event44, (java.lang.Object) false);
        java.awt.LayoutManager layoutManager47 = bookingInformationPage37.getLayout();
        gui.AppFrame appFrame48 = gui.AppFrame.getInstance();
        gui.AppFrame appFrame49 = null;
        gui.BookingInformationPage bookingInformationPage50 = new gui.BookingInformationPage(appFrame49);
        java.awt.Color color51 = null;
        bookingInformationPage50.setBackground(color51);
        bookingInformationPage50.show(false);
        java.awt.LayoutManager layoutManager55 = bookingInformationPage50.getLayout();
        gui.AppFrame appFrame56 = null;
        gui.BookingInformationPage bookingInformationPage57 = new gui.BookingInformationPage(appFrame56);
        java.awt.Color color58 = null;
        bookingInformationPage57.setBackground(color58);
        bookingInformationPage57.show(false);
        java.awt.Color color62 = bookingInformationPage57.getForeground();
        bookingInformationPage50.setBackground(color62);
        appFrame48.setBackground(color62);
        boolean boolean65 = appFrame48.isFocused();
        java.awt.MenuComponent menuComponent66 = null;
        appFrame48.remove(menuComponent66);
        gui.SignUpPage signUpPage68 = new gui.SignUpPage(appFrame48);
        boolean boolean69 = appFrame48.isValidateRoot();
        java.awt.Graphics graphics70 = appFrame48.getGraphics();
        bookingInformationPage37.printAll(graphics70);
        bookingInformationPage1.paintComponents(graphics70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(appFrame12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphics34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(appFrame48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphics70);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        gui.AppFrame appFrame0 = gui.AppFrame.getInstance();
        gui.AppFrame appFrame1 = null;
        gui.BookingInformationPage bookingInformationPage2 = new gui.BookingInformationPage(appFrame1);
        java.awt.Color color3 = null;
        bookingInformationPage2.setBackground(color3);
        bookingInformationPage2.show(false);
        java.awt.LayoutManager layoutManager7 = bookingInformationPage2.getLayout();
        gui.AppFrame appFrame8 = null;
        gui.BookingInformationPage bookingInformationPage9 = new gui.BookingInformationPage(appFrame8);
        java.awt.Color color10 = null;
        bookingInformationPage9.setBackground(color10);
        bookingInformationPage9.show(false);
        java.awt.Color color14 = bookingInformationPage9.getForeground();
        bookingInformationPage2.setBackground(color14);
        appFrame0.setBackground(color14);
        java.awt.event.WindowListener windowListener17 = null;
        appFrame0.addWindowListener(windowListener17);
        java.awt.event.WindowStateListener windowStateListener19 = null;
        appFrame0.removeWindowStateListener(windowStateListener19);
        // The following exception was thrown during execution in test generation
        try {
            gui.ExtendBookingPage.refreshBookings(appFrame0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"userManagement.User.getId()\" because the return value of \"gui.AppFrame.getCurrentUser()\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(appFrame0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color14);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        gui.AppFrame appFrame0 = gui.AppFrame.getInstance();
        java.awt.event.WindowListener windowListener1 = null;
        appFrame0.addWindowListener(windowListener1);
        boolean boolean3 = appFrame0.isActive();
        int int4 = appFrame0.getExtendedState();
        appFrame0.setAutoRequestFocus(false);
        administratorManagement.Administrator administrator7 = appFrame0.getCurrentAdministrator();
        java.awt.LayoutManager layoutManager8 = appFrame0.getLayout();
        // The following exception was thrown during execution in test generation
        try {
            appFrame0.setUndecorated(false);
            org.junit.Assert.fail("Expected exception of type java.awt.IllegalComponentStateException; message: The frame is displayable.");
        } catch (java.awt.IllegalComponentStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(appFrame0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(administrator7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager8);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension6 = null;
        bookingInformationPage1.setPreferredSize(dimension6);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray8 = bookingInformationPage1.getPropertyChangeListeners();
        boolean boolean9 = bookingInformationPage1.isOpaque();
        bookingInformationPage1.setFocusTraversalKeysEnabled(false);
        java.lang.String str12 = bookingInformationPage1.getUIClassID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(propertyChangeListenerArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "PanelUI" + "'", str12.equals("PanelUI"));
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        bookingInformationPage1.repaint((int) (byte) 1, (int) (byte) 10, (int) '4', (int) (byte) 0);
        javax.swing.plaf.PanelUI panelUI7 = bookingInformationPage1.getUI();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(panelUI7);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        int int0 = java.awt.image.ImageObserver.HEIGHT;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.show(false);
        java.awt.Color color6 = bookingInformationPage1.getForeground();
        java.awt.FocusTraversalPolicy focusTraversalPolicy7 = null;
        bookingInformationPage1.setFocusTraversalPolicy(focusTraversalPolicy7);
        java.awt.Component component9 = bookingInformationPage1.getNextFocusableComponent();
        java.awt.Graphics graphics10 = null;
        bookingInformationPage1.print(graphics10);
        bookingInformationPage1.show();
        boolean boolean13 = bookingInformationPage1.isFocusTraversalPolicySet();
        java.awt.Font font14 = null;
        bookingInformationPage1.setFont(font14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.show(false);
        java.awt.LayoutManager layoutManager6 = bookingInformationPage1.getLayout();
        java.awt.Insets insets7 = bookingInformationPage1.getInsets();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(insets7);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        roomManagement.Room room3 = new roomManagement.Room("ToolTipText", (int) (byte) -1, "BOOKING");
        boolean boolean4 = room3.closeRoom();
        room3.setUser("Faculty");
        int int7 = room3.getRoomCapacity();
        boolean boolean8 = room3.isOccupied();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        userManagement.Faculty faculty0 = new userManagement.Faculty();
        java.lang.String str1 = faculty0.getUserType();
        faculty0.setEmail("LOGIN");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Faculty" + "'", str1.equals("Faculty"));
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.setSize((int) (byte) 100, (-1));
        bookingInformationPage1.requestFocus();
        bookingInformationPage1.firePropertyChange("", 1L, (long) 20);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.setSize((int) (byte) 100, (-1));
        java.awt.FocusTraversalPolicy focusTraversalPolicy7 = null;
        bookingInformationPage1.setFocusTraversalPolicy(focusTraversalPolicy7);
        java.awt.event.ContainerListener containerListener9 = null;
        bookingInformationPage1.addContainerListener(containerListener9);
        gui.AppFrame appFrame11 = null;
        gui.BookingInformationPage bookingInformationPage12 = new gui.BookingInformationPage(appFrame11);
        java.awt.Color color13 = null;
        bookingInformationPage12.setBackground(color13);
        bookingInformationPage12.show(false);
        java.awt.Color color17 = bookingInformationPage12.getForeground();
        bookingInformationPage12.removeNotify();
        java.awt.Event event19 = null;
        boolean boolean21 = bookingInformationPage12.gotFocus(event19, (java.lang.Object) false);
        java.awt.LayoutManager layoutManager22 = bookingInformationPage12.getLayout();
        gui.AppFrame appFrame23 = gui.AppFrame.getInstance();
        gui.AppFrame appFrame24 = null;
        gui.BookingInformationPage bookingInformationPage25 = new gui.BookingInformationPage(appFrame24);
        java.awt.Color color26 = null;
        bookingInformationPage25.setBackground(color26);
        bookingInformationPage25.show(false);
        java.awt.LayoutManager layoutManager30 = bookingInformationPage25.getLayout();
        gui.AppFrame appFrame31 = null;
        gui.BookingInformationPage bookingInformationPage32 = new gui.BookingInformationPage(appFrame31);
        java.awt.Color color33 = null;
        bookingInformationPage32.setBackground(color33);
        bookingInformationPage32.show(false);
        java.awt.Color color37 = bookingInformationPage32.getForeground();
        bookingInformationPage25.setBackground(color37);
        appFrame23.setBackground(color37);
        boolean boolean40 = appFrame23.isFocused();
        java.awt.MenuComponent menuComponent41 = null;
        appFrame23.remove(menuComponent41);
        gui.SignUpPage signUpPage43 = new gui.SignUpPage(appFrame23);
        boolean boolean44 = appFrame23.isValidateRoot();
        java.awt.Graphics graphics45 = appFrame23.getGraphics();
        bookingInformationPage12.printAll(graphics45);
        bookingInformationPage1.print(graphics45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(appFrame23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphics45);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension6 = null;
        bookingInformationPage1.setPreferredSize(dimension6);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray8 = bookingInformationPage1.getPropertyChangeListeners();
        boolean boolean9 = bookingInformationPage1.isOpaque();
        java.beans.VetoableChangeListener vetoableChangeListener10 = null;
        bookingInformationPage1.removeVetoableChangeListener(vetoableChangeListener10);
        java.awt.Event event12 = null;
        gui.AppFrame appFrame13 = null;
        gui.BookingInformationPage bookingInformationPage14 = new gui.BookingInformationPage(appFrame13);
        java.util.Locale locale15 = null;
        bookingInformationPage14.setLocale(locale15);
        boolean boolean17 = bookingInformationPage1.gotFocus(event12, (java.lang.Object) bookingInformationPage14);
        javax.accessibility.AccessibleContext accessibleContext18 = bookingInformationPage1.getAccessibleContext();
        java.awt.event.InputMethodListener inputMethodListener19 = null;
        bookingInformationPage1.removeInputMethodListener(inputMethodListener19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(propertyChangeListenerArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(accessibleContext18);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        bookingInformationPage1.repaint((int) (byte) 1, (int) (byte) 10, (int) '4', (int) (byte) 0);
        gui.AppFrame appFrame7 = null;
        gui.BookingInformationPage bookingInformationPage8 = new gui.BookingInformationPage(appFrame7);
        java.awt.Color color9 = null;
        bookingInformationPage8.setBackground(color9);
        bookingInformationPage8.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension13 = null;
        bookingInformationPage8.setPreferredSize(dimension13);
        java.awt.Event event15 = null;
        boolean boolean18 = bookingInformationPage8.mouseExit(event15, 10, (int) (byte) 10);
        java.lang.Object obj19 = bookingInformationPage1.getClientProperty((java.lang.Object) 10);
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        bookingInformationPage1.addPropertyChangeListener(propertyChangeListener20);
        bookingInformationPage1.setFocusCycleRoot(true);
        bookingInformationPage1.repaint((int) 'a', 100, 64, (int) '4');
        boolean boolean29 = bookingInformationPage1.isVisible();
        java.awt.Graphics graphics30 = null;
        bookingInformationPage1.printAll(graphics30);
        java.awt.Container container32 = bookingInformationPage1.getTopLevelAncestor();
        bookingInformationPage1.resize(5, 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(container32);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.setSize((int) (byte) 100, (-1));
        bookingInformationPage1.doLayout();
        java.awt.event.MouseMotionListener mouseMotionListener8 = null;
        bookingInformationPage1.removeMouseMotionListener(mouseMotionListener8);
        bookingInformationPage1.firePropertyChange("", (double) 1.0f, (double) 32);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        roomManagement.Room room4 = new roomManagement.Room("gui.BookingInformationPage[,0,0,0x0,invalid,layout=java.awt.GridBagLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", 10, "");
        roomMonitoring.Sensor sensor5 = new roomMonitoring.Sensor("", room4);
        java.lang.String str6 = sensor5.getSensorID();
        roomMonitoring.RoomObserver roomObserver7 = null;
        sensor5.removeObserver(roomObserver7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension6 = null;
        bookingInformationPage1.setPreferredSize(dimension6);
        bookingInformationPage1.paintImmediately((int) (byte) 10, 10, 7, 64);
        bookingInformationPage1.resize(1, (int) (byte) 100);
        javax.swing.KeyStroke keyStroke16 = null;
        java.awt.event.ActionListener actionListener17 = bookingInformationPage1.getActionForKeyStroke(keyStroke16);
        bookingInformationPage1.hide();
        boolean boolean19 = bookingInformationPage1.isManagingFocus();
        bookingInformationPage1.firePropertyChange("CREATE ROOM", (int) (short) 100, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(actionListener17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension6 = null;
        bookingInformationPage1.setPreferredSize(dimension6);
        java.awt.Event event8 = null;
        boolean boolean11 = bookingInformationPage1.mouseExit(event8, 10, (int) (byte) 10);
        java.awt.event.KeyListener[] keyListenerArray12 = bookingInformationPage1.getKeyListeners();
        gui.AppFrame appFrame13 = null;
        gui.WelcomePage welcomePage14 = new gui.WelcomePage(appFrame13);
        gui.AppFrame appFrame15 = null;
        gui.BookingInformationPage bookingInformationPage16 = new gui.BookingInformationPage(appFrame15);
        java.awt.Color color17 = null;
        bookingInformationPage16.setBackground(color17);
        bookingInformationPage16.show(false);
        java.awt.LayoutManager layoutManager21 = bookingInformationPage16.getLayout();
        java.awt.Point point22 = null;
        java.awt.Point point23 = bookingInformationPage16.getLocation(point22);
        boolean boolean24 = welcomePage14.contains(point23);
        bookingInformationPage1.setLocation(point23);
        bookingInformationPage1.repaint(0L, 7, (-1), 50, 12);
        javax.swing.JPopupMenu jPopupMenu32 = bookingInformationPage1.getComponentPopupMenu();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyListenerArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(point23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(jPopupMenu32);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        administratorManagement.Administrator administrator5 = new administratorManagement.Administrator("LOGIN", "EXTEND BOOKING", "BOOKING", (int) '4', false);
        boolean boolean6 = administrator5.isChiefEventCoordinator();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension6 = null;
        bookingInformationPage1.setPreferredSize(dimension6);
        bookingInformationPage1.paintImmediately((int) (byte) 10, 10, 7, 64);
        java.lang.String str13 = bookingInformationPage1.toString();
        boolean boolean14 = bookingInformationPage1.getAutoscrolls();
        java.awt.Dimension dimension15 = bookingInformationPage1.getSize();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "gui.BookingInformationPage[,0,0,0x0,invalid,layout=java.awt.GridBagLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]" + "'", str13.equals("gui.BookingInformationPage[,0,0,0x0,invalid,layout=java.awt.GridBagLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dimension15);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension6 = null;
        bookingInformationPage1.setPreferredSize(dimension6);
        java.awt.Event event8 = null;
        boolean boolean11 = bookingInformationPage1.mouseExit(event8, 10, (int) (byte) 10);
        java.awt.event.KeyListener[] keyListenerArray12 = bookingInformationPage1.getKeyListeners();
        gui.AppFrame appFrame13 = null;
        gui.WelcomePage welcomePage14 = new gui.WelcomePage(appFrame13);
        gui.AppFrame appFrame15 = null;
        gui.BookingInformationPage bookingInformationPage16 = new gui.BookingInformationPage(appFrame15);
        java.awt.Color color17 = null;
        bookingInformationPage16.setBackground(color17);
        bookingInformationPage16.show(false);
        java.awt.LayoutManager layoutManager21 = bookingInformationPage16.getLayout();
        java.awt.Point point22 = null;
        java.awt.Point point23 = bookingInformationPage16.getLocation(point22);
        boolean boolean24 = welcomePage14.contains(point23);
        bookingInformationPage1.setLocation(point23);
        bookingInformationPage1.repaint(0L, 7, (-1), 50, 12);
        bookingInformationPage1.setAlignmentX((float) 7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyListenerArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(point23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.setSize((int) (byte) 100, (-1));
        java.awt.FocusTraversalPolicy focusTraversalPolicy7 = null;
        bookingInformationPage1.setFocusTraversalPolicy(focusTraversalPolicy7);
        javax.swing.TransferHandler transferHandler9 = null;
        bookingInformationPage1.setTransferHandler(transferHandler9);
        java.awt.event.MouseListener[] mouseListenerArray11 = bookingInformationPage1.getMouseListeners();
        int int12 = bookingInformationPage1.getWidth();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mouseListenerArray11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        bookingManagment.BookingManager bookingManager0 = bookingManagment.BookingManager.getInstance();
        bookingManagment.Booking booking2 = bookingManager0.getBooking("hi!");
        bookingManagment.Booking booking4 = bookingManager0.getBooking("DASHBOARD");
        bookingManager0.cancelBooking("");
        java.util.List<bookingManagment.Booking> bookingList8 = bookingManager0.getBookingsForUser("EXTEND BOOKING");
        java.util.Date date12 = null;
        bookingManagment.Booking booking18 = new bookingManagment.Booking("hi!", "ROOM OPTIONS", "ROOM OPTIONS", date12, "ROOM OPTIONS", "gui.BookingInformationPage[,0,0,0x0,invalid,layout=java.awt.GridBagLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", (double) (-1), (double) (short) -1, (double) (-1));
        java.lang.String str19 = booking18.getUserID();
        java.lang.String str20 = booking18.getStartTime();
        double double21 = booking18.getTotalCost();
        java.lang.String str22 = booking18.getEndTime();
        booking18.setEndTime("EXTEND BOOKING");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = bookingManager0.isRoomAvailableForExtension(booking18, "gui.BookingInformationPage[,0,0,0x0,invalid,layout=java.awt.GridBagLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "ROOM OPTIONS" + "'", str20.equals("ROOM OPTIONS"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "gui.BookingInformationPage[,0,0,0x0,invalid,layout=java.awt.GridBagLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]" + "'", str22.equals("gui.BookingInformationPage[,0,0,0x0,invalid,layout=java.awt.GridBagLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]"));
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        int int0 = javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        gui.AppFrame appFrame0 = gui.AppFrame.getInstance();
        gui.AppFrame appFrame1 = null;
        gui.BookingInformationPage bookingInformationPage2 = new gui.BookingInformationPage(appFrame1);
        java.awt.Color color3 = null;
        bookingInformationPage2.setBackground(color3);
        bookingInformationPage2.show(false);
        java.awt.LayoutManager layoutManager7 = bookingInformationPage2.getLayout();
        gui.AppFrame appFrame8 = null;
        gui.BookingInformationPage bookingInformationPage9 = new gui.BookingInformationPage(appFrame8);
        java.awt.Color color10 = null;
        bookingInformationPage9.setBackground(color10);
        bookingInformationPage9.show(false);
        java.awt.Color color14 = bookingInformationPage9.getForeground();
        bookingInformationPage2.setBackground(color14);
        appFrame0.setBackground(color14);
        appFrame0.toFront();
        javax.swing.TransferHandler transferHandler18 = appFrame0.getTransferHandler();
        gui.ChiefEventCoordinatorPage chiefEventCoordinatorPage19 = new gui.ChiefEventCoordinatorPage(appFrame0);
        java.awt.Image image20 = null;
        gui.AppFrame appFrame23 = null;
        gui.BookingInformationPage bookingInformationPage24 = new gui.BookingInformationPage(appFrame23);
        java.awt.Color color25 = null;
        bookingInformationPage24.setBackground(color25);
        bookingInformationPage24.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension29 = null;
        bookingInformationPage24.setPreferredSize(dimension29);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray31 = bookingInformationPage24.getPropertyChangeListeners();
        bookingInformationPage24.enableInputMethods(false);
        int int34 = bookingInformationPage24.getY();
        boolean boolean35 = appFrame0.prepareImage(image20, 1, 40, (java.awt.image.ImageObserver) bookingInformationPage24);
        gui.AppFrame appFrame36 = null;
        gui.BookingInformationPage bookingInformationPage37 = new gui.BookingInformationPage(appFrame36);
        java.awt.Color color38 = null;
        bookingInformationPage37.setBackground(color38);
        javax.swing.plaf.PanelUI panelUI40 = null;
        bookingInformationPage37.setUI(panelUI40);
        java.awt.event.FocusListener[] focusListenerArray42 = bookingInformationPage37.getFocusListeners();
        java.awt.Font font43 = null;
        bookingInformationPage37.setFont(font43);
        gui.AppFrame appFrame45 = null;
        gui.BookingInformationPage bookingInformationPage46 = new gui.BookingInformationPage(appFrame45);
        java.awt.Color color47 = null;
        bookingInformationPage46.setBackground(color47);
        bookingInformationPage46.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension51 = null;
        bookingInformationPage46.setPreferredSize(dimension51);
        bookingInformationPage46.firePropertyChange("hi!", false, true);
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior57 = bookingInformationPage46.getBaselineResizeBehavior();
        gui.AppFrame appFrame58 = null;
        gui.BookingInformationPage bookingInformationPage59 = new gui.BookingInformationPage(appFrame58);
        java.awt.Color color60 = null;
        bookingInformationPage59.setBackground(color60);
        bookingInformationPage59.show(false);
        java.awt.Color color64 = bookingInformationPage59.getForeground();
        bookingInformationPage59.removeNotify();
        java.awt.Event event66 = null;
        boolean boolean68 = bookingInformationPage59.gotFocus(event66, (java.lang.Object) false);
        java.awt.LayoutManager layoutManager69 = bookingInformationPage59.getLayout();
        gui.AppFrame appFrame70 = gui.AppFrame.getInstance();
        gui.AppFrame appFrame71 = null;
        gui.BookingInformationPage bookingInformationPage72 = new gui.BookingInformationPage(appFrame71);
        java.awt.Color color73 = null;
        bookingInformationPage72.setBackground(color73);
        bookingInformationPage72.show(false);
        java.awt.LayoutManager layoutManager77 = bookingInformationPage72.getLayout();
        gui.AppFrame appFrame78 = null;
        gui.BookingInformationPage bookingInformationPage79 = new gui.BookingInformationPage(appFrame78);
        java.awt.Color color80 = null;
        bookingInformationPage79.setBackground(color80);
        bookingInformationPage79.show(false);
        java.awt.Color color84 = bookingInformationPage79.getForeground();
        bookingInformationPage72.setBackground(color84);
        appFrame70.setBackground(color84);
        boolean boolean87 = appFrame70.isFocused();
        java.awt.MenuComponent menuComponent88 = null;
        appFrame70.remove(menuComponent88);
        gui.SignUpPage signUpPage90 = new gui.SignUpPage(appFrame70);
        boolean boolean91 = appFrame70.isValidateRoot();
        java.awt.Graphics graphics92 = appFrame70.getGraphics();
        bookingInformationPage59.printAll(graphics92);
        bookingInformationPage46.paintAll(graphics92);
        bookingInformationPage37.print(graphics92);
        appFrame0.update(graphics92);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(appFrame0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(transferHandler18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(propertyChangeListenerArray31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(focusListenerArray42);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior57 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior57.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(appFrame70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager77);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color84);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphics92);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        gui.AppFrame appFrame0 = gui.AppFrame.getInstance();
        gui.AppFrame appFrame1 = null;
        gui.BookingInformationPage bookingInformationPage2 = new gui.BookingInformationPage(appFrame1);
        java.awt.Color color3 = null;
        bookingInformationPage2.setBackground(color3);
        bookingInformationPage2.show(false);
        java.awt.LayoutManager layoutManager7 = bookingInformationPage2.getLayout();
        gui.AppFrame appFrame8 = null;
        gui.BookingInformationPage bookingInformationPage9 = new gui.BookingInformationPage(appFrame8);
        java.awt.Color color10 = null;
        bookingInformationPage9.setBackground(color10);
        bookingInformationPage9.show(false);
        java.awt.Color color14 = bookingInformationPage9.getForeground();
        bookingInformationPage2.setBackground(color14);
        appFrame0.setBackground(color14);
        javax.swing.JRootPane jRootPane17 = appFrame0.getRootPane();
        gui.AppFrame appFrame18 = null;
        gui.BookingInformationPage bookingInformationPage19 = new gui.BookingInformationPage(appFrame18);
        java.awt.Color color20 = null;
        bookingInformationPage19.setBackground(color20);
        bookingInformationPage19.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension24 = null;
        bookingInformationPage19.setPreferredSize(dimension24);
        gui.AppFrame appFrame26 = null;
        gui.BookingInformationPage bookingInformationPage27 = new gui.BookingInformationPage(appFrame26);
        java.awt.Color color28 = null;
        bookingInformationPage27.setBackground(color28);
        bookingInformationPage27.show(false);
        java.awt.LayoutManager layoutManager32 = bookingInformationPage27.getLayout();
        bookingInformationPage19.putClientProperty((java.lang.Object) layoutManager32, (java.lang.Object) 0);
        appFrame0.setLayout(layoutManager32);
        java.awt.Point point37 = appFrame0.getMousePosition(false);
        userManagement.User user38 = appFrame0.getCurrentUser();
        appFrame0.createBufferStrategy((int) (short) 100);
        appFrame0.setSize((int) (byte) 100, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(appFrame0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jRootPane17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(point37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user38);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        gui.AppFrame appFrame0 = null;
        gui.RoomOptionsPage roomOptionsPage1 = new gui.RoomOptionsPage(appFrame0);
        gui.AppFrame appFrame2 = null;
        gui.BookingInformationPage bookingInformationPage3 = new gui.BookingInformationPage(appFrame2);
        java.awt.Color color4 = null;
        bookingInformationPage3.setBackground(color4);
        bookingInformationPage3.show(false);
        java.awt.LayoutManager layoutManager8 = bookingInformationPage3.getLayout();
        bookingInformationPage3.transferFocus();
        int int10 = roomOptionsPage1.getComponentZOrder((java.awt.Component) bookingInformationPage3);
        boolean boolean13 = roomOptionsPage1.contains(32, 10);
        java.awt.event.KeyListener[] keyListenerArray14 = roomOptionsPage1.getKeyListeners();
        gui.AppFrame appFrame15 = null;
        gui.BookingInformationPage bookingInformationPage16 = new gui.BookingInformationPage(appFrame15);
        java.awt.Color color17 = null;
        bookingInformationPage16.setBackground(color17);
        bookingInformationPage16.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension21 = null;
        bookingInformationPage16.setPreferredSize(dimension21);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray23 = bookingInformationPage16.getPropertyChangeListeners();
        bookingInformationPage16.show(false);
        roomOptionsPage1.putClientProperty((java.lang.Object) bookingInformationPage16, (java.lang.Object) "CLOSED");
        java.awt.Component component28 = roomOptionsPage1.getNextFocusableComponent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyListenerArray14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(propertyChangeListenerArray23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component28);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        dataManagement.MaintainUser maintainUser0 = new dataManagement.MaintainUser();
        userManagement.User user3 = maintainUser0.authenticate("gui.BookingInformationPage[,0,0,0x0,invalid,layout=java.awt.GridBagLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", "MANAGE ROOMS");
        userManagement.Staff staff9 = new userManagement.Staff("MANAGE ROOMS", "DASHBOARD", "MANAGE ROOMS", (int) (byte) 100, "PAYMENT");
        int int10 = staff9.getHourlyRate();
        staff9.setOrgIdOrStudentNumber("LOGIN");
        maintainUser0.addUser((userManagement.User) staff9);
        userManagement.Staff staff14 = new userManagement.Staff();
        maintainUser0.addUser((userManagement.User) staff14);
        maintainUser0.path = "USER OPTIONS";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 40 + "'", int10 == 40);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        java.util.Date date3 = null;
        bookingManagment.Booking booking9 = new bookingManagment.Booking("hi!", "ROOM OPTIONS", "ROOM OPTIONS", date3, "ROOM OPTIONS", "gui.BookingInformationPage[,0,0,0x0,invalid,layout=java.awt.GridBagLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", (double) (-1), (double) (short) -1, (double) (-1));
        java.lang.String str10 = booking9.getUserID();
        java.lang.String str11 = booking9.getStartTime();
        java.lang.String str12 = booking9.getRoomID();
        double double13 = booking9.getTotalCost();
        booking9.setEndTime("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "ROOM OPTIONS" + "'", str11.equals("ROOM OPTIONS"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "ROOM OPTIONS" + "'", str12.equals("ROOM OPTIONS"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        userManagement.Staff staff5 = new userManagement.Staff("ROOM OPTIONS", "SCAN BADGE", "WELCOME", 9, "BOOKING");
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        roomManagement.Room room4 = new roomManagement.Room("gui.BookingInformationPage[,0,0,0x0,invalid,layout=java.awt.GridBagLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", 10, "");
        roomMonitoring.Sensor sensor5 = new roomMonitoring.Sensor("", room4);
        sensor5.sendData(true);
        boolean boolean8 = sensor5.detectOccupancy();
        sensor5.detectMovement();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension6 = null;
        bookingInformationPage1.setPreferredSize(dimension6);
        java.awt.Event event8 = null;
        boolean boolean11 = bookingInformationPage1.mouseExit(event8, 10, (int) (byte) 10);
        java.awt.event.KeyListener[] keyListenerArray12 = bookingInformationPage1.getKeyListeners();
        java.awt.event.FocusListener focusListener13 = null;
        bookingInformationPage1.removeFocusListener(focusListener13);
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior15 = bookingInformationPage1.getBaselineResizeBehavior();
        gui.AppFrame appFrame16 = null;
        gui.BookingInformationPage bookingInformationPage17 = new gui.BookingInformationPage(appFrame16);
        java.awt.Color color18 = null;
        bookingInformationPage17.setBackground(color18);
        bookingInformationPage17.setVerifyInputWhenFocusTarget(true);
        java.awt.Insets insets22 = bookingInformationPage17.getInsets();
        java.util.Date date26 = null;
        bookingManagment.Booking booking32 = new bookingManagment.Booking("gui.BookingInformationPage[,0,0,0x0,invalid,layout=java.awt.GridBagLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", "BOOKING", "ADMINISTRATOR OPTIONS", date26, "Other", "ROOM OPTIONS", (double) 32, (double) 40, (double) 12);
        booking32.setEndTime("MANAGE ROOMS");
        bookingInformationPage1.putClientProperty((java.lang.Object) insets22, (java.lang.Object) "MANAGE ROOMS");
        boolean boolean37 = bookingInformationPage1.requestFocus(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyListenerArray12);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior15 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior15.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(insets22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        gui.AppFrame appFrame0 = gui.AppFrame.getInstance();
        gui.AppFrame appFrame1 = null;
        gui.BookingInformationPage bookingInformationPage2 = new gui.BookingInformationPage(appFrame1);
        java.awt.Color color3 = null;
        bookingInformationPage2.setBackground(color3);
        bookingInformationPage2.show(false);
        java.awt.LayoutManager layoutManager7 = bookingInformationPage2.getLayout();
        gui.AppFrame appFrame8 = null;
        gui.BookingInformationPage bookingInformationPage9 = new gui.BookingInformationPage(appFrame8);
        java.awt.Color color10 = null;
        bookingInformationPage9.setBackground(color10);
        bookingInformationPage9.show(false);
        java.awt.Color color14 = bookingInformationPage9.getForeground();
        bookingInformationPage2.setBackground(color14);
        appFrame0.setBackground(color14);
        appFrame0.toFront();
        javax.swing.TransferHandler transferHandler18 = appFrame0.getTransferHandler();
        gui.AppFrame appFrame19 = null;
        gui.BookingInformationPage bookingInformationPage20 = new gui.BookingInformationPage(appFrame19);
        java.awt.Color color21 = null;
        bookingInformationPage20.setBackground(color21);
        bookingInformationPage20.show(false);
        java.awt.Color color25 = bookingInformationPage20.getForeground();
        appFrame0.setBackground(color25);
        java.awt.Component component27 = appFrame0.getFocusOwner();
        javax.swing.JMenuBar jMenuBar28 = appFrame0.getJMenuBar();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(appFrame0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(transferHandler18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(component27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(jMenuBar28);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension6 = null;
        bookingInformationPage1.setPreferredSize(dimension6);
        java.awt.Graphics graphics8 = null;
        bookingInformationPage1.paintComponents(graphics8);
        java.awt.event.ComponentListener[] componentListenerArray10 = bookingInformationPage1.getComponentListeners();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(componentListenerArray10);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        payment.DebitCardPayment debitCardPayment5 = new payment.DebitCardPayment((double) (-1L), "ROOM OPTIONS", "LOGIN", "PAYMENT", 1);
        gui.PaymentPage.paymentMethod((payment.Payment) debitCardPayment5);
        double double7 = debitCardPayment5.calculateDeposit();
        payment.Context context8 = new payment.Context((payment.Payment) debitCardPayment5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = debitCardPayment5.getStatus();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 12");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.5d + "'", double7 == 1.5d);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        gui.AppFrame appFrame0 = gui.AppFrame.getInstance();
        int int1 = appFrame0.getExtendedState();
        java.awt.Event event2 = null;
        boolean boolean4 = appFrame0.keyUp(event2, (int) (byte) 10);
        int int5 = appFrame0.getExtendedState();
        javax.swing.JPanel jPanel6 = null;
        // The following exception was thrown during execution in test generation
        try {
            appFrame0.clearAllFields(jPanel6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"javax.swing.JPanel.getComponents()\" because \"panel\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(appFrame0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        gui.AppFrame appFrame0 = gui.AppFrame.getInstance();
        gui.AppFrame appFrame1 = null;
        gui.BookingInformationPage bookingInformationPage2 = new gui.BookingInformationPage(appFrame1);
        java.awt.Color color3 = null;
        bookingInformationPage2.setBackground(color3);
        bookingInformationPage2.show(false);
        java.awt.LayoutManager layoutManager7 = bookingInformationPage2.getLayout();
        gui.AppFrame appFrame8 = null;
        gui.BookingInformationPage bookingInformationPage9 = new gui.BookingInformationPage(appFrame8);
        java.awt.Color color10 = null;
        bookingInformationPage9.setBackground(color10);
        bookingInformationPage9.show(false);
        java.awt.Color color14 = bookingInformationPage9.getForeground();
        bookingInformationPage2.setBackground(color14);
        appFrame0.setBackground(color14);
        boolean boolean17 = appFrame0.isFocused();
        java.awt.MenuComponent menuComponent18 = null;
        appFrame0.remove(menuComponent18);
        gui.SignUpPage signUpPage20 = new gui.SignUpPage(appFrame0);
        boolean boolean21 = appFrame0.isValidateRoot();
        java.awt.Graphics graphics22 = appFrame0.getGraphics();
        float float23 = appFrame0.getAlignmentY();
        java.awt.Font font24 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.awt.FontMetrics fontMetrics25 = appFrame0.getFontMetrics(font24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.hashCode()\" because \"key\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(appFrame0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphics22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 0.5f + "'", float23 == 0.5f);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.show(false);
        java.awt.Color color6 = bookingInformationPage1.getForeground();
        java.awt.FocusTraversalPolicy focusTraversalPolicy7 = null;
        bookingInformationPage1.setFocusTraversalPolicy(focusTraversalPolicy7);
        java.awt.Component component9 = bookingInformationPage1.getNextFocusableComponent();
        gui.AppFrame appFrame10 = null;
        gui.BookingInformationPage bookingInformationPage11 = new gui.BookingInformationPage(appFrame10);
        java.awt.Color color12 = null;
        bookingInformationPage11.setBackground(color12);
        bookingInformationPage11.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension16 = null;
        bookingInformationPage11.setPreferredSize(dimension16);
        java.awt.Event event18 = null;
        boolean boolean21 = bookingInformationPage11.mouseExit(event18, 10, (int) (byte) 10);
        java.awt.event.KeyListener[] keyListenerArray22 = bookingInformationPage11.getKeyListeners();
        gui.AppFrame appFrame23 = null;
        gui.WelcomePage welcomePage24 = new gui.WelcomePage(appFrame23);
        gui.AppFrame appFrame25 = null;
        gui.BookingInformationPage bookingInformationPage26 = new gui.BookingInformationPage(appFrame25);
        java.awt.Color color27 = null;
        bookingInformationPage26.setBackground(color27);
        bookingInformationPage26.show(false);
        java.awt.LayoutManager layoutManager31 = bookingInformationPage26.getLayout();
        java.awt.Point point32 = null;
        java.awt.Point point33 = bookingInformationPage26.getLocation(point32);
        boolean boolean34 = welcomePage24.contains(point33);
        bookingInformationPage11.setLocation(point33);
        boolean boolean36 = bookingInformationPage1.contains(point33);
        java.awt.Component[] componentArray37 = bookingInformationPage1.getComponents();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyListenerArray22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(point33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(componentArray37);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension6 = null;
        bookingInformationPage1.setPreferredSize(dimension6);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray8 = bookingInformationPage1.getPropertyChangeListeners();
        bookingInformationPage1.enableInputMethods(false);
        boolean boolean11 = bookingInformationPage1.isLightweight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(propertyChangeListenerArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        javax.swing.JPopupMenu jPopupMenu2 = bookingInformationPage1.getComponentPopupMenu();
        javax.accessibility.AccessibleContext accessibleContext3 = bookingInformationPage1.getAccessibleContext();
        bookingInformationPage1.repaint();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(jPopupMenu2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(accessibleContext3);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension6 = null;
        bookingInformationPage1.setPreferredSize(dimension6);
        java.awt.Event event8 = null;
        boolean boolean11 = bookingInformationPage1.mouseExit(event8, 10, (int) (byte) 10);
        bookingInformationPage1.repaint((int) (short) 10, (-1), 40, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension6 = null;
        bookingInformationPage1.setPreferredSize(dimension6);
        bookingInformationPage1.paintImmediately((int) (byte) 10, 10, 7, 64);
        bookingInformationPage1.resize(1, (int) (byte) 100);
        javax.swing.KeyStroke keyStroke16 = null;
        java.awt.event.ActionListener actionListener17 = bookingInformationPage1.getActionForKeyStroke(keyStroke16);
        bookingInformationPage1.hide();
        boolean boolean19 = bookingInformationPage1.isManagingFocus();
        java.awt.event.MouseEvent mouseEvent20 = null;
        java.awt.Point point21 = bookingInformationPage1.getToolTipLocation(mouseEvent20);
        javax.accessibility.AccessibleContext accessibleContext22 = bookingInformationPage1.getAccessibleContext();
        java.awt.event.HierarchyListener hierarchyListener23 = null;
        bookingInformationPage1.removeHierarchyListener(hierarchyListener23);
        java.beans.PropertyChangeListener propertyChangeListener26 = null;
        bookingInformationPage1.addPropertyChangeListener("ADMINISTRATOR OPTIONS", propertyChangeListener26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(actionListener17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(point21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(accessibleContext22);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        gui.AppFrame appFrame0 = null;
        gui.RoomOptionsPage roomOptionsPage1 = new gui.RoomOptionsPage(appFrame0);
        gui.AppFrame appFrame2 = null;
        gui.BookingInformationPage bookingInformationPage3 = new gui.BookingInformationPage(appFrame2);
        java.awt.Color color4 = null;
        bookingInformationPage3.setBackground(color4);
        bookingInformationPage3.show(false);
        java.awt.LayoutManager layoutManager8 = bookingInformationPage3.getLayout();
        bookingInformationPage3.transferFocus();
        int int10 = roomOptionsPage1.getComponentZOrder((java.awt.Component) bookingInformationPage3);
        boolean boolean13 = roomOptionsPage1.contains(32, 10);
        java.awt.event.KeyListener[] keyListenerArray14 = roomOptionsPage1.getKeyListeners();
        boolean boolean15 = roomOptionsPage1.isLightweight();
        // The following exception was thrown during execution in test generation
        try {
            int int18 = roomOptionsPage1.getBaseline((int) (byte) 10, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Width and height must be >= 0");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyListenerArray14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension6 = null;
        bookingInformationPage1.setPreferredSize(dimension6);
        gui.AppFrame appFrame8 = null;
        gui.BookingInformationPage bookingInformationPage9 = new gui.BookingInformationPage(appFrame8);
        java.awt.Color color10 = null;
        bookingInformationPage9.setBackground(color10);
        bookingInformationPage9.show(false);
        java.awt.LayoutManager layoutManager14 = bookingInformationPage9.getLayout();
        bookingInformationPage1.putClientProperty((java.lang.Object) layoutManager14, (java.lang.Object) 0);
        java.awt.Dimension dimension17 = bookingInformationPage1.getSize();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dimension17);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        bookingInformationPage1.repaint((int) (byte) 1, (int) (byte) 10, (int) '4', (int) (byte) 0);
        gui.AppFrame appFrame7 = null;
        gui.BookingInformationPage bookingInformationPage8 = new gui.BookingInformationPage(appFrame7);
        java.awt.Color color9 = null;
        bookingInformationPage8.setBackground(color9);
        bookingInformationPage8.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension13 = null;
        bookingInformationPage8.setPreferredSize(dimension13);
        java.awt.Event event15 = null;
        boolean boolean18 = bookingInformationPage8.mouseExit(event15, 10, (int) (byte) 10);
        java.lang.Object obj19 = bookingInformationPage1.getClientProperty((java.lang.Object) 10);
        java.awt.event.InputMethodListener inputMethodListener20 = null;
        bookingInformationPage1.addInputMethodListener(inputMethodListener20);
        int int22 = bookingInformationPage1.getY();
        int int23 = bookingInformationPage1.getX();
        int int26 = bookingInformationPage1.getBaseline((int) (byte) 1, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.show(false);
        java.awt.LayoutManager layoutManager6 = bookingInformationPage1.getLayout();
        java.awt.Image image7 = null;
        gui.AppFrame appFrame10 = null;
        gui.BookingInformationPage bookingInformationPage11 = new gui.BookingInformationPage(appFrame10);
        javax.swing.JPopupMenu jPopupMenu12 = bookingInformationPage11.getComponentPopupMenu();
        javax.accessibility.AccessibleContext accessibleContext13 = bookingInformationPage11.getAccessibleContext();
        boolean boolean14 = bookingInformationPage1.prepareImage(image7, 40, 100, (java.awt.image.ImageObserver) bookingInformationPage11);
        java.awt.Dimension dimension15 = bookingInformationPage1.getMinimumSize();
        boolean boolean16 = bookingInformationPage1.getInheritsPopupMenu();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(jPopupMenu12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(accessibleContext13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dimension15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.util.Locale locale2 = null;
        bookingInformationPage1.setLocale(locale2);
        java.awt.Event event4 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingInformationPage1.deliverEvent(event4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"x\" because \"e\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        gui.AppFrame appFrame0 = null;
        gui.RoomOptionsPage roomOptionsPage1 = new gui.RoomOptionsPage(appFrame0);
        gui.AppFrame appFrame2 = null;
        gui.BookingInformationPage bookingInformationPage3 = new gui.BookingInformationPage(appFrame2);
        java.awt.Color color4 = null;
        bookingInformationPage3.setBackground(color4);
        bookingInformationPage3.show(false);
        java.awt.LayoutManager layoutManager8 = bookingInformationPage3.getLayout();
        bookingInformationPage3.transferFocus();
        int int10 = roomOptionsPage1.getComponentZOrder((java.awt.Component) bookingInformationPage3);
        roomOptionsPage1.reshape((-1), 32, (-1), (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<java.awt.AWTKeyStroke> aWTKeyStrokeSet17 = roomOptionsPage1.getFocusTraversalKeys(16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid focus traversal key identifier");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        gui.AppFrame appFrame0 = gui.AppFrame.getInstance();
        gui.AppFrame appFrame1 = null;
        gui.BookingInformationPage bookingInformationPage2 = new gui.BookingInformationPage(appFrame1);
        java.awt.Color color3 = null;
        bookingInformationPage2.setBackground(color3);
        bookingInformationPage2.show(false);
        java.awt.LayoutManager layoutManager7 = bookingInformationPage2.getLayout();
        gui.AppFrame appFrame8 = null;
        gui.BookingInformationPage bookingInformationPage9 = new gui.BookingInformationPage(appFrame8);
        java.awt.Color color10 = null;
        bookingInformationPage9.setBackground(color10);
        bookingInformationPage9.show(false);
        java.awt.Color color14 = bookingInformationPage9.getForeground();
        bookingInformationPage2.setBackground(color14);
        appFrame0.setBackground(color14);
        boolean boolean17 = appFrame0.isFocused();
        java.awt.MenuBar menuBar18 = null;
        appFrame0.setMenuBar(menuBar18);
        appFrame0.setLocation(50, (int) (byte) 100);
        gui.ScanBadgePage scanBadgePage23 = new gui.ScanBadgePage(appFrame0);
        scanBadgePage23.setBounds(101, 64, 20, 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(appFrame0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        java.lang.String str0 = gui.AppFrame.CARD_PAYMENT_PLAN;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "PAYMENT PLAN" + "'", str0.equals("PAYMENT PLAN"));
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        boolean boolean4 = bookingInformationPage1.isFocusTraversable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.show(false);
        java.awt.LayoutManager layoutManager6 = bookingInformationPage1.getLayout();
        java.awt.Point point7 = null;
        java.awt.Point point8 = bookingInformationPage1.getLocation(point7);
        java.awt.Event event9 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = bookingInformationPage1.postEvent(event9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"id\" because \"evt\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(point8);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        bookingInformationPage1.list();
        java.awt.event.KeyListener[] keyListenerArray3 = bookingInformationPage1.getKeyListeners();
        gui.AppFrame appFrame4 = null;
        gui.BookingInformationPage bookingInformationPage5 = new gui.BookingInformationPage(appFrame4);
        java.awt.Color color6 = null;
        bookingInformationPage5.setBackground(color6);
        bookingInformationPage5.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension10 = null;
        bookingInformationPage5.setPreferredSize(dimension10);
        gui.AppFrame appFrame12 = null;
        gui.BookingInformationPage bookingInformationPage13 = new gui.BookingInformationPage(appFrame12);
        java.awt.Color color14 = null;
        bookingInformationPage13.setBackground(color14);
        bookingInformationPage13.show(false);
        java.awt.LayoutManager layoutManager18 = bookingInformationPage13.getLayout();
        bookingInformationPage5.putClientProperty((java.lang.Object) layoutManager18, (java.lang.Object) 0);
        bookingInformationPage1.setLayout(layoutManager18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyListenerArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager18);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        roomStatus.ClosedState closedState0 = new roomStatus.ClosedState();
        roomManagement.Room room4 = new roomManagement.Room("ToolTipText", (int) (byte) -1, "BOOKING");
        boolean boolean5 = closedState0.closeRoom(room4);
        int int6 = room4.getRoomCapacity();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension6 = null;
        bookingInformationPage1.setPreferredSize(dimension6);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray8 = bookingInformationPage1.getPropertyChangeListeners();
        bookingInformationPage1.enableInputMethods(false);
        gui.AppFrame appFrame11 = null;
        gui.BookingInformationPage bookingInformationPage12 = new gui.BookingInformationPage(appFrame11);
        java.awt.Color color13 = null;
        bookingInformationPage12.setBackground(color13);
        bookingInformationPage12.setSize((int) (byte) 100, (-1));
        bookingInformationPage12.doLayout();
        java.awt.event.MouseMotionListener mouseMotionListener19 = null;
        bookingInformationPage12.removeMouseMotionListener(mouseMotionListener19);
        bookingInformationPage1.setComponentZOrder((java.awt.Component) bookingInformationPage12, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(propertyChangeListenerArray8);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        gui.AppFrame appFrame0 = gui.AppFrame.getInstance();
        gui.AppFrame appFrame1 = null;
        gui.BookingInformationPage bookingInformationPage2 = new gui.BookingInformationPage(appFrame1);
        java.awt.Color color3 = null;
        bookingInformationPage2.setBackground(color3);
        bookingInformationPage2.show(false);
        java.awt.LayoutManager layoutManager7 = bookingInformationPage2.getLayout();
        gui.AppFrame appFrame8 = null;
        gui.BookingInformationPage bookingInformationPage9 = new gui.BookingInformationPage(appFrame8);
        java.awt.Color color10 = null;
        bookingInformationPage9.setBackground(color10);
        bookingInformationPage9.show(false);
        java.awt.Color color14 = bookingInformationPage9.getForeground();
        bookingInformationPage2.setBackground(color14);
        appFrame0.setBackground(color14);
        boolean boolean17 = appFrame0.isFocused();
        java.awt.MenuBar menuBar18 = null;
        appFrame0.setMenuBar(menuBar18);
        gui.WelcomePage welcomePage20 = new gui.WelcomePage(appFrame0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(appFrame0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        gui.AppFrame appFrame0 = gui.AppFrame.getInstance();
        int int1 = appFrame0.getExtendedState();
        appFrame0.setLocationByPlatform(false);
        boolean boolean4 = appFrame0.isLocationByPlatform();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(appFrame0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        gui.AppFrame appFrame0 = gui.AppFrame.getInstance();
        gui.AppFrame appFrame1 = null;
        gui.BookingInformationPage bookingInformationPage2 = new gui.BookingInformationPage(appFrame1);
        java.awt.Color color3 = null;
        bookingInformationPage2.setBackground(color3);
        bookingInformationPage2.show(false);
        java.awt.LayoutManager layoutManager7 = bookingInformationPage2.getLayout();
        gui.AppFrame appFrame8 = null;
        gui.BookingInformationPage bookingInformationPage9 = new gui.BookingInformationPage(appFrame8);
        java.awt.Color color10 = null;
        bookingInformationPage9.setBackground(color10);
        bookingInformationPage9.show(false);
        java.awt.Color color14 = bookingInformationPage9.getForeground();
        bookingInformationPage2.setBackground(color14);
        appFrame0.setBackground(color14);
        appFrame0.toFront();
        javax.swing.TransferHandler transferHandler18 = appFrame0.getTransferHandler();
        gui.ChiefEventCoordinatorPage chiefEventCoordinatorPage19 = new gui.ChiefEventCoordinatorPage(appFrame0);
        java.awt.Image image20 = null;
        gui.AppFrame appFrame23 = null;
        gui.BookingInformationPage bookingInformationPage24 = new gui.BookingInformationPage(appFrame23);
        java.awt.Color color25 = null;
        bookingInformationPage24.setBackground(color25);
        bookingInformationPage24.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension29 = null;
        bookingInformationPage24.setPreferredSize(dimension29);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray31 = bookingInformationPage24.getPropertyChangeListeners();
        bookingInformationPage24.enableInputMethods(false);
        int int34 = bookingInformationPage24.getY();
        boolean boolean35 = appFrame0.prepareImage(image20, 1, 40, (java.awt.image.ImageObserver) bookingInformationPage24);
        java.awt.AWTEvent aWTEvent36 = null;
        // The following exception was thrown during execution in test generation
        try {
            appFrame0.dispatchEvent(aWTEvent36);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.AWTEvent.getID()\" because \"e\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(appFrame0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(transferHandler18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(propertyChangeListenerArray31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension6 = null;
        bookingInformationPage1.setPreferredSize(dimension6);
        java.awt.Event event8 = null;
        boolean boolean11 = bookingInformationPage1.mouseExit(event8, 10, (int) (byte) 10);
        java.awt.event.KeyListener[] keyListenerArray12 = bookingInformationPage1.getKeyListeners();
        java.awt.Image image13 = null;
        gui.AppFrame appFrame14 = null;
        gui.BookingInformationPage bookingInformationPage15 = new gui.BookingInformationPage(appFrame14);
        int int16 = bookingInformationPage1.checkImage(image13, (java.awt.image.ImageObserver) bookingInformationPage15);
        gui.AppFrame appFrame17 = null;
        gui.BookingInformationPage bookingInformationPage18 = new gui.BookingInformationPage(appFrame17);
        java.awt.Color color19 = null;
        bookingInformationPage18.setBackground(color19);
        bookingInformationPage18.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension23 = null;
        bookingInformationPage18.setPreferredSize(dimension23);
        bookingInformationPage18.paintImmediately((int) (byte) 10, 10, 7, 64);
        java.lang.String str30 = bookingInformationPage18.toString();
        java.awt.Rectangle rectangle31 = null;
        java.awt.Rectangle rectangle32 = bookingInformationPage18.getBounds(rectangle31);
        java.awt.Rectangle rectangle33 = bookingInformationPage15.getBounds(rectangle31);
        java.beans.PropertyChangeListener propertyChangeListener35 = null;
        bookingInformationPage15.removePropertyChangeListener("CLOSED", propertyChangeListener35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyListenerArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "gui.BookingInformationPage[,0,0,0x0,invalid,layout=java.awt.GridBagLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]" + "'", str30.equals("gui.BookingInformationPage[,0,0,0x0,invalid,layout=java.awt.GridBagLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rectangle32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rectangle33);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        int int0 = java.awt.image.ImageObserver.ABORT;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 128 + "'", int0 == 128);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        gui.AppFrame appFrame0 = gui.AppFrame.getInstance();
        gui.AppFrame appFrame1 = null;
        gui.BookingInformationPage bookingInformationPage2 = new gui.BookingInformationPage(appFrame1);
        java.awt.Color color3 = null;
        bookingInformationPage2.setBackground(color3);
        bookingInformationPage2.show(false);
        java.awt.LayoutManager layoutManager7 = bookingInformationPage2.getLayout();
        gui.AppFrame appFrame8 = null;
        gui.BookingInformationPage bookingInformationPage9 = new gui.BookingInformationPage(appFrame8);
        java.awt.Color color10 = null;
        bookingInformationPage9.setBackground(color10);
        bookingInformationPage9.show(false);
        java.awt.Color color14 = bookingInformationPage9.getForeground();
        bookingInformationPage2.setBackground(color14);
        appFrame0.setBackground(color14);
        appFrame0.toFront();
        javax.swing.TransferHandler transferHandler18 = appFrame0.getTransferHandler();
        gui.AppFrame appFrame19 = null;
        gui.BookingInformationPage bookingInformationPage20 = new gui.BookingInformationPage(appFrame19);
        java.awt.Color color21 = null;
        bookingInformationPage20.setBackground(color21);
        bookingInformationPage20.show(false);
        java.awt.Color color25 = bookingInformationPage20.getForeground();
        appFrame0.setBackground(color25);
        java.awt.Image image27 = null;
        appFrame0.setIconImage(image27);
        java.awt.Window.Type type29 = appFrame0.getType();
        gui.PaymentPage paymentPage30 = new gui.PaymentPage(appFrame0);
        gui.AppFrame appFrame31 = gui.AppFrame.getInstance();
        gui.AppFrame appFrame32 = null;
        gui.BookingInformationPage bookingInformationPage33 = new gui.BookingInformationPage(appFrame32);
        java.awt.Color color34 = null;
        bookingInformationPage33.setBackground(color34);
        bookingInformationPage33.show(false);
        java.awt.LayoutManager layoutManager38 = bookingInformationPage33.getLayout();
        gui.AppFrame appFrame39 = null;
        gui.BookingInformationPage bookingInformationPage40 = new gui.BookingInformationPage(appFrame39);
        java.awt.Color color41 = null;
        bookingInformationPage40.setBackground(color41);
        bookingInformationPage40.show(false);
        java.awt.Color color45 = bookingInformationPage40.getForeground();
        bookingInformationPage33.setBackground(color45);
        appFrame31.setBackground(color45);
        boolean boolean48 = appFrame31.isFocused();
        java.awt.MenuComponent menuComponent49 = null;
        appFrame31.remove(menuComponent49);
        int int51 = appFrame31.getComponentCount();
        dataManagement.MaintainAdministrator maintainAdministrator52 = appFrame31.getMaintainAdministrator();
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component54 = paymentPage30.add((java.awt.Component) appFrame31, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: adding a window to a container");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(appFrame0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(transferHandler18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color25);
        org.junit.Assert.assertTrue("'" + type29 + "' != '" + java.awt.Window.Type.NORMAL + "'", type29.equals(java.awt.Window.Type.NORMAL));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(appFrame31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(maintainAdministrator52);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        boolean boolean2 = userManagement.UserFactory.isValidEmail("Faculty [username=null, email=null, id=0]", "WELCOME");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        administratorManagement.Administrator administrator5 = new administratorManagement.Administrator("LOGIN", "EXTEND BOOKING", "BOOKING", (int) '4', false);
        boolean boolean7 = administrator5.disableRoom("CREATE ROOM");
        int int8 = administrator5.getAdminID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        gui.AppFrame appFrame4 = null;
        gui.BookingInformationPage bookingInformationPage5 = new gui.BookingInformationPage(appFrame4);
        java.awt.Color color6 = null;
        bookingInformationPage5.setBackground(color6);
        bookingInformationPage5.setVerifyInputWhenFocusTarget(true);
        java.awt.Insets insets10 = bookingInformationPage5.getInsets();
        java.awt.Dimension dimension11 = bookingInformationPage5.getPreferredSize();
        bookingInformationPage1.setMaximumSize(dimension11);
        javax.swing.TransferHandler transferHandler13 = bookingInformationPage1.getTransferHandler();
        bookingInformationPage1.repaint(16, (int) 'a', (int) 'a', (int) (short) -1);
        bookingInformationPage1.transferFocus();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(insets10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dimension11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(transferHandler13);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        int int0 = java.awt.Frame.NORMAL;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.event.ContainerListener[] containerListenerArray2 = bookingInformationPage1.getContainerListeners();
        bookingInformationPage1.setAlignmentY((float) 12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(containerListenerArray2);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        int int0 = java.awt.image.ImageObserver.WIDTH;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.setVerifyInputWhenFocusTarget(true);
        java.awt.Insets insets6 = bookingInformationPage1.getInsets();
        java.awt.Dimension dimension7 = bookingInformationPage1.getPreferredSize();
        gui.AppFrame appFrame8 = null;
        gui.BookingInformationPage bookingInformationPage9 = new gui.BookingInformationPage(appFrame8);
        java.awt.Color color10 = null;
        bookingInformationPage9.setBackground(color10);
        bookingInformationPage9.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension14 = null;
        bookingInformationPage9.setPreferredSize(dimension14);
        bookingInformationPage9.firePropertyChange("hi!", false, true);
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior20 = bookingInformationPage9.getBaselineResizeBehavior();
        gui.AppFrame appFrame21 = null;
        gui.BookingInformationPage bookingInformationPage22 = new gui.BookingInformationPage(appFrame21);
        java.awt.Color color23 = null;
        bookingInformationPage22.setBackground(color23);
        bookingInformationPage22.show(false);
        java.awt.Color color27 = bookingInformationPage22.getForeground();
        bookingInformationPage22.removeNotify();
        java.awt.Event event29 = null;
        boolean boolean31 = bookingInformationPage22.gotFocus(event29, (java.lang.Object) false);
        java.awt.LayoutManager layoutManager32 = bookingInformationPage22.getLayout();
        gui.AppFrame appFrame33 = gui.AppFrame.getInstance();
        gui.AppFrame appFrame34 = null;
        gui.BookingInformationPage bookingInformationPage35 = new gui.BookingInformationPage(appFrame34);
        java.awt.Color color36 = null;
        bookingInformationPage35.setBackground(color36);
        bookingInformationPage35.show(false);
        java.awt.LayoutManager layoutManager40 = bookingInformationPage35.getLayout();
        gui.AppFrame appFrame41 = null;
        gui.BookingInformationPage bookingInformationPage42 = new gui.BookingInformationPage(appFrame41);
        java.awt.Color color43 = null;
        bookingInformationPage42.setBackground(color43);
        bookingInformationPage42.show(false);
        java.awt.Color color47 = bookingInformationPage42.getForeground();
        bookingInformationPage35.setBackground(color47);
        appFrame33.setBackground(color47);
        boolean boolean50 = appFrame33.isFocused();
        java.awt.MenuComponent menuComponent51 = null;
        appFrame33.remove(menuComponent51);
        gui.SignUpPage signUpPage53 = new gui.SignUpPage(appFrame33);
        boolean boolean54 = appFrame33.isValidateRoot();
        java.awt.Graphics graphics55 = appFrame33.getGraphics();
        bookingInformationPage22.printAll(graphics55);
        bookingInformationPage9.paintAll(graphics55);
        bookingInformationPage1.print(graphics55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(insets6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dimension7);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior20 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior20.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(appFrame33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphics55);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        bookingInformationPage1.repaint((int) (byte) 1, (int) (byte) 10, (int) '4', (int) (byte) 0);
        gui.AppFrame appFrame7 = null;
        gui.BookingInformationPage bookingInformationPage8 = new gui.BookingInformationPage(appFrame7);
        java.awt.Color color9 = null;
        bookingInformationPage8.setBackground(color9);
        bookingInformationPage8.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension13 = null;
        bookingInformationPage8.setPreferredSize(dimension13);
        java.awt.Event event15 = null;
        boolean boolean18 = bookingInformationPage8.mouseExit(event15, 10, (int) (byte) 10);
        java.lang.Object obj19 = bookingInformationPage1.getClientProperty((java.lang.Object) 10);
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        bookingInformationPage1.addPropertyChangeListener(propertyChangeListener20);
        int int24 = bookingInformationPage1.getBaseline((int) (short) 10, 4);
        java.awt.Event event25 = null;
        boolean boolean28 = bookingInformationPage1.mouseUp(event25, (int) '#', (int) (short) 0);
        boolean boolean29 = bookingInformationPage1.isFocusTraversalPolicyProvider();
        java.beans.PropertyChangeListener propertyChangeListener30 = null;
        bookingInformationPage1.addPropertyChangeListener(propertyChangeListener30);
        boolean boolean32 = bookingInformationPage1.isPaintingTile();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        gui.AppFrame appFrame0 = gui.AppFrame.getInstance();
        gui.AppFrame appFrame1 = null;
        gui.BookingInformationPage bookingInformationPage2 = new gui.BookingInformationPage(appFrame1);
        java.awt.Color color3 = null;
        bookingInformationPage2.setBackground(color3);
        bookingInformationPage2.show(false);
        java.awt.LayoutManager layoutManager7 = bookingInformationPage2.getLayout();
        gui.AppFrame appFrame8 = null;
        gui.BookingInformationPage bookingInformationPage9 = new gui.BookingInformationPage(appFrame8);
        java.awt.Color color10 = null;
        bookingInformationPage9.setBackground(color10);
        bookingInformationPage9.show(false);
        java.awt.Color color14 = bookingInformationPage9.getForeground();
        bookingInformationPage2.setBackground(color14);
        appFrame0.setBackground(color14);
        appFrame0.toFront();
        java.awt.event.WindowStateListener[] windowStateListenerArray18 = appFrame0.getWindowStateListeners();
        userManagement.User user19 = null;
        appFrame0.setCurrentUser(user19);
        java.awt.Container container21 = appFrame0.getContentPane();
        appFrame0.setAutoRequestFocus(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(appFrame0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(windowStateListenerArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(container21);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.setVerifyInputWhenFocusTarget(true);
        java.awt.event.FocusListener[] focusListenerArray6 = bookingInformationPage1.getFocusListeners();
        java.awt.Cursor cursor7 = null;
        bookingInformationPage1.setCursor(cursor7);
        java.awt.event.MouseListener mouseListener9 = null;
        bookingInformationPage1.addMouseListener(mouseListener9);
        bookingInformationPage1.grabFocus();
        int int12 = bookingInformationPage1.getHeight();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(focusListenerArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        gui.AppFrame appFrame0 = gui.AppFrame.getInstance();
        java.awt.event.WindowListener windowListener1 = null;
        appFrame0.addWindowListener(windowListener1);
        boolean boolean3 = appFrame0.isActive();
        int int4 = appFrame0.getExtendedState();
        appFrame0.setAutoRequestFocus(false);
        administratorManagement.Administrator administrator7 = appFrame0.getCurrentAdministrator();
        java.awt.LayoutManager layoutManager8 = appFrame0.getLayout();
        appFrame0.setResizable(false);
        boolean boolean11 = appFrame0.isResizable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(appFrame0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(administrator7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        bookingInformationPage1.repaint((int) (byte) 1, (int) (byte) 10, (int) '4', (int) (byte) 0);
        gui.AppFrame appFrame7 = null;
        gui.BookingInformationPage bookingInformationPage8 = new gui.BookingInformationPage(appFrame7);
        java.awt.Color color9 = null;
        bookingInformationPage8.setBackground(color9);
        bookingInformationPage8.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension13 = null;
        bookingInformationPage8.setPreferredSize(dimension13);
        java.awt.Event event15 = null;
        boolean boolean18 = bookingInformationPage8.mouseExit(event15, 10, (int) (byte) 10);
        java.lang.Object obj19 = bookingInformationPage1.getClientProperty((java.lang.Object) 10);
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        bookingInformationPage1.addPropertyChangeListener(propertyChangeListener20);
        bookingInformationPage1.setFocusCycleRoot(true);
        bookingInformationPage1.repaint((int) 'a', 100, 64, (int) '4');
        boolean boolean29 = bookingInformationPage1.isVisible();
        int int32 = bookingInformationPage1.getBaseline((int) (short) 10, 16);
        gui.AppFrame appFrame33 = null;
        gui.BookingInformationPage bookingInformationPage34 = new gui.BookingInformationPage(appFrame33);
        java.awt.Color color35 = null;
        bookingInformationPage34.setBackground(color35);
        bookingInformationPage34.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension39 = null;
        bookingInformationPage34.setPreferredSize(dimension39);
        bookingInformationPage34.firePropertyChange("hi!", false, true);
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior45 = bookingInformationPage34.getBaselineResizeBehavior();
        gui.AppFrame appFrame46 = null;
        gui.BookingInformationPage bookingInformationPage47 = new gui.BookingInformationPage(appFrame46);
        java.awt.Color color48 = null;
        bookingInformationPage47.setBackground(color48);
        bookingInformationPage47.show(false);
        java.awt.Color color52 = bookingInformationPage47.getForeground();
        bookingInformationPage47.removeNotify();
        java.awt.Event event54 = null;
        boolean boolean56 = bookingInformationPage47.gotFocus(event54, (java.lang.Object) false);
        java.awt.LayoutManager layoutManager57 = bookingInformationPage47.getLayout();
        gui.AppFrame appFrame58 = gui.AppFrame.getInstance();
        gui.AppFrame appFrame59 = null;
        gui.BookingInformationPage bookingInformationPage60 = new gui.BookingInformationPage(appFrame59);
        java.awt.Color color61 = null;
        bookingInformationPage60.setBackground(color61);
        bookingInformationPage60.show(false);
        java.awt.LayoutManager layoutManager65 = bookingInformationPage60.getLayout();
        gui.AppFrame appFrame66 = null;
        gui.BookingInformationPage bookingInformationPage67 = new gui.BookingInformationPage(appFrame66);
        java.awt.Color color68 = null;
        bookingInformationPage67.setBackground(color68);
        bookingInformationPage67.show(false);
        java.awt.Color color72 = bookingInformationPage67.getForeground();
        bookingInformationPage60.setBackground(color72);
        appFrame58.setBackground(color72);
        boolean boolean75 = appFrame58.isFocused();
        java.awt.MenuComponent menuComponent76 = null;
        appFrame58.remove(menuComponent76);
        gui.SignUpPage signUpPage78 = new gui.SignUpPage(appFrame58);
        boolean boolean79 = appFrame58.isValidateRoot();
        java.awt.Graphics graphics80 = appFrame58.getGraphics();
        bookingInformationPage47.printAll(graphics80);
        bookingInformationPage34.paintAll(graphics80);
        bookingInformationPage1.printAll(graphics80);
        bookingInformationPage1.list();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior45 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior45.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(appFrame58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphics80);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        gui.AppFrame appFrame0 = null;
        gui.PaymentPage paymentPage1 = new gui.PaymentPage(appFrame0);
        boolean boolean2 = paymentPage1.isFocusable();
        java.awt.event.MouseEvent mouseEvent3 = null;
        java.awt.Point point4 = paymentPage1.getPopupLocation(mouseEvent3);
        boolean boolean5 = paymentPage1.isPaintingTile();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(point4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        gui.AppFrame appFrame0 = gui.AppFrame.getInstance();
        gui.AppFrame appFrame1 = null;
        gui.BookingInformationPage bookingInformationPage2 = new gui.BookingInformationPage(appFrame1);
        java.awt.Color color3 = null;
        bookingInformationPage2.setBackground(color3);
        bookingInformationPage2.show(false);
        java.awt.LayoutManager layoutManager7 = bookingInformationPage2.getLayout();
        gui.AppFrame appFrame8 = null;
        gui.BookingInformationPage bookingInformationPage9 = new gui.BookingInformationPage(appFrame8);
        java.awt.Color color10 = null;
        bookingInformationPage9.setBackground(color10);
        bookingInformationPage9.show(false);
        java.awt.Color color14 = bookingInformationPage9.getForeground();
        bookingInformationPage2.setBackground(color14);
        appFrame0.setBackground(color14);
        javax.swing.JRootPane jRootPane17 = appFrame0.getRootPane();
        gui.AppFrame appFrame18 = null;
        gui.BookingInformationPage bookingInformationPage19 = new gui.BookingInformationPage(appFrame18);
        java.awt.Color color20 = null;
        bookingInformationPage19.setBackground(color20);
        bookingInformationPage19.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension24 = null;
        bookingInformationPage19.setPreferredSize(dimension24);
        gui.AppFrame appFrame26 = null;
        gui.BookingInformationPage bookingInformationPage27 = new gui.BookingInformationPage(appFrame26);
        java.awt.Color color28 = null;
        bookingInformationPage27.setBackground(color28);
        bookingInformationPage27.show(false);
        java.awt.LayoutManager layoutManager32 = bookingInformationPage27.getLayout();
        bookingInformationPage19.putClientProperty((java.lang.Object) layoutManager32, (java.lang.Object) 0);
        appFrame0.setLayout(layoutManager32);
        java.awt.Point point37 = appFrame0.getMousePosition(false);
        java.beans.PropertyChangeListener propertyChangeListener39 = null;
        appFrame0.addPropertyChangeListener("ROOM OPTIONS", propertyChangeListener39);
        appFrame0.setCursor(8);
        appFrame0.reshape((int) (byte) -1, 5, 32, 9);
        gui.RoomOptionsPage roomOptionsPage48 = new gui.RoomOptionsPage(appFrame0);
        gui.AppFrame appFrame49 = null;
        gui.BookingInformationPage bookingInformationPage50 = new gui.BookingInformationPage(appFrame49);
        java.awt.Color color51 = null;
        bookingInformationPage50.setBackground(color51);
        bookingInformationPage50.setVerifyInputWhenFocusTarget(true);
        java.awt.event.FocusListener[] focusListenerArray55 = bookingInformationPage50.getFocusListeners();
        javax.swing.KeyStroke keyStroke56 = null;
        int int57 = bookingInformationPage50.getConditionForKeyStroke(keyStroke56);
        gui.AppFrame appFrame58 = null;
        gui.WelcomePage welcomePage59 = new gui.WelcomePage(appFrame58);
        gui.AppFrame appFrame60 = null;
        gui.BookingInformationPage bookingInformationPage61 = new gui.BookingInformationPage(appFrame60);
        java.awt.Color color62 = null;
        bookingInformationPage61.setBackground(color62);
        bookingInformationPage61.show(false);
        java.awt.LayoutManager layoutManager66 = bookingInformationPage61.getLayout();
        java.awt.Point point67 = null;
        java.awt.Point point68 = bookingInformationPage61.getLocation(point67);
        boolean boolean69 = welcomePage59.contains(point68);
        java.awt.Point point70 = bookingInformationPage50.getLocation(point68);
        appFrame0.setLocation(point68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(appFrame0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jRootPane17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(point37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(focusListenerArray55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(point68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(point70);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.show(false);
        java.awt.Color color6 = bookingInformationPage1.getForeground();
        java.awt.FocusTraversalPolicy focusTraversalPolicy7 = null;
        bookingInformationPage1.setFocusTraversalPolicy(focusTraversalPolicy7);
        boolean boolean9 = bookingInformationPage1.isFocusTraversalPolicyProvider();
        bookingInformationPage1.setBounds(0, (-1), 10, 8);
        bookingInformationPage1.setFocusTraversalPolicyProvider(true);
        bookingInformationPage1.hide();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        dataManagement.MaintainUser maintainUser0 = new dataManagement.MaintainUser();
        userManagement.User user3 = maintainUser0.authenticate("gui.BookingInformationPage[,0,0,0x0,invalid,layout=java.awt.GridBagLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", "MANAGE ROOMS");
        userManagement.Staff staff9 = new userManagement.Staff("MANAGE ROOMS", "DASHBOARD", "MANAGE ROOMS", (int) (byte) 100, "PAYMENT");
        int int10 = staff9.getHourlyRate();
        staff9.setOrgIdOrStudentNumber("LOGIN");
        maintainUser0.addUser((userManagement.User) staff9);
        userManagement.Staff staff14 = new userManagement.Staff();
        maintainUser0.addUser((userManagement.User) staff14);
        java.lang.String str16 = maintainUser0.path;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 40 + "'", int10 == 40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        boolean boolean1 = userManagement.UserFactory.isStrongPassword("Other");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.show(false);
        java.awt.Color color6 = bookingInformationPage1.getForeground();
        java.awt.FocusTraversalPolicy focusTraversalPolicy7 = null;
        bookingInformationPage1.setFocusTraversalPolicy(focusTraversalPolicy7);
        int int9 = bookingInformationPage1.countComponents();
        java.lang.String str10 = bookingInformationPage1.getToolTipText();
        java.awt.Color color11 = null;
        bookingInformationPage1.setBackground(color11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.setSize((int) (byte) 100, (-1));
        bookingInformationPage1.doLayout();
        java.awt.ImageCapabilities imageCapabilities10 = null;
        java.awt.image.VolatileImage volatileImage11 = bookingInformationPage1.createVolatileImage(8, 4, imageCapabilities10);
        java.awt.Rectangle rectangle12 = bookingInformationPage1.getBounds();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(volatileImage11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rectangle12);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        bookingManagment.BookingManager bookingManager0 = bookingManagment.BookingManager.getInstance();
        bookingManagment.Booking booking2 = bookingManager0.getBooking("hi!");
        bookingManagment.Booking booking4 = bookingManager0.getBooking("DASHBOARD");
        java.util.Date date8 = null;
        bookingManagment.Booking booking14 = new bookingManagment.Booking("gui.BookingInformationPage[,0,0,0x0,invalid,layout=java.awt.GridBagLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", "BOOKING", "ADMINISTRATOR OPTIONS", date8, "Other", "ROOM OPTIONS", (double) 32, (double) 40, (double) 12);
        booking14.setEndTime("MANAGE ROOMS");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = bookingManager0.isRoomAvailableForExtension(booking14, "CREATE ROOM");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(bookingManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(booking4);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        roomManagement.Room room3 = new roomManagement.Room("gui.BookingInformationPage[,0,0,0x0,invalid,layout=java.awt.GridBagLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", 10, "");
        java.lang.String str4 = room3.getUserId();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        userManagement.Faculty faculty0 = new userManagement.Faculty();
        int int1 = faculty0.getHourlyRate();
        java.lang.String str2 = faculty0.getOrgIdOrStudentNumber();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 30 + "'", int1 == 30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension6 = null;
        bookingInformationPage1.setPreferredSize(dimension6);
        bookingInformationPage1.paintImmediately((int) (byte) 10, 10, 7, 64);
        java.lang.String str13 = bookingInformationPage1.toString();
        boolean boolean14 = bookingInformationPage1.getAutoscrolls();
        java.util.Locale locale15 = bookingInformationPage1.getLocale();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "gui.BookingInformationPage[,0,0,0x0,invalid,layout=java.awt.GridBagLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]" + "'", str13.equals("gui.BookingInformationPage[,0,0,0x0,invalid,layout=java.awt.GridBagLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale15.toString(), "en_CA");
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        gui.AppFrame appFrame0 = gui.AppFrame.getInstance();
        gui.AppFrame appFrame1 = null;
        gui.BookingInformationPage bookingInformationPage2 = new gui.BookingInformationPage(appFrame1);
        java.awt.Color color3 = null;
        bookingInformationPage2.setBackground(color3);
        bookingInformationPage2.show(false);
        java.awt.LayoutManager layoutManager7 = bookingInformationPage2.getLayout();
        gui.AppFrame appFrame8 = null;
        gui.BookingInformationPage bookingInformationPage9 = new gui.BookingInformationPage(appFrame8);
        java.awt.Color color10 = null;
        bookingInformationPage9.setBackground(color10);
        bookingInformationPage9.show(false);
        java.awt.Color color14 = bookingInformationPage9.getForeground();
        bookingInformationPage2.setBackground(color14);
        appFrame0.setBackground(color14);
        boolean boolean17 = appFrame0.isFocused();
        java.awt.MenuBar menuBar18 = null;
        appFrame0.setMenuBar(menuBar18);
        java.awt.Image image20 = appFrame0.getIconImage();
        javax.swing.TransferHandler transferHandler21 = null;
        appFrame0.setTransferHandler(transferHandler21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(appFrame0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(image20);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        gui.AppFrame appFrame0 = gui.AppFrame.getInstance();
        gui.AppFrame appFrame1 = null;
        gui.BookingInformationPage bookingInformationPage2 = new gui.BookingInformationPage(appFrame1);
        java.awt.Color color3 = null;
        bookingInformationPage2.setBackground(color3);
        bookingInformationPage2.show(false);
        java.awt.LayoutManager layoutManager7 = bookingInformationPage2.getLayout();
        gui.AppFrame appFrame8 = null;
        gui.BookingInformationPage bookingInformationPage9 = new gui.BookingInformationPage(appFrame8);
        java.awt.Color color10 = null;
        bookingInformationPage9.setBackground(color10);
        bookingInformationPage9.show(false);
        java.awt.Color color14 = bookingInformationPage9.getForeground();
        bookingInformationPage2.setBackground(color14);
        appFrame0.setBackground(color14);
        boolean boolean17 = appFrame0.isFocused();
        java.awt.MenuComponent menuComponent18 = null;
        appFrame0.remove(menuComponent18);
        gui.SignUpPage signUpPage20 = new gui.SignUpPage(appFrame0);
        boolean boolean21 = appFrame0.isValidateRoot();
        gui.UserOptionPage userOptionPage22 = new gui.UserOptionPage(appFrame0);
        userOptionPage22.setEnabled(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(appFrame0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        roomManagement.Room room3 = new roomManagement.Room("ToolTipText", (int) (byte) -1, "BOOKING");
        boolean boolean4 = room3.closeRoom();
        boolean boolean5 = room3.maintenanceAndRepairsFinished();
        boolean boolean6 = room3.enableRoom();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        gui.AppFrame appFrame0 = gui.AppFrame.getInstance();
        gui.AppFrame appFrame1 = null;
        gui.BookingInformationPage bookingInformationPage2 = new gui.BookingInformationPage(appFrame1);
        java.awt.Color color3 = null;
        bookingInformationPage2.setBackground(color3);
        bookingInformationPage2.show(false);
        java.awt.LayoutManager layoutManager7 = bookingInformationPage2.getLayout();
        gui.AppFrame appFrame8 = null;
        gui.BookingInformationPage bookingInformationPage9 = new gui.BookingInformationPage(appFrame8);
        java.awt.Color color10 = null;
        bookingInformationPage9.setBackground(color10);
        bookingInformationPage9.show(false);
        java.awt.Color color14 = bookingInformationPage9.getForeground();
        bookingInformationPage2.setBackground(color14);
        appFrame0.setBackground(color14);
        javax.swing.JRootPane jRootPane17 = appFrame0.getRootPane();
        java.awt.Dimension dimension18 = null;
        // The following exception was thrown during execution in test generation
        try {
            appFrame0.setSize(dimension18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"width\" because \"d\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(appFrame0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jRootPane17);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        java.util.Date date3 = null;
        bookingManagment.Booking booking9 = new bookingManagment.Booking("hi!", "ROOM OPTIONS", "ROOM OPTIONS", date3, "ROOM OPTIONS", "gui.BookingInformationPage[,0,0,0x0,invalid,layout=java.awt.GridBagLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", (double) (-1), (double) (short) -1, (double) (-1));
        java.lang.String str10 = booking9.getUserID();
        java.lang.String str11 = booking9.getStartTime();
        java.lang.String str12 = booking9.getRoomID();
        double double13 = booking9.getHourlyRate();
        java.util.Date date14 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = booking9.isDepositForfeited(date14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "ROOM OPTIONS" + "'", str11.equals("ROOM OPTIONS"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "ROOM OPTIONS" + "'", str12.equals("ROOM OPTIONS"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        java.lang.String str0 = gui.RoomOptionsPage.getSelectedRoomID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str0);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        payment.InstitutionsBilling institutionsBilling5 = new payment.InstitutionsBilling((double) 10.0f, "", "PAYMENT", "MANAGE ROOMS", (int) (byte) -1);
        double double6 = institutionsBilling5.calculateDeposit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        bookingInformationPage1.repaint((int) (byte) 1, (int) (byte) 10, (int) '4', (int) (byte) 0);
        float float7 = bookingInformationPage1.getAlignmentY();
        boolean boolean8 = bookingInformationPage1.isCursorSet();
        java.awt.event.KeyListener keyListener9 = null;
        bookingInformationPage1.addKeyListener(keyListener9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 0.5f + "'", float7 == 0.5f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        userManagement.Partner partner5 = new userManagement.Partner("LOGIN", "MANAGE ROOMS", "WELCOME", (int) (short) -1, "PAYMENT");
        java.lang.String str6 = partner5.getUserType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Partner" + "'", str6.equals("Partner"));
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        java.awt.ComponentOrientation componentOrientation4 = null;
        bookingInformationPage1.setComponentOrientation(componentOrientation4);
        gui.AppFrame appFrame6 = null;
        gui.BookingInformationPage bookingInformationPage7 = new gui.BookingInformationPage(appFrame6);
        java.awt.Color color8 = null;
        bookingInformationPage7.setBackground(color8);
        bookingInformationPage7.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension12 = null;
        bookingInformationPage7.setPreferredSize(dimension12);
        bookingInformationPage7.paintImmediately((int) (byte) 10, 10, 7, 64);
        java.lang.String str19 = bookingInformationPage7.toString();
        java.awt.Rectangle rectangle20 = null;
        java.awt.Rectangle rectangle21 = bookingInformationPage7.getBounds(rectangle20);
        bookingInformationPage1.setMixingCutoutShape((java.awt.Shape) rectangle21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "gui.BookingInformationPage[,0,0,0x0,invalid,layout=java.awt.GridBagLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]" + "'", str19.equals("gui.BookingInformationPage[,0,0,0x0,invalid,layout=java.awt.GridBagLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rectangle21);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.show(false);
        java.awt.Color color6 = bookingInformationPage1.getForeground();
        bookingInformationPage1.setEnabled(false);
        java.awt.Dimension dimension9 = bookingInformationPage1.preferredSize();
        java.awt.Dimension dimension10 = bookingInformationPage1.getMinimumSize();
        java.beans.VetoableChangeListener[] vetoableChangeListenerArray11 = bookingInformationPage1.getVetoableChangeListeners();
        java.awt.Dimension dimension12 = bookingInformationPage1.getPreferredSize();
        int int13 = bookingInformationPage1.getY();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dimension9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dimension10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vetoableChangeListenerArray11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dimension12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.show(false);
        java.awt.Color color6 = bookingInformationPage1.getForeground();
        gui.AppFrame appFrame7 = null;
        gui.BookingInformationPage bookingInformationPage8 = new gui.BookingInformationPage(appFrame7);
        java.awt.Color color9 = null;
        bookingInformationPage8.setBackground(color9);
        bookingInformationPage8.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension13 = null;
        bookingInformationPage8.setPreferredSize(dimension13);
        int int15 = bookingInformationPage1.getComponentZOrder((java.awt.Component) bookingInformationPage8);
        java.awt.LayoutManager layoutManager16 = bookingInformationPage1.getLayout();
        java.awt.event.HierarchyBoundsListener[] hierarchyBoundsListenerArray17 = bookingInformationPage1.getHierarchyBoundsListeners();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hierarchyBoundsListenerArray17);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.show(false);
        java.awt.LayoutManager layoutManager6 = bookingInformationPage1.getLayout();
        bookingInformationPage1.transferFocus();
        boolean boolean8 = bookingInformationPage1.isOpaque();
        java.awt.Graphics graphics9 = null;
        bookingInformationPage1.paint(graphics9);
        java.awt.GraphicsConfiguration graphicsConfiguration11 = bookingInformationPage1.getGraphicsConfiguration();
        javax.swing.JRootPane jRootPane12 = bookingInformationPage1.getRootPane();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = jRootPane12.countComponents();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(graphicsConfiguration11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(jRootPane12);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        gui.AppFrame appFrame0 = null;
        gui.PaymentPage paymentPage1 = new gui.PaymentPage(appFrame0);
        boolean boolean2 = paymentPage1.isFocusable();
        paymentPage1.setInheritsPopupMenu(false);
        gui.AppFrame appFrame5 = null;
        gui.BookingInformationPage bookingInformationPage6 = new gui.BookingInformationPage(appFrame5);
        java.awt.Color color7 = null;
        bookingInformationPage6.setBackground(color7);
        bookingInformationPage6.setVerifyInputWhenFocusTarget(true);
        java.awt.event.FocusListener[] focusListenerArray11 = bookingInformationPage6.getFocusListeners();
        javax.swing.KeyStroke keyStroke12 = null;
        int int13 = bookingInformationPage6.getConditionForKeyStroke(keyStroke12);
        gui.AppFrame appFrame14 = null;
        gui.WelcomePage welcomePage15 = new gui.WelcomePage(appFrame14);
        gui.AppFrame appFrame16 = null;
        gui.BookingInformationPage bookingInformationPage17 = new gui.BookingInformationPage(appFrame16);
        java.awt.Color color18 = null;
        bookingInformationPage17.setBackground(color18);
        bookingInformationPage17.show(false);
        java.awt.LayoutManager layoutManager22 = bookingInformationPage17.getLayout();
        java.awt.Point point23 = null;
        java.awt.Point point24 = bookingInformationPage17.getLocation(point23);
        boolean boolean25 = welcomePage15.contains(point24);
        java.awt.Point point26 = bookingInformationPage6.getLocation(point24);
        java.awt.Point point27 = paymentPage1.getLocation(point24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(focusListenerArray11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(point24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(point26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(point27);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.setVerifyInputWhenFocusTarget(true);
        java.awt.event.FocusListener[] focusListenerArray6 = bookingInformationPage1.getFocusListeners();
        java.beans.PropertyChangeListener[] propertyChangeListenerArray7 = bookingInformationPage1.getPropertyChangeListeners();
        javax.swing.InputVerifier inputVerifier8 = null;
        bookingInformationPage1.setInputVerifier(inputVerifier8);
        bookingInformationPage1.removeNotify();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(focusListenerArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(propertyChangeListenerArray7);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.util.Locale locale2 = null;
        bookingInformationPage1.setLocale(locale2);
        java.awt.dnd.DropTarget dropTarget4 = bookingInformationPage1.getDropTarget();
        gui.AppFrame appFrame5 = null;
        gui.BookingInformationPage bookingInformationPage6 = new gui.BookingInformationPage(appFrame5);
        java.awt.Color color7 = null;
        bookingInformationPage6.setBackground(color7);
        bookingInformationPage6.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension11 = null;
        bookingInformationPage6.setPreferredSize(dimension11);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray13 = bookingInformationPage6.getPropertyChangeListeners();
        bookingInformationPage6.enableInputMethods(false);
        java.awt.event.ComponentListener componentListener16 = null;
        bookingInformationPage6.removeComponentListener(componentListener16);
        java.awt.event.HierarchyListener hierarchyListener18 = null;
        bookingInformationPage6.removeHierarchyListener(hierarchyListener18);
        bookingInformationPage1.remove((java.awt.Component) bookingInformationPage6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(dropTarget4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(propertyChangeListenerArray13);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        gui.AppFrame appFrame0 = gui.AppFrame.getInstance();
        gui.AppFrame appFrame1 = null;
        gui.BookingInformationPage bookingInformationPage2 = new gui.BookingInformationPage(appFrame1);
        java.awt.Color color3 = null;
        bookingInformationPage2.setBackground(color3);
        bookingInformationPage2.show(false);
        java.awt.LayoutManager layoutManager7 = bookingInformationPage2.getLayout();
        gui.AppFrame appFrame8 = null;
        gui.BookingInformationPage bookingInformationPage9 = new gui.BookingInformationPage(appFrame8);
        java.awt.Color color10 = null;
        bookingInformationPage9.setBackground(color10);
        bookingInformationPage9.show(false);
        java.awt.Color color14 = bookingInformationPage9.getForeground();
        bookingInformationPage2.setBackground(color14);
        appFrame0.setBackground(color14);
        boolean boolean17 = appFrame0.isFocused();
        java.awt.MenuComponent menuComponent18 = null;
        appFrame0.remove(menuComponent18);
        gui.SignUpPage signUpPage20 = new gui.SignUpPage(appFrame0);
        boolean boolean21 = appFrame0.isValidateRoot();
        appFrame0.transferFocusDownCycle();
        int int23 = appFrame0.getCursorType();
        java.awt.Component component24 = appFrame0.getFocusOwner();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(appFrame0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 8 + "'", int23 == 8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(component24);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        gui.AppFrame appFrame0 = gui.AppFrame.getInstance();
        int int1 = appFrame0.getExtendedState();
        java.awt.Event event2 = null;
        boolean boolean4 = appFrame0.keyUp(event2, (int) (byte) 10);
        int int5 = appFrame0.getExtendedState();
        gui.WelcomePage welcomePage6 = new gui.WelcomePage(appFrame0);
        javax.swing.JRootPane jRootPane7 = appFrame0.getRootPane();
        gui.AppFrame appFrame8 = null;
        gui.BookingInformationPage bookingInformationPage9 = new gui.BookingInformationPage(appFrame8);
        java.awt.Color color10 = null;
        bookingInformationPage9.setBackground(color10);
        bookingInformationPage9.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension14 = null;
        bookingInformationPage9.setPreferredSize(dimension14);
        java.awt.Event event16 = null;
        boolean boolean19 = bookingInformationPage9.mouseExit(event16, 10, (int) (byte) 10);
        java.awt.event.KeyListener[] keyListenerArray20 = bookingInformationPage9.getKeyListeners();
        gui.AppFrame appFrame21 = null;
        gui.WelcomePage welcomePage22 = new gui.WelcomePage(appFrame21);
        gui.AppFrame appFrame23 = null;
        gui.BookingInformationPage bookingInformationPage24 = new gui.BookingInformationPage(appFrame23);
        java.awt.Color color25 = null;
        bookingInformationPage24.setBackground(color25);
        bookingInformationPage24.show(false);
        java.awt.LayoutManager layoutManager29 = bookingInformationPage24.getLayout();
        java.awt.Point point30 = null;
        java.awt.Point point31 = bookingInformationPage24.getLocation(point30);
        boolean boolean32 = welcomePage22.contains(point31);
        bookingInformationPage9.setLocation(point31);
        java.awt.Component component34 = jRootPane7.findComponentAt(point31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(appFrame0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jRootPane7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyListenerArray20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(point31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component34);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        bookingInformationPage1.repaint((int) (byte) 1, (int) (byte) 10, (int) '4', (int) (byte) 0);
        gui.AppFrame appFrame7 = null;
        gui.BookingInformationPage bookingInformationPage8 = new gui.BookingInformationPage(appFrame7);
        java.awt.Color color9 = null;
        bookingInformationPage8.setBackground(color9);
        bookingInformationPage8.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension13 = null;
        bookingInformationPage8.setPreferredSize(dimension13);
        java.awt.Event event15 = null;
        boolean boolean18 = bookingInformationPage8.mouseExit(event15, 10, (int) (byte) 10);
        java.lang.Object obj19 = bookingInformationPage1.getClientProperty((java.lang.Object) 10);
        java.beans.PropertyChangeListener propertyChangeListener20 = null;
        bookingInformationPage1.addPropertyChangeListener(propertyChangeListener20);
        javax.swing.InputMap inputMap23 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingInformationPage1.setInputMap(20, inputMap23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: condition must be one of JComponent.WHEN_IN_FOCUSED_WINDOW, JComponent.WHEN_FOCUSED or JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        gui.AppFrame appFrame0 = gui.AppFrame.getInstance();
        gui.AppFrame appFrame1 = null;
        gui.BookingInformationPage bookingInformationPage2 = new gui.BookingInformationPage(appFrame1);
        java.awt.Color color3 = null;
        bookingInformationPage2.setBackground(color3);
        bookingInformationPage2.show(false);
        java.awt.LayoutManager layoutManager7 = bookingInformationPage2.getLayout();
        gui.AppFrame appFrame8 = null;
        gui.BookingInformationPage bookingInformationPage9 = new gui.BookingInformationPage(appFrame8);
        java.awt.Color color10 = null;
        bookingInformationPage9.setBackground(color10);
        bookingInformationPage9.show(false);
        java.awt.Color color14 = bookingInformationPage9.getForeground();
        bookingInformationPage2.setBackground(color14);
        appFrame0.setBackground(color14);
        appFrame0.toFront();
        javax.swing.TransferHandler transferHandler18 = appFrame0.getTransferHandler();
        gui.AppFrame appFrame19 = null;
        gui.BookingInformationPage bookingInformationPage20 = new gui.BookingInformationPage(appFrame19);
        java.awt.Color color21 = null;
        bookingInformationPage20.setBackground(color21);
        bookingInformationPage20.show(false);
        java.awt.Color color25 = bookingInformationPage20.getForeground();
        appFrame0.setBackground(color25);
        appFrame0.setVisible(false);
        gui.AppFrame appFrame29 = gui.AppFrame.getInstance();
        gui.AppFrame appFrame30 = null;
        gui.BookingInformationPage bookingInformationPage31 = new gui.BookingInformationPage(appFrame30);
        java.awt.Color color32 = null;
        bookingInformationPage31.setBackground(color32);
        bookingInformationPage31.show(false);
        java.awt.LayoutManager layoutManager36 = bookingInformationPage31.getLayout();
        gui.AppFrame appFrame37 = null;
        gui.BookingInformationPage bookingInformationPage38 = new gui.BookingInformationPage(appFrame37);
        java.awt.Color color39 = null;
        bookingInformationPage38.setBackground(color39);
        bookingInformationPage38.show(false);
        java.awt.Color color43 = bookingInformationPage38.getForeground();
        bookingInformationPage31.setBackground(color43);
        appFrame29.setBackground(color43);
        appFrame29.toFront();
        javax.swing.TransferHandler transferHandler47 = appFrame29.getTransferHandler();
        gui.ChiefEventCoordinatorPage chiefEventCoordinatorPage48 = new gui.ChiefEventCoordinatorPage(appFrame29);
        // The following exception was thrown during execution in test generation
        try {
            appFrame0.setGlassPane((java.awt.Component) appFrame29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: adding container's parent to itself");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(appFrame0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(transferHandler18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(appFrame29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(transferHandler47);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        java.util.Date date3 = null;
        bookingManagment.Booking booking9 = new bookingManagment.Booking("ADMINISTRATOR OPTIONS", "EXTEND BOOKING", "Faculty", date3, "Partner", "data/users.csv", (double) 20, (double) 0, (double) (byte) 1);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        gui.AppFrame appFrame0 = gui.AppFrame.getInstance();
        gui.AppFrame appFrame1 = null;
        gui.BookingInformationPage bookingInformationPage2 = new gui.BookingInformationPage(appFrame1);
        java.awt.Color color3 = null;
        bookingInformationPage2.setBackground(color3);
        bookingInformationPage2.show(false);
        java.awt.LayoutManager layoutManager7 = bookingInformationPage2.getLayout();
        gui.AppFrame appFrame8 = null;
        gui.BookingInformationPage bookingInformationPage9 = new gui.BookingInformationPage(appFrame8);
        java.awt.Color color10 = null;
        bookingInformationPage9.setBackground(color10);
        bookingInformationPage9.show(false);
        java.awt.Color color14 = bookingInformationPage9.getForeground();
        bookingInformationPage2.setBackground(color14);
        appFrame0.setBackground(color14);
        appFrame0.toFront();
        javax.swing.TransferHandler transferHandler18 = appFrame0.getTransferHandler();
        gui.AppFrame appFrame19 = null;
        gui.BookingInformationPage bookingInformationPage20 = new gui.BookingInformationPage(appFrame19);
        java.awt.Color color21 = null;
        bookingInformationPage20.setBackground(color21);
        bookingInformationPage20.show(false);
        java.awt.Color color25 = bookingInformationPage20.getForeground();
        appFrame0.setBackground(color25);
        boolean boolean27 = appFrame0.isFocusableWindow();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(appFrame0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(transferHandler18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.show(false);
        java.awt.Color color6 = bookingInformationPage1.getForeground();
        bookingInformationPage1.removeNotify();
        java.awt.Event event8 = null;
        boolean boolean10 = bookingInformationPage1.gotFocus(event8, (java.lang.Object) false);
        java.awt.LayoutManager layoutManager11 = bookingInformationPage1.getLayout();
        gui.AppFrame appFrame12 = gui.AppFrame.getInstance();
        gui.AppFrame appFrame13 = null;
        gui.BookingInformationPage bookingInformationPage14 = new gui.BookingInformationPage(appFrame13);
        java.awt.Color color15 = null;
        bookingInformationPage14.setBackground(color15);
        bookingInformationPage14.show(false);
        java.awt.LayoutManager layoutManager19 = bookingInformationPage14.getLayout();
        gui.AppFrame appFrame20 = null;
        gui.BookingInformationPage bookingInformationPage21 = new gui.BookingInformationPage(appFrame20);
        java.awt.Color color22 = null;
        bookingInformationPage21.setBackground(color22);
        bookingInformationPage21.show(false);
        java.awt.Color color26 = bookingInformationPage21.getForeground();
        bookingInformationPage14.setBackground(color26);
        appFrame12.setBackground(color26);
        boolean boolean29 = appFrame12.isFocused();
        java.awt.MenuComponent menuComponent30 = null;
        appFrame12.remove(menuComponent30);
        gui.SignUpPage signUpPage32 = new gui.SignUpPage(appFrame12);
        boolean boolean33 = appFrame12.isValidateRoot();
        java.awt.Graphics graphics34 = appFrame12.getGraphics();
        bookingInformationPage1.printAll(graphics34);
        java.awt.Point point36 = bookingInformationPage1.getMousePosition();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(appFrame12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphics34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(point36);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension6 = null;
        bookingInformationPage1.setPreferredSize(dimension6);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray8 = bookingInformationPage1.getPropertyChangeListeners();
        boolean boolean9 = bookingInformationPage1.isOpaque();
        java.beans.VetoableChangeListener vetoableChangeListener10 = null;
        bookingInformationPage1.removeVetoableChangeListener(vetoableChangeListener10);
        java.awt.Event event12 = null;
        gui.AppFrame appFrame13 = null;
        gui.BookingInformationPage bookingInformationPage14 = new gui.BookingInformationPage(appFrame13);
        java.util.Locale locale15 = null;
        bookingInformationPage14.setLocale(locale15);
        boolean boolean17 = bookingInformationPage1.gotFocus(event12, (java.lang.Object) bookingInformationPage14);
        java.awt.event.ContainerListener containerListener18 = null;
        bookingInformationPage14.removeContainerListener(containerListener18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(propertyChangeListenerArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension6 = null;
        bookingInformationPage1.setPreferredSize(dimension6);
        bookingInformationPage1.firePropertyChange("hi!", false, true);
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior12 = bookingInformationPage1.getBaselineResizeBehavior();
        bookingInformationPage1.setVisible(false);
        boolean boolean15 = bookingInformationPage1.getVerifyInputWhenFocusTarget();
        bookingInformationPage1.setFocusTraversalKeysEnabled(false);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior12 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior12.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        gui.AppFrame appFrame0 = gui.AppFrame.getInstance();
        gui.AppFrame appFrame1 = null;
        gui.BookingInformationPage bookingInformationPage2 = new gui.BookingInformationPage(appFrame1);
        java.awt.Color color3 = null;
        bookingInformationPage2.setBackground(color3);
        bookingInformationPage2.show(false);
        java.awt.LayoutManager layoutManager7 = bookingInformationPage2.getLayout();
        gui.AppFrame appFrame8 = null;
        gui.BookingInformationPage bookingInformationPage9 = new gui.BookingInformationPage(appFrame8);
        java.awt.Color color10 = null;
        bookingInformationPage9.setBackground(color10);
        bookingInformationPage9.show(false);
        java.awt.Color color14 = bookingInformationPage9.getForeground();
        bookingInformationPage2.setBackground(color14);
        appFrame0.setBackground(color14);
        javax.swing.JRootPane jRootPane17 = appFrame0.getRootPane();
        gui.AppFrame appFrame18 = null;
        gui.BookingInformationPage bookingInformationPage19 = new gui.BookingInformationPage(appFrame18);
        java.awt.Color color20 = null;
        bookingInformationPage19.setBackground(color20);
        bookingInformationPage19.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension24 = null;
        bookingInformationPage19.setPreferredSize(dimension24);
        gui.AppFrame appFrame26 = null;
        gui.BookingInformationPage bookingInformationPage27 = new gui.BookingInformationPage(appFrame26);
        java.awt.Color color28 = null;
        bookingInformationPage27.setBackground(color28);
        bookingInformationPage27.show(false);
        java.awt.LayoutManager layoutManager32 = bookingInformationPage27.getLayout();
        bookingInformationPage19.putClientProperty((java.lang.Object) layoutManager32, (java.lang.Object) 0);
        appFrame0.setLayout(layoutManager32);
        java.awt.Point point37 = appFrame0.getMousePosition(false);
        java.awt.Rectangle rectangle38 = appFrame0.bounds();
        gui.PaymentPage paymentPage39 = new gui.PaymentPage(appFrame0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(appFrame0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jRootPane17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(point37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rectangle38);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        roomStatus.ClosedState closedState0 = new roomStatus.ClosedState();
        roomManagement.Room room4 = new roomManagement.Room("ToolTipText", (int) (byte) -1, "BOOKING");
        boolean boolean5 = closedState0.closeRoom(room4);
        boolean boolean6 = room4.enableRoom();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        dataManagement.MaintainUser maintainUser0 = new dataManagement.MaintainUser();
        userManagement.User user3 = maintainUser0.authenticate("gui.BookingInformationPage[,0,0,0x0,invalid,layout=java.awt.GridBagLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", "MANAGE ROOMS");
        userManagement.Staff staff9 = new userManagement.Staff("MANAGE ROOMS", "DASHBOARD", "MANAGE ROOMS", (int) (byte) 100, "PAYMENT");
        int int10 = staff9.getHourlyRate();
        staff9.setOrgIdOrStudentNumber("LOGIN");
        maintainUser0.addUser((userManagement.User) staff9);
        userManagement.Staff staff14 = new userManagement.Staff();
        maintainUser0.addUser((userManagement.User) staff14);
        java.lang.String str16 = staff14.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 40 + "'", int10 == 40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Staff [username=null, email=null, id=0]" + "'", str16.equals("Staff [username=null, email=null, id=0]"));
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        java.util.Date date3 = null;
        bookingManagment.Booking booking9 = new bookingManagment.Booking("hi!", "ROOM OPTIONS", "ROOM OPTIONS", date3, "ROOM OPTIONS", "gui.BookingInformationPage[,0,0,0x0,invalid,layout=java.awt.GridBagLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", (double) (-1), (double) (short) -1, (double) (-1));
        java.lang.String str10 = booking9.getUserID();
        java.lang.String str11 = booking9.getStartTime();
        double double12 = booking9.getDepositPaid();
        java.lang.String str13 = booking9.getRoomID();
        java.lang.String str14 = booking9.getBookingID();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = booking9.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "ROOM OPTIONS" + "'", str11.equals("ROOM OPTIONS"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "ROOM OPTIONS" + "'", str13.equals("ROOM OPTIONS"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "ROOM OPTIONS" + "'", str14.equals("ROOM OPTIONS"));
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.show(false);
        java.awt.Color color6 = bookingInformationPage1.getForeground();
        java.awt.FocusTraversalPolicy focusTraversalPolicy7 = null;
        bookingInformationPage1.setFocusTraversalPolicy(focusTraversalPolicy7);
        int int9 = bookingInformationPage1.countComponents();
        java.lang.String str10 = bookingInformationPage1.getToolTipText();
        java.awt.Insets insets11 = bookingInformationPage1.insets();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(insets11);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.setVerifyInputWhenFocusTarget(true);
        java.awt.Insets insets6 = bookingInformationPage1.getInsets();
        bookingInformationPage1.setDoubleBuffered(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(insets6);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        gui.AppFrame appFrame0 = gui.AppFrame.getInstance();
        gui.AppFrame appFrame1 = null;
        gui.BookingInformationPage bookingInformationPage2 = new gui.BookingInformationPage(appFrame1);
        java.awt.Color color3 = null;
        bookingInformationPage2.setBackground(color3);
        bookingInformationPage2.show(false);
        java.awt.LayoutManager layoutManager7 = bookingInformationPage2.getLayout();
        gui.AppFrame appFrame8 = null;
        gui.BookingInformationPage bookingInformationPage9 = new gui.BookingInformationPage(appFrame8);
        java.awt.Color color10 = null;
        bookingInformationPage9.setBackground(color10);
        bookingInformationPage9.show(false);
        java.awt.Color color14 = bookingInformationPage9.getForeground();
        bookingInformationPage2.setBackground(color14);
        appFrame0.setBackground(color14);
        javax.swing.JRootPane jRootPane17 = appFrame0.getRootPane();
        gui.AppFrame appFrame18 = null;
        gui.BookingInformationPage bookingInformationPage19 = new gui.BookingInformationPage(appFrame18);
        java.awt.Color color20 = null;
        bookingInformationPage19.setBackground(color20);
        bookingInformationPage19.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension24 = null;
        bookingInformationPage19.setPreferredSize(dimension24);
        gui.AppFrame appFrame26 = null;
        gui.BookingInformationPage bookingInformationPage27 = new gui.BookingInformationPage(appFrame26);
        java.awt.Color color28 = null;
        bookingInformationPage27.setBackground(color28);
        bookingInformationPage27.show(false);
        java.awt.LayoutManager layoutManager32 = bookingInformationPage27.getLayout();
        bookingInformationPage19.putClientProperty((java.lang.Object) layoutManager32, (java.lang.Object) 0);
        appFrame0.setLayout(layoutManager32);
        java.awt.Point point37 = appFrame0.getMousePosition(false);
        userManagement.User user38 = appFrame0.getCurrentUser();
        appFrame0.createBufferStrategy((int) (short) 100);
        appFrame0.requestFocus();
        appFrame0.addNotify();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(appFrame0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jRootPane17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(point37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user38);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        gui.AppFrame appFrame0 = gui.AppFrame.getInstance();
        gui.AppFrame appFrame1 = null;
        gui.BookingInformationPage bookingInformationPage2 = new gui.BookingInformationPage(appFrame1);
        java.awt.Color color3 = null;
        bookingInformationPage2.setBackground(color3);
        bookingInformationPage2.show(false);
        java.awt.LayoutManager layoutManager7 = bookingInformationPage2.getLayout();
        gui.AppFrame appFrame8 = null;
        gui.BookingInformationPage bookingInformationPage9 = new gui.BookingInformationPage(appFrame8);
        java.awt.Color color10 = null;
        bookingInformationPage9.setBackground(color10);
        bookingInformationPage9.show(false);
        java.awt.Color color14 = bookingInformationPage9.getForeground();
        bookingInformationPage2.setBackground(color14);
        appFrame0.setBackground(color14);
        javax.swing.JRootPane jRootPane17 = appFrame0.getRootPane();
        gui.AppFrame appFrame18 = null;
        gui.BookingInformationPage bookingInformationPage19 = new gui.BookingInformationPage(appFrame18);
        java.awt.Color color20 = null;
        bookingInformationPage19.setBackground(color20);
        bookingInformationPage19.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension24 = null;
        bookingInformationPage19.setPreferredSize(dimension24);
        gui.AppFrame appFrame26 = null;
        gui.BookingInformationPage bookingInformationPage27 = new gui.BookingInformationPage(appFrame26);
        java.awt.Color color28 = null;
        bookingInformationPage27.setBackground(color28);
        bookingInformationPage27.show(false);
        java.awt.LayoutManager layoutManager32 = bookingInformationPage27.getLayout();
        bookingInformationPage19.putClientProperty((java.lang.Object) layoutManager32, (java.lang.Object) 0);
        appFrame0.setLayout(layoutManager32);
        java.awt.Point point37 = appFrame0.getMousePosition(false);
        userManagement.User user38 = appFrame0.getCurrentUser();
        appFrame0.createBufferStrategy((int) (short) 100);
        appFrame0.show();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(appFrame0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jRootPane17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(point37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user38);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        gui.AppFrame appFrame0 = gui.AppFrame.getInstance();
        int int1 = appFrame0.getExtendedState();
        java.awt.Event event2 = null;
        boolean boolean4 = appFrame0.keyUp(event2, (int) (byte) 10);
        int int5 = appFrame0.getExtendedState();
        administratorManagement.Administrator administrator11 = new administratorManagement.Administrator("LOGIN", "EXTEND BOOKING", "BOOKING", (int) '4', false);
        boolean boolean13 = administrator11.disableRoom("CREATE ROOM");
        java.lang.String str14 = administrator11.getEmail();
        appFrame0.setCurrentAdministrator(administrator11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(appFrame0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "BOOKING" + "'", str14.equals("BOOKING"));
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        gui.AppFrame appFrame0 = gui.AppFrame.getInstance();
        gui.AppFrame appFrame1 = null;
        gui.BookingInformationPage bookingInformationPage2 = new gui.BookingInformationPage(appFrame1);
        java.awt.Color color3 = null;
        bookingInformationPage2.setBackground(color3);
        bookingInformationPage2.show(false);
        java.awt.LayoutManager layoutManager7 = bookingInformationPage2.getLayout();
        gui.AppFrame appFrame8 = null;
        gui.BookingInformationPage bookingInformationPage9 = new gui.BookingInformationPage(appFrame8);
        java.awt.Color color10 = null;
        bookingInformationPage9.setBackground(color10);
        bookingInformationPage9.show(false);
        java.awt.Color color14 = bookingInformationPage9.getForeground();
        bookingInformationPage2.setBackground(color14);
        appFrame0.setBackground(color14);
        boolean boolean17 = appFrame0.isFocused();
        java.awt.MenuBar menuBar18 = null;
        appFrame0.setMenuBar(menuBar18);
        appFrame0.pack();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(appFrame0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.setVerifyInputWhenFocusTarget(true);
        java.awt.event.FocusListener[] focusListenerArray6 = bookingInformationPage1.getFocusListeners();
        javax.swing.KeyStroke keyStroke7 = null;
        int int8 = bookingInformationPage1.getConditionForKeyStroke(keyStroke7);
        gui.AppFrame appFrame9 = null;
        gui.WelcomePage welcomePage10 = new gui.WelcomePage(appFrame9);
        gui.AppFrame appFrame11 = null;
        gui.BookingInformationPage bookingInformationPage12 = new gui.BookingInformationPage(appFrame11);
        java.awt.Color color13 = null;
        bookingInformationPage12.setBackground(color13);
        bookingInformationPage12.show(false);
        java.awt.LayoutManager layoutManager17 = bookingInformationPage12.getLayout();
        java.awt.Point point18 = null;
        java.awt.Point point19 = bookingInformationPage12.getLocation(point18);
        boolean boolean20 = welcomePage10.contains(point19);
        java.awt.Point point21 = bookingInformationPage1.getLocation(point19);
        gui.AppFrame appFrame22 = null;
        gui.BookingInformationPage bookingInformationPage23 = new gui.BookingInformationPage(appFrame22);
        java.awt.Color color24 = null;
        bookingInformationPage23.setBackground(color24);
        bookingInformationPage23.show(false);
        java.awt.Color color28 = bookingInformationPage23.getForeground();
        bookingInformationPage1.setForeground(color28);
        java.awt.event.HierarchyListener[] hierarchyListenerArray30 = bookingInformationPage1.getHierarchyListeners();
        java.beans.VetoableChangeListener[] vetoableChangeListenerArray31 = bookingInformationPage1.getVetoableChangeListeners();
        java.awt.image.ColorModel colorModel32 = bookingInformationPage1.getColorModel();
        java.awt.event.InputMethodListener inputMethodListener33 = null;
        bookingInformationPage1.removeInputMethodListener(inputMethodListener33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(focusListenerArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(point19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(point21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hierarchyListenerArray30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vetoableChangeListenerArray31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(colorModel32);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.show(false);
        java.awt.Color color6 = bookingInformationPage1.getForeground();
        int int7 = bookingInformationPage1.getWidth();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior8 = bookingInformationPage1.getBaselineResizeBehavior();
        bookingInformationPage1.setRequestFocusEnabled(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior8 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior8.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        gui.AppFrame appFrame0 = gui.AppFrame.getInstance();
        gui.AppFrame appFrame1 = null;
        gui.BookingInformationPage bookingInformationPage2 = new gui.BookingInformationPage(appFrame1);
        java.awt.Color color3 = null;
        bookingInformationPage2.setBackground(color3);
        bookingInformationPage2.show(false);
        java.awt.LayoutManager layoutManager7 = bookingInformationPage2.getLayout();
        gui.AppFrame appFrame8 = null;
        gui.BookingInformationPage bookingInformationPage9 = new gui.BookingInformationPage(appFrame8);
        java.awt.Color color10 = null;
        bookingInformationPage9.setBackground(color10);
        bookingInformationPage9.show(false);
        java.awt.Color color14 = bookingInformationPage9.getForeground();
        bookingInformationPage2.setBackground(color14);
        appFrame0.setBackground(color14);
        javax.swing.JRootPane jRootPane17 = appFrame0.getRootPane();
        gui.AppFrame appFrame18 = null;
        gui.BookingInformationPage bookingInformationPage19 = new gui.BookingInformationPage(appFrame18);
        java.awt.Color color20 = null;
        bookingInformationPage19.setBackground(color20);
        bookingInformationPage19.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension24 = null;
        bookingInformationPage19.setPreferredSize(dimension24);
        gui.AppFrame appFrame26 = null;
        gui.BookingInformationPage bookingInformationPage27 = new gui.BookingInformationPage(appFrame26);
        java.awt.Color color28 = null;
        bookingInformationPage27.setBackground(color28);
        bookingInformationPage27.show(false);
        java.awt.LayoutManager layoutManager32 = bookingInformationPage27.getLayout();
        bookingInformationPage19.putClientProperty((java.lang.Object) layoutManager32, (java.lang.Object) 0);
        appFrame0.setLayout(layoutManager32);
        java.awt.Point point37 = appFrame0.getMousePosition(false);
        userManagement.User user38 = appFrame0.getCurrentUser();
        appFrame0.createBufferStrategy((int) (short) 100);
        boolean boolean41 = appFrame0.isValidateRoot();
        gui.AppFrame appFrame42 = gui.AppFrame.getInstance();
        gui.AppFrame appFrame43 = null;
        gui.BookingInformationPage bookingInformationPage44 = new gui.BookingInformationPage(appFrame43);
        java.awt.Color color45 = null;
        bookingInformationPage44.setBackground(color45);
        bookingInformationPage44.show(false);
        java.awt.LayoutManager layoutManager49 = bookingInformationPage44.getLayout();
        gui.AppFrame appFrame50 = null;
        gui.BookingInformationPage bookingInformationPage51 = new gui.BookingInformationPage(appFrame50);
        java.awt.Color color52 = null;
        bookingInformationPage51.setBackground(color52);
        bookingInformationPage51.show(false);
        java.awt.Color color56 = bookingInformationPage51.getForeground();
        bookingInformationPage44.setBackground(color56);
        appFrame42.setBackground(color56);
        appFrame42.toFront();
        java.awt.event.WindowStateListener[] windowStateListenerArray60 = appFrame42.getWindowStateListeners();
        userManagement.User user61 = null;
        appFrame42.setCurrentUser(user61);
        java.awt.Window.Type type63 = appFrame42.getType();
        // The following exception was thrown during execution in test generation
        try {
            appFrame0.setType(type63);
            org.junit.Assert.fail("Expected exception of type java.awt.IllegalComponentStateException; message: The window is displayable.");
        } catch (java.awt.IllegalComponentStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(appFrame0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jRootPane17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(point37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(appFrame42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(windowStateListenerArray60);
        org.junit.Assert.assertTrue("'" + type63 + "' != '" + java.awt.Window.Type.NORMAL + "'", type63.equals(java.awt.Window.Type.NORMAL));
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension6 = null;
        bookingInformationPage1.setPreferredSize(dimension6);
        java.awt.Event event8 = null;
        boolean boolean11 = bookingInformationPage1.mouseExit(event8, 10, (int) (byte) 10);
        java.awt.event.KeyListener[] keyListenerArray12 = bookingInformationPage1.getKeyListeners();
        gui.AppFrame appFrame13 = null;
        gui.WelcomePage welcomePage14 = new gui.WelcomePage(appFrame13);
        gui.AppFrame appFrame15 = null;
        gui.BookingInformationPage bookingInformationPage16 = new gui.BookingInformationPage(appFrame15);
        java.awt.Color color17 = null;
        bookingInformationPage16.setBackground(color17);
        bookingInformationPage16.show(false);
        java.awt.LayoutManager layoutManager21 = bookingInformationPage16.getLayout();
        java.awt.Point point22 = null;
        java.awt.Point point23 = bookingInformationPage16.getLocation(point22);
        boolean boolean24 = welcomePage14.contains(point23);
        bookingInformationPage1.setLocation(point23);
        bookingInformationPage1.repaint(0L, 7, (-1), 50, 12);
        bookingInformationPage1.repaint((long) 40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyListenerArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(point23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        payment.DebitCardPayment debitCardPayment5 = new payment.DebitCardPayment((double) (-1L), "ROOM OPTIONS", "LOGIN", "PAYMENT", 1);
        gui.PaymentPage.paymentMethod((payment.Payment) debitCardPayment5);
        double double7 = debitCardPayment5.calculateDeposit();
        payment.Context context8 = new payment.Context((payment.Payment) debitCardPayment5);
        // The following exception was thrown during execution in test generation
        try {
            double double9 = debitCardPayment5.calculateCost();
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: begin 0, end -1, length 12");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.5d + "'", double7 == 1.5d);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        gui.AppFrame appFrame0 = gui.AppFrame.getInstance();
        int int1 = appFrame0.getExtendedState();
        boolean boolean2 = appFrame0.isShowing();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(appFrame0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        gui.AppFrame appFrame0 = gui.AppFrame.getInstance();
        java.awt.event.WindowListener windowListener1 = null;
        appFrame0.addWindowListener(windowListener1);
        boolean boolean3 = appFrame0.isActive();
        int int4 = appFrame0.getExtendedState();
        appFrame0.setAutoRequestFocus(false);
        administratorManagement.Administrator administrator7 = appFrame0.getCurrentAdministrator();
        java.awt.LayoutManager layoutManager8 = appFrame0.getLayout();
        java.awt.Image image9 = null;
        appFrame0.setIconImage(image9);
        gui.AppFrame appFrame11 = null;
        gui.RoomOptionsPage roomOptionsPage12 = new gui.RoomOptionsPage(appFrame11);
        gui.AppFrame appFrame13 = null;
        gui.BookingInformationPage bookingInformationPage14 = new gui.BookingInformationPage(appFrame13);
        java.awt.Color color15 = null;
        bookingInformationPage14.setBackground(color15);
        bookingInformationPage14.show(false);
        java.awt.LayoutManager layoutManager19 = bookingInformationPage14.getLayout();
        bookingInformationPage14.transferFocus();
        int int21 = roomOptionsPage12.getComponentZOrder((java.awt.Component) bookingInformationPage14);
        bookingInformationPage14.layout();
        java.awt.Color color23 = bookingInformationPage14.getForeground();
        appFrame0.setBackground(color23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(appFrame0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(administrator7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color23);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.show(false);
        java.awt.Color color6 = bookingInformationPage1.getForeground();
        java.awt.FocusTraversalPolicy focusTraversalPolicy7 = null;
        bookingInformationPage1.setFocusTraversalPolicy(focusTraversalPolicy7);
        boolean boolean9 = bookingInformationPage1.isFocusTraversalPolicyProvider();
        bookingInformationPage1.setBounds(0, (-1), 10, 8);
        float float15 = bookingInformationPage1.getAlignmentY();
        gui.AppFrame appFrame16 = null;
        gui.BookingInformationPage bookingInformationPage17 = new gui.BookingInformationPage(appFrame16);
        java.awt.Color color18 = null;
        bookingInformationPage17.setBackground(color18);
        bookingInformationPage17.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension22 = null;
        bookingInformationPage17.setPreferredSize(dimension22);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray24 = bookingInformationPage17.getPropertyChangeListeners();
        boolean boolean25 = bookingInformationPage17.isOpaque();
        java.beans.VetoableChangeListener vetoableChangeListener26 = null;
        bookingInformationPage17.removeVetoableChangeListener(vetoableChangeListener26);
        java.awt.Event event28 = null;
        gui.AppFrame appFrame29 = null;
        gui.BookingInformationPage bookingInformationPage30 = new gui.BookingInformationPage(appFrame29);
        java.util.Locale locale31 = null;
        bookingInformationPage30.setLocale(locale31);
        boolean boolean33 = bookingInformationPage17.gotFocus(event28, (java.lang.Object) bookingInformationPage30);
        bookingInformationPage17.disable();
        java.awt.Dimension dimension35 = bookingInformationPage17.minimumSize();
        java.awt.Dimension dimension36 = bookingInformationPage1.getSize(dimension35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 0.5f + "'", float15 == 0.5f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(propertyChangeListenerArray24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dimension35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dimension36);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        gui.AppFrame appFrame0 = gui.AppFrame.getInstance();
        gui.AppFrame appFrame1 = null;
        gui.BookingInformationPage bookingInformationPage2 = new gui.BookingInformationPage(appFrame1);
        java.awt.Color color3 = null;
        bookingInformationPage2.setBackground(color3);
        bookingInformationPage2.show(false);
        java.awt.LayoutManager layoutManager7 = bookingInformationPage2.getLayout();
        gui.AppFrame appFrame8 = null;
        gui.BookingInformationPage bookingInformationPage9 = new gui.BookingInformationPage(appFrame8);
        java.awt.Color color10 = null;
        bookingInformationPage9.setBackground(color10);
        bookingInformationPage9.show(false);
        java.awt.Color color14 = bookingInformationPage9.getForeground();
        bookingInformationPage2.setBackground(color14);
        appFrame0.setBackground(color14);
        appFrame0.toFront();
        java.awt.event.WindowStateListener[] windowStateListenerArray18 = appFrame0.getWindowStateListeners();
        java.awt.Container container19 = appFrame0.getFocusCycleRootAncestor();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(appFrame0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(windowStateListenerArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(container19);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        gui.AppFrame appFrame0 = gui.AppFrame.getInstance();
        gui.AppFrame appFrame1 = null;
        gui.BookingInformationPage bookingInformationPage2 = new gui.BookingInformationPage(appFrame1);
        java.awt.Color color3 = null;
        bookingInformationPage2.setBackground(color3);
        bookingInformationPage2.show(false);
        java.awt.LayoutManager layoutManager7 = bookingInformationPage2.getLayout();
        gui.AppFrame appFrame8 = null;
        gui.BookingInformationPage bookingInformationPage9 = new gui.BookingInformationPage(appFrame8);
        java.awt.Color color10 = null;
        bookingInformationPage9.setBackground(color10);
        bookingInformationPage9.show(false);
        java.awt.Color color14 = bookingInformationPage9.getForeground();
        bookingInformationPage2.setBackground(color14);
        appFrame0.setBackground(color14);
        appFrame0.toFront();
        java.awt.event.WindowStateListener[] windowStateListenerArray18 = appFrame0.getWindowStateListeners();
        appFrame0.pack();
        java.awt.im.InputContext inputContext20 = appFrame0.getInputContext();
        appFrame0.setState(16);
        appFrame0.validate();
        boolean boolean24 = appFrame0.isActive();
        gui.RoomOptionsPage roomOptionsPage25 = new gui.RoomOptionsPage(appFrame0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(appFrame0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(windowStateListenerArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(inputContext20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        roomStatus.EnabledState enabledState0 = new roomStatus.EnabledState();
        java.lang.String str1 = enabledState0.getStatus();
        roomManagement.Room room5 = new roomManagement.Room("CREATE ROOM", 9, "SCAN BADGE");
        boolean boolean6 = room5.maintenanceAndRepairsFinished();
        boolean boolean7 = enabledState0.disableRoom(room5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "ENABLED" + "'", str1.equals("ENABLED"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension6 = null;
        bookingInformationPage1.setPreferredSize(dimension6);
        java.awt.Event event8 = null;
        boolean boolean11 = bookingInformationPage1.mouseExit(event8, 10, (int) (byte) 10);
        java.awt.event.KeyListener[] keyListenerArray12 = bookingInformationPage1.getKeyListeners();
        java.awt.Image image13 = null;
        gui.AppFrame appFrame14 = null;
        gui.BookingInformationPage bookingInformationPage15 = new gui.BookingInformationPage(appFrame14);
        int int16 = bookingInformationPage1.checkImage(image13, (java.awt.image.ImageObserver) bookingInformationPage15);
        java.awt.Insets insets17 = bookingInformationPage1.getInsets();
        bookingInformationPage1.setVisible(true);
        bookingInformationPage1.disable();
        gui.AppFrame appFrame21 = null;
        gui.BookingInformationPage bookingInformationPage22 = new gui.BookingInformationPage(appFrame21);
        java.awt.Color color23 = null;
        bookingInformationPage22.setBackground(color23);
        bookingInformationPage22.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension27 = null;
        bookingInformationPage22.setPreferredSize(dimension27);
        java.awt.Graphics graphics29 = null;
        bookingInformationPage22.paintComponents(graphics29);
        java.awt.Event event31 = null;
        boolean boolean34 = bookingInformationPage22.mouseMove(event31, (int) (byte) -1, (int) 'a');
        gui.AppFrame appFrame35 = null;
        gui.BookingInformationPage bookingInformationPage36 = new gui.BookingInformationPage(appFrame35);
        java.awt.Color color37 = null;
        bookingInformationPage36.setBackground(color37);
        bookingInformationPage36.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension41 = null;
        bookingInformationPage36.setPreferredSize(dimension41);
        java.awt.Event event43 = null;
        boolean boolean46 = bookingInformationPage36.mouseExit(event43, 10, (int) (byte) 10);
        java.awt.event.KeyListener[] keyListenerArray47 = bookingInformationPage36.getKeyListeners();
        java.awt.Image image48 = null;
        gui.AppFrame appFrame49 = null;
        gui.BookingInformationPage bookingInformationPage50 = new gui.BookingInformationPage(appFrame49);
        int int51 = bookingInformationPage36.checkImage(image48, (java.awt.image.ImageObserver) bookingInformationPage50);
        gui.AppFrame appFrame52 = null;
        gui.BookingInformationPage bookingInformationPage53 = new gui.BookingInformationPage(appFrame52);
        java.awt.Color color54 = null;
        bookingInformationPage53.setBackground(color54);
        bookingInformationPage53.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension58 = null;
        bookingInformationPage53.setPreferredSize(dimension58);
        bookingInformationPage53.paintImmediately((int) (byte) 10, 10, 7, 64);
        java.lang.String str65 = bookingInformationPage53.toString();
        java.awt.Rectangle rectangle66 = null;
        java.awt.Rectangle rectangle67 = bookingInformationPage53.getBounds(rectangle66);
        java.awt.Rectangle rectangle68 = bookingInformationPage50.getBounds(rectangle66);
        java.awt.Rectangle rectangle69 = bookingInformationPage22.getBounds(rectangle66);
        bookingInformationPage1.repaint(rectangle69);
        java.util.Locale locale71 = bookingInformationPage1.getLocale();
        javax.swing.JComponent.setDefaultLocale(locale71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyListenerArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(insets17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyListenerArray47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 32 + "'", int51 == 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str65 + "' != '" + "gui.BookingInformationPage[,0,0,0x0,invalid,layout=java.awt.GridBagLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]" + "'", str65.equals("gui.BookingInformationPage[,0,0,0x0,invalid,layout=java.awt.GridBagLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rectangle67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rectangle68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rectangle69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(locale71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(locale71.toString(), "en_CA");
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        gui.AppFrame appFrame0 = null;
        gui.RoomOptionsPage roomOptionsPage1 = new gui.RoomOptionsPage(appFrame0);
        gui.AppFrame appFrame2 = null;
        gui.BookingInformationPage bookingInformationPage3 = new gui.BookingInformationPage(appFrame2);
        java.awt.Color color4 = null;
        bookingInformationPage3.setBackground(color4);
        bookingInformationPage3.show(false);
        java.awt.LayoutManager layoutManager8 = bookingInformationPage3.getLayout();
        bookingInformationPage3.transferFocus();
        int int10 = roomOptionsPage1.getComponentZOrder((java.awt.Component) bookingInformationPage3);
        boolean boolean13 = roomOptionsPage1.contains(32, 10);
        java.awt.event.KeyListener[] keyListenerArray14 = roomOptionsPage1.getKeyListeners();
        java.beans.VetoableChangeListener vetoableChangeListener15 = null;
        roomOptionsPage1.addVetoableChangeListener(vetoableChangeListener15);
        java.awt.AWTEvent aWTEvent17 = null;
        // The following exception was thrown during execution in test generation
        try {
            roomOptionsPage1.dispatchEvent(aWTEvent17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.AWTEvent.getID()\" because \"e\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyListenerArray14);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        javax.swing.plaf.PanelUI panelUI4 = null;
        bookingInformationPage1.setUI(panelUI4);
        javax.swing.KeyStroke keyStroke6 = null;
        bookingInformationPage1.unregisterKeyboardAction(keyStroke6);
        java.beans.PropertyChangeListener propertyChangeListener8 = null;
        bookingInformationPage1.addPropertyChangeListener(propertyChangeListener8);
        java.awt.ImageCapabilities imageCapabilities12 = null;
        java.awt.image.VolatileImage volatileImage13 = bookingInformationPage1.createVolatileImage(10, 32, imageCapabilities12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(volatileImage13);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.util.Locale locale2 = null;
        bookingInformationPage1.setLocale(locale2);
        java.awt.dnd.DropTarget dropTarget4 = bookingInformationPage1.getDropTarget();
        java.awt.Image image5 = null;
        gui.AppFrame appFrame6 = null;
        gui.BookingInformationPage bookingInformationPage7 = new gui.BookingInformationPage(appFrame6);
        java.awt.Color color8 = null;
        bookingInformationPage7.setBackground(color8);
        bookingInformationPage7.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension12 = null;
        bookingInformationPage7.setPreferredSize(dimension12);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray14 = bookingInformationPage7.getPropertyChangeListeners();
        boolean boolean15 = bookingInformationPage7.isOpaque();
        java.beans.VetoableChangeListener vetoableChangeListener16 = null;
        bookingInformationPage7.removeVetoableChangeListener(vetoableChangeListener16);
        java.awt.Event event18 = null;
        gui.AppFrame appFrame19 = null;
        gui.BookingInformationPage bookingInformationPage20 = new gui.BookingInformationPage(appFrame19);
        java.util.Locale locale21 = null;
        bookingInformationPage20.setLocale(locale21);
        boolean boolean23 = bookingInformationPage7.gotFocus(event18, (java.lang.Object) bookingInformationPage20);
        bookingInformationPage7.disable();
        java.beans.PropertyChangeListener propertyChangeListener25 = null;
        bookingInformationPage7.addPropertyChangeListener(propertyChangeListener25);
        java.awt.Image image27 = null;
        gui.AppFrame appFrame28 = null;
        gui.BookingInformationPage bookingInformationPage29 = new gui.BookingInformationPage(appFrame28);
        java.awt.Color color30 = null;
        bookingInformationPage29.setBackground(color30);
        bookingInformationPage29.setVerifyInputWhenFocusTarget(true);
        java.awt.Graphics graphics34 = null;
        bookingInformationPage29.printAll(graphics34);
        int int36 = bookingInformationPage7.checkImage(image27, (java.awt.image.ImageObserver) bookingInformationPage29);
        boolean boolean37 = bookingInformationPage1.prepareImage(image5, (java.awt.image.ImageObserver) bookingInformationPage7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(dropTarget4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(propertyChangeListenerArray14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 32 + "'", int36 == 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension6 = null;
        bookingInformationPage1.setPreferredSize(dimension6);
        bookingInformationPage1.firePropertyChange("hi!", false, true);
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior12 = bookingInformationPage1.getBaselineResizeBehavior();
        gui.AppFrame appFrame13 = null;
        gui.BookingInformationPage bookingInformationPage14 = new gui.BookingInformationPage(appFrame13);
        java.awt.Color color15 = null;
        bookingInformationPage14.setBackground(color15);
        bookingInformationPage14.show(false);
        java.awt.Color color19 = bookingInformationPage14.getForeground();
        bookingInformationPage14.removeNotify();
        java.awt.Event event21 = null;
        boolean boolean23 = bookingInformationPage14.gotFocus(event21, (java.lang.Object) false);
        java.awt.LayoutManager layoutManager24 = bookingInformationPage14.getLayout();
        gui.AppFrame appFrame25 = gui.AppFrame.getInstance();
        gui.AppFrame appFrame26 = null;
        gui.BookingInformationPage bookingInformationPage27 = new gui.BookingInformationPage(appFrame26);
        java.awt.Color color28 = null;
        bookingInformationPage27.setBackground(color28);
        bookingInformationPage27.show(false);
        java.awt.LayoutManager layoutManager32 = bookingInformationPage27.getLayout();
        gui.AppFrame appFrame33 = null;
        gui.BookingInformationPage bookingInformationPage34 = new gui.BookingInformationPage(appFrame33);
        java.awt.Color color35 = null;
        bookingInformationPage34.setBackground(color35);
        bookingInformationPage34.show(false);
        java.awt.Color color39 = bookingInformationPage34.getForeground();
        bookingInformationPage27.setBackground(color39);
        appFrame25.setBackground(color39);
        boolean boolean42 = appFrame25.isFocused();
        java.awt.MenuComponent menuComponent43 = null;
        appFrame25.remove(menuComponent43);
        gui.SignUpPage signUpPage45 = new gui.SignUpPage(appFrame25);
        boolean boolean46 = appFrame25.isValidateRoot();
        java.awt.Graphics graphics47 = appFrame25.getGraphics();
        bookingInformationPage14.printAll(graphics47);
        bookingInformationPage1.paintAll(graphics47);
        java.awt.Dimension dimension50 = bookingInformationPage1.getMinimumSize();
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior12 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior12.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(appFrame25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(graphics47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dimension50);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        gui.AppFrame appFrame0 = gui.AppFrame.getInstance();
        gui.AppFrame appFrame1 = null;
        gui.BookingInformationPage bookingInformationPage2 = new gui.BookingInformationPage(appFrame1);
        java.awt.Color color3 = null;
        bookingInformationPage2.setBackground(color3);
        bookingInformationPage2.show(false);
        java.awt.LayoutManager layoutManager7 = bookingInformationPage2.getLayout();
        gui.AppFrame appFrame8 = null;
        gui.BookingInformationPage bookingInformationPage9 = new gui.BookingInformationPage(appFrame8);
        java.awt.Color color10 = null;
        bookingInformationPage9.setBackground(color10);
        bookingInformationPage9.show(false);
        java.awt.Color color14 = bookingInformationPage9.getForeground();
        bookingInformationPage2.setBackground(color14);
        appFrame0.setBackground(color14);
        appFrame0.toFront();
        javax.swing.TransferHandler transferHandler18 = appFrame0.getTransferHandler();
        gui.AppFrame appFrame19 = null;
        gui.BookingInformationPage bookingInformationPage20 = new gui.BookingInformationPage(appFrame19);
        java.awt.Color color21 = null;
        bookingInformationPage20.setBackground(color21);
        bookingInformationPage20.show(false);
        java.awt.Color color25 = bookingInformationPage20.getForeground();
        appFrame0.setBackground(color25);
        java.awt.Image image27 = null;
        appFrame0.setIconImage(image27);
        java.awt.event.WindowStateListener[] windowStateListenerArray29 = appFrame0.getWindowStateListeners();
        java.awt.Component component30 = appFrame0.getFocusOwner();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(appFrame0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(transferHandler18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(windowStateListenerArray29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component30);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        gui.AppFrame appFrame0 = gui.AppFrame.getInstance();
        gui.AppFrame appFrame1 = null;
        gui.BookingInformationPage bookingInformationPage2 = new gui.BookingInformationPage(appFrame1);
        java.awt.Color color3 = null;
        bookingInformationPage2.setBackground(color3);
        bookingInformationPage2.show(false);
        java.awt.LayoutManager layoutManager7 = bookingInformationPage2.getLayout();
        gui.AppFrame appFrame8 = null;
        gui.BookingInformationPage bookingInformationPage9 = new gui.BookingInformationPage(appFrame8);
        java.awt.Color color10 = null;
        bookingInformationPage9.setBackground(color10);
        bookingInformationPage9.show(false);
        java.awt.Color color14 = bookingInformationPage9.getForeground();
        bookingInformationPage2.setBackground(color14);
        appFrame0.setBackground(color14);
        boolean boolean17 = appFrame0.isFocused();
        appFrame0.createBufferStrategy(8);
        javax.swing.JLayeredPane jLayeredPane20 = appFrame0.getLayeredPane();
        java.awt.event.ActionListener actionListener21 = null;
        javax.swing.KeyStroke keyStroke23 = null;
        // The following exception was thrown during execution in test generation
        try {
            jLayeredPane20.registerKeyboardAction(actionListener21, "gui.BookingInformationPage[,0,0,0x0,invalid,layout=java.awt.GridBagLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", keyStroke23, 64);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: condition must be one of JComponent.WHEN_IN_FOCUSED_WINDOW, JComponent.WHEN_FOCUSED or JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(appFrame0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jLayeredPane20);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        gui.AppFrame appFrame0 = gui.AppFrame.getInstance();
        gui.AppFrame appFrame1 = null;
        gui.BookingInformationPage bookingInformationPage2 = new gui.BookingInformationPage(appFrame1);
        java.awt.Color color3 = null;
        bookingInformationPage2.setBackground(color3);
        bookingInformationPage2.show(false);
        java.awt.LayoutManager layoutManager7 = bookingInformationPage2.getLayout();
        gui.AppFrame appFrame8 = null;
        gui.BookingInformationPage bookingInformationPage9 = new gui.BookingInformationPage(appFrame8);
        java.awt.Color color10 = null;
        bookingInformationPage9.setBackground(color10);
        bookingInformationPage9.show(false);
        java.awt.Color color14 = bookingInformationPage9.getForeground();
        bookingInformationPage2.setBackground(color14);
        appFrame0.setBackground(color14);
        javax.swing.JRootPane jRootPane17 = appFrame0.getRootPane();
        gui.AppFrame appFrame18 = null;
        gui.BookingInformationPage bookingInformationPage19 = new gui.BookingInformationPage(appFrame18);
        java.awt.Color color20 = null;
        bookingInformationPage19.setBackground(color20);
        bookingInformationPage19.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension24 = null;
        bookingInformationPage19.setPreferredSize(dimension24);
        gui.AppFrame appFrame26 = null;
        gui.BookingInformationPage bookingInformationPage27 = new gui.BookingInformationPage(appFrame26);
        java.awt.Color color28 = null;
        bookingInformationPage27.setBackground(color28);
        bookingInformationPage27.show(false);
        java.awt.LayoutManager layoutManager32 = bookingInformationPage27.getLayout();
        bookingInformationPage19.putClientProperty((java.lang.Object) layoutManager32, (java.lang.Object) 0);
        appFrame0.setLayout(layoutManager32);
        java.awt.Point point37 = appFrame0.getMousePosition(false);
        java.beans.PropertyChangeListener propertyChangeListener39 = null;
        appFrame0.addPropertyChangeListener("ROOM OPTIONS", propertyChangeListener39);
        appFrame0.setCursor(8);
        appFrame0.transferFocusUpCycle();
        appFrame0.toBack();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(appFrame0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jRootPane17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(point37);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.setSize((int) (byte) 100, (-1));
        java.awt.FocusTraversalPolicy focusTraversalPolicy7 = null;
        bookingInformationPage1.setFocusTraversalPolicy(focusTraversalPolicy7);
        boolean boolean9 = bookingInformationPage1.isPaintingForPrint();
        boolean boolean10 = bookingInformationPage1.isMaximumSizeSet();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        gui.AppFrame appFrame0 = null;
        gui.RoomOptionsPage roomOptionsPage1 = new gui.RoomOptionsPage(appFrame0);
        roomOptionsPage1.setLocation(50, 0);
        boolean boolean6 = roomOptionsPage1.requestFocus(true);
        java.awt.event.HierarchyBoundsListener hierarchyBoundsListener7 = null;
        roomOptionsPage1.addHierarchyBoundsListener(hierarchyBoundsListener7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        gui.AppFrame appFrame0 = gui.AppFrame.getInstance();
        gui.AppFrame appFrame1 = null;
        gui.BookingInformationPage bookingInformationPage2 = new gui.BookingInformationPage(appFrame1);
        java.awt.Color color3 = null;
        bookingInformationPage2.setBackground(color3);
        bookingInformationPage2.show(false);
        java.awt.LayoutManager layoutManager7 = bookingInformationPage2.getLayout();
        gui.AppFrame appFrame8 = null;
        gui.BookingInformationPage bookingInformationPage9 = new gui.BookingInformationPage(appFrame8);
        java.awt.Color color10 = null;
        bookingInformationPage9.setBackground(color10);
        bookingInformationPage9.show(false);
        java.awt.Color color14 = bookingInformationPage9.getForeground();
        bookingInformationPage2.setBackground(color14);
        appFrame0.setBackground(color14);
        appFrame0.toFront();
        java.awt.event.WindowStateListener[] windowStateListenerArray18 = appFrame0.getWindowStateListeners();
        userManagement.User user19 = null;
        appFrame0.setCurrentUser(user19);
        java.awt.Window.Type type21 = appFrame0.getType();
        appFrame0.firePropertyChange("gui.BookingInformationPage[,0,0,0x0,invalid,layout=java.awt.GridBagLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", (long) (short) 100, (long) 40);
        boolean boolean26 = appFrame0.isAutoRequestFocus();
        appFrame0.setBounds(40, 8, 52, 4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(appFrame0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(windowStateListenerArray18);
        org.junit.Assert.assertTrue("'" + type21 + "' != '" + java.awt.Window.Type.NORMAL + "'", type21.equals(java.awt.Window.Type.NORMAL));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        gui.AppFrame appFrame0 = gui.AppFrame.getInstance();
        gui.AppFrame appFrame1 = null;
        gui.BookingInformationPage bookingInformationPage2 = new gui.BookingInformationPage(appFrame1);
        java.awt.Color color3 = null;
        bookingInformationPage2.setBackground(color3);
        bookingInformationPage2.show(false);
        java.awt.LayoutManager layoutManager7 = bookingInformationPage2.getLayout();
        gui.AppFrame appFrame8 = null;
        gui.BookingInformationPage bookingInformationPage9 = new gui.BookingInformationPage(appFrame8);
        java.awt.Color color10 = null;
        bookingInformationPage9.setBackground(color10);
        bookingInformationPage9.show(false);
        java.awt.Color color14 = bookingInformationPage9.getForeground();
        bookingInformationPage2.setBackground(color14);
        appFrame0.setBackground(color14);
        appFrame0.toFront();
        javax.swing.TransferHandler transferHandler18 = appFrame0.getTransferHandler();
        gui.AppFrame appFrame19 = null;
        gui.BookingInformationPage bookingInformationPage20 = new gui.BookingInformationPage(appFrame19);
        java.awt.Color color21 = null;
        bookingInformationPage20.setBackground(color21);
        bookingInformationPage20.show(false);
        java.awt.Color color25 = bookingInformationPage20.getForeground();
        appFrame0.setBackground(color25);
        java.awt.Image image27 = null;
        appFrame0.setIconImage(image27);
        gui.AppFrame appFrame29 = gui.AppFrame.getInstance();
        gui.AppFrame appFrame30 = null;
        gui.BookingInformationPage bookingInformationPage31 = new gui.BookingInformationPage(appFrame30);
        java.awt.Color color32 = null;
        bookingInformationPage31.setBackground(color32);
        bookingInformationPage31.show(false);
        java.awt.LayoutManager layoutManager36 = bookingInformationPage31.getLayout();
        gui.AppFrame appFrame37 = null;
        gui.BookingInformationPage bookingInformationPage38 = new gui.BookingInformationPage(appFrame37);
        java.awt.Color color39 = null;
        bookingInformationPage38.setBackground(color39);
        bookingInformationPage38.show(false);
        java.awt.Color color43 = bookingInformationPage38.getForeground();
        bookingInformationPage31.setBackground(color43);
        appFrame29.setBackground(color43);
        appFrame29.toFront();
        java.awt.event.WindowStateListener[] windowStateListenerArray47 = appFrame29.getWindowStateListeners();
        userManagement.User user48 = null;
        appFrame29.setCurrentUser(user48);
        java.awt.Window.Type type50 = appFrame29.getType();
        // The following exception was thrown during execution in test generation
        try {
            appFrame0.setType(type50);
            org.junit.Assert.fail("Expected exception of type java.awt.IllegalComponentStateException; message: The window is displayable.");
        } catch (java.awt.IllegalComponentStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(appFrame0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(transferHandler18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(appFrame29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(windowStateListenerArray47);
        org.junit.Assert.assertTrue("'" + type50 + "' != '" + java.awt.Window.Type.NORMAL + "'", type50.equals(java.awt.Window.Type.NORMAL));
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        gui.AppFrame appFrame0 = gui.AppFrame.getInstance();
        gui.AppFrame appFrame1 = null;
        gui.BookingInformationPage bookingInformationPage2 = new gui.BookingInformationPage(appFrame1);
        java.awt.Color color3 = null;
        bookingInformationPage2.setBackground(color3);
        bookingInformationPage2.show(false);
        java.awt.LayoutManager layoutManager7 = bookingInformationPage2.getLayout();
        gui.AppFrame appFrame8 = null;
        gui.BookingInformationPage bookingInformationPage9 = new gui.BookingInformationPage(appFrame8);
        java.awt.Color color10 = null;
        bookingInformationPage9.setBackground(color10);
        bookingInformationPage9.show(false);
        java.awt.Color color14 = bookingInformationPage9.getForeground();
        bookingInformationPage2.setBackground(color14);
        appFrame0.setBackground(color14);
        boolean boolean17 = appFrame0.isFocused();
        java.awt.MenuComponent menuComponent18 = null;
        appFrame0.remove(menuComponent18);
        gui.SignUpPage signUpPage20 = new gui.SignUpPage(appFrame0);
        java.awt.MenuBar menuBar21 = null;
        appFrame0.setMenuBar(menuBar21);
        appFrame0.setTitle("DASHBOARD");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(appFrame0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color14);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.show(false);
        java.awt.Color color6 = bookingInformationPage1.getForeground();
        gui.AppFrame appFrame7 = null;
        gui.BookingInformationPage bookingInformationPage8 = new gui.BookingInformationPage(appFrame7);
        java.awt.Color color9 = null;
        bookingInformationPage8.setBackground(color9);
        bookingInformationPage8.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension13 = null;
        bookingInformationPage8.setPreferredSize(dimension13);
        int int15 = bookingInformationPage1.getComponentZOrder((java.awt.Component) bookingInformationPage8);
        java.awt.event.MouseListener mouseListener16 = null;
        bookingInformationPage8.addMouseListener(mouseListener16);
        java.awt.Image image18 = null;
        boolean boolean24 = bookingInformationPage8.imageUpdate(image18, (int) (byte) 0, 0, 40, (int) (byte) -1, 30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        payment.InstitutionsBilling institutionsBilling5 = new payment.InstitutionsBilling((double) (short) 1, "hi!", "PAYMENT", "PAYMENT", (int) '4');
        double double6 = institutionsBilling5.calculateDeposit();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 4.5d + "'", double6 == 4.5d);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        gui.AppFrame appFrame0 = gui.AppFrame.getInstance();
        gui.AppFrame appFrame1 = null;
        gui.BookingInformationPage bookingInformationPage2 = new gui.BookingInformationPage(appFrame1);
        java.awt.Color color3 = null;
        bookingInformationPage2.setBackground(color3);
        bookingInformationPage2.show(false);
        java.awt.LayoutManager layoutManager7 = bookingInformationPage2.getLayout();
        gui.AppFrame appFrame8 = null;
        gui.BookingInformationPage bookingInformationPage9 = new gui.BookingInformationPage(appFrame8);
        java.awt.Color color10 = null;
        bookingInformationPage9.setBackground(color10);
        bookingInformationPage9.show(false);
        java.awt.Color color14 = bookingInformationPage9.getForeground();
        bookingInformationPage2.setBackground(color14);
        appFrame0.setBackground(color14);
        boolean boolean17 = appFrame0.isFocused();
        java.awt.MenuBar menuBar18 = null;
        appFrame0.setMenuBar(menuBar18);
        appFrame0.setLocation(50, (int) (byte) 100);
        java.awt.event.WindowListener windowListener23 = null;
        appFrame0.addWindowListener(windowListener23);
        gui.LoginPage loginPage25 = new gui.LoginPage(appFrame0);
        gui.AppFrame appFrame26 = null;
        gui.BookingInformationPage bookingInformationPage27 = new gui.BookingInformationPage(appFrame26);
        java.awt.Color color28 = null;
        bookingInformationPage27.setBackground(color28);
        bookingInformationPage27.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension32 = null;
        bookingInformationPage27.setPreferredSize(dimension32);
        java.awt.Event event34 = null;
        boolean boolean37 = bookingInformationPage27.mouseExit(event34, 10, (int) (byte) 10);
        java.awt.event.KeyListener[] keyListenerArray38 = bookingInformationPage27.getKeyListeners();
        java.awt.Image image39 = null;
        gui.AppFrame appFrame40 = null;
        gui.BookingInformationPage bookingInformationPage41 = new gui.BookingInformationPage(appFrame40);
        int int42 = bookingInformationPage27.checkImage(image39, (java.awt.image.ImageObserver) bookingInformationPage41);
        gui.AppFrame appFrame43 = null;
        gui.BookingInformationPage bookingInformationPage44 = new gui.BookingInformationPage(appFrame43);
        java.awt.Color color45 = null;
        bookingInformationPage44.setBackground(color45);
        bookingInformationPage44.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension49 = null;
        bookingInformationPage44.setPreferredSize(dimension49);
        bookingInformationPage44.paintImmediately((int) (byte) 10, 10, 7, 64);
        java.lang.String str56 = bookingInformationPage44.toString();
        java.awt.Rectangle rectangle57 = null;
        java.awt.Rectangle rectangle58 = bookingInformationPage44.getBounds(rectangle57);
        java.awt.Rectangle rectangle59 = bookingInformationPage41.getBounds(rectangle57);
        appFrame0.setMaximizedBounds(rectangle57);
        java.io.PrintWriter printWriter61 = null;
        // The following exception was thrown during execution in test generation
        try {
            appFrame0.list(printWriter61);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(Object)\" because \"out\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(appFrame0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color14);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyListenerArray38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 32 + "'", int42 == 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "gui.BookingInformationPage[,0,0,0x0,invalid,layout=java.awt.GridBagLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]" + "'", str56.equals("gui.BookingInformationPage[,0,0,0x0,invalid,layout=java.awt.GridBagLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rectangle58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rectangle59);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        gui.AppFrame appFrame0 = gui.AppFrame.getInstance();
        gui.AppFrame appFrame1 = null;
        gui.BookingInformationPage bookingInformationPage2 = new gui.BookingInformationPage(appFrame1);
        java.awt.Color color3 = null;
        bookingInformationPage2.setBackground(color3);
        bookingInformationPage2.show(false);
        java.awt.LayoutManager layoutManager7 = bookingInformationPage2.getLayout();
        gui.AppFrame appFrame8 = null;
        gui.BookingInformationPage bookingInformationPage9 = new gui.BookingInformationPage(appFrame8);
        java.awt.Color color10 = null;
        bookingInformationPage9.setBackground(color10);
        bookingInformationPage9.show(false);
        java.awt.Color color14 = bookingInformationPage9.getForeground();
        bookingInformationPage2.setBackground(color14);
        appFrame0.setBackground(color14);
        javax.swing.JRootPane jRootPane17 = appFrame0.getRootPane();
        appFrame0.setLocation(128, 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(appFrame0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jRootPane17);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        gui.AppFrame appFrame0 = null;
        gui.RoomOptionsPage roomOptionsPage1 = new gui.RoomOptionsPage(appFrame0);
        roomOptionsPage1.setLocation(50, 0);
        java.awt.Component component7 = roomOptionsPage1.findComponentAt((int) (byte) 10, 0);
        gui.AppFrame appFrame8 = null;
        gui.BookingInformationPage bookingInformationPage9 = new gui.BookingInformationPage(appFrame8);
        java.awt.Color color10 = null;
        bookingInformationPage9.setBackground(color10);
        bookingInformationPage9.show(false);
        java.awt.LayoutManager layoutManager14 = bookingInformationPage9.getLayout();
        roomOptionsPage1.setLayout(layoutManager14);
        roomOptionsPage1.repaint();
        java.awt.AWTEvent aWTEvent17 = null;
        // The following exception was thrown during execution in test generation
        try {
            roomOptionsPage1.dispatchEvent(aWTEvent17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.awt.AWTEvent.getID()\" because \"e\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager14);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        gui.AppFrame appFrame0 = gui.AppFrame.getInstance();
        gui.AppFrame appFrame1 = null;
        gui.BookingInformationPage bookingInformationPage2 = new gui.BookingInformationPage(appFrame1);
        java.awt.Color color3 = null;
        bookingInformationPage2.setBackground(color3);
        bookingInformationPage2.show(false);
        java.awt.LayoutManager layoutManager7 = bookingInformationPage2.getLayout();
        gui.AppFrame appFrame8 = null;
        gui.BookingInformationPage bookingInformationPage9 = new gui.BookingInformationPage(appFrame8);
        java.awt.Color color10 = null;
        bookingInformationPage9.setBackground(color10);
        bookingInformationPage9.show(false);
        java.awt.Color color14 = bookingInformationPage9.getForeground();
        bookingInformationPage2.setBackground(color14);
        appFrame0.setBackground(color14);
        javax.swing.JRootPane jRootPane17 = appFrame0.getRootPane();
        gui.AppFrame appFrame18 = null;
        gui.BookingInformationPage bookingInformationPage19 = new gui.BookingInformationPage(appFrame18);
        java.awt.Color color20 = null;
        bookingInformationPage19.setBackground(color20);
        bookingInformationPage19.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension24 = null;
        bookingInformationPage19.setPreferredSize(dimension24);
        gui.AppFrame appFrame26 = null;
        gui.BookingInformationPage bookingInformationPage27 = new gui.BookingInformationPage(appFrame26);
        java.awt.Color color28 = null;
        bookingInformationPage27.setBackground(color28);
        bookingInformationPage27.show(false);
        java.awt.LayoutManager layoutManager32 = bookingInformationPage27.getLayout();
        bookingInformationPage19.putClientProperty((java.lang.Object) layoutManager32, (java.lang.Object) 0);
        appFrame0.setLayout(layoutManager32);
        java.awt.Point point37 = appFrame0.getMousePosition(false);
        java.awt.Rectangle rectangle38 = appFrame0.bounds();
        java.awt.event.WindowStateListener windowStateListener39 = null;
        appFrame0.addWindowStateListener(windowStateListener39);
        java.awt.Component component41 = appFrame0.getGlassPane();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(appFrame0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jRootPane17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(point37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rectangle38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(component41);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        gui.PaymentPage.setTypeOfPayment("data/users.csv");
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        javax.swing.plaf.PanelUI panelUI4 = null;
        bookingInformationPage1.setUI(panelUI4);
        java.awt.event.FocusListener[] focusListenerArray6 = bookingInformationPage1.getFocusListeners();
        java.awt.Image image7 = null;
        gui.AppFrame appFrame8 = gui.AppFrame.getInstance();
        gui.AppFrame appFrame9 = null;
        gui.BookingInformationPage bookingInformationPage10 = new gui.BookingInformationPage(appFrame9);
        java.awt.Color color11 = null;
        bookingInformationPage10.setBackground(color11);
        bookingInformationPage10.show(false);
        java.awt.LayoutManager layoutManager15 = bookingInformationPage10.getLayout();
        gui.AppFrame appFrame16 = null;
        gui.BookingInformationPage bookingInformationPage17 = new gui.BookingInformationPage(appFrame16);
        java.awt.Color color18 = null;
        bookingInformationPage17.setBackground(color18);
        bookingInformationPage17.show(false);
        java.awt.Color color22 = bookingInformationPage17.getForeground();
        bookingInformationPage10.setBackground(color22);
        appFrame8.setBackground(color22);
        java.awt.Toolkit toolkit25 = appFrame8.getToolkit();
        boolean boolean26 = bookingInformationPage1.prepareImage(image7, (java.awt.image.ImageObserver) appFrame8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(focusListenerArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(appFrame8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(toolkit25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        gui.AppFrame appFrame0 = gui.AppFrame.getInstance();
        gui.AppFrame appFrame1 = null;
        gui.BookingInformationPage bookingInformationPage2 = new gui.BookingInformationPage(appFrame1);
        java.awt.Color color3 = null;
        bookingInformationPage2.setBackground(color3);
        bookingInformationPage2.show(false);
        java.awt.LayoutManager layoutManager7 = bookingInformationPage2.getLayout();
        gui.AppFrame appFrame8 = null;
        gui.BookingInformationPage bookingInformationPage9 = new gui.BookingInformationPage(appFrame8);
        java.awt.Color color10 = null;
        bookingInformationPage9.setBackground(color10);
        bookingInformationPage9.show(false);
        java.awt.Color color14 = bookingInformationPage9.getForeground();
        bookingInformationPage2.setBackground(color14);
        appFrame0.setBackground(color14);
        boolean boolean17 = appFrame0.isFocused();
        java.awt.MenuBar menuBar18 = null;
        appFrame0.setMenuBar(menuBar18);
        appFrame0.setLocation(50, (int) (byte) 100);
        java.awt.event.WindowListener windowListener23 = null;
        appFrame0.addWindowListener(windowListener23);
        gui.LoginPage loginPage25 = new gui.LoginPage(appFrame0);
        java.awt.Component component26 = loginPage25.getNextFocusableComponent();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(appFrame0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color14);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component26);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        userManagement.Student student0 = new userManagement.Student();
        java.lang.String str1 = student0.getUserType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Student" + "'", str1.equals("Student"));
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.show(false);
        bookingInformationPage1.firePropertyChange("", 0, (int) ' ');
        boolean boolean12 = bookingInformationPage1.contains(16, (int) (byte) 1);
        bookingInformationPage1.addNotify();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension6 = null;
        bookingInformationPage1.setPreferredSize(dimension6);
        bookingInformationPage1.firePropertyChange("hi!", false, true);
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior12 = bookingInformationPage1.getBaselineResizeBehavior();
        bookingInformationPage1.setAlignmentX((float) 1);
        java.awt.event.FocusListener focusListener15 = null;
        bookingInformationPage1.removeFocusListener(focusListener15);
        java.awt.Color color17 = bookingInformationPage1.getBackground();
        boolean boolean18 = bookingInformationPage1.isVisible();
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior12 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior12.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(color17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        roomManagement.Room room4 = new roomManagement.Room("gui.BookingInformationPage[,0,0,0x0,invalid,layout=java.awt.GridBagLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", 10, "");
        roomMonitoring.Sensor sensor5 = new roomMonitoring.Sensor("", room4);
        java.lang.String str6 = sensor5.getSensorID();
        java.lang.String str7 = sensor5.getSensorID();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        gui.AppFrame appFrame0 = gui.AppFrame.getInstance();
        gui.AppFrame appFrame1 = null;
        gui.BookingInformationPage bookingInformationPage2 = new gui.BookingInformationPage(appFrame1);
        java.awt.Color color3 = null;
        bookingInformationPage2.setBackground(color3);
        bookingInformationPage2.show(false);
        java.awt.LayoutManager layoutManager7 = bookingInformationPage2.getLayout();
        gui.AppFrame appFrame8 = null;
        gui.BookingInformationPage bookingInformationPage9 = new gui.BookingInformationPage(appFrame8);
        java.awt.Color color10 = null;
        bookingInformationPage9.setBackground(color10);
        bookingInformationPage9.show(false);
        java.awt.Color color14 = bookingInformationPage9.getForeground();
        bookingInformationPage2.setBackground(color14);
        appFrame0.setBackground(color14);
        appFrame0.toFront();
        java.awt.event.WindowStateListener[] windowStateListenerArray18 = appFrame0.getWindowStateListeners();
        appFrame0.pack();
        java.awt.im.InputContext inputContext20 = appFrame0.getInputContext();
        appFrame0.setState(16);
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Component component24 = appFrame0.getComponent(52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: No such child: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(appFrame0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(windowStateListenerArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(inputContext20);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        gui.AppFrame appFrame0 = gui.AppFrame.getInstance();
        gui.PaymentPage paymentPage1 = new gui.PaymentPage(appFrame0);
        // The following exception was thrown during execution in test generation
        try {
            appFrame0.setUndecorated(false);
            org.junit.Assert.fail("Expected exception of type java.awt.IllegalComponentStateException; message: The frame is displayable.");
        } catch (java.awt.IllegalComponentStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(appFrame0);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.setSize((int) (byte) 100, (-1));
        java.awt.FocusTraversalPolicy focusTraversalPolicy7 = null;
        bookingInformationPage1.setFocusTraversalPolicy(focusTraversalPolicy7);
        java.awt.Event event9 = null;
        boolean boolean12 = bookingInformationPage1.mouseEnter(event9, 7, 6);
        bookingInformationPage1.enable(true);
        bookingInformationPage1.list();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        int int0 = java.awt.image.ImageObserver.ALLBITS;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32 + "'", int0 == 32);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        java.lang.String str0 = gui.AppFrame.CARD_SIGNUP;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "SIGNUP" + "'", str0.equals("SIGNUP"));
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        gui.AppFrame appFrame0 = gui.AppFrame.getInstance();
        gui.AppFrame appFrame1 = null;
        gui.BookingInformationPage bookingInformationPage2 = new gui.BookingInformationPage(appFrame1);
        java.awt.Color color3 = null;
        bookingInformationPage2.setBackground(color3);
        bookingInformationPage2.show(false);
        java.awt.LayoutManager layoutManager7 = bookingInformationPage2.getLayout();
        gui.AppFrame appFrame8 = null;
        gui.BookingInformationPage bookingInformationPage9 = new gui.BookingInformationPage(appFrame8);
        java.awt.Color color10 = null;
        bookingInformationPage9.setBackground(color10);
        bookingInformationPage9.show(false);
        java.awt.Color color14 = bookingInformationPage9.getForeground();
        bookingInformationPage2.setBackground(color14);
        appFrame0.setBackground(color14);
        boolean boolean17 = appFrame0.isFocused();
        javax.swing.TransferHandler transferHandler18 = appFrame0.getTransferHandler();
        // The following exception was thrown during execution in test generation
        try {
            appFrame0.setOpacity(10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The value of opacity should be in the range [0.0f .. 1.0f].");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(appFrame0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color14);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(transferHandler18);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        gui.AppFrame appFrame0 = gui.AppFrame.getInstance();
        gui.AppFrame appFrame1 = null;
        gui.BookingInformationPage bookingInformationPage2 = new gui.BookingInformationPage(appFrame1);
        java.awt.Color color3 = null;
        bookingInformationPage2.setBackground(color3);
        bookingInformationPage2.show(false);
        java.awt.LayoutManager layoutManager7 = bookingInformationPage2.getLayout();
        gui.AppFrame appFrame8 = null;
        gui.BookingInformationPage bookingInformationPage9 = new gui.BookingInformationPage(appFrame8);
        java.awt.Color color10 = null;
        bookingInformationPage9.setBackground(color10);
        bookingInformationPage9.show(false);
        java.awt.Color color14 = bookingInformationPage9.getForeground();
        bookingInformationPage2.setBackground(color14);
        appFrame0.setBackground(color14);
        javax.swing.JRootPane jRootPane17 = appFrame0.getRootPane();
        gui.AppFrame appFrame18 = null;
        gui.BookingInformationPage bookingInformationPage19 = new gui.BookingInformationPage(appFrame18);
        java.awt.Color color20 = null;
        bookingInformationPage19.setBackground(color20);
        bookingInformationPage19.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension24 = null;
        bookingInformationPage19.setPreferredSize(dimension24);
        gui.AppFrame appFrame26 = null;
        gui.BookingInformationPage bookingInformationPage27 = new gui.BookingInformationPage(appFrame26);
        java.awt.Color color28 = null;
        bookingInformationPage27.setBackground(color28);
        bookingInformationPage27.show(false);
        java.awt.LayoutManager layoutManager32 = bookingInformationPage27.getLayout();
        bookingInformationPage19.putClientProperty((java.lang.Object) layoutManager32, (java.lang.Object) 0);
        appFrame0.setLayout(layoutManager32);
        java.awt.Point point37 = appFrame0.getMousePosition(false);
        userManagement.User user38 = appFrame0.getCurrentUser();
        appFrame0.createBufferStrategy((int) (short) 100);
        gui.LoginPage loginPage41 = new gui.LoginPage(appFrame0);
        javax.swing.border.Border border42 = null;
        loginPage41.setBorder(border42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(appFrame0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jRootPane17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(point37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user38);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension6 = null;
        bookingInformationPage1.setPreferredSize(dimension6);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray8 = bookingInformationPage1.getPropertyChangeListeners();
        boolean boolean9 = bookingInformationPage1.isOpaque();
        java.beans.VetoableChangeListener vetoableChangeListener10 = null;
        bookingInformationPage1.removeVetoableChangeListener(vetoableChangeListener10);
        java.awt.Event event12 = null;
        gui.AppFrame appFrame13 = null;
        gui.BookingInformationPage bookingInformationPage14 = new gui.BookingInformationPage(appFrame13);
        java.util.Locale locale15 = null;
        bookingInformationPage14.setLocale(locale15);
        boolean boolean17 = bookingInformationPage1.gotFocus(event12, (java.lang.Object) bookingInformationPage14);
        bookingInformationPage1.disable();
        java.beans.PropertyChangeListener propertyChangeListener19 = null;
        bookingInformationPage1.addPropertyChangeListener(propertyChangeListener19);
        gui.AppFrame appFrame21 = null;
        gui.PaymentPage paymentPage22 = new gui.PaymentPage(appFrame21);
        boolean boolean23 = paymentPage22.isFocusable();
        java.awt.event.MouseEvent mouseEvent24 = null;
        java.awt.Point point25 = paymentPage22.getPopupLocation(mouseEvent24);
        paymentPage22.firePropertyChange("USER OPTIONS", 'a', 'a');
        gui.AppFrame appFrame30 = null;
        gui.BookingInformationPage bookingInformationPage31 = new gui.BookingInformationPage(appFrame30);
        java.util.Locale locale32 = null;
        bookingInformationPage31.setLocale(locale32);
        java.awt.Dimension dimension34 = bookingInformationPage31.minimumSize();
        paymentPage22.setMaximumSize(dimension34);
        bookingInformationPage1.setMaximumSize(dimension34);
        javax.accessibility.AccessibleContext accessibleContext37 = bookingInformationPage1.getAccessibleContext();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(propertyChangeListenerArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(point25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dimension34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(accessibleContext37);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        gui.AppFrame appFrame0 = gui.AppFrame.getInstance();
        int int1 = appFrame0.getExtendedState();
        java.awt.Event event2 = null;
        boolean boolean4 = appFrame0.keyUp(event2, (int) (byte) 10);
        int int5 = appFrame0.getExtendedState();
        gui.WelcomePage welcomePage6 = new gui.WelcomePage(appFrame0);
        java.awt.event.HierarchyListener[] hierarchyListenerArray7 = appFrame0.getHierarchyListeners();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(appFrame0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(hierarchyListenerArray7);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension6 = null;
        bookingInformationPage1.setPreferredSize(dimension6);
        gui.AppFrame appFrame8 = null;
        gui.BookingInformationPage bookingInformationPage9 = new gui.BookingInformationPage(appFrame8);
        java.awt.Color color10 = null;
        bookingInformationPage9.setBackground(color10);
        bookingInformationPage9.show(false);
        java.awt.LayoutManager layoutManager14 = bookingInformationPage9.getLayout();
        bookingInformationPage1.putClientProperty((java.lang.Object) layoutManager14, (java.lang.Object) 0);
        java.awt.ComponentOrientation componentOrientation17 = bookingInformationPage1.getComponentOrientation();
        gui.AppFrame appFrame18 = null;
        gui.BookingInformationPage bookingInformationPage19 = new gui.BookingInformationPage(appFrame18);
        java.awt.Color color20 = null;
        bookingInformationPage19.setBackground(color20);
        bookingInformationPage19.show(false);
        java.awt.Color color24 = bookingInformationPage19.getForeground();
        gui.AppFrame appFrame25 = null;
        gui.BookingInformationPage bookingInformationPage26 = new gui.BookingInformationPage(appFrame25);
        java.awt.Color color27 = null;
        bookingInformationPage26.setBackground(color27);
        bookingInformationPage26.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension31 = null;
        bookingInformationPage26.setPreferredSize(dimension31);
        int int33 = bookingInformationPage19.getComponentZOrder((java.awt.Component) bookingInformationPage26);
        java.awt.event.MouseListener mouseListener34 = null;
        bookingInformationPage26.addMouseListener(mouseListener34);
        bookingInformationPage26.resize(8, 8);
        java.awt.Image image39 = null;
        gui.AppFrame appFrame42 = null;
        gui.BookingInformationPage bookingInformationPage43 = new gui.BookingInformationPage(appFrame42);
        java.awt.Color color44 = null;
        bookingInformationPage43.setBackground(color44);
        bookingInformationPage43.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension48 = null;
        bookingInformationPage43.setPreferredSize(dimension48);
        java.awt.Event event50 = null;
        boolean boolean53 = bookingInformationPage43.mouseExit(event50, 10, (int) (byte) 10);
        java.awt.event.KeyListener[] keyListenerArray54 = bookingInformationPage43.getKeyListeners();
        gui.AppFrame appFrame55 = null;
        gui.WelcomePage welcomePage56 = new gui.WelcomePage(appFrame55);
        gui.AppFrame appFrame57 = null;
        gui.BookingInformationPage bookingInformationPage58 = new gui.BookingInformationPage(appFrame57);
        java.awt.Color color59 = null;
        bookingInformationPage58.setBackground(color59);
        bookingInformationPage58.show(false);
        java.awt.LayoutManager layoutManager63 = bookingInformationPage58.getLayout();
        java.awt.Point point64 = null;
        java.awt.Point point65 = bookingInformationPage58.getLocation(point64);
        boolean boolean66 = welcomePage56.contains(point65);
        bookingInformationPage43.setLocation(point65);
        int int68 = bookingInformationPage26.checkImage(image39, 30, (int) (byte) 100, (java.awt.image.ImageObserver) bookingInformationPage43);
        javax.swing.plaf.PanelUI panelUI69 = bookingInformationPage43.getUI();
        bookingInformationPage1.setUI(panelUI69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(componentOrientation17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyListenerArray54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(point65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 32 + "'", int68 == 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(panelUI69);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        gui.AppFrame appFrame0 = gui.AppFrame.getInstance();
        gui.AppFrame appFrame1 = null;
        gui.BookingInformationPage bookingInformationPage2 = new gui.BookingInformationPage(appFrame1);
        java.awt.Color color3 = null;
        bookingInformationPage2.setBackground(color3);
        bookingInformationPage2.show(false);
        java.awt.LayoutManager layoutManager7 = bookingInformationPage2.getLayout();
        gui.AppFrame appFrame8 = null;
        gui.BookingInformationPage bookingInformationPage9 = new gui.BookingInformationPage(appFrame8);
        java.awt.Color color10 = null;
        bookingInformationPage9.setBackground(color10);
        bookingInformationPage9.show(false);
        java.awt.Color color14 = bookingInformationPage9.getForeground();
        bookingInformationPage2.setBackground(color14);
        appFrame0.setBackground(color14);
        appFrame0.toFront();
        java.awt.event.WindowStateListener[] windowStateListenerArray18 = appFrame0.getWindowStateListeners();
        appFrame0.pack();
        java.awt.im.InputContext inputContext20 = appFrame0.getInputContext();
        appFrame0.setState(16);
        appFrame0.validate();
        boolean boolean24 = appFrame0.isActive();
        java.awt.Component component25 = appFrame0.getGlassPane();
        java.awt.Image image26 = null;
        gui.AppFrame appFrame29 = null;
        gui.WelcomePage welcomePage30 = new gui.WelcomePage(appFrame29);
        welcomePage30.setVisible(false);
        welcomePage30.firePropertyChange("EXTEND BOOKING", true, false);
        int int37 = component25.checkImage(image26, 32, 9, (java.awt.image.ImageObserver) welcomePage30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(appFrame0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(windowStateListenerArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(inputContext20);
        // Regression assertion (captures the current behavior of the code)
// flaky:         org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(component25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 32 + "'", int37 == 32);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.setSize((int) (byte) 100, (-1));
        bookingInformationPage1.setAutoscrolls(false);
        gui.AppFrame appFrame9 = null;
        gui.BookingInformationPage bookingInformationPage10 = new gui.BookingInformationPage(appFrame9);
        java.awt.Color color11 = null;
        bookingInformationPage10.setBackground(color11);
        bookingInformationPage10.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension15 = null;
        bookingInformationPage10.setPreferredSize(dimension15);
        java.awt.Event event17 = null;
        boolean boolean20 = bookingInformationPage10.mouseExit(event17, 10, (int) (byte) 10);
        java.awt.event.KeyListener[] keyListenerArray21 = bookingInformationPage10.getKeyListeners();
        java.awt.Image image22 = null;
        gui.AppFrame appFrame23 = null;
        gui.BookingInformationPage bookingInformationPage24 = new gui.BookingInformationPage(appFrame23);
        int int25 = bookingInformationPage10.checkImage(image22, (java.awt.image.ImageObserver) bookingInformationPage24);
        javax.swing.JPopupMenu jPopupMenu26 = bookingInformationPage24.getComponentPopupMenu();
        bookingInformationPage1.setNextFocusableComponent((java.awt.Component) jPopupMenu26);
        boolean boolean30 = bookingInformationPage1.contains(10, 12);
        boolean boolean31 = bookingInformationPage1.getInheritsPopupMenu();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyListenerArray21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 32 + "'", int25 == 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(jPopupMenu26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension6 = null;
        bookingInformationPage1.setPreferredSize(dimension6);
        java.awt.Event event8 = null;
        boolean boolean11 = bookingInformationPage1.mouseExit(event8, 10, (int) (byte) 10);
        java.awt.event.KeyListener[] keyListenerArray12 = bookingInformationPage1.getKeyListeners();
        java.awt.Image image13 = null;
        gui.AppFrame appFrame14 = null;
        gui.BookingInformationPage bookingInformationPage15 = new gui.BookingInformationPage(appFrame14);
        int int16 = bookingInformationPage1.checkImage(image13, (java.awt.image.ImageObserver) bookingInformationPage15);
        gui.AppFrame appFrame17 = null;
        gui.BookingInformationPage bookingInformationPage18 = new gui.BookingInformationPage(appFrame17);
        java.awt.Color color19 = null;
        bookingInformationPage18.setBackground(color19);
        bookingInformationPage18.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension23 = null;
        bookingInformationPage18.setPreferredSize(dimension23);
        bookingInformationPage18.paintImmediately((int) (byte) 10, 10, 7, 64);
        java.lang.String str30 = bookingInformationPage18.toString();
        java.awt.Rectangle rectangle31 = null;
        java.awt.Rectangle rectangle32 = bookingInformationPage18.getBounds(rectangle31);
        java.awt.Rectangle rectangle33 = bookingInformationPage15.getBounds(rectangle31);
        java.awt.Image image36 = bookingInformationPage15.createImage(30, 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyListenerArray12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "gui.BookingInformationPage[,0,0,0x0,invalid,layout=java.awt.GridBagLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]" + "'", str30.equals("gui.BookingInformationPage[,0,0,0x0,invalid,layout=java.awt.GridBagLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rectangle32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rectangle33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(image36);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.show(false);
        java.awt.Color color6 = bookingInformationPage1.getForeground();
        gui.AppFrame appFrame7 = null;
        gui.BookingInformationPage bookingInformationPage8 = new gui.BookingInformationPage(appFrame7);
        java.awt.Color color9 = null;
        bookingInformationPage8.setBackground(color9);
        bookingInformationPage8.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension13 = null;
        bookingInformationPage8.setPreferredSize(dimension13);
        int int15 = bookingInformationPage1.getComponentZOrder((java.awt.Component) bookingInformationPage8);
        boolean boolean18 = bookingInformationPage8.contains(50, 4);
        java.awt.Event event19 = null;
        gui.AppFrame appFrame20 = gui.AppFrame.getInstance();
        gui.AppFrame appFrame21 = null;
        gui.BookingInformationPage bookingInformationPage22 = new gui.BookingInformationPage(appFrame21);
        java.awt.Color color23 = null;
        bookingInformationPage22.setBackground(color23);
        bookingInformationPage22.show(false);
        java.awt.LayoutManager layoutManager27 = bookingInformationPage22.getLayout();
        gui.AppFrame appFrame28 = null;
        gui.BookingInformationPage bookingInformationPage29 = new gui.BookingInformationPage(appFrame28);
        java.awt.Color color30 = null;
        bookingInformationPage29.setBackground(color30);
        bookingInformationPage29.show(false);
        java.awt.Color color34 = bookingInformationPage29.getForeground();
        bookingInformationPage22.setBackground(color34);
        appFrame20.setBackground(color34);
        javax.swing.JRootPane jRootPane37 = appFrame20.getRootPane();
        gui.AppFrame appFrame38 = null;
        gui.BookingInformationPage bookingInformationPage39 = new gui.BookingInformationPage(appFrame38);
        java.awt.Color color40 = null;
        bookingInformationPage39.setBackground(color40);
        bookingInformationPage39.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension44 = null;
        bookingInformationPage39.setPreferredSize(dimension44);
        gui.AppFrame appFrame46 = null;
        gui.BookingInformationPage bookingInformationPage47 = new gui.BookingInformationPage(appFrame46);
        java.awt.Color color48 = null;
        bookingInformationPage47.setBackground(color48);
        bookingInformationPage47.show(false);
        java.awt.LayoutManager layoutManager52 = bookingInformationPage47.getLayout();
        bookingInformationPage39.putClientProperty((java.lang.Object) layoutManager52, (java.lang.Object) 0);
        appFrame20.setLayout(layoutManager52);
        gui.WelcomePage welcomePage56 = new gui.WelcomePage(appFrame20);
        boolean boolean57 = bookingInformationPage8.lostFocus(event19, (java.lang.Object) welcomePage56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(appFrame20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jRootPane37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        dataManagement.MaintainAdministrator maintainAdministrator0 = new dataManagement.MaintainAdministrator();
        administratorManagement.Administrator administrator3 = maintainAdministrator0.authenticate("", "MANAGE ROOMS");
        maintainAdministrator0.load("");
        administratorManagement.Administrator administrator11 = new administratorManagement.Administrator("LOGIN", "EXTEND BOOKING", "BOOKING", (int) '4', false);
        maintainAdministrator0.addAdmin(administrator11);
        java.lang.String str14 = administrator11.getAssignedRoomID("PAYMENT");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(administrator3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        gui.AppFrame appFrame0 = gui.AppFrame.getInstance();
        gui.AppFrame appFrame1 = null;
        gui.BookingInformationPage bookingInformationPage2 = new gui.BookingInformationPage(appFrame1);
        java.awt.Color color3 = null;
        bookingInformationPage2.setBackground(color3);
        bookingInformationPage2.show(false);
        java.awt.LayoutManager layoutManager7 = bookingInformationPage2.getLayout();
        gui.AppFrame appFrame8 = null;
        gui.BookingInformationPage bookingInformationPage9 = new gui.BookingInformationPage(appFrame8);
        java.awt.Color color10 = null;
        bookingInformationPage9.setBackground(color10);
        bookingInformationPage9.show(false);
        java.awt.Color color14 = bookingInformationPage9.getForeground();
        bookingInformationPage2.setBackground(color14);
        appFrame0.setBackground(color14);
        appFrame0.toFront();
        java.awt.event.WindowStateListener[] windowStateListenerArray18 = appFrame0.getWindowStateListeners();
        userManagement.User user19 = null;
        appFrame0.setCurrentUser(user19);
        java.awt.Window.Type type21 = appFrame0.getType();
        java.lang.Object obj22 = appFrame0.getTreeLock();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(appFrame0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(windowStateListenerArray18);
        org.junit.Assert.assertTrue("'" + type21 + "' != '" + java.awt.Window.Type.NORMAL + "'", type21.equals(java.awt.Window.Type.NORMAL));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(obj22);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        java.util.Date date3 = null;
        bookingManagment.Booking booking9 = new bookingManagment.Booking("hi!", "ROOM OPTIONS", "ROOM OPTIONS", date3, "ROOM OPTIONS", "gui.BookingInformationPage[,0,0,0x0,invalid,layout=java.awt.GridBagLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", (double) (-1), (double) (short) -1, (double) (-1));
        java.lang.String str10 = booking9.getUserID();
        java.lang.String str11 = booking9.getStartTime();
        java.lang.String str12 = booking9.getRoomID();
        java.util.Date date13 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = booking9.hasStarted(date13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "ROOM OPTIONS" + "'", str11.equals("ROOM OPTIONS"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "ROOM OPTIONS" + "'", str12.equals("ROOM OPTIONS"));
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        dataManagement.MaintainUser maintainUser0 = new dataManagement.MaintainUser();
        userManagement.User user3 = maintainUser0.authenticate("", "PAYMENT");
        userManagement.User user6 = maintainUser0.authenticate("Staff [username=null, email=null, id=0]", "ENABLED");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user6);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.show(false);
        java.awt.Color color6 = bookingInformationPage1.getForeground();
        bookingInformationPage1.removeNotify();
        java.awt.Event event8 = null;
        boolean boolean10 = bookingInformationPage1.gotFocus(event8, (java.lang.Object) false);
        java.awt.event.MouseMotionListener[] mouseMotionListenerArray11 = bookingInformationPage1.getMouseMotionListeners();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(mouseMotionListenerArray11);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date2 = bookingManagment.Booking.combineDateAndTime(date0, "LOGIN");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: date must not be null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.show(false);
        java.awt.Color color6 = bookingInformationPage1.getForeground();
        java.awt.FocusTraversalPolicy focusTraversalPolicy7 = null;
        bookingInformationPage1.setFocusTraversalPolicy(focusTraversalPolicy7);
        java.awt.Component component9 = bookingInformationPage1.getNextFocusableComponent();
        bookingInformationPage1.setAlignmentY((float) 100);
        boolean boolean12 = bookingInformationPage1.isOpaque();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        gui.AppFrame appFrame0 = gui.AppFrame.getInstance();
        gui.AppFrame appFrame1 = null;
        gui.BookingInformationPage bookingInformationPage2 = new gui.BookingInformationPage(appFrame1);
        java.awt.Color color3 = null;
        bookingInformationPage2.setBackground(color3);
        bookingInformationPage2.show(false);
        java.awt.LayoutManager layoutManager7 = bookingInformationPage2.getLayout();
        gui.AppFrame appFrame8 = null;
        gui.BookingInformationPage bookingInformationPage9 = new gui.BookingInformationPage(appFrame8);
        java.awt.Color color10 = null;
        bookingInformationPage9.setBackground(color10);
        bookingInformationPage9.show(false);
        java.awt.Color color14 = bookingInformationPage9.getForeground();
        bookingInformationPage2.setBackground(color14);
        appFrame0.setBackground(color14);
        javax.swing.JRootPane jRootPane17 = appFrame0.getRootPane();
        gui.AppFrame appFrame18 = null;
        gui.BookingInformationPage bookingInformationPage19 = new gui.BookingInformationPage(appFrame18);
        java.awt.Color color20 = null;
        bookingInformationPage19.setBackground(color20);
        bookingInformationPage19.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension24 = null;
        bookingInformationPage19.setPreferredSize(dimension24);
        gui.AppFrame appFrame26 = null;
        gui.BookingInformationPage bookingInformationPage27 = new gui.BookingInformationPage(appFrame26);
        java.awt.Color color28 = null;
        bookingInformationPage27.setBackground(color28);
        bookingInformationPage27.show(false);
        java.awt.LayoutManager layoutManager32 = bookingInformationPage27.getLayout();
        bookingInformationPage19.putClientProperty((java.lang.Object) layoutManager32, (java.lang.Object) 0);
        appFrame0.setLayout(layoutManager32);
        java.awt.Point point37 = appFrame0.getMousePosition(false);
        userManagement.User user38 = appFrame0.getCurrentUser();
        appFrame0.createBufferStrategy((int) (short) 100);
        appFrame0.requestFocus();
        java.awt.Event event42 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean43 = appFrame0.handleEvent(event42);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot read field \"id\" because \"evt\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(appFrame0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jRootPane17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(point37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user38);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        gui.AppFrame appFrame0 = null;
        gui.RoomOptionsPage roomOptionsPage1 = new gui.RoomOptionsPage(appFrame0);
        gui.AppFrame appFrame2 = null;
        gui.BookingInformationPage bookingInformationPage3 = new gui.BookingInformationPage(appFrame2);
        java.awt.Color color4 = null;
        bookingInformationPage3.setBackground(color4);
        bookingInformationPage3.show(false);
        java.awt.LayoutManager layoutManager8 = bookingInformationPage3.getLayout();
        bookingInformationPage3.transferFocus();
        int int10 = roomOptionsPage1.getComponentZOrder((java.awt.Component) bookingInformationPage3);
        boolean boolean13 = roomOptionsPage1.contains(32, 10);
        java.awt.event.ContainerListener containerListener14 = null;
        roomOptionsPage1.addContainerListener(containerListener14);
        javax.swing.KeyStroke keyStroke16 = null;
        int int17 = roomOptionsPage1.getConditionForKeyStroke(keyStroke16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        gui.AppFrame appFrame0 = gui.AppFrame.getInstance();
        gui.AppFrame appFrame1 = null;
        gui.BookingInformationPage bookingInformationPage2 = new gui.BookingInformationPage(appFrame1);
        java.awt.Color color3 = null;
        bookingInformationPage2.setBackground(color3);
        bookingInformationPage2.show(false);
        java.awt.LayoutManager layoutManager7 = bookingInformationPage2.getLayout();
        gui.AppFrame appFrame8 = null;
        gui.BookingInformationPage bookingInformationPage9 = new gui.BookingInformationPage(appFrame8);
        java.awt.Color color10 = null;
        bookingInformationPage9.setBackground(color10);
        bookingInformationPage9.show(false);
        java.awt.Color color14 = bookingInformationPage9.getForeground();
        bookingInformationPage2.setBackground(color14);
        appFrame0.setBackground(color14);
        javax.swing.JRootPane jRootPane17 = appFrame0.getRootPane();
        gui.AppFrame appFrame18 = null;
        gui.BookingInformationPage bookingInformationPage19 = new gui.BookingInformationPage(appFrame18);
        java.awt.Color color20 = null;
        bookingInformationPage19.setBackground(color20);
        bookingInformationPage19.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension24 = null;
        bookingInformationPage19.setPreferredSize(dimension24);
        gui.AppFrame appFrame26 = null;
        gui.BookingInformationPage bookingInformationPage27 = new gui.BookingInformationPage(appFrame26);
        java.awt.Color color28 = null;
        bookingInformationPage27.setBackground(color28);
        bookingInformationPage27.show(false);
        java.awt.LayoutManager layoutManager32 = bookingInformationPage27.getLayout();
        bookingInformationPage19.putClientProperty((java.lang.Object) layoutManager32, (java.lang.Object) 0);
        appFrame0.setLayout(layoutManager32);
        java.awt.Point point37 = appFrame0.getMousePosition(false);
        userManagement.User user38 = appFrame0.getCurrentUser();
        appFrame0.createBufferStrategy((int) (short) 100);
        boolean boolean41 = appFrame0.isValidateRoot();
        javax.swing.JRootPane jRootPane42 = appFrame0.getRootPane();
        java.awt.im.InputContext inputContext43 = appFrame0.getInputContext();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(appFrame0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jRootPane17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(point37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jRootPane42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(inputContext43);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.setVerifyInputWhenFocusTarget(true);
        java.awt.event.FocusListener[] focusListenerArray6 = bookingInformationPage1.getFocusListeners();
        java.awt.event.KeyListener keyListener7 = null;
        bookingInformationPage1.removeKeyListener(keyListener7);
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior9 = bookingInformationPage1.getBaselineResizeBehavior();
        bookingInformationPage1.setFocusCycleRoot(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(focusListenerArray6);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior9 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior9.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
        gui.AppFrame appFrame0 = gui.AppFrame.getInstance();
        gui.AppFrame appFrame1 = null;
        gui.BookingInformationPage bookingInformationPage2 = new gui.BookingInformationPage(appFrame1);
        java.awt.Color color3 = null;
        bookingInformationPage2.setBackground(color3);
        bookingInformationPage2.show(false);
        java.awt.LayoutManager layoutManager7 = bookingInformationPage2.getLayout();
        gui.AppFrame appFrame8 = null;
        gui.BookingInformationPage bookingInformationPage9 = new gui.BookingInformationPage(appFrame8);
        java.awt.Color color10 = null;
        bookingInformationPage9.setBackground(color10);
        bookingInformationPage9.show(false);
        java.awt.Color color14 = bookingInformationPage9.getForeground();
        bookingInformationPage2.setBackground(color14);
        appFrame0.setBackground(color14);
        appFrame0.toFront();
        java.awt.event.WindowStateListener[] windowStateListenerArray18 = appFrame0.getWindowStateListeners();
        userManagement.User user19 = null;
        appFrame0.setCurrentUser(user19);
        java.awt.Window.Type type21 = appFrame0.getType();
        java.lang.String str22 = appFrame0.getWarningString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(appFrame0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(windowStateListenerArray18);
        org.junit.Assert.assertTrue("'" + type21 + "' != '" + java.awt.Window.Type.NORMAL + "'", type21.equals(java.awt.Window.Type.NORMAL));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        roomManagement.Room room4 = new roomManagement.Room("gui.BookingInformationPage[,0,0,0x0,invalid,layout=java.awt.GridBagLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", 10, "");
        roomMonitoring.Sensor sensor5 = new roomMonitoring.Sensor("", room4);
        sensor5.sendData(true);
        sensor5.detectMovement();
        roomMonitoring.RoomObserver roomObserver9 = null;
        sensor5.addObserver(roomObserver9);
        // The following exception was thrown during execution in test generation
        try {
            sensor5.detectVacancy();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"roomMonitoring.RoomObserver.updateOccupancy(roomManagement.Room, boolean)\" because \"observer\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension6 = null;
        bookingInformationPage1.setPreferredSize(dimension6);
        java.beans.PropertyChangeListener[] propertyChangeListenerArray8 = bookingInformationPage1.getPropertyChangeListeners();
        bookingInformationPage1.show(false);
        java.awt.Event event11 = null;
        boolean boolean13 = bookingInformationPage1.gotFocus(event11, (java.lang.Object) (byte) 10);
        bookingInformationPage1.repaint(1L, (int) 'a', 9, 52, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(propertyChangeListenerArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        java.lang.String str0 = gui.AppFrame.CARD_CANCEL_BOOKING;
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "CANCEL BOOKING" + "'", str0.equals("CANCEL BOOKING"));
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        gui.AppFrame appFrame0 = gui.AppFrame.getInstance();
        gui.AppFrame appFrame1 = null;
        gui.BookingInformationPage bookingInformationPage2 = new gui.BookingInformationPage(appFrame1);
        java.awt.Color color3 = null;
        bookingInformationPage2.setBackground(color3);
        bookingInformationPage2.show(false);
        java.awt.LayoutManager layoutManager7 = bookingInformationPage2.getLayout();
        gui.AppFrame appFrame8 = null;
        gui.BookingInformationPage bookingInformationPage9 = new gui.BookingInformationPage(appFrame8);
        java.awt.Color color10 = null;
        bookingInformationPage9.setBackground(color10);
        bookingInformationPage9.show(false);
        java.awt.Color color14 = bookingInformationPage9.getForeground();
        bookingInformationPage2.setBackground(color14);
        appFrame0.setBackground(color14);
        javax.swing.JRootPane jRootPane17 = appFrame0.getRootPane();
        gui.AppFrame appFrame18 = null;
        gui.BookingInformationPage bookingInformationPage19 = new gui.BookingInformationPage(appFrame18);
        java.awt.Color color20 = null;
        bookingInformationPage19.setBackground(color20);
        bookingInformationPage19.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension24 = null;
        bookingInformationPage19.setPreferredSize(dimension24);
        gui.AppFrame appFrame26 = null;
        gui.BookingInformationPage bookingInformationPage27 = new gui.BookingInformationPage(appFrame26);
        java.awt.Color color28 = null;
        bookingInformationPage27.setBackground(color28);
        bookingInformationPage27.show(false);
        java.awt.LayoutManager layoutManager32 = bookingInformationPage27.getLayout();
        bookingInformationPage19.putClientProperty((java.lang.Object) layoutManager32, (java.lang.Object) 0);
        appFrame0.setLayout(layoutManager32);
        java.awt.Point point37 = appFrame0.getMousePosition(false);
        userManagement.User user38 = appFrame0.getCurrentUser();
        java.awt.Rectangle rectangle39 = appFrame0.getMaximizedBounds();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(appFrame0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jRootPane17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(point37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(rectangle39);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        gui.AppFrame appFrame0 = gui.AppFrame.getInstance();
        gui.AppFrame appFrame1 = null;
        gui.BookingInformationPage bookingInformationPage2 = new gui.BookingInformationPage(appFrame1);
        java.awt.Color color3 = null;
        bookingInformationPage2.setBackground(color3);
        bookingInformationPage2.show(false);
        java.awt.LayoutManager layoutManager7 = bookingInformationPage2.getLayout();
        gui.AppFrame appFrame8 = null;
        gui.BookingInformationPage bookingInformationPage9 = new gui.BookingInformationPage(appFrame8);
        java.awt.Color color10 = null;
        bookingInformationPage9.setBackground(color10);
        bookingInformationPage9.show(false);
        java.awt.Color color14 = bookingInformationPage9.getForeground();
        bookingInformationPage2.setBackground(color14);
        appFrame0.setBackground(color14);
        javax.swing.JRootPane jRootPane17 = appFrame0.getRootPane();
        gui.AppFrame appFrame18 = null;
        gui.BookingInformationPage bookingInformationPage19 = new gui.BookingInformationPage(appFrame18);
        java.awt.Color color20 = null;
        bookingInformationPage19.setBackground(color20);
        bookingInformationPage19.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension24 = null;
        bookingInformationPage19.setPreferredSize(dimension24);
        gui.AppFrame appFrame26 = null;
        gui.BookingInformationPage bookingInformationPage27 = new gui.BookingInformationPage(appFrame26);
        java.awt.Color color28 = null;
        bookingInformationPage27.setBackground(color28);
        bookingInformationPage27.show(false);
        java.awt.LayoutManager layoutManager32 = bookingInformationPage27.getLayout();
        bookingInformationPage19.putClientProperty((java.lang.Object) layoutManager32, (java.lang.Object) 0);
        appFrame0.setLayout(layoutManager32);
        java.awt.Point point37 = appFrame0.getMousePosition(false);
        java.beans.PropertyChangeListener propertyChangeListener39 = null;
        appFrame0.addPropertyChangeListener("ROOM OPTIONS", propertyChangeListener39);
        java.awt.event.MouseMotionListener mouseMotionListener41 = null;
        appFrame0.addMouseMotionListener(mouseMotionListener41);
        gui.LoginPage loginPage43 = new gui.LoginPage(appFrame0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(appFrame0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jRootPane17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(point37);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        gui.AppFrame appFrame0 = gui.AppFrame.getInstance();
        gui.AppFrame appFrame1 = null;
        gui.BookingInformationPage bookingInformationPage2 = new gui.BookingInformationPage(appFrame1);
        java.awt.Color color3 = null;
        bookingInformationPage2.setBackground(color3);
        bookingInformationPage2.show(false);
        java.awt.LayoutManager layoutManager7 = bookingInformationPage2.getLayout();
        gui.AppFrame appFrame8 = null;
        gui.BookingInformationPage bookingInformationPage9 = new gui.BookingInformationPage(appFrame8);
        java.awt.Color color10 = null;
        bookingInformationPage9.setBackground(color10);
        bookingInformationPage9.show(false);
        java.awt.Color color14 = bookingInformationPage9.getForeground();
        bookingInformationPage2.setBackground(color14);
        appFrame0.setBackground(color14);
        appFrame0.toFront();
        javax.swing.TransferHandler transferHandler18 = appFrame0.getTransferHandler();
        gui.AppFrame appFrame19 = null;
        gui.BookingInformationPage bookingInformationPage20 = new gui.BookingInformationPage(appFrame19);
        java.awt.Color color21 = null;
        bookingInformationPage20.setBackground(color21);
        bookingInformationPage20.show(false);
        java.awt.Color color25 = bookingInformationPage20.getForeground();
        appFrame0.setBackground(color25);
        appFrame0.setVisible(false);
        appFrame0.removeNotify();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(appFrame0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(transferHandler18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color25);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        gui.AppFrame appFrame0 = gui.AppFrame.getInstance();
        gui.AppFrame appFrame1 = null;
        gui.BookingInformationPage bookingInformationPage2 = new gui.BookingInformationPage(appFrame1);
        java.awt.Color color3 = null;
        bookingInformationPage2.setBackground(color3);
        bookingInformationPage2.show(false);
        java.awt.LayoutManager layoutManager7 = bookingInformationPage2.getLayout();
        gui.AppFrame appFrame8 = null;
        gui.BookingInformationPage bookingInformationPage9 = new gui.BookingInformationPage(appFrame8);
        java.awt.Color color10 = null;
        bookingInformationPage9.setBackground(color10);
        bookingInformationPage9.show(false);
        java.awt.Color color14 = bookingInformationPage9.getForeground();
        bookingInformationPage2.setBackground(color14);
        appFrame0.setBackground(color14);
        boolean boolean17 = appFrame0.isFocused();
        java.awt.MenuBar menuBar18 = null;
        appFrame0.setMenuBar(menuBar18);
        appFrame0.setLocation(50, (int) (byte) 100);
        java.awt.event.WindowListener windowListener23 = null;
        appFrame0.addWindowListener(windowListener23);
        gui.LoginPage loginPage25 = new gui.LoginPage(appFrame0);
        gui.AppFrame appFrame26 = null;
        gui.BookingInformationPage bookingInformationPage27 = new gui.BookingInformationPage(appFrame26);
        java.awt.Color color28 = null;
        bookingInformationPage27.setBackground(color28);
        bookingInformationPage27.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension32 = null;
        bookingInformationPage27.setPreferredSize(dimension32);
        java.awt.Event event34 = null;
        boolean boolean37 = bookingInformationPage27.mouseExit(event34, 10, (int) (byte) 10);
        java.awt.event.KeyListener[] keyListenerArray38 = bookingInformationPage27.getKeyListeners();
        java.awt.Image image39 = null;
        gui.AppFrame appFrame40 = null;
        gui.BookingInformationPage bookingInformationPage41 = new gui.BookingInformationPage(appFrame40);
        int int42 = bookingInformationPage27.checkImage(image39, (java.awt.image.ImageObserver) bookingInformationPage41);
        gui.AppFrame appFrame43 = null;
        gui.BookingInformationPage bookingInformationPage44 = new gui.BookingInformationPage(appFrame43);
        java.awt.Color color45 = null;
        bookingInformationPage44.setBackground(color45);
        bookingInformationPage44.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension49 = null;
        bookingInformationPage44.setPreferredSize(dimension49);
        bookingInformationPage44.paintImmediately((int) (byte) 10, 10, 7, 64);
        java.lang.String str56 = bookingInformationPage44.toString();
        java.awt.Rectangle rectangle57 = null;
        java.awt.Rectangle rectangle58 = bookingInformationPage44.getBounds(rectangle57);
        java.awt.Rectangle rectangle59 = bookingInformationPage41.getBounds(rectangle57);
        appFrame0.setMaximizedBounds(rectangle57);
        boolean boolean61 = appFrame0.isActive();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(appFrame0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyListenerArray38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 32 + "'", int42 == 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str56 + "' != '" + "gui.BookingInformationPage[,0,0,0x0,invalid,layout=java.awt.GridBagLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]" + "'", str56.equals("gui.BookingInformationPage[,0,0,0x0,invalid,layout=java.awt.GridBagLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rectangle58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rectangle59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
        gui.AppFrame appFrame0 = gui.AppFrame.getInstance();
        gui.AppFrame appFrame1 = null;
        gui.BookingInformationPage bookingInformationPage2 = new gui.BookingInformationPage(appFrame1);
        java.awt.Color color3 = null;
        bookingInformationPage2.setBackground(color3);
        bookingInformationPage2.show(false);
        java.awt.LayoutManager layoutManager7 = bookingInformationPage2.getLayout();
        gui.AppFrame appFrame8 = null;
        gui.BookingInformationPage bookingInformationPage9 = new gui.BookingInformationPage(appFrame8);
        java.awt.Color color10 = null;
        bookingInformationPage9.setBackground(color10);
        bookingInformationPage9.show(false);
        java.awt.Color color14 = bookingInformationPage9.getForeground();
        bookingInformationPage2.setBackground(color14);
        appFrame0.setBackground(color14);
        boolean boolean17 = appFrame0.isFocused();
        java.awt.MenuComponent menuComponent18 = null;
        appFrame0.remove(menuComponent18);
        // The following exception was thrown during execution in test generation
        try {
            appFrame0.setDefaultCloseOperation((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: defaultCloseOperation must be one of: DO_NOTHING_ON_CLOSE, HIDE_ON_CLOSE, DISPOSE_ON_CLOSE, or EXIT_ON_CLOSE");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(appFrame0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        userManagement.Faculty faculty0 = new userManagement.Faculty();
        int int1 = faculty0.getHourlyRate();
        boolean boolean3 = faculty0.checkPassword("DASHBOARD");
        int int4 = faculty0.getHourlyRate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 30 + "'", int1 == 30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 30 + "'", int4 == 30);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
        dataManagement.MaintainUser maintainUser0 = new dataManagement.MaintainUser();
        userManagement.User user3 = maintainUser0.authenticate("", "PAYMENT");
        maintainUser0.save("WELCOME");
        maintainUser0.load("USER OPTIONS");
        maintainUser0.path = "Staff [username=null, email=null, id=0]";
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user3);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
        roomManagement.Room room3 = new roomManagement.Room("CREATE ROOM", 9, "SCAN BADGE");
        boolean boolean4 = room3.maintenanceAndRepairsFinished();
        boolean boolean5 = room3.closeRoom();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        gui.AppFrame appFrame0 = gui.AppFrame.getInstance();
        gui.AppFrame appFrame1 = null;
        gui.BookingInformationPage bookingInformationPage2 = new gui.BookingInformationPage(appFrame1);
        java.awt.Color color3 = null;
        bookingInformationPage2.setBackground(color3);
        bookingInformationPage2.show(false);
        java.awt.LayoutManager layoutManager7 = bookingInformationPage2.getLayout();
        gui.AppFrame appFrame8 = null;
        gui.BookingInformationPage bookingInformationPage9 = new gui.BookingInformationPage(appFrame8);
        java.awt.Color color10 = null;
        bookingInformationPage9.setBackground(color10);
        bookingInformationPage9.show(false);
        java.awt.Color color14 = bookingInformationPage9.getForeground();
        bookingInformationPage2.setBackground(color14);
        appFrame0.setBackground(color14);
        boolean boolean17 = appFrame0.isFocused();
        java.awt.MenuComponent menuComponent18 = null;
        appFrame0.remove(menuComponent18);
        int int20 = appFrame0.getComponentCount();
        boolean boolean21 = appFrame0.isLocationByPlatform();
        userManagement.Faculty faculty22 = new userManagement.Faculty();
        java.lang.String str23 = faculty22.getUserType();
        appFrame0.setCurrentUser((userManagement.User) faculty22);
        int int25 = faculty22.getHourlyRate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(appFrame0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "Faculty" + "'", str23.equals("Faculty"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 30 + "'", int25 == 30);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.show(false);
        java.awt.Color color6 = bookingInformationPage1.getForeground();
        bookingInformationPage1.setEnabled(false);
        boolean boolean9 = bookingInformationPage1.isOptimizedDrawingEnabled();
        bookingInformationPage1.revalidate();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
        gui.AppFrame appFrame0 = null;
        gui.RoomOptionsPage roomOptionsPage1 = new gui.RoomOptionsPage(appFrame0);
        roomOptionsPage1.setLocation(50, 0);
        java.awt.Component component7 = roomOptionsPage1.findComponentAt((int) (byte) 10, 0);
        roomOptionsPage1.doLayout();
        roomOptionsPage1.setEnabled(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(component7);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        gui.AppFrame appFrame0 = gui.AppFrame.getInstance();
        gui.AppFrame appFrame1 = null;
        gui.BookingInformationPage bookingInformationPage2 = new gui.BookingInformationPage(appFrame1);
        java.awt.Color color3 = null;
        bookingInformationPage2.setBackground(color3);
        bookingInformationPage2.show(false);
        java.awt.LayoutManager layoutManager7 = bookingInformationPage2.getLayout();
        gui.AppFrame appFrame8 = null;
        gui.BookingInformationPage bookingInformationPage9 = new gui.BookingInformationPage(appFrame8);
        java.awt.Color color10 = null;
        bookingInformationPage9.setBackground(color10);
        bookingInformationPage9.show(false);
        java.awt.Color color14 = bookingInformationPage9.getForeground();
        bookingInformationPage2.setBackground(color14);
        appFrame0.setBackground(color14);
        appFrame0.toFront();
        java.awt.event.WindowStateListener[] windowStateListenerArray18 = appFrame0.getWindowStateListeners();
        userManagement.User user19 = null;
        appFrame0.setCurrentUser(user19);
        java.awt.Window.Type type21 = appFrame0.getType();
        appFrame0.firePropertyChange("gui.BookingInformationPage[,0,0,0x0,invalid,layout=java.awt.GridBagLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", (long) (short) 100, (long) 40);
        gui.AppFrame appFrame26 = null;
        gui.BookingInformationPage bookingInformationPage27 = new gui.BookingInformationPage(appFrame26);
        java.awt.Color color28 = null;
        bookingInformationPage27.setBackground(color28);
        bookingInformationPage27.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension32 = null;
        bookingInformationPage27.setPreferredSize(dimension32);
        java.awt.Event event34 = null;
        boolean boolean37 = bookingInformationPage27.mouseExit(event34, 10, (int) (byte) 10);
        java.awt.event.KeyListener[] keyListenerArray38 = bookingInformationPage27.getKeyListeners();
        java.awt.Image image39 = null;
        gui.AppFrame appFrame40 = null;
        gui.BookingInformationPage bookingInformationPage41 = new gui.BookingInformationPage(appFrame40);
        int int42 = bookingInformationPage27.checkImage(image39, (java.awt.image.ImageObserver) bookingInformationPage41);
        java.awt.Insets insets43 = bookingInformationPage27.getInsets();
        bookingInformationPage27.setVisible(true);
        bookingInformationPage27.disable();
        gui.AppFrame appFrame47 = null;
        gui.BookingInformationPage bookingInformationPage48 = new gui.BookingInformationPage(appFrame47);
        java.awt.Color color49 = null;
        bookingInformationPage48.setBackground(color49);
        bookingInformationPage48.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension53 = null;
        bookingInformationPage48.setPreferredSize(dimension53);
        java.awt.Graphics graphics55 = null;
        bookingInformationPage48.paintComponents(graphics55);
        java.awt.Event event57 = null;
        boolean boolean60 = bookingInformationPage48.mouseMove(event57, (int) (byte) -1, (int) 'a');
        gui.AppFrame appFrame61 = null;
        gui.BookingInformationPage bookingInformationPage62 = new gui.BookingInformationPage(appFrame61);
        java.awt.Color color63 = null;
        bookingInformationPage62.setBackground(color63);
        bookingInformationPage62.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension67 = null;
        bookingInformationPage62.setPreferredSize(dimension67);
        java.awt.Event event69 = null;
        boolean boolean72 = bookingInformationPage62.mouseExit(event69, 10, (int) (byte) 10);
        java.awt.event.KeyListener[] keyListenerArray73 = bookingInformationPage62.getKeyListeners();
        java.awt.Image image74 = null;
        gui.AppFrame appFrame75 = null;
        gui.BookingInformationPage bookingInformationPage76 = new gui.BookingInformationPage(appFrame75);
        int int77 = bookingInformationPage62.checkImage(image74, (java.awt.image.ImageObserver) bookingInformationPage76);
        gui.AppFrame appFrame78 = null;
        gui.BookingInformationPage bookingInformationPage79 = new gui.BookingInformationPage(appFrame78);
        java.awt.Color color80 = null;
        bookingInformationPage79.setBackground(color80);
        bookingInformationPage79.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension84 = null;
        bookingInformationPage79.setPreferredSize(dimension84);
        bookingInformationPage79.paintImmediately((int) (byte) 10, 10, 7, 64);
        java.lang.String str91 = bookingInformationPage79.toString();
        java.awt.Rectangle rectangle92 = null;
        java.awt.Rectangle rectangle93 = bookingInformationPage79.getBounds(rectangle92);
        java.awt.Rectangle rectangle94 = bookingInformationPage76.getBounds(rectangle92);
        java.awt.Rectangle rectangle95 = bookingInformationPage48.getBounds(rectangle92);
        bookingInformationPage27.repaint(rectangle95);
        appFrame0.setMaximizedBounds(rectangle95);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(appFrame0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(windowStateListenerArray18);
        org.junit.Assert.assertTrue("'" + type21 + "' != '" + java.awt.Window.Type.NORMAL + "'", type21.equals(java.awt.Window.Type.NORMAL));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyListenerArray38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 32 + "'", int42 == 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(insets43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyListenerArray73);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 32 + "'", int77 == 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str91 + "' != '" + "gui.BookingInformationPage[,0,0,0x0,invalid,layout=java.awt.GridBagLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]" + "'", str91.equals("gui.BookingInformationPage[,0,0,0x0,invalid,layout=java.awt.GridBagLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rectangle93);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rectangle94);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rectangle95);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
        java.util.Date date3 = null;
        bookingManagment.Booking booking9 = new bookingManagment.Booking("gui.BookingInformationPage[,0,0,0x0,invalid,layout=java.awt.GridBagLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", "BOOKING", "ADMINISTRATOR OPTIONS", date3, "Other", "ROOM OPTIONS", (double) 32, (double) 40, (double) 12);
        booking9.setEndTime("MANAGE ROOMS");
        double double12 = booking9.getHourlyRate();
        double double13 = booking9.getTotalCost();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 12.0d + "'", double12 == 12.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 40.0d + "'", double13 == 40.0d);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
        java.util.Date date3 = null;
        bookingManagment.Booking booking9 = new bookingManagment.Booking("gui.BookingInformationPage[,0,0,0x0,invalid,layout=java.awt.GridBagLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", "BOOKING", "ADMINISTRATOR OPTIONS", date3, "Other", "ROOM OPTIONS", (double) 32, (double) 40, (double) 12);
        booking9.setEndTime("MANAGE ROOMS");
        booking9.setEndTime("USER OPTIONS");
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
        gui.AppFrame appFrame0 = gui.AppFrame.getInstance();
        gui.AppFrame appFrame1 = null;
        gui.BookingInformationPage bookingInformationPage2 = new gui.BookingInformationPage(appFrame1);
        java.awt.Color color3 = null;
        bookingInformationPage2.setBackground(color3);
        bookingInformationPage2.show(false);
        java.awt.LayoutManager layoutManager7 = bookingInformationPage2.getLayout();
        gui.AppFrame appFrame8 = null;
        gui.BookingInformationPage bookingInformationPage9 = new gui.BookingInformationPage(appFrame8);
        java.awt.Color color10 = null;
        bookingInformationPage9.setBackground(color10);
        bookingInformationPage9.show(false);
        java.awt.Color color14 = bookingInformationPage9.getForeground();
        bookingInformationPage2.setBackground(color14);
        appFrame0.setBackground(color14);
        boolean boolean17 = appFrame0.isFocused();
        java.awt.MenuComponent menuComponent18 = null;
        appFrame0.remove(menuComponent18);
        int int20 = appFrame0.getComponentCount();
        // The following exception was thrown during execution in test generation
        try {
            java.awt.Point point21 = appFrame0.getLocationOnScreen();
            org.junit.Assert.fail("Expected exception of type java.awt.IllegalComponentStateException; message: component must be showing on the screen to determine its location");
        } catch (java.awt.IllegalComponentStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(appFrame0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
        gui.AppFrame appFrame0 = gui.AppFrame.getInstance();
        java.awt.event.WindowListener windowListener1 = null;
        appFrame0.addWindowListener(windowListener1);
        boolean boolean3 = appFrame0.isActive();
        int int4 = appFrame0.getExtendedState();
        gui.SignUpPage signUpPage5 = new gui.SignUpPage(appFrame0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(appFrame0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
        gui.AppFrame appFrame0 = null;
        gui.RoomOptionsPage roomOptionsPage1 = new gui.RoomOptionsPage(appFrame0);
        gui.AppFrame appFrame2 = null;
        gui.BookingInformationPage bookingInformationPage3 = new gui.BookingInformationPage(appFrame2);
        java.awt.Color color4 = null;
        bookingInformationPage3.setBackground(color4);
        bookingInformationPage3.show(false);
        java.awt.LayoutManager layoutManager8 = bookingInformationPage3.getLayout();
        bookingInformationPage3.transferFocus();
        int int10 = roomOptionsPage1.getComponentZOrder((java.awt.Component) bookingInformationPage3);
        bookingInformationPage3.layout();
        java.awt.Component[] componentArray12 = bookingInformationPage3.getComponents();
        java.awt.Component.BaselineResizeBehavior baselineResizeBehavior13 = bookingInformationPage3.getBaselineResizeBehavior();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(componentArray12);
        org.junit.Assert.assertTrue("'" + baselineResizeBehavior13 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'", baselineResizeBehavior13.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension6 = null;
        bookingInformationPage1.setPreferredSize(dimension6);
        bookingInformationPage1.paintImmediately((int) (byte) 10, 10, 7, 64);
        java.lang.String str13 = bookingInformationPage1.toString();
        java.awt.Rectangle rectangle14 = null;
        java.awt.Rectangle rectangle15 = bookingInformationPage1.getBounds(rectangle14);
        gui.AppFrame appFrame16 = null;
        gui.BookingInformationPage bookingInformationPage17 = new gui.BookingInformationPage(appFrame16);
        java.awt.Color color18 = null;
        bookingInformationPage17.setBackground(color18);
        bookingInformationPage17.setVerifyInputWhenFocusTarget(true);
        java.awt.event.FocusListener[] focusListenerArray22 = bookingInformationPage17.getFocusListeners();
        javax.swing.KeyStroke keyStroke23 = null;
        int int24 = bookingInformationPage17.getConditionForKeyStroke(keyStroke23);
        gui.AppFrame appFrame25 = null;
        gui.WelcomePage welcomePage26 = new gui.WelcomePage(appFrame25);
        gui.AppFrame appFrame27 = null;
        gui.BookingInformationPage bookingInformationPage28 = new gui.BookingInformationPage(appFrame27);
        java.awt.Color color29 = null;
        bookingInformationPage28.setBackground(color29);
        bookingInformationPage28.show(false);
        java.awt.LayoutManager layoutManager33 = bookingInformationPage28.getLayout();
        java.awt.Point point34 = null;
        java.awt.Point point35 = bookingInformationPage28.getLocation(point34);
        boolean boolean36 = welcomePage26.contains(point35);
        java.awt.Point point37 = bookingInformationPage17.getLocation(point35);
        gui.AppFrame appFrame38 = null;
        gui.BookingInformationPage bookingInformationPage39 = new gui.BookingInformationPage(appFrame38);
        java.awt.Color color40 = null;
        bookingInformationPage39.setBackground(color40);
        bookingInformationPage39.show(false);
        java.awt.Color color44 = bookingInformationPage39.getForeground();
        bookingInformationPage17.setForeground(color44);
        bookingInformationPage1.setForeground(color44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "gui.BookingInformationPage[,0,0,0x0,invalid,layout=java.awt.GridBagLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]" + "'", str13.equals("gui.BookingInformationPage[,0,0,0x0,invalid,layout=java.awt.GridBagLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rectangle15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(focusListenerArray22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(point35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(point37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color44);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
        gui.AppFrame appFrame0 = gui.AppFrame.getInstance();
        int int1 = appFrame0.getExtendedState();
        java.awt.Event event2 = null;
        boolean boolean4 = appFrame0.keyUp(event2, (int) (byte) 10);
        int int5 = appFrame0.getExtendedState();
        java.awt.Dialog.ModalExclusionType modalExclusionType6 = null;
        appFrame0.setModalExclusionType(modalExclusionType6);
        java.awt.Cursor cursor8 = null;
        appFrame0.setCursor(cursor8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(appFrame0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
        roomManagement.Room room3 = new roomManagement.Room("gui.BookingInformationPage[,0,0,0x0,invalid,layout=java.awt.GridBagLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", 10, "");
        room3.setOccupied(true);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.event.ActionListener actionListener2 = null;
        javax.swing.KeyStroke keyStroke3 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingInformationPage1.registerKeyboardAction(actionListener2, keyStroke3, 40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: condition must be one of JComponent.WHEN_IN_FOCUSED_WINDOW, JComponent.WHEN_FOCUSED or JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
        java.util.Date date3 = null;
        bookingManagment.Booking booking9 = new bookingManagment.Booking("hi!", "ROOM OPTIONS", "ROOM OPTIONS", date3, "ROOM OPTIONS", "gui.BookingInformationPage[,0,0,0x0,invalid,layout=java.awt.GridBagLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]", (double) (-1), (double) (short) -1, (double) (-1));
        double double10 = booking9.getTotalCost();
        java.util.Date date11 = booking9.getDate();
        booking9.setCheckedIn(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(date11);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
        gui.AppFrame appFrame0 = gui.AppFrame.getInstance();
        gui.AppFrame appFrame1 = null;
        gui.BookingInformationPage bookingInformationPage2 = new gui.BookingInformationPage(appFrame1);
        java.awt.Color color3 = null;
        bookingInformationPage2.setBackground(color3);
        bookingInformationPage2.show(false);
        java.awt.LayoutManager layoutManager7 = bookingInformationPage2.getLayout();
        gui.AppFrame appFrame8 = null;
        gui.BookingInformationPage bookingInformationPage9 = new gui.BookingInformationPage(appFrame8);
        java.awt.Color color10 = null;
        bookingInformationPage9.setBackground(color10);
        bookingInformationPage9.show(false);
        java.awt.Color color14 = bookingInformationPage9.getForeground();
        bookingInformationPage2.setBackground(color14);
        appFrame0.setBackground(color14);
        javax.swing.JRootPane jRootPane17 = appFrame0.getRootPane();
        gui.AppFrame appFrame18 = null;
        gui.BookingInformationPage bookingInformationPage19 = new gui.BookingInformationPage(appFrame18);
        java.awt.Color color20 = null;
        bookingInformationPage19.setBackground(color20);
        bookingInformationPage19.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension24 = null;
        bookingInformationPage19.setPreferredSize(dimension24);
        gui.AppFrame appFrame26 = null;
        gui.BookingInformationPage bookingInformationPage27 = new gui.BookingInformationPage(appFrame26);
        java.awt.Color color28 = null;
        bookingInformationPage27.setBackground(color28);
        bookingInformationPage27.show(false);
        java.awt.LayoutManager layoutManager32 = bookingInformationPage27.getLayout();
        bookingInformationPage19.putClientProperty((java.lang.Object) layoutManager32, (java.lang.Object) 0);
        appFrame0.setLayout(layoutManager32);
        java.awt.Point point37 = appFrame0.getMousePosition(false);
        userManagement.User user38 = appFrame0.getCurrentUser();
// flaky:         appFrame0.createBufferStrategy((int) (short) 100);
        gui.LoginPage loginPage41 = new gui.LoginPage(appFrame0);
        java.awt.event.MouseListener mouseListener42 = null;
        appFrame0.addMouseListener(mouseListener42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(appFrame0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(jRootPane17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(layoutManager32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(point37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user38);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        javax.swing.JPopupMenu jPopupMenu2 = bookingInformationPage1.getComponentPopupMenu();
        javax.accessibility.AccessibleContext accessibleContext3 = bookingInformationPage1.getAccessibleContext();
        java.awt.Image image4 = null;
        boolean boolean10 = bookingInformationPage1.imageUpdate(image4, 7, 10, (int) 'a', 50, 64);
        java.awt.event.InputMethodListener inputMethodListener11 = null;
        bookingInformationPage1.addInputMethodListener(inputMethodListener11);
        java.awt.event.KeyListener keyListener13 = null;
        bookingInformationPage1.addKeyListener(keyListener13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(jPopupMenu2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(accessibleContext3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
        gui.AppFrame appFrame0 = null;
        gui.BookingInformationPage bookingInformationPage1 = new gui.BookingInformationPage(appFrame0);
        java.awt.Color color2 = null;
        bookingInformationPage1.setBackground(color2);
        bookingInformationPage1.show(false);
        java.awt.Color color6 = bookingInformationPage1.getForeground();
        bookingInformationPage1.setEnabled(false);
        java.awt.Dimension dimension9 = bookingInformationPage1.preferredSize();
        java.awt.Dimension dimension10 = bookingInformationPage1.getMinimumSize();
        java.beans.VetoableChangeListener[] vetoableChangeListenerArray11 = bookingInformationPage1.getVetoableChangeListeners();
        gui.AppFrame appFrame12 = null;
        gui.BookingInformationPage bookingInformationPage13 = new gui.BookingInformationPage(appFrame12);
        java.awt.Color color14 = null;
        bookingInformationPage13.setBackground(color14);
        bookingInformationPage13.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension18 = null;
        bookingInformationPage13.setPreferredSize(dimension18);
        java.awt.Event event20 = null;
        boolean boolean23 = bookingInformationPage13.mouseExit(event20, 10, (int) (byte) 10);
        java.awt.event.KeyListener[] keyListenerArray24 = bookingInformationPage13.getKeyListeners();
        java.awt.Image image25 = null;
        gui.AppFrame appFrame26 = null;
        gui.BookingInformationPage bookingInformationPage27 = new gui.BookingInformationPage(appFrame26);
        int int28 = bookingInformationPage13.checkImage(image25, (java.awt.image.ImageObserver) bookingInformationPage27);
        gui.AppFrame appFrame29 = null;
        gui.BookingInformationPage bookingInformationPage30 = new gui.BookingInformationPage(appFrame29);
        java.awt.Color color31 = null;
        bookingInformationPage30.setBackground(color31);
        bookingInformationPage30.setVerifyInputWhenFocusTarget(true);
        java.awt.Dimension dimension35 = null;
        bookingInformationPage30.setPreferredSize(dimension35);
        bookingInformationPage30.paintImmediately((int) (byte) 10, 10, 7, 64);
        java.lang.String str42 = bookingInformationPage30.toString();
        java.awt.Rectangle rectangle43 = null;
        java.awt.Rectangle rectangle44 = bookingInformationPage30.getBounds(rectangle43);
        java.awt.Rectangle rectangle45 = bookingInformationPage27.getBounds(rectangle43);
        bookingInformationPage1.scrollRectToVisible(rectangle45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(color6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dimension9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(dimension10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(vetoableChangeListenerArray11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(keyListenerArray24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 32 + "'", int28 == 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "gui.BookingInformationPage[,0,0,0x0,invalid,layout=java.awt.GridBagLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]" + "'", str42.equals("gui.BookingInformationPage[,0,0,0x0,invalid,layout=java.awt.GridBagLayout,alignmentX=0.0,alignmentY=0.0,border=,flags=9,maximumSize=,minimumSize=,preferredSize=]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rectangle44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(rectangle45);
    }
}
