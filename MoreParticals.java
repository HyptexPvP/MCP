 EntityLivingBase entity;

Entity entity;
        if (e.getPacket() instanceof C02PacketUseEntity) {
            if (((C02PacketUseEntity) e.getPacket()).getAction() == C02PacketUseEntity.Action.ATTACK) {
                entity = ((C02PacketUseEntity) e.getPacket()).getEntityFromWorld(this.mc.theWorld);
                for (int i = 0; i < ((double) 10.0); i++) {
                    this.mc.effectRenderer.emitParticleAtEntity(entity, EnumParticleTypes.CRIT_MAGIC);
                    this.mc.effectRenderer.emitParticleAtEntity(entity, EnumParticleTypes.CRIT);
                }
            }
        }
