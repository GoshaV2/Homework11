import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        leapYearCheck(2024);
        versionSuggestion((byte)1,2021);
        System.out.println("Потребуется дней: "+daysOfDelivery(95));
        //
    }

    private static void leapYearCheck(int year){
        boolean leapYearCheck;
        if(year%400==0){
            leapYearCheck=true;
        }else if(year%100==0){
            leapYearCheck=false;
        }else if(year%4==0){
            leapYearCheck=true;
        }else{
            leapYearCheck=false;
        }
        if(leapYearCheck){
            System.out.println(year + " год является високосным");
        }else{
            System.out.println(year + " год не является високосным");
        }
    }
    private static void versionSuggestion(byte clientOS,int clientDeviceYear){
        int currentYear = LocalDate.now().getYear();
        if(clientDeviceYear==currentYear){
            System.out.println("всё норм");
        }else if(clientOS==1){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }else if(clientOS==0){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
    }
    private static int daysOfDelivery(int deliveryDistance){
        int days=0;
        if(deliveryDistance<=20){
            days=1;
        }else if(20<deliveryDistance && deliveryDistance<=60){
            days=2;
        }else if(60<deliveryDistance && deliveryDistance<=100){
            days=3;
        }
        return days;
    }
}