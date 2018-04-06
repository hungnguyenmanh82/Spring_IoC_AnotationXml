package hung.com.autowire;

import org.springframework.beans.factory.annotation.Autowired;

public class ParentBeanAutoWire {
	
	/**
	 * @Autowired: nếu dùng ở đây thì ko cần tạo hàm setter nữa
	 * Nhược điểm là sẽ ko debug đc chương trình chạy ở hàm setter
	 */
	private ChildBeanAutoWire childBeanAutoWire;
	private String name;
	
	/**
	 * 
	 * @Autowired: có thể dùng cho cả constructor và setter và biến đc
	 */
	@Autowired
	public void setChildBeanAutoWire(ChildBeanAutoWire childBeanAutoWire) {
		this.childBeanAutoWire = childBeanAutoWire;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void showMessage(){
		System.out.println("ParentBeanAutoWire is called");
		System.out.println("name="+ name);
		childBeanAutoWire.showMessage();
	}
}
