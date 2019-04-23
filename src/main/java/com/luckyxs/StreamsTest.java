package com.luckyxs;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author fengmengji < dream_0926@163.com >
 * @date 2019/4/23
 */
public class StreamsTest {

    public static void main(String[] args) {
        List<User> users = LambdaTest.getUsers();

        // 过滤前
        System.out.println("过滤前");
        users.forEach(user-> System.out.println(user));

        // 我们需要过滤掉年龄大于20的用户  collect() 返回一个什么类型的数据
        users = users.stream().filter(user -> user.getAge() <= 20).collect(Collectors.toList());

        // 过滤后
        System.out.println("过滤后");
        users.forEach(user-> System.out.println(user));
        // 重置userList
        users = LambdaTest.getUsers();
        System.out.println("过滤不为姓名mkyong或者alvin的用户");
        // 直接返回符合的对象   findAny()返回一个满足条件的对象  orElse(null)是没有找到条件的对象的话返回null
        User user1 = users.stream().filter(user -> user.getUsername().equals("mkyong") || user.getUsername().equals("alvin"))
                .findAny().orElse(null);
        System.out.println(user1);
        // map() 返回一个什么样的类型数据
        // 返回对象中的名称
        System.out.println("返回对象中的名称");
        System.out.println(users.stream().filter(user -> user.getUsername().equals("mkyong") || user.getUsername().equals("alvin"))
                .map(User::getUsername).findAny().orElse(null));
        // 直接打印集合数据 users.forEach(System.out::println); 写法
        System.out.println("直接打印集合数据 写法: users.forEach(System.out::println); ");
        users.forEach(System.out::println);

    }

}
