public class MazeRunner {
    public static void main(String[] args) {
        // Validez les arguments et générez le labyrinthe en utilisant le générateur approprié
        if (args.length != 4) {
            System.err.println("Erreur : Veuillez fournir une largeur, une hauteur, un type de labyrinthe et une méthode de génération valides.");
            System.out.println("Utilisation : java -jar MazeRunner.jar [largeur] [hauteur] [perfect/imperfect] [simple/graph/optimized]");
            System.exit(1);
        }

        try {
            int width = Integer.parseInt(args[0]);
            int height = Integer.parseInt(args[1]);
            String mazeType = args[2];
            String generationMethod = args[3];

            Maze maze = null;
            MazeGenerator generator = null;

            if (mazeType.equals("perfect")) {
                if (generationMethod.equals("simple")) {
                    generator = new SimplePerfectMazeGenerator();
                } else if (generationMethod.equals("graph")) {
                    //generator = new GraphBasedMazeGenerator();
                } else if (generationMethod.equals("optimized")) {
                    //generator = new OptimizedMazeGenerator();
                }
            } else if (mazeType.equals("imperfect")) {
                if (generationMethod.equals("simple")) {
                    //generator = new SimpleImperfectMazeGenerator();
                } else if (generationMethod.equals("graph")) {
                    //generator = new GraphBasedMazeGenerator();
                } else if (generationMethod.equals("optimized")) {
                    //generator = new OptimizedMazeGenerator();
                }
            } else {
                System.err.println("Erreur : Type de labyrinthe invalide.");
                System.exit(1);
            }

            if (generator != null) {
                maze = generator.generate(width, height);
                maze.printMaze();
            } else {
                System.err.println("Erreur : Méthode de génération invalide.");
                System.exit(1);
            }
        } catch (NumberFormatException e) {
            System.err.println("Erreur : Veuillez fournir une largeur et une hauteur valides supérieures à 5.");
            System.exit(1);
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Erreur inattendue lors de la génération du labyrinthe. Veuillez réessayer.");
            System.exit(1);
        } catch (OutOfMemoryError e) {
            System.err.println("Erreur : Mémoire insuffisante. Veuillez réessayer avec un labyrinthe plus petit.");
            System.exit(1);
        }
    }
}
