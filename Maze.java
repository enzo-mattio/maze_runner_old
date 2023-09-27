public class Maze {
    private final int width;
    private final int height;
    private final Cell[][] maze;

    public Maze(int width, int height){
        this.width = width;
        this.height = height;
        this.maze = new Cell[width][height];
    }
    public void initMaze() {
        // Init with the entry and the exit
        int id = 0;
        for (int i = 0; i < this.width; i++) {
            for (int j = 0; j < this.height ; j++) {
                maze[i][j] = new Cell(id);
                id++;
            }
        }
        // Init the entry and the exit
        maze[0][0].setNorth("E");
        maze[width-1][height-1].setSouth("S");
        System.out.println(maze[0][0].getBody()[1]);
        System.out.println(maze[width-1][height-1].getBody()[7]);

    }


    public void printMaze(){
        StringBuilder string1 = new StringBuilder();
        StringBuilder string2 = new StringBuilder();
        StringBuilder string3 = new StringBuilder();

        for (int i = 0; i < this.width; i++) {
            for (int j = 0; j < this.height ; j++) {
                string1.append(maze[i][j].getBody()[0]);
                string1.append(maze[i][j].getBody()[1]);
                string1.append(maze[i][j].getBody()[2]);

                string2.append(maze[i][j].getBody()[3]);
                string2.append(maze[i][j].getBody()[4]);
                string2.append(maze[i][j].getBody()[5]);

                string3.append(maze[i][j].getBody()[6]);
                string3.append(maze[i][j].getBody()[7]);
                string3.append(maze[i][j].getBody()[8]);

            }
            System.out.println(string1);
            System.out.println(string2);
            System.out.println(string3);
            string1 = new StringBuilder();
            string2 = new StringBuilder();
            string3 = new StringBuilder();
        }

    }
}


