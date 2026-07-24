package Static;

public class Cook extends Staff {
    public Cook() {
    }

    public Cook(String id, String name, String wage) {
        super(id, name, wage);
    }

    public void work() {
        System.out.println("厨师正在做饭");
    }
}
