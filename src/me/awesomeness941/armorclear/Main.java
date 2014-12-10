 package me.awesomeness941.armorclear;
 
 import java.io.PrintStream;
 import org.bukkit.plugin.java.JavaPlugin;
 import org.bukkit.ChatColor;
 import org.bukkit.Material;
 import org.bukkit.command.Command;
 import org.bukkit.command.CommandSender;
 import org.bukkit.inventory.PlayerInventory;
 import org.bukkit.entity.Player;
 import org.bukkit.inventory.ItemStack;
 
 public class Main
   extends JavaPlugin
 {
   public void onEnable()
   {
     System.out.println("ArmorClear enabled");
   }
   
   public void onDisable()
   {
     System.out.println("ArmorClear disabled");
   }
   
   public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
   {
     Player p = (Player)sender;
     if ((cmd.getName().equalsIgnoreCase("armorclear")) && 
       ((sender instanceof Player)))
     {
       if (args.length == 0) {
         if (p.hasPermission("armorclear.help"))
         {
           p.sendMessage(ChatColor.GOLD + "ArmorClear - Help");
           p.sendMessage(ChatColor.YELLOW + "/armorclear helmet - Clears your helmet slot");
		   p.sendMessage(ChatColor.YELLOW + "/armorclear chestplate - Clears your chestplate slot");
		   p.sendMessage(ChatColor.YELLOW + "/armorclear leggings - Clears your leggings slot");
		   p.sendMessage(ChatColor.YELLOW + "/armorclear boots - Clears your boots slot");
		   p.sendMessage(ChatColor.YELLOW + "/armorclear all - Clears all of your armor slots");
         }
         else
         {
         }
         }
         else if (args[0].equalsIgnoreCase("helmet"))
         {
           if (p.hasPermission("armorclear.helmet"))
           {
             p.getInventory().setHelmet(new ItemStack(Material.AIR));
             p.sendMessage(ChatColor.GOLD + "" + ChatColor.BOLD + "Your helmet has been removed");
           }
           
           else
           {
           }
         }
         else if (args[0].equalsIgnoreCase("chestplate"))
         {
           if (p.hasPermission("armorclear.chestplate"))
           {
             p.getInventory().setChestplate(new ItemStack(Material.AIR));
             p.sendMessage(ChatColor.GOLD + "" + ChatColor.BOLD + "Your chestplate has been removed");
           }
           
           else
           {
           }
         }
         else if (args[0].equalsIgnoreCase("leggings"))
         {
           if (p.hasPermission("armorclear.leggings"))
           {
             p.getInventory().setLeggings(new ItemStack(Material.AIR));
             p.sendMessage(ChatColor.GOLD + "" + ChatColor.BOLD + "Your leggings have been removed");
           }
           
           else
           {
           }
         }
         else if (args[0].equalsIgnoreCase("boots"))
         {
           if (p.hasPermission("armorclear.boots"))
           {
             p.getInventory().setBoots(new ItemStack(Material.AIR));
             p.sendMessage(ChatColor.GOLD + "" + ChatColor.BOLD + "Your boots have been removed");
           }
           
           else
           {
           }
         }
         else if (args[0].equals("all")) {
           if (p.hasPermission("armorclear.all"))
           {
             p.getInventory().setBoots(new ItemStack(Material.AIR));
             p.getInventory().setLeggings(new ItemStack(Material.AIR));
             p.getInventory().setChestplate(new ItemStack(Material.AIR));
             p.getInventory().setHelmet(new ItemStack(Material.AIR));
             p.sendMessage(ChatColor.GOLD + "" + ChatColor.BOLD + "All of your armor has been removed");
           {
           				}
           			}
         		}
       		}
	return false;
   		}
 	}