package com.example.mridwan.utspmobpro;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by MR on 25/10/16.
 */
public class WarungKopi extends AppCompatActivity {

    Intent tangkap;
    TextView judul , konten;
    ImageView gambar;
    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.halaman_s1);

        judul= (TextView)findViewById(R.id.txtJudul);
        konten= (TextView)findViewById(R.id.txtKonten);
        gambar= (ImageView)findViewById(R.id.imgGambar);
        tangkap = getIntent();


String alamat;

        String paramHasil = tangkap.getStringExtra("param");

        if (paramHasil.equals("0"))
        {
            judul.setText("Kopi Sumatera");
            konten.setText("Kopi ini lembut dan halus, agak asam dan beraroma kakao, tembakau dan tanah");

        }else  if (paramHasil.equals("1"))

        {
            judul.setText("Kopi Jawa");
            gambar.setImageResource(R.drawable.kopi);
           konten.setText("Kopi ini berasal dari Jawa");

        }else  if (paramHasil.equals("2"))
        {
            judul.setText("Kopi lanang");
            konten.setText("Kopi ini banyak di produksi di daerah jawa timur. kadar kafeinnya sangat tinggi");

        }else  if (paramHasil.equals("3"))
        {
            judul.setText("Kopi Kintamani");
            konten.setText("Kopi yang terasa lembut dan manis.");

        }else  if (paramHasil.equals("4"))
        {
            judul.setText("Kopi Toraja");
            konten.setText("Kopi yang memiliki kandungan asam rendah  memiliki rasa khas serupa, seperti rasa tanah dan hutan");

        }else  if (paramHasil.equals("5"))
        {
            judul.setText("Kopi Luwak");
            konten.setText("ou know me so well");

        }else  if (paramHasil.equals("6"))
        {
            judul.setText("Kopi Wamena");
            konten.setText("Merupakan kopi jenis arabika. aroma kopinya harum, halus, dan memiliki after taste yang sangat manis");

        }

    }
}
