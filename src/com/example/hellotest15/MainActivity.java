package com.example.hellotest15;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
	Button btnPhone;
	Button btnBrowser;
	Button btnSms;
	Button btnEmail;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		// 전화
		btnPhone = (Button)findViewById(R.id.btnPhone);
		btnPhone.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:123-1234"));
				startActivity(intent);
			}
		});
		// 브라우저
		btnBrowser = (Button)findViewById(R.id.btnBrowser);
		btnBrowser.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.naver.com"));
				startActivity(intent);
			}
		});
		// SMS
		btnSms = (Button)findViewById(R.id.btnSms);
		btnSms.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("smsto:051-803-0909"));
				startActivity(intent);
			}
		});
		// Email
		btnEmail = (Button)findViewById(R.id.btnEmail);
		btnEmail.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("mailto:hong@daum.net"));
				startActivity(intent);
			}
		});
	}
}
