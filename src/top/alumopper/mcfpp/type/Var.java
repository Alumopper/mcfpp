package top.alumopper.mcfpp.type;

import java.util.UUID;

/**
 * mcfpp所有类型的基类
 */
public class Var {
    /**
     * 标识符
     */
    public String identifier;

    /**
     * 是否是已知的
     */
    public boolean isConcrete = false;

    /**
     * 是否是临时变量
     */
    public boolean isTemp = false;

    /**
     * 变量在栈里面的位置
     */
    public int stackIndex;

    public Var(){
        identifier = UUID.randomUUID().toString();
    }

}
