package org.aplas.latihanretrofit.services;

import org.aplas.latihanretrofit.models.Repo;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface GithubService {
    @GET("users/{VidelRosendyDirgantara}/Mobile-3I-21")
    Call<List<Repo>> listRepos(@Path("VidelRosendyDirgantara")String user);
}
