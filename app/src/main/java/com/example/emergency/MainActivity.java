package com.example.emergency;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
private String policeNo="122";
    private String fireNo="180";
    private String ambulanceNo="123";
    private String childNo="16000";
    private String consumerNo="19588";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void doFire(View view) {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:"+fireNo));
        startActivity(intent);
    }

    public void doPolice(View view) {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:"+policeNo));
        startActivity(intent);
    }

    public void doChild(View view) {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:"+childNo));
        startActivity(intent);
    }

    public void doHealth(View view) {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:"+ambulanceNo));
        startActivity(intent);
    }

    public void doConsumer(View view) {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:"+consumerNo));
        startActivity(intent);
    }

}