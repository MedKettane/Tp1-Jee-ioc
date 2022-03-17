package Présentation;

import Metier.MetierImpl;
import ext.DaoImp2;

public class Presentation {
    public static void main(String[] args) {

        //Implementation statique
        DaoImp2 dao=new DaoImp2();
        MetierImpl Met=new MetierImpl();
        Met.setDao(dao);
        System.out.println("Résultat :"+Met.calcul());




    }
}
