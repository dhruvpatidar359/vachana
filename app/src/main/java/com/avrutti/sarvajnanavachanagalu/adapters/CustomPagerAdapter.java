package com.avrutti.sarvajnanavachanagalu.adapters;

import android.content.Context;
import android.text.Html;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.example.sarvajnanavachanagalu.R;
import androidx.viewpager.widget.PagerAdapter;

import com.avrutti.sarvajnanavachanagalu.models.Vachanagalu;
import com.avrutti.sarvajnanavachanagalu.util.TextSizeSetter;
import java.util.ArrayList;

public class CustomPagerAdapter extends PagerAdapter {
  Context mContext;
  
  LayoutInflater mLayoutInflater;
  
  ArrayList<Vachanagalu> pages = new ArrayList<Vachanagalu>();
  
  public CustomPagerAdapter(Context paramContext, ArrayList<Vachanagalu> paramArrayList) {
    this.mContext = paramContext;
    this.mLayoutInflater = LayoutInflater.from(this.mContext);
    this.pages = paramArrayList;
  }
  
  public void destroyItem(ViewGroup paramViewGroup, int paramInt, Object paramObject) {
    paramViewGroup.removeView((View)paramObject);
  }
  
  public int getCount() {
    return this.pages.size();
  }
  
  public int getItemPosition(Object paramObject) {
    return super.getItemPosition(paramObject);
  }
  
  public Object instantiateItem(ViewGroup paramViewGroup, int paramInt) {
    Log.d("insntiate item", "instantiate item called");
    View view = this.mLayoutInflater.inflate(2130968620, paramViewGroup, false);
    Log.d("insntiate item", "fragment_main inflated");
    TextView textView = (TextView)view.findViewById(2131624056);
    Log.d("pages", "pages.get(position).getVachana()>>>" + ((Vachanagalu)this.pages.get(paramInt)).getVachana());
    textView.setText((CharSequence)Html.fromHtml(((Vachanagalu)this.pages.get(paramInt)).getVachana()));
    TextSizeSetter.setTextSize(this.mContext, textView);
    paramViewGroup.addView(view);
    return view;
  }
  
  public boolean isViewFromObject(View paramView, Object paramObject) {
    return (paramView == paramObject);
  }
}


/* Location:              C:\Users\dhruv\Desktop\decompile\dex-tools-2.1\classes-dex2jar.jar!\com\avrutti\sarvajnanavachanagalu\adapters\CustomPagerAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */