public class task1 {
    public static void main(String[] args) {
        System.out.println("Випадкове число на проміжку від [-20:20]");
        int num = (int) (Math.random()*41 - 20);
        System.out.println("Число: "+num);
    }
}
