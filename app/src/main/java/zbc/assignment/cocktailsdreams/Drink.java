package zbc.assignment.cocktailsdreams;

import android.media.Image;

public class Drink {

    Image drinkImage;
    String drinkName;
    String drinkDescription;

    public Image getDrinkImage() {
        return drinkImage;
    }

    public void setDrinkImage(Image drinkImage) {
        this.drinkImage = drinkImage;
    }

    public String getDrinkName() {
        return drinkName;
    }

    public void setDrinkName(String drinkName) {
        this.drinkName = drinkName;
    }

    public String getDrinkDescription() {
        return drinkDescription;
    }

    public void setDrinkDescription(String drinkDescription) {
        this.drinkDescription = drinkDescription;
    }


    public Drink() {

    }

    public Drink finishedDrink(Drink drink){
        return drink;
    }
}
