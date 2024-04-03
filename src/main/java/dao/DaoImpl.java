package dao;

import org.springframework.stereotype.Component;

@Component("dao")
public class DaoImpl implements IDao{

    @Override
    public double getData() {

        /*
        Se connecter à la BD pour récuperer la tempurature
        */
        System.out.println("Version BD");
        double temp=Math.random()*40;

        return 0;
    }
}
