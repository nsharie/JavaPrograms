import java.util.Scanner;

public class StudentApp {
	
	/**
	 * 
	 * @param name It consist of name which have to linear searched in the Array 
	 * @param arr The Array of students is passed to find the element or key
	 * @return The student name is found or not.
	 */
	static boolean checkName(String name, Student arr[]) {
		
		for(int i=0;i<arr.length;i++) {
			if(name.equals(arr[i].name)) {
				return true;
			}	
		}
		return false;
	}
	
//	Selection Sorting 
	
	/**
	 * The sorting of the Array is performed based on thier id's
	 * <p>
	 * Its a static method which does not return anything but accept an parameter
	 * @param arr It consists of array elements which needed to be sorted
	 */
	static void selectionSort(Student arr[]) { 
		for(int i=0;i<arr.length-1;i++) {
			int min = arr[i].id;
			int pos = i;
			
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j].id<min) {
					min = arr[j].id;
					pos = j;
				}
			}
			Student temp;
			temp = arr[i];
			arr[i] = arr[pos];
			arr[pos] = temp;
		}
	}
	
//	Binary Search
	static boolean checkIdBinarySeacrch(int key, Student arr[]) {
		selectionSort(arr);
		
		int low = 0;
		int high = arr.length-1;
		
		while(low<=high) {
			int mid = (low+high)/2;
			if(key == arr[mid].id) {
				return true;
			}
			else if(key>arr[mid].id) {
				low = mid+1;
			}
			else {
				high = mid-1;
			}
		}
		return false;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of entries of student");
		int entries = scan.nextInt();
		Student []arr = new Student[entries];
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter id");
			int id = scan.nextInt();
			System.out.println("Enter name");
			String name = scan.next();
			System.out.println("Enter Marks");
			int marks = scan.nextInt();
			
			arr[i] = new Student(id, name, marks);
		}
		
		System.out.println("Enter name to search");
		String name_key = scan.next();
		boolean res = checkName(name_key, arr);
		
		if(res) {
			System.out.println("Student Found");
		}
		else {
			System.out.println("Student Not Found");
		}
		
//		Binary Search
		System.out.println("Enter id to search by binary search algorithm");
		int id_keyb = scan.nextInt();
		boolean resBinary = checkIdBinarySeacrch(id_keyb, arr);
		
		if(resBinary) {
			System.out.println("Id is present");
		}
		else {
			System.out.println("Id is not present");
		}
		
		System.out.println("Sorted Student Array...");
		for (Student student : arr) {
			System.out.print(student.id+" "+student.name+" "+ student.marks+" | ");
		}
	}	

}
