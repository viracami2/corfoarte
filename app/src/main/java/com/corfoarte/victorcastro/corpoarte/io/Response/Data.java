package com.corfoarte.victorcastro.corpoarte.io.Response;


public class Data {

    private String type;
    private int id;
    private Attributes attributes;


    public Data() {
    }


    public Data(String type, int id, Attributes attributes) {
        super();
        this.type = type;
        this.id = id;
        this.attributes = attributes;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Attributes getAttributes() {
        return attributes;
    }

    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }

}