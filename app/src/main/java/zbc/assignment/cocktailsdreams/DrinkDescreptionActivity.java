package zbc.assignment.cocktailsdreams;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class DrinkDescreptionActivity extends AppCompatActivity implements DrinkPresenter.View {

    ImageView drinkImage;
    TextView nameOfDrink;
    TextView descreptionOfDrink;

    DrinkPresenter drinkPresenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink_descreption);

        drinkPresenter = new DrinkPresenter(this);

        drinkImage = findViewById(R.id.PictureofDrink);
        nameOfDrink = findViewById(R.id.NameofDrinkText);
        descreptionOfDrink = findViewById(R.id.DescreptionofDrink);

        String id = getIntent().getStringExtra("selected");
        drinkPresenter.getDrinkID(id);

        drinkImage.setImageResource(drinkPresenter.setDrinkImage());
        nameOfDrink.setText(drinkPresenter.setDrinkName());
        descreptionOfDrink.setText(drinkPresenter.setDrinkDescription());



    }

    @Override
    public String getSelected(String selected) {
        return selected;
    }
}
