package com.ironically.wdt;

import net.minecraft.util.DamageSource;
import net.minecraftforge.event.entity.living.LivingDropsEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class Events {
	
	@SubscribeEvent
	public void deathDrops(LivingDropsEvent e) {
		if(e.isRecentlyHit()==false&&(e.getSource().equals(DamageSource.ON_FIRE)))return;
		MobDrops.LivingDropEvent(e);
	}
}
