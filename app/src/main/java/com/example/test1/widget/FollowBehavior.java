package com.example.test1.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;


/**
 * @author: faith
 * @date: 2021/5/27 10:20
 * @description: 类描述
 * PS: 学如逆海乘舟，不进则退
 */
public class FollowBehavior extends CoordinatorLayout.Behavior<TextView> {


  public FollowBehavior(Context context, AttributeSet attributeSet){
       super(context,attributeSet);
  }


  @Override
  public boolean layoutDependsOn(@NonNull @org.jetbrains.annotations.NotNull CoordinatorLayout parent, @NonNull @org.jetbrains.annotations.NotNull TextView child, @NonNull @org.jetbrains.annotations.NotNull View dependency) {
    return super.layoutDependsOn(parent, child, dependency);
  }


}
