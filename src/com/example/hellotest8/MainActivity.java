package com.example.hellotest8;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {
	ListView listView;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		String []data = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K" };
		listView = (ListView)findViewById(R.id.listView1);
		ArrayAdapter adapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1, data);
		listView.setAdapter(adapter);
	}
}
