package com.mfizaralfian.tunarungufizar.Tutor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.mfizaralfian.tunarungufizar.DataSatu.TextSatuActivity;
import com.mfizaralfian.tunarungufizar.DataSatu.Tutorial.MateriTutorDuaActivity;
import com.mfizaralfian.tunarungufizar.DataSatu.Tutorial.MateriTutorEmpatActivity;
import com.mfizaralfian.tunarungufizar.DataSatu.Tutorial.MateriTutorEnamActivity;
import com.mfizaralfian.tunarungufizar.DataSatu.Tutorial.MateriTutorLimaActivity;
import com.mfizaralfian.tunarungufizar.DataSatu.Tutorial.MateriTutorSatuActivity;
import com.mfizaralfian.tunarungufizar.DataSatu.Tutorial.MateriTutorTigaActivity;
import com.mfizaralfian.tunarungufizar.R;

public class TutorSatuActivity extends AppCompatActivity {
    ImageView kembali;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutor_satu);


        //-----------------------kembali----------------------------------
        kembali = findViewById(R.id.kembali);
        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        //-----------------------musik----------------------------------
    }

    public void onClick1(View v) {
        Intent i = new Intent(this, MateriTutorSatuActivity.class);
        startActivity(i);  // Pindah Intent saat memencet CardView yang sudah diberi onClick bernama onClickTopMeny
    }
    public void onClick2(View v) {
        Intent i = new Intent(this, MateriTutorDuaActivity.class);
        startActivity(i);  // Pindah Intent saat memencet CardView yang sudah diberi onClick bernama onClickTopMeny
    }
    public void onClick3(View v) {
        Intent i = new Intent(this, MateriTutorTigaActivity.class);
        startActivity(i);  // Pindah Intent saat memencet CardView yang sudah diberi onClick bernama onClickTopMeny
    }
    public void onClick4(View v) {
        Intent i = new Intent(this, MateriTutorEmpatActivity.class);
        startActivity(i);  // Pindah Intent saat memencet CardView yang sudah diberi onClick bernama onClickTopMeny
    }

    public void onClick5(View v) {
        Intent i = new Intent(this, MateriTutorLimaActivity.class);
        startActivity(i);  // Pindah Intent saat memencet CardView yang sudah diberi onClick bernama onClickTopMeny
    }

    public void onClick6(View v) {
        Intent i = new Intent(this, MateriTutorEnamActivity.class);
        startActivity(i);  // Pindah Intent saat memencet CardView yang sudah diberi onClick bernama onClickTopMeny
    }

}