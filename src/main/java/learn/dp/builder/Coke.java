package learn.dp.builder;

public class Coke extends ColdDrink {
    @Override
    public float price() {
        return 30.0F;
    }

    @Override
    public String name() {
        return "Coke";
    }
}
