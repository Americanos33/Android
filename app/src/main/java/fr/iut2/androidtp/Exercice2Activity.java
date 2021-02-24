package fr.iut2.androidtp;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Exercice2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // On charge le XML pour créer l'arbre graphique
        setContentView(R.layout.activity_exercice2);
    }

    public void onExercice2_click(View view) {
        RadioGroup radioGroup = findViewById(R.id.radioGroup);
        TextView textefin = findViewById(R.id.exercice2_textefin);

        if (radioGroup.getCheckedRadioButtonId() == R.id.exercice2_radio1) {
            textefin.setText("Bravco vous avez la bonne réponse !");
        } else {
            textefin.setText("Mauvaise réponse, réessayez !");
        }
    }
}
