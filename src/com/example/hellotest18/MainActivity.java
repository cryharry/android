package com.example.hellotest18;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	EditText editInput;
	Button btnSave;
	Button btnShow;
	TextView txtResult;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		// 객체 생성
		editInput = (EditText)findViewById(R.id.editInput);
		btnSave = (Button)findViewById(R.id.btnSave);
		btnShow = (Button)findViewById(R.id.btnShow);
		txtResult = (TextView)findViewById(R.id.txtResult);
		// btnSave 이벤트
		btnSave.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// editInput에 데이터 가져오기
				String input = editInput.getText().toString();
				try {
					// FileOutputStream 객체 생성 internal.txt
					FileOutputStream fos = openFileOutput("internal2.txt", Context.MODE_APPEND);
					// PrintWriter 파일에 글쓰기
					PrintWriter out = new PrintWriter(fos);
					out.println(input);
					out.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				// 가상키보드 제거
				InputMethodManager imm = (InputMethodManager)getSystemService(INPUT_METHOD_SERVICE);
				imm.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
			}
		});
		// btnShow 이벤트
		btnShow.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				try {
					StringBuffer data = new StringBuffer();
					// FileInputStream 가져오기
					FileInputStream fis = openFileInput("internal2.txt");
					// BufferedReader String 형으로 읽어오기
					BufferedReader br = new BufferedReader(new InputStreamReader(fis));
					// StringBuffer append 추가
					String str = br.readLine();
					while(str != null) {
						data.append(str+ "\n");
						str = br.readLine();
					}
					// txtResult 출력
					txtResult.setText(data.toString()+"\n");
					br.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
