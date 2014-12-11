package com.example.hellotest11;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		// 버튼 객체 생성
		Button btnToast = (Button)findViewById(R.id.btnToast);
		// 버튼 이벤트 "출력메시지"
		btnToast.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Toast.makeText(getApplicationContext(), "출력메세지", Toast.LENGTH_SHORT).show();
			}
		});
	}
}
