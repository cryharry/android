package com.example.hellotest3;

import android.app.Activity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends Activity {
	ToggleButton toggle;
	TextView txtResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        ImageView img=(ImageView)findViewById(R.id.imageView2);
        img.setImageResource(R.drawable.korea);
        
        
        //객체 생성
        toggle=(ToggleButton)findViewById(R.id.toggleButton1);
        txtResult=(TextView)findViewById(R.id.textView1);
        
        //이벤트 연결(무명클래스)
        toggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
				if(isChecked){
					txtResult.setText("켜짐상태");
				}else{
					txtResult.setText("꺼짐상태");
				}
			}
		});
        
    }
}
