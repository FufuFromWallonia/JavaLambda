package java8.defmethod;

public class DefaultMethodExample {
	// tag::orderableDefaultMethods[]
	public interface Orderable<T> extends Comparable<T> {
		public default boolean isAfter(T other) {
			return compareTo(other) > 0;
		}

		public default boolean isBefore(T other) {
			return compareTo(other) < 0;
		}

		public default boolean isSameAs(T other) {
			return compareTo(other) == 0;
		}
	}
	// end::orderableDefaultMethods[]

	// tag::orderableImplemented[]
	public class Person implements Orderable<Person> {
		private final String name;

		public Person(String name) {
			this.name = name;
		}

		@Override
		public int compareTo(Person other) {
			return name.compareTo(other.name);
		}
	}
	// end::orderableImplemented[]
	public void exercise(){
		Person laurel = new DefaultMethodExample.Person("Laurel");
		Person hardy = new DefaultMethodExample.Person("Hardy");
		// tag::orderableInAction[]
		System.out.println(laurel.compareTo(hardy));
		// returns: 4
		System.out.println(laurel.isAfter(hardy));
		// returns true
		System.out.println(laurel.isBefore(hardy));
		// returns false
		System.out.println(laurel.isSameAs(hardy));
		// returns false
		// end::orderableInAction[]
	}
	public static void main(String[] args){
		new DefaultMethodExample().exercise();
	}
}