
package Pojo_Classes;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import com.google.gson.Gson;    



public class RouterHelper {
    Session session =null;
    
    public RouterHelper(){
        this.session=HibernateUtil.getSessionFactory().getCurrentSession();
        
        
    }
    
    public String getFilmTitles(String src, String dest) {
        
        
    List<Router> Bus_data = null;
    try {
        System.out.println();
        org.hibernate.Transaction tx = session.beginTransaction();
        Query q = session.createQuery ("from Router as r where r.station='\"+src+\"'");
        Bus_data = (List<Router>) q.list();
        
    } catch (Exception e) {
        e.printStackTrace();
    }
    
    Gson gson=new Gson();
    String json=gson.toJson(Bus_data);
    return json;
}
    
}
