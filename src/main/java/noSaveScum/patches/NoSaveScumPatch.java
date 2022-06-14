package noSaveScum.patches;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePostfixPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpirePrefixPatch;
import com.evacipated.cardcrawl.modthespire.lib.SpireReturn;
import com.megacrit.cardcrawl.screens.mainMenu.MainMenuScreen;
import com.megacrit.cardcrawl.screens.mainMenu.MenuButton;
import com.megacrit.cardcrawl.screens.options.ExitGameButton;

import java.util.Iterator;

public class NoSaveScumPatch {

    @SpirePatch(clz = MainMenuScreen.class, method = "setMainMenuButtons")
    public static class RemoveResume {

        @SpirePostfixPatch
        public static void Postfix(MainMenuScreen __instance) {
            Iterator<MenuButton> buttons = __instance.buttons.iterator();
            while(buttons.hasNext()) {
                MenuButton button = buttons.next();
                if(button.result == MenuButton.ClickResult.RESUME_GAME) {
                    buttons.remove();
                }
            }
        }
    }

    @SpirePatch(clz = ExitGameButton.class, method = "render")
    public static class RemoveExit {

        @SpirePrefixPatch
        public static SpireReturn PreFix(ExitGameButton __instance, SpriteBatch sb) {
            return SpireReturn.Return();
        }
    }

    @SpirePatch(clz = ExitGameButton.class, method = "update")
    public static class RemoveExitUpdate {

        @SpirePrefixPatch
        public static SpireReturn PreFix(ExitGameButton __instance) {
            return SpireReturn.Return();
        }
    }
}
