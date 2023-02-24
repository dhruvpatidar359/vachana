package com.avrutti.sarvajnanavachanagalu.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import android.widget.TextView;

public class TextSizeSetter {
  public static void setTextSize(Context paramContext, TextView paramTextView) {
    float f;
    SharedPreferences sharedPreferences = AppUtil.getSharedPreference(paramContext);
    if (!AppUtil.isTablet(paramContext)) {
      f = sharedPreferences.getFloat("CURRENT_FONT_SIZE", 16.0F);
    } else {
      f = sharedPreferences.getFloat("CURRENT_FONT_SIZE", 20.0F);
    } 
    Log.d("currentFontSize", "Current font size" + f);
    if (paramTextView.getTextSize() != f)
      paramTextView.setTextSize(2, f); 
  }
}


/* Location:              C:\Users\dhruv\Desktop\decompile\dex-tools-2.1\classes-dex2jar.jar!\com\avrutti\sarvajnanavachanagal\\util\TextSizeSetter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */