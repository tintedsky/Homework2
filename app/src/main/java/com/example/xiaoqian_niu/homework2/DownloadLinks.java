package com.example.xiaoqian_niu.homework2;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class DownloadLinks extends AppCompatActivity {

    EditText editText1, editText2, editText3, editText4, editText5, editText6;
    String link;
    SharedPreferences sharedPref;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_download_links);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        editText1 = (EditText)findViewById(R.id.urlEdit1);
        editText2 = (EditText)findViewById(R.id.urlEdit2);
        editText3 = (EditText)findViewById(R.id.urlEdit3);
        editText4 = (EditText)findViewById(R.id.urlEdit4);
        editText5 = (EditText)findViewById(R.id.urlEdit5);
        editText6 = (EditText)findViewById(R.id.urlEdit6);
        sharedPref = getSharedPreferences("downloadLinksInfo", Context.MODE_PRIVATE);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    public void saveAndReturn(View view){
        SharedPreferences.Editor editor = sharedPref.edit();
        int nLinks = 0;

        link = editText1.getText().toString();
        if(!link.isEmpty()){
            editor.putString("Link1", link);
            nLinks++;
        }

        link = editText2.getText().toString();
        if(!link.isEmpty()){
            editor.putString("Link2", link);
            nLinks++;
        }

        link = editText3.getText().toString();
        if(!link.isEmpty()){
            editor.putString("Link3", link);
            nLinks++;
        }

        link = editText4.getText().toString();
        if(!link.isEmpty()){
            editor.putString("Link4", link);
            nLinks++;
        }

        link = editText5.getText().toString();
        if(!link.isEmpty()){
            editor.putString("Link5", link);
            nLinks++;
        }

        link = editText6.getText().toString();
        if(!link.isEmpty()){
            editor.putString("Link6", link);
            nLinks++;
        }

        Button btDownload = (Button)findViewById(R.id.btDownload);
        if(nLinks==6){
            btDownload.setEnabled(true);
        }else{
            btDownload.setEnabled(false);
        }
    }
}
