package com.example.navidgaming.animashen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Person navid=new Person();
        Button button=(Button)findViewById(R.id.button);
        imageView=(ImageView)findViewById(R.id.imageView);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.i("Clicke","Clicked");
//                imageView.animate().alpha(1f).setDuration(5000);
//                imageView.animate().scaleX(0f).setDuration(10000);
//                imageView.animate().scaleY(.5f).setDuration(5000);
                imageView.animate().rotation(360f).setDuration(5000);
            }
        });
    }

    private class Person {
    }
}
