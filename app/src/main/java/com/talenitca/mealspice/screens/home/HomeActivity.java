package com.talenitca.mealspice.screens.home;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.talenitca.mealspice.R;
import com.talenitca.mealspice.screens.details.DetailsActivity;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void navigateToDetails(View view) {
        Intent detailsIntent = new Intent(this, DetailsActivity.class);
        detailsIntent.putExtra(DetailsActivity.KEY_RESTAURANT_SLUG, "a-b-c");
        startActivity(detailsIntent);
    }
}
