class Main {
  public static void main(String [] args){
    int [] arr1 = {7 , 1, 5 , 3 , 6 , 4};
    length = arr1.length();
    int [] arr2 = {7 , 6 , 4 , 3 , 1};
    length2 = arr2.length();
    System.out.println(maxProfit(arr1 , length));
    System.out.println(maxProfit(arr2 , length2));
  }
  static int maxProfit( int arr[] , int len){
    int buy = arr[0] ;
    int maxprofit = 0 ;
    for (int i = 0 ; i < len - 1 ; i++){
      if(buy > arr[i]){
        buy = arr[i];
      }
      elseif(arr[i] - buy > maxprofit){
        maxprofit = arr[i] - buy;
      }
      return maxprofit ; 
    }
  }
}