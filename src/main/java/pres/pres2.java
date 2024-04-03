package pres;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.sql.SQLOutput;
import java.util.Scanner;

//FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException
public class pres2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner=new Scanner(new File("config.txt"));

        String daoClassName=scanner.nextLine();
        Class cDao=Class.forName(daoClassName);//charger la classe au mémoire
        IDao dao = (IDao) cDao.newInstance();//Instancier la classe
        //IDao dao = (IDao) cDao.getDeclaredConstructor().newInstance();
       // System.out.println(dao.getData());

        String metierClassName=scanner.nextLine();
        Class cMetier=Class.forName(metierClassName);//charger la classe au mémoire
        IMetier metier = (IMetier) cMetier.newInstance();//Instancier la classe
        Method method=cMetier.getMethod("setDao",IDao.class);
        method.invoke(metier,dao);

        System.out.println("Résultat=>"+metier.calcul());
    }
}
