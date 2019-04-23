package com.luckyxs;

/**
 * @author fengmengji < dream_0926@163.com >
 * @date 2019/4/22
 */
public class aa {
    // 我是Feature分支的新功能
    // 我是员工甲提交的代码 我就是不要这个文件 你呢
    // 我是员工甲提交的代码  我是员工甲的第二次改变文件
    // 模拟线上分支已经被其他成员提交新功能
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
