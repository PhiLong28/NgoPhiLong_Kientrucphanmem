package iuh.edu.vn;
import jdepend.swingui.JDepend;
public class Swing_UI_Main {
    public static void main(String[] args) throws Exception{
        JDepend depend =new JDepend();
        depend.addDirectory("T:\\NgoPhiLong\\main-sequence-ui\\Library-Assistant");
        depend.analyze();
        System.out.println("DONE");
    }
}
