package com.example.examplemod;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraftforge.common.util.*;
import net.minecraftforge.fml.common.registry.*;
import net.minecraft.item.*;
import net.minecraft.init.Items;
import net.minecraft.item.Item.*;
import net.minecraft.item.ItemArmor.*;

@Mod(modid = ExampleMod.MODID, version = ExampleMod.VERSION)
public class ExampleMod
{
    public static final String MODID = "examplemod";
    public static final String VERSION = "1.0";

    public static ArmorMaterial RABBIT_ARMOR = EnumHelper.addArmorMaterial("Hare", "minecraft:rabbit_foot", 16, new int[] {3, 8, 6, 3}, 30);
    public static ToolMaterial RABBIT_SWORD = EnumHelper.addToolMaterial("Lapin", 3, 1000, 15.0F, 4.0F, 30);

    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        System.out.println("MOD CODE");
        Item sword, helmet, chestplate, leggings, boots;
        GameRegistry.registerItem(sword = new ItemSword(RABBIT_SWORD), "diamond_sword");
        GameRegistry.registerItem(helmet = new ItemArmor(RABBIT_ARMOR, 1, 0), "diamond_helmet");
		GameRegistry.registerItem(chestplate = new ItemArmor(RABBIT_ARMOR, 1, 1), "diamond_chestplate");
		GameRegistry.registerItem(leggings = new ItemArmor(RABBIT_ARMOR, 2, 2), "diamond_leggings");
		GameRegistry.registerItem(boots = new ItemArmor(RABBIT_ARMOR, 1, 3), "diamond_boots");  

		GameRegistry.addRecipe(new ItemStack(sword), new Object[] {
			"X", 
			"X", 
			"Z", 'X', Items.rabbit_foot, 'Z', Items.stick
		});

		GameRegistry.addRecipe(new ItemStack(helmet), new Object[] {
			"XXX", 
			"X X", 
			"   ", 
			'X', Items.rabbit_hide
		});
		GameRegistry.addRecipe(new ItemStack(chestplate), new Object[] {
			"X X", 
			"XXX", 
			"XXX", 
			'X', Items.rabbit_hide
		});
		GameRegistry.addRecipe(new ItemStack(leggings), new Object[] {
			"XXX", 
			"X X", 
			"X X", 
			'X', Items.rabbit_hide
		});
		GameRegistry.addRecipe(new ItemStack(boots), new Object[] {
			"   ", 
			"X X", 
			"X X", 
			'X', Items.rabbit_hide
		});
	}
}
