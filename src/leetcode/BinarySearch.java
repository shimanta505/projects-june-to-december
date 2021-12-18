package leetcode;

public class BinarySearch {

    protected static int binaryAscending(int[] arr,int target){
        int first =0;
        int last =arr.length-1;


        while (first<=last){
            int mid =(first+last)/2;

            if (arr[mid]<target){
                first=mid+1;
            }else if(arr[mid]==target){
                return mid;
            }else if (arr[mid]>target){
                last=mid-1;
            }
        }
        return -1;
    }
    protected static int binaryDescending(int[] arr,int target){
        int first =0;
        int last =arr.length-1;


        while (first<=last){
            int mid =(first+last)/2;

            if (arr[mid]<target){
                last=mid-1;
            }else if(arr[mid]==target){
                return mid;
            }else if (arr[mid]>target){
                first=mid+1;
            }
        }
        return -1;
    }
    protected static int binaryAscendingOrDescending(int[] arr,int target){

        int first =0;
        int last =arr.length-1;
        int order =0;

        if (arr[arr.length-1]>arr[arr.length-2]){
            order=1;
        }


        while (first<=last){
            int mid =(first+last)/2;

            if (order==1) {
                if (arr[mid] < target) {
                    first = mid + 1;
                } else if (arr[mid] == target) {
                    return mid;
                } else if (arr[mid] > target) {
                    last = mid - 1;
                }
            }else{
                if (arr[mid]<target){
                    last=mid-1;
                }else if(arr[mid]==target){
                    return mid;
                }else if (arr[mid]>target){
                    first=mid+1;
                }
            }
        }
        return -1;
    }

    public static int binarySearch(int[] arr,int target){

        int first =0;
        int last=arr.length-1;
        int firstIndex=0;
        int lastIndex=0;
        boolean available =false;

        while (first<=last){
            int mid =(first+last)/2;

            if (arr[mid]<target){
                first=mid+1;
            }else if(arr[mid]==target){
                available=true;
                if (mid==0){
                    firstIndex=mid;break;
                }else if(arr[mid-1]<target){
                    firstIndex=mid;break;
                }
                last=mid-1;
            }else if (arr[mid]>target){
                last=mid-1;
            }
        }
        first=0;last=arr.length-1;

        while (first<=last){
            int mid =(first+last)/2;

            if (arr[mid]<target){
                first=mid+1;
            }else if(arr[mid]==target){
                if (mid==arr.length-1){
                    lastIndex=mid;break;
                }else if(arr[mid+1]>target){
                    lastIndex=mid;break;
                }
                first=mid+1;
            }else if (arr[mid]>target){
                last=mid-1;
            }
        }

        if (!available){
            return -1;
        }
        return (lastIndex-firstIndex)+1;
    }

    public static void main(String[] args) {
        int[] arr ={0,3,3,3,3,3,7,8,9,10};
        int[] desc ={10,9,8,7,6,5,4,3,2,1};
//        System.out.println(binaryAscending(arr,5));
//        System.out.println(binaryDescending(desc,10));
//        System.out.println(binaryAscendingOrDescending(desc,1));
        System.out.println(binarySearch(arr,3));
    }
}
