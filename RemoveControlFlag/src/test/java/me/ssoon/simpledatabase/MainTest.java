package me.ssoon.simpledatabase;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MainTest {

  private static String FILENAME = "testfile.txt";

  @Before
  public void setUp() throws IOException {
    final PrintWriter writer = new PrintWriter(FILENAME);
    writer.println("hyuki@example.com=Hiroshi Yuki");
    writer.println("sato@example.com=Sato Hanako");
    writer.println("tomura@example.com=Tomura");
    writer.close();
  }

  @After
  public void tearDown() throws Exception {
    new File(FILENAME).delete();
  }

  @Test
  public void testFound() throws IOException {
    final SimpleDatabase db = new SimpleDatabase(new FileReader(FILENAME));
    final String expected = "Hiroshi Yuki";
    final String actual = db.getValue("hyuki@example.com");
    assertEquals(expected, actual);
  }

  @Test
  public void testNotFound() throws IOException {
    final SimpleDatabase db = new SimpleDatabase(new FileReader(FILENAME));
    final String expected = null;
    final String actual = db.getValue("unknown@example.com");
    assertEquals(expected, actual);
  }
}