package fr.iut2.androidtp;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class Exercice1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // On charge le XML pour créer l'arbre graphique
        setContentView(R.layout.activity_exercice1);

        // Gestionnaire d'agencement
        //LinearLayout linearLayout = new LinearLayout(this);
        //linearLayout.setOrientation((LinearLayout.VERTICAL));

        // Premier champ de texte
        //TextView text1 = new TextView(this);
        //String str1 = "Ecire votre prénom et valider";
        //text1.setText(str1);
        //linearLayout.addView(text1);

        // Prenom utilisateur
        //EditText prenom = new EditText(this);
        //String str2 = "prénom";
        //prenom.setText(str2);
        //linearLayout.addView(prenom);

        // Boutton valider
        //Button valider = new Button(this);
        //String str3 = "VALIDER";
        //valider.setText((str3));
        //linearLayout.addView(valider);

        //Deuxieme champ de texte
        //TextView text2 = new TextView(this);
        //String str4 = "Hello World !";
        //text2.setText(str4);
        //linearLayout.addView(text2);

    }

    public void exercice1Valider(View view){
        // Recuperation du prenom
        EditText prenomView =  findViewById(R.id.exercice1_prenom);

        // Abonement du bouton
        TextView helloView = findViewById(R.id.exercice1_hello);

        if(!TextUtils.isEmpty(prenomView.getText())) {
            helloView.setText("Hello " + prenomView.getText() + " !");
        }

    }
}
