package com.thenewboston.travis;

import android.app.Activity;
import android.os.Bundle;
import android.os.Environment;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class ExternalData extends Activity {

	private TextView canWrite, canRead;
	private String state;
	private boolean canW, canR;
	Spinner spinner;
	String[] paths = { "Music", "Pictures", "Download" };
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.externaldata);
		canWrite = (TextView) findViewById(R.id.tvCanWrite);
		canRead = (TextView) findViewById(R.id.tvCanRead);
		
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(ExternalData.this, android.R.layout.simple_spinner_item, paths);
		
		spinner = (Spinner) findViewById(R.id.spinner1);
		spinner.setAdapter(adapter);
		
		state = Environment.getExternalStorageState();
		if (state.equals(Environment.MEDIA_MOUNTED)){
			// read and write
			canWrite.setText("true");
			canRead.setText("true");
			canW = canR = true;
		}else if(state.equals(Environment.MEDIA_MOUNTED_READ_ONLY)){
			// read but can't write
			canWrite.setText("false");
			canRead.setText("true");
			canW = false;
			canR = true;
		}else {
			canWrite.setText("false");
			canRead.setText("false");
			canW = canR = false;
		}
	}
	
	
	
}
