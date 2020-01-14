package com.example.cases;

import com.example.base.Assertion;
import com.example.operation.ModifyPersonDataOperate;
import com.tbkt.base.InitAppium;
import com.example.operation.LoginOperate;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * �޸ĸ������� Created by LITP on 2016/9/27.
 */

public class ModifyPersonData extends InitAppium {

	private LoginOperate loginOperate;

	private ModifyPersonDataOperate operate;

	@BeforeClass
	public void initDriver() {

		Assert.assertNotNull(driver);
		loginOperate = new LoginOperate(driver);
		operate = new ModifyPersonDataOperate(driver);
	}

	@Test
	public void Login() throws InterruptedException {
		// �����ȵ�¼��
		boolean flag = loginOperate.login("18737130173", "zabmw123456");

		// �����Ƿ�ɹ���¼
		Assert.assertTrue(flag);
	}

	/**
	 * �Ƿ�����û�����ҳ��
	 */
	@Test
	private void testIntoPersonPage() {
		Assertion.verifyEquals(operate.verfiyIntoPage(), true, "��֤�Ƿ�����˸������Ͻ���");
	}

	/**
	 * ��֤�޸�����
	 */
	@Test(priority = 1)
	private void testChangeName() {
		Assertion.verifyEquals(operate.verfiyChangeName("�Զ�������"), true,
				"��֤�޸�����");
	}

	/**
	 * ��֤�޸�ͷ��
	 */
	@Test(priority = 2)
	private void testChangeAvatar() {
		Assertion.verifyEquals(operate.verfiyChangeAvatarTake(), true,
				"��֤�����޸�ͷ��");
		Assertion.verifyEquals(operate.verfiyChangeAvatarSelect(), true,
				"��֤ͼ��ѡ���޸�ͷ��");
	}

	/**
	 * ��֤�޸��Ա�
	 */
	@Test(priority = 3)
	private void testChangeSex() {
		Assertion.verifyEquals(operate.verfiyChangeSexMale(), true, "��֤�������Ա�");
		Assertion
				.verifyEquals(operate.verfiyChangeSexFemale(), true, "��֤����Ů�Ա�");

	}

	/**
	 * ��֤�޸ĳ�������
	 */
	@Test(priority = 4)
	private void testChangeBirth() {
		Assertion.verifyEquals(operate.verfiyChangeBirth(), true, "��֤����Ůͷ��");

	}

	/**
	 * ��֤�޸�����
	 */
	@Test(priority = 5)
	private void testChangeEmail() {
		Assertion.verifyEquals(operate.verfiyChangeEmail("524097566@qq.com"),
				true, "��֤��������");
	}

	/**
	 * ��֤�ύ
	 */
	@Test(priority = 6)
	private void testSubmit() {
		Assertion.verifyEquals(operate.verfiySubmit(), true, "��֤�ύ");
	}

}
