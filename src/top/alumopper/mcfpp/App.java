package top.alumopper.mcfpp;

public class App {
    public static void main(String[] args) throws Exception {
        String path = "test/proj.json";
        Project.readProject(path);
        Project.compile();
        Project.optimization();
        Cache.printAll();
    }
}