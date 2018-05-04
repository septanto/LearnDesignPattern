package learn.dp.singleton;

public class SinglePatternDemo {
    public static void main(String[] args) {
        // illegal construct
        // Compile time Error: the constructor SingleObject is not visible
        // SingleObject obj = new SingleObject();

        // Get the onli object available
        SingleObject obj = SingleObject.getInstance();

        // show the message
        obj.showMessage();
    }
}
