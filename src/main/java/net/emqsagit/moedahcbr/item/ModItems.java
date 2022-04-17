package net.emqsagit.moedahcbr.item;

import net.emqsagit.moedahcbr.MoedaHcbr;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item UM_CENTAVO = registerItem("um_centavo",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(MoedaHcbr.MOD_ID, name), item);
    }


    public static void registerModItems() {
        MoedaHcbr.LOGGER.info("Registering Mod Items for " + MoedaHcbr.MOD_ID);
    }

}
