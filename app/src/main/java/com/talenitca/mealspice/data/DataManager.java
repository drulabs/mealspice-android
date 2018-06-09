package com.talenitca.mealspice.data;

import android.support.annotation.NonNull;

import com.talenitca.mealspice.data.models.Restaurant;

import java.util.List;

public interface DataManager {

    void fetchRestaurantDetails(@NonNull String slug, @NonNull Callback<Restaurant> callback);

    void fetchAllRestaurants(int page, @NonNull Callback<List<Restaurant>> callback);

    interface Callback<T> {
        void onResponse(T result);

        void onError(Throwable throwable);
    }

}
