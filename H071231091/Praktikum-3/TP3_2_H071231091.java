class HotWheels {
    String name;
    double speed, cash;
    int winningAmount;

    public HotWheels(String name, double speed,double cash) {
        this.name = name;
        this.speed = speed;
        this.cash = cash;
    }
    public HotWheels(){
    }

    public void showSpec() {
        System.out.println("========== Specification ==========");
        System.out.println("Name : " + this.name);
        System.out.println("Speed : " + this.speed);
        System.out.println("Winning Amount : " + this.winningAmount);
        System.out.println("Cash : Rp. " + this.cash + "\n");
    }

    public void upgrade(int budget) {
        if (budget > this.getCash()) {
            System.out.printf("%s cannot be upgraded, not enough money...\n", this.getName());
        } else {
            // Every Rp. 50,000 increase speed 1
            int increaseSpeed = budget / 50000;
            // TODO 3: Increase the speed of the car
            this.setSpeed(this.getSpeed() + increaseSpeed);
            this.setCash(this.getCash() - budget + (budget % 50000));
            System.out.printf("Increases the speed of %s by %d...\n", this.getName(), increaseSpeed);
        }
    }

    public void raceTo(HotWheels enemy) {
        // TODO 4: Validate if the speed of this car is greater than the enemy's speed
        if (this.getSpeed() > enemy.getSpeed()) {
            this.setWinningAmount(this.getWinningAmount() + 1);
            this.setCash(this.getCash() + 40000);
            System.out.printf("%s Wins! The number of Wins from %s reaches %d wins...\n", this.getName(), enemy.getName(), this.getWinningAmount());
        } else if (this.getSpeed() == enemy.getSpeed()) { 
            System.out.printf("%s with %s are equally strong! The match ended in a draw...\n", this.getName(), enemy.getName());
        } else { 
            enemy.setWinningAmount(enemy.getWinningAmount() + 1);
            enemy.setCash(enemy.getCash() + 40000);
            System.out.printf("%s Wins! The number of Wins from %s reaches %d wins...\n", enemy.getName(), enemy.getName(), enemy.getWinningAmount());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }

    public int getWinningAmount() {
        return winningAmount;
    }

    public void setWinningAmount(int winningAmount) {
        this.winningAmount = winningAmount;
    }
}

public class TP3_2_H071231091 {
    public static void main(String[] args) {
        HotWheels mercebesDenz = new HotWheels();
        mercebesDenz.setName("marcebesbenz");
        mercebesDenz.setSpeed(4
        );
        mercebesDenz.setCash(20000);

        HotWheels ferharri = new HotWheels();
        ferharri.setName("Ferharri");
        ferharri.setSpeed(4);
        ferharri.setCash(50000);

        System.out.println();
        mercebesDenz.showSpec();
        ferharri.showSpec();

        printBarriers();
        mercebesDenz.upgrade(50000);
        printBarriers();
        ferharri.upgrade(50000);
        printBarriers();

        // System.out.println();
        // ferharri.showSpec();

        printBarriers();
        ferharri.raceTo(mercebesDenz);
        printBarriers();
        mercebesDenz.raceTo(ferharri);
        printBarriers();

        System.out.println();
        mercebesDenz.showSpec();
        ferharri.showSpec();
    }
    public static void printBarriers() {
        System.out.println("================================");
    }
}