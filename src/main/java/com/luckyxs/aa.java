package com.luckyxs;

/**
 * @author fengmengji < dream_0926@163.com >
 * @date 2019/4/22
 */
public class aa {
    // 模拟创建新分支 练习别人创建好的分支
    public static void main(String[] args) {
        idGenerate("004");
    }

    /**
     *
     * @param idMax  查询数据库中最大的id
     */
    // 我是员工乙提交的代码
    public static void idGenerate(String idMax){
        int idMaxInt=Integer.parseInt(idMax)+1;
        String strNum="";
        int num;
        for(;idMaxInt<100;idMaxInt++){
            // 当前id位数
            num=(idMaxInt+"").length();
            for(int n=0;n<3-num;n++){
                strNum+="0";
            }
            idMax=strNum+idMaxInt;
            strNum="";
            System.out.println(idMax);
        }
    }






}
