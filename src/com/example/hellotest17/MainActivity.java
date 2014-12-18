package com.example.hellotest17;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener {
	EditText editValue1;
	EditText editValue2;
	Button btnAdd;
	Button btnSub;
	Button btnMul;
	Button btnDiv;
	TextView txtResult;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		// 객체 생성
		editValue1 = (EditText)findViewById(R.id.editValue1);
		editValue2 = (EditText)findViewById(R.id.editValue2);
		btnAdd = (Button)findViewById(R.id.btnAdd);
		btnSub = (Button)findViewById(R.id.btnSub);
		btnMul = (Button)findViewById(R.id.btnMul);
		btnDiv = (Button)findViewById(R.id.btnDiv);
		txtResult = (TextView)findViewById(R.id.txtResult);
		// 버튼 이벤트
		btnAdd.setOnClickListener(this);
		btnSub.setOnClickListener(this);
		btnMul.setOnClickListener(this);
		btnDiv.setOnClickListener(this);
		
	}
	@Override
	public void onClick(View v) {
		// int value1 editValue1, int value2 editValue2 값 가져오기
		int value1 = Integer.parseInt(editValue1.getText().toString());
		int value2 = Integer.parseInt(editValue2.getText().toString());
		// 클릭한 버튼의 제목 얻어오기 + - / *
		char op =((Button)v).getText().charAt(0);
		// 인텐트 객체 생성
		Intent intent = new Intent(getApplicationContext(), CalActivity.class);
		// 값 저장
		intent.putExtra("value1", value1);
		intent.putExtra("value2", value2);
		intent.putExtra("op", op);
		// 이동 시작
		startActivityForResult(intent, 1);
	}
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		super.onActivityResult(requestCode, resultCode, data);
		switch (resultCode) {
		case Activity.RESULT_OK:
			txtResult.setText("결과값은:"+Integer.toString(data.getIntExtra("result", 0)));
			break;
		}
	}
}
