package java8.methodref;

import java.util.Arrays;
import java.util.Comparator;

public class MethodReferenceExample {
    public void comparatorUsingLambda() {
        // tag::comparatorLambda[]
        Comparator<String> comparator = (String s1, String s2)
                -> String.compare(s1, s2);
        String[] strings = {"Alain", "Benjamin"};
        Arrays.sort(strings, comparator);
        // end::comparatorLambda[]
    }

    public void comparatorUsingLambdaAndMethodReference() {
        // tag::comparatorLambdaMethodReference[]
        String[] strings = {"Alain", "Benjamin"};
        Arrays.sort(strings, Strings::compare);
        // end::comparatorLambdaMethodReference[]
    }
}
