package com.example.splashscren;

/*import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


public class Cart extends Activity {

    private Button btnNotifCount;
    private TextView textView,text1;
    private int mNotifCount = 0;
    private ArrayList<String> intentList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);
        textView = (TextView) findViewById(R.id.notifi_text);
        text1 = (TextView) findViewById(R.id.tx1);
        getDataFromIntent();
    }

    private void getDataFromIntent() {
        intentList = getIntent().getStringArrayListExtra("notification");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.mm, menu);

        View count = menu.findItem(R.id.badge).getActionView();
        btnNotifCount = (Button) count.findViewById(R.id.notif_count);
       text1 = (TextView) count.findViewById(R.id.tx1);
        text1.setText(String.valueOf(intentList.size()));
if(intentList.size()==0)

{
	text1.setText("");
	text1.setBackground(null);
}
        //show list of notifications when menu button clicked
        btnNotifCount.setOnClickListener(onClickListener());

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
                PopupMenu popup = new PopupMenu(Cart.this, btnNotifCount);
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
                   
                    textView.setText("You selected " + item.getTitle() + " at NotificationBar");
                    if(item.getTitle().length()==15)
                    {
                    	Intent intent = new Intent(Cart.this, MicroController.class);
                    	startActivity(intent);
                    }
                    else if(item.getTitle().length()==14)
                    {
                    	Intent intent = new Intent(Cart.this, GeneralStudies.class);
                    	startActivity(intent);
                    }
                    else if(item.getTitle().length()==17)
                    {
                    	Intent intent = new Intent(Cart.this, OperationResearch.class);
                    	startActivity(intent);
                    }
                    else if(item.getTitle().length()==11)
                    {
                    	Intent intent = new Intent(Cart.this, Electronics.class);
                    	startActivity(intent);
                    }
                    intentList.remove(item.getTitle()); //remove notification after clicked (read)
                    setBtnNotifCount(intentList.size()); //update notifications count
                    popup.dismiss();

                    return true;
                }
            });
        }
    }
}*/
