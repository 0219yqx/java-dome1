package ArrayList;

public class Student {
    private String name;
    private String password;
    private String telephone;
    private String idcord;

    public Student() {
    }

    public Student(String name, String password, String telephone, String idcord) {
        this.name = name;
        this.password = password;
        this.telephone = telephone;
        this.idcord = idcord;
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
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取
     * @return telephone
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * 设置
     * @param telephone
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    /**
     * 获取
     * @return idcord
     */
    public String getIdcord() {
        return idcord;
    }

    /**
     * 设置
     * @param idcord
     */
    public void setIdcord(String idcord) {
        this.idcord = idcord;
    }

    public String toString() {
        return "Student{name = " + name + ", password = " + password + ", telephone = " + telephone + ", idcord = " + idcord + "}";
    }
}


