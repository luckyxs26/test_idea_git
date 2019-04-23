package com.luckyxs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author fengmengji < dream_0926@163.com >
 * @date 2019/4/22
 */
public class LambdaTest {

    public static void main(String[] args) {

        List<User> listDevs = getUsers();

        System.out.println("排序前");
        for (User User : listDevs) {
            System.out.println(User);
        }

        //按照age排序  没有使用lambda表达式
        Collections.sort(listDevs, new Comparator<User>() {
            public int compare(User o1, User o2) {
                // 正序排序
                return o1.getAge() - o2.getAge();
            }
        });
        // 使用lambda表达式
        //Collections.sort(listDevs,);
        listDevs.sort((User o1, User o2)->o1.getAge()-o2.getAge());
        Runnable hhh = () -> System.out.println("hhh");


        System.out.println("排序后");
        listDevs.forEach((user)->System.out.println(user));
        // 总结 Lambda表达式 使用->来连接  允许把函数当成一个方法的参数
    }

    public static List<User> getUsers() {

        List<User> result = new ArrayList<User>();

        result.add(new User("mkyong",33));
        result.add(new User("alvin",20));
        result.add(new User("jason",10));
        result.add(new User("iris", 55));

        return result;

    }

}
