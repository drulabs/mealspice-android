package com.talenitca.mealspice.screens.details;

import com.talenitca.mealspice.data.DataManager;
import com.talenitca.mealspice.data.DataManagerProvider;
import com.talenitca.mealspice.data.models.Restaurant;

public class DetailsPresenter implements DetailsContract.Presenter {

    private DetailsContract.View view;
    private DataManager dataManager;

    DetailsPresenter(DetailsContract.View view) {
        this.view = view;
        this.dataManager = DataManagerProvider.provide();
    }

    @Override
    public void start(final String restaurantSlug) {
        view.showLoading();
        dataManager.fetchRestaurantDetails(restaurantSlug, new DataManager.Callback<Restaurant>() {
            @Override
            public void onResponse(Restaurant result) {
                view.hideLoading();
                view.loadRestaurantPic(result.getPic());
                view.loadAddress(result.getAddress() + " " + result.getCountry());
                view.loadCuisine(result.getCuisine());
                view.loadRatings(String.valueOf(result.getRating()));
                view.loadRestaurantName(result.getName());
                view.loadTagline(result.getTagline());
            }

            @Override
            public void onError(Throwable throwable) {
                view.hideLoading();
                view.onError(throwable);
            }
        });
    }

    @Override
    public void onEditTapped() {

    }

    @Override
    public void onSaveTapped() {

    }

    @Override
    public void destroy() {

    }
}
