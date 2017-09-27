package java8.methodref;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MethodReferenceExample {
    public static class Person {
        private String name;
        private Integer age;
        public Person(String name,Integer age){
            this.name=name;
            this.age=age;
        }
        public String getName(){
            return this.name;
        }
        public Integer getAge(){
            return this.age;
        }
    }
    public void comparatorUsingLambda() {
        List<Person> persons=Arrays.asList(new Person("Alain",40),new Person("Benjamin",20));
        // tag::comparatorLambda[]
        persons.sort(
            Comparator
                    .comparing((Person person) -> person.getName())
                    .thenComparing((Person person) -> person.getAge()));
        // end::comparatorLambda[]
    }

    public void comparatorUsingLambdaAndMethodReference() {
        List<Person> persons=Arrays.asList(new Person("Alain",40),new Person("Benjamin",20));
        // tag::comparatorLambdaMethodReference[]
        persons.sort(
                Comparator
                        .comparing(Person::getName)
                        .thenComparing(Person::getAge));
        // end::comparatorLambdaMethodReference[]
    }
}
