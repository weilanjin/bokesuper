package com.wlj.user;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * @program: bokesuper
 * @description: 用户注册实体类
 * @author: wlj
 * @create: 2019-01-13 15:17
 **/

public class Register implements Serializable {
    //主键
    private String id;
    //姓名
    private String name;
    //密码
    private String pass;
    //邮箱
    private String mail;
    //角色
    private String roleId;
    //创建日期
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Timestamp createAt;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public Timestamp getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Timestamp createAt) {
        this.createAt = createAt;
    }
}
