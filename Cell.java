public class Cell {

    // Cell properties
    //  Cell id
    public int id;
    // width = 3;
    // height = 3;
    public String[] body = new String[]{"#", "#", "#", "#", String.valueOf(id), "#", "#", "#", "#"};

    // Directions
    int isouth = 7;
    int ieast = 5;
    int inorth = 1;
    int iwest = 3;



    // Cell visited
    boolean visited;

    // Cell constructor
    public Cell(int id) {
        this.id = id;
        this.visited = false;
        this.body = new String[]{"#", "#", "#", "#", String.valueOf(id), "#", "#", "#", "#"};
    }


    // Cell methods
    public void setVisited() {
        this.visited = true;
    }

    public boolean isVisited() {
        return this.visited;
    }

    public void setBody(String[] body) {
        this.body = body;
    }

    public String[] getBody() {
        return this.body;
    }

    public void setSouth(String south) {
        this.body[isouth] = south;
    }

    public void setEast(String east) {
        this.body[ieast] = east;
    }

    public void setNorth(String north) {
        this.body[inorth] = north;
    }

    public void setWest(String west) {
        this.body[iwest] = west;
    }


    public String getSouth() {
        return this.body[isouth];
    }


    public String getEast() {
        return this.body[ieast];
    }


    public String getNorth() {
        return this.body[inorth];
    }


    public String getWest() {
        return this.body[iwest];
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }



}
