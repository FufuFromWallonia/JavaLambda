package java8.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.concurrent.Executors;

public class RunnableExample {

    public void runnableUsingAnonymousClasses(){
	// tag::runnableAnonymous[]
        Runnable r = new Runnable() {
            public void run() {
                int i = 0;
                while (i++ < 10) {
                    System.out.println("It works!");
                }
            }
        };

        Executors.newSingleThreadExecutor().execute(r);
	// end::runnableAnonymous[]
    }

    public void runnableUsingLambda() {
	// tag::runnableLambda[]
        Runnable r = () -> {
            int i = 0;
            while (i++ < 10) {
                System.out.println("It works!");
            }
        };

        Executors.newSingleThreadExecutor().execute(r);
	// end::runnableLambda[]
    }
}
