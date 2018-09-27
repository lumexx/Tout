package com.tout.tout.entities.urban;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class MyResponse {

    @SerializedName("list")
    private List<Note> list;

    public List<Note> getList() {
        return list;
    }
}
