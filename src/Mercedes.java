public class Mercedes extends Car{
    @Override
    public void Drive() {


    }
    public  String driveSound;

    public Mercedes(String driveSound) {
        this.driveSound = driveSound;
    }

    public String getDriveSound() {
        return driveSound;
    }

    public void setDriveSound(String driveSound) {
        this.driveSound = driveSound;
    }

}

