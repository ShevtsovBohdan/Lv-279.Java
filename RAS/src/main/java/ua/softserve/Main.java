package ua.softserve;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ua.softserve.config.AppConfig;
import ua.softserve.service.AcademyService;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(AppConfig.class);

        AcademyService personService = context.getBean(AcademyService.class);

        System.out.println(personService.getById(796));

//        List<Academy> academies = personService.getAllAcademys();
//        academies.forEach(System.out::println);

        context.close();

    }
}
