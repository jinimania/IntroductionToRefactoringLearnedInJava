package me.ssoon.address;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Database {

  private final Properties properties;
  private final String fileName;

  public Database(final String fileName) {
    this.fileName = fileName;
    this.properties = new Properties();
    try {
      this.properties.load(new FileInputStream(this.fileName));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public void set(final String key, final String value) {
    this.properties.setProperty(key, value);
  }

  public String get(final String key) {
    return this.properties.getProperty(key, null);
  }

  public void update() throws IOException {
    this.properties.store(new FileOutputStream(this.fileName), "");
  }

  public Properties getProperties() {
    return properties;
  }
}
