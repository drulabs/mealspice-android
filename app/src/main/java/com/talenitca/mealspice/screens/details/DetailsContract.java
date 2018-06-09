package com.talenitca.mealspice.screens.details;

import com.talenitca.mealspice.screens.BasePresenter;
import com.talenitca.mealspice.screens.BaseView;

public interface DetailsContract {

    interface View extends BaseView<Presenter> {
        void loadRestaurantPic(String url);

        void loadRestaurantName(String name);

        void loadRatings(String rating);

        void loadTagline(String tagline);

        void loadAddress(String address);

        void loadCuisine(String cuisine);

        void onError(Throwable throwable);
    }

    interface Presenter extends BasePresenter {
        void start(String restaurantSlug);

        void onEditTapped();

        void onSaveTapped();
    }

}
