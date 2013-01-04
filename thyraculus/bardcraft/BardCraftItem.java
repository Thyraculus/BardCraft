package thyraculus.bardcraft;

import thyraculus.bardcraft.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BardCraftItem extends Item {

	public BardCraftItem(int id, int texture, String name) {
		super(id);
        setIconIndex(texture);
		setMaxStackSize(64);
		setCreativeTab(CreativeTabs.tabMaterials);
        setItemName(name);
	}

	public BardCraftItem(int id, int texture, CreativeTabs tab, String name) {
        super(id);
        setIconIndex(texture);
        setMaxStackSize(64);
        setCreativeTab(tab);
        setItemName(name);
	}
	
	public BardCraftItem(int id, int texture, int maxStackSize, CreativeTabs tab, String name) {
        super(id);
        setIconIndex(texture);
        setMaxStackSize(maxStackSize);
        setCreativeTab(tab);
        setItemName(name);
	}
	
    public String getTextureFile() {
        return CommonProxy.ITEMS_PNG;
    }
}
