package org.myo.sandbox;

import org.myo.sandbox.util.CalendarFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Calendar;

@Configuration
@ComponentScan({"org.myo.sandbox"})
public class AppConfig {

    @Bean("cal")
    public CalendarFactory calFactory() {
        CalendarFactory cal = new CalendarFactory();
        cal.addDays(2);
        return cal;
    }
    @Bean
    public Calendar cal() throws Exception {
        return calFactory().getObject();
    }

}
