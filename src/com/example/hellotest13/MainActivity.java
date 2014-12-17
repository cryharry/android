package com.example.hellotest13;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends Activity {
	RatingBar rating01;
	RatingBar rating02;
	RatingBar rating03;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		rating01 = (RatingBar)findViewById(R.id.ratingBar1);
		rating02 = (RatingBar)findViewById(R.id.ratingBar2);
		rating03 = (RatingBar)findViewById(R.id.ratingBar3);
		
		rating01.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
			@Override
			public void onRatingChanged(RatingBar ratingBar, float rating,
					boolean fromUser) {
				Toast.makeText(getApplicationContext(), "설정값:"+rating, Toast.LENGTH_LONG).show();
				rating02.setRating(rating);
				rating03.setRating(rating);
			}
		});
	}
}
