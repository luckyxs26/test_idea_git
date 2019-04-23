package com.luckyxs;

import java.io.IOException;
import java.util.ArrayList;

public class OpenUrl {
    public static String str = "taskkill /F /IM chrome.exe";
    //这里firefox也可以改为iexplore或者chrome等等,也就是指定打开网页的浏览器，后面这些参数就是网址，
    //实际上有文件来代替更好，主要是本人博客不多也懒得折腾了
    public static String str1 = "cmd /c start chrome "
            + "http://blog.csdn.net/u012062455/article/details/50434642 "
            + "http://blog.csdn.net/u012062455/article/details/52142258 "
            + "http://blog.csdn.net/u012062455/article/details/52347099 "
            + "http://blog.csdn.net/u012062455/article/details/52369288 "
            + "http://blog.csdn.net/u012062455/article/details/52435973 "
            + "http://blog.csdn.net/u012062455/article/details/52442838 "
            + "http://blog.csdn.net/u012062455/article/details/52454934 "
            + "http://blog.csdn.net/u012062455/article/details/52494118 "
            + "http://blog.csdn.net/u012062455/article/details/52547547 "
            + "http://blog.csdn.net/u012062455/article/details/52552183 "
            + "http://blog.csdn.net/u012062455/article/details/52614664 "
            + "http://blog.csdn.net/u012062455/article/details/52629523 "
            + "http://blog.csdn.net/u012062455/article/details/52640709 "
            + "http://blog.csdn.net/u012062455/article/details/52734888 "
            + "http://blog.csdn.net/u012062455/article/details/52734932 "
            + "http://blog.csdn.net/u012062455/article/details/52734941 "
            + "http://blog.csdn.net/u012062455/article/details/52735016 "
            + "http://blog.csdn.net/u012062455/article/details/52735065 "
            + "http://blog.csdn.net/u012062455/article/details/52735102 "
            + "http://blog.csdn.net/u012062455/article/details/52776680 "
            + "http://blog.csdn.net/u012062455/article/details/53286213 "
            + "http://blog.csdn.net/u012062455/article/details/53287643";

    //我这里把要访问的网址分成了两部分，一次性访问大概二十个左右，浏览器不敢一次打开得太多，怕爆炸
    public static String str2 = "cmd /c start firefox "
            + "http://blog.csdn.net/u012062455/article/details/52784932 "
            + "http://blog.csdn.net/u012062455/article/details/52785064 "
            + "http://blog.csdn.net/u012062455/article/details/52787301 "
            + "http://blog.csdn.net/u012062455/article/details/52787370 "
            + "http://blog.csdn.net/u012062455/article/details/52797354 "
            + "http://blog.csdn.net/u012062455/article/details/52805116 "
            + "http://blog.csdn.net/u012062455/article/details/53189873 "
            + "http://blog.csdn.net/u012062455/article/details/53189935 "
            + "http://blog.csdn.net/u012062455/article/details/53190068 "
            + "http://blog.csdn.net/u012062455/article/details/53190601 "
            + "http://blog.csdn.net/u012062455/article/details/53190685 "
            + "http://blog.csdn.net/u012062455/article/details/53199557 "
            + "http://blog.csdn.net/u012062455/article/details/53199662 "
            + "http://blog.csdn.net/u012062455/article/details/53200443 "
            + "http://blog.csdn.net/u012062455/article/details/53201836 "
            + "http://blog.csdn.net/u012062455/article/details/53203769 "
            + "http://blog.csdn.net/u012062455/article/details/53216898 "
            + "http://blog.csdn.net/u012062455/article/details/53217233 "
            + "http://blog.csdn.net/u012062455/article/details/53257059 "
            + "http://blog.csdn.net/u012062455/article/details/53259682 "
            + "http://blog.csdn.net/u012062455/article/details/53260177 "
            + "http://blog.csdn.net/u012062455/article/details/53261933 "
            + "http://blog.csdn.net/u012062455/article/details/53282380";

    public static ArrayList<String> strList = new ArrayList<String>();


    public OpenUrl() {
        strList.add(str1);
        strList.add(str2);
    }

    public static void main(String args[]) {
        // defaultBrowserOpenUrl();
        OpenUrl openUrl = new OpenUrl();
        while (true) {
            int i = 0;
            String strUrl = "";
            while (i < 2) {
                strUrl = strList.get(i);
                openFirefoxBrowser(strUrl, str);
                //每关闭一次浏览器，等待大概30s再重启，太过频繁浏览器会爆炸
                try {
                    Thread.sleep(30000);
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                i++;
            }
            //遍历一次睡一个小时，一天可以跑个二十二二十三次左右
            try {
                Thread.sleep(3600000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

    //使用指定的浏览器打开
    public static void openFirefoxBrowser(String start, String stop) {
        // 启用cmd运行firefox的方式来打开网址。
        try {
            Runtime.getRuntime().exec(start);
            try {
                Thread.sleep(60000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            Runtime.getRuntime().exec(stop);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //使用操作系统默认的浏览器打开
//    private static void defaultBrowserOpenUrl() {
//        // ...
//        try {
//            Desktop.getDesktop().browse(new URI("http://blog.csdn.net/u012062455/article/details/52369288"));
//        } catch (IOException | URISyntaxException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        } // 网址被屏蔽了，手动加网址试一下。
//    }
}