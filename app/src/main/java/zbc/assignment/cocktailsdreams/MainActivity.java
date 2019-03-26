package zbc.assignment.cocktailsdreams;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

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

        setupListview();


        simpleview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                startActivity(goToDescreptionPageIntent);
            }
        });

    }


    public void setupListview() {

        drinksName = new String[]{"Americano", "Bloody Mary", "Bluelagoon", "Cosmopolitan", "Daiquiri", "Manhatten", "Margarita", "Martini", "Mojito", "Screwdriver", "Tequila Sunrise"};
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
                , R.drawable.ic_tequila_sunrise};

        ListAdapter listAdapter = new ListAdapter(this, drinksName, drinksImages);

        simpleview.setAdapter(listAdapter);
    }


}
