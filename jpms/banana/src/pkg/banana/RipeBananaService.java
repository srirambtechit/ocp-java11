package pkg.banana;

import pkg.spi.*;

public class RipeBananaService implements MyService {
  public void service(String name) {
    System.out.println("Ripe banana service provider for " + name);
  }
}
