
public class ArrayRotation {
	void reverseArray(int []a,int start,int end){
		int temp;
		while(start<end){
			temp=a[start];
			a[start]=a[end];
			a[end]=temp;
			start++;
			end--;
		}
	}
	void reverse(int []a,int d,int n){
		reverseArray(a, 0, d);
		reverseArray(a, d+1, n);
		reverseArray(a, 0, n);
	}
	void printArray(int a[]){
		for(int i:a){
			System.out.print(i+" ");
		}
		System.out.println("");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a={1,2,3,4,5};
		ArrayRotation o = new ArrayRotation();
		o.reverse(a, 2, 4);
		o.printArray(a);
	}

}
