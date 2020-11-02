package pkg.banana;

public class Banana {
	
	public static void main(String[] args) {
		moduleInfo();
	}
	
	public static void moduleInfo() {
		Module m = Banana.class.getModule();
		System.out.println(m);
		System.out.format("Module: %s%n", m.getName());
		System.out.println("isNamed: " + m.isNamed());
		System.out.println("Descriptor: " + m.getDescriptor());
	}
	
	public static String name() {
		return "Mauritius Banana";
	}
	
}