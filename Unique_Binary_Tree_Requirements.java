/*a=preorder,b=inorder,c=postorder  */


class Solution{
    
    public static boolean isPossible(int a, int b){
        // Code here
        if(a==1 && b==2 || a==2 && b==1){
            return true;
        }else if(a==1 && b==3 || a==3 && b==1){
              return false;
        }else if( a==2 && b==3 || a==3 && b==2){
            return true;
        }
        return false;
    }
}
