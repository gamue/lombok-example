package de.gamue.example.lombok;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class ClientConfiguration {

  private final String host;
  private final int port;
  private final String username;
  private final String password;
}
