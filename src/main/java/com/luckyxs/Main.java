package com.luckyxs;

import java.util.List;

/**
 * @author fengmengji < dream_0926@163.com >
 * @date 2019/3/5
 */
public class Main {

    public static void main(String[] args) {
        String str = "AAAABCCDD";
        String s="";
        String newStr="";
        int num=1;
        for(int i=0;i<str.length();i++){
            String ss = str.substring(i, i + 1);
            if(ss.equals(s)){
                num++;
                if(i==str.length()-1){
                    newStr=newStr+s+num;
                }
            }else{
                if(num>1){
                    newStr=newStr+s+num;
                }else if(num==1){
                    newStr=newStr+s;
                }
                s=ss;
                num=1;
            }
        }
        System.out.println(newStr);
    }

    public void aaa(){
        //        System.out.println(5&12);
//        System.out.println(5|12);
//        //  0101
//        //  1100
//        //& 0100
//        //| 1101
//        // 转换规则 | 有1为1
//        // 转换规则 & 有0为0  可以理解为0是false 1为true
//        // & 运算符是有false为false | 运算符是有true为true
//        // & 理解为数学里面的且 | 理解为或 (有人会问这个是什么意思  嘻嘻 字面意思 - - )
        String str ="asFasdfsadzZ";
        char[] chars = str.toCharArray();
        for(int i=0;i<chars.length;i++){

            if(chars[i]==90){
                chars[i]='A';
            }else if(chars[i]==122){
                chars[i]='a';
            }else{
                chars[i]=(char)(chars[i]+1);
            }

        }
        String s = new String(chars);
        System.out.println(s);
    }

    /**
     *  这个方法是需要  判断实体类对应的表 判断这个表的id是否是001 如果是创建一个新的数据(只有id) id累加 可以指定次数
     *
     * @return
     */
    /**
     *
     * @param num   需要id的个数
     * @return
     */
    // 我是Feature分支的新功能
    public List<Integer> test(Integer num){

        return null;
    }
}
