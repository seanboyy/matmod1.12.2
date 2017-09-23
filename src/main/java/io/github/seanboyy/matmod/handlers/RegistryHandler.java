package io.github.seanboyy.matmod.handlers;

import io.github.seanboyy.matmod.init.ItemInit;

public class RegistryHandler {

	public static void Client() {
		ItemInit.register();
	}
	
	public static void Common() {
		ItemInit.init();
	}
	
}
