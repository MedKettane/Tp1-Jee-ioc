package Metier;
import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MetierImpl implements IMetier {
    @Autowired
    private IDao dao;
    @Override
    public double calcul() {
        double tmp=dao.getData();
        double res= (Math.random() * 3) * 1000;

        return res;
    }
/*
Injecter dans la variable dao un objet
d'une classe qui implémente l'interface IDao
 */
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
