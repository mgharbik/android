package com.thenewboston.travis;

import android.content.Context;
import android.graphics.Canvas;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

public class MyBringBackSurface extends SurfaceView implements Runnable {

	SurfaceHolder ourHolder;
	Thread ourThread = null;
	boolean isRunning = false;
	
	public MyBringBackSurface(Context context) {
		// TODO Auto-generated constructor stub
		super(context);
		ourHolder = getHolder();

	}

	public void pause(){
		isRunning = false;
		while(true){
			try {
				ourThread.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		}
		ourThread = null;
	}
	
	public void resume(){
		isRunning = true;
		ourThread = new Thread(this);
		ourThread.start();
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(isRunning){
			if (!ourHolder.getSurface().isValid())
				continue;
			
			Canvas canvas = ourHolder.lockCanvas();
			canvas.drawRGB(02, 02, 150);
			ourHolder.unlockCanvasAndPost(canvas);
		}
	}

}
