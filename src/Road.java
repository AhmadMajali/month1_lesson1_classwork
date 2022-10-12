public class Road{
    public static void main(String[] args) {
      BMW bmw = new BMW("");
      bmw.setDriveSound("brrrrr");
      bmw.setNewSound("fdggdggg");
        System.out.println(bmw.getDriveSound());
      Mercedes mercedes = new Mercedes("");
      mercedes.setDriveSound("vvvvvvrrr");
      mercedes.setNewSound("dfvfdsfd");
        System.out.println(mercedes.getDriveSound());

    }
   public void Cars(BMW bmw, Mercedes mercedes){
        bmw.Drive();
        mercedes.Drive();

    }
    public void Cars(){
        Cars();
        Cars();
    }
    public void main(){
        CarRepo carRepo = new CarRepo() {
            @Override
            public void newSound(Car car) {
                System.out.println(car.getNewSound());
            }
        };
    }

}





