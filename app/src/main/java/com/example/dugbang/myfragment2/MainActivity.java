package com.example.dugbang.myfragment2;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    ListFregment fregment1;
    ViewerFregment fregment2;

    FragmentManager manager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        manager = getSupportFragmentManager();

        fregment1 = (ListFregment) manager.findFragmentById(R.id.listFragment);
        fregment2 = (ViewerFregment) manager.findFragmentById(R.id.viewerFragment);
    }

    public void onImageChange(int index) {
        fregment2.setImage(index);
    }
}
