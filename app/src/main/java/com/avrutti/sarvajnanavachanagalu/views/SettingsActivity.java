package com.avrutti.sarvajnanavachanagalu.views;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;

import com.avrutti.sarvajnanavachanagalu.fragments.SettingsFragments;

public class SettingsActivity extends AppCompatActivity {
  public Context context;
  
  public void onBackPressed() {
    super.onBackPressed();
    overridePendingTransition(2131034127, 2131034128);
  }
  
  protected void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    setContentView(2130968603);
    this.context = getApplicationContext();
    SettingsFragments settingsFragments = new SettingsFragments();
    settingsFragments.setAttributes(this.context);
    getFragmentManager().beginTransaction().replace(2131624046, (Fragment)settingsFragments).commit();
    if (getSupportActionBar() != null) {
      getSupportActionBar().setDisplayHomeAsUpEnabled(true);
      getSupportActionBar().setTitle("Settings");
    } 
  }
  
  public boolean onOptionsItemSelected(MenuItem paramMenuItem) {
    switch (paramMenuItem.getItemId()) {
      default:
        return super.onOptionsItemSelected(paramMenuItem);
      case 16908332:
        break;
    } 
    finish();
    overridePendingTransition(2131034127, 2131034128);
    return true;
  }
}


/* Location:              C:\Users\dhruv\Desktop\decompile\dex-tools-2.1\classes-dex2jar.jar!\com\avrutti\sarvajnanavachanagalu\views\SettingsActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */