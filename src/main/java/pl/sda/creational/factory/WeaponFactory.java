package pl.sda.creational.factory;

public class WeaponFactory {
    public Weapon makeWeapon (Profession profession, int damage) {
        switch(profession){
            case ARCHER:
                return new Bow(damage);
            case WIZARD:
                return new Wand(damage);
            case SWORDSMAN:
                return new Sword(damage);
                default:
                    throw new IllegalStateException("There's no such weapon");
        }
    }
}
//poniżej - tak zrobilibyśmy wcześniej; powyżej wg wzorca...
//        if(profession == Profession.ARCHER) {
//            return new Bow(damage);
//        }else if(profession == Profession.SWORDSMAN){
//            return new Sword(damage);
//        }else if(profession == Profession.WIZARD){
//            return new Wand(damage);
//        }else{
//            throw new IllegalStateException("There's no such weapon");
//        }
//    }

