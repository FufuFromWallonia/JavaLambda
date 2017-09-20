package java8.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorExample {

    public void comparatorUsingAnonymousClasses(){
	// tag::comparatorAnonymous[]
        Comparator<String> comparator = new Comparator<String>() {
            public int compare(String s1, String s2) {
                return Integer.compare(s1.length(), s2.length());
            }
        };
        
	String[] strings = {"Alain", "Benjamin"};
        Arrays.sort(strings, comparator);
	// end::comparatorAnonymous[]
    }

    public void comparatorUsingLambda() {
	// tag::comparatorLambda[]
        Comparator<String> comparator = (String s1, String s2)
	       	-> Integer.compare(s1.length(), s2.length());
        
	String[] strings = {"Alain", "Benjamin"};
        Arrays.sort(strings, comparator);
	// end::comparatorLambda[]
    }
}
