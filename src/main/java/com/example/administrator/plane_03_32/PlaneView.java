package com.example.administrator.plane_03_32;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

/**
 * Created by Administrator on 2016/1/12.
 */
public class PlaneView extends View {
    public float currentX;
    public float currentY;
    Bitmap plane;
    //Constructor
    public PlaneView(Context context) {
        super(context);
        plane = BitmapFactory.decodeResource(context.getResources(),R.mipmap.plane);
        setFocusable(true);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint p = new Paint();
        canvas.drawBitmap(plane,currentX,currentY,p);

    }


}
