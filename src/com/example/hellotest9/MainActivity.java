package com.example.hellotest9;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends Activity {
	ListView listView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		// 데이터 준비
		ArrayList<MyCustomDTO> list = new ArrayList<MyCustomDTO>();
		list.add(new MyCustomDTO("캐나다", "캐나다설명", R.drawable.canada));
		list.add(new MyCustomDTO("프랑스", "프랑스설명", R.drawable.france));
		list.add(new MyCustomDTO("대한민국", "대한민국설명", R.drawable.korea));
		list.add(new MyCustomDTO("멕시코", "멕시코설명", R.drawable.mexico));
		list.add(new MyCustomDTO("폴란드", "폴란드설명", R.drawable.poland));
		list.add(new MyCustomDTO("사우디아라비아", "사우디아라비아설명", R.drawable.saudi_arabia));
		
		// ListView 객체 생성
		listView = (ListView)findViewById(R.id.listView1);
		
		// 내가 만든 디자인 적용 커스터마이징
		MyCustomAdapter adapter = new MyCustomAdapter(getApplicationContext(), R.layout.list_row, list);
		listView.setAdapter(adapter);
	}
}
