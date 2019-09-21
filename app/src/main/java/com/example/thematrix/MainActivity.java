package com.example.thematrix;

import android.graphics.Color;
import android.graphics.ColorSpace;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    @BindView(R.id.btn_1) Button btn1;
    @BindView(R.id.btn_2) Button btn2;
    @BindView(R.id.btn_3) Button btn3;
    @BindView(R.id.btn_4) Button btn4;
    @BindView(R.id.btn_5) Button btn5;
    @BindView(R.id.btn_6) Button btn6;
    @BindView(R.id.btn_7) Button btn7;
    @BindView(R.id.btn_8) Button btn8;
    @BindView(R.id.btn_9) Button btn9;
    @BindView(R.id.btn_10) Button btn10;
    @BindView(R.id.btn_11) Button btn11;
    @BindView(R.id.btn_12) Button btn12;
    @BindView(R.id.btn_13) Button btn13;
    @BindView(R.id.btn_14) Button btn14;
    @BindView(R.id.btn_15) Button btn15;
    @BindView(R.id.btn_16) Button btn16;
    @BindView(R.id.btn_17) Button btn17;
    @BindView(R.id.btn_18) Button btn18;
    @BindView(R.id.btn_19) Button btn19;
    @BindView(R.id.btn_20) Button btn20;
    @BindView(R.id.btn_21) Button btn21;
    @BindView(R.id.btn_22) Button btn22;
    @BindView(R.id.btn_23) Button btn23;
    @BindView(R.id.btn_24) Button btn24;
    @BindView(R.id.btn_25) Button btn25;
    @BindView(R.id.btn_26) Button btn26;
    @BindView(R.id.btn_27) Button btn27;
    @BindView(R.id.btn_28) Button btn28;
    @BindView(R.id.btn_29) Button btn29;
    @BindView(R.id.btn_30) Button btn30;
    @BindView(R.id.btn_31) Button btn31;
    @BindView(R.id.btn_32) Button btn32;
    @BindView(R.id.btn_33) Button btn33;
    @BindView(R.id.btn_34) Button btn34;
    @BindView(R.id.btn_35) Button btn35;
    @BindView(R.id.btn_36) Button btn36;
    @BindView(R.id.btn_37) Button btn37;
    @BindView(R.id.btn_38) Button btn38;
    @BindView(R.id.btn_39) Button btn39;
    @BindView(R.id.btn_40) Button btn40;

    private final String NEW_TAG = "CURRENT BUTTON COLOR";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        initButtons();
    }

    private void initButtons() {
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btn10.setOnClickListener(this);
        btn11.setOnClickListener(this);
        btn12.setOnClickListener(this);
        btn13.setOnClickListener(this);
        btn14.setOnClickListener(this);
        btn15.setOnClickListener(this);
        btn16.setOnClickListener(this);
        btn17.setOnClickListener(this);
        btn18.setOnClickListener(this);
        btn19.setOnClickListener(this);
        btn20.setOnClickListener(this);
        btn21.setOnClickListener(this);
        btn22.setOnClickListener(this);
        btn23.setOnClickListener(this);
        btn24.setOnClickListener(this);
        btn25.setOnClickListener(this);
        btn26.setOnClickListener(this);
        btn27.setOnClickListener(this);
        btn28.setOnClickListener(this);
        btn29.setOnClickListener(this);
        btn30.setOnClickListener(this);
        btn31.setOnClickListener(this);
        btn32.setOnClickListener(this);
        btn33.setOnClickListener(this);
        btn34.setOnClickListener(this);
        btn35.setOnClickListener(this);
        btn36.setOnClickListener(this);
        btn37.setOnClickListener(this);
        btn38.setOnClickListener(this);
        btn39.setOnClickListener(this);
        btn40.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Button currentButton = (Button) view;

        String buttonColor = currentButton.getText().toString();

        Toast.makeText(this,  buttonColor, Toast.LENGTH_SHORT).show();
        Log.e(NEW_TAG, buttonColor);

    }
}
