package com.example.simpletodolist;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.TextView;

public class dolistitem extends androidx.appcompat.widget.AppCompatTextView{
    private Paint marginPaint;
    private Paint linePaint;
    private int paperColor;
    private float margin;


    public dolistitem(Context context) {
        super(context);
    }

    private void init() {

        Resources myResources = getResources();

        marginPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        marginPaint.setColor(myResources.getColor(R.color.notepad_text));
        linePaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        linePaint.setColor(myResources.getColor(R.color.purple_500));
        paperColor = myResources.getColor(R.color.white);
        margin = myResources.getDimension(R.dimen.material_emphasis_high_type);
    }

    @Override
    public void onDraw(Canvas canvas) {
        // Use the base TextView to render the text.
        canvas.drawColor(paperColor);

        //drawing lines
        canvas.drawLine(0, 0, 0, getMeasuredHeight(), linePaint);
        canvas.drawLine(0, getMeasuredHeight(), getMeasuredWidth(),
                getMeasuredHeight(), linePaint);
        //the margin line
        canvas.drawLine(margin, 0, margin, getMeasuredHeight(), marginPaint);

        canvas.save();
        canvas.translate(margin, 0);
        super.onDraw(canvas);
        canvas.restore();
    }
}
