package com.thenewboston.travis;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class SQLiteExample extends Activity implements OnClickListener {

	Button sqlUpdate, sqlView;
	EditText sqlName, sqlHotness;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sqliteexample);
		sqlUpdate = (Button) findViewById(R.id.bSQLUpdate);
		sqlName = (EditText) findViewById(R.id.etSQLName);
		sqlHotness = (EditText) findViewById(R.id.etSQLHotness);		
		
		sqlView = (Button) findViewById(R.id.bSQLopenView);
		sqlView.setOnClickListener(this);
		sqlUpdate.setOnClickListener(this);
	}


	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		switch (arg0.getId()){
		case R.id.bSQLUpdate:
			
			break;
		case R.id.bSQLopenView:
			
			break;
		}
	}

}
