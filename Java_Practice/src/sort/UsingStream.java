package sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class UsingStream {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(2,4,1,0,4,5,2,1);
        
        Comparator<Integer> sort = (a, b) -> {
            if(a>b)
                return 1;
            else if(a<b)
                return -1;
            else
                return 0;
        };
        
        list.stream().distinct().sorted(Comparator.comparing(Integer::intValue)).forEach(System.out::println);
        
        System.out.println(list.stream().map(x -> x*x).filter(x -> x<10).mapToDouble(Integer::doubleValue).average().orElse(0.0));
        
        list.stream().map(x -> x*x).filter(x -> x<10).mapToInt(Integer::intValue).average().ifPresent((s)->System.out.println(s));
        
        list.stream().map(x -> x*x).filter(x -> x<10).mapToInt(Integer::intValue).average().ifPresentOrElse((s)->System.out.println(s), ()->System.out.println(0.0));
        
        //list.parallelStream()
        
        list.parallelStream().forEach((s) -> System.out.println(Thread.currentThread()));

	}

}
