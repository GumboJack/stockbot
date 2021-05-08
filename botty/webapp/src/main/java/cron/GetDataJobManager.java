package cron;

import client.Client;
import client.ClientFactory;
import client.ClientType;
import manager.DatabaseManager;
import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GetDataJobManager  implements ServletContextListener{
    private static final Logger logger = Logger.getLogger(GetDataJobManager.class.getName());

    private Scheduler scheduler;


    @Override
    public void contextInitialized(ServletContextEvent sce) {
        try {

            JobDetail job = JobBuilder.newJob(GetDataJob.class)
                    .withIdentity("GetDataJob", "GetDataJobGroup").build();

            Trigger trigger = TriggerBuilder.newTrigger().withIdentity("GetDataJobTrigger", "GetDataJobGroup")
                    .withSchedule(SimpleScheduleBuilder
                            .simpleSchedule()
                            .withIntervalInMinutes(3)
                            .repeatForever()).build();

            scheduler = new StdSchedulerFactory().getScheduler();
            scheduler.scheduleJob(job, trigger);
            scheduler.start();
        } catch (Exception e) {
            logger.log(Level.SEVERE, e.getMessage(), e);
        }
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        try {
            scheduler.shutdown();
        } catch (Exception e) {
            logger.log(Level.SEVERE, e.getMessage(), e);
            e.printStackTrace();
        }
    }

}
