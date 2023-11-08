using System;

public class Equipment : ICloneable
{
    public string Name { get; set; }
    public object Clone()
    {
        return this.MemberwiseClone();
    }
}
public abstract class WarhammerUnit : ICloneable
{
    public string Name { get; set; }
    public Equipment Gear { get; set; }
    public object Clone()
    {
        WarhammerUnit clone = (WarhammerUnit)this.MemberwiseClone;
        clone.Gear = (Equipment)this.Gear.Clone();
        return clone;
    }
}
public class SpaceMarine :WarhammerUnit
{
    public SpaceMarine{
        Gear = new Equipment();
}
    
}


public override void Attack()
{
    console.WriteLine($"{name} dispara teniendo {Gear.name} equipado");

}
