package com.banasiak.android.library.csrl;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v4.widget.SwipeRefreshLayout;
import android.util.AttributeSet;

public class ColoredSwipeRefreshLayout extends SwipeRefreshLayout {


    public ColoredSwipeRefreshLayout(Context context) {
        super(context);
    }

    public ColoredSwipeRefreshLayout(Context context, AttributeSet attrs) {
        super(context, attrs);

        TypedArray attributes = context.getTheme().obtainStyledAttributes(attrs, R.styleable.ColoredSwipeRefreshLayout, 0, 0);
        try {
            int id = attributes.getResourceId(R.styleable.ColoredSwipeRefreshLayout_animationColorArray, 0);
            if (id != 0) {
                int[] colors = getResources().getIntArray(id);
                setColorSchemeColors(colors);
            }
        } finally {
            attributes.recycle();
        }
    }
}