package com.example.cases;

import com.example.base.Assertion;
import com.example.operation.InspectionOperate;
import com.example.operation.LoginOperate;
import com.tbkt.base.InitAppium;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by LITP on 2016/9/30.
 */

public class Inspection extends InitAppium {


    private LoginOperate loginOperate;
    private InspectionOperate operate;


    @BeforeClass
    public void initDriver() {

        Assert.assertNotNull(driver);
        loginOperate =new LoginOperate(driver);
        operate = new InspectionOperate(driver);

    }


    @Test
    public void Login() throws InterruptedException {
        //�����ȵ�¼��
        boolean flag = loginOperate.login("13192624740", "xxxxx");

        //�����Ƿ�ɹ���¼
        Assert.assertTrue(flag);
    }



    @Test(priority = 1)
    public void openInspction(){
        //�����ȵ�¼��
        boolean flag = operate.intoInspection();

        //�����Ƿ�ɹ���¼
        Assertion.verifyEquals(flag,true,"�Ƿ������������");
    }

    @Test(priority = 2)
    public void search(){
        //Assertion.verifyEquals(operate.searchContent("����"),true,"�����Ƿ����ɹ�!");
    }

}
