package com.autosize.qiugu.autosizingtext;

import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.TypedValue;
import android.widget.TextView;

import static android.util.TypedValue.DENSITY_DEFAULT;

public class MainActivity extends AppCompatActivity {

    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.tv);
        //TextViewCompat.setAutoSizeTextTypeWithDefaults(tv,TextViewCompat.AUTO_SIZE_TEXT_TYPE_UNIFORM);

        TextViewCompat.setAutoSizeTextTypeUniformWithConfiguration(tv,
                10,
                (int)this.getResources().getDimension(R.dimen.item_40),
                1,
                TypedValue.COMPLEX_UNIT_PX);

    }
}
