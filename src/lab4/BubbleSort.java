package lab4;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BubbleSort ob = new BubbleSort();
int arr[] = {12, 23, 25, 19, 24, 11, 90};
ob.bubbleSort(arr);
System.out.println("Sorted array");
ob.printArray(arr);
}
	
void bubbleSort(int arr[]) {
int n = arr.length;
for (int i = 0; i < n-1; i++)
for (int j = 0; j < n-i-1; j++)
if (arr[j] > arr[j+1]) {
	int temp = arr[j];
	arr[j] = arr[j+1];
	arr[j+1] = temp;
}
		 }

void printArray(int arr[]) {
int n = arr.length;
for (int i=0; i<n; ++i)
System.out.print(arr[i] + " ");
System.out.println();
		    }

	

}

