package ext;

import dao.Idao;
import org.springframework.stereotype.Component;

@Component("vws")
public class DaoImpl2 implements Idao {
    @Override
    public double getData() {
        System.out.println("version web service");
        double data=55;
        return data;
    }
}
