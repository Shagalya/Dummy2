package collectionspractice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;
public class Test {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Red");
		list.add("Pink");
		list.add("2");		
		System.out.println(list);
		list.add(0, "Sha");
		list.add(2, "A");
		list.set(4, "B");
		list.remove(2);
		//System.out.println(list.get(0));
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
		System.out.println(it.next());
		}
		if(list.contains("B"))
			System.out.println("yes");
		else
			System.out.println("no");
		Collections.sort(list);
		System.out.println(list);
	}

}
