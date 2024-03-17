class Hello {
    public static void main(String args[]){
        // System.out.println("")
        int num1 = 7;
        int num2 = 5;
        // addition
        int result =  num1 + num2;
        System.out.println(result); 
        // division
        int result2 = num1 / num2;
        int result3 = num1 % num2;
        System.out.println(result2); 
        System.out.println(result3); 

        // increment
        num1 = num1 + 2;
        System.out.println(num1); 

        // increment type 2
        num1 += 2;
        System.out.println(num1); 

        // increment type 3
        num1++;
        System.out.println(num1); 



        // post increment
        num1++;
        // pre increment
        ++num1;
        System.out.println(num1); 


        int result4 = num1++;  // result4 = num1, num1 = num1 + 1;
        System.out.println(result4); 
        int result5 = ++num1;  // num1 = num1 + 1, result4 = num1;
        System.out.println(result5); 
     


    }
}
