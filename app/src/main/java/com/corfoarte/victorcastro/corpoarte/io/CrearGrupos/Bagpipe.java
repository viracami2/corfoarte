package com.corfoarte.victorcastro.corpoarte.io.CrearGrupos;

/**
 * Created by Victor Castro on 16/07/2017.
 */


public class Bagpipe {

    private String group_name;
    private String group_director;
    private String group_category;
    private String city;
    private int phone;
    private String department;
    private String email;

    /**
     * No args constructor for use in serialization
     */
    public Bagpipe() {
    }

    /**
     * @param groupCategory
     * @param phone
     * @param groupName
     * @param email
     * @param department
     * @param groupDirector
     * @param city
     */
    public Bagpipe(String groupName, String groupDirector, String groupCategory, String city, int phone, String department, String email) {
        super();
        this.group_name = groupName;
        this.group_director = groupDirector;
        this.group_category = groupCategory;
        this.city = city;
        this.phone = phone;
        this.department = department;
        this.email = email;
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

    public String getGroupCategory() {
        return group_category;
    }

    public void setGroupCategory(String groupCategory) {
        this.group_category = groupCategory;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
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

}