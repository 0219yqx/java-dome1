package Static;

public class Manager extends Staff {
    private String title;

    public Manager() {

    }
    public Manager(String id, String name, String wage, String title) {
        super(id, name, wage);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    @Override
    public void work(){
        System.out.println("经理正在工作");
    }
}