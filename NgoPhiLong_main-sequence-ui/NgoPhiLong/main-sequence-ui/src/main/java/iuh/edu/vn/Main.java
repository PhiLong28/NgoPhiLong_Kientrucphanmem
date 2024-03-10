package iuh.edu.vn;
import jdepend.xmlui.JDepend;
import java.io.PrintWriter;
public class Main {
    public static void main(String[] args) throws Exception{
        JDepend depend =new JDepend(new PrintWriter("reports/report.xml"));
        depend.addDirectory("T:\\NgoPhiLong\\main-sequence-ui\\Library-Assistant");
        depend.analyze();
        System.out.println("DONE");
    }
}
