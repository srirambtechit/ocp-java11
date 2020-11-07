package pkg.client;

import pkg.spi.*;
import java.util.*;

public class People {
  public static void main(String[] args) {
    ServiceLoader<MyService> loader = ServiceLoader.load(MyService.class);
    for(MyService service: loader) {
      System.out.println(service);
    }
  }
}
