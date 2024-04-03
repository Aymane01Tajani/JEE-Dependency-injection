package ext;

import dao.Idao;
import org.springframework.stereotype.Component;

@Component("vc")
public class DaoImplVCapteur implements Idao {
    @Override
    public double getData() {
        System.out.println("Version Capteurs");
        double data=77;
        return data;
    }
}
