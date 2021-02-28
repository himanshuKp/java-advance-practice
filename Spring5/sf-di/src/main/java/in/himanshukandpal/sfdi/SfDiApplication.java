package in.himanshukandpal.sfdi;

import in.himanshukandpal.sfdi.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfDiApplication {

    public static void main(String[] args) {
       ApplicationContext ctx =  SpringApplication.run(SfDiApplication.class, args);
        MyController controller = (MyController) ctx.getBean("myController");
        String msg = controller.sayHello();
        System.out.println(msg);
    }

}
