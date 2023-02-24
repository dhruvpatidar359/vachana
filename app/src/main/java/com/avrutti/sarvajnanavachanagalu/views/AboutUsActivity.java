package com.avrutti.sarvajnanavachanagalu.views;

import android.content.Context;
import android.os.Bundle;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.avrutti.sarvajnanavachanagalu.util.TextSizeSetter;

public class AboutUsActivity extends AppCompatActivity {
  public static String PACKAGE_NAME;
  
  TextView textView;
  
  public void onBackPressed() {
    super.onBackPressed();
    overridePendingTransition(2131034127, 2131034128);
  }
  
  protected void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    setContentView(2130968601);
    PACKAGE_NAME = getApplicationContext().getPackageName();
    ((TextView)findViewById(2131624044)).setText((CharSequence)Html.fromHtml(getResources().getString(2131165204)));
    if (getSupportActionBar() != null) {
      getSupportActionBar().setTitle("About us");
      getSupportActionBar().setDisplayHomeAsUpEnabled(true);
      getSupportActionBar().setHomeButtonEnabled(true);
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
  
  public boolean onPrepareOptionsMenu(Menu paramMenu) {
    return super.onPrepareOptionsMenu(paramMenu);
  }
  
  public void onResume() {
    if (this.textView == null)
      this.textView = (TextView)findViewById(2131624044); 
    TextSizeSetter.setTextSize((Context)this, this.textView);
    super.onResume();
  }
}


/* Location:              C:\Users\dhruv\Desktop\decompile\dex-tools-2.1\classes-dex2jar.jar!\com\avrutti\sarvajnanavachanagalu\views\AboutUsActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */