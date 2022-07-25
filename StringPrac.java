// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    //start here
    public static int lastDigit(int number) { 
        return Math.abs(number) % 10;
    }
    public static String sumOfDigit(int n){
         int sum = 0;
        while (n != 0) {
            sum = sum + n % 10;
            n = n / 10;
        }
        return ""+sum;
    }
    public static String method(String inStr,Integer inInt){
        String ret="";
        int lastDig=lastDigit(inInt);
        if(inStr.length()<4){
            ret="A";
        }
        else if(inStr.contains(sumOfDigit(inInt))){
            ret="B";
        }else if(lastDig<inStr.length() && Character.isDigit(inStr.charAt(lastDig))){
            ret="C";
        }else if("AEIOUaeiou".indexOf(inStr.charAt(0)) == -1){
            ret="D";
        }else if(Integer.valueOf(sumOfDigit(inInt))>20){
            ret="E";
        }else if(inStr.toLowerCase().equals("apple") || inStr.toLowerCase().equals("oneplus")){
            ret="F";
        }
        return ret;
    }
    //end here
    public static void main(String[] args) {
    System.out.println(method("APple",23));
       }
    
}