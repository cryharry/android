package com.example.hellotest10;

public class MyCustomDTO {
	String name;
	int imgPhoto;
	
	public MyCustomDTO(String name, int imgPhoto) {
		this.name = name;
		this.imgPhoto = imgPhoto;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getImgPhoto() {
		return imgPhoto;
	}

	public void setImgPhoto(int imgPhoto) {
		this.imgPhoto = imgPhoto;
	}
}
