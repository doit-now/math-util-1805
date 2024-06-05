/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.giaolang.mathutil.core.test;

import com.giaolang.mathutil.core.MathUtility;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
//quy ước đặt tên package của Java
//tên miền đảo ngược, chữ thường 100%
//com.mycompany trên mạng
//com.tên-cty.tên-dự-án.tên-module.Tên-Class-Sẽ-Dùng
//com.microsoft.sqlserver.jdbc.
//org.junit.jupiter.api.Test;
//com.giaolang.mathutil.core

//C# viết chiều xuôi, chữ hoa từng đầu từ
//Microsoft.Sqlserver...

//NodeJS, ReactJS có cách riêng
//coding convention for ...




/**
 *
 * @author giao.lang
 */
public class MathUtilityDDTTest {
    
    //chuẩn bị data, sau này đưa vào hàm assert() của Framework
    //data này sẽ từ từ đc trích vào trong hàm assert() 
    //nó nằm trong hàm có style là static - nằm cố định ở 1 vùng ram
    //Test case 
    //0! -> 1; 1! -> 1; 2! -> 2; 3! -> 6; 4! => 24; 5! => 120, 6! => 720
    //ta thấy có các bộ data
    // {0, 1}, {1, 1}, {2, 2}, {3, 6}, {4, 24}, {5, 120}, {6, 720}...
    //       [7][2]
    //ta để riêng data này ra 1 mảng 2 chiều
    
    public static Object[][] initData() {
        return new Object[][]
        {
            {0, 1}, 
            {1, 1}, 
            {2, 2}, 
            {3, 6}, 
            {4, 24}, 
            {5, 120}, 
            {6, 720}
        };
    } 
    
    //Test case so sánh hàm có trả về kì vọng hay ko
    @ParameterizedTest
    @MethodSource("initData")
    public void testFactorialGivenRightArgumentReturnsWell(int n, long expected) {
        assertEquals(expected, MathUtility.getFactorial(n));
    }
    
    
}

//PHẦN KIẾN THỨC BỔ SUNG VÀO CV
//TDD - TEST DRIVEN DEVELOPMENT
//LÀ KĨ THUẬT VIẾT CODE CỦA DÂN DEV ĐI KÈM VỚI VIẾT CÁC TEST CASE 
//ĐỂ KIỂM THỦ NGAY NHỮNG CODE VỪA VIẾT
//TỨC LÀ CODE MỖI HÀM, LUÔN ĐI KÈM CODE KIỂM THỬ
//KẾT QUẢ KIỂM THỬ HIỂN THỊ THEO 2 MÀU XANH - CODE NGON, PASS CÁC TEST CASE
//MÀU ĐỎ, CODE ĐÃ KO PASS TEST CASE
//VIỆC NÀY CỨ LIÊN TỤC NHƯ VẬY, VIẾT CODE, VIẾT TEST CASE, RUN TEST 
//CASE ĐỂ XEM XANH ĐỎ, KĨ THUẬT NÀY GỌI LÀ TDD

//MỌI NGÔN NGỮ LẬP TRÌNH ĐỀU HỖ TRỢ CÁC BỘ THƯ VIỆN, FRAMEWORRK GIÚP
//TEST CODE 2 MÀU XANH ĐỎ, GỌI LÀ UNIT TESTING FRAME WORK
//MỌI NGÔN NGỮ ĐỀU HỖ TRỢ TDD, VẤN ĐỀ LÀ DEV TEAM CÓ XÀI HAY KO
//NHÓM LÀM OBS CÓ XÀI

//ĐỀ BÀI THUYẾT TRÌNH NHÓM
//NHÓM HÃY CHỌN 1 UNIT TESTING FRAMEWORK ĐỂ DEMO
//VÀO GOOGLE GÕ: UNIT TESTING FRAMEWORK FOR <NNLT>, RA KQ THƯ VIỆN
//C#: NUNIT, XUNIT, MS TEST...
//JAVA: TESTNG...
//JS: MOCHA, JASMINE...

//DÒNG THỨ 2 TRONG CV
//DDT - DATA DRIVEN TESTING | TỪ TƯƠNG ĐƯƠNG: 
//                            PARAMETERIZED TESTING 
//                    VIẾT TEST CASE THEO STYLE THAM SỐ HOÁ

//(ĐỪNG NHẦM VỚI TDD - TEST DRIVEN DEVELOPMENT Ở TRÊN)
//DDT LÀ PHẦN MỞ RỘNG THÊM, KĨ THUẬT NÂNG CAO ĐỂ GIÚP TỔ CHỨC
//CÁC TEST CASE KHI VIẾT CODE UNIT TEST, NÓ CÓ BÀ CON VỚI TDD

//DDT - PARAMETERIZED TESTING LÀ KĨ THUẬT VIẾT CÁC TEST CASE 
//MÀ TA TÁCH RIÊNG PHẦN DATA RA KHỎI CÁC CÂU LỆNH ASSERT()
//CHO DỄ QUẢN LÍ TÍNH THIẾU ĐỦ CỦA CÁC TEST CASE
//DỄ THEO DÕI CÁC PHẦN CODE LIÊN QUAN ĐẾN TEST HÀM
//VÌ CÂU LỆNH SO SÁNH EXPECTED VS. ACTUAL TRỞ NÊN GỌN NHẸ HƠN






