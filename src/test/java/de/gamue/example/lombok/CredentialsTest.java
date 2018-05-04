package de.gamue.example.lombok;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CredentialsTest {

  private static final String USERNAME = "bla";
  private static final String PASSWORD = "blubb";

  @Test
  public void testConstructorAndGetter() {
    Credentials credentials = new Credentials(USERNAME, PASSWORD);

    Assertions.assertEquals(USERNAME, credentials.getUsername());
    Assertions.assertEquals(PASSWORD, credentials.getPassword());
  }
}
