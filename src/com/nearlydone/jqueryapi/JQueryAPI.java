package com.nearlydone.jqueryapi;

import com.phonegap.*;
import android.os.Bundle;

public class JQueryAPI extends DroidGap {
    /** Called when the activity is first created. */
	//WebView ndView;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.loadUrl("file:///android_asset/www/index.html");
        //setContentView(R.layout.main);
        
        //WebView ndView = (WebView) findViewById(R.id.webview);
        //WebSettings webSettings = ndView.getSettings();
        //webSettings.setJavaScriptEnabled(true);
        //ndView.addJavascriptInterface(new App(), "droid");
        //ndView.loadUrl("http://nearlydone.co.uk/jqueryapi.htm");
    }
    
    
    //class App {
    	
    //	public String pullpage (String hreftoget) {
    //		String internalvar = "will get it";
    //		return internalvar;
    //	}

    //}
}