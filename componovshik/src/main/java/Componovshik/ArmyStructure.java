package Componovshik;

import java.util.ArrayList;

/**
 * Created by Olga on 08.03.2017.
 */
public class ArmyStructure extends ArmyComponent {
    String _name;
    int soldiers;
    int amunition;
    ArrayList<ArmyComponent> armyComponents = new ArrayList<ArmyComponent>();

    public ArmyStructure(String name, int soldiers, int ammunition) {
        this._name = name;
        this.soldiers = soldiers;
        this.amunition = ammunition;
    }

    public String getName() {
        return _name;
    }

    public void add(ArmyComponent armyComponent) {
        armyComponents.add(armyComponent);
    }

    public void remove(ArmyComponent armyComponent) {
        armyComponents.remove(armyComponent);
    }

    public ArmyComponent getChild(int i) {
        return (ArmyComponent) armyComponents.get(i);
    }


    public void  Print() {
        System.out.println(getName() + " " + getSoldiers() + " "+ getAmmunition()); ;
    }

    public int getSoldiers() {
        return soldiers;
    }

    public int getAmmunition() {
        return amunition;
    }
}
