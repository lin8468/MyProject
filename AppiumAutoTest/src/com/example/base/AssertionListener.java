package com.example.base;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by LITP on 2016/9/21.
 */

public class AssertionListener extends TestListenerAdapter {

	/**
	 * ���Է�����ʼ��ʱ��ص�
	 * 
	 * @param result
	 */
	@Override
	public void onTestStart(ITestResult result) {
		Assertion.flag = true;
		Assertion.errors.clear();
	}

	/**
	 * ������ֹʱ��ص�
	 * 
	 * @param tr
	 */
	@Override
	public void onTestFailure(ITestResult tr) {
		this.handleAssertion(tr);
	}

	/**
	 * Test���� ��ʱ��ִ��
	 * 
	 * @param tr
	 */
	@Override
	public void onTestSkipped(ITestResult tr) {
		this.handleAssertion(tr);
	}

	/**
	 * Test�������ʱ��ִ��
	 * 
	 * @param tr
	 */
	@Override
	public void onTestSuccess(ITestResult tr) {
		this.handleAssertion(tr);
	}

	private int index = 0; // �����к�

	/**
	 * ������ԣ�ÿ��Testִ����ϻص�
	 * 
	 * @param tr
	 *            ���Խ��
	 */
	private void handleAssertion(ITestResult tr) {
		if (!Assertion.flag) { // Ϊ�٣����Ƕ��Գ����˾�ִ�������
			// ��ȡ�쳣
			Throwable throwable = tr.getThrowable();
			if (throwable == null) {
				throwable = new Throwable();
			}
			// ��ȡ�쳣��ջ��Ϣ
			StackTraceElement[] traces = throwable.getStackTrace();

			// ����Ҫ��������ж�ջ��Ϣ
			StackTraceElement[] alltrace = new StackTraceElement[0];

			// ѭ����ȡ���Ե��쳣��Ϣ��
			for (Error e : Assertion.errors) {
				// ��ȡ����Ķ�ջ������Ϣ
				StackTraceElement[] errorTraces = e.getStackTrace();
				//
				StackTraceElement[] et = getKeyStackTrace(tr, errorTraces);
				// �����쳣��Ϣ��ջ����
				StackTraceElement[] message = handleMess(e.getMessage(), tr);

				// �кų�ʼ��Ϊ0
				index = 0;
				// ��ջ��Ϣ�ϲ�
				alltrace = merge(alltrace, message);
				alltrace = merge(alltrace, et);
			}

			// ����쳣��Ϣ��Ϊ��
			if (traces != null) {
				traces = getKeyStackTrace(tr, traces);
				alltrace = merge(alltrace, traces);
			}

			// �����쳣��Ϣ
			throwable.setStackTrace(alltrace);
			tr.setThrowable(throwable);

			// ���
			Assertion.flag = true;
			Assertion.errors.clear();

			// ����쳣��Ϣ
			tr.setStatus(ITestResult.FAILURE);
		}
	}

	/**
	 * ��ȡ��ջ��Ϣ
	 * 
	 * @param tr
	 * @param stackTraceElements
	 * @return
	 */
	private StackTraceElement[] getKeyStackTrace(ITestResult tr,
			StackTraceElement[] stackTraceElements) {

		List<StackTraceElement> ets = new ArrayList<>();
		// ѭ����ȡ��Ϣ
		for (StackTraceElement stackTraceElement : stackTraceElements) {
			// ���ز�����Ķ�ջ��Ϣ
			if (stackTraceElement.getClassName().equals(
					tr.getTestClass().getName())) {
				ets.add(stackTraceElement);
				index = stackTraceElement.getLineNumber(); // �����к�
			}
		}
		return ets.toArray(new StackTraceElement[ets.size()]);

	}

	/**
	 * �ϲ�������ջ��Ϣ
	 * 
	 * @param traces1
	 *            ��һ��
	 * @param traces2
	 * @return
	 */
	private StackTraceElement[] merge(StackTraceElement[] traces1,
			StackTraceElement[] traces2) {

		StackTraceElement[] result = Arrays.copyOf(traces1, traces1.length
				+ traces2.length);
		System.arraycopy(traces2, 0, result, traces1.length, traces2.length);
		return result;
	}

	/**
	 * ������Ϣ��ʾ����
	 * 
	 * @param mess
	 *            ������Ϣ
	 * @param tr
	 *            �������
	 * @return
	 */
	private StackTraceElement[] handleMess(String mess, ITestResult tr) {
		String message = "\n������Ϣ: " + mess;
		String method = "\n��������:" + tr.getMethod().getMethodName();
		String className = "\n������:"
				+ tr.getTestClass().getRealClass().getSimpleName();
		return new StackTraceElement[] { new StackTraceElement(message, // ����
				method, // ������
				className + "\n�����к�", // �ļ���
				index) };
	}
}