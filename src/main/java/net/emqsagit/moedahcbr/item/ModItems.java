package net.emqsagit.moedahcbr.item;

import net.emqsagit.moedahcbr.MoedaHcbr;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    //1 centavo

    public static final Item UM_CENTAVO = registerItem("um_centavo",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    //10 centavos

    public static final Item DEZ_CENTAVOS = registerItem("dez_centavos",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    //25 centavos

    public static final Item VC_CENTAVOS = registerItem("vinte_e_cinco_centavos",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    //50 centavos

    public static final Item CQ_CENTAVOS = registerItem("cinquenta_centavos",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    //1 H$

    public static final Item UM_HERMITDOLLAR = registerItem("um_hermit_dollar",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    //10 H$

    public static final Item DEZ_HERMITDOLLARS = registerItem("dez_hermit_dollars",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    //20 H$

    public static final Item VINTE_HERMITDOLLARS = registerItem("vinte_hermit_dollars",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    //50 H$

    public static final Item CINQUENTA_HERMITDOLLARS = registerItem("cinquenta_hermit_dollars",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    //100 H$

    public static final Item CEM_HERMITDOLLARS = registerItem("cem_hermit_dollars",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    //200 H$

    public static final Item DUZENTOS_HERMITDOLLARS = registerItem("duzentos_hermit_dollars",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));


    //Coisas pro

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(MoedaHcbr.MOD_ID, name), item);
    }


    public static void registerModItems() {
        MoedaHcbr.LOGGER.info("Registering Mod Items for " + MoedaHcbr.MOD_ID);
    }

}
