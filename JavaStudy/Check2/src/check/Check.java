package check;
import constants.Constants;

public class Check {
	private String firstName="金子";
	private String lastName="歌那";
	
	private void printName(String firstName, String lastName) {
		/*voidを使う理由
		 */
		System.out.println("printlnメソッド→"+this.firstName+this.lastName);
		
	}
public static void main(String[] args) {
	Check check = new Check();
	check.printName(check.firstName, check.lastName);
	Pet pet=new Pet(Constants.CHECK_CLASS_JAVA,Constants.CHECK_CLASS_HOGE);
	pet.introduce();
	RobotPet robotpet =new RobotPet(Constants.CHECK_CLASS_R2D2,Constants.CHECK_CLASS_LUKE);
	robotpet.introduce();
	
	}
}
