package com.example.hellotest10;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.GridView;

public class MainActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		// 데이터 저장
		ArrayList<MyCustomDTO> list = new ArrayList<MyCustomDTO>();
		for(int i=0;i<=2;i++) {
			list.add(new MyCustomDTO("canada", R.drawable.canada));
			list.add(new MyCustomDTO("france", R.drawable.france));
			list.add(new MyCustomDTO("korea", R.drawable.korea));
			list.add(new MyCustomDTO("mexico", R.drawable.mexico));
			list.add(new MyCustomDTO("canada", R.drawable.canada));
			list.add(new MyCustomDTO("poland", R.drawable.poland));
		}
		// GridView 객체 생성
		GridView gridView = (GridView)findViewById(R.id.gridView1);
		// Adapter 적용
		MyCustomAdapter adapter = new MyCustomAdapter(getApplicationContext(), R.layout.gridview, list);
		gridView.setAdapter(adapter);
	}
}
