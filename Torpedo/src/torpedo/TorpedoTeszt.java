
package torpedo;

public class TorpedoTeszt {
    int poz;
    public static void main(String[] args) {
        tesztLoves(4);
        
    }
    private Hajo[] Hajo;
    public String tesztLoves(int poz){
        int[] hajo = new int[3];
        hajo[0] = 2;
        hajo[1] = 3;
        hajo[2] = 4;
        String t = Hajo.talalat(4);
        assert t.equals("talált"):"nem jó  a találat ellenőrzése";
        return null;
    };
}
