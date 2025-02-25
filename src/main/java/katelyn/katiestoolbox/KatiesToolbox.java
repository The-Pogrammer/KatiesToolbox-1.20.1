package katelyn.katiestoolbox;

import katelyn.katiestoolbox.block.ModBlocks;
import katelyn.katiestoolbox.item.ModItemGroups;
import katelyn.katiestoolbox.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class KatiesToolbox implements ModInitializer {
	public static final String MOD_ID = "katiestoolbox";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();

		ModBlocks.registerModBlocks();
	}
}