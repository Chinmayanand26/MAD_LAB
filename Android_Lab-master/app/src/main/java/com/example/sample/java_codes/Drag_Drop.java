package com.example.sample.java_codes;
import com.example.sample.R;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipDescription;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.DragEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Drag_Drop extends AppCompatActivity implements View.OnLongClickListener, View.OnDragListener {
    TextView txt;
    LinearLayout lout;
    Button btn;
    ImageView imgv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drag_drop);
        txt = findViewById(R.id.textView8);
        txt.setTag("dragable textview");
        txt.setOnLongClickListener(this);
        btn = findViewById(R.id.button6);
        btn.setTag("dragable textview");
        btn.setOnLongClickListener(this);
        imgv = findViewById(R.id.imageView);
        imgv.setTag("dragable textview");
        imgv.setOnLongClickListener(this);
        lout = findViewById(R.id.lout);
        lout.setTag("dragable textview");
        lout.setOnDragListener(this);
    }

    @Override
    public boolean onLongClick(View view) {
        return false;
    }

    @Override
    public boolean onDrag(View view, DragEvent dragEvent) {
        int action = dragEvent.getAction();
        switch (action) {
            case DragEvent.ACTION_DRAG_STARTED:
                if (dragEvent.getClipDescription().hasMimeType(ClipDescription.MIMETYPE_TEXT_PLAIN)) {
                    return true;
                }
                return false;
            case DragEvent.ACTION_DRAG_ENTERED:
                view.getBackground().setColorFilter(Color.BLUE, PorterDuff.Mode.ADD);
                view.invalidate();
                return true;
            case DragEvent.ACTION_DRAG_LOCATION:

            default:
                break;
        }
        return true;
    }

}