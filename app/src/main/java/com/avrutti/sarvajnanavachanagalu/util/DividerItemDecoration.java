package com.avrutti.sarvajnanavachanagalu.util;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class DividerItemDecoration extends RecyclerView.ItemDecoration {
  private Drawable mDivider;
  
  private boolean mShowFirstDivider = false;
  
  private boolean mShowLastDivider = false;
  
  public DividerItemDecoration(Context paramContext, AttributeSet paramAttributeSet) {
    TypedArray typedArray = paramContext.obtainStyledAttributes(paramAttributeSet, new int[] { 16843284 });
    this.mDivider = typedArray.getDrawable(0);
    typedArray.recycle();
  }
  
  public DividerItemDecoration(Context paramContext, AttributeSet paramAttributeSet, boolean paramBoolean1, boolean paramBoolean2) {
    this(paramContext, paramAttributeSet);
    this.mShowFirstDivider = paramBoolean1;
    this.mShowLastDivider = paramBoolean2;
  }
  
  public DividerItemDecoration(Drawable paramDrawable) {
    this.mDivider = paramDrawable;
  }
  
  public DividerItemDecoration(Drawable paramDrawable, boolean paramBoolean1, boolean paramBoolean2) {
    this(paramDrawable);
    this.mShowFirstDivider = paramBoolean1;
    this.mShowLastDivider = paramBoolean2;
  }
  
  private int getOrientation(RecyclerView paramRecyclerView) {
    if (paramRecyclerView.getLayoutManager() instanceof LinearLayoutManager)
      return ((LinearLayoutManager)paramRecyclerView.getLayoutManager()).getOrientation();
    throw new IllegalStateException("DividerItemDecoration can only be used with a LinearLayoutManager.");
  }
  
  public void getItemOffsets(Rect paramRect, View paramView, RecyclerView paramRecyclerView, RecyclerView.State paramState) {
    super.getItemOffsets(paramRect, paramView, paramRecyclerView, paramState);
    if (this.mDivider != null && paramRecyclerView.getChildPosition(paramView) >= 1) {
      if (getOrientation(paramRecyclerView) == 1) {
        paramRect.top = this.mDivider.getIntrinsicHeight();
        return;
      } 
      paramRect.left = this.mDivider.getIntrinsicWidth();
    } 
  }
  
  public void onDrawOver(Canvas paramCanvas, RecyclerView paramRecyclerView, RecyclerView.State paramState) {
    int i2;
    byte b;
    if (this.mDivider == null) {
      super.onDrawOver(paramCanvas, paramRecyclerView, paramState);
      return;
    } 
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = getOrientation(paramRecyclerView);
    int i1 = paramRecyclerView.getChildCount();
    if (n == 1) {
      i2 = this.mDivider.getIntrinsicHeight();
      i = paramRecyclerView.getPaddingLeft();
      j = paramRecyclerView.getWidth() - paramRecyclerView.getPaddingRight();
    } else {
      i2 = this.mDivider.getIntrinsicWidth();
      k = paramRecyclerView.getPaddingTop();
      m = paramRecyclerView.getHeight() - paramRecyclerView.getPaddingBottom();
    } 
    if (this.mShowFirstDivider) {
      b = 0;
    } else {
      b = 1;
    } 
    while (b < i1) {
      View view = paramRecyclerView.getChildAt(b);
      RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams)view.getLayoutParams();
      if (n == 1) {
        k = view.getTop() - layoutParams.topMargin;
        m = k + i2;
      } else {
        i = view.getLeft() - layoutParams.leftMargin;
        j = i + i2;
      } 
      this.mDivider.setBounds(i, k, j, m);
      this.mDivider.draw(paramCanvas);
      b++;
    } 
    if (this.mShowLastDivider && i1 > 0) {
      View view = paramRecyclerView.getChildAt(i1 - 1);
      RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams)view.getLayoutParams();
      if (n == 1) {
        k = view.getBottom() + layoutParams.bottomMargin;
        m = k + i2;
      } else {
        i = view.getRight() + layoutParams.rightMargin;
        j = i + i2;
      } 
      this.mDivider.setBounds(i, k, j, m);
      this.mDivider.draw(paramCanvas);
    } 
  }
}


/* Location:              C:\Users\dhruv\Desktop\decompile\dex-tools-2.1\classes-dex2jar.jar!\com\avrutti\sarvajnanavachanagal\\util\DividerItemDecoration.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */