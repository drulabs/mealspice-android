package com.talenitca.mealspice.data;

import android.support.annotation.NonNull;

import com.talenitca.mealspice.data.models.Restaurant;
import com.talenitca.mealspice.utils.TestUtils;

import java.util.List;

public class DataManagerProvider {

    public static DataManager provide() {
        return provideMocked();
    }

    private static DataManager provideAppDataManager() {
        return new AppDataManager();
    }

    private static DataManager provideMocked() {
        return new DataManager() {
            @Override
            public void fetchRestaurantDetails(@NonNull String slug, @NonNull Callback<Restaurant> callback) {
                callback.onResponse(TestUtils.getMockedRestaurant());
            }

            @Override
            public void fetchAllRestaurants(int page, @NonNull Callback<List<Restaurant>> callback) {
                callback.onResponse(TestUtils.getMockedRestaurantList());
            }
        };
    }

}
