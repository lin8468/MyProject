package com.example.pages;

import com.tbkt.base.PageAppium;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

/**
 * Created by LITP on 2016/9/28.
 */

public class ModifyPersonDataPage extends PageAppium {

	public ModifyPersonDataPage(AndroidDriver androidDriver) {
		super(androidDriver);
	}

	// ͷ���������ĸ�����ҳ��ť��id
	private final String PERSON_HEADER_LEFT = "headerleft_iv_l";

	// ������ĸ������ϰ�ť��id
	private final String PERSON_DATA_ID = "slidingmenu_personal";

	// �������Ͻ����TextView�ı���ʶ
	private final String PERSON_DATA_FLAG_TEXT = "������Ϣ";

	// ͷ���ImageView�� id
	private final String AVATAR_FLAG_ID = "my_slidingmenu_avatar";
	// �����ϴ����Ա��� Button�� id
	private final String AVATAR_TAKE_PHOTO_FLAG_ID = "popwindow_otherfeedlist_htv_male";
	// ͼ���ϴ����Ա�Ů Button�� id
	private final String AVATAR_SELECT_PHOTO_FLAG_ID = "popwindow_otherfeedlist_htv_female";
	// ȡ��ѡ��� id
	private final String AVATAR_CANCLE_FLAG_ID = "popwindow_otherfeedlist_htv_cancel";

	// �����ϴ�ͷ���Ȩ�޵�������ťid
	private final String AVATAR_ALBUM_TEXT = "���";
	// ����һ��ͼƬid
	private final String AVATAR_ALBUM_PIC_ID = "com.miui.gallery:id/pick_num_indicator";

	// �����ϴ�ͷ���Ȩ�޵�������ťid
	private final String AVATAR_PERMISSION_BUTTON_ID = "android:id/button1";
	// ���հ�ť
	// private final String AVATAR_TAKE_BUTTON_ID =
	// "com.android.camera:id/v6_shutter_button_internal";
	private final String AVATAR_TAKE_BUTTON_ID = "com.android.camera:id/shutter_button";
	// ȷ����Ƭ��ť
	// private final String AVATAR_SURE_PHOTO_BUTTON_ID =
	// "com.android.camera:id/v6_btn_done";
	private final String AVATAR_SURE_PHOTO_BUTTON_ID = "com.android.camera:id/btn_done";
	// �ü�ȷ����Ƭ��ť
	private final String AVATAR_SURE_CROP_PHOTO_BUTTON_ID = "headeright_htv_r";

	// �޸����ֵ�EditText�� id ��û�У�ֱ��ʹ��input��
	// private final String PERSON_DATA_CHANGE_NAME_FLAG_ID =
	// "my_slidingmenu_name";
	// ȷ���޸����ֵ�Button�� id
	private final String CHANGE_NAME_FLAG_ID = "dialog_generic_btn_button2";

	// �������Ա𡢡����ڡ������TextView
	private final String REGISTER_FLAG_ID = "reg_baseinfo_et";

	private final String NAME_TEXT = "����";
	private final String SEX_TEXT = "�Ա�";
	private final String DATE_TEXT = "��������";
	private final String EMAIL_TEXT = "����";
	
	// �����յ�id
	private final String YEAR_FLAG_ID = "year", MONTH_FLAG_ID = "month",
			DAY_FLAG_ID = "day";
	// ȷ���޸������հ�ťid
	private final String BIRTH_SURE_FLAG_ID = "birthday_window_btn_sure";

	// �ύ��ťButton�� id
	private final String SUBMIT_FLAG_ID = "apply_btn_commit";

	// �Ա��а�ť��id
	private final String MALE_BUTTON_ID = "popwindow_otherfeedlist_htv_male";
	// �Ա�Ů��ť��id
	private final String FEMALE_BUTTON_ID = "popwindow_otherfeedlist_htv_female";

//	private final String NAME_TEXT = "����";
//	private final String SEX_TEXT = "�Ա�";
//	private final String DATE_TEXT = "��������";
//	private final String EMAIL_TEXT = "����";
//	/**
//	 *   ��ȡ�޸�������ť
//	 * @return
//	 */
//	public AndroidElement getChangeNameButton (){
//		return findByName(NAME_TEXT);
//	}
//	/**
//	 *   ��ȡ�޸��Ա�ť
//	 * @return
//	 */
//	public AndroidElement getChangeSexButton (){
//		return findByName(SEX_TEXT);
//	}
//	/**
//	 *   ��ȡ�޸����հ�ť
//	 * @return
//	 */
//	public AndroidElement getChangeDateButton (){
//		return findByName(DATE_TEXT);
//	}
//	/**
//	 *   ��ȡ�޸�email��ť
//	 * @return
//	 */
//	public AndroidElement getChangeEmailButton (){
//		return findByName(EMAIL_TEXT);
//	}
	
	/**
	 * ��ȡ�Ա��а�ť
	 * 
	 * @return
	 */
	public AndroidElement getMaleButtomElement() {
		return findById(MALE_BUTTON_ID);
	}

	/**
	 * ��ȡ�Ա�Ů��ť
	 * 
	 * @return
	 */
	public AndroidElement getFemaleButtomElement() {
		return findById(FEMALE_BUTTON_ID);
	}

