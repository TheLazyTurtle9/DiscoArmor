package discoarmor;

import java.util.logging.Logger;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class DiscoArmor extends JavaPlugin {
  public static Logger log = Logger.getLogger("Minecraft");
  public void onEnable() {
    log.info("[DiscoArmor] Start up.");
  }
  public void onReload() {
    log.info("[DiscoArmor] Server reloaded.");
  }
  public void onDisable() {
    log.info("[DiscoArmor] Server stopping.");
  }

  public void putArmorOn(Player me){
    Player player = me;

    Material[] helmetColors = new Material[16];
    Material[] tunicColors = new Material[16];
    Material[] leggingColors = new Material[16];
    Material[] bootieColors = new Material[16];

    helmetColors[0] = Material.LEATHER_HELMET;
    tunicColors[0] = Material.LEATHER_CHESTPLATE;
    leggingColors[0] = Material.LEATHER_LEGGINGS;
    bootieColors[0] = Material.LEATHER_BOOTS;

    ItemStack helmet = new ItemStack(helmetColors[0], 1);
    ItemStack tunic = new ItemStack(tunicColors[0], 1);
    ItemStack leggings = new ItemStack(leggingColors[0], 1);
    ItemStack booties = new ItemStack(bootieColors[0], 1);
    player.getInventory().setItem(39, helmet);
    player.getInventory().setItem(38, tunic);
    player.getInventory().setItem(37, leggings);
    player.getInventory().setItem(36, booties);
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
