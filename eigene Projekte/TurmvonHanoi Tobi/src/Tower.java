public class Tower {
// exemplar variables
    private int towerNumber;
    private int plateNumber;
    private int[][] ATower;
//constructor
    public Tower(int ltowerNumber, int lplateNumber) {
        towerNumber = ltowerNumber;
        plateNumber = lplateNumber;

//        for (int i = 1; i <= plateNumber; i++){        }
//Tower array
        ATower = new int[plateNumber][towerNumber];
    }
//getter and setter
    public int getTowerNumber() {
        return towerNumber;
    }
    public void setTowerNumber(int ltowerNumber) {
        towerNumber = ltowerNumber;
    }
    public int getPlateNumber() {
        return plateNumber;
    }
    public void setPlateNumber(int plateNumber) {
        this.plateNumber = plateNumber;
    }

// Methods

    public int[][] displayBuildTower(){
        return ATower;
    }









}
