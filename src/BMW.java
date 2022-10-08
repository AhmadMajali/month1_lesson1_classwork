public class BMW extends Car{
    @Override
    public void Drive() {

    }
    public String driveSound;

    public String getDriveSound() {
        return driveSound;
    }

    public void setDriveSound(String driveSound) {
        this.driveSound = driveSound;
    }

    public BMW(String driveSound) {
        this.driveSound = driveSound;
    }
}
