package me.maghraby.finalpopularmovies.services;

import io.reactivex.Observable;
import me.maghraby.finalpopularmovies.models.Movie;
import me.maghraby.finalpopularmovies.models.MoviesData;
import me.maghraby.finalpopularmovies.models.ReviewsData;
import me.maghraby.finalpopularmovies.models.TrailersData;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface TMDbService {
    String API_KEY = "4a986da3f76fda82bb042ba3bff0b6ac"; //Set your API key here

    @GET("popular?api_key=" + API_KEY)
    Observable<MoviesData> getPopularMovieData();

    @GET("top_rated?api_key=" + API_KEY)
    Observable<MoviesData> getTopRatedMovieData();

    @GET("{id}?api_key=" + API_KEY)
    Observable<Movie> getMovieData(@Path("id") int id);

    @GET("{id}/videos?api_key=" + API_KEY)
    Observable<TrailersData> getTrailersData(@Path("id") int id);

    @GET("{id}/reviews?api_key=" + API_KEY)
    Observable<ReviewsData> getReviewsData(@Path("id") int id);
}
