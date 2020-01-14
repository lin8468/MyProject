package com.example.cases;

import com.example.operation.AtentionOperate;
import com.example.operation.LoginOperate;
import com.tbkt.base.InitAppium;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * ��ע���� Created by LITP on 2016/9/28.
 */

public class Atention extends InitAppium {

	private AtentionOperate operate;

	private LoginOperate loginOperate;

	@BeforeClass
	public void initDriver() {

		Assert.assertNotNull(driver);
		loginOperate = new LoginOperate(driver);
		operate = new AtentionOperate(driver);

	}

	@Test
	private void Login() throws InterruptedException {
		// �����ȵ�¼��
		boolean flag = loginOperate.login("18737130173", "zabmw123456");

		// �����Ƿ�ɹ���¼
		Assert.assertTrue(flag);
	}

}
