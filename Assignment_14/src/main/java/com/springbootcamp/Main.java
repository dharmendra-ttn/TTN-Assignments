package com.springbootcamp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
//        Ques 1 and Ques2
        ApplicationContext context = new ClassPathXmlApplicationContext("spring_config.xml");
        Database database = context.getBean("database", Database.class);
        System.out.println("Database Name: " + database.getName());
        System.out.println("Database Port: " + database.getPort());
        
//       Ques 3 and 4
        Restaurent restaurent = context.getBean("teaRestaurent", Restaurent.class);
        HotDrink hotDrink = restaurent.getHotDrink();
        hotDrink.prepareHotDrink();
        
        
        Restaurent restaurent1 = context.getBean("expressTeaRestaurent",Restaurent.class);
        HotDrink hotDrink1 = restaurent1.getHotDrink();
        hotDrink1.prepareHotDrink();
        
        Restaurent restaurent2 = context.getBean("expressTeaRestaurentInner",Restaurent.class);
        HotDrink hotDrink2 = restaurent2.getHotDrink();
        hotDrink2.prepareHotDrink();

        //        ques 5
        
        Complex complex = context.getBean("complexBean",Complex.class);
        System.out.println("List: ");
        complex.list.forEach(System.out::println);
        System.out.println("Set: ");
        complex.set.forEach(System.out::println);
        System.out.println("Map: ");
        complex.map.entrySet().forEach(System.out::println);
        
//        Ques 7
        System.out.println(context.isPrototype("teaRestaurent"));
        
//       Ques 6
        Restaurent restaurent3 = context.getBean("teaAutowiredByName",Restaurent.class);
        restaurent3.getHotDrink().prepareHotDrink();
        
        Restaurent restaurent4 = context.getBean("teaAutowiredByCons",Restaurent.class);
        restaurent4.getHotDrink().prepareHotDrink();
        
        //Ques 9
        Restaurent restaurent5 = context.getBean("hotDrinktoTea",Restaurent.class);
        restaurent5.getHotDrink().prepareHotDrink();
        
    }
}
