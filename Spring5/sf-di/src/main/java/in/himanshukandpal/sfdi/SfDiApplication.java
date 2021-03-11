package in.himanshukandpal.sfdi;

import in.himanshukandpal.sfdi.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfDiApplication {

    public static void main(String[] args) {
       ApplicationContext ctx =  SpringApplication.run(SfDiApplication.class, args);

        I18NController i18NController = (I18NController) ctx.getBean("i18NController");
        System.out.println(i18NController.sayGreeting());

        MyController controller = (MyController) ctx.getBean("myController");

        System.out.println("----------PRIMARY INJECTED CONTROLLER");
        System.out.println(controller.getPrimaryGreetingService());

        System.out.println("-----------PROPERTY INJECTED CONTROLLER");
        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.getGreeting());

        System.out.println("---------SETTER INJECTED CONTROLLER");
        SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
        System.out.println( setterInjectedController.getGreetingService());

        System.out.println("--------CONSTRUCTOR INJECTED CONTROLLER");
        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
        System.out.println(constructorInjectedController.getGreetingService());
    }

}
