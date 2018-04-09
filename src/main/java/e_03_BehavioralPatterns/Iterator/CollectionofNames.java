package e_03_BehavioralPatterns.Iterator;

public class CollectionofNames implements Container {

	public String name[] = { "Ivan Ivanov", "Peter Stoyanov", "Geri Petrova", "Iva Kitova", "Boyka Zasheva" };

	public int age[] = { 26, 25, 24, 25, 23 };

	public String address[] = { "Kazanlak", "Sofia", "Varna", "Stara Zagora", "Plovdiv" };

	public String designation[] = { "Java Programmer and Content Writer", "CEO", "Programmer and Web Designer",
			"Manager", ".Net Trainer" };

	public Iterator getIterator() {

		return new CollectionofNamesIterate();
	}

	private class CollectionofNamesIterate implements Iterator {

		int i;

		public boolean hasNext() {
			if (i < name.length) {
				return true;
			}
			return false;
		}

		public Object next() {
			if (this.hasNext()) {
				return name[i++];
			}
			return null;
		}

	}
}
