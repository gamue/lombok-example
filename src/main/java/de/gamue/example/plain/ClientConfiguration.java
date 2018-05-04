package de.gamue.example.plain;

public class ClientConfiguration {

  private final String host;
  private final int port;
  private final String username;
  private final String password;

  private ClientConfiguration(ClientConfigurationBuilder builder) {
    this.host = builder.host;
    this.port = builder.port;
    this.username = builder.username;
    this.password = builder.password;
  }

  public String getHost() {
    return host;
  }

  public int getPort() {
    return port;
  }

  public String getUsername() {
    return username;
  }

  public String getPassword() {
    return password;
  }

  public class ClientConfigurationBuilder {

    private String host;
    private int port;
    private String username;
    private String password;

    public ClientConfigurationBuilder() {
    }

    public ClientConfigurationBuilder host(String host) {
      this.host = host;
      return this;
    }

    public ClientConfigurationBuilder port(int port) {
      this.port = port;
      return this;
    }

    public ClientConfigurationBuilder username(String username) {
      this.username = username;
      return this;
    }

    public ClientConfigurationBuilder password(String password) {
      this.password = password;
      return this;
    }

    public ClientConfiguration build() {
      return new ClientConfiguration(this);
    }
  }
}
