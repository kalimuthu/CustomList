package com.css.labs.customlist;

import java.util.ArrayList;
import java.util.List;

import android.app.ListActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;

public class MainActivity extends ListActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
                   
//        BaseApplication application=(BaseApplication)getApplication();
//        application.setListPojo(getData());
//        Log.d("MainActivity", "Size:::"+application.getListPojo().size());
        
        ArrayAdapter<Pojo> adapter = new MyCustomArrayAdapter(
				MainActivity.this, getData());
		setListAdapter(adapter);
        
        
    }
    
    public List<Pojo> getData(){
    	  List<Pojo> addList =new ArrayList<Pojo>();
          Pojo objectPojo=new Pojo();
          objectPojo.setName("Muthu");
          objectPojo.setNo("1234");
          objectPojo.setDesc("android ");
          objectPojo.setPost("Developer");
          objectPojo.setIsSelected(false);
          addList.add(objectPojo);
          
          objectPojo=new Pojo();
          objectPojo.setName("Kali");
          objectPojo.setNo("3456");
          objectPojo.setDesc("iPhone ");
          objectPojo.setPost("Developer");
          objectPojo.setIsSelected(false);
          addList.add(objectPojo);

          objectPojo=new Pojo();
          objectPojo.setName("Arasu");
          objectPojo.setNo("5678");
          objectPojo.setDesc("windows ");
          objectPojo.setPost("Developer");
          objectPojo.setIsSelected(false);
          addList.add(objectPojo);
          
          objectPojo=new Pojo();
          objectPojo.setName("Anbu");
          objectPojo.setNo("8901");
          objectPojo.setDesc("mac ");
          objectPojo.setPost("Developer");
          objectPojo.setIsSelected(false);
          addList.add(objectPojo);
          return addList;
    }

}
