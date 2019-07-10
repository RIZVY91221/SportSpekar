package com.example.sportspekar;

import android.media.MediaPlayer;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    private ImageButton imgBoxing,imgKickBoxing,imgJudo,imgKarate,imgAikido,imgteakwodo;
   // private MediaPlayer mPlayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgBoxing=(ImageButton)findViewById(R.id.imgBoxing);
        imgKickBoxing=(ImageButton)findViewById(R.id.imgKickBoxing);
        imgJudo=(ImageButton)findViewById(R.id.imgJudo);
        imgKarate=(ImageButton)findViewById(R.id.imgKarate);
        imgAikido=(ImageButton)findViewById(R.id.imgAikido);
        imgteakwodo=(ImageButton)findViewById(R.id.imgTeakwondo);

        imgBoxing.setOnClickListener(this);
        imgKickBoxing.setOnClickListener(this);
        imgJudo.setOnClickListener(this);
        imgKarate.setOnClickListener(this);
        imgAikido.setOnClickListener(this);
        imgteakwodo.setOnClickListener(this);
    }

    @Override
    public void onClick(View imageButtonClick)
    {
        switch(imageButtonClick.getId()){

            case R.id.imgBoxing:
                sportsSounds(imgBoxing.getTag().toString());
                break;
            case R.id.imgKickBoxing:
                sportsSounds(imgKickBoxing.getTag().toString());
                break;
            case R.id.imgJudo:
                sportsSounds(imgJudo.getTag().toString());
                break;
            case R.id.imgKarate:
                sportsSounds(imgKarate.getTag().toString());
                break;
            case R.id.imgAikido:
                sportsSounds(imgAikido.getTag().toString());
                break;
            case R.id.imgTeakwondo:
                sportsSounds(imgteakwodo.getTag().toString());
                break;
        }

    }
    private void sportsSounds(String sportName){
        MediaPlayer sportPlayer=MediaPlayer.create(this,getResources()
                .getIdentifier(sportName,"raw",getPackageName()));
        sportPlayer.start();
    }
}
