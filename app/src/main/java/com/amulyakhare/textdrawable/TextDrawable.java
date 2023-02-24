package com.amulyakhare.textdrawable;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PixelFormat;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.graphics.drawable.shapes.RectShape;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;

public class TextDrawable extends ShapeDrawable {
  private static final float SHADE_FACTOR = 0.9F;
  
  private final Paint borderPaint;
  
  private final int borderThickness;
  
  private final int color;
  
  private final int fontSize;
  
  private final int height;
  
  private final float radius;
  
  private final RectShape shape;
  
  private final String text;
  
  private final Paint textPaint;
  
  private final int width;
  
  private TextDrawable(Builder paramBuilder) {
    super((Shape)paramBuilder.shape);
    String str;
    this.shape = paramBuilder.shape;
    this.height = paramBuilder.height;
    this.width = paramBuilder.width;
    this.radius = paramBuilder.radius;
    if (paramBuilder.toUpperCase) {
      str = paramBuilder.text.toUpperCase();
    } else {
      str = paramBuilder.text;
    } 
    this.text = str;
    this.color = paramBuilder.color;
    this.fontSize = paramBuilder.fontSize;
    this.textPaint = new Paint();
    this.textPaint.setColor(paramBuilder.textColor);
    this.textPaint.setAntiAlias(true);
    this.textPaint.setFakeBoldText(paramBuilder.isBold);
    this.textPaint.setStyle(Paint.Style.FILL);
    this.textPaint.setTypeface(paramBuilder.font);
    this.textPaint.setTextAlign(Paint.Align.CENTER);
    this.textPaint.setStrokeWidth(paramBuilder.borderThickness);
    this.borderThickness = paramBuilder.borderThickness;
    this.borderPaint = new Paint();
    this.borderPaint.setColor(getDarkerShade(this.color));
    this.borderPaint.setStyle(Paint.Style.STROKE);
    this.borderPaint.setStrokeWidth(this.borderThickness);
    getPaint().setColor(this.color);
  }
  
  public static IShapeBuilder builder() {
    return new Builder();
  }
  
  private void drawBorder(Canvas paramCanvas) {
    RectF rectF = new RectF(getBounds());
    rectF.inset((this.borderThickness / 2), (this.borderThickness / 2));
    if (this.shape instanceof OvalShape) {
      paramCanvas.drawOval(rectF, this.borderPaint);
      return;
    } 
    if (this.shape instanceof RoundRectShape) {
      paramCanvas.drawRoundRect(rectF, this.radius, this.radius, this.borderPaint);
      return;
    } 
    paramCanvas.drawRect(rectF, this.borderPaint);
  }
  
  private int getDarkerShade(int paramInt) {
    return Color.rgb((int)(Color.red(paramInt) * 0.9F), (int)(Color.green(paramInt) * 0.9F), (int)(Color.blue(paramInt) * 0.9F));
  }
  
  public void draw(Canvas paramCanvas) {
    int j;
    int k;
    int m;
    super.draw(paramCanvas);
    Rect rect = getBounds();
    if (this.borderThickness > 0)
      drawBorder(paramCanvas); 
    int i = paramCanvas.save();
    paramCanvas.translate(rect.left, rect.top);
    if (this.width < 0) {
      j = rect.width();
    } else {
      j = this.width;
    } 
    if (this.height < 0) {
      k = rect.height();
    } else {
      k = this.height;
    } 
    if (this.fontSize < 0) {
      m = Math.min(j, k) / 2;
    } else {
      m = this.fontSize;
    } 
    this.textPaint.setTextSize(m);
    paramCanvas.drawText(this.text, (j / 2), (k / 2) - (this.textPaint.descent() + this.textPaint.ascent()) / 2.0F, this.textPaint);
    paramCanvas.restoreToCount(i);
  }
  
  public int getIntrinsicHeight() {
    return this.height;
  }
  
  public int getIntrinsicWidth() {
    return this.width;
  }
  
  public int getOpacity() {
    return PixelFormat.UNKNOWN;
  }
  
  public void setAlpha(int paramInt) {
    this.textPaint.setAlpha(paramInt);
  }
  
  public void setColorFilter(ColorFilter paramColorFilter) {
    this.textPaint.setColorFilter(paramColorFilter);
  }
  
