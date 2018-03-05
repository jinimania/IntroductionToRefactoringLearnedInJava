package me.ssoon.address;

import java.util.Enumeration;

public class AddressFile {

  private final Database database;

  public AddressFile(final String fileName) {
    database = new Database(fileName);
  }

  public Database getDatabase() {
    return database;
  }

  public Enumeration names() {
    return database.getProperties().propertyNames();
  }
}
