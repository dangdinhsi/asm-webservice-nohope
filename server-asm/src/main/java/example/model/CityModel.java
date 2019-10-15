package example.model;

import example.entity.City;
import example.entity.Place;
import example.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class CityModel {
    public List<City> getAll() {
        List<City> cityList = HibernateUtil.getSession().createQuery("from City ", City.class).list();
        return cityList;
    }
    public City findById(long id){
        Transaction transaction = null;
        try(Session session =HibernateUtil.getSession()) {
            transaction = session.beginTransaction();
            City city = session.get(City.class,id);
            transaction.commit();
            return city;
        }catch (Exception ex){
            if(transaction !=null){
                transaction.rollback();
            }
            System.out.println("Cannot findById...");
            return null;
        }
    }
}
