package org.bukkit.craftbukkit.entity;

import net.minecraft.server.Entity;
import net.minecraft.server.EntityAnimal;
import net.minecraft.server.EntityChicken;

import org.bukkit.craftbukkit.CraftServer;
import org.bukkit.entity.Animals;

public class CraftAnimals extends CraftAgeable implements Animals {

    public CraftAnimals(CraftServer server, EntityAnimal entity) {
        super(server, entity);
    }
    
    public static CraftEntity getEntity(Entity entity, CraftServer server) {
        return new CraftAnimals(server, (EntityAnimal) entity);
    }

    @Override
    public EntityAnimal getHandle() {
        return (EntityAnimal) entity;
    }

    @Override
    public String toString() {
        return "CraftAnimals";
    }
}
