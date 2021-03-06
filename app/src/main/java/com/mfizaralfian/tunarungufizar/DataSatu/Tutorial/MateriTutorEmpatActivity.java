package com.mfizaralfian.tunarungufizar.DataSatu.Tutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;

import com.mfizaralfian.tunarungufizar.R;

import ar.library.justify.JustifiedTextView;

public class MateriTutorEmpatActivity extends AppCompatActivity {
    private JustifiedTextView mJTv, mJTv2, mJTv3;
    ImageView kembali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi_tutor_empat);

        //-----------------------kembali----------------------------------
        kembali = findViewById(R.id.kembali);
        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        //---------------------------------------------------------

        mJTv3=(JustifiedTextView)findViewById(R.id.tiga);
        mJTv3.setText(getResources().getString(R.string.tutorial4));
        mJTv3.setTextSize(TypedValue.COMPLEX_UNIT_SP,16);
        mJTv3.setLineSpacing(15);
        mJTv3.setTypeFace(Typeface.createFromAsset(getAssets(),"fonts/salsa_regular.ttf"));
        mJTv3.setAlignment(Paint.Align.LEFT);

    }
}