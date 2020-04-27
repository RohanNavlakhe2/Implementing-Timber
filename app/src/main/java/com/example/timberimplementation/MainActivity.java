package com.example.timberimplementation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import timber.log.Timber;
//First add the dependency
    //implementation 'com.jakewharton.timber:timber:4.7.1'
//Now paste MainApplication.java to your project
//add name attribute to application tag in manifest file and its value will be MainApplication
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //log with default tag (default tag will be class name in this case-> MainActivity)
        Timber.i("Info Message");
        Timber.d("debug Message");

        //log with custom tag
        Timber.tag("info tag").i("info message with tag");
        Timber.tag("debug tag").i("debug message with tag");


    }
}
