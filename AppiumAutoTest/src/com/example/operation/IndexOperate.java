package com.example.operation;

import com.example.base.Assertion;
import com.example.pages.IndexPage;
import com.tbkt.base.OperateAppium;

import io.appium.java_client.android.AndroidDriver;

/**
 * Created by LITP on 2016/9/23.
 */

public class IndexOperate extends OperateAppium {

    private IndexPage indexPage;

    public IndexOperate(AndroidDriver androidDriver) {
        super(androidDriver);
        indexPage = new IndexPage(androidDriver);
    }


    /**
     * �������һ���
     */
    public boolean verfiySwip() {


        //ר��
        swipeToLeft(1000);

        //ѧ��tab1
        swipeToLeft(1000);


        sleep(1000);
        //ѧ��tab2
        swipeToLeft(1000);
        //ѧ��tab3
        swipeToLeft(1000);
        //ѧ��tab4
        swipeToLeft(1000);
        //�Բ�
        swipeToLeft(1000);

        if (indexPage.isTextExist("�໤")) {
            //���ڼ໤���Ǽ໤���ˣ�������һ��
            swipeToLeft(1000);
        }


        //������Ϣ����
        swipeToLeft(1000, 10);

        //�ص��Բ飬���ÿ������
        swipeToRight(1000, 10);


        //
        return true;

    }


    /**
     * ��֤��������
     */
    public boolean verifyPersonCenter() {
        swipeToRight(1000, 10);
        return indexPage.isCurrPersonCenter();
    }


    /**
     * ��֤��ҳ
     */
    public boolean verifyMain() {

        //goMain();

        //���
        clickView(indexPage.findByXpath("//android.widget.TextView[@text='��ҳ']"), "�ײ���ҳ��ť");
        return indexPage.isCurrExpertMain() || indexPage.isCurrNotExpertMain();
    }


    /**
     * ��֤ר������
     */
    public boolean verifyExpertSearch() {

        //goMain();
        String xpath = "//android.widget.TextView[@text='ר��']";
        if(waitAutoByXp(xpath,1) == null){
            press();   //�������
        }

        //���
        clickView(indexPage.findByXpath(xpath), "�ײ�ר���ı��ؼ�");
        return indexPage.isCurrExpertSearch();
    }


    /**
     * ��֤ѧ��
     */
    public boolean verifySchool() {

        //goMain();

        //���
        clickView(indexPage.findByXpath("//android.widget.TextView[@text='ѧ��']"), "�ײ�ѧ���ı��ؼ�");

        return indexPage.isCurrSchool();
    }

    /**
     * ��֤ѧ����tab
     */
    public boolean verifySchoolTab(int flag){
        //verifySchool();
        String name = indexPage.getSCHOOL_TAB_FLAG_TEXT()[flag];
        if(clickView(indexPage.findByXpath("//android.widget.TextView[@text='"+name+"']"), "���ѧ��tab"+name)){
            return indexPage.isCurrSchool();
        }else{
            return false;
        }

    }




    /**
     * ��֤�Բ�
     */
    public boolean verifyInspection() {

        //goMain();

        //���
        clickView(indexPage.findByXpath("//android.widget.TextView[@text='ʵ��']"), "�ײ�ʵ���ı��ؼ�");
        return indexPage.isCurrInspection();
    }


    /**
     * ��֤�໤
     */
    public void verifyIntentcare() {
        //goMain();
        if (indexPage.isExistIntentcare()) {
            //���
            clickView(indexPage.findByXpath("//android.widget.TextView[@text='�໤']"), "�ײ��໤�ı��ؼ�");
            boolean flag =  indexPage.isCurrIntentcare();
            Assertion.verifyEquals(flag, true);
        }else{
            print("�໤������!");
        }
    }

    /**
     * ��֤��Ϣ����
     */
    public boolean verifyNoticeCenter() {
        //������Ϣ����
        swipeToLeft(1000, 10);

        return indexPage.isCurrNotice();


    }


    /**
     * �ر����Ҳ໬
     */
    public void goMain() {
        if (indexPage.isCurrPersonCenter()) {
            //�ص���ҳ
            swipeToLeft(1000, 9);
        } else if (indexPage.isCurrNotice()) {
            //�ر���Ϣ����
            swipeToRight(1000, 10);
        }
    }
}
