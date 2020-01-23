package edu.pdx.cs410J.cojor;

import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

/**
 * Unit tests for the Student class.  In addition to the JUnit annotations,
 * they also make use of the <a href="http://hamcrest.org/JavaHamcrest/">hamcrest</a>
 * matchers for more readable assertion statements.
 */
public class LeapYearTest
{

  @Test
  public void TestValidLeapYears() {
    assertThat(LeapYear.isLeapYear(2000), equalTo(true));
    assertThat(LeapYear.isLeapYear(1600), equalTo(true));
    assertThat(LeapYear.isLeapYear(2020), equalTo(true));
    assertThat(LeapYear.isLeapYear(1896), equalTo(true));
  }

  @Test
  public void TestInvalidLeapYears() {
    assertThat(LeapYear.isLeapYear(1603), equalTo(false));
    assertThat(LeapYear.isLeapYear(2021), equalTo(false));
    assertThat(LeapYear.isLeapYear(1897), equalTo(false));
    assertThat(LeapYear.isLeapYear(1700), equalTo(false));
    assertThat(LeapYear.isLeapYear(1500), equalTo(false));
    assertThat(LeapYear.isLeapYear(-2343221), equalTo(false));
  }

}


