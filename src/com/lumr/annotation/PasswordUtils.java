package com.lumr.annotation;

import java.util.List;

/**
 * 注解的使用例子
 * Created by lumr on 2017/7/6.
 */
public class PasswordUtils {
    @UseCase(id = 47,description = "密码必须最少有一个数字")
    public boolean validatePassword(String password){
        return password.matches("\\w*\\d\\w*");
    }

    @UseCase(id = 48)
    public String encryptPassword(String password) {
        return new StringBuilder(password).reverse().toString();
    }

    @UseCase(id = 49,description = "新密码不等于旧密码。")
    public boolean checkForNewPassword(List<String> prevPasswords, String password){
        return !prevPasswords.contains(password);
    }
}
