package com.css.labs.customlist;

import java.util.List;

import android.app.Application;

public class BaseApplication extends Application {

	public List<Pojo> listPojo;

	public List<Pojo> getListPojo() {
		return listPojo;
	}

	public void setListPojo(List<Pojo> listPojo) {
		this.listPojo = listPojo;
	}
}
