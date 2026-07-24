package Static;

public class Staff {
    private String id;
    private String name;
    private String wage;

    public Staff() {
    }

    public Staff(String id, String name, String wage) {
        this.id = id;
        this.name = name;
        this.wage = wage;
    }

    /**
     * 获取
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return wage
     */
    public String getWage() {
        return wage;
    }

    /**
     * 设置
     * @param wage
     */
    public void setWage(String wage) {
        this.wage = wage;
    }

    public String toString() {
        return "Staff{id = " + id + ", name = " + name + ", wage = " + wage + "}";
    }
    public void work(){
        System.out.println("员工正在工作");
    }
    public void eat(){
        System.out.println("员工正在吃饭");
    }
}
