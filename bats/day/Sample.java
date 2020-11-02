import java.util.*;

public class Sample {
	
	public static void main(String[] args) throws Exception {
		List<Integer> integers = new ArrayList<>(Arrays.asList(1, 2, 3));
		process(integers);
		System.out.println(integers);
	}
	
	static void process(List<? extends Integer> list) {
		System.out.println("processing...");
		Iterator<? extends Integer> itr = list.iterator();
		while(itr.hasNext()) {
			Integer n = itr.next();
			while(n.intValue() % 2 == 0)
				itr.remove();
		}
	}
		
}
