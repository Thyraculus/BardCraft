package thyraculus.bardcraft;

import thyraculus.bardcraft.CommonProxy;
import net.minecraft.block.Block;
import net.minecraft.block.BlockOreStorage;

public class CopperBlock extends BlockOreStorage {

	public CopperBlock(int id, int texture) {
		super(id, texture);
	    setHardness(5.0F);
	    setResistance(10.0F);
	    setStepSound(soundMetalFootstep);
	    setBlockName("blockCopper");
	}

    @Override
    public String getTextureFile () {
            return CommonProxy.BLOCK_PNG;
    }

}
