package milibro.recetas;

import java.util.HashMap;
import java.util.Map;
import java.util.Comparator;

public class LibroDeRecetas {

    private Map<String, String> recetas = new HashMap<>();
    
    public void agregarReceta(String nombreReceta, String ingredientes){
        if (recetas.containsKey(nombreReceta)) {
            System.out.println("La receta ya existe.");
        } else {
            recetas.put(nombreReceta, ingredientes);
        }
    }
    
    public void modificarReceta(String nombreReceta, String nuevosIngredientes){
        if (recetas.containsKey(nombreReceta)) {
            recetas.replace(nombreReceta, nuevosIngredientes);
        } else {
            System.out.println("La receta no existe.");
        }
    }
    
    public void mostrarRecetasAscendente(){
        recetas.entrySet()
               .stream()
               .sorted(Map.Entry.comparingByKey())
               .forEach(entry -> {
                   System.out.println(entry.getKey() + ": " + entry.getValue()); 
               });
    }
    
    public void mostrarRecetasDescendente(){
        recetas.entrySet()
               .stream()
               .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
               .forEach(entry -> {
                   System.out.println(entry.getKey() + ": " + entry.getValue());
               });
    }
    
    public void mostrarTodasRecetas(){
        recetas.forEach((nombre, ingredientes) -> {
            System.out.println("Receta: " + nombre);
            System.out.println("Ingredientes: " + ingredientes);
            System.out.println("---------------------------------------");
        });
    }
}
