/* 
 * Copyright (c) CovertJaguar, 2014 http://railcraft.info
 * 
 * This code is the property of CovertJaguar
 * and may only be used with explicit written
 * permission unless otherwise specified on the
 * license page at http://railcraft.info/wiki/info:license.
 */
package mods.railcraft.common.blocks.signals;

import net.minecraft.world.World;
import mods.railcraft.api.signals.SignalAspect;
import mods.railcraft.common.gui.buttons.LockButtonState;

/**
 *
 * @author CovertJaguar <http://www.railcraft.info>
 */
public interface IAspectActionManager extends ISecure<LockButtonState> {

    boolean doesActionOnAspect(SignalAspect aspect);

    void doActionOnAspect(SignalAspect aspect, boolean trigger);

    World getWorld();

}
