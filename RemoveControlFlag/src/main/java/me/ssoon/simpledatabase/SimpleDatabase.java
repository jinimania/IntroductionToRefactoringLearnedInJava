package me.ssoon.simpledatabase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SimpleDatabase {

  private Map<String, String> map = new HashMap<>();
  private static Pattern pattern = Pattern.compile("([^=]+)=(.*)");
  public SimpleDatabase(final Reader r) throws IOException {
    final BufferedReader reader = new BufferedReader(r);
    String line;
    while (true) {
      line = reader.readLine();
      if (line == null) {
        break;
      }
      final Matcher matcher = pattern.matcher(line);
      if (matcher.matches()) {
        final String key = matcher.group(1);
        final String value = matcher.group(2);
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
