
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.copy.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.copy.item.CcopyItem;
import net.mcreator.copy.CopyMod;

public class CopyModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, CopyMod.MODID);
	public static final RegistryObject<Item> COPY = REGISTRY.register("copy", () -> new CcopyItem());
}
