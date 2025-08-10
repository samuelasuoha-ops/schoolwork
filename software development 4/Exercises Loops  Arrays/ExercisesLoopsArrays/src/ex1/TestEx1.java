package ex1;

public class TestEx1 {
    public static void main(String[] args) {
        int[] numbers = {10,20,30,40,50,60,70,80,90,100};
        System.out.println("Elements at an even index");
        for(int i=2;i<numbers.length;i+=2){
            System.out.println(numbers[i]);
        }

        System.out.println("Elements that are even ");
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]%2 ==0){
                System.out.println(numbers[i]);
            }
        }

        System.out.println("Elements in reverse order");
        for(int i= numbers.length-1;i>=0;i--){
            System.out.println(numbers[i]);
        }

        System.out.println("First Element");
        System.out.println(numbers[0]);

        System.out.println("Last Element");
        System.out.println(numbers[numbers.length-1]);
    }
}
