package edu.wm.cs.cs301.amazebycharlescoleman.gui;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;

import android.content.Intent;
import android.widget.ProgressBar;

import android.os.Bundle;

import edu.wm.cs.cs301.amazebycharlescoleman.R;

public class GeneratingActivity extends AppCompatActivity {
    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_generating);
        Intent j = new Intent(getApplicationContext(), PlayManuallyActivity.class);
        startActivity(j);
        back = (Button) findViewById(R.id.back_button);
        back.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent i = new Intent(GeneratingActivity.this, AMazeActivity.class);
                startActivity(i);
            }
        });
    }
}
