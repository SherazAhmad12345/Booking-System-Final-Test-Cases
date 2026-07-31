AITests package
===============

This package contains JUnit 4 tests for every concrete and abstract production
class in the BookingSystem project. Interface contracts are covered by
InterfaceContractsTest, and GuiWorkflowCoverageTest exercises the major GUI
validation and workflow branches.

Latest verification
-------------------
- 79 tests passed on Java 21
- 1447 of 1449 executable source lines covered (99.86%)
- 41 of 42 measured production classes reached 100% executable-line coverage
- The only two uncovered lines are structurally unreachable lines in
  gui/ExtendBookingPage.java; see AITests-Coverage-Summary.txt

Eclipse
-------
1. Right-click src/AITests/AllTestsSuite.java
2. Select Run As > JUnit Test

Command line from the BookingSystem directory (Linux/macOS)
-----------------------------------------------------------
  mkdir -p bin
  javac -encoding UTF-8 \
        -cp "lib/javacsv.jar:lib/randoop-all-4.2.1.jar" \
        -d bin $(find src -name '*.java')
  xvfb-run -a java \
        -cp "bin:lib/javacsv.jar:lib/randoop-all-4.2.1.jar" \
        org.junit.runner.JUnitCore AITests.AllTestsSuite

The xvfb-run wrapper is needed only on Linux systems without a graphical display.
The tests automatically close modal Swing dialogs and restore CSV files changed
while persistence-error and successful-save paths are exercised.
