public class question2{
     public static void main(String []args){
        int num = 15;
        System.out.println(findNums(num));
     }
     
     public static int findNums(int num){
         return num - (num / 3) - (num / 5) + (num / 15) * 2;
     }
}