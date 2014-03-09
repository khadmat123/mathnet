package com.example.math.net;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FirstActivity extends Activity {
	 public final static String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
	TextView textView1;
	Button buttont;
	EditText EditText1;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_first);
		textView1 = (TextView) findViewById(R.id.textView1);
		buttont =(Button) findViewById(R.id.button1);
		EditText1= (EditText) findViewById(R.id.editText1);
	}
	int a = 0;
	static int c = 0;
	int b = 0;
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
		if (a==0)
		{
			buttont.setText("Дальше");
			textView1.setText("2+2*2=?");
			EditText1.setText("");
		}
		if (a==1)
		{
			EditText editText = (EditText) findViewById(R.id.editText1);
			String answer = editText.getText().toString();
			b=Integer.parseInt(answer);
			if (b==6)
			{
				c++;
			}
			textView1.setText("2^9=?");
			EditText1.setText("");
		}
		if (a==2)
		{
			EditText editText = (EditText) findViewById(R.id.editText1);
			String answer = editText.getText().toString();
			b=Integer.parseInt(answer);
			if (b==512)
			{
				c++;
			}
			textView1.setText("x^3=1; x-?");
			EditText1.setText("");
		}
		if (a==3)
		{
			EditText editText = (EditText) findViewById(R.id.editText1);
			String answer = editText.getText().toString();
			b=Integer.parseInt(answer);
			if (b==1)
			{
				c++;
			}
			textView1.setText("");
			Intent intent = new Intent(this, SecondActivity.class);
		    intent.putExtra(EXTRA_MESSAGE, Integer.toString(c));
		    startActivity(intent);
		}
		a++;
	}

}
