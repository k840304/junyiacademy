public class question1{
     public static void main(String []args){
        String str = "flipped class room is important";
        System.out.println(flipString(str));
     }
     
     public static String flipString(String str){
         String[] splitStr = str.split(" ");
         String flippedStr = "";
         int len = splitStr.length;
         for(int i = 0; i < len; i++){
            int strLen = splitStr[i].length();
            for(int j = strLen - 1; j >= 0; j--) flippedStr += splitStr[i].charAt(j);
            flippedStr += " ";
         }
         return flippedStr.substring(0, flippedStr.length() - 1);
     }
}