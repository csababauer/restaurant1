package com.example.csaba.restaurant1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


/**
 * Created by csaba on 1/21/2018.
 */

public class Table1Order extends AppCompatActivity {

    private Button buttonWhiteWine;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.table1order);

        buttonWhiteWine = (Button) findViewById(R.id.whitewine);

        buttonWhiteWine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button1Clicked();
            }
        });


    }

    /**onClick new page*/
    public void button1Clicked(){
        Intent white = new Intent(this, WhiteWine.class);
        startActivity(white);
    }

}