package Pojo_Classes;


public class Router  implements java.io.Serializable {


     private RouterId id;

    public Router() {
    }

    public Router(RouterId id) {
       this.id = id;
    }
   
    public RouterId getId() {
        return this.id;
    }
    
    public void setId(RouterId id) {
        this.id = id;
    }




}


