package com.example.RssReader;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import java.util.ArrayList;

public class RssReaderListActivity extends Activity {
    private Intent currentIntent;
    private String url;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initializeView();
        initializeApp();
    }

    private void initializeView() {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.rsslistview);
    }

    private void initializeApp() {
        this.currentIntent = getIntent();
        Bundle extras = this.currentIntent.getExtras();

        if (extras != null) {
            this.url = extras.getString("URL");
        }

        loadRss();
    }

    private void loadRss() {
        ArticleProvider provider = new MockArticleProvider();
        ArrayList<Article> articles = provider.getArticles();

    }
}