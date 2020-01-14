package com.example.cases;

import com.example.base.Assertion;
import com.example.operation.IndexOperate;
import com.example.operation.LoginOperate;
import com.example.pages.IndexPage;
import com.tbkt.base.InitAppium;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * ������ҳ����
 * Created by LITP on 2016/9/23.
 */

public class Index extends InitAppium {

    private LoginOperate loginOperate;
    private IndexOperate indexOperate;


    @BeforeClass
    public void initDriver() {


        Assert.assertNotNull(driver);
        loginOperate = new LoginOperate(driver);
        indexOperate = new IndexOperate(driver);

    }

    @Test
    public void Login() {
        //�����ȵ�¼��
        boolean flag = loginOperate.login("18737130173", "zabmw123456");

        //�����Ƿ�ɹ���¼
        Assert.assertTrue(flag);
    }

    /**
     * ���Ը�������
     */
    @Test(priority = 1)
    public void testPersonCenter() {
        //��֤��������
        Assertion.verifyEquals(indexOperate.verifyPersonCenter(), true, "���������Ƿ�������ʾ");

    }

    /**
     * ������ҳ
     */
    @Test(priority = 2)
    public void testMain() {
        Assertion.verifyEquals(indexOperate.verifyMain(), true, "��ҳ�Ƿ�������ʾ");

    }

    /**
     * ����ר������ҳ��
     */
    @Test(priority = 3)
    public void testExpertSearch() {
        Assertion.verifyEquals(indexOperate.verifyExpertSearch(), true, "��ҳ�Ƿ�������ʾ");

    }

    /**
     * ����ѧ��
     */
    @Test(priority = 4)
    public void testSchool() {
        Assertion.verifyEquals(indexOperate.verifySchool(), true, "ѧ�������Ƿ�������ʾ");
    }

    /**
     * ����ѧ��Tab
     */
    @Test(priority = 5)
    public void testSchoolTab() {
        for (int i = 0; i < IndexPage.SCHOOL_TAB_FLAG_TEXT.length; i++) {
            Assertion.verifyEquals(indexOperate.verifySchoolTab(i), true, "ѧ��Tab" + IndexPage.SCHOOL_TAB_FLAG_TEXT[i] + "�Ƿ�����");
        }
    }


    /**
     * ����ʵ��
     */
    @Test(priority = 6)
    public void testInspection() {
        Assertion.verifyEquals(indexOperate.verifyInspection(), true, "�Բ��Ƿ�������ʾ");
    }

    /**
     * ���Լ໤
     */
    @Test(priority = 7)
    public void testIntentcare() {
        indexOperate.verifyIntentcare();
    }

    /**
     * ������Ϣ����
     */
    @Test(priority = 8)
    public void testNoticeCenter() {
        Assertion.verifyEquals(indexOperate.verifyNoticeCenter(), true, "������Ϣ�����Ƿ�����");
    }

}
