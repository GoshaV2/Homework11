import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        leapYearCheck(2024);
        versionSuggestion((byte)1,2021);
        System.out.println("Потребуется дней: "+daysOfDelivery(95));
        int[] array={1,2,3,4,5};
        reverseArray(array);
        System.out.println(Arrays.toString(array));
        doubleCheck("aabccddefgghiijjkk");
        int[] salaryBook=generateRandomArray();
        System.out.println("Среднее значение: "+averageValue(salaryBook));
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

    private static void reverseArray(int[] array){
        int temp;
        for(int i=0;i<array.length/2;i++){
            temp=array[array.length-1-i];
            array[array.length-1-i]=array[i];
            array[i]=temp;
        }
    }
    private static void doubleCheck(String symbols){
        char[] symbolsArray=symbols.toCharArray();
        for(int i=0;i<symbols.length()-1;i++){
            if(symbolsArray[i]==symbolsArray[i+1]){
                System.out.println("Задублирован символ: "+symbolsArray[i]);
                return;
            }
        }
        System.out.println("Дублей не найдено");
    }
    private static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    private static int sumOfArray(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
    private static float averageValue(int[] array){
        int sum=sumOfArray(array);
        int length=array.length;
        return (float) sum/length;
    }
}