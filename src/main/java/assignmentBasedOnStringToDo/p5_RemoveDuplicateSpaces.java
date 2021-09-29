//Ernesto Alonso  Gonzalez Olaez
package assignmentBasedOnStringToDo;

public class p5_RemoveDuplicateSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				String str1="// TODO    Auto-generated   method stub";
				System.out.println(str1);
				str1=str1.replaceAll("\\s{2,}+", " ");
				System.out.println(str1);


	}

}
