// Coded by Flann

package mods.flann.src;

import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.IFuelHandler;

public class Flann_FuelHandler implements IFuelHandler{
	
	@Override
	public int getBurnTime(ItemStack fuel) { //This method sets burn time
		if(fuel.itemID == FlannModCore.stickIngot.itemID && fuel.getItemDamage() == 0){
			return 100;
		}else if(fuel.itemID == FlannModCore.paxelWood.itemID){
			return 300;
		}else if(fuel.itemID == FlannModCore.battleaxeWood.itemID){
			return 300;
		}
		return 0;
	}
}