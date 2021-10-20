
import java.util.List;



/**
 *
 * @author alias
 */
public class MyPrinter implements IPrinter{

    @Override
    public void f1(List<Printer> a, double price) {
        
        for (int i = 0; i < a.size(); i++) {
            if(a.get(i).getPrice()<=price){
                a.remove(i);
                i--;
            }
        }
    }

    @Override
    public int f2(List<Printer> a, String name) {
        
        String nf = name.toLowerCase();
        int count=0;
        for (Printer o : a) {
            String of = o.getName().toLowerCase();
            if(of.contains(nf)){
                count++;
            }
                    
        }
        return count;
    }

    

    
    
}
