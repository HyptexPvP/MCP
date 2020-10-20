	        if (e.getPacket() instanceof S45PacketTitle) {
	            S45PacketTitle packet = (S45PacketTitle) e.getPacket();
	            if (packet.getType().equals(S45PacketTitle.Type.TITLE)) {
	                String text = packet.getMessage().getUnformattedText();
	                if (text.toUpperCase().contains("VICTORY")) {
	                    mc.thePlayer.sendChatMessage("/ac gg ");
	                }
	            }
