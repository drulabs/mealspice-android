package com.talenitca.mealspice.screens;

public interface BaseView<T> {

    void showLoading();

    void hideLoading();

    void setPresenter(T presenter);
}
