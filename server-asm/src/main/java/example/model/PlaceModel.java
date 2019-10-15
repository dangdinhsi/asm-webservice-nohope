package example.model;

import example.entity.Place;
import example.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.jws.WebMethod;
import java.util.List;

public class PlaceModel {
    public String save(Place place) {
        final Session session = HibernateUtil.getSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(place);
            transaction.commit();
            return "save success!";
        } catch (Exception ex) {
            ex.printStackTrace();
            transaction.rollback();
            return "save fail!";
        } finally {
            session.close();
        }
    }
    public List<Place> getAll() {
        List<Place> placeList = HibernateUtil.getSession().createQuery("from Place", Place.class).list();
        return placeList;
    }

    public Place findByID(long id) {
        return HibernateUtil.getSession().get(Place.class, id);
    }
}
