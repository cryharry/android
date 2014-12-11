package com.example.hellotest10;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyCustomAdapter extends BaseAdapter {
	Context ctx;
	int layout;
	ArrayList<MyCustomDTO> list;
	LayoutInflater inf;
	// 생성자
	public MyCustomAdapter(Context ctx, int layout, ArrayList<MyCustomDTO> list) {
		this.ctx = ctx;
		this.layout = layout;
		this.list = list;
		inf = (LayoutInflater)ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	}

	@Override
	public int getCount() {
		return list.size();
	}

	@Override
	public Object getItem(int position) {
		return list.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		if(convertView == null) {
			convertView = inf.inflate(layout, null);
		}
		TextView name = (TextView)convertView.findViewById(R.id.textView1);
		ImageView imgPhoto = (ImageView)convertView.findViewById(R.id.imageView1);
		MyCustomDTO dto = list.get(position);
		name.setText(dto.getName());
		imgPhoto.setImageResource(dto.getImgPhoto());
		return convertView;
	}
	
	
}
