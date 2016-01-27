package kru.poompunk.wannachat.gamepaperrock;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    // Explicit ประกาศตัวแปร
    private ImageView scissorsImageView, rockImageView, paperImageView, playImageView, androidImageView;
    private TextView showTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // bind widget
        bindWidget();
        //paper controller
        paperController();
        //rock controller
        rockController();
        //scissors controller
        scissorsController();
    } // main method

    private void scissorsController() {
        scissorsImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeplay(1);
                myRandomPicture();
            }
        });
    }

    private void rockController() {
        rockImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeplay(2);
                myRandomPicture();
            }
        });
    }

    private void paperController() {

        paperImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeplay(3);
                myRandomPicture();
            }
        });

    }//paperController

    private void myRandomPicture() {
        int myRandom = 0;
        Random objRandom = new Random();
        myRandom = objRandom.nextInt(3) + 1;
        Log.d("Ran", "myRandom ==>" + myRandom);

        androidChange(myRandom);

    }// MRP

    private void androidChange(int myRandom) {
        int[] intSource = new int[4];
        intSource[0] = 0;
        intSource[1] = R.drawable.scissors2;
        intSource[2] = R.drawable.rock3;
        intSource[3] = R.drawable.paper1;

        androidImageView.setImageResource(intSource[myRandom]);
    } // androidchange

    private void changeplay(int intNumber) {

        Log.d("test", "ค่าที่รับได้ = " + intNumber);
        int intSound = R.raw.cow;

        switch (intNumber) {
            case 1:
                playImageView.setImageResource(R.drawable.scissors2);
                intSound = R.raw.scissors;
                break;
            case 2:
                playImageView.setImageResource(R.drawable.rock3);
                intSound = R.raw.rock;
                break;
            case 3:
                playImageView.setImageResource(R.drawable.paper1);
                intSound = R.raw.paper;
                break;
        }// switch
        MediaPlayer imageMediaPlayer = MediaPlayer.create(getBaseContext(), intSound);
        imageMediaPlayer.start();


    }// changplay

    private void bindWidget() {
        paperImageView = (ImageView) findViewById(R.id.imvPaper);
        scissorsImageView = (ImageView) findViewById(R.id.imvScissors);
        rockImageView = (ImageView) findViewById(R.id.imvRock);
        playImageView = (ImageView) findViewById(R.id.imvPlayer);
        androidImageView = (ImageView) findViewById(R.id.imvAndroid);
        showTextView = (TextView) findViewById(R.id.txtShow);
    }

}   // main class
