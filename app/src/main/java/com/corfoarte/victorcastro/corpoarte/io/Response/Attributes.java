package com.corfoarte.victorcastro.corpoarte.io.Response;

public class Attributes {

    private int id;
    private String group_category;
    private String group_name;
    private String group_director;
    private String city;
    private String phone;
    private String department;
    private String email;
    private String createdAt;
    private String updatedAt;

    /**
     * No args constructor for use in serialization
     */
    public Attributes() {
    }

    /**
     * @param updatedAt
     * @param group_category
     * @param id
     * @param phone
     * @param group_name
     * @param email
     * @param createdAt
     * @param department
     * @param group_director
     * @param city
     */
    public Attributes(int id, String group_category, String group_name, String group_director, String city, String phone, String department, String email, String createdAt, String updatedAt) {
        super();
        this.id = id;
        this.group_category = group_category;
        this.group_name = group_name;
        this.group_director = group_director;
        this.city = city;
        this.phone = phone;
        this.department = department;
        this.email = email;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGroupCategory() {
        return group_category;
    }

    public void setGroupCategory(String groupCategory) {
        this.group_category = groupCategory;
    }

    public String getGroupName() {
        return group_name;
    }

    public void setGroupName(String groupName) {
        this.group_name = groupName;
    }

    public String getGroupDirector() {
        return group_director;
    }

    public void setGroupDirector(String groupDirector) {
        this.group_director = groupDirector;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

}