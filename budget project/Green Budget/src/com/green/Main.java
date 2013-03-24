package com.green;

import com.green.common.Common;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Main extends Activity {
	
	private TextView lblHeader;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        lblHeader =(TextView)findViewById(R.id.lbltitle);
		lblHeader.setTypeface(Common.getHeaderTypeFace(getApplicationContext()));
        
    }
}