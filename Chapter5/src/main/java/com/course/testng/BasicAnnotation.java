package com.course.testng;

import org.testng.annotations.*;

public class BasicAnnotation {
//    最基本得注解，用来把方法标记测试的一部分
    @Test
    public void testCase1() {
        System.out.println("这是第测试用例1");
    }
     @BeforeMethod
        public  void beforMethod(){
            System.out.println("BeforeMethod这是在方法之前运行");
     }
     @AfterMethod
     public void afterMethod(){
                System.out.println("AfterMethod这是在方法之后运行");
            }
      @BeforeClass
         public void beforeClass(){
                System.out.println("BeforeClass这是在类运行之前运行的方法");
            }
      @AfterClass
      public void AfterClass(){
                System.out.println("AfterClass这是在类运行之后运行的方法");

    }
    @BeforeSuite
    public void beforeSuit(){
        System.out.println("BeforeSuite这是在运行类之前运行");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("AfterSuite这是在运行类之后运行");
    }

}
