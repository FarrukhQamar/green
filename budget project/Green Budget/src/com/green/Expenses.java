package com.green;

import com.green.common.Common;

import android.app.Activity;
import android.os.Bundle;
import android.view.ViewGroup;

public class Expenses extends Activity {
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.expenses);
		
		ViewGroup root = (ViewGroup)findViewById(R.id.outerMainLayout);
		Common.setFont(root, Common.getHeaderTypeFace(getApplicationContext()));
	}
	
}
