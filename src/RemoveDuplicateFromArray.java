/**
 * Created by Amit on 26/02/17.
 */
public class RemoveDuplicateFromArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,3,3,4,5,6,6,9};
        int j = remove_duplicate(arr);
        print(arr);
        System.out.println("Length is"+j);
    }

    static int remove_duplicate(int a[])
    {
        int i=0,j = 1;

        while(j < a.length && a.length > 2){
            if(a[i] == a[j]){
                j++;
            }else{
                a[++i] = a[j++];
            }
        }
        return (i+1);
    }
    static void print(int arr[]){
        for (int a : arr){
            System.out.println(a);
        }
    }
}
