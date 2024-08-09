package collec;

import extend.Person;

import java.util.*;


public class Collection01 {
    public static void main(String[] args) {
//        test1();
//        test03();
//        List
        test04();



    }

    private static void test04() {
        List list = new ArrayList();
        list.add(0,"张三");
        list.add(1,null);
        list.add(2,"王五");
        list.add(3,"赵六");
     for (int i=0;i<list.size();i++){
        String str = (String) list.get(i);
         System.out.println(str+"12");
     }
    }

//    private static void test03() {
////        迭代器使用
//        Collection persons = new ArrayList();
//        persons.add(new Person("张三", "男", 18));
//        persons.add(new Person("李四", "男", 19));
//        persons.add(new Person("王五", "男", 20));
//        persons.add(new Person("赵六", "男", 21));
//        Iterator it = persons.iterator();
//        while (it.hasNext()) {
//            Person P = (Person) it.next();
////            System.out.println(P);
//            System.out.println(P.getName()+" "+P.getAge());
//
//        }


//    private static void test1() {
//        Collection c1 = new ArrayList();
//        c1.add(111);
//        c1.add(222);
//        c1.add(333);
//        c1.add("aaa");
//        c1.add("bbb");
//        System.out.println(c1);
//        Object[] objs = c1.toArray();
//        for (int i = 0; i < objs.length; i++) {
//            System.out.println(objs[i]);
//        }
    }









//      test04_retainAll();
//
//        test3_containsAll();
//    }
//
//    private static void test3_containsAll() {
//        Collection c1=new ArrayList();
//        c1.add(111);
//        c1.add(222);
//        System.out.println(c1);
//
//        Collection c2=new ArrayList();
//        c2.add(222);
//        c2.add(333);
//        c2.add(444);
//        System.out.println(c2);
//        //判断c1是否包含c2
//        System.out.println(c1.containsAll(c2));
//
//    }

//    private static void test04_retainAll() {
//        Collection c1=new ArrayList();
//        c1.add(111);
//        c1.add(222);
//        System.out.println(c1);
//
//        Collection c2=new ArrayList();
//        c2.add(222);
//        c2.add(333);
//        System.out.println(c2);
//
//        //取交集
//        c1.retainAll(c2);
//        System.out.println(c1);






