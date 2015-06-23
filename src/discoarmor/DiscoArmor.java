package discoarmor;

import java.util.logging.Logger;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

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
    return false;
  }
}
