package com.thenewboston.travis;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.RadioGroup;
import android.widget.TextView;

public class OpenedClass extends Activity implements OnClickListener, OnCheckedChangeListener{

	Button returnData;
	TextView question, test;
	RadioGroup selectionList;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.send);
		initialize();
	}

	private void initialize() {
		// TODO Auto-generated method stub
		returnData = (Button) findViewById(R.id.bReturn);
		question = (TextView) findViewById(R.id.tvQuestion);
		test = (TextView) findViewById(R.id.tvText);
		returnData.setOnClickListener(this);
		selectionList.setOnCheckedChangeListener(this);
	}

	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}

	public void onCheckedChanged(RadioGroup arg0, int arg1) {
		// TODO Auto-generated method stub
		switch(arg1){
		case R.id.rMessi:
			
			break;
		case R.id.rRonaldo:
			
			break;
		case R.id.rNeymar:
			
			break;
		}
	}
}
