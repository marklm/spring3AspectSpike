package at.markl.spikes.spring3.aop;

import at.markl.spikes.spring3.service.InternalService;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Created by mmark on 22.02.2016.
 */
@Aspect
@Component
public class LogAroundAspect {

    private int id;

    @Autowired
    private InternalService service;

    @PostConstruct
    public void init() {
        id = this.hashCode();
        System.out.println("init: " + id);
    }

    @Before("execution(* at.markl.spikes.spring3.ScheduledService.*())")
    public void logBefore(JoinPoint joinPoint) {

        System.out.println("logBefore() is running!");
        System.out.println("hijacked : " + joinPoint.getSignature().getName());

        System.out.println("id: " + id + " .... this.hashCode:" + this.hashCode());

        System.out.println("service: " + service.getRandomValue(10000));

        System.out.println("******");
    }

}
