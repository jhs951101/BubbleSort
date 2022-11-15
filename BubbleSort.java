package pkg;

public class BubbleSort {
	
	public void main() {
		int[] arr = {4, 3, 1, 5, 2};
        // arr: 정렬할 값들이 들어있는 배열

        for(int a=0; a<arr.length-1; a++){
            for(int i=0; i<arr.length-a-1; i++){
                // 오름차순 정렬이므로 왼쪽 값이 더 크면 서로 맞바꿈
                if(arr[i] > arr[i+1]){
                    int swap = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = swap;
                }
            }
        }

        for(int i=0; i<arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    public static void main(String[] args) {
    	BubbleSort main = new BubbleSort();
    	main.main();
    }
}