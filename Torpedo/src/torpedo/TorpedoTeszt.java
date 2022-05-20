
package torpedo;

public class TorpedoTeszt {

    private static void tesztLoves() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    int poz;
    public static void main(String[] args) {
        tesztLoves();
        
    }
    public String tesztLoves(int poz){
        Hajo hajo = new Hajo();
        String t = hajo.talalat(4);
        assert t.equals("talált"):"nem jó  a találat ellenőrzése";
        return null;
    };
}
