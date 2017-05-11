package net.BukkitPE.event.entity;

import net.BukkitPE.entity.Entity;
import net.BukkitPE.event.Cancellable;
import net.BukkitPE.event.HandlerList;
import net.BukkitPE.level.Level;

/**
 * BukkitPE Project
 */
public class EntityLevelChangeEvent extends EntityEvent implements Cancellable {
    private static final HandlerList handlers = new HandlerList();
    private final Level originLevel;
    private final Level targetLevel;

    public EntityLevelChangeEvent(Entity entity, Level originLevel, Level targetLevel) {
        this.entity = entity;
        this.originLevel = originLevel;
        this.targetLevel = targetLevel;
    }

    public static HandlerList getHandlers() {
        return handlers;
    }

    public Level getOrigin() {
        return originLevel;
    }

    public Level getTarget() {
        return targetLevel;
    }
}
