package pres;

import ext.DaoImpl2;
import dao.Idao;
import metier.IMetier;
import metier.MetierImpl;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Pres2 {
    public static void main(String[] args) throws Exception {
        //DaoImpl2 dao=new DaoImpl2();
        Scanner scanner= new Scanner(new File("config.txt"));
        String daoClassName= scanner.nextLine();
        System.out.println(daoClassName);
        Class cDao=Class.forName(daoClassName);
        Idao dao=(Idao) cDao.getConstructor().newInstance(); // => new DaoImpl()
        System.out.println(dao.getData());

        //MetierImpl metier=new MetierImpl();
        String metierClassName= scanner.nextLine();
        System.out.println(metierClassName);
        Class cMetier=Class.forName(metierClassName);
        IMetier metier=(IMetier) cMetier.getConstructor(Idao.class).newInstance(dao);

        //metier.setDao(dao); //injection des dependances
        //Method setDao=cMetier.getDeclaredMethod("setDao",Idao.class);
        //setDao.invoke(metier,dao);//injection des dependences

        System.out.println("Res="+metier.calcul());
    }
}
