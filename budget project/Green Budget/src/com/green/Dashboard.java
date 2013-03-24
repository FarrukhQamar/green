package com.green;

import com.green.common.Common;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Dashboard extends Activity {
	
	private TextView lblHeader;
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.dashboard);
		
		lblHeader =(TextView)findViewById(R.id.lbltitle);
		lblHeader.setTypeface(Common.getHeaderTypeFace(getApplicationContext()));
	}
}
