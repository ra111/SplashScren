package com.example.splashscren;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class CustomSwipeAdapter5 extends PagerAdapter{
private int[] image_resources={R.drawable.gate,R.drawable.gate1};
private Context ctx;
private LayoutInflater layoutInflater;

public CustomSwipeAdapter5 (Context ctx)
{
	
	this.ctx=ctx;
}
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return image_resources.length;
	}

	@Override
	public boolean isViewFromObject(View arg0, Object arg1) {
		// TODO Auto-generated method stub
		return (arg0==(LinearLayout)arg1);
	}
@Override
public Object instantiateItem(ViewGroup container, int position) {
	// TODO Auto-generated method stub
	layoutInflater=(LayoutInflater)ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	View item_view=layoutInflater.inflate(R.layout.swipe_layout,container,false);
	ImageView imageview=(ImageView)item_view.findViewById(R.id.imageView1);
	imageview.setImageResource(image_resources[position]);
	container.addView(item_view);
	return item_view;
}
@Override
public void destroyItem(ViewGroup container, int position, Object object) {
	// TODO Auto-generated method stub
	container.removeView((LinearLayout)object);
	
	//super.destroyItem(container, position, object);
}
}


