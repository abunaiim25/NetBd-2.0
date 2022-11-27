package com.example.netbd.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;


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
import com.example.netbd.Channels.Desh;
import com.example.netbd.Channels.ETV;
import com.example.netbd.Channels.Independent;
import com.example.netbd.Channels.Mohona;
import com.example.netbd.Channels.Mokka;
import com.example.netbd.Channels.MyTv;
import com.example.netbd.Channels.News24;
import com.example.netbd.Channels.RTVMusic;
import com.example.netbd.Channels.SATv;
import com.example.netbd.Channels.Somoy;
import com.example.netbd.Channels.Sonshod;
import com.example.netbd.NewsPaperActivity;
import com.example.netbd.NewsPaperWeb.Deshrupantor;
import com.example.netbd.NewsPaperWeb.Ittefaq;
import com.example.netbd.NewsPaperWeb.Jonokhonto;
import com.example.netbd.NewsPaperWeb.Jugantor;
import com.example.netbd.NewsPaperWeb.Kalerkantho;
import com.example.netbd.NewsPaperWeb.AmaderSomoy;
import com.example.netbd.NewsPaperWeb.Manobkhontho;
import com.example.netbd.NewsPaperWeb.Noyadigonto;
import com.example.netbd.NewsPaperWeb.Sangram;
import com.example.netbd.NewsPaperWeb.Somokal;
import com.example.netbd.NewsPaperWeb.Thedailystar;
import com.example.netbd.NewsPaperWeb.Vorercagog;
import com.example.netbd.R;
import com.example.netbd.TvActivity;
import com.example.netbd.Youtube.YoutubeLive;


public class HomeFragment extends Fragment {

    //TV
    private CardView channel_i, channel24, independent,etv,btv,boishakhi,atn,mokka,asintv,banglavision,rtvmusic;
    private CardView bijoytv,satv,mytv,mohona,dash,atnislamic,songsodtv,colorsbangla,somoy,jomuna,dbc,news24,aljajira,foxlife,bbc;

    //newspaper
    private CardView amadersomoy,kalerkantho,ittefaq,somokal,noyadigonto,jugantor,jonokhonto ;
    private CardView thedailystar,manobkhontho,deshrupantor,vorercagog,sangram;


    TextView viewAll_tv,viewAll_newsPaper;
    RelativeLayout live_sports;//live

