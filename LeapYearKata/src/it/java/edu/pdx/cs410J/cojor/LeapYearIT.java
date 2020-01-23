package edu.pdx.cs410J.cojor;

import edu.pdx.cs410J.InvokeMainTestCase;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.hamcrest.core.StringContains.containsString;

/**
 * Integration tests for the <code>Student</code> class's main method.
 * These tests extend <code>InvokeMainTestCase</code> which allows them
 * to easily invoke the <code>main</code> method of <code>Student</code>.
 */
public class LeapYearIT extends InvokeMainTestCase {

    private MainMethodResult invokeMain(String... args) {
        return invokeMain(LeapYear.class, args);
    }
  @Test
  public void invokingMainWithNoArgumentsHasExitCodeOf1() {
    MainMethodResult result = invokeMain();
    assertThat(result.getExitCode(), equalTo(1));
  }

  @Test
  public void invokingMainWith2ArgumentsHasExitCodeOf1() {
        MainMethodResult result = invokeMain("231223","3213");
        assertThat(result.getExitCode(), equalTo(1));
  }

  @Test
  public void invokeMainwithLettersInYearArg(){
    MainMethodResult result = invokeMain("qwerty");
    assertThat(result.getExitCode(), equalTo(1));
    assertThat(result.getTextWrittenToStandardError(), containsString("Please enter only an integer value"));
  }

  @Test
  public void invokeMainwithValidYearArg(){
        MainMethodResult result = invokeMain("2020");
        assertThat(result.getExitCode(), equalTo(0));
        assertThat(result.getTextWrittenToStandardOut(), containsString("is a leap year"));
    }

}
