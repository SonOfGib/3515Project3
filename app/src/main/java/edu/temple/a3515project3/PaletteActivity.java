package edu.temple.a3515project3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class PaletteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palette);

        //colors
        String colors[] = {"White","Red", "Blue", "Green", "Yellow", "Purple"};

        Spinner paletteSpinner = findViewById(R.id.paletteSpinner);
        paletteSpinner.setAdapter(new PaletteAdapter(this, colors));
    }
}
