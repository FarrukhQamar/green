
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
	private TextView lblCreateResetPassword;
	private TextView lblChangePassword;
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sign_in);
		ViewGroup root = (ViewGroup)findViewById(R.id.outerMainLayout);
		Common.setFont(root, Common.getHeaderTypeFace(getApplicationContext()));

		btnLogin = (Button)findViewById(R.id.btnSignIn);
		lblCreateAnAccount = (TextView)findViewById(R.id.lblCreateAnAccount);
		lblCreateResetPassword = (TextView)findViewById(R.id.lblCreateResetPassword);
		lblChangePassword = (TextView)findViewById(R.id.lblChangePassword);
		
		lblCreateAnAccount.setMovementMethod(LinkMovementMethod.getInstance());
		lblCreateResetPassword.setMovementMethod(LinkMovementMethod.getInstance());
		lblChangePassword.setMovementMethod(LinkMovementMethod.getInstance());
		
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
		
		lblCreateResetPassword.setOnClickListener(new View.OnClickListener() {	
			public void onClick(View arg0) {		
				Intent reset = new Intent(getApplicationContext(), ResetPassword.class);
	        	startActivity(reset);
				
			}
		});
		
		lblChangePassword.setOnClickListener(new View.OnClickListener() {	
			public void onClick(View arg0) {		
				Intent change = new Intent(getApplicationContext(), ChangePassword.class);
	        	startActivity(change);
				
			}
		});
	}
}
