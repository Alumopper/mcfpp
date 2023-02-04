package top.alumopper.mcfpp;

/**
 * 编译器的启动入口
 */
public class App {
    public static void main(String[] args) throws Exception {
        String path = "test/proj.json";
        Project.readProject(path);
        Project.compile();
        Project.optimization();
        Cache.printAll();
    }
}
