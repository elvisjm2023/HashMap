package milibro.recetas;

public class PruebaLibroDeRecetas {
    public static void main(String[] args) {
        LibroDeRecetas libro = new LibroDeRecetas();
        
        libro.agregarReceta("Ceviche de camarón", "Camarones, limón, cebolla, tomate, cilantro");
        libro.agregarReceta("Locro de papa", "Papas, queso, aguacate, cebolla, ajo");
        libro.agregarReceta("Encebollado", "Atún, yuca, cebolla, tomate, cilantro");
        
        System.out.println("Recetas en orden ascendente:");
        libro.mostrarRecetasAscendente();
        
        System.out.println("\nRecetas en orden descendente:");
        libro.mostrarRecetasDescendente();
        
        System.out.println("***************************************************************");
        System.out.println("\nTodas las recetas:");

        
        libro.mostrarTodasRecetas();
    }
}


