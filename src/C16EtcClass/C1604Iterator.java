package C16EtcClass;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C1604Iterator {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("apple");
        myList.add("banana");
        myList.add("cherry");
//        //원본변경 안 됨
//        for (String s : myList) {
//            System.out.println(s);
//        }

//        myList.iterator().forEachRemaining(
//                System.out::println
//        );
        Iterator<String> iterator = myList.listIterator();
        while (iterator.hasNext()) {
            String temp = iterator.next();
            if(temp.equals("banana")) {
                iterator.remove();
            }
        }
        System.out.println(myList);
    }
}
