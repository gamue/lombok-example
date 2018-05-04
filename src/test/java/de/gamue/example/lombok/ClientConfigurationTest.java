package de.gamue.example.lombok;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ClientConfigurationTest {

  private static final String HOST = "example.com";
  private static final int PORT = 66;
  private static final String USERNAME = "max";
  private static final String PASSWORD = "xxXxx";

  @Test
  public void testBuilderCreation() {
    ClientConfiguration config = new ClientConfiguration.ClientConfigurationBuilder()
        .host(HOST)
        .port(PORT)
        .username(USERNAME)
        .password(PASSWORD)
        .build();

    Assertions.assertEquals(HOST, config.getHost());
    Assertions.assertEquals(PORT, config.getPort());
    Assertions.assertEquals(USERNAME, config.getUsername());
    Assertions.assertEquals(PASSWORD, config.getPassword());
  }
}
