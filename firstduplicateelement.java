public class firstduplicateelement {
    
    public static void main(String[] args){
        int[] arr = {1,2,3,3,2};
        int firstDuplicate = -1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    firstDuplicate = arr[i];
                    break;
                }
            }
            if (firstDuplicate != -1){
                break;
            }
        }
        if (firstDuplicate != -1) {
            System.out.println("First duplicate element is: " + firstDuplicate);
        } else {
            System.out.println("No duplicate elements found.");
        }
    }
}