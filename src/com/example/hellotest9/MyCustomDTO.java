package com.example.hellotest9;

public class MyCustomDTO {
	String title;
	String content;
	int imgIcon;
	// 생성자
	public MyCustomDTO(String title, String content, int imgIcon) {
		this.title = title;
		this.content = content;
		this.imgIcon = imgIcon;
	}
	// getter setter
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getImgIcon() {
		return imgIcon;
	}
	public void setImgIcon(int imgIcon) {
		this.imgIcon = imgIcon;
	}
}
