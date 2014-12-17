package com.example.hellotest14;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
	Button btnStart;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		// 버튼 객체 생성
		btnStart = (Button)findViewById(R.id.btnStart);
		// 이벤트
		btnStart.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// 명시적 인텐트 생성
				Intent intent = new Intent(getApplicationContext(), NextActivity.class);
				// 액티비티실행
				startActivity(intent);
			}
		});
	}
}
