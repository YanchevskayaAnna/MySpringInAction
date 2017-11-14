package chapter2;

import chapter2.performers.Performer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PerformanceMain {
    public static void main(String[] args) throws Exception {
        ApplicationContext ctx = new ClassPathXmlApplicationContext(
                "META-INF/spring/spring-idol.xml");

        Performer performer = (Performer) ctx.getBean("duke");
        performer.perform();

        Performer performerKenny = (Performer) ctx.getBean("kenny");
        performerKenny.perform();
    }
}
