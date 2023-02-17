public class PruebaMonigote {
    
    public static void main(String[] args) {
        
        // String del monigote.
        String[] monigote = {" __  ", "/  | ", "|  o ", "|  | ", "| -|-", "|  | ", "| / \\"};

        String[] monigote2 = {" |  "};
        int index = 0;

        // Imprimir el monigote.
        for (int i = 0; i < monigote.length; i++) {
            if (index == 3) {
                System.out.println(monigote[i]);
                index = 0;
            }
            else {
                System.out.print(monigote[i]);
                index++;
            }
        }

    }

}
