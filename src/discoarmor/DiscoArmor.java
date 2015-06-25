package discoarmor;

import java.util.logging.Logger;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.LeatherArmorMeta;
import org.bukkit.Bukkit;
import org.bukkit.scheduler.BukkitScheduler;
import org.bukkit.Color;

public class DiscoArmor extends JavaPlugin {
  public static Logger log = Logger.getLogger("Minecraft");

  ItemStack helmet = new ItemStack(Material.LEATHER_HELMET, 1);
  ItemStack tunic = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
  ItemStack leggings = new ItemStack(Material.LEATHER_LEGGINGS, 1);
  ItemStack booties = new ItemStack(Material.LEATHER_BOOTS, 1);

  public void onEnable() {
    log.info("[DiscoArmor] Start up.");
  }
  public void onReload() {
    log.info("[DiscoArmor] Server reloaded.");
  }
  public void onDisable() {
    log.info("[DiscoArmor] Server stopping.");
  }

  public static ItemStack colorize(ItemStack item, Color color){
  LeatherArmorMeta meta = (LeatherArmorMeta) item.getItemMeta();
  meta.setColor(color);
  item.setItemMeta(meta);
  return item;
}
  public void putArmorOn(Player me){
    final Player player = me;

    BukkitScheduler scheduler = Bukkit.getServer().getScheduler();
        scheduler.scheduleSyncDelayedTask(this, new Runnable() {
            @Override
            public void run() {
                colorize(helmet, Color.RED);
                colorize(helmet, Color.BLUE);
                colorize(helmet, Color.AQUA);
            }
        }, 20L);

    player.getInventory().setItem(39, helmet);
    //player.getInventory().setItem(38, tunic);
    //player.getInventory().setItem(37, leggings);
    //player.getInventory().setItem(36, booties);
  }

  public boolean onCommand(CommandSender sender, Command command, 
                           String commandLabel, String[] args) {         
    if (commandLabel.equalsIgnoreCase("discoarmor")) {
      if (sender instanceof Player) { 
        Player me = (Player)sender;
        // Put your code after this line:

        // ...and finish your code before this line.
        return true;
        }
    }
    else if (commandLabel.equalsIgnoreCase("putArmorOn")) {
      if (sender instanceof Player){
        Player me = (Player) sender;
        //Start code
        putArmorOn(me);
        //End code
        return true;
      }
    }
    return false;
  }
}
