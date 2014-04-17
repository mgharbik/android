package com.thenewboston.travis;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class SimpleBrowser extends Activity {
	
	WebView ourBrowser;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.simplebrowser);
		
		ourBrowser = (WebView) findViewById(R.id.wvBrowser);
		ourBrowser.loadUrl("http://google.com");
	}
	
	
	
}
