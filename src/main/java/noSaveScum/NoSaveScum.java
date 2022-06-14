package noSaveScum;

import basemod.BaseMod;
import basemod.interfaces.*;
import com.badlogic.gdx.Gdx;
import com.evacipated.cardcrawl.mod.stslib.Keyword;
import com.evacipated.cardcrawl.modthespire.lib.SpireInitializer;
import com.google.gson.Gson;
import com.megacrit.cardcrawl.unlock.UnlockTracker;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.nio.charset.StandardCharsets;

@SuppressWarnings({"unused", "WeakerAccess"})
@SpireInitializer
public class NoSaveScum{

    public static final String modID = "nosavescum";

    public static String makeID(String idText) {
        return modID + ":" + idText;
    }

    // This makes debugging so much easier
    public static Logger logger = LogManager.getLogger(NoSaveScum.class.getName());

    public NoSaveScum() { }

    public static void initialize() {
        NoSaveScum thismod = new NoSaveScum();
    }

}
