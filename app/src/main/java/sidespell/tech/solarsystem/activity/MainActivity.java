package sidespell.tech.solarsystem.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Spinner;

import sidespell.tech.solarsystem.R;

public class MainActivity extends AppCompatActivity {


    static final String[] planets = new String[] { "Mercury",
                                                    "Venus",
                                                    "Earth",
                                                    "Mars",
                                                    "Jupiter",
                                                    "Saturn",
                                                    "Uranus",
                                                    "Neptune",
                                                    "Pluto"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final Spinner spinner = (Spinner) findViewById(R.id.Spinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, planets);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);


        final Spinner spnr = (Spinner) findViewById(R.id.Spinner);

        spnr.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                ImageView img = (ImageView) findViewById(R.id.imageView);
                if (position == 0) {
                    img.setImageResource(R.drawable.mercury);
                }
                if (position == 1) {
                    img.setImageResource(R.drawable.venus);
                }
                if (position == 2) {
                    img.setImageResource(R.drawable.earth);
                }
                if (position == 3) {
                    img.setImageResource(R.drawable.mars);
                }
                if (position == 4) {
                    img.setImageResource(R.drawable.jupiter);
                }
                if (position == 5) {
                    img.setImageResource(R.drawable.saturn);
                }
                if (position == 6) {
                    img.setImageResource(R.drawable.uranus);
                }
                if (position == 7) {
                    img.setImageResource(R.drawable.neptune);
                }
                if (position == 8) {
                    img.setImageResource(R.drawable.pluto);
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });




    }


}
