package com.tout.tout.entities.urban;

import com.google.gson.annotations.SerializedName;

public class Note {

    @SerializedName("definition")
    private String definition;

    @SerializedName("permalink")
    private String permalink;

    @SerializedName("word")
    private String word;

    @SerializedName("example")
    private String example;


    public String getDefinition() {
        return definition;
    }


    public String getPermalink() {
        return permalink;
    }


    public String getWord() {
        return word;
    }


    public String getExample() {
        return example;
    }


}
