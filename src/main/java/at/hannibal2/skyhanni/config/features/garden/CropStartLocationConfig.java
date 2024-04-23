package at.hannibal2.skyhanni.config.features.garden;

import at.hannibal2.skyhanni.config.FeatureToggle;
import com.google.gson.annotations.Expose;
import io.github.notenoughupdates.moulconfig.annotations.ConfigEditorBoolean;
import io.github.notenoughupdates.moulconfig.annotations.ConfigOption;

public class CropStartLocationConfig {

    @Expose
    @ConfigOption(name = "Enable", desc = "Show the start waypoint for the farm for your current held tool. Do §e/shcropstartlocation §7to change the waypoint again.")
    @ConfigEditorBoolean
    @FeatureToggle
    public boolean enabled = false;

}
