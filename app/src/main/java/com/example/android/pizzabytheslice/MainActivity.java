package com.example.android.pizzabytheslice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView link;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        link = findViewById(R.id.specials_link);
        link.setMovementMethod(LinkMovementMethod.getInstance());

        link = findViewById(R.id.website_link);
        link.setMovementMethod(LinkMovementMethod.getInstance());

        link = findViewById(R.id.phone_link);
        link.setMovementMethod(LinkMovementMethod.getInstance());
    }

}
