package at.markl.spikes.spring3;

import at.markl.spikes.spring3.service.IScheduledService;
import at.markl.spikes.spring3.service.InternalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * My Scheduled ScheduledService
 */
@Component
public class ScheduledService implements IScheduledService {

    @Autowired
    private InternalService service;

    @PostConstruct
    public void init() {
        System.out.println("ScheduledService inititalisiert....");
    }

    @Scheduled (cron = "*/1 * * * * *")
    public void batchService() {

        System.out.println("batchService aufgerufen..... " + service.getRandomValue());
    }
}