  public static class Builder implements IConfigBuilder, IShapeBuilder, IBuilder {
    private int borderThickness = 0;
    
    private int color = -7829368;
    
    private Typeface font = Typeface.create("sans-serif-light", Typeface.NORMAL);
    
    private int fontSize = -1;
    
    private int height = -1;
    
    private boolean isBold = false;
    
    public float radius;
    
    private RectShape shape = new RectShape();
    
    private String text = "";
    
    public int textColor = -1;
    
    private boolean toUpperCase = false;
    
    private int width = -1;
    
    private Builder() {}
    
    public TextDrawable.IConfigBuilder beginConfig() {
      return this;
    }
    
    public TextDrawable.IConfigBuilder bold() {
      this.isBold = true;
      return this;
    }
    
    public TextDrawable build(String param1String, int param1Int) {
      this.color = param1Int;
      this.text = param1String;
      return new TextDrawable(this);
    }
    
    public TextDrawable buildRect(String param1String, int param1Int) {
      rect();
      return build(param1String, param1Int);
    }
    
    public TextDrawable buildRound(String param1String, int param1Int) {
      round();
      return build(param1String, param1Int);
    }
    
    public TextDrawable buildRoundRect(String param1String, int param1Int1, int param1Int2) {
      roundRect(param1Int2);
      return build(param1String, param1Int1);
    }
    
    public TextDrawable.IShapeBuilder endConfig() {
      return this;
    }
    
    public TextDrawable.IConfigBuilder fontSize(int param1Int) {
      this.fontSize = param1Int;
      return this;
    }
    
    public TextDrawable.IConfigBuilder height(int param1Int) {
      this.height = param1Int;
      return this;
    }
    
    public TextDrawable.IBuilder rect() {
      this.shape = new RectShape();
      return this;
    }
    
    public TextDrawable.IBuilder round() {
      this.shape = (RectShape)new OvalShape();
      return this;
    }
    
    public TextDrawable.IBuilder roundRect(int param1Int) {
      this.radius = param1Int;
      this.shape = (RectShape)new RoundRectShape(new float[] { param1Int, param1Int, param1Int, param1Int, param1Int, param1Int, param1Int, param1Int }, null, null);
      return this;
    }
    
    public TextDrawable.IConfigBuilder textColor(int param1Int) {
      this.textColor = param1Int;
      return this;
    }
    
    public TextDrawable.IConfigBuilder toUpperCase() {
      this.toUpperCase = true;
      return this;
    }
    
    public TextDrawable.IConfigBuilder useFont(Typeface param1Typeface) {
      this.font = param1Typeface;
      return this;
    }
    
    public TextDrawable.IConfigBuilder width(int param1Int) {
      this.width = param1Int;
      return this;
    }
    
    public TextDrawable.IConfigBuilder withBorder(int param1Int) {
      this.borderThickness = param1Int;
      return this;
    }
  }
  
  public static interface IBuilder {
    TextDrawable build(String param1String, int param1Int);
  }
  
  public static interface IConfigBuilder {
    IConfigBuilder bold();
    
    TextDrawable.IShapeBuilder endConfig();
    
    IConfigBuilder fontSize(int param1Int);
    
    IConfigBuilder height(int param1Int);
    
    IConfigBuilder textColor(int param1Int);
    
    IConfigBuilder toUpperCase();
    
    IConfigBuilder useFont(Typeface param1Typeface);
    
    IConfigBuilder width(int param1Int);
    
    IConfigBuilder withBorder(int param1Int);
  }
  
  public static interface IShapeBuilder {
    TextDrawable.IConfigBuilder beginConfig();
    
    TextDrawable buildRect(String param1String, int param1Int);
    
    TextDrawable buildRound(String param1String, int param1Int);
    
    TextDrawable buildRoundRect(String param1String, int param1Int1, int param1Int2);
    
    TextDrawable.IBuilder rect();
    
    TextDrawable.IBuilder round();
    
    TextDrawable.IBuilder roundRect(int param1Int);
  }
}


/* Location:              C:\Users\dhruv\Desktop\decompile\dex-tools-2.1\classes-dex2jar.jar!\com\amulyakhare\textdrawable\TextDrawable.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */