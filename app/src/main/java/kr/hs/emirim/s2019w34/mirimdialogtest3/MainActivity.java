package kr.hs.emirim.s2019w34.mirimdialogtest3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    RadioButton radioPuppy, radioMountain, radioHowl, radioFlower;
    Button btnPicture;
    ImageView puppy, mountain, howl, flower;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioPuppy = findViewById(R.id.radio_puppy);
        radioMountain = findViewById(R.id.radio_mountain);
        radioHowl = findViewById(R.id.radio_howl);
        radioFlower = findViewById(R.id.radio_flower);
        btnPicture = findViewById(R.id.btn_picture);
        puppy = findViewById(R.id.puppy);
        mountain = findViewById(R.id.mountain);
        howl = findViewById(R.id.howl);
        flower = findViewById(R.id.flower);


        radioPuppy.setOnClickListener(radioListener);
        radioMountain.setOnClickListener(radioListener);
        radioHowl.setOnClickListener(radioListener);
        radioFlower.setOnClickListener(radioListener);
        btnPicture.setOnClickListener(btnListener);
    }

    View.OnClickListener radioListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.radio_puppy:
                    puppy.setImageResource(R.drawable.puppy);
                case R.id.radio_mountain:
                    mountain.setImageResource(R.drawable.mountain);
                case R.id.radio_howl:
                    howl.setImageResource(R.drawable.howl);
                case R.id.radio_flower:
                    flower.setImageResource(R.drawable.flower);
            }
        }
    };

    View.OnClickListener btnListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

        }
    };
}