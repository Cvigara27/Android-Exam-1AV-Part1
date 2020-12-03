package com.example.exam1avfirstpart;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import android.graphics.Color;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void changeText(View v){
        EditText editView = findViewById(R.id.editText);
        SeekBar seek = findViewById(R.id.seekSize);
        int size = seek.getProgress();
        float pixels = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, size, getResources().getDisplayMetrics());

        TextView textView = findViewById(R.id.textView1);
        textView.setText(editView.getText());
        textView.setTextSize(pixels);
    }

    public void changeColor(View v){
        SeekBar red = findViewById(R.id.redseek);
        int redColor = red.getProgress();
        SeekBar green = findViewById(R.id.greenseek);
        int greenColor = green.getProgress();
        SeekBar blue = findViewById(R.id.blueseek);
        int blueColor = blue.getProgress();

        TextView textView = findViewById(R.id.textView1);
        textView.setTextColor(Color.rgb(redColor,greenColor,blueColor));
    }
}