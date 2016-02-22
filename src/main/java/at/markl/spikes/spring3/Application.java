package at.markl.spikes.spring3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.concurrent.TimeUnit;

/**
 * Created by mmark on 22.02.2016.
 */
public class Application {

    public static void main(String[] args) {
        final ApplicationContext context = new ClassPathXmlApplicationContext("service.xml");

        try {
            TimeUnit.MINUTES.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
