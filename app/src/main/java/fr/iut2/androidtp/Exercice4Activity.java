package fr.iut2.androidtp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Exercice4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // On charge le XML pour créer l'arbre graphique
        setContentView(R.layout.activity_exercice4);
    }

    public void helloActivity(View view){
        EditText nom = findViewById(R.id.exercice4_nom);
        String prenom = nom.getText().toString() ;
        Intent intent = new Intent(this, HelloActivity.class);
        intent.putExtra(HelloActivity.PRENOM_KEY, prenom);
        startActivity(intent);

    }
}
