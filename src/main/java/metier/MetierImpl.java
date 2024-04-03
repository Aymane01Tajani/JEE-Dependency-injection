package metier;

import dao.DaoImpl;
import ext.DaoImpl2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


import dao.Idao;
@Component

public class MetierImpl implements IMetier {
    @Autowired
    @Qualifier("vws")
    private Idao dao; //Couplage Faible

    @Override
    public double calcul() {
        double data=dao.getData();
        double res=data*11.4;
        return res;
    }

    /**
     * pour permettre de modifier la valeur de variable dao (a ne plus dire)
     * pour permettre d'injecter dans la variable dao
     * un objet d'une classe qui implememte l'interface IDao
     */
    public void setDao(Idao dao) {
        this.dao = dao;
    }
}
