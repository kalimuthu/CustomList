package com.css.labs.customlist;

import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.text.TextUtils.TruncateAt;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * 
 * @author CSS94568 Kalimuthu Rengaswamy
 * 
 */

public class MyCustomArrayAdapter extends ArrayAdapter<Pojo> {

	private final List<Pojo> list;
	private final Activity context;
	ViewHolder viewHolder=null ;
	public MyCustomArrayAdapter(Activity context, List<Pojo> list) {
		super(context, R.layout.customlist, list);
		this.context = context;
		this.list = list;
	}

	static class ViewHolder {
		protected TextView name,no;
		protected ImageView image;
		protected CheckBox checkbox;
	}

	@Override
	public View getView(final int position, View convertView, ViewGroup parent) {
		View view = null;
		if (convertView == null) {
			LayoutInflater inflator = context.getLayoutInflater();
			view = inflator.inflate(R.layout.customlist, null);
			viewHolder = new ViewHolder();
			viewHolder.name = (TextView) view.findViewById(R.id.name);
			viewHolder.name.setTextColor(Color.BLACK);
			viewHolder.name.setEllipsize(TruncateAt.MIDDLE);
			viewHolder.no = (TextView) view.findViewById(R.id.no);
			viewHolder.no.setTextColor(Color.BLACK);
			viewHolder.image = (ImageView) view.findViewById(R.id.Listimage);
			viewHolder.name.setText(list.get(position).getName());
			viewHolder.no.setText(list.get(position).getNo());
			viewHolder.checkbox =(CheckBox) view.findViewById(R.id.check);
			viewHolder.checkbox
			.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
				public void onCheckedChanged(CompoundButton buttonView,
						boolean isChecked) {
					Pojo element = (Pojo) viewHolder.checkbox
							.getTag();
					element.setIsSelected(buttonView.isChecked());

				}
			});
			viewHolder.image.setBackgroundResource(R.drawable.ic_launcher);
			view.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					Intent intent=new Intent();
					intent.setClass(context,InfoActivity.class);
					intent.putExtra("id", position);
					context.startActivity(intent);
				}
			});
			viewHolder.checkbox.setTag(list.get(position));
	} else {
		view = convertView;
		((ViewHolder) view.getTag()).checkbox.setTag(list.get(position));
	}
		return view;

		}


	
		

}
