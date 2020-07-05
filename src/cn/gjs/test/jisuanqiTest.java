package cn.gjs.test;

import cn.gjs.junit.jisuanqi;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author 高俊松
 * @date 2020/7/4 - 23:21
 */
public class jisuanqiTest {

    @Before
    public void init(){
        System.out.println("开始，初始化方法，用于资源申请，所有测试方法在执行前都会执行该方法");
    }

    @After
    public void close(){
        System.out.println("结束，释放资源，在所有测试方法执行完成后，自动执行该方法");
    }

    @Test
    public void testAdd(){
//        System.out.println("はじめまして‼");
        jisuanqi ji=new jisuanqi();
        int result = ji.Add(1, 2);
//        System.out.println(result);
        Assert.assertEquals(3,result);
    }
    @Test
    public void testSub(){
//        System.out.println("はじめまして‼");
        jisuanqi ji=new jisuanqi();
        int result = ji.Sub(1, 2);
//        System.out.println(result);
        Assert.assertEquals(-1,result);
    }
}
