package com.green;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignIn extends Activity {
	private Button btnLogin;
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sign_in);
		
		btnLogin = (Button)findViewById(R.id.btnSignIn);
		btnLogin.setOnClickListener(new View.OnClickListener() {
			
			public void onClick(View arg0) {
				Intent create = new Intent(getApplicationContext(), Dashboard.class);
	        	startActivity(create);
				
			}
		});
	}
}
