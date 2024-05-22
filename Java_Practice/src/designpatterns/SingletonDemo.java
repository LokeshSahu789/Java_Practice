package designpatterns;
class LimitClass1 {

    private static LimitClass1 limInstance;

    private LimitClass1(){
    }

    public static synchronized LimitClass1 getLimInstance(){
        if(limInstance == null ){
            limInstance = new LimitClass1();
        }
        return limInstance;
    }
}

public class SingletonDemo {

    public static void main(String[] args) {

    	LimitClass1 obj1 = LimitClass1.getLimInstance();
    	LimitClass1 obj2 = LimitClass1.getLimInstance();
    	LimitClass1 obj3 = LimitClass1.getLimInstance();
    	LimitClass1 obj4 = LimitClass1.getLimInstance();
    	LimitClass1 obj5 = LimitClass1.getLimInstance();
    	LimitClass1 obj6 = LimitClass1.getLimInstance();

        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);
        System.out.println(obj4);
        System.out.println(obj5);
        System.out.println(obj6);
        
        //LimitClass1 obj = obj1.clone();
       // System.out.println(obj1);
        
      }
}