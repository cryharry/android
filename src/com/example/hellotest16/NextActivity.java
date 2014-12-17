package com.example.hellotest16;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class NextActivity extends Activity {
	TextView txtResult;
	Button btnBack;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// 화면연결 main.xml
		setContentView(R.layout.next);
		// 객체 생성
		txtResult = (TextView)findViewById(R.id.txtResult);
		// 그 전 페이지 정보 가져오기(Intent)
		Intent intent = getIntent();
		String name = intent.getStringExtra("name");
		int age = intent.getIntExtra("age", 10);
		String address = intent.getStringExtra("address");
		// 텍스트에 화면출력
		String mesg = "이름:"+name+",나이:"+age+",주소:"+address;
		txtResult.setText(mesg);
		// 버튼객체 생성
		btnBack = (Button)findViewById(R.id.btnBack);
		// 이벤트 finish();
		btnBack.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				finish();
			}
		});
	}
}
