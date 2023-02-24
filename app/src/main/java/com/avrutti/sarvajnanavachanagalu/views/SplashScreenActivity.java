package com.avrutti.sarvajnanavachanagalu.views;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.widget.ProgressBar;

public class SplashScreenActivity extends Activity {
  public void onBackPressed() {
    super.onBackPressed();
    overridePendingTransition(2131034127, 2131034128);
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration) {
    super.onConfigurationChanged(paramConfiguration);
    if (paramConfiguration.orientation == 2) {
      Log.d("orientaion", "orientaion>>>>>>ORIENTATION_LANDSCAPE >>> " + paramConfiguration.orientation);
      setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
      return;
    } 
    if (paramConfiguration.orientation == 1) {
      Log.d("orientaion", "orientaion>>>>>>ORIENTATION_PORTRAIT >>> " + paramConfiguration.orientation);
      setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    } 
  }
  
  protected void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    setContentView(2130968604);
    splash();
  }
  
  public void splash() {
    ProgressBar progressBar = (ProgressBar)findViewById(2131624042);
    progressBar.clearAnimation();
    progressBar.setProgress(25);
    progressBar.setSecondaryProgress(50);
    progressBar.setMax(100);
    (new Thread() {
        public void run() {
          try {
            sleep(2000L);
            return;
          } catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
            return;
          } finally {
            Intent intent = new Intent((Context)SplashScreenActivity.this, MainActivity.class);
            SplashScreenActivity.this.startActivity(intent);
            SplashScreenActivity.this.overridePendingTransition(2131034126, 2131034129);
          } 
        }
      }).start();
  }
}


/* Location:              C:\Users\dhruv\Desktop\decompile\dex-tools-2.1\classes-dex2jar.jar!\com\avrutti\sarvajnanavachanagalu\views\SplashScreenActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */