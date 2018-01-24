package com.example.csaba.restaurant1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.RadioGroup.OnCheckedChangeListener;

/**
 * Created by csaba on 1/21/2018.
 */

public class WhiteWine extends AppCompatActivity implements View.OnClickListener {


    private String drink;
    private RadioGroup radioGroup;
    private RadioButton radioButton;
    private String size;

    private TableLayout tl;
    private TableRow row;
    private int rowNumber;
    private int rowCounter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.white_wine);

        Button ww1 = (Button) findViewById(R.id.ww1);
        ww1.setOnClickListener(this); // calling onClick() method
        Button ww2 = (Button) findViewById(R.id.ww2);
        ww2.setOnClickListener(this);
        Button ww3 = (Button) findViewById(R.id.ww3);
        ww3.setOnClickListener(this);
        Button ww4 = (Button) findViewById(R.id.ww4);
        ww4.setOnClickListener(this);
        Button ww5 = (Button) findViewById(R.id.ww5);
        ww5.setOnClickListener(this);
        Button ww6 = (Button) findViewById(R.id.ww6);
        ww6.setOnClickListener(this);
        Button ww7 = (Button) findViewById(R.id.ww7);
        ww7.setOnClickListener(this);
        Button ww8 = (Button) findViewById(R.id.ww8);
        ww8.setOnClickListener(this);
        Button ww9 = (Button) findViewById(R.id.ww9);
        ww9.setOnClickListener(this);
        Button ww10 = (Button) findViewById(R.id.ww10);
        ww10.setOnClickListener(this);
        Button ww11 = (Button) findViewById(R.id.ww11);
        ww11.setOnClickListener(this);
        Button ww12 = (Button) findViewById(R.id.ww12);
        ww12.setOnClickListener(this);
        Button ww13 = (Button) findViewById(R.id.ww13);
        ww13.setOnClickListener(this);
        Button ww14 = (Button) findViewById(R.id.ww14);
        ww14.setOnClickListener(this);
        Button ww15 = (Button) findViewById(R.id.ww15);
        ww15.setOnClickListener(this);
        Button ww16 = (Button) findViewById(R.id.ww16);
        ww16.setOnClickListener(this);
        Button ww17 = (Button) findViewById(R.id.ww17);
        ww17.setOnClickListener(this);
        Button ww18 = (Button) findViewById(R.id.ww18);
        ww18.setOnClickListener(this);
        Button ww19 = (Button) findViewById(R.id.ww19);
        ww19.setOnClickListener(this);

        /**function buttons*/
        Button cancelLastWW = (Button) findViewById(R.id.cancelLastWW);
        cancelLastWW.setOnClickListener(this);
        Button cancelAllWW = (Button) findViewById(R.id.cancelAllWW);
        cancelAllWW.setOnClickListener(this);


        /**radio button check*/
        radioGroup = (RadioGroup) findViewById(R.id.size);
        radioGroup.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                //chechbox defines the size
                switch (checkedId) {
                    case R.id.bottle:
                        size = "1 bottle ";
                        break;
                    case R.id.setGlass:
                        size = "125ml ";
                        break;
                    case R.id.smallGlass:
                        size = "175ml ";
                        break;
                    case R.id.largeGlass:
                        size = "250ml ";
                        break;
                    case R.id.spitzer:
                        size = "spitzer ";
                        break;

                }
            }
        });

    }


    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.ww1:
                drink = "ww1";
                break;
            case R.id.ww2:
                drink = "ww2";
                break;
            case R.id.ww3:
                drink = "ww3";
                break;
            case R.id.ww4:
                drink = "ww4";
                break;
            case R.id.ww5:
                drink = "ww5";
                break;
            case R.id.ww6:
                drink = "ww6";
                break;
            case R.id.ww7:
                drink = "ww7";
                break;
            case R.id.ww8:
                drink = "ww8";
                break;
            case R.id.ww9:
                drink = "ww9";
                break;
            case R.id.ww10:
                drink = "ww10";
                break;
            case R.id.ww11:
                drink = "ww11";
                break;
            case R.id.ww12:
                drink = "ww12";
                break;
            case R.id.ww13:
                drink = "ww13";
                break;
            case R.id.ww14:
                drink = "ww14";
                break;
            case R.id.ww15:
                drink = "ww15";
                break;
            case R.id.ww16:
                drink = "ww16";
                break;
            case R.id.ww17:
                drink = "ww17";
                break;
            case R.id.ww18:
                drink = "ww18";
                break;
            case R.id.ww19:
                drink = "ww19";
                break;

            /**function buttons*/
            // case R.id.cancelLastWW:
            //      cancelLastItem();
            //      break;


        }

        addTableRow(size, drink);

        switch (v.getId()) {
            /**function buttons*/
            case R.id.cancelLastWW:
                cancelLastItem();
                break;
            case R.id.cancelAllWW:
                cancelAllItem();
                break;
        }
    }


    private void addTableRow(String size, String drink) {

        tl = (TableLayout) findViewById(R.id.orderListWW);
        row = new TableRow(this);

        row.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT, TableRow.LayoutParams.MATCH_PARENT));

        TextView tv = new TextView(this);
        tv.setWidth(400);
        tv.setText(size + drink);

        tv.setGravity(Gravity.LEFT);
        row.setGravity(Gravity.LEFT);

        rowCounter++;

        tl.addView(row);
        row.addView(tv);
    }

    private void cancelLastItem() {

        int childCount = tl.getChildCount();

        // Remove last row
        if (childCount > 0) {
            tl.removeViews(childCount, 1);
        }


    }

    private void cancelAllItem() {

        int childCount = tl.getChildCount();

        if (childCount > 0) {
            tl.removeAllViews();
        }
    }
}

