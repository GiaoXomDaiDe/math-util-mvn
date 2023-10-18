
package com.nguyenphathuy.mathutil.core;


//class này chứa các hàm static dùng chung cho mọi nơi
//khi nào dùng static: khi ta làm các hàm mà chỉ xử lí xong rồi return 
//ko cần lưu trữ thông tin vào instance variable - đặc tính của object
public class MathUtility {
    public static final double PI = 3.14;
	
	//hàm tính n! = 1.2.3.4...n
	//không tính được giai thừa số âm !!
	//0! = 1! = 1 quy ước
	//vì giai thưa tăng rất nhanh, 21! kiểu long chứa ko nổi (vượt 18 số 0)
        //do đó hàm getF() của chúng ta chỉ chơi vs n = 0 -> 20
    
    //5! = 1.2.3.4.5
    //5! = 4!.5
    //4! = 1.2.3.4
    //4! = 4.3!
    //3! = 3.2!
    //2! = 2.1!
    // Dừng lại, ko đuổi nhau nữa
    //N! = N.(N-1)! => CÔng thức đệ quy xuất hiện 
    //Đệ quy - recursion - gọi lại chính mình vs quy mô nhỏ hơn
    
    public static long getFactorial (int n){
		if (n < 0 || n > 20) throw new IllegalArgumentException("Invalid n. n must be 0 to 20");
                
		if (n == 0 || n == 1) return 1; // nếu n đặc biệt, ta return sớm kết quả
                
                return n * getFactorial (n-1);
                
                
		//tối ưu code, thay ruột của cái hàm để chạy ngon hơn
                //nhanh hơn, hoặc code viết đẹp hơn
                //hoặc fix bug thì phải sửa code
                //DÙ BẠN SỬA CODE VÌ LÍ DO GÌ, THÌ CODE PHẢI ĐƯỢC TEST LẠI
                //VÀ TEST LẠI ĐỂ ĐẢM BẢO RẰNG NÓ VẪN XANH NHƯ LẦN TRƯỚC 
                //NẾU TA VIẾT CODE ĐI KÈM TEST-SCRIPT THÌ VIỆC TEST LẠI CÁI HÀM 
                //SẼ CỰC NHANH, KO CẦN DÙNG MẮT ĐỂ DÒ TỪNG DÒNG LỆNH ĐÚNG SAI
                //MÀ CHỈ CẦN NHÌN MÀU XANH LÀ ĐỦ - VÌ HÀM ĐÃ TRẢ VỀ = EXPECTED
                //TEST LẠI NHỮNG GÌ ĐÃ TỪNG TEST -> REGRESSION TEST (KIỂM THỬ HỒI QUY)
                //KIỂM THỬ LẠI HÀM CỰC NHANH, VÌ GITHUB LO DÙM 
                //TA CHỈ CẦN MÀU XANH, HOẶC NHẬN MAIL CHỬI VÌ CODE ĐỎ
                
	}
    
    
    
//	public static long getFactorial (int n){
//		if (n < 0 || n > 20) throw new IllegalArgumentException("Invalid n. n must be 0 to 20");
//                
//		if (n == 0 || n == 1) return 1; // nếu n đặc biệt, ta return sớm kết quả
//		
//		long result = 1; //sống sót đến lệnh này, sure n = 2..20
//		
//		for (int i = 2; i <= n; i++) result *= i;
//
//		return result;
//	}
}
