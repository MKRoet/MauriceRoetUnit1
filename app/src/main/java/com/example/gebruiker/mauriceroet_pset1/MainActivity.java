package com.example.gebruiker.mauriceroet_pset1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void CheckboxClicked(View view) {
        // Check if checkbox is checked.
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked.
        switch (view.getId()) {
            case R.id.checkbox_arms:
                ImageView arms = findViewById(R.id.arms);
                if (checked) {
                    // Make image of arms visible.
                    arms.setVisibility(View.VISIBLE);
                }
                else {
                    // Make image invisible.
                    arms.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.checkbox_ears:
                ImageView ears = findViewById(R.id.ears);
                if (checked) {
                    // Make ears visible.
                    ears.setVisibility(View.VISIBLE);
                }
                else {
                    // Make ears invisible.
                    ears.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.checkbox_eyebrows:
                ImageView eyebrows = findViewById(R.id.eyebrows);
                if (checked) {
                    // Make eyebrows visible.
                    eyebrows.setVisibility(View.VISIBLE);
                }
                else {
                    // Make eyebrows invisible.
                    eyebrows.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.checkbox_eyes:
                ImageView eyes = findViewById(R.id.eyes);
                if (checked) {
                    // Make eyes visible.
                    eyes.setVisibility(View.VISIBLE);
                }
                else {
                    // Make eyes invisible.
                    eyes.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.checkbox_glasses:
                ImageView glasses = findViewById(R.id.glasses);
                if (checked) {
                    // Make image of glasses visible.
                    glasses.setVisibility(View.VISIBLE);
                }
                else {
                    // Make image of glasses invisible.
                    glasses.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.checkbox_hat:
                ImageView hat = findViewById(R.id.hat);
                if (checked) {
                    hat.setVisibility(View.VISIBLE);
                }
                else {
                    hat.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.checkbox_mouth:
                ImageView mouth = findViewById(R.id.mouth);
                if (checked) {
                    mouth.setVisibility(View.VISIBLE);
                }
                else {
                    mouth.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.checkbox_mustache:
                ImageView mustache = findViewById(R.id.mustache);
                if (checked) {
                    mustache.setVisibility(View.VISIBLE);
                }
                else {
                    mustache.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.checkbox_nose:
                ImageView nose = findViewById(R.id.nose);
                if (checked) {
                    nose.setVisibility(View.VISIBLE);
                }
                else {
                    nose.setVisibility(View.INVISIBLE);
                }
                break;

            case R.id.checkbox_shoes:
                ImageView shoes = findViewById(R.id.shoes);
                if (checked) {
                    shoes.setVisibility(View.VISIBLE);
                }
                else {
                    shoes.setVisibility(View.INVISIBLE);
                }
                break;

        }
    }
}