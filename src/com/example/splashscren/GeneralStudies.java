package com.example.splashscren;

import android.os.Bundle;
import android.app.Activity;
import android.support.v4.view.ViewPager;
import android.view.Menu;

public class GeneralStudies extends Activity {
	ViewPager viewpager;
	CustomSwipeAdapter2 adapter;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_general_studies);
		viewpager=(ViewPager)findViewById(R.id.view_pager);
		adapter=new CustomSwipeAdapter2(this);
		viewpager.setAdapter(adapter);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.general_studies, menu);
		return true;
	}

}
