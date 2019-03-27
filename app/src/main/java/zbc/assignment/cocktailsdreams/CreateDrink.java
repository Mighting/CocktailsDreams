package zbc.assignment.cocktailsdreams;

import android.media.Image;
import android.util.Log;

public class CreateDrink {

    String id;

    Drink drink = new Drink();

    public CreateDrink(String id) {
        this.id = id;
    }


    public int setDrinkImg() {

        switch (id) {
            case "0":
                drink.setDrinkImage(R.drawable.ic_americano);
                break;
            case "1":
                drink.setDrinkImage(R.drawable.ic_bloody_mary);
                break;
            case "2":
                drink.setDrinkImage(R.drawable.ic_bluelagoon);
                break;
            case "3":
                drink.setDrinkImage(R.drawable.ic_cosmopolitan);
                break;
            case "4":
                drink.setDrinkImage(R.drawable.ic_daiquiri);
                break;
            case "5":
                drink.setDrinkImage(R.drawable.ic_manhatten);
                break;
            case "6":
                drink.setDrinkImage(R.drawable.ic_margarita);
                break;
            case "7":
                drink.setDrinkImage(R.drawable.ic_martini);
                break;
            case "8":
                drink.setDrinkImage(R.drawable.ic_mojito);
                break;
            case "9":
                drink.setDrinkImage(R.drawable.ic_screwdriver);
                break;
            case "10":
                drink.setDrinkImage(R.drawable.ic_tequila_sunrise);
                break;
        }

        return drink.getDrinkImage();
    }

    public String setDrinkName() {
        switch (id) {
            case "0":
                drink.setDrinkName("Americano");
                break;
            case "1":
                drink.setDrinkName("Bloody Mary");
                break;
            case "2":
                drink.setDrinkName("Bluelagoon");
                break;
            case "3":
                drink.setDrinkName("Cosmopolitan");
                break;
            case "4":
                drink.setDrinkName("Daiquiri");
                break;
            case "5":
                drink.setDrinkName("Manhatten");
                break;
            case "6":
                drink.setDrinkName("Margarita");
                break;
            case "7":
                drink.setDrinkName("Martini");
                break;
            case "8":
                drink.setDrinkName("Mojito");
                break;
            case "9":
                drink.setDrinkName("Screwdriver");
                break;
            case "10":
                drink.setDrinkName("Tequila Sunrise");
                break;
        }

        return drink.getDrinkName();
    }

