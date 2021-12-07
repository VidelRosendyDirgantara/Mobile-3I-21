package org.aplas.latihanretrofit.models;

import com.google.gson.annotations.SerializedName;

import org.aplas.latihanretrofit.MainActivity;

public class Repo extends MainActivity {
    @SerializedName("id")
    private Integer id;

    @SerializedName("html_url")
    private String htmlurl;

    @SerializedName("description")
    private String description;

    public Integer getId() {return id; }
    public String getHtmlUrl() {return htmlurl;}
    public String getDescription() {return description;}
}
