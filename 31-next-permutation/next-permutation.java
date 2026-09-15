class Solution {
    public void nextPermutation(int[] arr) {
   
int n = arr.length;

int index = -1;
for (int i = n - 2; i >= 0; i--) {
    if (arr[i] < arr[i + 1]) {
        index = i;
        break;
    }
}
if (index == -1) {

    int left = 0;
    int right = n - 1;

    while (left < right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        left++;
        right--;
    }

} else {
    int j;

    for (j = n - 1; j > index; j--) {
        if (arr[j] > arr[index]) {
         break;}
    }
    int temp = arr[index];
    arr[index] = arr[j];
    arr[j] = temp;
    int left = index + 1;
    int right = n - 1;

    while (left < right) {
        temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        left++;
        right--;
    }
}
for (int x : arr) {
    System.out.print(x + " ");
}  
    }
}