package com.example.pages;

import com.tbkt.base.PageAppium;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

/**
 * Created by LITP on 2016/9/28.
 */

public class AtentionPage extends PageAppium {


    public AtentionPage(AndroidDriver androidDriver) {
        super(androidDriver);
    }



    //�й�ע���˵�ͷ��id
    private final String HEAD_FLAG_ID = "doctor_item_iv_avatar";

    //ȡ����ע��ť
    private final String ATENTION_FLAG_ID = "attention_component_textview";
    //���ع�ע�б�ť
    private final String RETURN_LIST_FLAG_ID = "personal_card_close";

    //����ˢ�µ�text
    private final String REFRESH_FLAG_ID = "xlistview_header_hint_textview";

    //���Ͽ�����Id
    private final String CARD_NAME_FLAG_ID = "personal_card_name";



    public AndroidElement getHeadElement(){
        return findById(HEAD_FLAG_ID);

    }

    public AndroidElement getWaitHeadElement(){
        return waitAutoById(HEAD_FLAG_ID,5);

    }

    /**
     * ��ȡ����ˢ�µ��ı��ؼ�
     * @return
     */
    public AndroidElement getRefreshElement(){
        return findById(REFRESH_FLAG_ID);
    }


    /**
     * ��ȡ��ע�İ�ť�ؼ�
     * @return
     */
    public AndroidElement getAtentionElement(){
        return findById(ATENTION_FLAG_ID);
    }

    /**
     * ��ȡ��ע�İ�ť�ؼ�
     * @return
     */
    public AndroidElement getReturnListElement(){
        return findById(RETURN_LIST_FLAG_ID);
    }


    /**
     * ��ȡ���Ͽ����ı��ؼ�
     * @return
     */
    public AndroidElement getCardNameElement(){
        return findById(CARD_NAME_FLAG_ID);
    }


}
