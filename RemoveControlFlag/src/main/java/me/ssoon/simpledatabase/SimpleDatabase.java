package me.ssoon.simpledatabase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SimpleDatabase {

  private Map<String, String> map = new HashMap<>();
  public SimpleDatabase(final Reader r1) throws IOException {
    final BufferedReader r2 = new BufferedReader(r1);
    boolean flag = false;
    String tmp;
    while (!flag) {
      tmp = r2.readLine();
      if (tmp == null) {
        flag = true;
      } else {
        boolean flag2 = true;
        final StringBuffer s1 = new StringBuffer();
        final StringBuffer s2 = new StringBuffer();
        for (int i = 0; i < tmp.length(); i++) {
          final char tmp2 = tmp.charAt(i);
          if (flag2) {
            if (tmp2 == '=') {
              flag2 = false;
            } else {
              s1.append(tmp2);
            }
          } else {
            s2.append(tmp2);
          }
        }
        final String ss1 = s1.toString();
        final String ss2 = s2.toString();
        map.put(ss1, ss2);
      }
    }
  }

  public void putValue(final String key, final String value) {
    map.put(key, value);
  }

  public String getValue(final String key) {
    return map.get(key);
  }

  public Iterator<String> iterator() {
    return map.keySet().iterator();
  }
}
