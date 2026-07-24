package Object;


import java.util.Arrays;
import java.util.Objects;
import java.util.StringJoiner;

public class User implements Cloneable {

    int id;
    String username;
    String password;
    String path;
    int[] data;

    public User() {
    }

    public User(int id, String username, String password, String path, int[] data) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.path = path;
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int[] getData() {
        return data;
    }

    public void setData(int[] data) {
        this.data = data;
    }

    public String toString() {
        return "id:" + id + " username:" + username + " password:" + password + " path:" + path + " data:" + toString(data);
    }

    public String toString(int[] data) {
        StringJoiner sj = new StringJoiner(",", "[", "]");
        for (int i = 0; i < data.length; i++) {
            sj.add(data[i] + "");
        }
        return sj.toString();
    }

//        @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return  super.clone();//浅克隆
//    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        // 浅克隆：调用父类的clone方法创建基础对象副本
        User user = (User) super.clone();

        // 深克隆：对引用类型的数据进行深度复制
        // 这里对int数组进行克隆，避免原始对象和克隆对象共享同一个数组引用
        user.data = this.data.clone();

        // 返回完整的深克隆对象
        return user;
    }


//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        User user = (User) o;
//        return id == user.id && Objects.equals(username, user.username) && Objects.equals(password, user.password) && Objects.equals(path, user.path) && Arrays.equals(data, user.data);
//    }
//
//    @Override
//    public int hashCode() {
//        int result = Objects.hash(id, username, password, path);
//        result = 31 * result + Arrays.hashCode(data);
//        return result;
//    }
}
