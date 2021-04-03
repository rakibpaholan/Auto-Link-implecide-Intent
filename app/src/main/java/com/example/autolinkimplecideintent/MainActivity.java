package com.example.autolinkimplecideintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button call_me,email_me,web_visit,map_see;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        call_me = (Button)findViewById(R.id.call_me_button);
        email_me = (Button)findViewById(R.id.email_me_id);
        web_visit = (Button)findViewById(R.id.web_site);
        map_see = (Button)findViewById(R.id.map_id);

        call_me.setOnClickListener(this);
        email_me.setOnClickListener(this);
        web_visit.setOnClickListener(this);
        map_see.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (id==R.id.call_me_button){
            Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("tel:+8801720608590"));
            startActivity(intent);
        }
        else if (id==R.id.email_me_id){
            Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("mailto:www.rakibpaholan9999@gmail.com?subject=calculator_feedback"));
            startActivity(intent);
        }
        else if (id==R.id.web_site){
            Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://stackoverflow.com/questions/3004515/sending-an-intent-to-browser-to-open-specific-url"));
        }
        else if (id==R.id.map_id){
            Intent intent = new Intent(Intent.ACTION_VIEW,Uri.parse("geo:23.76154259331758,90.43335235300539"));
            startActivity(intent);
        }
    }
}