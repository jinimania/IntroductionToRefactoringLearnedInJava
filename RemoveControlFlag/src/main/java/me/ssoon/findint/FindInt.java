package me.ssoon.findint;

public class FindInt {

  public static boolean find(final int[] data, final int target) {
    for (int i = 0; i < data.length; i++) {
      if (data[i] == target) {
        return true;
      }
    }
    return false;
  }
}
