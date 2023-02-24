package com.sembozdemir.viewpagerarrowindicator.library;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.viewpager.widget.ViewPager;

public class ViewPagerArrowIndicator extends LinearLayout {
  private ImageView mLeftArrow;
  
  private ImageView mRightArrow;
  
  private ViewPager mViewPager;
  
  public ViewPagerArrowIndicator(Context paramContext) {
    super(paramContext);
    init(paramContext);
  }
  
  public ViewPagerArrowIndicator(Context paramContext, AttributeSet paramAttributeSet) {
    super(paramContext, paramAttributeSet);
    init(paramContext);
  }
  
  private void arrange() {
    setParams();
    View view = getChildAt(0);
    removeViewAt(0);
    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams)view.getLayoutParams();
    layoutParams.weight = 1.0F;
    view.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
    addView((View)this.mLeftArrow);
    addView(view);
    addView((View)this.mRightArrow);
    handleVisibility();
  }
  
  private void handleVisibility() {
    if (isFirstPage()) {
      this.mLeftArrow.setVisibility(View.INVISIBLE);
    } else {
      this.mLeftArrow.setVisibility(View.VISIBLE);
    } 
    if (isLastPage()) {
      this.mRightArrow.setVisibility(View.INVISIBLE);
      return;
    } 
    this.mRightArrow.setVisibility(View.VISIBLE);
  }
  
  private void init(Context paramContext) {
    setOrientation(LinearLayout.HORIZONTAL);
    this.mLeftArrow = new ImageView(paramContext);
    this.mRightArrow = new ImageView(paramContext);
    setArrowIndicatorRes(R.drawable.ic_arrow_left, R.drawable.ic_arrow_right);
  }
  
  private boolean isFirstPage() {
    return (this.mViewPager.getCurrentItem() == 0);
  }
  
  private boolean isLastPage() {
    return (this.mViewPager.getCurrentItem() == this.mViewPager.getAdapter().getCount() - 1);
  }
  
  private void setParams() {
    setGravity(16);
  }
  
  public void bind(ViewPager paramViewPager) {
    this.mViewPager = paramViewPager;
    this.mLeftArrow.setOnClickListener(new View.OnClickListener() {
          public void onClick(View param1View) {
            if (!ViewPagerArrowIndicator.this.isFirstPage())
              ViewPagerArrowIndicator.this.mViewPager.setCurrentItem(ViewPagerArrowIndicator.this.mViewPager.getCurrentItem() - 1, true); 
          }
        });
    this.mRightArrow.setOnClickListener(new View.OnClickListener() {
          public void onClick(View param1View) {
            if (!ViewPagerArrowIndicator.this.isLastPage())
              ViewPagerArrowIndicator.this.mViewPager.setCurrentItem(ViewPagerArrowIndicator.this.mViewPager.getCurrentItem() + 1, true); 
          }
        });
    this.mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
          public void onPageScrollStateChanged(int param1Int) {}
          
          public void onPageScrolled(int param1Int1, float param1Float, int param1Int2) {}
          
          public void onPageSelected(int param1Int) {
            ViewPagerArrowIndicator.this.handleVisibility();
          }
        });
    arrange();
  }
  
  public void setArrowIndicatorRes(int paramInt1, int paramInt2) {
    this.mLeftArrow.setImageResource(paramInt1);
    this.mRightArrow.setImageResource(paramInt2);
  }
}


/* Location:              C:\Users\dhruv\Desktop\decompile\dex-tools-2.1\classes-dex2jar.jar!\com\sembozdemir\viewpagerarrowindicator\library\ViewPagerArrowIndicator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */