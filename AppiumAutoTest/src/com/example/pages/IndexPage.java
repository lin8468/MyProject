package com.example.pages;

import com.tbkt.base.PageAppium;

import io.appium.java_client.android.AndroidDriver;

/**
 * ��ҳ��ҳ��ʵ��
 * Created by LITP on 2016/9/23.
 */

public class IndexPage extends PageAppium {


    public IndexPage(AndroidDriver androidDriver) {
        super(androidDriver);
    }

    //�������Ľ�����ı�
    private final String PERSON_FLAG_TEXT = "�˳�Ӧ��";
    //�������Ľ����ID
    private final String PERSON_FLAG_ID = "my_slidingmenu_avatar";


    //����ר����ҳ��ID
    private final String INDEX_FLAG_NOT_EXPERT_ID = "expert_listview";
    //ר����ҳ��ID
    private final String INDEX_FLAG_EXPERT_ID = "expert_article_listview";


    //��ҳר������ҳ���ID
    private final String SERVER_FLAG_ID = "search_expert_et";


    //ѧ��ҳ��ÿһ��item���ֲ�ID
    private final String SCHOOL_FLAG_ID = "view_pager_school_advert_layout";
    //ѧ��ҳ���ж��ı�
    private final String SCHOOL_FLAG_TEXT = "�ҵ��ղ�";
    //ѧ��ҳ��tab1����ı�
    public  static  final String[] SCHOOL_TAB_FLAG_TEXT = {"��������","����ѧϰ","ǰ����Ѷ","���߷���"};

    //�Բ�ҳ����ı�
    private final String INSPECTION_FLAG_TEXT = "�������";
    //�Բ�ҳ���ж�id
    private final String INSPECTION_FLAG_ID = "inspection_search_et";


    //�໤ҳ����ڵı�ʶ�ı�
    private final String INTENSIVECARE_ALIVE_TEXT_FLAG = "�໤";
    //�໤ҳ���ж��ı�
    private final String INTENSIVECARE_FLAG_TEXT = "��д�໤��¼";
    //�໤ҳ����سɹ��ı����id
    private final String INTENSIVECARE_FLAG_ID = "reg_baseinfo_et";


    //��Ϣ����ҳ����ı�
    private final String NOTICE_FLAG_TEXT = "��Ϣ����";
    //��Ϣ����ҳ���id
    private final String NOTICE_FLAG_ID = "empty_conversation_tv";


    public String getPERSON_FLAG_ID() {
        return PERSON_FLAG_ID;
    }

    public String[] getSCHOOL_TAB_FLAG_TEXT() {
        return SCHOOL_TAB_FLAG_TEXT;
    }



    /**
     * �Ƿ��ڸ������ĵĽ���
     * @return
     */
    public boolean isCurrPersonCenter(){
        return isIdElementExist(PERSON_FLAG_ID);
    }


    /**
     * �Ƿ���ר����ҳ�Ľ���
     * @return
     */
    public boolean isCurrExpertMain(){
        return isIdElementExist(INDEX_FLAG_EXPERT_ID);
    }

    /**
     * �Ƿ��ڷ�ר����ҳ�Ľ���
     * @return
     */
    public boolean isCurrNotExpertMain(){
        return isIdElementExist(INDEX_FLAG_NOT_EXPERT_ID);
    }


    /**
     * ��ҳ�Ƿ���ר������ҳ��
     * @return
     */
    public boolean isCurrExpertSearch(){
        return isIdElementExist(SERVER_FLAG_ID);
    }


    /**
     * ��ҳ�Ƿ���ѧ��ҳ��
     * @return
     */
    public boolean isCurrSchool(){
        return waitAutoById(SCHOOL_FLAG_ID,5) != null;
    }



    /**
     * ��ҳ�Ƿ����Բ�ҳ��
     * @return
     */
    public boolean isCurrInspection(){
        return isIdElementExist(INSPECTION_FLAG_ID);
    }


    /**
     * ��ҳ�Ƿ��ڼ໤ҳ��
     * @return
     */
    public boolean isCurrIntentcare(){
        return isIdElementExist(INTENSIVECARE_FLAG_ID);
    }


    /**
     * ��ҳ�Ƿ��ڼ໤ҳ��
     * @return
     */
    public boolean isExistIntentcare(){
        return isTextExist(INTENSIVECARE_ALIVE_TEXT_FLAG);
    }


    /**
     * ��ҳ�Ƿ�����Ϣ����ҳ��
     * @return
     */
    public boolean isCurrNotice(){
        return isIdElementExist(NOTICE_FLAG_ID);
    }





    public String getPERSON_FLAG_TEXT() {
        return PERSON_FLAG_TEXT;
    }


    public String getSERVER_FLAG_ID() {
        return SERVER_FLAG_ID;
    }

    public String getSCHOOL_FLAG_ID() {
        return SCHOOL_FLAG_ID;
    }


    public String getNOTICE_FLAG_TEXT() {
        return NOTICE_FLAG_TEXT;
    }

    public String getINTENSIVECARE_ALIVE_TEXT_FLAG() {
        return INTENSIVECARE_ALIVE_TEXT_FLAG;
    }

    public String getINDEX_FLAG_NOT_EXPERT_ID() {
        return INDEX_FLAG_NOT_EXPERT_ID;
    }

    public String getINDEX_FLAG_EXPERT_ID() {
        return INDEX_FLAG_EXPERT_ID;
    }

    public String getSCHOOL_FLAG_TEXT() {
        return SCHOOL_FLAG_TEXT;
    }

    public String getINSPECTION_FLAG_TEXT() {
        return INSPECTION_FLAG_TEXT;
    }

    public String getINSPECTION_FLAG_ID() {
        return INSPECTION_FLAG_ID;
    }

    public String getINTENSIVECARE_FLAG_TEXT() {
        return INTENSIVECARE_FLAG_TEXT;
    }

    public String getINTENSIVECARE_FLAG_ID() {
        return INTENSIVECARE_FLAG_ID;
    }

    public String getNOTICE_FLAG_ID() {
        return NOTICE_FLAG_ID;
    }
}