    public HomeFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home,container,false);


        live_sports=view.findViewById(R.id.live_sports);
        viewAll_tv=view.findViewById(R.id.viewAll_tv);
        viewAll_newsPaper=view.findViewById(R.id.viewAll_newsPaper);

        //TV
        etv= view.findViewById(R.id.etv);
        channel_i=view.findViewById(R.id.channel_i);
        channel24=view.findViewById(R.id.channel24);
        independent=view.findViewById(R.id.independent);
        btv=view.findViewById(R.id.btv);
        boishakhi=view.findViewById(R.id.boishakhi);
        atn=view.findViewById(R.id.atn);
        mokka=view.findViewById(R.id.mokka);
        bijoytv=view.findViewById(R.id.bijoytv);
        satv=view.findViewById(R.id.satv);
        mytv=view.findViewById(R.id.mytv);
        mohona=view.findViewById(R.id.mohona);
        atnislamic=view.findViewById(R.id.atnislamic);
        songsodtv=view.findViewById(R.id.songsodtv);
        colorsbangla=view.findViewById(R.id.colorsbangla);
        somoy=view.findViewById(R.id.somoy);
        dbc=view.findViewById(R.id.dbc);
        news24=view.findViewById(R.id.news24);
        aljajira=view.findViewById(R.id.aljajira);
        asintv=view.findViewById(R.id.asintv);
        banglavision=view.findViewById(R.id.banglavision);
        rtvmusic=view.findViewById(R.id.rtvmusic);


        //newspaper
        amadersomoy=view.findViewById(R.id.amadersomoy);
        kalerkantho=view.findViewById(R.id.kalerkantho);
        ittefaq=view.findViewById(R.id.ittefaq);
        somokal=view.findViewById(R.id.somokal);
        noyadigonto=view.findViewById(R.id.noyadigonto);
        jugantor=view.findViewById(R.id.jugantor);
        jonokhonto=view.findViewById(R.id.jonokhonto);
        thedailystar=view.findViewById(R.id.thedailystar);
        manobkhontho=view.findViewById(R.id.manobkhontho);
        deshrupantor=view.findViewById(R.id.deshrupantor);
        vorercagog=view.findViewById(R.id.vorercagog);
        sangram=view.findViewById(R.id.sangram);




        live_sports.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), YoutubeLive.class);
                //intent.putExtra("link","https://toffeelive.com/#video/36a828a74c6b885ba29eab98e118168c33");
                startActivity(intent);
            }
        });


        viewAll_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), TvActivity.class);
                startActivity(intent);
            }
        });

        viewAll_newsPaper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), NewsPaperActivity.class);
                startActivity(intent);
            }
        });



        //tv
        etv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), ETV.class);
                intent.putExtra("link","https://www.ekushey-tv.com/etvlive/");
                startActivity(intent);
            }
        });

        channel_i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Channel_I.class);
                intent.putExtra("link","https://bongobd.com/channel/independent-tv");
                startActivity(intent);
            }
        });

        independent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Independent.class);
                intent.putExtra("link","https://bongobd.com/channel/independent-tv");
                startActivity(intent);
            }
        });

        channel24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Channel24.class);
                intent.putExtra("link","https://www.channel24bd.tv/live");
                startActivity(intent);
            }
        });


        etv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), ETV.class);
                intent.putExtra("link","https://www.ekushey-tv.com/etvlive/");
                startActivity(intent);
            }
        });

        btv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), BTV.class);
                intent.putExtra("link","https://live.btv.gov.bd/channel/BTV");
                startActivity(intent);
            }
        });

        boishakhi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Boishakhi.class);
                intent.putExtra("link","https://boishakhionline.com/live/");
                startActivity(intent);
            }
        });

        atn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getContext(), ATN.class);
                intent.putExtra("link","http://www.atnbangla.tv/live-atn-bangla/");
                startActivity(intent);
            }
        });

        mokka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Mokka.class);
                intent.putExtra("link","https://makkahlive.net/makkahlive.aspx");
                startActivity(intent);
            }
        });

        bijoytv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), BijoyTv.class);
                intent.putExtra("link","https://bijoy.tv/%E0%A6%B2%E0%A6%BE%E0%A6%87%E0%A6%AD-%E0%A6%9F%E0%A6%BF%E0%A6%AD%E0%A6%BF/");
                startActivity(intent);
            }
        });

        satv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), SATv.class);
                intent.putExtra("link","https://www.satv.tv/live/");
                startActivity(intent);
            }
        });

        mytv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), MyTv.class);
                intent.putExtra("link","https://mytvbd.tv/live/");
                startActivity(intent);
            }
        });

        mohona.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Mohona.class);
                intent.putExtra("link","https://mohona.tv/live-tv/");
                startActivity(intent);
            }
        });



        atnislamic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), ATVIslamic.class);
                intent.putExtra("link","http://atnislamic.tv/");
                startActivity(intent);
            }
        });

        songsodtv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Sonshod.class);
                intent.putExtra("link","https://live.btv.gov.bd/channel/Sangsad-Television");
                startActivity(intent);
            }
        });

        asintv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getContext(), AsianTv.class);
                intent.putExtra("link","https://www.asiantv.com.bd/");
                startActivity(intent);
            }
        });

        banglavision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), BanglaVision.class);
                intent.putExtra("link","https://www.bvnews24.com/live/");
                startActivity(intent);
            }
        });


        somoy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Somoy.class);
                intent.putExtra("link","https://www.somoynews.tv/tv");
                startActivity(intent);
            }
        });


        dbc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), DBC.class);
                intent.putExtra("link","https://dbcnews.tv/live");
                startActivity(intent);
            }
        });

        news24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), News24.class);
                intent.putExtra("link","https://www.news24bd.tv/live-tv");
                startActivity(intent);
            }
        });

        aljajira.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Aljazeera.class);
                intent.putExtra("link","https://www.aljazeera.com/live");
                startActivity(intent);
            }
        });


        amadersomoy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getContext(), AmaderSomoy.class);
                intent.putExtra("link","https://www.dainikamadershomoy.com/");
                startActivity(intent);
            }
        });

        kalerkantho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getContext(), Kalerkantho.class);
                intent.putExtra("link","https://www.kalerkantho.com/");
                startActivity(intent);
            }
        });

        ittefaq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getContext(), Ittefaq.class);
                intent.putExtra("link","https://www.ittefaq.com.bd/");
                startActivity(intent);
            }
        });


        somokal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getContext(), Somokal.class);
                intent.putExtra("link","https://samakal.com/");
                startActivity(intent);
            }
        });

        noyadigonto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getContext(), Noyadigonto.class);
                intent.putExtra("link","https://www.dailynayadiganta.com/");
                startActivity(intent);
            }
        });

        jugantor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getContext(), Jugantor.class);
                intent.putExtra("link","https://www.jugantor.com/");
                startActivity(intent);
            }
        });

        jonokhonto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getContext(), Jonokhonto.class);
                intent.putExtra("link","https://www.dailyjanakantha.com/");
                startActivity(intent);
            }
        });

        thedailystar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getContext(), Thedailystar.class);
                intent.putExtra("link","https://www.thedailystar.net/bangla/");
                startActivity(intent);
            }
        });

        manobkhontho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getContext(), Manobkhontho.class);
                intent.putExtra("link","https://mzamin.com/");
                startActivity(intent);
            }
        });

        deshrupantor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getContext(), Deshrupantor.class);
                intent.putExtra("link","https://www.deshrupantor.com/");
                startActivity(intent);
            }
        });

        vorercagog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getContext(), Vorercagog.class);
                intent.putExtra("link","https://www.bhorerkagoj.com/");
                startActivity(intent);
            }
        });

        sangram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getContext(), Sangram.class);
                intent.putExtra("link","https://dailysangram.com/");
                startActivity(intent);
            }
        });



        return view;
    }




    }
