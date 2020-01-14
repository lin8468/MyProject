package com.example.operation;

import org.openqa.selenium.By;

import com.example.pages.LoginPage;
import com.tbkt.base.OperateAppium;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

/**
 * ��¼�߼����� Created by LITP on 2016/9/23.
 */

public class LoginOperate extends OperateAppium {

	private LoginPage loginPage;

	AndroidDriver driver;

	public LoginOperate(AndroidDriver driver) {
		super(driver);
		loginPage = new LoginPage(driver);
		this.driver = driver;
	}

	/**
	 * �����ʺ�����
	 * 
	 * @param name
	 *            �ʺ�
	 * @param pass
	 *            ����
	 * @return �Ƿ�ɹ���¼����ҳ
	 */
	public boolean login(String name, String pass) {

		sleep(1000);

		if (getCurrActivity().equals(loginPage.getAboutText())) {// �Ƿ��ڻ�ӭҳ��
			print("���ڽ���");
			for (int i = 0; i < 4; i++) {
				swipeToLeft(300);
				sleep(500);
			}
			clickView(loginPage.getAboutButton());
			// �����ӭҳ��ĵ�¼
			clickView(loginPage.getWelcmoeLoginButton());

		} else if (loginPage.isWelcome()) {// �ڻ�ӭ����
			print("�����¼");
			clickView(loginPage.getWelcmoeLoginButton());
		} else if (loginPage.getLoginButton() == null) {// �Զ���¼�˾�����ɹ�������
		// clickView((AndroidElement) driver
		// .findElementByXPath("//android.widget.ImageView[@resource-id='com.minstone.mdoctor:id/headerleft_iv_l']"));
		// sleep(500);
		// clickView((AndroidElement) driver
		// .findElementByXPath("//android.widget.TextView[@text='ע����¼']"));
		// sleep(500);
		// clickView((AndroidElement) driver
		// .findElementByXPath("//android.widget.Button[@text='ȷ��']"));
		// print("�Զ���¼�ˣ�����,ִ��ע��");
			return true;
		}

		// ��������
		inputManyText(name, pass);

		// �����¼
		clickView(loginPage.getLoginButton());

		// �ȴ�����ҳ
		waitAutoById(loginPage.getIndexElementId());

		// ����ڵ�¼��Ľ���û�е�һ���͵��һ���м䣬�ر�������
		if (loginPage.getIndexElement() == null
				&& getCurrActivity().equals(loginPage.getIndexActivity())) {
			press();
		}
		// �����Ƿ�ɹ�����ҳ
		return loginPage.getIndexflag();
	}

}
