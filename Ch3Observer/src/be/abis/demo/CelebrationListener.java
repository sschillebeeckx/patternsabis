package be.abis.demo;

import java.util.EventListener;

interface CelebrationListener extends EventListener {
	void attendCelebration(CelebrationEvent e);
}
