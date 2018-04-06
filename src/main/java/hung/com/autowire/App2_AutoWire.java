package hung.com.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2_AutoWire {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		ParentBeanAutoWire parentBean = (ParentBeanAutoWire) context.getBean("ParentBeanAutoWire");
		parentBean.showMessage();
	}
}
