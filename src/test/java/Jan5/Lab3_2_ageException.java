package Jan5;
class ageException extends Exception {
		private int age;
		ageException(int a){
			age = a;
		}
		public String toString() {
			return age +" is an invalid age";
		}
	}
public class Lab3_2_ageException{
		 public String name;
		  public int age;
		public Lab3_2_ageException(String name, int age) {
			
			this.name = name;
			this.age = age;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		@Override
		public String toString() {
			return "Person2_1 [name=" + name + ", age=" + age + "]";
		}
		
		void getempdetails() throws ageException 
		{
			if(age<15) {
				throw new ageException(age);
			}
			else {
				System.out.println("Name: "+name+ " Age:" +age);
			}
		
		}
	}
