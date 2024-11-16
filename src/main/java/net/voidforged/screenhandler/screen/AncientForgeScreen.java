package net.voidforged.screenhandler.screen;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.voidforged.Voidforged;
import net.voidforged.screenhandler.AncientForgeScreenHandler;

public class AncientForgeScreen extends HandledScreen<AncientForgeScreenHandler> {

    private static final Identifier TEXTURE = Identifier.of(Voidforged.MOD_ID, "textures/gui/container/ancient_forge.png");


    public AncientForgeScreen(AncientForgeScreenHandler handler, PlayerInventory inv, Text title) {
        super(handler, inv, title);

    }

    @Override
    protected void drawBackground(DrawContext context, float delta, int mouseX, int mouseY) {
        context.drawTexture(TEXTURE, this.x, this.y, 0, 0, this.backgroundWidth, this.backgroundHeight);
    }

    @Override
    public void render(DrawContext context, int mouseX, int mouseY, float delta) {
        super.render(context, mouseX, mouseY, delta);
        drawMouseoverTooltip(context,mouseX,mouseY);
    }
}
