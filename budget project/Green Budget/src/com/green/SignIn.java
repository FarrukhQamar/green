/*
   Green Budget is income and expense tracking software
   Copyright (C) 2013  Damith Wanninayake

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
 
 */
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
