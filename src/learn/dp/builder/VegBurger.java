package learn.dp.builder;

public class VegBurger extends Burger {
    @Override
    public float price() {
        return 25.0F;
    }

    @Override
    public String name() {
        return "Veg Burger";
    }
}
