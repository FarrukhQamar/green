package com.green.common;

import android.content.Context;
import android.graphics.Typeface;
import android.util.Log;

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

}
