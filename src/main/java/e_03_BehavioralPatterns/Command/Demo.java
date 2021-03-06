package e_03_BehavioralPatterns.Command;

public class Demo {

	public static void main(String[] args) {
		Document doc = new Document();

		ActionListenerCommand clickOpen = new ActionOpen(doc);
		ActionListenerCommand clickSave = new ActionSave(doc);

		MenuOptions menu = new MenuOptions(clickOpen, clickSave);

		menu.clickOpen();
		menu.clickSave();
	}
}
