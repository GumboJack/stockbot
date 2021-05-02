package api;

import retrofit2.http.GET;
import retrofit2.http.Headers;

import java.util.concurrent.CompletableFuture;

public interface LunarClient {
    @GET("/v2")
    @Headers("accept: application/json")
    CompletableFuture<Lunar> getLunar();
}
