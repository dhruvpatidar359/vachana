package com.avrutti.sarvajnanavachanagalu.util;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.preference.Preference;
import android.util.Log;
import com.avrutti.sarvajnanavachanagalu.views.AboutUsActivity;
import com.avrutti.sarvajnanavachanagalu.views.MainActivity;
import com.avrutti.sarvajnanavachanagalu.views.SendMailActivity;

public class PreferenceClickListner implements Preference.OnPreferenceClickListener {
  private Context context;
  
  public PreferenceClickListner(Context paramContext) {
    this.context = paramContext;
  }
  
  public boolean onPreferenceClick(Preference paramPreference) {
    Intent intent1;
    Intent intent2;
    Activity activity = (Activity)this.context;
    Log.d("key", "onPreferenceClick key: " + paramPreference.getKey());
    String str = paramPreference.getKey();
    byte b = -1;
    switch (str.hashCode()) {
      default:
        switch (b) {
          default:
            return true;
          case 0:
            intent2 = new Intent(this.context, SendMailActivity.class);
            intent2.putExtra("send", paramPreference.getKey());
            intent2.addFlags(268435456);
            this.context.startActivity(intent2);
            activity.overridePendingTransition(2131034127, 2131034128);
          case 1:
            intent1 = new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/developer?id=Avrutti+-+Smartness+Redefined"));
            intent1.addFlags(268435456);
            this.context.startActivity(intent1);
            activity.overridePendingTransition(2131034127, 2131034128);
          case 2:
            Log.d("suggestions", "suggestions");
            intent2 = new Intent(this.context, SendMailActivity.class);
            intent2.putExtra("send", intent1.getKey());
            intent2.addFlags(268435456);
            this.context.startActivity(intent2);
            activity.overridePendingTransition(2131034127, 2131034128);
          case 3:
            Log.d("about us", "about us");
            intent1 = new Intent(this.context, AboutUsActivity.class);
            intent1.addFlags(268435456);
            this.context.startActivity(intent1);
            activity.overridePendingTransition(2131034127, 2131034128);
          case 4:
            break;
        } 
        break;
      case -287133568:
        if (intent2.equals("Bug report"))
          b = 0; 
      case -536318915:
        if (intent2.equals("More apps"))
          b = 1; 
      case 142548687:
        if (intent2.equals("Suggestions"))
          b = 2; 
      case 1619363984:
        if (intent2.equals("about_us"))
          b = 3; 
      case 983464541:
        if (intent2.equals("rate_us"))
          b = 4; 
    } 
    try {
      Context context = this.context;
      Intent intent = new Intent();
      StringBuilder stringBuilder = new StringBuilder();
      this();
      this("android.intent.action.VIEW", Uri.parse(stringBuilder.append("market://details?id=").append(MainActivity.PACKAGE_NAME).toString()));
      context.startActivity(intent);
    } catch (ActivityNotFoundException activityNotFoundException) {
      this.context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + MainActivity.PACKAGE_NAME)));
    } 
  }
}


/* Location:              C:\Users\dhruv\Desktop\decompile\dex-tools-2.1\classes-dex2jar.jar!\com\avrutti\sarvajnanavachanagal\\util\PreferenceClickListner.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */