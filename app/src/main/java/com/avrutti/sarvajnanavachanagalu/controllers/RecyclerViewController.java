package com.avrutti.sarvajnanavachanagalu.controllers;

import android.content.Context;
import android.util.Log;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.amulyakhare.textdrawable.TextDrawable;
import com.amulyakhare.textdrawable.util.ColorGenerator;
import com.avrutti.sarvajnanavachanagalu.adapters.RecyclerViewAdapter;
import com.avrutti.sarvajnanavachanagalu.models.Vachanagalu;
import com.avrutti.sarvajnanavachanagalu.util.LoadJson;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class RecyclerViewController {
  private static ArrayList<Vachanagalu> vachanagaluList;
  
  private Context context;
  
  ColorGenerator generator = ColorGenerator.MATERIAL;
  
  private RecyclerView.LayoutManager mLayoutManager;
  
  private RecyclerView resourceID;
  
  private Vachanagalu vachanagalu;
  
  public RecyclerViewController(RecyclerView paramRecyclerView, Context paramContext) {
    this.resourceID = paramRecyclerView;
    this.context = paramContext;
    vachanagaluList = new ArrayList<Vachanagalu>();
  }
  
  public static ArrayList<Vachanagalu> getVachanagaluList() {
    return vachanagaluList;
  }
  
  public void adaptRecyclerView() {
    RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(this.context, vachanagaluList);
    this.mLayoutManager = (RecyclerView.LayoutManager)new LinearLayoutManager(this.context);
    this.resourceID.setLayoutManager(this.mLayoutManager);
    this.resourceID.setAdapter((RecyclerView.Adapter)recyclerViewAdapter);
  }
  
  public void setData() {
    try {
      JSONObject jSONObject = new JSONObject();
      this(LoadJson.loadJSONFromAsset(this.context, "vachanagalu.json"));
      JSONArray jSONArray = jSONObject.getJSONArray("vachanagalu");
      for (byte b = 1; b <= jSONArray.length(); b++) {
        StringBuilder stringBuilder2 = new StringBuilder();
        this();
        Log.d("execution", stringBuilder2.append("(i = 1; i <=m_jArryHeader.length(); i++)").append(b).toString());
        JSONObject jSONObject1 = jSONArray.getJSONObject(b - 1);
        stringBuilder2 = new StringBuilder();
        this();
        Log.d("execution", stringBuilder2.append("jo_inside").append(b).toString());
        String str = jSONObject1.getString("vachana");
        stringBuilder2 = new StringBuilder();
        this();
        Log.d("execution", stringBuilder2.append("jo_inside_vachana").append(b).toString());
        Vachanagalu vachanagalu = new Vachanagalu();
        this();
        StringBuilder stringBuilder5 = new StringBuilder();
        this();
        Log.d("execution", stringBuilder5.append("vachanagalu").append(b).toString());
        vachanagalu.setVachana(str);
        StringBuilder stringBuilder4 = new StringBuilder();
        this();
        Log.d("execution", stringBuilder4.append("setVachana").append(b).toString());
        TextDrawable textDrawable = TextDrawable.builder().buildRound(String.valueOf(b), this.generator.getRandomColor());
        stringBuilder5 = new StringBuilder();
        this();
        Log.d("execution", stringBuilder5.append("buildRound").append(b).toString());
        vachanagalu.setImage(textDrawable);
        StringBuilder stringBuilder3 = new StringBuilder();
        this();
        Log.d("execution", stringBuilder3.append("setImage").append(b).toString());
        vachanagaluList.add(vachanagalu);
        StringBuilder stringBuilder1 = new StringBuilder();
        this();
        Log.d("execution", stringBuilder1.append(" vachanagaluList.add(vachanagalu);").append(b).toString());
      } 
    } catch (JSONException jSONException) {
      jSONException.printStackTrace();
    } 
  }
}


/* Location:              C:\Users\dhruv\Desktop\decompile\dex-tools-2.1\classes-dex2jar.jar!\com\avrutti\sarvajnanavachanagalu\controllers\RecyclerViewController.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */