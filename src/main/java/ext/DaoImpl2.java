package ext;

import dao.IDao;
import metier.IMetier;
import org.springframework.stereotype.Component;

@Component("dao2")
public class DaoImpl2 implements IDao {
    @Override
    public double getData() {
        System.out.println("Version web services");
        double t = 77;
        return t;
    }
}
