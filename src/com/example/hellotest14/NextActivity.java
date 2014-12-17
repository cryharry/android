package com.example.hellotest14;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NextActivity extends Activity {
	Button btnBack;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// 화면 연결
		setContentView(R.layout.next);
		// 버튼 객체 생성
		btnBack = (Button)findViewById(R.id.btnBack);
		// 이벤트
		btnBack.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// finish(); 이전 액티비티로 돌아가기
				finish();
			}
		});
	}
}
