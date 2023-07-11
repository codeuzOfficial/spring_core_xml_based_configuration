package dasturlash.uz;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        Lesson lesson = (Lesson) context.getBean("lesson");
        lesson.showDetail();
    }
}