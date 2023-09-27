public class SimplePerfectMazeGenerator implements MazeGenerator {
    public Maze generate(int width, int height) {
        Maze maze = new Maze(width, height);
        maze.initMaze();
        return maze;
    }


}
