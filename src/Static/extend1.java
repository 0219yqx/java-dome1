package Static;

public class extend1 {
    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.show();
    }
}

class Fu {
    String name = "fu";
}


class Zi extends Fu {
    String name = "zi";

    public void show() {
        System.out.println(name); //zi
        System.out.println(this.name); //zi
        System.out.println(super.name); //fu
    }
}
