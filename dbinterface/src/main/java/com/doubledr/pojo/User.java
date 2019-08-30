package com.doubledr.pojo;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

/**
 * 用户实体类
 */
@Entity
@Table(name = "tbUser")
public class User implements java.io.Serializable {
    @Id
    @GenericGenerator(name="idGenerator",strategy = "uuid")
    @GeneratedValue(generator = "idGenerator")
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Date getLastLoginDate() {
        return lastLoginDate;
    }

    public void setLastLoginDate(Date lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }

    public String getUserImg() {
        return userImg;
    }

    public void setUserImg(String userImg) {
        this.userImg = userImg;
    }

    @Column(name="userId",unique = true,nullable = false,length = 9)
    private String userId;//用户ID
    @Column(name="userName",unique = true,nullable = false)
    private String userName;//用户昵称
    @Column(name="userPwd",nullable = false)
    private String userPwd;//用户密码
    @Column(name="registerDate",nullable = false)
    private Date registerDate;//注册日期
    @Column(name="state",nullable = false)
    private Integer state;//用户状态
    @Column(name="lastLogin")
    private Date lastLoginDate;//最后登录日期
    @Column(name = "userImg")
    private String userImg;
}
