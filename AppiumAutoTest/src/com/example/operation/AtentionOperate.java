package com.example.operation;

import com.example.pages.AtentionPage;
import com.tbkt.base.OperateAppium;

import io.appium.java_client.android.AndroidDriver;

/**
 * Created by LITP on 2016/9/28.
 */

public class AtentionOperate extends OperateAppium {

	private AtentionPage page;

	public AtentionOperate(AndroidDriver androidDriver) {
		super(androidDriver);
		page = new AtentionPage(androidDriver);
	}

	/**
	 * ��֤ȡ����ער��
	 * 
	 * @return
	 */
	public boolean verifyCanle() {
		if (clickView(page.getHeadElement())) {
			// ���ȡ����ע
			if (clickView(page.getAtentionElement())) {
				String name = page.getCardNameElement().getText();
				if (clickView(page.getReturnListElement())) {
					return page.isTextExist(name);
				}
			}
		}

		return false;
	}

	/**
	 * �Ƿ����ר��
	 * 
	 * @return
	 */
	private boolean isExistExpert() {
		if (page.getRefreshElement() == null) {
			if (page.getHeadElement() == null) {
				// û�й�ער��
				return false;
			}
		} else if (page.getHeadElement() != null) {
			return true;
		}
		return false;
	}

}
