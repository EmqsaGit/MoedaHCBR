package net.emqsagit.moedahcbr;

import net.emqsagit.moedahcbr.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoedaHcbr implements ModInitializer {
	public static final String MOD_ID = "moedahcbr";
	public static final Logger LOGGER = LoggerFactory.getLogger("MOD_ID");

	@Override
	public void onInitialize() {

		ModItems.registerModItems();

	}
}
