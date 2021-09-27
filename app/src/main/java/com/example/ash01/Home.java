package com.example.ash01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import java.util.Locale;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void jumpToBrowser(View view) {
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://newtreat.co.in/"));
        startActivity(browserIntent);
    }

    public void jumpToMail(View view) {
        String mailto = "mailto:aswintherealone@gmail.com" +
                "cc=" +
                Uri.encode("shakthi.aswin@science.christuniversity.in") +
                "&subject=" + Uri.encode("Greetings from 5BSc") +
                "&body=" + Uri.encode("Good Morning !, This is a test email sent through the APP: ASH01");
        Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
        emailIntent.setData(Uri.parse(mailto));
        startActivity(emailIntent);
    }

    public void callThatRascal(View view) {
        String number = "9043151199";
        Uri call = Uri.parse("tel:" + number);
        Intent surf = new Intent(Intent.ACTION_DIAL, call);
        startActivity(surf);
    }

    public void takeMeThere(View view) {
        String uri = String.format(Locale.ENGLISH,
                "http://maps.google.com/maps?q=loc:%f,%f", 12.934657292844689,
                77.60601709693373);
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
        startActivity(mapIntent);
    }

    public void gotoLogin(View view) {

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}