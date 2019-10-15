package example;
import example.entity.City;
import example.entity.District;
import example.entity.Member;
import example.entity.Place;
import example.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;
import java.util.List;

@WebService()
public class HelloWorld {
  @WebMethod
  public String sayHelloWorldFrom(String from) {
    String result = "Hello, world, from " + from;
    System.out.println(result);
    return result;
  }
  @WebMethod
  public String savePlace(Place place) {
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
  @WebMethod
  public String updatePlace(Place place) {
    final Session session = HibernateUtil.getSession();
    Transaction transaction = null;
    try {
      transaction = session.beginTransaction();
      session.update(place);
      transaction.commit();
      return "update success!";
    } catch (Exception ex) {
      ex.printStackTrace();
      transaction.rollback();
      return "update fail!";
    } finally {
      session.close();
    }
  }
  @WebMethod
  public void deletePlace(long id){
    Transaction transaction =null;
    try(Session session =HibernateUtil.getSession()) {
      transaction = session.beginTransaction();
      Place place = session.get(Place.class,id);
      if(place!=null){
        session.delete(place);
        System.out.println("delete success!!!");
      }
      transaction.commit();
    }catch (Exception ex){
      if(transaction!=null){
        transaction.rollback();
      }
      System.out.println("cannot delete student!!!!,Ex:"+ex);
    }
  }
  @WebMethod
  public List<Place> getAllPlace() {
    List<Place> placeList = HibernateUtil.getSession().createQuery("from Place", Place.class).list();
    return placeList;
  }
  @WebMethod
  public List<City> getAllCity() {
    List<City> cityList = HibernateUtil.getSession().createQuery("from City ", City.class).list();
    return cityList;
  }
  @WebMethod
  public List<District> getAllDistrict() {
    List<District> districtList = HibernateUtil.getSession().createQuery("from District ", District.class).list();
    return districtList;
  }
  @WebMethod
  public District findDistrictByID(long id) {
    return HibernateUtil.getSession().get(District.class, id);
  }

  @WebMethod
  public Place findPlaceByID(long id) {
    return HibernateUtil.getSession().get(Place.class, id);
  }
  @WebMethod
  public City findCityByID(long id) {
    return HibernateUtil.getSession().get(City.class, id);
  }
  @WebMethod
  public String addMember(Member member) {
    final Session session = HibernateUtil.getSession();
    Transaction transaction = null;
    try {
      transaction = session.beginTransaction();
      session.save(member);
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
  @WebMethod
  public Member findMemberByUsername(String username) {
    return HibernateUtil.getSession().get(Member.class, username);
  }
  public static void main(String[] argv) {
    Object implementor = new HelloWorld ();
    String address = "http://localhost:9000/HelloWorld";
    Endpoint.publish(address, implementor);
  }
}
