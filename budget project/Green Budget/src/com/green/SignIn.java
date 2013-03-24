package com.green;

import com.green.common.Common;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.LabeledIntent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SignIn extends Activity {
	private Button btnLogin;
	private TextView lblHeader;
	private TextView lblTitle;
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sign_in);
		lblHeader =(TextView)findViewById(R.id.lbltitle);
		lblTitle =(TextView)findViewById(R.id.lblTitle);
		
		lblHeader.setTypeface(Common.getHeaderTypeFace(getApplicationContext()));
		lblTitle.setTypeface(Common.getHeaderTypeFace(getApplicationContext()));
		btnLogin = (Button)findViewById(R.id.btnSignIn);
		
		btnLogin.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				Intent create = new Intent(getApplicationContext(), Dashboard.class);
	        	startActivity(create);
				
			}
		});
	}
}
