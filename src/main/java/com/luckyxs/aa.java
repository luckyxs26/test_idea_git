package com.luckyxs;

/**
 * @author fengmengji < dream_0926@163.com >
 * @date 2019/4/22
 */
public class aa {
    public static void main(String[] args) {
        idGenerate("004");
    }

    /**
     *
     * @param idMax  查询数据库中最大的id
     */
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