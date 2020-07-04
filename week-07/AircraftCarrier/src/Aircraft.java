public class Aircraft {
    int ammo = 0;
    public int maxAmmo;
    protected String type;
    int baseDamage;
    protected boolean refillPriority;
    int totalDamage;

    Aircraft(){}

    public String getStatus(){
        return "Type: "+this.type+", Ammo: "+ammo+", Base Damage: "+baseDamage+", All Damage: "+fight();
    }

    public int fight(){
        int damageDealt = this.baseDamage * this.ammo;
        this.ammo = 0;
        return damageDealt;
    }

    public int refill(int num){
        int remainingAmmo = num;
        int take = this.maxAmmo - this.ammo;

        if (take <= remainingAmmo){
            this.ammo = take + this.ammo;
            remainingAmmo -= take;
        }else if (take > remainingAmmo){
            this.ammo += remainingAmmo;
            remainingAmmo = 0;
        }
        return remainingAmmo;
    }
    public boolean isPriority(){
        return refillPriority;
    }
    public String getType(){
        return this.type;
    }

}
