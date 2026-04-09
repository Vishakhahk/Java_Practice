package sub_house;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import HOME.Employee;
import org.springframework.context.ApplicationContext;

public class MainFile {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("sub_HOME/ApplicationContext.xml");
        Employee emp = (Employee) context.getBean("emp1");
        emp.display();
    }
}
