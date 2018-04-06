package hung.com.required;

import org.springframework.beans.factory.annotation.Required;

public class Student {
	   private Integer age;
	   private String name;

	   /**
	    *  @Required: vẫn phải khai báo trong XML như bình thường
	    *  Spring sẽ check xem trường này đx đc khai báo trong XML chưa mà thôi.
	    *  
	    */
	   @Required
	   public void setAge(Integer age) {
	      this.age = age;
	   }
	   public Integer getAge() {
	      return age;
	   }
	   
	   @Required
	   public void setName(String name) {
	      this.name = name;
	   }
	   public String getName() {
	      return name;
	   }
}
