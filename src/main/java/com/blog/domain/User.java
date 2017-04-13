package com.blog.domain;

import java.io.Serializable;

/**
 * Created by Snail Q
 * Date 2017/4/12.
 * Time 16:39
 */
public class User implements Serializable {
    private String name;//名字
    private String sex;//性别
    private String loginId;//登录ID
    private String pwd;//密码
    private String duty;//职责
    private int age;//年龄
    private String cellNumber;//手机号
    private String photoUrl;//头像地址
    private boolean used = true;//是否可用，默认值是True;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCellNumber() {
        return cellNumber;
    }

    public void setCellNumber(String cellNumber) {
        this.cellNumber = cellNumber;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public boolean isUsed() {
        return used;
    }

    public void setUsed(boolean used) {
        this.used = used;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (age != user.age) return false;
        if (used != user.used) return false;
        if (name != null ? !name.equals(user.name) : user.name != null) return false;
        if (sex != null ? !sex.equals(user.sex) : user.sex != null) return false;
        if (loginId != null ? !loginId.equals(user.loginId) : user.loginId != null) return false;
        if (pwd != null ? !pwd.equals(user.pwd) : user.pwd != null) return false;
        if (duty != null ? !duty.equals(user.duty) : user.duty != null) return false;
        if (cellNumber != null ? !cellNumber.equals(user.cellNumber) : user.cellNumber != null) return false;
        return !(photoUrl != null ? !photoUrl.equals(user.photoUrl) : user.photoUrl != null);

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (sex != null ? sex.hashCode() : 0);
        result = 31 * result + (loginId != null ? loginId.hashCode() : 0);
        result = 31 * result + (pwd != null ? pwd.hashCode() : 0);
        result = 31 * result + (duty != null ? duty.hashCode() : 0);
        result = 31 * result + age;
        result = 31 * result + (cellNumber != null ? cellNumber.hashCode() : 0);
        result = 31 * result + (photoUrl != null ? photoUrl.hashCode() : 0);
        result = 31 * result + (used ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", loginId='" + loginId + '\'' +
                ", pwd='" + pwd + '\'' +
                ", duty='" + duty + '\'' +
                ", age=" + age +
                ", cellNumber='" + cellNumber + '\'' +
                ", photoUrl='" + photoUrl + '\'' +
                ", used=" + used +
                '}';
    }
}
