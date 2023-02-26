package com.mydias.mydias.vo;

public class UserVO {

    public String getUserNo() {
        return userNo;
    }

    @Override
    public String toString() {
        return "UserVO{" +
                "userNo='" + userNo + '\'' +
                ", email='" + email + '\'' +
                ", passwdEnc='" + passwdEnc + '\'' +
                ", nickName='" + nickName + '\'' +
                ", userNm='" + userNm + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                ", userYn='" + userYn + '\'' +
                '}';
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    public String getPasswdEnc() {
        return passwdEnc;
    }

    public void setPasswdEnc(String passwdEnc) {
        this.passwdEnc = passwdEnc;
    }

    public String getUserNm() {
        return userNm;
    }

    public void setUserNm(String userNm) {
        this.userNm = userNm;
    }

    public String getUserYn() {
        return userYn;
    }

    public void setUserYn(String userYn) {
        this.userYn = userYn;
    }

    private String userNo;
    private String email;
    private String passwdEnc;
    private String nickName;
    private String userNm;
    private String phoneNo;
    private String userYn;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }


    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

}