	/**
	 * ��ȡͷ���������ĸ�����ҳ��ť
	 * 
	 * @return
	 */
	public AndroidElement getHeaderLeftElement() {
		return findById(PERSON_HEADER_LEFT);
	}

	/**
	 * ��ȡ��������ϴ� ��ť
	 * 
	 * @return
	 */
	public AndroidElement getTakePhotoElement() {
		return findById(AVATAR_TAKE_PHOTO_FLAG_ID);
	}

	/**
	 * ��ȡ���ͼ���ϴ���ť
	 * 
	 * @return
	 */
	public AndroidElement getSelectPhotoElement() {
		return findById(AVATAR_SELECT_PHOTO_FLAG_ID);
	}

	/**
	 * ��ȡѡ��ͼƬ�����
	 * 
	 * @return
	 */
	public AndroidElement getAlbumElement() {
		return findByXpath("//android.widget.TextView[@text='"
				+ AVATAR_ALBUM_TEXT + "']");
	}

	/**
	 * ��ȡ�������Ƭ��id
	 * 
	 * @return
	 */
	public AndroidElement getAlbumPicElement() {
		return findByFullId(AVATAR_ALBUM_PIC_ID);
	}

	/**
	 * ��ȡ����Ȩ�ް�ť
	 * 
	 * @return
	 */
	public AndroidElement getPermissionElement() {
		return findByFullId(AVATAR_PERMISSION_BUTTON_ID);
	}

	/**
	 * ��ȡ���հ�ť
	 * 
	 * @return
	 */
	public AndroidElement getMIUITakePhotoElement() {
		return findByFullId(AVATAR_TAKE_BUTTON_ID);
	}

	/**
	 * ��ȡȷ����Ƭ��ť
	 * 
	 * @return
	 */
	public AndroidElement getSurePhotoElement() {
		return findByFullId(AVATAR_SURE_PHOTO_BUTTON_ID);
	}

	/**
	 * ��ȡȷ���ü���Ƭ��ť
	 * 
	 * @return
	 */
	public AndroidElement getSureCropPhotoElement() {
		return waitAutoById(AVATAR_SURE_CROP_PHOTO_BUTTON_ID, 5);
	}

	/**
	 * ��ȡͷ��ؼ�
	 * 
	 * @return
	 */
	public AndroidElement getAvatarElement() {
		return findById(AVATAR_FLAG_ID);
	}

	/**
	 * ������Ƿ���ڸ������ϵİ�ťid
	 * 
	 * @return
	 */
	public AndroidElement getPersonDataElement() {
		return findById(PERSON_DATA_ID);
	}

	/**
	 * �Ƿ��ڸ������Ͻ���
	 * 
	 * @return
	 */
	public boolean isAlivePersonData() {
		return isXpathExist("//android.widget.TextView[@text='"
				+ PERSON_DATA_FLAG_TEXT + "']");
	}

	/**
	 * ��ȡ�������ֵĿؼ�
	 * 
	 * @return
	 */
	public AndroidElement getNameEditElement() {
		return findByClassName("android.widget.EditText");
	}

	/**
	 * ��ȡȷ���޸����ֵĿؼ�
	 * 
	 * @return
	 */
	public AndroidElement getNameSureElement() {
		return findById(CHANGE_NAME_FLAG_ID);
	}

	/**
	 * ��ȡ������TextView�ؼ�
	 * 
	 * @return
	 */
	public AndroidElement getNameElement() {
		return getListOneElementById(REGISTER_FLAG_ID, 0);
	}
	/**
	 * ��ȡ�Ա��TextView�ؼ�
	 * 
	 * @return
	 */
	public AndroidElement getSexElement() {
		return getListOneElementById(REGISTER_FLAG_ID, 1);
	}

	/**
	 * ��ȡ�������ڵ�TextView�ؼ�
	 * 
	 * @return
	 */
	public AndroidElement getBirthElement() {
		return getListOneElementById(REGISTER_FLAG_ID, 2);
	}

	/**
	 * ��ȡ��ؼ�
	 * 
	 * @return
	 */
	public AndroidElement getYearElement() {
		return findById(YEAR_FLAG_ID);

	}

	/**
	 * ��ȡ�¿ؼ�
	 * 
	 * @return
	 */
	public AndroidElement getMonthElement() {
		return findById(MONTH_FLAG_ID);

	}

	/**
	 * ��ȡ�տؼ�
	 * 
	 * @return
	 */
	public AndroidElement getDayElement() {
		return findById(DAY_FLAG_ID);

	}

	/**
	 * ��ȡȷ���޸����ڿؼ�
	 * 
	 * @return
	 */
	public AndroidElement getSureBirthElement() {
		return findById(BIRTH_SURE_FLAG_ID);

	}

	/**
	 * ��ȡ�����TextView�ؼ�
	 * 
	 * @return
	 */
	public AndroidElement getEmailElement() {
		return getListOneElementById(REGISTER_FLAG_ID,3);
	}

	/**
	 * ��ȡ�ύButton�ؼ�
	 * 
	 * @return
	 */
	public AndroidElement getSubmitElement() {
		return findById(SUBMIT_FLAG_ID);
	}

}
