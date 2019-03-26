package zbc.assignment.cocktailsdreams;

import android.util.Log;

public class DrinkPresenter {


    public interface View {
        String getSelected(String selected);
    }

    private View view;

    public DrinkPresenter(View view) {
        this.view = view;
    }

    Drink drink = new Drink();

    public String setDrink(){
        //return the drink after it has been made

        drink.getDrinkImage();
        drink.getDrinkName();
        drink.getDrinkDescription();


        String drink = "Americano";

        return drink;
    }



}
