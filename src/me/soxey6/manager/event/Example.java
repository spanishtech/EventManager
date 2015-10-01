package me.soxey6.manager.event;

import me.soxey6.manager.event.objects.Event;
import me.soxey6.manager.event.objects.listener.EventListener;

public class Example {

	public static void main(String[] args)
	{
		new EventManager();
		
		
		new EventListener<Event>(Event.class, event -> {
			System.out.println("Event triggered");
		});
		EventManager.getEventManager().dispatch(new Event());	
	}
}
