public class Road {
    public static void main(String[] args) {
        BMW bmw = new BMW();
        Mercedes mercedes = new Mercedes();
        bmw.setSoundDrive("vnnnnn");
        mercedes.setSoundDrive("gaaaang");
        drive(mercedes);
        drive(bmw);
        bmw.setNewSound("vrrrrrrr");
        mercedes.setNewSound("oarrrrrr");
        CarRepoImpl carRepo = new CarRepoImpl();
        carRepo.getNewSound(bmw);
        carRepo.getNewSound(mercedes);

    }
    public static void drive(Car car) {
        car.drive();
    }

    }





