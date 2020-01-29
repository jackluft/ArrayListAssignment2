import java.util.ArrayList;

public class two
{
    public static void main(String[] args){
        
        ArrayList<Integer> nums = new ArrayList<Integer>(20);
        nums = prime(100);
        Goldbach(nums,21);
        
        
        
    }
    
    
    public static void Goldbach(ArrayList<Integer> p, int test){
        for(int i=0; i < p.size(); i++){
            int g = test-p.get(i);
            if(p.indexOf(g) > -1){
                System.out.println(g +" + "+ p.get(i) + " = " + test);
                p.remove(i);
                
            }
            
            
        }
        
        
        
        
        
        
        
        
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
