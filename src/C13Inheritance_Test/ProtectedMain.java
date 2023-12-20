package C13Inheritance_Test;

import C13Inheritance.C1304ProtectedClass;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

public class ProtectedMain extends C1304ProtectedClass {
    public static void main(String[] args) {
        //부모객체를 만들어 접근하는 건 의미가 없다
        C1304ProtectedClass c = new C1304ProtectedClass();
        //protected st3 접근 불가능
        //System.out.println(c.st3);
        //public
        System.out.println(c.st4);
        //protected를 접근하기 위해선 상속해야 protected 변수를 접근할 수 있다.
        ProtectedMain pm = new ProtectedMain();
        //protected st3 접근 가능
        System.out.println(pm.st3);

        //자식을 바로 쓰고 싶다면
        //abstract 메소드를 알아서 구현해야한다.
//        Queue<String> myQue = new Queue<String>() {
//            @Override
//            public boolean add(String s) {
//                return false;
//            }
//
//            @Override
//            public boolean offer(String s) {
//                return false;
//            }
//
//            @Override
//            public String remove() {
//                return null;
//            }
//
//            @Override
//            public String poll() {
//                return null;
//            }
//
//            @Override
//            public String element() {
//                return null;
//            }
//
//            @Override
//            public String peek() {
//                return null;
//            }
//
//            @Override
//            public int size() {
//                return 0;
//            }
//
//            @Override
//            public boolean isEmpty() {
//                return false;
//            }
//
//            @Override
//            public boolean contains(Object o) {
//                return false;
//            }
//
//            @Override
//            public Iterator<String> iterator() {
//                return null;
//            }
//
//            @Override
//            public Object[] toArray() {
//                return new Object[0];
//            }
//
//            @Override
//            public <T> T[] toArray(T[] a) {
//                return null;
//            }
//
//            @Override
//            public boolean remove(Object o) {
//                return false;
//            }
//
//            @Override
//            public boolean containsAll(Collection<?> c) {
//                return false;
//            }
//
//            @Override
//            public boolean addAll(Collection<? extends String> c) {
//                return false;
//            }
//
//            @Override
//            public boolean removeAll(Collection<?> c) {
//                return false;
//            }
//
//            @Override
//            public boolean retainAll(Collection<?> c) {
//                return false;
//            }
//
//            @Override
//            public void clear() {
//
//            }
//        }

    }

}
