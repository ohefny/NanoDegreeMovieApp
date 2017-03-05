package com.example.bethechange.nanomovieproject.Retrofit;

import android.content.res.Resources;

import com.example.bethechange.nanomovieproject.Models.MoviesList;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by BeTheChange on 3/2/2017.
 */

public interface TMDBAPI {
    @GET("/3/discover/movie")
    Call<MoviesList> getMovies(
            @Query("page") int page,
            @Query("api_key")String key,
            @Query("sort_by")String sortCriterie);


}
