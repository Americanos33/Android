package fr.iut2.androidtp;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import fr.iut2.androidtp.exercice3Data.Jeu;
import fr.iut2.androidtp.exercice3Data.Resultat;

public class Exercice3Activity extends AppCompatActivity {

    Resultat res = new Resultat();
    Jeu jeu;
    int choix;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // On charge le XML pour créer l'arbre graphique
        setContentView(R.layout.activity_exercice3);

        res.setNombreVictoire(1);
        res.setNombreDefaite(1);
        res.setNombreEgalite(1);
    }

    public void jouer(View view) {
        jeu = new Jeu();

        int nbegalites = res.getNombreEgalite();
        int nbvictoires = res.getNombreVictoire();
        int nbdefaites = res.getNombreDefaite();

        String textegal = "Nombre d'égalités : " + String.valueOf(nbegalites);
        String textevic = "Nombre de victoires : " + String.valueOf(nbvictoires);
        String textdef = "Nombre de défaites : " + String.valueOf(nbdefaites);

        TextView resultat = findViewById(R.id.exercice3_Resultat);
        TextView victoires = findViewById(R.id.exercice3_victoires);
        TextView defaites = findViewById(R.id.exercice3_defaites);
        TextView egalites = findViewById(R.id.exercice3_egalites);
        ImageView mainordi = findViewById(R.id.exercice3_mainOrdi);

        jeu.setMainJoueur(choix);

        if (jeu.egalite()){
            resultat.setText(R.string.exercice3_textEgalite);
            res.addEgalite();
            egalites.setText(textegal);
        } else if (jeu.joueurGagne()){
            resultat.setText(R.string.exercice3_textVictoire);
            res.addVictoire();
            victoires.setText(textevic);
        } else {
            resultat.setText(R.string.exercice3_textDefaite);
            res.addDefaite();
            defaites.setText(textdef);
        }

        if (jeu.getMainOrdinateur() == 0){
            mainordi.setImageResource(R.drawable.caillou);
        } else if (jeu.getMainOrdinateur() == 1){
            mainordi.setImageResource(R.drawable.ciseaux);
        } else if (jeu.getMainOrdinateur() == 2) {
            mainordi.setImageResource(R.drawable.papier);
        }
    }

    public void onExercice3_choix1(View view) {
        choix = 2;
        this.jouer(view);
    }

    public void onExercice3_choix2(View view) {
        choix = 0;
        this.jouer(view);
    }

    public void onExercice3_choix3(View view) {
        choix = 1;
        this.jouer(view);
    }

}
