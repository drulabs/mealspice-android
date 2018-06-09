package com.talenitca.mealspice.data;

import android.support.annotation.NonNull;

import com.talenitca.mealspice.data.models.Restaurant;
import com.talenitca.mealspice.utils.TestUtils;

import java.util.List;

class AppDataManager implements DataManager {

    @Override
    public void fetchRestaurantDetails(@NonNull String slug,@NonNull Callback<Restaurant>
            callback) {
    }

    @Override
    public void fetchAllRestaurants(int page,@NonNull Callback<List<Restaurant>> callback) {

    }
}
