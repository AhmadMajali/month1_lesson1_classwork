public class BMW extends Car {
    @Override
    public void Drive() {
        setDriveSound(driveSound);
    }

    public String driveSound;
    public String newSound;

    public String getDriveSound() {
        return driveSound;
    }

    public void setDriveSound(String driveSound) {
        this.driveSound = driveSound;
    }

    public BMW(String driveSound) {
        this.driveSound = driveSound;
    }

    @Override
    public void getNewSound() {

    }

    @Override
    public void getNewSound(Car car) {

    }


    public void setNewSound(String newSound) {
        this.newSound = newSound;
    }

    @Override
    public void getNewSound(BMW bmw) {
        getNewSound(bmw);


    }
}
