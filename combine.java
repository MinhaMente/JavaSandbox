
import java.util.Vector;

public class combine{
  
  // Variáveis 
  Vector<Number> vNum;
  Vector<Number> LSize;
  Vector<Number> RSize;
  Vector<Number> LCache;
  Vector<Number> RCache;
  int betSize;
  
  public boolean loadNumbers(Vector<Number> Numbers, int combSize){
    
    // Min 3 comb
    if((combSize<3)||((Numbers.size()-combSize<1))){
        System.out.println("[ERROR] Combination Size < 3 !!");
        return false;
    } 
    
    // Loading 
    vNum = Numbers;
    betSize = combSize;
           
    return true;
    
  }
  
  private void printV(Vector<Number> V, String ID){
    
    System.out.println();
    System.out.print(ID + "[");
     
    for(int i=0;i<V.size();i++){
      if(i==V.size()-1){
        System.out.print(V.get(i)+"]");
      }else{
        System.out.print(V.get(i)+",");
      }
      
    }
    
    
  }
  
}

