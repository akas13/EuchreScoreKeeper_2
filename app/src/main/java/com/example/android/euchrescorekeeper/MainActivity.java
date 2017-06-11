package com.example.android.euchrescorekeeper;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public int numberH=0;
    public int numberS=0;

    private void display_heart_score(int numberH) {
        if (numberH<10){
            TextView quantityTextView = (TextView) findViewById(R.id.hearts_score);
            quantityTextView.setText("" + numberH);
        }

        else if (numberH>=10){
            TextView quantityTextView = (TextView) findViewById(R.id.hearts_score);
            quantityTextView.setText("Winner" + numberH);

            boolean activeHButtons=false;
            hideButtons(activeHButtons);

            Context context = getApplicationContext();
            CharSequence text = "Team Hearts has won, please reset game";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }
    }

    public void addoneH (View view){
        ++numberH;
        display_heart_score(numberH);
    }

    public void addtwoH (View view){
        numberH=numberH+2;
        display_heart_score(numberH);
    }

    public void addfiveH (View view){
        numberH=numberH+5;
        display_heart_score(numberH);
    }

    public void hideButtons (Boolean setButton){
        Button addoneH=(Button)findViewById(R.id.addoneH);
        addoneH.setEnabled(setButton);

        Button addtwoH=(Button)findViewById(R.id.addtwoH);
        addtwoH.setEnabled(setButton);

        Button addfiveH=(Button)findViewById(R.id.addfiveH);
        addfiveH.setEnabled(setButton);

        Button addoneS=(Button)findViewById(R.id.addoneS);
        addoneS.setEnabled(setButton);

        Button addtwoS=(Button)findViewById(R.id.addtwoS);
        addtwoS.setEnabled(setButton);

        Button addfiveS=(Button)findViewById(R.id.addfiveS);
        addfiveS.setEnabled(setButton);
    }

    private void display_spades_score(int numberS) {
        if (numberS<10){
            TextView quantityTextView = (TextView) findViewById(R.id.spades_score);
            quantityTextView.setText("" + numberS);
        }
        else if (numberS>=10){
            TextView quantityTextView = (TextView) findViewById(R.id.spades_score);
            quantityTextView.setText("Winner" + numberS);

            boolean activeSButtons=false;
            hideButtons(activeSButtons);

            Context context = getApplicationContext();
            CharSequence text = "Team Spades has won, please reset game";
            int duration = Toast.LENGTH_SHORT;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }
    }

    public void addoneS (View view){
        ++numberS;
        display_spades_score(numberS);
    }

    public void addtwoS (View view){
        numberS=numberS+2;
        display_spades_score(numberS);
    }

    public void addfiveS (View view){
        numberS=numberS+5;
        display_spades_score(numberS);
    }

    public void reset (View view){
        numberS=0;
        display_spades_score(numberS);

        numberH=0;
        display_heart_score(numberH);

        boolean activeAllButtons=true;
        hideButtons(activeAllButtons);
    }

}
