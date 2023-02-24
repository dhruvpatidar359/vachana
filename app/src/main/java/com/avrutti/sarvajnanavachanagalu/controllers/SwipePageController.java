package com.avrutti.sarvajnanavachanagalu.controllers;

import android.content.Context;
import android.util.Log;

import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.amulyakhare.textdrawable.util.ColorGenerator;
import com.avrutti.sarvajnanavachanagalu.adapters.CustomPagerAdapter;
import com.avrutti.sarvajnanavachanagalu.models.Vachanagalu;
import com.avrutti.sarvajnanavachanagalu.util.LoadJson;
import com.sembozdemir.viewpagerarrowindicator.library.ViewPagerArrowIndicator;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class SwipePageController {
  private Context context;
  
  ColorGenerator generator = ColorGenerator.MATERIAL;
  
  private ViewPager mViewPager;
  
  private String vachana;
  
  private ArrayList<Vachanagalu> vachanagaluList;
  
  private ViewPagerArrowIndicator viewPagerArrowIndicator;
  
  public SwipePageController(ViewPager paramViewPager, Context paramContext, String paramString) {
    Log.d("SwipeViewPageController", "SwipeViewPagecontrollercalled");
    this.mViewPager = paramViewPager;
    this.context = paramContext;
    this.vachana = paramString;
    this.vachanagaluList = new ArrayList<Vachanagalu>();
  }
  
  private Vachanagalu getCurrentItem() {
    // Byte code:
    //   0: ldc 'getCurrentItEM'
    //   2: ldc 'GET CURRENT ITEM CALLED'
    //   4: invokestatic d : (Ljava/lang/String;Ljava/lang/String;)I
    //   7: pop
    //   8: iconst_1
    //   9: istore_1
    //   10: aload_0
    //   11: getfield vachanagaluList : Ljava/util/ArrayList;
    //   14: invokevirtual iterator : ()Ljava/util/Iterator;
    //   17: astore_2
    //   18: aload_2
    //   19: invokeinterface hasNext : ()Z
    //   24: ifeq -> 109
    //   27: aload_2
    //   28: invokeinterface next : ()Ljava/lang/Object;
    //   33: checkcast com/avrutti/sarvajnanavachanagalu/models/Vachanagalu
    //   36: astore_3
    //   37: aload_3
    //   38: invokevirtual getVachana : ()Ljava/lang/String;
    //   41: aload_0
    //   42: getfield vachana : Ljava/lang/String;
    //   45: invokevirtual equals : (Ljava/lang/Object;)Z
    //   48: ifeq -> 78
    //   51: ldc 'true count'
    //   53: new java/lang/StringBuilder
    //   56: dup
    //   57: invokespecial <init> : ()V
    //   60: ldc 'true count>>'
    //   62: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   65: iconst_1
    //   66: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   69: invokevirtual toString : ()Ljava/lang/String;
    //   72: invokestatic d : (Ljava/lang/String;Ljava/lang/String;)I
    //   75: pop
    //   76: aload_3
    //   77: areturn
    //   78: ldc 'false count'
    //   80: new java/lang/StringBuilder
    //   83: dup
    //   84: invokespecial <init> : ()V
    //   87: ldc 'false count>>'
    //   89: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   92: iload_1
    //   93: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   96: invokevirtual toString : ()Ljava/lang/String;
    //   99: invokestatic d : (Ljava/lang/String;Ljava/lang/String;)I
    //   102: pop
    //   103: iinc #1, 1
    //   106: goto -> 18
    //   109: ldc 'null'
    //   111: ldc 'null'
    //   113: invokestatic d : (Ljava/lang/String;Ljava/lang/String;)I
    //   116: pop
    //   117: aconst_null
    //   118: astore_3
    //   119: goto -> 76
  }
  
  public void adaptSwipePageAdapter() {
    Log.d("adaptswipeViewPager", "before setAdapter");
    this.mViewPager.setAdapter((PagerAdapter)new CustomPagerAdapter(this.context, this.vachanagaluList));
    Log.d("adaptswipeViewPager", "before getCurremt ItEM");
    this.mViewPager.setCurrentItem(this.vachanagaluList.indexOf(getCurrentItem()));
  }
  
  public void setData() {
    Log.d("Setdata", "setdata");
    try {
      JSONObject jSONObject = new JSONObject();
      this(LoadJson.loadJSONFromAsset(this.context, "vachanagalu.json"));
      JSONArray jSONArray = jSONObject.getJSONArray("vachanagalu");
      byte b = 0;
      jSONObject = null;
      try {
        while (b < jSONArray.length()) {
          String str = jSONArray.getJSONObject(b).getString("vachana");
          Vachanagalu vachanagalu = new Vachanagalu();
          this();
          vachanagalu.setVachana(str);
          this.vachanagaluList.add(vachanagalu);
          b++;
        } 
        return;
      } catch (JSONException null) {}
    } catch (JSONException jSONException) {}
    jSONException.printStackTrace();
  }
}


/* Location:              C:\Users\dhruv\Desktop\decompile\dex-tools-2.1\classes-dex2jar.jar!\com\avrutti\sarvajnanavachanagalu\controllers\SwipePageController.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */