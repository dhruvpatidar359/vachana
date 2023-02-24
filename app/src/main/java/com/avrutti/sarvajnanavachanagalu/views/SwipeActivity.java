package com.avrutti.sarvajnanavachanagalu.views;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.avrutti.sarvajnanavachanagalu.controllers.SwipePageController;
import com.avrutti.sarvajnanavachanagalu.models.Vachanagalu;
import com.sembozdemir.viewpagerarrowindicator.library.ViewPagerArrowIndicator;
import java.util.ArrayList;

public class SwipeActivity extends AppCompatActivity {
  private Context context;
  
  ViewPager mViewPager;
  
  private SwipePageController swipePageController;
  
  ArrayList<Vachanagalu> vachanagaluList;
  
  ViewPagerArrowIndicator viewPagerArrowIndicator;
  
  public void onBackPressed() {
    super.onBackPressed();
    overridePendingTransition(2131034127, 2131034128);
  }
  
  protected void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    setContentView(2130968633);
    String str1 = getResources().getString(2131165206);
    String str2 = getIntent().getStringExtra("vachanagalu");
    if (getSupportActionBar() != null) {
      Log.d("toolbar", "tooolbar not null");
      getSupportActionBar().setDisplayHomeAsUpEnabled(true);
      getSupportActionBar().setTitle(str1);
    } else {
      Log.d("toolbar null", "toolbar null");
    } 
    this.context = getApplicationContext();
    this.mViewPager = (ViewPager)findViewById(2131624048);
    this.swipePageController = new SwipePageController(this.mViewPager, this.context, str2);
    this.swipePageController.setData();
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu) {
    getMenuInflater().inflate(2131689472, paramMenu);
    return true;
  }
  
  public boolean onOptionsItemSelected(MenuItem paramMenuItem) {
    null = true;
    switch (paramMenuItem.getItemId()) {
      default:
        return super.onOptionsItemSelected(paramMenuItem);
      case 2131624074:
        startActivity(new Intent((Context)this, SettingsActivity.class));
        overridePendingTransition(2131034126, 2131034129);
        return SYNTHETIC_LOCAL_VARIABLE_2;
      case 16908332:
        break;
    } 
    finish();
    overridePendingTransition(2131034127, 2131034128);
    return SYNTHETIC_LOCAL_VARIABLE_2;
  }
  
  public void onResume() {
    this.swipePageController.adaptSwipePageAdapter();
    super.onResume();
  }
}


/* Location:              C:\Users\dhruv\Desktop\decompile\dex-tools-2.1\classes-dex2jar.jar!\com\avrutti\sarvajnanavachanagalu\views\SwipeActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */