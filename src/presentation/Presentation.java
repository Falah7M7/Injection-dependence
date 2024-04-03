package presentation;

import dao.DaoImpl;
import ext.DaoImpl2;
import metier.MetierImpl;

import java.time.Clock;

public class Presentation {
    public static void main(String[] args) {
        /* injection des dependances par instanciation statique */
        DaoImpl2 dao=new DaoImpl2();
        MetierImpl metier=new MetierImpl();
        metier.setDao(dao);
        System.out.println("Resultat="+metier.calcul());

    }
}
