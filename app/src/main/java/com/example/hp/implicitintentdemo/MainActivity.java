package com.example.hp.implicitintentdemo;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button btnShowWeb,btnCall;
    private EditText edtMob;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnShowWeb= (Button) findViewById(R.id.btnlogin);
        btnCall= (Button) findViewById(R.id.call);
        edtMob= (EditText) findViewById(R.id.edtmob);

        btnShowWeb.setOnClickListener (this);
        btnCall.setOnClickListener(this);

    }
    public void onClick(View view)
    {
        switch(view.getId())
        {

            case R.id.btnlogin:
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
                startActivity(intent);
                break;

            case R.id.call:
                String mob=edtMob.getText().toString();
                Intent intent1=new Intent (Intent.ACTION_CALL,Uri.parse("tel:"+mob));
                startActivity(intent1);
                break;
        }
    }
}
