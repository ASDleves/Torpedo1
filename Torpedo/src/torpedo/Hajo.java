
package torpedo;

public class Hajo {
    private int[] pozicio;

   public String talalat(int poz){
       int loves = 0;
       while (loves < pozicio.length && !(poz == pozicio[loves])){
           loves ++;
       }
       String valasz = "";
       
       if (loves < pozicio.length){
           valasz = "talált!";
       }else{
           valasz = "nem talált!";
       }
       return valasz;
       
   }
 
    public Hajo(int[] pozicio) {
        this.pozicio = new int[3];
        this.pozicio = pozicio;
    }
         
}
