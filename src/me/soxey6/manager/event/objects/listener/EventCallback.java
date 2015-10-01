package me.soxey6.manager.event.objects.listener;

import me.soxey6.manager.event.objects.Event;

public interface EventCallback<T extends Event> {
	public void onEvent(T event);
}
