public class PruebaMonigote {
    
    public static void main(String[] args) {
        
        // String del monigote.
        String[] monigote = {" __  ", "/  | ", "|  o ", "|  | ", "| -|-", "|  | ", "| / \\"};

        String[] monigote2 = {" |  ", " |  ", " |  ", " |  "};

        // Imprimir el monigote.
        for (int i = monigote2.length - 1; i >= 0; i--) {
            System.out.println(monigote2[i]);
        }

    }

}
