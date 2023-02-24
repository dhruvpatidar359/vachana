package com.avrutti.sarvajnanavachanagalu.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class AppUtil {
  public static SharedPreferences getSharedPreference(Context paramContext) {
    return PreferenceManager.getDefaultSharedPreferences(paramContext);
  }
  
  public static boolean isTablet(Context paramContext) {
    return (((paramContext.getResources().getConfiguration()).screenLayout & 0xF) >= 3);
  }
}


/* Location:              C:\Users\dhruv\Desktop\decompile\dex-tools-2.1\classes-dex2jar.jar!\com\avrutti\sarvajnanavachanagal\\util\AppUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */