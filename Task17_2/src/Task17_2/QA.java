package Task17_2;

public class QA extends People {
    public void testing (String a){
        System.out.println("Получено 1 задание "+ a+".");
    }
    public void testing (String a, String b){
        System.out.println("Получено 2 задания "+a + ", "+ b+".");

    }
    public void testing (String a, String b, String c){
        System.out.println("Получено 3 задания "+a + ", "+ b+ ", " + c+".");

    }
}
