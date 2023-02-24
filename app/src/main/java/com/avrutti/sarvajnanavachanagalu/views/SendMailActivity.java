package com.avrutti.sarvajnanavachanagalu.views;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class SendMailActivity extends Activity {
  protected void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    String str = getIntent().getExtras().getString("send");
    Intent intent = new Intent("android.intent.action.SEND");
    intent.setData(Uri.parse("mailto:"));
    intent.putExtra("android.intent.extra.EMAIL", new String[] { "Avruttiworldwide@gmail.com" });
    intent.putExtra("android.intent.extra.SUBJECT", str);
    intent.setType("message/rfc822");
    startActivity(Intent.createChooser(intent, "Send Email"));
  }
}


/* Location:              C:\Users\dhruv\Desktop\decompile\dex-tools-2.1\classes-dex2jar.jar!\com\avrutti\sarvajnanavachanagalu\views\SendMailActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */