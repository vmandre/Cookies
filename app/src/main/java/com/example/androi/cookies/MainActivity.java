package com.example.androi.cookies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void eat(View view) {
        ImageView cookieImage = (ImageView) findViewById(R.id.android_cookie_image_view);
        TextView status = (TextView) findViewById(R.id.status_text_view);

        status.setText("I'm so full");
        cookieImage.setImageResource(R.drawable.after_cookie);

        Log.i("PASSOU POR AQUI", "PASSOU POR AQUI");
    }
}
