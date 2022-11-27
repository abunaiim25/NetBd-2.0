package com.example.netbd.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

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
import com.example.netbd.Channels.Jamuna;
import com.example.netbd.Channels.Mohona;
import com.example.netbd.Channels.Mokka;
import com.example.netbd.Channels.MyTv;
import com.example.netbd.Channels.News24;
import com.example.netbd.Channels.RTVMusic;
import com.example.netbd.Channels.SATv;
import com.example.netbd.Channels.Somoy;
import com.example.netbd.Channels.Sonshod;
import com.example.netbd.R;
import com.example.netbd.TvActivity;


public class TvFragment extends Fragment {

    //TV
    private CardView channel_i, channel24, independent,etv,btv,boishakhi,atn,mokka,asintv,banglavision,rtvmusic;
    private CardView bijoytv,satv,mytv,mohona,dash,atnislamic,songsodtv,somoy,dbc,news24,aljajira;



    public TvFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tv,container,false);


        //TV
        channel_i= view.findViewById(R.id.channel_i);
        channel24= view.findViewById(R.id.channel24);
        independent= view.findViewById(R.id.independent);
        etv= view.findViewById(R.id.etv);
        btv= view.findViewById(R.id.btv);
        boishakhi= view.findViewById(R.id.boishakhi);
        atn= view.findViewById(R.id.atn);
        mokka= view.findViewById(R.id.mokka);
        bijoytv= view.findViewById(R.id.bijoytv);
        satv= view.findViewById(R.id.satv);
        mytv= view.findViewById(R.id.mytv);
        mohona= view.findViewById(R.id.mohona);
        dash= view.findViewById(R.id.dash);
        atnislamic= view.findViewById(R.id.atnislamic);
        songsodtv= view.findViewById(R.id.songsodtv);
        somoy= view.findViewById(R.id.somoy);
        dbc= view.findViewById(R.id.dbc);
        news24= view.findViewById(R.id.news24);
        aljajira= view.findViewById(R.id.aljajira);
        asintv= view.findViewById(R.id.asintv);
        banglavision= view.findViewById(R.id.banglavision);
        rtvmusic= view.findViewById(R.id.rtvmusic);


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

        dash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Desh.class);
                intent.putExtra("link","https://media.gtvlivebd.com/2020/12/desh-tv-live.html");
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

        etv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), ETV.class);
                intent.putExtra("link","https://www.ekushey-tv.com/etvlive/");
                startActivity(intent);
            }
        });


        return view;
    }
}