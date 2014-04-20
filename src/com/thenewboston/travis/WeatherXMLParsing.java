package com.thenewboston.travis;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class WeatherXMLParsing extends Activity implements OnClickListener {
	
	
	//String URL = "http://www.google.com/ig/api?weather=";
	final static String baseURL = "http://www.google.com/ig/api?weather=";
	TextView tv;
	EditText city, state;
	Button b;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.weather);
		b = (Button) findViewById(R.id.bWeather);
		tv = (TextView) findViewById(R.id.tvWeather);
		city = (EditText) findViewById(R.id.etCity);
		state = (EditText) findViewById(R.id.etState);
		b.setOnClickListener(this);
	}

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		String c = city.getText().toString();
		String s = state.getText().toString();
		
		StringBuilder URL = new StringBuilder(baseURL);
		URL.append(c + "," + s);
		String fullURL = URL.toString();
		
	}


}
