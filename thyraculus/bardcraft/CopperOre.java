package thyraculus.bardcraft;

import java.util.Random;

import thyraculus.bardcraft.CommonProxy;

import net.minecraft.block.material.Material;
import net.minecraft.block.Block;
import net.minecraft.block.BlockOre;
import net.minecraft.creativetab.CreativeTabs;

public class CopperOre extends BlockOre {
        public CopperOre(int id, int texture) {
                super(id, texture);
                
        		// Constructor Configuration
                setHardness(3.0F);
                setResistance(5.0F);
                setStepSound(Block.soundStoneFootstep);
                setBlockName("copperOre");
                setCreativeTab(CreativeTabs.tabBlock);                
        }

        @Override
        public String getTextureFile () {
                return CommonProxy.BLOCK_PNG;
        }
        
        //public int idDropped(int par1, Random random, int zero) {
        //    return BardCraft.genericIngot.shiftedIndex;
        //}
}