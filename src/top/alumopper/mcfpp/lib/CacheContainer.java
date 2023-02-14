package top.alumopper.mcfpp.lib;

/**
 * 表示可存放变量
 */
public interface CacheContainer {
    /**
     * 获取这个容器中变量应该拥有的前缀
     * @return 其中的变量将会添加的前缀
     */
    public String getPrefix();
}
