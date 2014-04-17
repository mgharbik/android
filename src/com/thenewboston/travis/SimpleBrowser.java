package com.thenewboston.travis;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

public class SimpleBrowser extends Activity implements OnClickListener {
	
	WebView ourBrowser;
	EditText url;
	Button go, back, refresh, foward, clearHistory;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.simplebrowser);
		
		ourBrowser = (WebView) findViewById(R.id.wvBrowser);
		ourBrowser.setWebViewClient(new ourViewClient());
		ourBrowser.loadUrl("http://google.com");
		
		go = (Button) findViewById(R.id.btGo);
		back = (Button) findViewById(R.id.bBack);
		refresh = (Button) findViewById(R.id.bRefresh);
		foward = (Button) findViewById(R.id.bForward);
		clearHistory = (Button) findViewById(R.id.bHistory);
		url = (EditText) findViewById(R.id.etURL);
		
		go.setOnClickListener(this);
		back.setOnClickListener(this);
		refresh.setOnClickListener(this);
		foward.setOnClickListener(this);
		clearHistory.setOnClickListener(this);
		
	}

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		switch (arg0.getId()) {
		case R.id.btGo:
			String theWebSite =  url.getText().toString();
			ourBrowser.loadUrl(theWebSite);
			break;
		case R.id.bBack:
			if (ourBrowser.canGoBack())
				ourBrowser.goBack();
			break;
		case R.id.bRefresh:
			if (ourBrowser.canGoForward())
				ourBrowser.goForward();
			break;
		case R.id.bForward:
			ourBrowser.reload();
			break;
		case R.id.bHistory:
			ourBrowser.clearHistory();
			break;
		}
	}
	
	
	
}
