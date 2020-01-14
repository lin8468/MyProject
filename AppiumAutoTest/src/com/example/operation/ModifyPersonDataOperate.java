package com.example.operation;

import com.example.base.Assertion;
import com.example.pages.ModifyPersonDataPage;
import com.tbkt.base.OperateAppium;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

/**
 * Created by LITP on 2016/9/28.
 */

public class ModifyPersonDataOperate extends OperateAppium {

	private ModifyPersonDataPage page;

	public ModifyPersonDataOperate(AndroidDriver androidDriver) {
		super(androidDriver);
		page = new ModifyPersonDataPage(androidDriver);
	}

	/**
	 * ��֤�����������ҳ��
	 * 
	 * @return
	 */
	public boolean verfiyIntoPage() {
		// swipeToRight(1000, 10);
		clickView(page.getHeaderLeftElement());
		sleep(500);
		clickView(page.getPersonDataElement());
		return page.isAlivePersonData();

	}

	/**
	 * ��֤�޸�����
	 * 
	 * @return
	 */
	public boolean verfiyChangeName(String name) {
		AndroidElement element = page.getNameElement();
		if (clickView(element)) {
			input(page.getNameEditElement(), name);
			if (clickView(page.getNameSureElement())) {
				// �Ա������Ƿ����
				return element.getText().equals(name);
			}
		}
		return false;

	}

	/**
	 * ��֤ͷ��֮�����ϴ�
	 * 
	 * @return
	 */
	public boolean verfiyChangeAvatarTake() {
		if (clickView(page.getAvatarElement())) {
			if (clickView(page.getTakePhotoElement())) {

				// С��note
				clickView(page.getPermissionElement()); // ����Ȩ��
				if (clickView(page.getMIUITakePhotoElement())) { // �������
					if (clickView(page.getSurePhotoElement())) { // ���ȷ����Ƭ
						if (clickView(page.getSureCropPhotoElement(),
								"����ȷ���ü�ͼƬ")) {
							boolean flag = page.isAlivePersonData();
							Assertion.verifyEquals(flag, true, "�����Ƿ�����");
							return flag;
						}
					}
				}

			}
		}
		return false;
	}

	/**
	 * ��֤ͷ��֮ͼ��ѡ��
	 * 
	 * @return
	 */
	public boolean verfiyChangeAvatarSelect() {
		if (clickView(page.getAvatarElement())) {
			if (clickView(page.getSelectPhotoElement())) {

				// С��note
				// clickView(page.getAlbumElement());
				// if (clickView(page.getAlbumPicElement(),"��һ��ͼƬ")) {
				// if (clickView(page.getSureCropPhotoElement(),"ȷ���ü�ͼƬ")) {
				// return page.isAlivePersonData();
				// }
				// }

				// ҹ��ģ����
				clickView(page
						.findByXpath("//android.view.View[1]"));
				sleep(1000);
				clickView(page
						.findByXpath("//android.view.View[1]"));
				// if (clickView(page.getSureCropPhotoElement(), "ȷ���ü�ͼƬ")) {
				return page.isAlivePersonData();
				// }

			}
		}
		return false;
	}

	/**
	 * �����Ա�Ϊ��
	 * 
	 * @return
	 */
	public boolean verfiyChangeSexMale() {
		if (clickView(page.getSexElement())) {
			AndroidElement element = page.getMaleButtomElement();
			String str = element.getText();
			if (clickView(element)) {
				return str.equals(page.getSexElement().getText());
			}
		}
		return false;
	}

	/**
	 * �����Ա�ΪŮ
	 * 
	 * @return
	 */
	public boolean verfiyChangeSexFemale() {

		if (clickView(page.getSexElement())) {
			AndroidElement element = page.getFemaleButtomElement();
			String str = element.getText();
			if (clickView(element)) {
				return str.equals(page.getSexElement().getText());
			}
		}
		return false;
	}

	/**
	 * ��֤��������
	 * 
	 * @return
	 */
	public boolean verfiyChangeBirth() {
		if (clickView(page.getBirthElement())) {
			// ������
			swipOnElement(page.getYearElement(), SWIP_DOWN);
			// ������
			swipOnElement(page.getMonthElement(), SWIP_DOWN);
			// ������
			swipOnElement(page.getDayElement(), SWIP_DOWN);

			print(page.getYearElement().getText() + "��������ı�");
			if (clickView(page.getSureBirthElement())) {
				return page.isAlivePersonData();
			}
		}
		return false;
	}

	/**
	 * ��֤����
	 * 
	 * @return
	 */
	public boolean verfiyChangeEmail(String email) {
		if (clickView(page.getEmailElement())) {
			// ������������ʺ�
			input(page.getNameEditElement(), email);
			if (clickView(page.getNameSureElement())) {
				return page.isAlivePersonData();
			}
		}
		return false;
	}

	/**
	 * ��֤�ύ�������֤����
	 * 
	 * @return
	 */
	public boolean verfiySubmit() {
		return clickView(page.getSubmitElement(), "����ύ");
	}

}
