package Présentation;

import Metier.IMetier;
import dao.IDao;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;
//Implementation dynamique
public class Presenation2 {
    public static void main(String[] args) throws Exception  {
        Scanner S=new Scanner(new File("Config.txt")); // file initiating
//objet dao
        String daoClassName = S.nextLine(); // reading first file caracter
        Class cDao = Class.forName(daoClassName); // charger la class en mémoire
        IDao dao = (IDao) cDao.newInstance(); // instanciation de la class
       // System.out.println(dao.getData());

 //objet metier
        String metierClassName = S.nextLine();
        Class cMetier = Class.forName(metierClassName);
        IMetier metier=(IMetier) cMetier.newInstance();

        Method method = cMetier.getMethod("setDao",IDao.class);
        method.invoke(metier,dao);
        System.out.println("Résultat => "+metier.calcul());



    }
}
