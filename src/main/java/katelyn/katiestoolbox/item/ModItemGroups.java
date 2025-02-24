package katelyn.katiestoolbox.item;

import katelyn.katiestoolbox.KatiesToolbox;
import katelyn.katiestoolbox.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup PUFFER_GROUP = Registry.register(Registries.ITEM_GROUP, new Identifier(KatiesToolbox.MOD_ID,
            "puffer_ingot"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.puffer"))
                    .icon(() -> new ItemStack(ModItems.PUFFER_INGOT)).entries((displayContext, entries) -> {
                        entries.add(ModItems.PUFFER_INGOT);

                        entries.add(ModBlocks.PUFFER_BLOCK);

                    }).build());

    public static void registerItemGroups() {
        KatiesToolbox.LOGGER.info("Registering Item Groups for " + KatiesToolbox.MOD_ID);
    }
}
