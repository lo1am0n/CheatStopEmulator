package me.hydro.emulator.collision.impl;

import me.hydro.emulator.collision.Block;
import me.hydro.emulator.collision.CollisionLandable;
import me.hydro.emulator.collision.VerticalCollisionBlock;
import me.hydro.emulator.object.iteration.IterationHolder;

public class BlockSlime extends Block implements CollisionLandable, VerticalCollisionBlock {

    @Override
    public void transform(IterationHolder iteration) {
    }

    @Override
    public void onLand(IterationHolder iteration) {
    }
}
