package fr.iut2.androidtp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class HelloActivity extends AppCompatActivity {

    public static String PRENOM_KEY = "prenom_key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);
        String prenom = getIntent().getStringExtra(PRENOM_KEY);

        TextView prenom = findViewById(R.id.exercice4_hellonom);
        prenom.setText("Hello " + prenom + " !!!");
    }

    public void changer(View view){
        super.finish();
    }

    public void fin(View view){
        Intent intent = new Intent(this, MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }
}