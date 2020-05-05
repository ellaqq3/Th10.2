package com.example.th102;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    WebView web;
    EditText osoite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        web = findViewById(R.id.webView);
        web.setWebViewClient(new WebViewClient());
        web.getSettings().setJavaScriptEnabled(true);

    }

    public void getWWW(View v){
        osoite = findViewById(R.id.editText);
        web.loadUrl("http://" + osoite.getText().toString());
    }

    public void refresh(View v){
        web.reload();
    }
}
