package com.tout.tout.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.tout.tout.R;

public class AllDataActivity extends AppCompatActivity {
    private final String WORD = "word";
    private final String DEF = "def";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_data);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        String actorBio = (String) bundle.getString(WORD);
        String actorName = (String) bundle.getString(DEF);
        TextView all = findViewById(R.id.alldataname);
        TextView def = findViewById(R.id.definition);
        all.setText(actorBio);
        def.setText(actorName);
    }
}
