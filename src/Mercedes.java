public class Mercedes extends Car{


    public  String driveSound;
    public String newSound;

    public Mercedes(String driveSound) {
        this.driveSound = driveSound;
    }

    public String getDriveSound() {
        return driveSound;
    }

    public void setDriveSound(String driveSound) {
        this.driveSound = driveSound;
    }

    public void setNewSound(String newSound) {
        this.newSound = newSound;
    }

    @Override
    public void Drive() {

    }

    @Override
    public void getNewSound() {

    }

    @Override
    public void getNewSound(Car car) {

    }

    @Override
    public void getNewSound(Mercedes mercedes) {
        getNewSound();
    }
}

