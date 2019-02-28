package com.example.demo.model;

import java.io.Serializable;
import java.util.Date;

public class AoaUser implements Serializable{
    private Long userId;

    private String address;

    private String bank;

    private Date birth;

    private String eamil;

    private Long fatherId;

    private Date hireTime;

    private String userIdcard;

    private String imgPath;

    private Integer isLock;

    private String lastLoginIp;

    private Date lastLoginTime;

    private Date modifyTime;

    private Long modifyUserId;

    private String password;

    private String realName;

    private Float salary;

    private String userSchool;

    private String sex;

    private String themeSkin;

    private String userEdu;

    private String userName;

    private String userSign;

    private String userTel;

    private Long deptId;

    private Long positionId;

    private Long roleId;

    private Integer superman;

    private Integer holiday;

    private String pinyin;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank == null ? null : bank.trim();
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getEamil() {
        return eamil;
    }

    public void setEamil(String eamil) {
        this.eamil = eamil == null ? null : eamil.trim();
    }

    public Long getFatherId() {
        return fatherId;
    }

    public void setFatherId(Long fatherId) {
        this.fatherId = fatherId;
    }

    public Date getHireTime() {
        return hireTime;
    }

    public void setHireTime(Date hireTime) {
        this.hireTime = hireTime;
    }

    public String getUserIdcard() {
        return userIdcard;
    }

    public void setUserIdcard(String userIdcard) {
        this.userIdcard = userIdcard == null ? null : userIdcard.trim();
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath == null ? null : imgPath.trim();
    }

    public Integer getIsLock() {
        return isLock;
    }


    public void setIsLock(Integer isLock) {
        this.isLock = isLock;
    }

    public String getLastLoginIp() {
        return lastLoginIp;
    }

    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp == null ? null : lastLoginIp.trim();
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Long getModifyUserId() {
        return modifyUserId;
    }

    public void setModifyUserId(Long modifyUserId) {
        this.modifyUserId = modifyUserId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    public Float getSalary() {
        return salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }

    public String getUserSchool() {
        return userSchool;
    }

    public void setUserSchool(String userSchool) {
        this.userSchool = userSchool == null ? null : userSchool.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getThemeSkin() {
        return themeSkin;
    }

    public void setThemeSkin(String themeSkin) {
        this.themeSkin = themeSkin == null ? null : themeSkin.trim();
    }

    public String getUserEdu() {
        return userEdu;
    }

    public void setUserEdu(String userEdu) {
        this.userEdu = userEdu == null ? null : userEdu.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserSign() {
        return userSign;
    }

    public void setUserSign(String userSign) {
        this.userSign = userSign == null ? null : userSign.trim();
    }

    public String getUserTel() {
        return userTel;
    }

    public void setUserTel(String userTel) {
        this.userTel = userTel == null ? null : userTel.trim();
    }

    public Long getDeptId() {
        return deptId;
    }

    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    public Long getPositionId() {
        return positionId;
    }

    public void setPositionId(Long positionId) {
        this.positionId = positionId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Integer getSuperman() {
        return superman;
    }

    public void setSuperman(Integer superman) {
        this.superman = superman;
    }

    public Integer getHoliday() {
        return holiday;
    }

    public void setHoliday(Integer holiday) {
        this.holiday = holiday;
    }

    public String getPinyin() {
        return pinyin;
    }

    public void setPinyin(String pinyin) {
        this.pinyin = pinyin == null ? null : pinyin.trim();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AoaUser aoaUser = (AoaUser) o;

        return userId.equals(aoaUser.userId);
    }

    @Override
    public int hashCode() {
        return userId.hashCode();
    }

    @Override
    public String toString() {
        return "AoaUser{" +
                "userId=" + userId +
                ", address='" + address + '\'' +
                ", bank='" + bank + '\'' +
                ", birth=" + birth +
                ", eamil='" + eamil + '\'' +
                ", fatherId=" + fatherId +
                ", hireTime=" + hireTime +
                ", userIdcard='" + userIdcard + '\'' +
                ", imgPath='" + imgPath + '\'' +
                ", isLock=" + isLock +
                ", lastLoginIp='" + lastLoginIp + '\'' +
                ", lastLoginTime=" + lastLoginTime +
                ", modifyTime=" + modifyTime +
                ", modifyUserId=" + modifyUserId +
                ", password='" + password + '\'' +
                ", realName='" + realName + '\'' +
                ", salary=" + salary +
                ", userSchool='" + userSchool + '\'' +
                ", sex='" + sex + '\'' +
                ", themeSkin='" + themeSkin + '\'' +
                ", userEdu='" + userEdu + '\'' +
                ", userName='" + userName + '\'' +
                ", userSign='" + userSign + '\'' +
                ", userTel='" + userTel + '\'' +
                ", deptId=" + deptId +
                ", positionId=" + positionId +
                ", roleId=" + roleId +
                ", superman=" + superman +
                ", holiday=" + holiday +
                ", pinyin='" + pinyin + '\'' +
                '}';
    }

}