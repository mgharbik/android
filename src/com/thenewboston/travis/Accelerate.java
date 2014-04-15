package com.thenewboston.travis;

import android.app.Activity;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.Bundle;

public class Accelerate extends Activity implements SensorEventListener{

	// WE SHOULD COPY HERE THE MyBringBackSurface CLASS FROM GFXSURFACE
	// PROBABLY IT WAS IMPLEMENTED IN BETWEEN 70-110 TUTORIALS
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		//setContentView(new MyBringBackSurface(this));
	}

	@Override
	public void onAccuracyChanged(Sensor sensor, int accuracy) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onSensorChanged(SensorEvent event) {
		// TODO Auto-generated method stub
		
	}
	
	
}
