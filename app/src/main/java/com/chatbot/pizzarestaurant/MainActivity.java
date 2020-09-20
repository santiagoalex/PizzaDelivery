package com.chatbot.pizzarestaurant;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {
    WebView myView;
    String html = "<iframe\n" +
           " allow=\"microphone;\"\n" +
           "    width=\"100%\"\n" +
           "    height=\"100%\"\n" +
           "    src=\"https://console.dialogflow.com/api-client/demo/embedded/a6f70ac5-d132-49af-9cdf-c9adbb9a7c3f\">\n" +
           "</iframe>";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myView = (WebView) findViewById(R.id.chatBot);
        final WebSettings ajustesVisorWeb = myView.getSettings();
        ajustesVisorWeb.setJavaScriptEnabled(true);
        myView.loadData(html, "text/html", null);







    }
}