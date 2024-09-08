public class Tower {
    private int towerNumber;
    private int[] platesOnTower = new int[3];
    public Tower(int towerNumber){
        this.towerNumber = towerNumber;
        platesOnTower[0] = 0;
        platesOnTower[1] = 0;
        platesOnTower[2] = 0;
    }

    public int[] getPlatesOnTower(){
        return platesOnTower;
    }

    public static void setPlatesOnTower(Tower tower, int[] platesOnTower){
        tower.platesOnTower[0] = platesOnTower[0];
        tower.platesOnTower[1] = platesOnTower[1];
        tower.platesOnTower[2] = platesOnTower[2];
    }

    public static void addPlateToTower(int plateToAdd, Tower tower) {
        int[] platesOnTower = tower.getPlatesOnTower();
        for (int i = 0; i < platesOnTower.length; i++) {
            if (platesOnTower[i] == 0) {
                platesOnTower[i] = plateToAdd;
                break;
            }
        }
        setPlatesOnTower(tower, platesOnTower);
    }

    public static int getPlateToRemove(Tower tower) {
        int[] platesOnTower = tower.getPlatesOnTower();
        int PlateToRemove = 0;
        if (platesOnTower[2] != 0) {
            PlateToRemove = platesOnTower[2];
            return PlateToRemove;
        }
        for (int i = 0; i <= 2; i++) {
            if (platesOnTower[i] == 0 && i == 0) {
                System.out.println("Dieser Turm ist leer, also kann keine Platte entfernt werden.");
            }
            if (platesOnTower[i] == 0) {
                PlateToRemove = platesOnTower[i-1];
                break;
            }
        }
        return PlateToRemove;
    }

    public static int[] removePlateFromTower(Tower tower) {
        int[] platesOnTower = tower.getPlatesOnTower();
        int[] result = new int[3];
        if (platesOnTower[2] != 0) {
            platesOnTower[2] = 0;
            setPlatesOnTower(tower, platesOnTower);
            result[2] = 0;
            return result;
        }
        for (int i = 0; i <= 2; i++) {
            if (platesOnTower[i] == 0 && i == 0) {
                System.out.println("Dieser Turm ist leer, also kann keine Platte entfernt werden.");
            }
            if (platesOnTower[i] == 0) {
                platesOnTower[i-1] = 0;
                result[i - 1] = 0;
                break;
            }
            else{
             result[i] = platesOnTower[i];
            }
        }
        setPlatesOnTower(tower, platesOnTower);
        return result;
    }

    public static void movePlate(Tower fromTower, Tower toTower){
        int plateToAdd = getPlateToRemove(fromTower);
        removePlateFromTower(fromTower);
        addPlateToTower(plateToAdd, toTower);
    }
}
