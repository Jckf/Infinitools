package no.jckf.infinitools;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.plugin.java.JavaPlugin;

import static org.bukkit.Material.*;

public class Infinitools extends JavaPlugin implements Listener {
	public void onEnable() {
		getServer().getPluginManager().registerEvents(this,this);
	}

	public void onDisable() {

	}

	@EventHandler
	public void onInteract(PlayerInteractEvent event) {
		ItemStack item = event.getPlayer().getItemInHand();

		switch (item.getType()) {
			case BOW:
			case FLINT_AND_STEEL:
			case SHEARS:
			case FISHING_ROD:

			case WOOD_AXE:
			case WOOD_PICKAXE:
			case WOOD_SPADE:
			case WOOD_HOE:
			case WOOD_SWORD:

			case STONE_AXE:
			case STONE_PICKAXE:
			case STONE_SPADE:
			case STONE_HOE:
			case STONE_SWORD:

			case IRON_AXE:
			case IRON_PICKAXE:
			case IRON_SPADE:
			case IRON_HOE:
			case IRON_SWORD:

			case GOLD_AXE:
			case GOLD_PICKAXE:
			case GOLD_SPADE:
			case GOLD_HOE:
			case GOLD_SWORD:

			case DIAMOND_AXE:
			case DIAMOND_PICKAXE:
			case DIAMOND_SPADE:
			case DIAMOND_HOE:
			case DIAMOND_SWORD:

				item.setDurability((short) - 1);
		}
	}

	@EventHandler
	public void onDamage(EntityDamageEvent event) {
		Entity entity = event.getEntity();

		if (entity instanceof Player) {
			PlayerInventory inv = ((Player) entity).getInventory();

			ItemStack helmet = inv.getHelmet();
			if (helmet != null) {
				helmet.setDurability((short) -1);
			}

			ItemStack chest = inv.getChestplate();
			if (chest != null) {
				chest.setDurability((short) -1);
			}

			ItemStack leggings = inv.getLeggings();
			if (leggings != null) {
				leggings.setDurability((short) -1);
			}

			ItemStack boots = inv.getBoots();
			if (boots != null) {
				boots.setDurability((short) - 1);
			}
		}
	}
}
