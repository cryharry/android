package com.example.hellotest2;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.TextView;

public class HelloActivity extends Activity implements OnClickListener,OnCheckedChangeListener{
	CheckBox chkA;
	CheckBox chkB;
	CheckBox chkC;
	TextView txtResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Log.i("MyTag", "안녕하세요");
        
        Button btn=(Button)findViewById(R.id.button1);
        btn.setText("안녕");
        //첫번째 유형 이벤트
        btn.setOnClickListener(this);
        //두번째 내부무명클래스 축약형 이벤트
        Button btnOK=(Button)findViewById(R.id.btnOK);
        btnOK.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Log.i("MyTag", "내부이벤트");
			}
		});
        //체크박스 이벤트
        chkA=(CheckBox)findViewById(R.id.chkA);
        chkB=(CheckBox)findViewById(R.id.chkB);
        chkC=(CheckBox)findViewById(R.id.chkC);
        txtResult=(TextView)findViewById(R.id.txtResult);
        
        chkA.setOnCheckedChangeListener(this);
        chkB.setOnCheckedChangeListener(this);
        chkC.setOnCheckedChangeListener(this);
        
    }

	@Override
	public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
		String str="체크된값은";
		if(chkA.isChecked()){
			str += chkA.getText().toString();
		}
		if(chkB.isChecked()){
			str += chkB.getText().toString();
		}
		if(chkC.isChecked()){
			str += chkC.getText().toString();
		}
		txtResult.setText(str);
	}

	@Override
	public void onClick(View v) {
		Log.i("MyTag", "버튼클릭");
		
	}

	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		
		Log.i("MyTag", "onStart");
	}

	@Override
	protected void onRestart() {
		// TODO Auto-generated method stub
		super.onRestart();
		Log.i("MyTag", "onRestart");
	}

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		Log.i("MyTag", "onResume");
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		Log.i("MyTag", "onPause");
	}

	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		Log.i("MyTag", "onStop");
	}

	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		Log.i("MyTag", "onDestroy");
	}
    
}
