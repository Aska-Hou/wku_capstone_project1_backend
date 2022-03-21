package com.wku.domain;

public class Student {
    protected int id;
    protected String password;
    protected String name;
    protected String age;
    protected String major;
    protected String idcard_photo;
    protected String create_time;
    protected String email;
    protected String extend_data;
    protected String phone;
    protected String modify_time;

    public Student(){

    }
    public Student(String name, String password,String age,String major,String email,String phone){
        this.name = name;
        this.password = password;
        this.age = age;
        this.major = major;
        this.email = email;
        this.phone = phone;
    }

    public Student(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getIdcard_photo() {
        return idcard_photo;
    }

    public void setIdcard_photo(String idcard_photo) {
        this.idcard_photo = idcard_photo;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getExtend_data() {
        return extend_data;
    }

    public void setExtend_data(String extend_data) {
        this.extend_data = extend_data;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getModify_time() {
        return modify_time;
    }

    public void setModify_time(String modify_time) {
        this.modify_time = modify_time;
    }
}
