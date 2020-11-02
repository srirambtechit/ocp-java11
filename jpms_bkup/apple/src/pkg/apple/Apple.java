package pkg.apple;

import pkg.banana.*;

public class Apple {
	
	public static void main(String[] args) {
		moduleInfo();
		System.out.println(Banana.name());
	}
	
	public static void moduleInfo() {
		Module m = Apple.class.getModule();
		System.out.println(m);
		System.out.format("Module: %s%n", m.getName());
		System.out.println("isNamed: " + m.isNamed());
		System.out.println("Descriptor: " + m.getDescriptor());
	}
	
	public static String name() {
		return "Kashmir apple";
	}
	
}