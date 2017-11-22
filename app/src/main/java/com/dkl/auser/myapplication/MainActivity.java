package com.dkl.auser.myapplication;

import android.graphics.Color;
import android.graphics.Typeface;
import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.textservice.TextInfo;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    TextView[] tv = new TextView[3];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        setContentView(linearLayout);

        for (int i = 0; i < tv.length; i++) {
            tv[i] = new TextView(this);
//            tv[i].setText("編號=" + i);
            linearLayout.addView(tv[i]);

        }
        tv[0].setTextColor(Color.RED);
        tv[1].setTextColor(Color.CYAN);
        tv[2].setTextColor(Color.BLUE);

        tv[0].setBackgroundColor(Color.GRAY);
        tv[1].setBackgroundColor(Color.GREEN);
        tv[2].setBackgroundColor(Color.MAGENTA);

        tv[0].setTypeface(Typeface.create(Typeface.SERIF, Typeface.BOLD));
        tv[1].setTypeface(Typeface.create(Typeface.SERIF, Typeface.ITALIC));
        tv[2].setTypeface(Typeface.create(Typeface.SERIF, Typeface.NORMAL));

        tv[0].setText("牛排");
        tv[1].setText("屎");
        tv[2].setText("漢堡");
    }
}


