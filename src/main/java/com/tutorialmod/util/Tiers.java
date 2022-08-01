package com.tutorialmod.util;

import com.tutorialmod.init.ItemInit;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class Tiers {
    public static final ForgeTier RUBY = new ForgeTier(2, 500, 6f,
            2f, 12, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(ItemInit.RUBY.get()));
}
