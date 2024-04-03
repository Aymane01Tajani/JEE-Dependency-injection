package pres;


import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresAvecSpringXML {
    public static void main(String[] args){
    ApplicationContext springcontext=new ClassPathXmlApplicationContext("config.xml");
    IMetier metier=springcontext.getBean(IMetier.class);
    System.out.println("Res ="+metier.calcul());
    }
}
