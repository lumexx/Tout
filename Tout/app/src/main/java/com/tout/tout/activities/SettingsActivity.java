package com.tout.tout.activities;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import com.tout.tout.R;

public class SettingsActivity extends AppCompatActivity{

    Button changeLang;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
// final CharSequence[] items = {"один","два","три"};
// setContentView(R.layout.activity_app_lang);
// Button changeLang = (Button) findViewById(R.id.changeLang);
// changeLang.setOnClickListener(new View.OnClickListener() {
// @Override
// public void onClick(View view) {
// AlertDialog.Builder builder = new AlertDialog.Builder(getApplicationContext());
// builder.setTitle(R.string.choose_language);
// //.setSingleChoiceItems(items, 0, null);
// AlertDialog alertDialog = builder.create();
// alertDialog.show();
// }
// });

        Button changeLang = (Button) findViewById(R.id.changeLang);
        final CharSequence[] items = {"Русский","English"};//имена методов Ваших в списке
        AlertDialog.Builder builder = new AlertDialog.Builder(SettingsActivity.this);
        builder.setItems(items, new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int item) {
                if (item == 0) { //"Русский"
//method
                }
                if (item == 1) { //"English"
//method
                }
            }});
        AlertDialog alert = builder.create();
        alert.show();
    }
}
