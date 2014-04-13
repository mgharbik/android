package com.thenewboston.travis;

import android.app.Activity;
import android.os.Bundle;

public class GFXSurface extends Activity {

	MyBringBackSurface ourSurfaceView;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		ourSurfaceView = new MyBringBackSurface(this);
		setContentView(ourSurfaceView);
	}

	
}
