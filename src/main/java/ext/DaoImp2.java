package ext;

import dao.IDao;

public class DaoImp2 implements IDao {
    @Override
    public double getData() {
        System.out.println("version capteurs");
        double tmp = 1000;
        return tmp;
    }
}
