package com.example.splashscren;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;






import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity {

	ViewPager viewpager;
	//CustomSwipeAdapter4 adapter;

	    private Button btnNotifCount;
	    private TextView textView,text1;
	    private int mNotifCount = 0;
	    private CheckBox chkIOS;
	    private  CheckBox chkAndroid;
	    private CheckBox chkWP;
	    private CheckBox chkOther;
	    private View btnGo;
	    public ArrayList<String> intentList;
	    public ArrayList<String> intentList1;
		int a=0,b=0,c=0,d=0,q=0,w=0;
		int r=0,t;
		String s;
		String web[]={"OperationResearch","MicroController","GeneralStudies","Electronics","ComputerScience","Reasoning","GateMaths"};
		ListView lv1;
		Integer[] imageId = {
		        R.drawable.operation,
		        R.drawable.mi,
		        R.drawable.general1,
		        R.drawable.electronics,
		        R.drawable.comp,
		        R.drawable.reason,
		        R.drawable.gate

		};
		
		
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		//  viewpager=(ViewPager)findViewById(R.id.view_pager);
		  //adapter=new CustomSwipeAdapter4(this);
		  //viewpager.setAdapter(adapter);
		  
		  CustomList adapter = new
	                CustomList(MainActivity.this, web, imageId);
	                lv1=(ListView)findViewById(R.id.lv);
	                lv1.setAdapter(adapter);
		  
		  
		  intentList = new ArrayList<String>();
		  intentList1 = new ArrayList<String>();
	     // chkAndroid = (CheckBox)findViewById(R.id.chk_android);
	     // chkIOS = (CheckBox)findViewById(R.id.chk_ios);
	     // chkWP = (CheckBox)findViewById(R.id.chk_wp);
	     // chkOther = (CheckBox)findViewById(R.id.chk_other);
	 //     btnGo = (View)findViewById(R.id.btn_go);
	    
	 //     btnGo.setOnClickListener(onClickListener1());
		 
	      lv1.setOnItemClickListener(new OnItemClickListener() {

				@Override
				public void onItemClick(AdapterView<?> arg0, View arg1,
						int ee, long arg3) {
					// TODO Auto-generated method stub
	      if(ee==0)
			{
				
				if(a==0)
				{
					 s="OperationResearch";
		                
             	     intentList.add(s);
             	    Toast.makeText(getApplicationContext(),"Cart Is On Top-Right" ,1000).show();
             	    Toast.makeText(getApplicationContext(),"You Can Check Your Item " +s + " in Cart" ,2000).show();
                        
                    a=1;
                    
				}
				else if(a==1)
				{
					 Toast.makeText(getApplicationContext(),"You Have Already Added this Item \n To Add This Item Remove This From Cart" ,5000).show();
				}
			
			}
			else if(ee==1)
			{
				
				if(b==0)
				{
					 s="MicroController";
		                
             	     intentList.add(s);
             	    Toast.makeText(getApplicationContext(),"Cart Is On Top-Right" ,1000).show();
             	    Toast.makeText(getApplicationContext(),"You Can Check Your Item " +s + " in Cart" ,2000).show();
                        
                    b=1;
                    
				}
				else if(b==1)
				{
					 Toast.makeText(getApplicationContext(),"You Have Already Added this Item \n To Add This Item Remove This From Cart" ,10000).show();
				}	
			}
			else if(ee==2)
			{
				if(c==0)
				{
					 s="GeneralStudies";
		                
             	     intentList.add(s);
             	    Toast.makeText(getApplicationContext(),"Cart Is On Top-Right" ,1000).show();
             	    Toast.makeText(getApplicationContext(),"You Can Check Your Item " +s + " in Cart" ,2000).show();
                    c=1;
                    
				}
				else if(c==1)
				{
					 Toast.makeText(getApplicationContext(),"You Have Already Added this Item \n To Add This Item Remove This From Cart" ,10000).show();
				}
				
			}
			else if(ee==3)
			{
				if(d==0)
				{
					 s="Electronics";
		                
             	     intentList.add(s);
             	    Toast.makeText(getApplicationContext(),"Cart Is On Top-Right" ,1000).show();
             	    Toast.makeText(getApplicationContext(),"You Can Check Your Item " +s + " in Cart" ,2000).show();
                        
                    d=1;
                    
				}
				else if(d==1)
				{
					 Toast.makeText(getApplicationContext(),"You Have Already Added this Item \n To Add This Item Remove This From Cart" ,10000).show();
				}
				
			}
			else if(ee==4)
			{
				if(q==0)
				{
					 s="ComputerScienceEngg";
		                
             	     intentList.add(s);
             	    Toast.makeText(getApplicationContext(),"Cart Is On Top-Right" ,1000).show();
             	    Toast.makeText(getApplicationContext(),"You Can Check Your Item " +s + " in Cart" ,2000).show();
                        
                    q=1;
                    
				}
				else if(q==1)
				{
					 Toast.makeText(getApplicationContext(),"You Have Already Added this Item \n To Add This Item Remove This From Cart" ,10000).show();
				}
				
			}
			else if(ee==5)
			{
				if(w==0)
				{
					 s="Reasoning";
		                
             	     intentList.add(s);
             	    Toast.makeText(getApplicationContext(),"Cart Is On Top-Right" ,1000).show();
             	    Toast.makeText(getApplicationContext(),"You Can Check Your Item " +s + " in Cart" ,2000).show();
                    w=1;
                    
				}
				else if(w==1)
				{
					 Toast.makeText(getApplicationContext(),"You Have Already Added this Item \n To Add This Item Remove This From Cart" ,10000).show();
				}
				
			}
			else if(ee==6)
			{
				if(r==0)
				{
					 s="Maths";
		                
             	     intentList.add(s);
             	    Toast.makeText(getApplicationContext(),"Cart Is On Top-Right" ,1000).show();
             	    Toast.makeText(getApplicationContext(),"You Can Check Your Item " +s + " in Cart" ,2000).show();
                        
                    r=1;
                    
				}
				else if(r==1)
				{
					 Toast.makeText(getApplicationContext(),"You Have Already Added this Item \n To Add This Item Remove This From Cart", 10000).show();
				}
				
			}
			
		}
		
			});
	
		
		
	
}

  /*  private View.OnClickListener onClickListener1() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            
            	 Toast.makeText(getApplicationContext(),"Cart Is On Top-Right" ,5).show();
            	 if (chkAndroid.isChecked()==true && a==0) {
           		  s="OperationResearch";
               
              	     intentList.add(s);
                       
                         
                     a=1;
                     
                //     r=w;
                 	
                    Toast.makeText(getApplicationContext(),"You Can Check Your Item " +s + " in Cart" ,200).show();
              	 }
                 
              
                 else if(a==0)
                 {
              	//   Toast.makeText(getApplicationContext(),"Not Allowed" ,30).show();
                 }
                 else if(a==1 && chkAndroid.isChecked()==true)
                 {
               	  Toast.makeText(getApplicationContext(),"You Have Already Selected OperationResearch..Check Your Cart" ,200).show();
                 }
                 
           	  
           	  if (chkIOS.isChecked()==true && b==0) {
                 	  
                 	s= "MicroController";
                 	   
                 	   
                       
                 	     intentList.add(s);
                          
                            
                        b=1;
                        
                   //     r=w;
                    
                        Toast.makeText(getApplicationContext(),"You Can Check Your Item " + s +" in Cart" ,200).show();
                 	 }
                    
                 

                 else if(b==0)
                 {
              	//   Toast.makeText(getApplicationContext(),"Not Allowed" ,30).show();
                 }
                 else if(b==1 && chkIOS.isChecked()==true )
                 {
                	  Toast.makeText(getApplicationContext(),"You Have Already Selected MicroController..Check Your Cart" ,200).show();
                 }
           	  
           	  if (chkWP .isChecked()==true && c==0) {
                	  
                	s= "GeneralStudies";
                	   
                	   
                	     intentList.add(s);
                         
                           
                       c=1;
                       
                  //     r=w;
                   
                       Toast.makeText(getApplicationContext(),"You Can Check Your Item " + s  +" in Cart" ,200).show();
                	 }
                   
                

                 else if(c==0)
                 {
              	//   Toast.makeText(getApplicationContext(),"Not Allowed" ,30).show();
                 }
                 else if(c==1 && chkWP .isChecked()==true )
                 {
                	  Toast.makeText(getApplicationContext(),"You Have Already Selected GeneralStudies..Check Your Cart" ,200).show();
                 }
           	  
           	  
           	  if (chkOther .isChecked()==true && d==0) {
               	 
               	s= "Electronics";
               	   
               	    intentList.add(s);
                        
                          
                      d=1;
                      
                 //     r=w;
                  	 
                      Toast.makeText(getApplicationContext(),"You Can Check Your Item " + s  +" in Cart" ,200).show();
               	 }
                  
               

                 else if(d==0)
                 {
              	//   Toast.makeText(getApplicationContext(),"Not Allowed" ,30).show();
                 }
                 else if(d==1 && chkOther.isChecked()==true)
                 {
                	 Toast.makeText(getApplicationContext(),"You Have Already Selected Electronics..Check Your Cart" ,200).show();
                 
                
                 }
                
           	  if(chkIOS.isChecked()==false && chkAndroid.isChecked()==false && chkWP.isChecked()==false && chkOther.isChecked()==false   )
                {
                    Toast.makeText(getApplicationContext(),"You Have Not Selected Any Item" ,200).show();
                }
                
                
                
                //go to activity and put string array
               // Intent intent = new Intent(MainActivity.this, Cart.class);
                //intent.putStringArrayListExtra("notification", intentStrings);
                //startActivity(intent);
                //intentStrings.clear();
                for (int i = 0; i < intentList.size(); i++) {
              
                
                	
	                intentList1.add(intentList.get(i));
	           
                }
                
                Set setItems = new LinkedHashSet(intentList1);
                intentList1.clear();
                intentList1.addAll(setItems);
                intentList.clear();
               
                
                
                
                
            }
        };
    }*/
    
   /* private void isChecked(CheckBox checkBox, String s) {
        if (checkBox.isChecked()==true) {
        	
            intentList.add(s);
            
            Toast.makeText(getApplicationContext(),"You Can Check Your Item " +s + " in Cart" ,30).show();
        	
        }
        
        }*/
       
    
    
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		 MenuInflater inflater = getMenuInflater();
	        inflater.inflate(R.menu.mm, menu);

	        View count = menu.findItem(R.id.badge).getActionView();
	        btnNotifCount = (Button) count.findViewById(R.id.notif_count);
	    //    setBtnNotifCount(intentList1.size());
	        btnNotifCount.setText(String.valueOf(intentList.size()));
         
	        //show list of notifications when menu button clicked
	     btnNotifCount.setOnClickListener(onClickListener());
	     text1 = (TextView)count.findViewById(R.id.tx1);
	     text1.setText(String.valueOf(intentList.size()));
	     if(intentList.size()==0)
	    	 

	{

		text1.setText("");
		text1.setBackground(null);
	}
	  
	     //   return super.onCreateOptionsMenu(menu);
		
		// Inflate the menu; this adds items to the action bar if it is present.
	    return super.onCreateOptionsMenu(menu);
	        
	}
	private void setBtnNotifCount(int count){
        mNotifCount = count;
        invalidateOptionsMenu();
    }
	 private View.OnClickListener onClickListener() {
	        return new View.OnClickListener() {
	            @Override
	            public void onClick(View v) {
	                //Creating the instance of PopupMenu
	            	
	            	 Toast.makeText(getApplicationContext(),"For Removing Item Just Click On Any Item In Cart If Item Is Available", 5000).show();
	                PopupMenu popup = new PopupMenu(MainActivity.this, btnNotifCount);
	                //Inflating the Popup using xml file
	                popup.getMenuInflater()
	                        .inflate(R.menu.main, popup.getMenu());

	                createPopupMenuItems(popup);
	                popup.show();
	            }
	        };
	    }

	    private void createPopupMenuItems(final PopupMenu popup) {
	        if (intentList.size() > 0) {
	            for (int i = 0; i < intentList.size(); i++) {
	                popup.getMenu().add(intentList.get(i));
	            }

	            popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
	                @Override
	                public boolean onMenuItemClick(MenuItem item) {

	               //     textView.setText("You selected " + item.getTitle() + " at NotificationBar");
	                   
	                	   if(item.getTitle().length()==15)
	                       {
	                       	Intent intent = new Intent(MainActivity.this, MicroController.class);
	                       	startActivity(intent);
	                    	b=0;
	                       }
	                       else if(item.getTitle().length()==14)
	                       {
	                       	Intent intent = new Intent(MainActivity.this, GeneralStudies.class);
	                       	startActivity(intent);
	                    	c=0;
	                       }
	                       else if(item.getTitle().length()==17)
	                       {
	                       	Intent intent = new Intent(MainActivity.this, OperationResearch.class);
	                       	startActivity(intent);
	                       	a=0;
	                       }
	                       else if(item.getTitle().length()==11)
	                       {
	                       	Intent intent = new Intent(MainActivity.this, Electronics.class);
	                       	startActivity(intent);
	                       	d=0;
	                       }
	                       else if(item.getTitle().length()==19)
	                       {
	                       	Intent intent = new Intent(MainActivity.this, ComputerScience.class);
	                       	startActivity(intent);
	                       	q=0;
	                       }
	                       else if(item.getTitle().length()==9)
	                       {
	                       	Intent intent = new Intent(MainActivity.this, Reasoning.class);
	                       	startActivity(intent);
	                       	w=0;
	                       }
	                       else if(item.getTitle().length()==5)
	                       {
	                       	Intent intent = new Intent(MainActivity.this, Maths.class);
	                       	startActivity(intent);
	                       	r=0;
	                       }
	                	intentList.remove(item.getTitle()); //remove notification after clicked (read)
	                    setBtnNotifCount(intentList.size()); //update notifications count
	                    popup.dismiss();
                        return true;
	                }
	            });
	        }
	    }
	
}
