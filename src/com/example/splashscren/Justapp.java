package com.example.splashscren;

import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;

public class Justapp extends Activity {
//GifView gifview;
	private boolean backbtnpress;
	private static final int SPLASH_DURATION=5000;
	private Handler myhandler;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash);
	//	gifview=(GifView)findViewById(R.id.imageView3);
		myhandler= new Handler();
		myhandler.postDelayed(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				finish();
				if(!backbtnpress)
				{
					Intent obj=new Intent(Justapp.this,MainActivity.class);
					startActivity(obj);
				}
				
			}
		},SPLASH_DURATION);
		
	}
	
	 @Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
		 backbtnpress=true;
		super.onBackPressed();
	} 

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.justapp, menu);
		return true;
	}

}
