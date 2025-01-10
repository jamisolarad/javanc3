package chapter4;

public class Tasksheet120 {
    public static void sumOfAllParams(int... numbers){
    
        int sumOfAllParams = 0;
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i<numbers.length; i++){
            int number = numbers[i];

            int paramSum = 0;
            
            for(int j = 1; j<=number; j++){
                paramSum += j;
            }
            if (i>0) {
                sb.append(",");
            }
            sb.append(paramSum);
            sumOfAllParams += paramSum;
        } 
        System.out.println("(" + sb.toString() + ") = " + sb.toString().replaceAll(",", "+") + "=" + sumOfAllParams);
        System.out.println(sumOfAllParams);
}
    public static void main(String[] args) {
        sumOfAllParams(4,5,10);
    }
}
