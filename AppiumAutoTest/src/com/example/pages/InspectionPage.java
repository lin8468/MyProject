package com.example.pages;

import com.tbkt.base.PageAppium;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

/**
 * Created by LITP on 2016/9/30.
 */

public class InspectionPage extends PageAppium {

    public InspectionPage(AndroidDriver androidDriver) {
        super(androidDriver);
    }


    public final String INSPECTION_FLAG_TEXT = "�Բ�";

    //�Բ�ҳ���ж�id
    private final String INSPECTION_FLAG_ID = "inspection_search_et";
    //��������Ƿ�ɹ�id��ʶ
    private final String SEARCH_SUCCESS_FLAG_ID = "inspection_listtitle";

    //�Ƿ����������
    private final String SEARCH_RESULT_SUCCESS_FLAG_ID = "article_item_htv_title";



    public  AndroidElement getSearchElement(){
        return findById(INSPECTION_FLAG_ID);
    }


    public  AndroidElement getInspectionElement(){
        return findByXpath("//android.widget.TextView[@text='"+INSPECTION_FLAG_TEXT+"']");
    }


    public AndroidElement getSearchResultElement(){
        return waitAutoById(SEARCH_SUCCESS_FLAG_ID,5);
    }

    public AndroidElement getSearchResultSuccessElement(){
        return findById(SEARCH_SUCCESS_FLAG_ID);
    }

}
