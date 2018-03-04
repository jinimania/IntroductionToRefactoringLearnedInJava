package me.ssoon.findint;

public class FindInt {

  public static boolean find(final int[] data, final int target) {
    boolean flag = false;
    for (int i = 0; i < data.length && !flag; i++) {
      if (data[i] == target) {
        flag = true;
      }
    }
    return flag;
  }
}
