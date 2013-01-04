package thyraculus.bardcraft;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid="BardCraft", name="BardCraft", version="0.0.0")
@NetworkMod(clientSideRequired=true, serverSideRequired=false)
public class BardCraft {

        // The instance of your mod that Forge uses.
        @Instance("BardCraft")
        public static BardCraft instance;
        
        public final static Block copperOre = new CopperOre(501, 0);
        public final static Block copperBlock = new CopperBlock(502, 1);
        
        public final static Item copperIngot = new BardCraftItem(5001, 0, "copperIngot");
        public final static Item brassIngot = new BardCraftItem(5002, 1, "brassIngot");

        // Says where the client and server 'proxy' code is loaded.
        @SidedProxy(clientSide="kalthazar.bardcraft.client.ClientProxy", serverSide="kalthazar.bardcraft.CommonProxy")
        public static CommonProxy proxy;
        
        @PreInit
        public void preInit(FMLPreInitializationEvent event) {
                // Stub Method
        }
        
        @Init
        public void load(FMLInitializationEvent event) {
                proxy.registerRenderers();
                
                ItemStack ironIngotStack = new ItemStack(Item.ingotIron);
                ItemStack copperIngotStack = new ItemStack(copperIngot);
                ItemStack copperIngot9Stack = new ItemStack(copperIngot, 9);
                ItemStack copperBlockStack = new ItemStack(copperBlock);
                ItemStack brass2Stack = new ItemStack(brassIngot, 2);

                GameRegistry.addShapelessRecipe(brass2Stack, copperIngotStack, ironIngotStack);

                GameRegistry.addShapelessRecipe(copperIngot9Stack, copperBlockStack);

                GameRegistry.addShapelessRecipe(copperBlockStack,
                		copperIngotStack, copperIngotStack, copperIngotStack,
                		copperIngotStack, copperIngotStack, copperIngotStack,
                		copperIngotStack, copperIngotStack, copperIngotStack);
        }
        
        @PostInit
        public void postInit(FMLPostInitializationEvent event) {
                // Stub Method
        }
}