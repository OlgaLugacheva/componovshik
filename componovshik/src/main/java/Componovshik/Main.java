package Componovshik;

/**
 * Created by Olga on 08.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        ArmyComponent department = new ArmyStructure("department", 50, 0);
        ArmyComponent vzvod = new ArmyStructure("vzvod", department.getSoldiers(), department.getAmmunition());
        ArmyComponent rota = new ArmyStructure("rota", vzvod.getSoldiers(), vzvod.getAmmunition());
        ArmyComponent bataleon = new ArmyStructure ("bataleon", rota.getSoldiers(), rota.getAmmunition());
        ArmyComponent part = new ArmyStructure("part", bataleon.getSoldiers(), bataleon.getAmmunition());
        ArmyComponent district = new ArmyStructure("district", part.getSoldiers(), part.getAmmunition());

        vzvod.add(department);
        rota.add(vzvod);
        part.add(bataleon);
        district.add(part);
        district.Print();
    }
}
