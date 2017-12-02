package com.demo.sl.calendardemo;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.support.v7.widget.AppCompatTextView;

/**
 * Created by SUNLI on 2017/12/1.
 */
public class CalendarDayTextView extends AppCompatTextView {
    public boolean isToday = false;
    private Paint paint = new Paint();

    public CalendarDayTextView(Context context) {
        super(context);
    }

    public CalendarDayTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        initControl();
    }

    public CalendarDayTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initControl();
    }

    private void initControl() {
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.RED);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        if (isToday) {
            canvas.translate(getWidth() / 2, getHeight() / 2);
            canvas.drawCircle(0, 0, getWidth() / 2, paint);
        }
    }
}
