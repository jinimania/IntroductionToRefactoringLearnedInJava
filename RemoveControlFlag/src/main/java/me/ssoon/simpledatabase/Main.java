package me.ssoon.simpledatabase;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

public class Main {

  public static void main(String[] args) {
    try {
      String current = new java.io.File( "." ).getCanonicalPath();
      final SimpleDatabase db = new SimpleDatabase(new FileReader(current + "/RemoveControlFlag/src/main/java/me/ssoon/simpledatabase/dbFile.txt"));
      final Iterator<String> it = db.iterator();
      while (it.hasNext()) {
        final String key = it.next();
        System.out.println("KEY : \"" + key + "\"");
        System.out.println("VALUE : \"" + db.getValue(key) + "\"");
        System.out.println();
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
