package app3;

public interface automobile {
	/*
	void demarrer();
	void arrater();
	*/
	default void demarrer() {
		System.out.println("pausser .... pausser");
	}
	default void arrater() {
		System.out.println("tiere ...tiere");
	}
}
