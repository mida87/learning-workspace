package com.example.HelloDroid;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class HelloDroidActivity extends Activity {

    private TextView message;
    private ImageView droidImg;
    private Button button;
    private View.OnClickListener droidTapListener;
    private View.OnClickListener btnClickListener;

    private int currentState;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.main);
        initializeApp();

        if (savedInstanceState != null) {
            this.currentState = savedInstanceState.getInt("currentState");
            updateView();
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putInt("currentState", this.currentState);
    }

    private void initializeApp() {
        this.message = (TextView) findViewById(R.id.message);
        this.droidImg = (ImageView) findViewById(R.id.droid);
        this.button = (Button) findViewById(R.id.button);

        this.droidTapListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                touchDroidImg();
            }
        };
        this.droidImg.setOnClickListener(droidTapListener);

        this.btnClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pressedBtn();
            }
        };
        this.button.setOnClickListener(btnClickListener);
    }

    private void touchDroidImg() {
        this.droidImg.setVisibility(View.INVISIBLE);
        this.message.setText(R.string.messageAfterTouch);
        this.button.setText(R.string.welcomeButtonAfterTouch);
        this.currentState = 1;
    }

    private void pressedBtn() {
        if (!this.droidImg.isShown()) {
            this.droidImg.setVisibility(View.VISIBLE);
            this.button.setText(R.string.welcomeButton);
            this.message.setText(R.string.message);
            this.currentState = 0;
        }
    }

    private void updateView() {
        if (this.currentState != 0) {
            this.droidImg.setVisibility(View.INVISIBLE);
            this.message.setText(R.string.messageAfterTouch);
            this.button.setText(R.string.welcomeButtonAfterTouch);
        }
    }
}
