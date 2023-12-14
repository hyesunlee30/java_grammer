package Java;

import java.util.*;


public class C09Map {
    public static void main(String[] args) {
//        //map은 dictionary와 비슷
//        //해시값을 가지고 주소값으로 삼는다.
//        //key를 가지고 값을 찾고자 할 때 O(1) 복잡도로 빠르게 검색가능
//
//        Map<String, String> myMap = new HashMap<>();
//        myMap.put("basketball", "농구");
//        myMap.put("baseball", "야구");
//        myMap.put("soccer", "축구");
//
//        // 순서가 없다
//        //size(), isEmpty() 사용가능
//        myMap.put("basketball","탁구");
//        //putIfAbsent 없으면 넣는다.
//        myMap.putIfAbsent("baseball","배구");
//        System.out.println(myMap);
//        //getOrDefault 없으면 디폴트값 가져오기
//        System.out.println(myMap.getOrDefault("tennis","없다"));
//        //containsKey
//        System.out.println(myMap.containsKey("tennis"));
//        //remove
//        myMap.remove("tennis");
//        // key, value
//        System.out.println(myMap.keySet());
//        System.out.println(myMap.values());
//
//        //enhanced for
//        for (String a : myMap.keySet()) {
//            System.out.println(a);
//        }
//
//        Map<String, String> myMap = new HashMap<>();
//        myMap.put("basketball", "농구");
//        myMap.put("baseball", "야구");
//        myMap.put("soccer", "축구");
//        //iterator keySet 을 가지고 있다.
//        Iterator<String> myItr = myMap.keySet().iterator();
//        //next 메소드는 소모시키면서 return 한다
//        //System.out.println(myItr.next());
//
//        while (myItr.hasNext())
//        {
//            System.out.println(myItr.next()); // 소모된다.
//        }
//        //아래의 리스트를 가지고 좋아하는 운동종목과 사람숫자를 map형태로 나타내시오.
//        List<String> list = new ArrayList<>();
//        list.add("soccer");
//        list.add("basketball");
//        list.add("soccer");
//        list.add("baseball");
//        list.add("soccer");
//        list.add("soccer");
//        list.add("soccer");
//        list.add("baseball");
//
//        HashMap<String, Integer> map1 = new HashMap<>();
//        for (int i = 0; i<list.size(); i++) {
//            if (map1.containsKey(list.get(i))) {
//                map1.put(list.get(i), map1.get(list.get(i))+1);
//            } else {
//                map1.put(list.get(i), 1);
//            }
//            map1.put(list.get(i), map1.getOrDefault(list.get(i),0)+1);
//        }
//        //System.out.println(map1);
//        HashMap<String, Integer> map2 = new HashMap<>();
//
//        for (String a : list) {
//            map2.put(a, map2.getOrDefault(a,0)+1); // 있으면 +1 없으면 0
//        }
//
//        System.out.println(map2);
//
//        HashMap<String, Integer> map = new HashMap<>();
//        String[] participant = {"marina", "marina", "nikola", "vinko", "filipa"};
//        String[] completion = {"josipa", "filipa", "marina", "nikola"};
//
//        for (String a : participant) {
//            map.put(a, map.getOrDefault(a, 0)+1);
//
//        }
//        for (String a : completion) {
//            if(map.get(a) == 1) {
//                map.remove(a);
//            } else {
//                map.put(a, map.getOrDefault(a, 0)-1);
//            }
//        }
//
//        String answer = map.keySet().iterator().next();
//        System.out.println(answer);

        //LinkedHashMap 삽입순서 유지, 넣은 순서대로
        Map<String, Integer> myMap1 = new LinkedHashMap<>();
        myMap1.put("hello5",5);
        myMap1.put("hello4",4);
        myMap1.put("hello3",3);
        myMap1.put("hello2",2);
        myMap1.put("hello1",1);

        // 키에 따른 오름차순 정렬
        Map<String, Integer> myMap2 = new TreeMap<>();
        myMap2.put("hello5",5);
        myMap2.put("hello4",4);
        myMap2.put("hello3",3);
        myMap2.put("hello2",2);
        myMap2.put("hello1",1);

        System.out.println(myMap1);
        System.out.println(myMap2);



    }
}
