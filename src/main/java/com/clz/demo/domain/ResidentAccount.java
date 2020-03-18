package com.clz.demo.domain;

import java.util.Date;

/**
 * Created by Luke 2020/3/16 9:52
 */
public class ResidentAccount {
    private String Id;
    private String Name;
    private char Gender;
    private Date Birthday;
    private String IdentityCard;
    private String OfficialAddres;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public char getGender() {
        return Gender;
    }

    public void setGender(char gender) {
        Gender = gender;
    }

    public Date getBirthday() {
        return Birthday;
    }

    public void setBirthday(Date birthday) {
        Birthday = birthday;
    }

    public String getIdentityCard() {
        return IdentityCard;
    }

    public void setIdentityCard(String identityCard) {
        IdentityCard = identityCard;
    }

    public String getOfficialAddres() {
        return OfficialAddres;
    }

    public void setOfficialAddres(String officialAddres) {
        OfficialAddres = officialAddres;
    }

    @Override
    public String toString() {
        return "ResidentAccount{" +
                "Id='" + Id + '\'' +
                ", Name='" + Name + '\'' +
                ", Gender=" + Gender +
                ", Birthday=" + Birthday +
                ", IdentityCard='" + IdentityCard + '\'' +
                ", OfficialAddres='" + OfficialAddres + '\'' +
                '}';
    }
}
