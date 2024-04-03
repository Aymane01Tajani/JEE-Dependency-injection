package pres;

import dao.DaoImpl;
import ext.DaoImpl2;
import ext.DaoImplVCapteur;
import metier.MetierImpl;

public class Pres1 {
    public static void main(String[] args) {
        DaoImpl dao=new DaoImpl(); //Instanciation statique
        MetierImpl metier=new MetierImpl();//injection via constructeur
        metier.setDao(dao); //injection des dependances
        System.out.println("Res="+metier.calcul());
    }
}
