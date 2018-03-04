package me.ssoon.simpledatabase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SimpleDatabase {

  private Map<String, String> map = new HashMap<>();
  public SimpleDatabase(final Reader r) throws IOException {
    final BufferedReader reader = new BufferedReader(r);
    String line;
    while (true) {
      line = reader.readLine();
      if (line == null) {
        break;
      }
      final int equalIndex = line.indexOf('=');
      if (equalIndex > 0) {
        final String key = line.substring(0, equalIndex);
        final String value = line.substring(equalIndex+ 1, line.length());
        map.put(key, value);
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
