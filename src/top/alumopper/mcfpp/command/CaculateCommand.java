package top.alumopper.mcfpp.command;

/**
 * 用于储存两个数字的加减所使用的语句。
 */
public class CaculateCommand extends Command{
    public Number a;
    public Number b;
    public char cal;

    public CaculateCommand(Number a,Number b,char cal){
        super();
        this.a = a;
        this.b = b;
        this.cal = cal;
    }
    
    /**
     * 两个整数加减
     */
    public void generateCommand_II(){
        
    }
}
