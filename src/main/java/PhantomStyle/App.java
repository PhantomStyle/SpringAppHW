package PhantomStyle;

import PhantomStyle.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
        AccountService bean = applicationContext.getBean(AccountService.class);
        System.out.println("\nBefore changes");
        bean.printAll();
        System.out.println("\nTotal owner volume of 10L");
        System.out.println(bean.getTotalOwnerVolume(10L));
        bean.multiplyAll(1.05);
        bean.multiplyOwner(20L, 20.0);
        System.out.println("\nAfter changes");
        bean.printAll();
    }
}
