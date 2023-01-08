import top.alumopper.mcfpp.*;

public class App {
    public static void main(String[] args) throws Exception {
        String a = "(1+1)*8+9*5";
        ExpTree t = new ExpTree();
        t.anlyse(a);
    }
}
