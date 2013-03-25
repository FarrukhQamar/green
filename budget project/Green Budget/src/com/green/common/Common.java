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
