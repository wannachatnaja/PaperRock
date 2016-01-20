package kru.poompunk.wannachat.gamepaperrock;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

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

    } // main method

    private void bindWidget() {
        paperImageView = (ImageView) findViewById(R.id.imvPaper);
        scissorsImageView = (ImageView) findViewById(R.id.imvScissors);
        rockImageView = (ImageView) findViewById(R.id.imvRock);
        playImageView = (ImageView) findViewById(R.id.imvPlayer);
        androidImageView = (ImageView) findViewById(R.id.imvAndroid);
        showTextView = (TextView) findViewById(R.id.txtShow);
    }

}   // main class
