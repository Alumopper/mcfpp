package top.alumopper.mcfpp;

import java.io.File;

public class App {
    public static void main(String[] args) throws Exception {
        String path = "test/proj.json";
        Project p = new Project(path);
        p.compile();
    }
}
