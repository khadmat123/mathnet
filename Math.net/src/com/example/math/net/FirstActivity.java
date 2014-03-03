package com.example.math.net;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class FirstActivity extends Activity {
	TextView textView2;
	TextView textView1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_first);
		textView2 = (TextView) findViewById(R.id.textView2);
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		  menu.add("menu1");
	      menu.add("menu2");
	      menu.add("menu3");
	      menu.add("menu4");
	      return super.onCreateOptionsMenu(menu);
	}
	@Override
    public boolean onOptionsItemSelected(MenuItem item) {
      // TODO Auto-generated method stub
      Toast.makeText(this, item.getTitle(), Toast.LENGTH_SHORT).show();
      return super.onOptionsItemSelected(item);
    }
	public void go (View view)
	{
		textView2.setText("Нажали го");
	}

}
