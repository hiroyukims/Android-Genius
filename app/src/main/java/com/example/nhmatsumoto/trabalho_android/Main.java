package com.example.nhmatsumoto.trabalho_android;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;



public class Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

/*

*/
        //HomePage > Ranking
        Button btnGoToRankingPage = (Button) findViewById(R.id.btnRanking);
        btnGoToRankingPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ranking = new Intent(getBaseContext(), Ranking.class);
                startActivity(ranking);
            }
        });

        //HomePage > Game
        Button btnGoToGamePAge = (Button) findViewById(R.id.btnGame);
        btnGoToGamePAge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent game = new Intent(getBaseContext(), Game.class);
                startActivity(game);
            }
        });



        //Button = (Button) findViewById(R.id.btnRanking);
    }






    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.btnMenuAluno:
                Intent MenuAluno = new Intent(getBaseContext(), Aluno.class);
                startActivity(MenuAluno);
                return true;
            case R.id.btnMenuRanking:
                Intent MenuRanking = new Intent(getBaseContext(), Ranking.class);
                startActivity(MenuRanking);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }


}
