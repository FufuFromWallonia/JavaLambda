package java8.foreach;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.lang.Integer;

public class TraversalExample {

	public void traversalUsingIterator(){
		//creating sample Collection
		List<Integer> myList = new ArrayList<Integer>();
		for(int i=0; i<10; i++) myList.add(i);
		//tag::traversalIterator[]
		Iterator<Integer> it = myList.iterator();
		while(it.hasNext()){
			Integer i = it.next();
			System.out.println("Value::"+i);
		}
		//end::traversalIterator[]
	}

	public void traversalUsingForeach(){
		//creating sample Collection
		List<Integer> myList = new ArrayList<Integer>();
		for(int i=0; i<10; i++) myList.add(i);
		//tag::traversalForeach[]
		myList.forEach(new Consumer<Integer>() {
			public void accept(Integer t) {
				System.out.println("Value::"+t);
			}
		});
		//end::traversalForeach[]
	}
	
	public void traversalUsingForeachAndLambda(){
		//creating sample Collection
		List<Integer> myList = new ArrayList<Integer>();
		for(int i=0; i<10; i++) myList.add(i);
		//tag::traversalForeachLambda[]
		myList.forEach( t -> System.out.println("Value::"+t));
		//end::traversalForeachLambda[]
	}
}
