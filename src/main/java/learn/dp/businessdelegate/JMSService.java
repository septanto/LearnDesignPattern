package learn.dp.businessdelegate;

public class JMSService implements BusinessService {
    public void doProcessing() {
        System.out.println("Processing task by invoking JSM Service");
    }
}
