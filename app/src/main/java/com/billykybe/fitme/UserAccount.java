package com.billykybe.fitme;

public class UserAccount {
    int id;
    String email,password;
    int pinSecurity;
    String name;
    boolean isMale;
    int age,wheight,height ;
    int levelOfWorkout ;
    int whyWorkout [] = new int[5];
    int contryCode;

    public UserAccount(int id, String email, String name ,boolean isMale,String password,  int age, int wheight, int height, int levelOfWorkout, int[] whyWorkout, int contryCode) {
        this.id = id;
        this.email = email;
        this.isMale=isMale;
        this.password = password;
        this.name = name;
        this.age = age;
        this.wheight = wheight;
        this.height = height;
        this.levelOfWorkout = levelOfWorkout;
        this.whyWorkout = whyWorkout;
        this.contryCode = contryCode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPinSecurity() {
        return pinSecurity;
    }

    public void setPinSecurity(int pinSecurity) {
        this.pinSecurity = pinSecurity;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWheight() {
        return wheight;
    }

    public void setWheight(int wheight) {
        this.wheight = wheight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getLevelOfWorkout() {
        return levelOfWorkout;
    }

    public void setLevelOfWorkout(int levelOfWorkout) {
        this.levelOfWorkout = levelOfWorkout;
    }

    public int[] getWhyWorkout() {
        return whyWorkout;
    }

    public void setWhyWorkout(int[] whyWorkout) {
        this.whyWorkout = whyWorkout;
    }

    public int getContryCode() {
        return contryCode;
    }

    public void setContryCode(int contryCode) {
        this.contryCode = contryCode;
    }
}
