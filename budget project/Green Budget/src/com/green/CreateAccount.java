package com.green;

import com.green.common.Common;

import android.app.Activity;
import android.os.Bundle;
import android.view.ViewGroup;

public class CreateAccount extends Activity {
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_account);
        
        ViewGroup root = (ViewGroup)findViewById(R.id.outerMainLayout);
		Common.setFont(root, Common.getHeaderTypeFace(getApplicationContext()));
        
    }
}