package com.corfoarte.victorcastro.corpoarte.io.Response;

import java.util.List;


/**
 * Created by Victor Castro on 15/07/2017.
 */

public class GruposResponse {


    private Data data;
    private List<Object> errors = null;


    public GruposResponse() {
    }


    public GruposResponse(Data data, List<Object> errors) {
        super();
        this.data = data;
        this.errors = errors;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public List<Object> getErrors() {
        return errors;
    }

    public void setErrors(List<Object> errors) {
        this.errors = errors;
    }

}
