package ext;

import dao.IDao;

public class DaoImpVWS implements IDao {
    @Override
    public double getData() {
        System.out.println("Version Web service");
        return 90;
    }
}
