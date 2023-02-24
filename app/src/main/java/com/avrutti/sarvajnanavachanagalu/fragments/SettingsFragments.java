package com.avrutti.sarvajnanavachanagalu.fragments;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.ListPreference;
import android.preference.Preference;
import android.preference.PreferenceFragment;
import android.util.Log;
import com.avrutti.sarvajnanavachanagalu.util.PreferenceClickListner;

public class SettingsFragments extends PreferenceFragment implements SharedPreferences.OnSharedPreferenceChangeListener {
  private Preference connectionPref;
  
  public Context context;
  
  private Intent intent;
  
  public void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    addPreferencesFromResource(2131099648);
    this.connectionPref = findPreference("Bug report");
    this.connectionPref.setOnPreferenceClickListener((Preference.OnPreferenceClickListener)new PreferenceClickListner((Context)getActivity()));
    this.connectionPref = findPreference("rate_us");
    this.connectionPref.setOnPreferenceClickListener((Preference.OnPreferenceClickListener)new PreferenceClickListner((Context)getActivity()));
    this.connectionPref = findPreference("More apps");
    this.connectionPref.setOnPreferenceClickListener((Preference.OnPreferenceClickListener)new PreferenceClickListner((Context)getActivity()));
    this.connectionPref = findPreference("Suggestions");
    this.connectionPref.setOnPreferenceClickListener((Preference.OnPreferenceClickListener)new PreferenceClickListner((Context)getActivity()));
    this.connectionPref = findPreference("about_us");
    this.connectionPref.setOnPreferenceClickListener((Preference.OnPreferenceClickListener)new PreferenceClickListner((Context)getActivity()));
  }
  
  public void onPause() {
    super.onPause();
    getPreferenceScreen().getSharedPreferences().unregisterOnSharedPreferenceChangeListener(this);
  }
  
  public void onResume() {
    super.onResume();
    getPreferenceScreen().getSharedPreferences().registerOnSharedPreferenceChangeListener(this);
  }
  
  public void onSharedPreferenceChanged(SharedPreferences paramSharedPreferences, String paramString) {
    Log.d("key value", "key value" + paramString);
    byte b = -1;
    switch (paramString.hashCode()) {
      default:
        switch (b) {
          default:
            return;
          case 0:
            break;
        } 
        break;
      case -1540859375:
        if (paramString.equals("font_Size"))
          b = 0; 
    } 
    ListPreference listPreference = (ListPreference)findPreference(paramString);
    String str = (String)listPreference.getEntry();
    float f = Float.parseFloat(listPreference.getValue());
    SharedPreferences.Editor editor = paramSharedPreferences.edit();
    editor.putFloat("CURRENT_FONT_SIZE", f);
    editor.commit();
    Log.d("key value", "bug" + paramString + "fontSize>>>>" + str + "fontValue>>>>" + f);
  }
  
  public void setAttributes(Context paramContext) {
    this.context = paramContext;
  }
}


/* Location:              C:\Users\dhruv\Desktop\decompile\dex-tools-2.1\classes-dex2jar.jar!\com\avrutti\sarvajnanavachanagalu\fragments\SettingsFragments.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */