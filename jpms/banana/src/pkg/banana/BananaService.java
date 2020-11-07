package pkg.banana;

import pkg.spi.*;

public class BananaService implements MyService {
  public void service(String name) {
    System.out.println("Banana service provided for " + name);
  }
}
