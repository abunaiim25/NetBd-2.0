package com.example.netbd;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.netbd.Channels.ATN;
import com.example.netbd.Channels.ATVIslamic;
import com.example.netbd.Channels.Aljazeera;
import com.example.netbd.Channels.AsianTv;
import com.example.netbd.Channels.BTV;
import com.example.netbd.Channels.BanglaVision;
import com.example.netbd.Channels.BijoyTv;
import com.example.netbd.Channels.Boishakhi;
import com.example.netbd.Channels.Channel24;
import com.example.netbd.Channels.Channel_9;
import com.example.netbd.Channels.Channel_I;
import com.example.netbd.Channels.DBC;
import com.example.netbd.Channels.News24;
import com.example.netbd.Channels.RTVMusic;
import com.example.netbd.Channels.Desh;
import com.example.netbd.Channels.ETV;
import com.example.netbd.Channels.Independent;
import com.example.netbd.Channels.Mohona;
import com.example.netbd.Channels.Mokka;
import com.example.netbd.Channels.MyTv;
import com.example.netbd.Channels.SATv;
import com.example.netbd.Channels.Somoy;
import com.example.netbd.Channels.Sonshod;

public class TvActivity extends AppCompatActivity {

    //TV
    private CardView channel_i, channel24, independent, channel9,etv,btv,boishakhi,atn,mokka,asintv,banglavision,rtvmusic;
    private CardView bijoytv,satv,mytv,mohona,dash,atnislamic,songsodtv,somoy,dbc,news24,aljajira;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tv);

        //TV
        channel_i=findViewById(R.id.channel_i);
        channel24=findViewById(R.id.channel24);
        independent=findViewById(R.id.independent);
        channel9=findViewById(R.id.channel_9);
        etv=findViewById(R.id.etv);
        btv=findViewById(R.id.btv);
        boishakhi=findViewById(R.id.boishakhi);
        atn=findViewById(R.id.atn);
        mokka=findViewById(R.id.mokka);
        bijoytv=findViewById(R.id.bijoytv);
        satv=findViewById(R.id.satv);
        mytv=findViewById(R.id.mytv);
        mohona=findViewById(R.id.mohona);
        dash=findViewById(R.id.dash);
        atnislamic=findViewById(R.id.atnislamic);
        songsodtv=findViewById(R.id.songsodtv);
        somoy=findViewById(R.id.somoy);
        dbc=findViewById(R.id.dbc);
        news24=findViewById(R.id.news24);
        aljajira=findViewById(R.id.aljajira);
        asintv=findViewById(R.id.asintv);
        banglavision=findViewById(R.id.banglavision);
        rtvmusic=findViewById(R.id.rtvmusic);




        channel_i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TvActivity.this, Channel_I.class);
                intent.putExtra("link","https://bongobd.com/channel/independent-tv");
                startActivity(intent);
            }
        });

        independent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TvActivity.this, Independent.class);
                intent.putExtra("link","https://bongobd.com/channel/independent-tv");
                startActivity(intent);
            }
        });

        channel24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TvActivity.this, Channel24.class);
                intent.putExtra("link","https://www.channel24bd.tv/live");
                startActivity(intent);
            }
        });

        channel9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TvActivity.this, Channel_9.class);
                startActivity(intent);
            }
        });
        etv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TvActivity.this, ETV.class);
                intent.putExtra("link","https://www.ekushey-tv.com/etvlive/");
                startActivity(intent);
            }
        });


        btv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TvActivity.this, BTV.class);
                intent.putExtra("link","https://live.btv.gov.bd/channel/BTV");
                startActivity(intent);
            }
        });

        boishakhi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TvActivity.this, Boishakhi.class);
                intent.putExtra("link","https://boishakhionline.com/live/");
                startActivity(intent);
            }
        });

        atn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(TvActivity.this, ATN.class);
                intent.putExtra("link","http://www.atnbangla.tv/live-atn-bangla/");
                startActivity(intent);
            }
        });

        mokka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TvActivity.this, Mokka.class);
                intent.putExtra("link","https://makkahlive.net/makkahlive.aspx");
                startActivity(intent);
            }
        });

        bijoytv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TvActivity.this, BijoyTv.class);
                intent.putExtra("link","https://bijoy.tv/%E0%A6%B2%E0%A6%BE%E0%A6%87%E0%A6%AD-%E0%A6%9F%E0%A6%BF%E0%A6%AD%E0%A6%BF/");
                startActivity(intent);
            }
        });

        satv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TvActivity.this, SATv.class);
                intent.putExtra("link","https://www.satv.tv/live/");
                startActivity(intent);
            }
        });

        mytv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TvActivity.this, MyTv.class);
                intent.putExtra("link","https://mytvbd.tv/live/");
                startActivity(intent);
            }
        });

        mohona.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TvActivity.this, Mohona.class);
                intent.putExtra("link","https://mohona.tv/live-tv/");
                startActivity(intent);
            }
        });

        dash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TvActivity.this, Desh.class);
                intent.putExtra("link","https://media.gtvlivebd.com/2020/12/desh-tv-live.html");
                startActivity(intent);
            }
        });

        atnislamic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TvActivity.this, ATVIslamic.class);
                intent.putExtra("link","http://atnislamic.tv/");
                startActivity(intent);
            }
        });

        songsodtv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TvActivity.this, Sonshod.class);
                intent.putExtra("link","https://live.btv.gov.bd/channel/Sangsad-Television");
                startActivity(intent);
            }
        });

        asintv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(TvActivity.this, AsianTv.class);
                intent.putExtra("link","https://www.asiantv.com.bd/");
                startActivity(intent);
            }
        });

        banglavision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TvActivity.this, BanglaVision.class);
                 intent.putExtra("link","https://www.bvnews24.com/live/");
                startActivity(intent);
            }
        });

        rtvmusic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TvActivity.this, RTVMusic.class);
                startActivity(intent);
            }
        });

        somoy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TvActivity.this, Somoy.class);
                intent.putExtra("link","https://www.somoynews.tv/tv");
                startActivity(intent);
            }
        });


        dbc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TvActivity.this, DBC.class);
                intent.putExtra("link","https://dbcnews.tv/live");
                startActivity(intent);
            }
        });

        news24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TvActivity.this, News24.class);
                intent.putExtra("link","https://www.news24bd.tv/live-tv");
                startActivity(intent);
            }
        });

        aljajira.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TvActivity.this, Aljazeera.class);
                intent.putExtra("link","https://www.aljazeera.com/live");
                startActivity(intent);
            }
        });
    }
}