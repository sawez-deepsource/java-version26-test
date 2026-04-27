package demo;

import java.util.*;

public class App {

    public static void main(String[] args) {
        App app = new App();
        System.out.println(app.MAX_SIZE);
    }

    static int MAX_SIZE = 100;

    public HashMap<String, List<String>> getRegistry() {
        return new HashMap<>();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof App other) {
            return this.MAX_SIZE == other.MAX_SIZE;
        }
        return false;
    }
}
