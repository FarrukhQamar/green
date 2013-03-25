package com.green;

import com.green.common.Common;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class SignIn extends Activity {
	private Button btnLogin;
	private TextView lblCreateAnAccount;
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sign_in);
		ViewGroup root = (ViewGroup)findViewById(R.id.outerMainLayout);
		Common.setFont(root, Common.getHeaderTypeFace(getApplicationContext()));

		btnLogin = (Button)findViewById(R.id.btnSignIn);
		lblCreateAnAccount = (TextView)findViewById(R.id.lblCreateAnAccount);
		lblCreateAnAccount.setMovementMethod(LinkMovementMethod.getInstance());
		
		btnLogin.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				Intent signIn = new Intent(getApplicationContext(), Dashboard.class);
	        	startActivity(signIn);
				
			}
		});
		
		lblCreateAnAccount.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				
				Intent create = new Intent(getApplicationContext(), CreateAccount.class);
	        	startActivity(create);
				
			}
		});
	}
}
