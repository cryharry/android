package com.example.hellotest4;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends Activity implements OnClickListener {
	Button btnKorea;
	Button btnCanada;
	Button btnFrance;
	ImageView imgKorea;
	ImageView imgCanada;
	ImageView imgFrance;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		btnKorea=(Button)findViewById(R.id.btnKorea);
		btnCanada=(Button)findViewById(R.id.btnCanada);
		btnFrance=(Button)findViewById(R.id.btnFrance);
		
		imgKorea=(ImageView)findViewById(R.id.imgKorea);
		imgCanada=(ImageView)findViewById(R.id.imgCanada);
		imgFrance=(ImageView)findViewById(R.id.imgFrance);
		
		//이벤트
		btnKorea.setOnClickListener(this);
		btnCanada.setOnClickListener(this);
		btnFrance.setOnClickListener(this);
	}
	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btnKorea:
			imgKorea.setVisibility(View.VISIBLE);
			imgCanada.setVisibility(View.INVISIBLE);
			imgFrance.setVisibility(View.INVISIBLE);
			break;
		case R.id.btnCanada:
			imgKorea.setVisibility(View.INVISIBLE);
			imgCanada.setVisibility(View.VISIBLE);
			imgFrance.setVisibility(View.INVISIBLE);
			break;
		case R.id.btnFrance:
			imgKorea.setVisibility(View.INVISIBLE);
			imgCanada.setVisibility(View.INVISIBLE);
			imgFrance.setVisibility(View.VISIBLE);
			break;

		}
	}
}



