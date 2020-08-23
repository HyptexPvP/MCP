 if (e.getPacket() instanceof C02PacketUseEntity) {
            if (((C02PacketUseEntity) e.getPacket()).getAction() == C02PacketUseEntity.Action.ATTACK) {
                this.entity = ((C02PacketUseEntity) e.getPacket()).getEntityFromWorld(this.mc.theWorld);
                this.range = decimalFormat.format((this.mc.thePlayer.getDistanceToEntity(this.entity)));
            } else {
            	this.range = "0.00";
            }
