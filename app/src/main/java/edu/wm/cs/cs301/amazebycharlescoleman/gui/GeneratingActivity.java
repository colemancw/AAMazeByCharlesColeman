package edu.wm.cs.cs301.amazebycharlescoleman.gui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.widget.ProgressBar;

import android.os.Bundle;

import edu.wm.cs.cs301.amazebycharlescoleman.R;

public class GeneratingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_generating);
        Intent j = new Intent(getApplicationContext(), GeneratingActivity.class);
        startActivity(j);
        }
    }
