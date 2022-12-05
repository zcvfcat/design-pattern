package behavioral.strategy;

import behavioral.strategy.weapons.Weapon;

public class Avatar {
  Weapon weapon;

  public void setWeapon(Weapon weapon) {
    this.weapon = weapon;
  }

  public void attack(){
    if (weapon == null){
      System.out.println("nothing");
    }else{
      this.weapon.attack();
    }
  }
}
