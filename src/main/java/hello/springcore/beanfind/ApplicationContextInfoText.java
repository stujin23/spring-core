package hello.springcore.beanfind;

import hello.springcore.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationContextInfoText {
    AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
//    @DisplyName("모든")
    void findAllBean(){

    }
}
