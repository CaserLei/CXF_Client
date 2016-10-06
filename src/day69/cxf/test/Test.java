package day69.cxf.test;

import day67.cxf.a.LanguageManager;
import day67.cxf.a.LanguageService;

public class Test {
	
	/**
	 * 测试由cxf框架生成的webservie服务
	 * @param args
	 */
	public static void main(String[] args) {
		LanguageManager languageManager=new LanguageManager();
		LanguageService languageServicePort=languageManager.getLanguageServicePort();
		String aa=languageServicePort.getLanguage(1);
		System.out.println(aa);
	}

}
