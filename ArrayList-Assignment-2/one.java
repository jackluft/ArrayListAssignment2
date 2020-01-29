import java.util.ArrayList;

public class one
{
    public static void main(String[] args){
        
        
        System.out.println(prime(100));
        
    }
    
    
    public static ArrayList<Integer> prime(int n){
        
        ArrayList<Integer> nums = new ArrayList<Integer>();
        
        for(int i =2; i <= n; i++){
            nums.add(i);
            
            
        }
        
        
        for(int a = 0; a < nums.size(); a++){
            int p = nums.get(a);
            
            for(int j = nums.size()-1; j > a; j--){
                if(nums.get(j) %p == 0){
                    nums.remove(j);
                    //System.out.println("in if statement");
                    
                }
                
                
                
            }
            
            
            
            
            
        }
        return nums;
        
        
        
    }
}
