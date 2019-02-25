package SS2TH4;

public class DaoNguocMang {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        for(int i = 0 ; i < daoNguoc(arr).length ; i++) {
            System.out.print(daoNguoc(arr)[i] +" ");
        }
    }
    private static int[] daoNguoc(int arr[]) {
        int arr1[] = new int[arr.length];
        int dem = 0;
        for (int i = arr.length -1 ; i>=0 ; i--) {
            arr1[dem] = arr[i];
            dem++;
        }
        return arr1;
    }
}
