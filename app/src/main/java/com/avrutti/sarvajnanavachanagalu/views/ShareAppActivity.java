package com.avrutti.sarvajnanavachanagalu.views;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class ShareAppActivity extends Activity {
  String displayText;
  
  protected void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    String str = getIntent().getExtras().getString("send");
    if (str.equalsIgnoreCase("share")) {
      this.displayText = "\nHey,\nI am learning Java programming with this amazing app\nThis is Best app with Proper Tutorials, 100+ programs and hundreds of questions-answers & Exam Questions.\n Download it :\n";
    } else if (str.equalsIgnoreCase("suggest")) {
      this.displayText = "\nHey, \nI want you to download this app...\nThis is best app for Java programming with Tutorials, 100+ Programs, FAQ's & Exam Questions\n";
    } else {
      this.displayText = str;
    } 
    Intent intent = new Intent("android.intent.action.SEND");
    intent.setType("text/plain");
    intent.putExtra("android.intent.extra.SUBJECT", "Java Programming");
    intent.putExtra("android.intent.extra.TEXT", this.displayText + "\n" + "https://play.google.com/store/apps/details?id=com.avrutti.javaProgrammingIcse");
    startActivity(Intent.createChooser(intent, "Share with..."));
  }
}


/* Location:              C:\Users\dhruv\Desktop\decompile\dex-tools-2.1\classes-dex2jar.jar!\com\avrutti\sarvajnanavachanagalu\views\ShareAppActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */