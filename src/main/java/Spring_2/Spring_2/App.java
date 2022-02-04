package Spring_2.Spring_2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext Ac=new ClassPathXmlApplicationContext("food.xml");
        food_cart_1 foo1 = Ac.getBean(food_cart_1.class);
        System.out.println(foo1);
        foo1.typeoffood();
        foo1.tasteoffood();
        foo1.qualityoffood();
        
        food_cart_2 foo2 =Ac.getBean(food_cart_2.class);
        System.out.println(foo2);
        foo2.typeoffood();
        foo2.tasteoffood();
        foo2.tasteoffood();
    }
}
