public class MissingElementsUptoAGivenRange{
    public static void main(String[]args){
        int []arr  = {-3,-2,0,1,2};
        int min = arr [0];
        int max = arr [0];
        
        for (int i = 0; i < arr.length; i++ ){
        
            if (arr[i]< min)
                min = arr[i];

            if (arr[i]> max)
                max = arr[i];

        }
        for(int num = min; num < max; num++){
            boolean found = false;

        for (int i = 0; i < arr.length; i ++ ){
            if (arr[i]== num){
                found = true ;
            break;
            }
        }

            if(!found){
                System.out.println("Missing Elemeny is " +num);
        }
    }
  }
}