    public String setDrinkDesc() {
        switch (id) {
            case "0":
                drink.setDrinkDescription("Ingredienser\n\n" +
                        "3 CL CAMPARI\n" +
                        "3 CL DRY VERMOUTH\n" +
                        "2 CL DANSKVAND\n" +
                        "ISTERNINGER\n\n" +
                        "Tilberedning\n\n" +
                        "Hæld Campari og dry Vermouth i et glas med isterninger. Fyld op med danskvand efter smag. \n" +
                        "\n" +
                        "Pynt med en skive appelsin eller citronskræl, rør let rundt og server.");
                break;
            case "1":
                drink.setDrinkDescription("Ingredienser\n\n" +
                        "5 CL VODKA\n" +
                        "9 CL TOMATJUICE\n" +
                        "1 CL FRISKPRESSET CITRONSAFT\n" +
                        "5 ML WORCESTERSHIRE SAUCE\n" +
                        "4 ML TABASCO\n" +
                        "½ TSK SALT\n" +
                        "½ TSK PEBER\n" +
                        "1 STK BLADSELLERI\n" +
                        "ISTERNINGER\n\n" +
                        "Tilberedning\n\n" +
                        "Hæld alle ingredienser i en shaker med is og ryst meget forsigtigt i 5 sekunder.\n" +
                        "\n" +
                        "Si over et glas med is, pynt med et stykke bladselleri og servér.\n" +
                        "\n" +
                        "OBS. Bemærk at både Worcestershire Sauce samt Tabasco er i ml og ikke cl. Dvs. ca. 3-5 dråber. \n" +
                        "Tip\n" +
                        "Man kan også købe decideret sellerisalt, hvilket egner sig rigtig godt til brug i Bloody Mary.");
                break;
            case "2":
                drink.setDrinkDescription("Ingredienser\n\n" +
                        "3 CL VODKA\n" +
                        "1 CL ROSE’S BLUE CURAÇAO\n" +
                        "8 CL SPRITE (CITRON- & LIMESMAG)\n" +
                        "ISTERNINGER\n\n" +
                        "Tilberedning\n\n" +
                        "Hæld Vodka og Sprite i et glas med is. \n" +
                        "\n" +
                        "Top forsigtige op med 1 cl Blue Curaçao og servér.");
                break;
            case "3":
                drink.setDrinkDescription("Ingredienser\n\n" +
                        "2 CL COINTREAU\n" +
                        "4 CL VODKA\n" +
                        "4 CL TRANEBÆRJUICE\n" +
                        "2 CL FRISKPRESSET LIMESAFT\n" +
                        "1 CL ROSE’S SUGAR CANE\n" +
                        "1 STK REVET APPELSINSKAL\n" +
                        "ISTERNINGER\n\n" +
                        "Tilberedning\n\n" +
                        "Hæld alle ingredienserne i en shaker med is og ryst.\n" +
                        "\n" +
                        "Si indholdet over i et martiniglas, klem appelsinskallen, så olierne sprøjter ud over drinken og servér.\n" +
                        "\n" +
                        "Traditionelt set har denne drink været uden sukkersirup, men i nyere tid har dette vundet indpas, da det gør drinken lidt mindre syrlig i smagen.\n");
                break;
            case "4":
                drink.setDrinkDescription("Ingredienser\n\n" +
                        "4 CL HVID ROM\n" +
                        "2 CL ROSE’S STRAWBERRY\n" +
                        "2 CL ROSE'S LIME\n" +
                        "1 CL ROSE’S SUGAR CANE\n" +
                        "ISTERNINGER\n\n" +
                        "Tilberedning\n\n" +
                        "Hæld alle ingredienser i en blender, tilsæt ca. 8 isterninger, og kør til konsistensen er cremet som ved slush ice.\n" +
                        "\n" +
                        "Hæld over i vinglas med sugerør og server straks.");
                break;
            case "5":
                drink.setDrinkDescription("Ingredienser\n\n" +
                        "6 CL BOURBON\n" +
                        "3 CL RØD / MARTINI ROSSO\n" +
                        "½ CL ANGOSTURA BITTERS\n" +
                        "ISTERNINGER\n\n" +
                        "Tilberedning\n\n" +
                        "Hæld alle ingredienserne i et stort glas med is og rør godt rundt (ca. 20 gange rundt), eller til den ønskede fortynding.\n" +
                        "\n" +
                        "Si over i et koldt cocktailglas,pynt med et cocktailbær og servér.");
                break;
            case "6":
                drink.setDrinkDescription("Ingredienser\n\n" +
                        "4 CL TEQUILA SILVER\n" +
                        "2 CL COINTREAU\n" +
                        "1½ CL FRISKPRESSET LIMESAFT\n" +
                        "1 CL ROSE’S SUGAR CANE\n" +
                        "ISTERNINGER\n\n" +
                        "Tilberedning\n\n" +
                        "1. Hæld alle ingredienserne i en shaker med is og ryst i ca. 10 sekunder.\n" +
                        "\n" +
                        "2. Si over et afkølet cocktailglas, pynt med en skive lime og servér.");
                break;
            case "7":
                drink.setDrinkDescription("Ingredienser\n\n" +
                        "5 CL DRY GIN\n" +
                        "1 CL DRY VERMOUTH\n" +
                        "1 STK OLIVEN\n\n" +
                        "Tilberedning\n\n" +
                        "Hæld Dry Gin og Noilly Prat Dry Vermouth i et glas med isterninger og rør, indtil den øsnkede fortynding er opnået. Dette er typisk ca. 30 sek.\n" +
                        "\n" +
                        "Si indholdet over i et iskoldt cocktailglas, og pynt med en oliven.");
                break;
            case "8":
                drink.setDrinkDescription("Ingredienser\n\n" +
                        "4 CL HVID ROM\n" +
                        "4 CL ROSE'S LIME\n" +
                        "6 CL DANSKVAND\n" +
                        "2 STK LIME\n" +
                        "1 TSK RØRSUKKER\n" +
                        "12 STK MYNTEBLADE\n" +
                        "ISTERNINGER\n\n" +
                        "Tilberedning\n\n" +
                        "Pres saften af 2 limebåde i et højt drinkglas. \n" +
                        "\n" +
                        "Nulre myntebladene og læg i glasset. \n" +
                        "\n" +
                        "Tilsæt rom, Rose’s Lime, Rose’s Sugar Cane, en god håndfuld isterninger og danskvand. \n" +
                        "\n" +
                        "Rør rundt, så alle ingredienser blandes.\n" +
                        "\n" +
                        "*Tip.\n" +
                        "Man kan også benytte Rose's Sugar Cane istedet for rørsukker.\n");
                break;
            case "9":
                drink.setDrinkDescription("Ingredienser\n\n" +
                        "5 CL VODKA\n" +
                        "10 CL FRISKPRESSET APPELSINJUICE\n" +
                        "ISTERNINGER\n\n" +
                        "Tilberedning\n\n" +
                        "Hæld begge ingredienser i et højt glas med is, rør let og servér.");
                break;

            case "10":
                drink.setDrinkDescription("Ingredienser\n\n" +
                        "4 CL TEQUILA SILVER\n" +
                        "1 CL ROSE'S GRENADINE\n" +
                        "10 CL FRISKPRESSET APPELSINJUICE\n" +
                        "ISTERNINGER\n\n" +
                        "Tilberedning\n\n" +
                        "Hæld Tequila Silver og appelsinjuice i et glas med is og rør rundt.\n" +
                        "\n" +
                        "Hæld derefter forsigtigt Rose's Grenadine langs kanten af glasset og server.");
                break;
        }

        return drink.getDrinkDescription();
    }

}
