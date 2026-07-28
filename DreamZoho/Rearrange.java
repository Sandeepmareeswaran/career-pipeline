public class Rearrange {
          public static void main(String[] args){
                    int arr[]={1,8,7,5,4};
                    boolean status=true;
                    int ind=0;
                    while(status){
                              if(ind>=arr.length){
                                        status =false;
                                        break;
                              }
                              int max=0;
                              int maxind=-1;
                              int min=100;
                              int minind=-1;
                              
                              if(ind%2==0){
                                        for(int i=ind;i<arr.length;i++){
                                                  if(arr[i]>max){
                                                            max=arr[i];
                                                            maxind=i;
                                                  }
                                        }
                                        int maxtemp=arr[ind];
                                        arr[ind]=max;
                                        arr[maxind]=maxtemp;
                                        ind++;

                              }else{
                                        for(int i=ind;i<arr.length;i++){
                                                  
                                                  if(arr[i]<min){
                                                            min=arr[i];
                                                            minind=i;
                                                  }
                                                  
                                        }
                                        int mintemp=arr[ind];
                                        arr[ind]=min;
                                        arr[minind]=mintemp;
                                        ind++;

                              }
                              /* 
                              for(int i=ind;i<arr.length;i++){
                                        if(arr[i]>max){
                                                  max=arr[i];
                                                  maxind=i;
                                        }
                                        if(arr[i]<min){
                                                  min=arr[i];
                                                  minind=i;
                                        }
                              }
                              if(ind%2==0){
                                        int maxtemp=arr[ind];
                                        arr[ind]=max;
                                        arr[maxind]=maxtemp;
                                       
                                        

                              }
                              if(ind%2!=0){
                                        int mintemp=arr[ind];
                                        arr[ind]=mintemp;
                                        arr[minind]=mintemp;
                                        
                                        

                              }
                              ind+=2;
                              */
                              
                              
                              

                    }
                    for(int i=0;i<arr.length;i++){
                              System.out.print(arr[i]);
                    }
          }
          
}
