package edu.pdx.cs410J.cojor;

import edu.pdx.cs410J.lang.Human;

import java.util.ArrayList;
                                                                                    
/**                                                                                 
 * This class is represents a <code>Student</code>.                                 
 */                                                                                 
public class LeapYear {

  public static boolean isLeapYear(int year) {
    if(year < 1582){
      return false;
    }
    else if (year % 4 == 0) {
      if (year % 100 == 0) {
        if (year % 400 == 0) {
          return true;
        } else {
          return false;
        }
      } else {
        return true;
      }
    } else {
      return false;
    }
  }

  public static void main(String[] args) {
    int temp;
    if (args.length != 1) {
      System.err.println("Improper number of command line arguments");
      System.exit(1);
    }

    try {
      temp = Integer.parseInt(args[0]);
      boolean leapStatus = isLeapYear(temp);
      if (leapStatus == true) {
        System.out.println(temp + "is a leap year.");
        System.exit(0);
      } else {
        System.out.println(temp + "IS NOT A LEAP YEAR");
      }
    } catch (NumberFormatException e) {
      System.err.println("Please enter only an integer value");
      System.exit(1);
    }
  }
}