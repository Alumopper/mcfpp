package top.alumopper.mcfpp.lang;

import top.alumopper.mcfpp.lib.Class;
import top.alumopper.mcfpp.lib.Function;

import java.util.List;

/**
 * 实现此接口即代表这个Java类所代表的类型能够从这个类型的变量中搜寻此变量所代表的mcfpp类的成员。
 */
public interface CanSelectMember {

    Var getVarMember(String key);

    Function getFunctionMember(String key, List<String> params);

    Class Class();
}
