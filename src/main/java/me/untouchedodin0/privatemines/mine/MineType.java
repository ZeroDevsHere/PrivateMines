package me.untouchedodin0.privatemines.mine;

import me.untouchedodin0.privatemines.configmanager.annotations.ConfigMappable;
import me.untouchedodin0.privatemines.configmanager.annotations.ConfigPath;
import org.bukkit.Material;

import java.util.Map;

@ConfigMappable
public class MineType {

    @ConfigPath
    private String name;
    private String file;
    private int resetTime;
    private double resetPercentage;
    private Map<Material, Double> materials;

    public String getName() {
        return name;
    }

    public String getFile() {
        return file;
    }

    public int getResetTime() {
        return resetTime;
    }

    public Map<Material, Double> getMaterials() {
        return materials;
    }
}