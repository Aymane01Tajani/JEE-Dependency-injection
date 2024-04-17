package pres;

import dao.Idao;
import metier.IMetier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Pres2_1 {
    public static void main(String[] args) throws Exception {
        //DaoImpl2 dao=new DaoImpl2();
        Scanner scanner= new Scanner(System.in);
        System.out.println("Donner la classe de la couche DAO :");
        String daoClassName= scanner.nextLine();
        System.out.println(daoClassName);
        Class cDao=Class.forName(daoClassName);
        Idao dao=(Idao) cDao.getConstructor().newInstance(); // => new DaoImpl()
        System.out.println(dao.getData());

        //MetierImpl metier=new MetierImpl();
        System.out.println("Donner la classe de la couche Metier :");
        String metierClassName= scanner.nextLine();
        System.out.println(metierClassName);
        Class cMetier=Class.forName(metierClassName);
        IMetier metier=(IMetier) cMetier.getConstructor().newInstance();

        //metier.setDao(dao); //injection des dependances
        Method setDao=cMetier.getDeclaredMethod("setDao",Idao.class);
        setDao.invoke(metier,dao);//injection des dependences

        System.out.println("Res="+metier.calcul());
    }
}