// Coded by Flann

package flann.flann;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class Flann_BlockSteel extends Block
{
	protected Flann_BlockSteel (int x)
	{
		super (x, Material.iron);
		setCreativeTab(FlannModsCore.flanntab);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister IR){
		this.blockIcon = IR.registerIcon(FlannModsCore.modid + ":" + this.getUnlocalizedName2());
	}
	
	public int idDropped(int x, Random rand)
	{
		return FlannModsCore.blockSteel.blockID;
	}
	
	public int quantityDropped(Random rand)
	{
		return 1;
	}
}
