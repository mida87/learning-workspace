package com.example.RssReader;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class RssReaderActivity extends Activity {
    private Button connBnt;
    private View.OnClickListener connBtnListener;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initializeView();
        initializeApp();
    }

    private void initializeView() {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.main);
    }

    private void initializeApp() {
        this.connBnt = (Button) findViewById(R.id.connectButton);
        this.connBtnListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fetchFeeds();
            }
        };

        this.connBnt.setOnClickListener(this.connBtnListener);
    }

    private void fetchFeeds() {
        Intent intent = new Intent(this, RssReaderListActivity.class);
        intent.putExtra("URL", "http://www.sampleurl.com/feeds/");
        startActivity(intent);
    }
}
