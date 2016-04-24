package net.BukkitPE.item;

/**
 * author: MagicDroidX
 * BukkitPE Project
 */
public class ItemLeggingsChain extends ItemArmor {

    public ItemLeggingsChain() {
        this(0, 1);
    }

    public ItemLeggingsChain(Integer meta) {
        this(meta, 1);
    }

    public ItemLeggingsChain(Integer meta, int count) {
        super(CHAIN_LEGGINGS, meta, count, "Chain Leggings");
    }

    @Override
    public int getTier() {
        return ItemArmor.TIER_CHAIN;
    }

    @Override
    public boolean isLeggings() {
        return true;
    }
}