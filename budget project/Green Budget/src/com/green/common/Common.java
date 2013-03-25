package com.green.common;

import android.content.Context;
import android.graphics.Typeface;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class Common{
	
	/**
	 * This method has used to return specific
	 * Typeface to application.
	 * @param con
	 * @return Typeface
	 */
	public static Typeface getHeaderTypeFace(Context con)
	{
		Typeface SeguiTypeFace = null;
		try {
			 SeguiTypeFace = Typeface.createFromAsset(con.getAssets(),"segoeuisl.ttf");
		} catch (Exception e) {
			Log.e("Green", e.toString());
		}
		return SeguiTypeFace;
	}
	
	/*
	 * Sets the font on all TextViews in the ViewGroup. Searches
	 * recursively for all inner ViewGroups as well. Just add a
	 * check for any other views you want to set as well (EditText,
	 * etc.)
	 * URL : http://stackoverflow.com/questions/4395309/android-want-to-set-custom-fonts-for-whole-application-not-runtime
	 */
	public static void setFont(ViewGroup group, Typeface font) {
	    int count = group.getChildCount();
	    View v;
	    for(int i = 0; i < count; i++) {
	        v = group.getChildAt(i);
	        if(v instanceof TextView || v instanceof Button /*etc.*/)
	            ((TextView)v).setTypeface(font);
	        else if(v instanceof ViewGroup)
	            setFont((ViewGroup)v, font);
	    }
	}
}
