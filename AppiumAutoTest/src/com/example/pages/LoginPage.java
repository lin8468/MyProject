package com.example.pages;

import java.util.List;

import com.tbkt.base.PageAppium;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

/**
 * ui�����࣬���������ﴦ��
 * Created by LITP on 2016/9/22.
 */
public class LoginPage extends PageAppium {

    //��¼����ĵ�¼��ť
    public final String LOGIN_BUTTON_ID = "login_btn_login";
    //��һ���ĵ�¼��ť
    public final String WELCOME_LOGIN_BUTTON_ID = "welcome_login_btn";

    //�ɹ���¼����ҳ��ʶ
    public final String INDEX_TEXT = "��ҳ";

    //�Ƿ��ڹ�������ʶ
    public final String ABOUT_TEXT = "AboutActivity";

    //����ҳ��İ�ťid
    public final String ABOUT_BUTTON_ID = "about_go_button";


    //�ʺ�����ؼ�
    public final String NAME_PASS_ELEMENT = "android.widget.EditText";
    //��ҳ�ؼ�
    public final String INDEX_ELEMENT = "tl_index";

    //��¼���֮���activity����
    public final String INDEX_ACTIVITY_NAME = "IndexActivity";

    public LoginPage(AndroidDriver driver){
        super(driver);
    }


    /**
     * �Ƿ��ڻ�ӭ����
     */
    public boolean isWelcome(){
        return isIdElementExist(WELCOME_LOGIN_BUTTON_ID,3,true);
    }


    /**
     * ��ȡ���ڽ����activity������
     * @return
     */
    public String getAboutText(){
        return ABOUT_TEXT;
    }


    /**
     * ��ȡ���ڽ���İ�ť
     * @return
     */
    public AndroidElement getAboutButton(){
        return waitAutoById(ABOUT_BUTTON_ID);
    }


    public AndroidElement getWelcmoeLoginButton(){
        return findById(WELCOME_LOGIN_BUTTON_ID);
    }


    public AndroidElement getLoginButton(){
        return findById(LOGIN_BUTTON_ID);
    }

    /**
     * ��ȡ�˺������Ŀؼ�
     * @return
     */
    public List<AndroidElement> getNamePassElement(){
        return getManyElementByClassName(NAME_PASS_ELEMENT,2);
    }


    /**
     * ��ҳ��ʶ���Ƿ�ɹ���¼
     * @return
     */
    public boolean getIndexflag(){
        /*AndroidElement element =  waitAutoByXp(LoginPage.INDEX_TEXT);
        return  element != null;*/

        AndroidElement element = findById(INDEX_ELEMENT);
        return element != null;
    }


    /**
     * ��ȡ��ҳ��һ��Ԫ�أ��ò�������ȴ�
     */
    public String getIndexElementId(){
        return INDEX_ELEMENT;
    }

    /**
     * ��ȡ��ҳ��һ��Ԫ�أ��ò�������ȴ�
     */
    public AndroidElement getIndexElement(){
        return findById(INDEX_ELEMENT);
    }


    public String getIndexActivity(){
        return INDEX_ACTIVITY_NAME;
    }

}
