
package me.maghraby.finalpopularmovies.models;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class TrailersData {

    @SerializedName("results") private List<Trailer> trailers = null;

    public List<Trailer> getTrailers() {
        return trailers;
    }

}
