package com.example.hellotest17;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class CalActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// 인텐트 얻어오기
		Intent intent = getIntent();
		// 인텐트 저장되어서 가져온 값  저장
		int value1 = intent.getIntExtra("value1", 0);
		int value2 = intent.getIntExtra("value2", 0);
		char op = intent.getCharExtra("op", '+');
		// 계산하기 switch
		int result = 0;
		switch (op) {
		case '+':
			result = value1 + value2;
			break;
		case '-':
			result = value1 - value2;
			break;
		case '/':
			result = value1 / value2;
			break;
		case '*':
			result = value1 * value2;
			break;
		}
		// 결과값 저장
		intent.putExtra("result", result);
		// 결과값 리턴
		setResult(Activity.RESULT_OK, intent);
		// finsish();
		finish();
	}
	
}
