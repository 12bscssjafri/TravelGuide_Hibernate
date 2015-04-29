package Pojo_Classes;
// Generated Apr 22, 2015 10:21:27 AM by Hibernate Tools 3.2.1.GA



/**
 * RouterId generated by hbm2java
 */
public class RouterId  implements java.io.Serializable {


     private int bus;
     private String station;
     private int orderr;

    public RouterId() {
    }

    public RouterId(int bus, String station, int orderr) {
       this.bus = bus;
       this.station = station;
       this.orderr = orderr;
    }
   
    public int getBus() {
        return this.bus;
    }
    
    public void setBus(int bus) {
        this.bus = bus;
    }
    public String getStation() {
        return this.station;
    }
    
    public void setStation(String station) {
        this.station = station;
    }
    public int getOrderr() {
        return this.orderr;
    }
    
    public void setOrderr(int orderr) {
        this.orderr = orderr;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof RouterId) ) return false;
		 RouterId castOther = ( RouterId ) other; 
         
		 return (this.getBus()==castOther.getBus())
 && ( (this.getStation()==castOther.getStation()) || ( this.getStation()!=null && castOther.getStation()!=null && this.getStation().equals(castOther.getStation()) ) )
 && (this.getOrderr()==castOther.getOrderr());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getBus();
         result = 37 * result + ( getStation() == null ? 0 : this.getStation().hashCode() );
         result = 37 * result + this.getOrderr();
         return result;
   }   


}

