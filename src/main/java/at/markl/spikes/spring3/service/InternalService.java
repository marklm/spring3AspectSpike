package at.markl.spikes.spring3.service;

import org.springframework.stereotype.Component;

/**
 * Created by mmark on 22.02.2016.
 */
@Component
public class InternalService {

    public int getRandomValue(int max) {
        return (int) (Math.random() * max);
    }

    public int getRandomValue() {
        return (int) (Math.random() * 100);
    }
}
