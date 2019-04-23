package com.luckyxs;

/**
 * @author fengmengji < dream_0926@163.com >
 * @date 2019/4/22
 */
public class User {

    // 我只是改变了这个文件 哈哈哈
    private String username;
    private String password;

    // 当我改变了这个文件的时候 我还会改变线上其他员工更改的文件
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
