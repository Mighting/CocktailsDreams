package zbc.assignment.cocktailsdreams;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView nameOfDrink;
    ListView simpleview;
    String[] drinksName;
    int[] drinksImages;

    DrinkDescreptionActivity drinkDescreptionActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        drinkDescreptionActivity = new DrinkDescreptionActivity();

        final Intent goToDescreptionPageIntent = new Intent(this, DrinkDescreptionActivity.class);

        simpleview = findViewById(R.id.DrinkListView);
        nameOfDrink = findViewById(R.id.textView);

        setupListview();


        simpleview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selected = parent.getItemAtPosition(position).toString();
                goToDescreptionPageIntent.putExtra("selected", selected);
                startActivity(goToDescreptionPageIntent);
            }
        });

    }

    public void setupListview() {

        drinksName = new String[]{"Americano", "Bloody Mary", "Bluelagoon", "Cosmopolitan", "Daiquiri", "Manhatten", "Margarita", "Martini", "Mojito", "Screwdriver", "Tequila Sunrise", "", ""};
        drinksImages = new int[]{R.drawable.ic_americano
                , R.drawable.ic_bloody_mary
                , R.drawable.ic_bluelagoon
                , R.drawable.ic_cosmopolitan
                , R.drawable.ic_daiquiri
                , R.drawable.ic_manhatten
                , R.drawable.ic_margarita
                , R.drawable.ic_martini
                , R.drawable.ic_mojito
                , R.drawable.ic_screwdriver
                , R.drawable.ic_tequila_sunrise
                , R.drawable.ic_launcher_background
                , R.drawable.ic_launcher_background};

        ListAdapter listAdapter = new ListAdapter(this, drinksName, drinksImages);

        simpleview.setAdapter(listAdapter);
    }
}
