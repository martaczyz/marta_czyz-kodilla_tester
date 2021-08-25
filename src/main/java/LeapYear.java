public class LeapYear {
    public static void main(String[] args) {
        if ((2021 % 4 == 0 && 2021 % 100 == 0) || 2021 % 400 == 0) {
            System.out.println("Ten rok jest przestepny.");
        } else {
            System.out.println("Ten rok nie jest przestepny.");
        }
    }
}