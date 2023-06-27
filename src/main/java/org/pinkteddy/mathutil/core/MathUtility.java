/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.pinkteddy.mathutil.core;

/**
 *
 * @author PGS
 */
//class này clone giống class java.util.Math
//chứa các hàm static Math.sqrt() Math.sin() Math.random()
public class MathUtility {

    public static final double PI = 3.14;

    //tính n! .... 
    //0! = 1! = 1
    //ko có giai thừa cho số âm. Nếu đưa -5! -> ném exception
    // vì giai thừa tăng rất nhanh, 21! long không chứa nổi 
    //20! vừa đủ cho long
    //21! 22! 23! > 20! -> ném ra Exception 
    public static long getFactorial(int n) {
        if(n < 0 || n > 20)
            throw new IllegalArgumentException("Wrong parament");
        
        if(n == 0 || n == 1)
            return 1;
        
        return n * getFactorial(n - 1);
    }

}

//Code cbi viết, hay đang viết, sẽ tiến hành luôn về kiểm thử -> viết code đến đâu thì có code kiểm thử đeens đó để đảm bảo hàm ngon
//kĩ thuật code và test code song hành với nhau, đan xen với nhau
//gọi là tdd - test driven development
//code đến đâu test đến đó
//Developer và QC có những thứ giống nhau và có nhiều thứ khác nhau
//DEV: Việc chính yếu, duy nhất là viết code để ra cái app
//QC : Việc chính yếu, duy nhất là tìm bug từ app
//Cả 2 giống nhau điều dưới đây
//Cả 2 đều phải tạo ra, viết ra, phát triển các test cases
//QC tạo test case để mô phỏng tình huống xài app của user
//Dev tạo ra test case để mô phỏng tình huống xài hàm, xài class
//của chính mình, hoặc mô phỏng tình huống xài hàm/app của ai đó/dev nào đó của sau này
//Cả 2 giống hau là đèu tạo test case và run test case để kết luận hàm đúng app đúng hay sai
//BH làm test case cho hàm GETF() ở vai trò Dev
//Test case là bộ data có chứa input và expected dùng để mô phỏng
//cách xài hàm, xài app của 1 ai đó dùng để verify/ kiểm thử xem 
//output của hàm/app có giống với expected hay ko
//Bộ test case cho hàm getF()
//có 2 cách viết test case, viết tự do và viết formal/chuẩn mực
//Viết tự do: nghĩa sao viết z
// các test case cho hàm getF() là
//0! -> 1; 1! -> 1; 2! -> 4; 3! -> 9
//viết theo formal: viết theo template gồn các info sau
//test case #1 : check getF() with n = 0
//Steps/Procedures (các bước run test case): đưa input, và click gì đó
//1. Given n =0
//2. Execute/ Call the function/method getF(with n), e.g getF(n = 0) 
//Expected result:
// getF(n=0) must return 1
//test case #2 : check getF() with n = 0
//Steps/Procedures (các bước run test case): đưa input, và click gì đó
//1. Given n =3
//2. Execute/ Call the function/method getF(with n), e.g getF(n = 3) 
//Expected result:
// getF(n=3) must return 9
//test case #3 : check getF() with n = 0
//Steps/Procedures (các bước run test case): đưa input, và click gì đó
//1. Given n =5
//2. Execute/ Call the function/method getF(with n), e.g getF(n = 5) 
//Expected result:
// getF(n=5) must return 120
