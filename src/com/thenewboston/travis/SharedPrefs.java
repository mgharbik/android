package com.thenewboston.travis;

import android.app.Activity;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SharedPrefs extends Activity implements OnClickListener {
	
	EditText sharedData;
	TextView dataResults;
	Button save, load;
	public static String filename = "MySharedString";
	SharedPreferences someData;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sharedpreferences);
		setupVariables();
		someData = getSharedPreferences(filename, 0);
	}

	private void setupVariables() {
		save = (Button) findViewById(R.id.bSave);
		load = (Button) findViewById(R.id.bLoad);
		sharedData = (EditText) findViewById(R.id.etSharedPreferences);
		dataResults = (TextView) findViewById(R.id.tvLoadSharedPreferences);
		save.setOnClickListener(this);
		load.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch (v.getId()) {
		case R.id.bSave:
			String stringData = sharedData.getText().toString();
			Editor editor = someData.edit();
			editor.putString("sharedString", stringData);
			editor.commit();
			break;
		case R.id.bLoad:
			someData = getSharedPreferences(filename, 0);
			String dataReturned = someData.getString("sharedString", "Couldn't load data");
			dataResults.setText(dataReturned);
			break;
		}
	}

	
}
