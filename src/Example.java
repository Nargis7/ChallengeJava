//import java.security.spec.RSAOtherPrimeInfo;
//import java.util.HashSet;
//
//public class Example {
//    public static void main(String[] args) {
//        HashSet <Integer> set = new HashSet<>();
////        insert
//        set.add(1);
//        set.add(2);
//        set.add(3);
//        set.add(1); // duplicate it will ignored
////        search
//        if(set.contains(1)){
//            System.out.println("set contains");
//        }
////        remove
//        set.remove(3);

import java.util.HashSet;
import java.util.Iterator;

////        print
//        System.out.println("set" + set);
//    }
//}

public class Example {
    public static void main(String[] args) {
        HashSet <String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Litchi");
        set.add("papaya");
//        create iterator
        Iterator <String> it = set.iterator();
//        traverse using iterator
        while(it.hasNext()){
            String fruits = it.next();
            System.out.println(fruits);
        }
    }
}