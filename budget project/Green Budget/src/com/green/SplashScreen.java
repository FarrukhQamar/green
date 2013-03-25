
package com.green;

import com.green.common.Common;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.ViewGroup;

public class SplashScreen extends Activity{
	
	private final int SPLASH_DISPLAY_LENGHT = 2000;
	
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.spash_screen);
		
		ViewGroup root = (ViewGroup)findViewById(R.id.outerMainLayout);
		Common.setFont(root, Common.getHeaderTypeFace(getApplicationContext()));
		
		/**
		 * This section took from
		 * URL : http://stackoverflow.com/questions/5486789/how-do-i-make-a-splash-screen-in-android
		 * 
		 */
		new Handler().postDelayed(new Runnable(){
            public void run() {
                /* Create an Intent that will start the Menu-Activity. */
                Intent mainIntent = new Intent(SplashScreen.this,SignIn.class);
                SplashScreen.this.startActivity(mainIntent);
                SplashScreen.this.finish();
            }
        }, SPLASH_DISPLAY_LENGHT);
		
	}
}
