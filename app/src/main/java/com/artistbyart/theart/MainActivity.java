package com.artistbyart.theart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void java(View view) {
        Toast.makeText(this, "Java", Toast.LENGTH_LONG).show();
//        Intent implicit = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.google.com"));
//        startActivity(implicit);

        Intent java = new Intent(MainActivity.this,Java.class);
        startActivity(java);
    }

    public void Python(View view) {
        Toast.makeText(this, "Python", Toast.LENGTH_LONG).show();
        Intent Python = new Intent(MainActivity.this,Python.class);
        startActivity(Python);

    }

    public void HTML(View view) {
        Toast.makeText(this, "HTML", Toast.LENGTH_LONG).show();

        Intent Html = new Intent(MainActivity.this,HTML.class);
        startActivity(Html);

    }

    public void JavaScript(View view) {
        Toast.makeText(this, "JavaScript", Toast.LENGTH_LONG).show();

        Intent JavaScript = new Intent(MainActivity.this,Java.class);
        startActivity(JavaScript);

    }

    public void CSS(View view) {
        Toast.makeText(this, "CSS", Toast.LENGTH_LONG).show();
        Intent CSS = new Intent(MainActivity.this,CSS.class);
        startActivity(CSS);
    }

    public void Salesforce(View view) {
        Toast.makeText(this, "Salesforce", Toast.LENGTH_LONG).show();

        Intent Salesforce = new Intent(MainActivity.this,Salesforce.class);
        startActivity(Salesforce);

    }

    public void Testing(View view) {
        Toast.makeText(this, "Testing", Toast.LENGTH_LONG).show();

        Intent Testing = new Intent(MainActivity.this,Testing.class);
        startActivity(Testing);

    }

    public void AboutUs(View view) {

        Intent java = new Intent(MainActivity.this,AboutUs.class);
        startActivity(java);
    }
}