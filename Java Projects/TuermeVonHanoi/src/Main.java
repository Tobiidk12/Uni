//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Tower t1 = new Tower(1);
        Tower t2 = new Tower(2);
        Tower t3 = new Tower(3);
        Tower.setPlatesOnTower(t1,new int[]{3,2,1});
        Tower.movePlate(t1,t2);
        Tower.movePlate(t1,t3);
        Tower.movePlate(t2,t3);
        for (int i = 0; i < t1.getPlatesOnTower().length; i++) {
            System.out.print(t1.getPlatesOnTower()[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < t2.getPlatesOnTower().length; i++) {
            System.out.print(t2.getPlatesOnTower()[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < t3.getPlatesOnTower().length; i++) {
            System.out.print(t3.getPlatesOnTower()[i] + " ");
        }
        System.out.println();
    }
}