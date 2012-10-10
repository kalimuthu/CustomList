package com.css.labs.customlist;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class InfoActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.list);
		Bundle extras = getIntent().getExtras();
		int id=(Integer) extras.get("id");
		Log.d("Info", ""+id);
		TextView txtName=(TextView)findViewById(R.id.infoname);
		TextView txtNo=(TextView)findViewById(R.id.infono);
		TextView txtpost=(TextView)findViewById(R.id.post);
		TextView txtdec=(TextView)findViewById(R.id.desc);
		BaseApplication application=(BaseApplication)getApplication();
		txtName.setText("Name :"+application.getListPojo().get(id).getName());
		txtNo.setText("NO   :"+application.getListPojo().get(id).getNo());
		txtpost.setText("Post :"+application.getListPojo().get(id).getPost());
		txtdec.setText("Desc :"+application.getListPojo().get(id).getDesc());
	}

}
