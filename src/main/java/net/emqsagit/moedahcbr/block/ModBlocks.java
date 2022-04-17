package net.emqsagit.moedahcbr.block;

import net.emqsagit.moedahcbr.MoedaHcbr;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    //Blocos

    public static final Block NOVECENTOS_HERMITDOLLARS = registerBlock("bloco_hermitdollar_novecentos",
            new Block(FabricBlockSettings.of(Material.WOOL).strength(1f).requiresTool().lightLevel(3), ItemGroup.DECORATIONS));

    //Código pros blocos funcionarem

    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(MoedaHcbr.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(MoedaHcbr.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks() {
        MoedaHcbr.LOGGER.info("Registering ModBlocks for" + MoedaHcbr.MOD_ID);
    }

}