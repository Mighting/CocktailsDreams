package zbc.assignment.cocktailsdreams;

import android.media.Image;
import android.util.Log;

public class DrinkPresenter {


    public interface View {
        String getSelected(String selected);
    }

    private View view;

    public DrinkPresenter(View view) {
        this.view = view;
    }

    CreateDrink createDrink;

    public void getDrinkID(String id) {
       createDrink = new CreateDrink(id);
    }

    public int setDrinkImage() {
        return createDrink.setDrinkImg();
    }

    public String setDrinkName() {
        return createDrink.setDrinkName();
    }

    public String setDrinkDescription() {
        return createDrink.setDrinkDesc();
    }


}
