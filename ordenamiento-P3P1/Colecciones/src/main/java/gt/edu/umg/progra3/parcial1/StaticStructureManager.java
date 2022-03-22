package gt.edu.umg.progra3.parcial1;

//import java.util.ArrayList;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

//import java.util.Arrays;
//import java.util.Collections;
//import java.util.List;

public class StaticStructureManager {



        public static Integer[] METODOordenarEstatico(Integer [ ] arreglo){
             Arrays.sort(arreglo);
        
        return arreglo;
    }

    public static Integer[] METODOordenarInversaEstatico(Integer [ ] arreglo){
          Comparator<Integer> comparador = Collections.reverseOrder();
        Arrays.sort(arreglo, comparador);
        return arreglo;
    }

}
