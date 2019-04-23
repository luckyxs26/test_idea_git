package com.luckyxs;

import java.util.Comparator;

/**
 * @author fengmengji < dream_0926@163.com >
 * @date 2019/4/22
 */
public class LambdaTest {


    public static void main(String[] args) {
        // 定义一个比较器 姓名密码都相等为才相等
        Comparator<User> comparator = new Comparator<User>() {
            public int compare(User o1, User o2) {
                if(o1.getUsername().equals(o2.getUsername())){
                    return 1;
                }
                return 0;
            }
        };
    }

}
