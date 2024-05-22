package java8;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

//@FunctionalInterface
//interface Square {
//    int calculate(int x);
//}
 
public class Java8Demo1 {
    public static void main(String args[])
    {
//        int a = 5;
// 
//        // lambda expression to define the calculate method
//        Square s = (int x) -> x * x;
// 
//        // parameter passed and return type must be
//        // same as defined in the prototype
//        int ans = s.calculate(a);
//        System.out.println(ans);
        
        List<String> list = Arrays.asList("Geek", "GeeksQuiz", "g1", "QA", "Geek2");
        
        Predicate<String> p = s -> s.startsWith("G");
        
        for(String l : list)
        {
        	if(p.test(l))
        		System.out.println(l);
        }
        
    }
}