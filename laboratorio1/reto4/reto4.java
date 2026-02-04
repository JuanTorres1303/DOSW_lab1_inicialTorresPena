import java.util.HashMap;
import java.util.List;

public class reto4 {
    
    static class Par {
        String clave;
        Integer valor;
        
        public Par(String clave, Integer valor) {
            this.clave = clave;
            this.valor = valor;
        }
    }
    
    public static HashMap<String, Integer> crearHashMap(List<Par> listaPares) {
        HashMap<String, Integer> mapa = new HashMap<>();
        
        for (Par par : listaPares) {
            if (!mapa.containsKey(par.clave)) {
                mapa.put(par.clave, par.valor);
            }
        }
        
        return mapa;
    }
}
