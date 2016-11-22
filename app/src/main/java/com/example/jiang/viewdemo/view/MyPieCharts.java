package com.example.jiang.viewdemo.view;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;

import com.github.mikephil.charting.charts.PieChart;

/**
 * Created by fangyi on 16/11/22.
 */

public class MyPieCharts extends PieChart {

    public MyPieCharts(Context context) {
        super(context);
    }

    public MyPieCharts(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyPieCharts(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }
}
