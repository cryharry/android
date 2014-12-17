package com.example.hellotest16;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
	EditText editName;
	EditText editAge;
	EditText editAddress;
	Button btnSend;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		// 텍스트에디더 객체 생성
		editName = (EditText)findViewById(R.id.editName);
		editAge = (EditText)findViewById(R.id.editAge);
		editAddress = (EditText)findViewById(R.id.editAddress);
		// 버튼 객체 생성
		btnSend = (Button)findViewById(R.id.btnSend);
		// 이벤트
		btnSend.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// 텍스트에디터 글자 가져오기 name age address
				String name = editName.getText().toString();
				String age = editAge.getText().toString();
				String address = editAddress.getText().toString();
				// 인텐트 객체 생성
				Intent intent = new Intent(getApplicationContext(), NextActivity.class);
				// 글자 가져온 것을 인텐트 저장
				intent.putExtra("name", name);
				intent.putExtra("age", Integer.parseInt(age));
				intent.putExtra("address", address);
				// 액티비티 실행
				startActivity(intent);
			}
		});
	}
}
