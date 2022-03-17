package dao;

import org.springframework.stereotype.Component;

@Component("dao")
public class DaoImp implements IDao{
    @Override
    public double getData() {
      //récupération de la température => base de donnés
        System.out.println("version BD");
      double tmp=Math.random()*20;
      return tmp;
    }


}
