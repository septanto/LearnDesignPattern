package learn.dp.builder;

public class ChickenBurger extends Burger {
    @Override
    public float price() {
        return 50.0F;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
}
