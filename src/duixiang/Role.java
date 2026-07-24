package duixiang;

import java.util.Random;

public class Role {
    private String name;
    private int blood;

    public Role() {
    }

    public Role(String name, int blood) {
        this.name = name;
        this.blood = blood;
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
     * @return blood
     */
    public int getBlood() {
        return blood;
    }

    /**
     * 设置
     * @param blood
     */
    public void setBlood(int blood) {
        this.blood = blood;
    }

    public String toString() {
        return "Role{name = " + name + ", blood = " + blood + "}";
    }
    public void attack(Role role){
        //getBlood只查看，不改变，setBlood,只改变
        Random random = new Random();
        int hurt = random.nextInt(20)+1;
        int blood = role.getBlood()-hurt;
        blood = blood<0?0:blood;
        role.setBlood(blood);
        System.out.println(getName()+"攻击了"+role.getName()+"造成了"+hurt+"点伤害，"+role.getName()+"剩余血量为"+role.getBlood());

    }
}
