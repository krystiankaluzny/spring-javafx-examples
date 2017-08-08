package de.felixroske.jfxsupport;

/**
 * Created by Krystian Kałużny on 24.06.2017.
 */

public class StartConfiguration {
	Class<?> startClass;
	String[] startArgs = new String[0];
	Class<? extends AbstractFxmlView> startView;
	SplashScreen splashScreen = new SplashScreen();
	boolean showErrorScreen = true;
	boolean webEnvironment = false;

	public StartConfiguration setStartClass(Class<?> startClass) {
		this.startClass = checkNotNull(startClass);
		return this;
	}

	public StartConfiguration setStartArgs(String[] startArgs) {
		this.startArgs = checkNotNull(startArgs);
		return this;
	}

	public StartConfiguration setStartView(Class<? extends AbstractFxmlView> startView) {
		this.startView = checkNotNull(startView);
		return this;
	}

	public StartConfiguration setSplashScreen(SplashScreen splashScreen) {
		this.splashScreen = checkNotNull(splashScreen);
		return this;
	}

	public StartConfiguration setShowErrorScreen(boolean showErrorScreen) {
		this.showErrorScreen = showErrorScreen;
		return this;
	}

	public StartConfiguration setWebEnvironment(boolean webEnvironment) {
		this.webEnvironment = webEnvironment;
		return this;
	}

	private static <T> T checkNotNull(T obj) {
		if (obj == null) {
			throw new NullPointerException();
		}
		return obj;
	}
}
