package gt.edu.umg.progra3.parcial1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DinamicStructuresManager {



 public static List<Integer> METODOordenar(List<Integer> values){
        //inserte codigo aqui
                   Collections.sort(values);
        
        return values;
    }

    public static List<Integer> METODOordenarInversa(List<Integer> values){
        Comparator<Integer> comparador = Collections.reverseOrder();
        Collections.sort(values, comparador);
        return values;
    }
    

}
