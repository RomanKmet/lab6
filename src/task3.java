public class task3 {
    public static void main(String[] args) {
        System.out.println("Випадкове число на проміжку від [0:101)");
        double num1 = Math.random()*102;
        int num2 = (int) num1;
        System.out.println("Число: "+num2);
    }
}
