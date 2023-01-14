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

    public Var(){
        identifier = UUID.randomUUID().toString();
    }

}
