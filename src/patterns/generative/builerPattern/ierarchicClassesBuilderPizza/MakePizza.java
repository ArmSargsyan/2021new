package patterns.generative.builerPattern.ierarchicClassesBuilderPizza;

import static patterns.generative.builerPattern.ierarchicClassesBuilderPizza.NYPizza.Size.SMALL;
import static patterns.generative.builerPattern.ierarchicClassesBuilderPizza.Pizza.Topping.*;

public class MakePizza {

    public static void main(String[] args) {

        NYPizza pizza = new NYPizza.Builder(SMALL).addTopping(SAUSAGE).addTopping(ONION).build();
        Calzone calzone = new Calzone.Builder().addTopping(HAM).sauceInside().build();
    }
}
