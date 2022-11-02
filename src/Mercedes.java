public class Mercedes extends Car{
    private String NewSound;

    public void setNewSound(String newSound) {
        NewSound = newSound;
    }

    private String drive;

    public String getDrive() {
        return drive;
    }

    public void setDrive(String drive) {
        this.drive = drive;
    }

    public String getSoundDrive() {
        return soundDrive;
    }

    public void setSoundDrive(String soundDrive) {
        this.soundDrive = soundDrive;
    }

    private String soundDrive;


    @Override
    public void drive() {
        System.out.println(soundDrive);

    }

    @Override
    public String getNewSound() {

        return NewSound;

    }

}

