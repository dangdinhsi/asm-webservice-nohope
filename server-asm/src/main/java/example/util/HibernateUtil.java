package example.util;

import example.entity.City;
import example.entity.Place;
import example.model.CityModel;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import org.hibernate.metadata.ClassMetadata;

import java.util.Map;

public class HibernateUtil {
    private static final SessionFactory ourSessionFactory;

    static {
        try {
            ourSessionFactory = new Configuration().
                    configure("hibernate.cfg.xml").
                    buildSessionFactory();
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static Session getSession() throws HibernateException {
        return ourSessionFactory.openSession();
    }

    public static void main(final String[] args) throws Exception {
        final Session session = getSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            /*City city = new City();
            city.setName("HCM");
            session.save(city);*/
            CityModel model = new CityModel();
            City city = model.findById(model.getAll().get(1).getId());
            Place place = new Place();
            place.setName("dia diem 3");
            place.setCity(city);
            session.save(place);
            System.out.println("save thanh cong!!!!");
            transaction.commit();
        }
        catch (Exception ex){
            if(transaction!=null){
                transaction.rollback();
            }
        } finally {
            session.close();
        }
    }
}
