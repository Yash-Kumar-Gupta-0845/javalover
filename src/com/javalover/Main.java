package com.javalover;
import java.util.Arrays;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello Java");
        System.out.println("This is my first code");
        //variable assign :- String to string or number to number transport allow
        String Out=("Geeta");
        String In=Out;
        int b=91;
        //Java types :- Primitive or non primitive
        byte age = 30;
        int phone = 1234567899;
        long phone2 = 1234567891234L;
        float pi = 3.14F;
        char letter = 'a';
        boolean isAdult = false;
        // non primitive
        String name = new String("My_Dad");
        System.out.println("name :- "+name);
        // concatenate
        String n1="yash";
        String n2=" kumar ";
        String n3= "gupta";
        String n4=n1+n2+n3+" \nWork hard to get succeed";
        System.out.println(n4);
        //charAt:- return character at particular position
        System.out.println(n1.charAt(0));
        System.out.println(In);
        System.out.println(b);
        // length :- return length of the string
        System.out.println(name.length());
        // replace :- it replace the old alphabet with new alphabet
        String n5= name.replace('a','b');
        System.out.println(n5);
        // substring :- extracting the string up to certain length (last index excluded )
        System.out.println(name.substring(0,4));
        //array :- collection of data
        int[] marks = new int[3];
        marks[0] = 97;
        marks[1] = 98;
        marks[2] = 95;
        System.out.println(marks[2]);
        //for index where no value assign it return 0
    //    System.out.println(marks[9]);
        //length :- gives length of array
        System.out.println(marks.length);
        // sort :- it sort the data of the array
        System.out.println(marks[0]);
        Arrays.sort(marks);
        System.out.println(marks[0]);
        // when array value is already known
        int[] mark = {97,98,95};
        System.out.println(mark[0]);
        // for multidimensional array we use [][]
        int[][] finalmarks = {{95,96,98},{98,95,92}};
        System.out.println(finalmarks[0][0]);
        // casting :- conversion from one datatype to another datatype
        double price = 100.00;
        double finalprice = price +18; // implicit casting i.e. adding int value with double
        System.out.println(finalprice);
        int p = 100;
    //    int fp = p + 18.0 ; size variation( double 8 byte while int 4 byte ) create error i.e. adding float value with int  not acceptable
        int fp = p +(int)18.67; //explicit casting i.e. conversion from double to int
        System.out.println(fp);
        // constants :- it create final value which is constant throughout the program
        final float PI=3.15F;
    //    Pi=1.1F; // error because of constant i.e. use of final keyword to give constant value
        System.out.println(PI);
        System.out.println(pi);// pi is a predefined value i.e. unable to change
        // operators :-
        double a=3;
        double c =4;
        double sum = a+c;
        double diff = a-c;
        double mul = a*c;
        double div = a/c;
        double mod = a%c; // remender giver
        System.out.println(sum);
        System.out.println(diff);
        System.out.println(mul);
        System.out.println(div);
        System.out.println(mod);
        // urinary operators i.e. only one operators required for operationss
        int numb = 1;
        System.out.println(numb++); // 1
        System.out.println(numb); // 2
        int num = 1;
        System.out.println(++num); //2
        System.out.println(num); // 2
        int num2 = 1;
        System.out.println(num2--); //1
        System.out.println(num2); //0
        int num3 = 1;
        System.out.println(--num3); //0
        System.out.println(num3); //0
        // Maths
        System.out.println(Math.max(5, 6));
        System.out.println(Math.min(5, 6));
        System.out.println(Math.random());
        System.out.println((int)(Math.random()*100));
        // How to take INPUT ?
        Scanner sc = new Scanner(System.in);
        System.out.println("Input your age : ");
        int age1 = sc.nextInt();
        System.out.println("your age is "+age1);
        // Input string
        System.out.println("\nName please : ");
        String name1 = sc.next(); // it take only a single word from user as input
        System.out.println("\nYour name is "+name1);
        System.out.println("\nA line for you "+name1);
        System.out.println("Input a line :- ");
        String name2 = sc.nextLine();
        System.out.println(name2);

    }
}
