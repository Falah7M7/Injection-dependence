package metier;
import dao.IDao;
public class MetierImpl implements IMetier {
    private IDao dao;
    @Override
    public double calcul() {
        double tmp=dao.getdata();
        double res=tmp*540/Math.cos(tmp*Math.PI);
        return res;
    }
    /* injecter dans la variable dao un objet */
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
