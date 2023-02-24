package com.avrutti.sarvajnanavachanagalu.views;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.avrutti.sarvajnanavachanagalu.controllers.RecyclerViewController;

public class MainActivity extends AppCompatActivity {
  public static String PACKAGE_NAME;
  
  public Context context;
  
  private CharSequence mTitle;
  
  private RecyclerViewController recyclerViewController;
  
  protected void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    setContentView(2130968602);
    PACKAGE_NAME = getApplicationContext().getPackageName();
    this.mTitle = getResources().getString(2131165206);
    RecyclerView recyclerView = (RecyclerView)findViewById(2131624045);
    this.context = getApplicationContext();
    this.recyclerViewController = new RecyclerViewController(recyclerView, (Context)this);
    this.recyclerViewController.setData();
    this.recyclerViewController.adaptRecyclerView();
    if (getSupportActionBar() != null) {
      getSupportActionBar().setHomeButtonEnabled(true);
      getSupportActionBar().setTitle(this.mTitle);
    } 
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu) {
    getMenuInflater().inflate(2131689472, paramMenu);
    return true;
  }
  
  public boolean onOptionsItemSelected(MenuItem paramMenuItem) {
    switch (paramMenuItem.getItemId()) {
      default:
        return super.onOptionsItemSelected(paramMenuItem);
      case 2131624074:
        break;
    } 
    startActivity(new Intent((Context)this, SettingsActivity.class));
    overridePendingTransition(2131034126, 2131034129);
    return true;
  }
  
  public boolean onPrepareOptionsMenu(Menu paramMenu) {
    return super.onPrepareOptionsMenu(paramMenu);
  }
  
  public void onResume() {
    this.recyclerViewController.adaptRecyclerView();
    super.onResume();
  }
}


/* Location:              C:\Users\dhruv\Desktop\decompile\dex-tools-2.1\classes-dex2jar.jar!\com\avrutti\sarvajnanavachanagalu\views\MainActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */