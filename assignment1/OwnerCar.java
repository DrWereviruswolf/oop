package werewolf.github.com.oop;

public class OwnerCar{
    String typeName = "Default";
    int  drivingDistance = 0;
    String[] device = {};
    OwnerCar(){
    }
    OwnerCar(String newName){
        typeName = newName;
    }
}

class ManageCar extends OwnerCar{
    long carID = 0;
    ManageCar(){
    }
    ManageCar(long newCarID){
        carID = newCarID;
    }
}

class FactoryCar extends OwnerCar{
    private String[] deviceTypes = {};
    FactoryCar(){
    }
    FactoryCar(String[] newCarAssemble){
        deviceTypes = newCarAssemble;
    }
    //return id of which device is updated
    int UpdateDevice(String deviceName){
        int i;
        for (i = 0; i < deviceTypes.length; i++){
            if (deviceName.equals(deviceTypes[i]))
                return i;
        }
        return -1;
    }
}

