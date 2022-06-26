package edu.wm.cs.cs301.amazebycharlescoleman.gui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;

import edu.wm.cs.cs301.amazebycharlescoleman.R;

public class AMazeActivity extends AppCompatActivity {
    Button explore_button;
    Button revisit_button;
    Button roompick;
    TextView roompic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amaze);
        // set a change listener on the SeekBar
        SeekBar seekBar = findViewById(R.id.seekBar);
        seekBar.setOnSeekBarChangeListener(seekBarChangeListener);
        explore_button = (Button) findViewById(R.id.explore_button);
        revisit_button = (Button) findViewById(R.id.revisit_button);

        //roompick = (Button) findViewById(R.id.roompick);
        //roompic = (TextView)
        explore_button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent i = new Intent(AMazeActivity.this, GeneratingActivity.class);
                startActivity(i);
            }
        });


    }



    SeekBar.OnSeekBarChangeListener seekBarChangeListener = new SeekBar.OnSeekBarChangeListener() {

        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            // updated continuously as the user slides the thumb
        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {
            // called when the user first touches the SeekBar
        }

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {
            // called after the user finishes moving the SeekBar
        }
    };

}