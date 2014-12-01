package org.vaadin.suggestfield.client;

import com.vaadin.shared.AbstractFieldState;

@SuppressWarnings("serial")
public class SuggestFieldState extends AbstractFieldState {
	// public List<AutocompleteFieldSuggestion> suggestions =
	// Collections.emptyList();
	public SuggestFieldSuggestion value = null;
	public int delayMillis = 300;
	public String inputPrompt = "";
	public int minimumQueryCharacters = 3;
	public boolean trimQuery = true;
	public String popupWidth = null;
	public boolean allowNewItem = false;
}