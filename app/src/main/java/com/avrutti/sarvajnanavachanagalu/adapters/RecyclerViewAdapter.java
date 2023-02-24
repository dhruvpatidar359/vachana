package com.avrutti.sarvajnanavachanagalu.adapters;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.text.Html;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.avrutti.sarvajnanavachanagalu.models.Vachanagalu;
import com.avrutti.sarvajnanavachanagalu.util.TextSizeSetter;
import com.avrutti.sarvajnanavachanagalu.views.SwipeActivity;
import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {
  private Context context;
  
  private LayoutInflater inflator;
  
  int listNumbering = 1;
  
  private RecyclerView recyclerView;
  
  private ArrayList<Vachanagalu> vachanagaluList;
  
  public RecyclerViewAdapter(Context paramContext, ArrayList<Vachanagalu> paramArrayList) {
    this.context = paramContext;
    this.inflator = LayoutInflater.from(paramContext);
    this.vachanagaluList = paramArrayList;
  }
  
  public int getItemCount() {
    return this.vachanagaluList.size();
  }
  
  public void onBindViewHolder(MyViewHolder paramMyViewHolder, int paramInt) {
    Vachanagalu vachanagalu = this.vachanagaluList.get(paramInt);
    String[] arrayOfString = vachanagalu.getVachana().split("<br ?/?>");
    Log.d("array values", arrayOfString[0] + arrayOfString[1]);
    paramMyViewHolder.vachanaTextView1.setText((CharSequence)Html.fromHtml(arrayOfString[0]));
    paramMyViewHolder.vachanaTextView2.setText((CharSequence)Html.fromHtml(arrayOfString[1]));
    paramMyViewHolder.imageView.setImageDrawable((Drawable)vachanagalu.getImage());
    Log.d("image view set", "image view set");
    TextSizeSetter.setTextSize(this.context, paramMyViewHolder.vachanaTextView1);
    TextSizeSetter.setTextSize(this.context, paramMyViewHolder.vachanaTextView2);
  }
  
  public MyViewHolder onCreateViewHolder(ViewGroup paramViewGroup, int paramInt) {
    return new MyViewHolder(this.inflator.inflate(2130968634, paramViewGroup, false));
  }
  
  class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    ImageView imageView;
    
    TextView vachanaTextView1;
    
    TextView vachanaTextView2;
    
    public MyViewHolder(View param1View) {
      super(param1View);
      param1View.setOnClickListener(this);
      this.vachanaTextView1 = (TextView)param1View.findViewById(2131624072);
      this.vachanaTextView2 = (TextView)param1View.findViewById(2131624073);
      this.imageView = (ImageView)param1View.findViewById(2131624071);
    }
    
    public void onClick(View param1View) {
      Activity activity = (Activity)RecyclerViewAdapter.this.context;
      Vachanagalu vachanagalu = RecyclerViewAdapter.this.vachanagaluList.get(getAdapterPosition());
      Intent intent = new Intent(RecyclerViewAdapter.this.context, SwipeActivity.class);
      intent.putExtra("vachanagalu", vachanagalu.getVachana());
      intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
      RecyclerViewAdapter.this.context.startActivity(intent);
      activity.overridePendingTransition(2131034127, 2131034128);
    }
  }
}


/* Location:              C:\Users\dhruv\Desktop\decompile\dex-tools-2.1\classes-dex2jar.jar!\com\avrutti\sarvajnanavachanagalu\adapters\RecyclerViewAdapter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */