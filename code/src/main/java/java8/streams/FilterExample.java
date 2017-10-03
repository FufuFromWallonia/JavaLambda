package java8.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterExample {
    public void filterUsingLoop() {
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(10);
        list.add(11);
        list.add(12);
        // tag::filterLoop[]
        Iterator<Integer> it = list.iterator();
        int sum = 0;
        while (it.hasNext()) {
            int num = it.next();
            if (num > 10) {
                sum += num;
            }
        }
        // end::filterLoop[]
    }
    public void filterUsingStream() {
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(10);
        list.add(11);
        list.add(12);
        // tag::filterStream[]
        list.stream().filter(i -> i >10).mapToInt(i -> i).sum();
        // end::filterStream[]
        // tag::filterParallelStream[]
        list.parallelStream().filter(i -> i >10).mapToInt(i -> i).sum();
        // end::filterParallelStream[]

    }
    public void streamToList() {
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(10);
        list.add(11);
        list.add(12);
        // tag::streamToCollection[]
        Stream<Integer> stream = list.stream();
        // Collect to a list
        List<Integer> resultList = stream.collect(Collectors.toList());
        // Collect to a specific type of list
        ArrayList<Integer> resultArrayList =
                stream.collect(Collectors.toCollection(ArrayList::new));
        // end::streamToCollection[]
    }
}
