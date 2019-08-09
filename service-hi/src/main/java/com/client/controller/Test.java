package com.client.controller;

import com.client.entity.User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author xzk
 * @date 2019/7/31
 **/
public class Test {
    interface MathOperation {
        int operation(int a, int b);
    }

    interface GreetingService {
        void sayMessage(String message);
    }

    private int operate(int a, int b, MathOperation mathOperation){
        return mathOperation.operation(a, b);
    }
    public static void main(String[] args) {
        MathOperation mathOperation = (a,b)->5;
        System.out.println(mathOperation.operation(1,3));
        List<User> names1 = new ArrayList<>();
        User user = new User();
        user.setName("Google");
        user.setAge(1);
        names1.add(user);
        User user1 = new User();
        user1.setName("Google1");
        names1.add(user1);
        User user2 = new User();
        user2.setName("Google2");
        names1.add(user2);
        User user3 = new User();
        user3.setName("Google3");
        names1.add(user3);
        User user4 = new User();
        user4.setName("Google4");
        names1.add(user4);
        User user5 = new User();
        user5.setAge(2);
        user5.setName("Google");
        names1.add(user5);
        names1.stream().distinct().forEach(s -> {
            System.out.println(s.getName());
        });
        List<User> list = names1.stream().filter(x->x.getName().equals("Google")).collect(Collectors.toList());
        System.out.println("------------------------");
        System.out.println(list);
        System.out.println("------------------------");
        names1.stream().map(i->{
            i.setName("hehehe");
            return i;
        }).forEach(k->System.out.println(k));
      /*  List<String> names1 = new ArrayList<String>();
        names1.add("Google ");
        names1.add("Runoob ");
        names1.add("Taobao ");
        names1.add("Baidu ");
        names1.add("Sina ");

        List<String> names2 = new ArrayList<String>();
        names2.add("Google ");
        names2.add("Runoob ");
        names2.add("Taobao ");
        names2.add("Baidu ");
        names2.add("Sina ");
        System.out.println(names1);
        Collections.sort(names1, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println(names1);
        System.out.println(names2);
        Collections.sort(names2,String::compareTo);
        Collections.sort(names2,(s1,s2)->s1.compareTo(s2));
        System.out.println(names2);*/

    }
}
