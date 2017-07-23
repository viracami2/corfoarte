package com.corfoarte.victorcastro.corpoarte.io;

/**
 * Created by Victor Castro on 15/07/2017.
 */

import com.corfoarte.victorcastro.corpoarte.io.CrearGrupos.Grupos;
import com.corfoarte.victorcastro.corpoarte.io.Response.GruposResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface ServiceApi {

    @GET("bagpipes/{id}")
    Call<GruposResponse> getGrupos(@Path("id") String id);

    @POST("bagpipes/")
    Call<Grupos> postGrupo(@Body Grupos grupo);


    //@GET("users/{user}/repos")
    //Call<List<Repo>> listRepos(@Path("user") String user);

    // @GET("bagpipes/")
    //Call<>getGrupos();

}
