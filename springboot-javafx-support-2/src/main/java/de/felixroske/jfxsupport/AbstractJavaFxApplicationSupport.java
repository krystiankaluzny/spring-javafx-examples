package de.felixroske.jfxsupport;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javafx.application.Application;
import javafx.application.HostServices;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * The Class AbstractJavaFxApplicationSupport.
 *
 * @author Felix Roske
 */
public abstract class AbstractJavaFxApplicationSupport {

	private static final Logger LOGGER = LoggerFactory.getLogger(AbstractJavaFxApplicationSupport.class);

	@Autowired JavaFxApplication javaFxApplication;

	public Application getApplication() {
		return javaFxApplication;
	}

	public Stage getStage() {
		return javaFxApplication.getStage();
	}

	//
	public Scene getScene() {
		return javaFxApplication.getScene();
	}

	//
	public HostServices getHostServices() {
		return javaFxApplication.getHostServices();
	}

	public String getTitle() {
		Stage stage = getStage();
		if (stage != null) {
			return stage.getTitle();
		}
		return null;
	}

	/**
	 * Sets the title. Allows to overwrite values applied during construction at
	 * a later time.
	 *
	 * @param title the new title
	 */
	public void setTitle(String title) {
		Stage stage = getStage();
		if (stage != null) {
			stage.setTitle(title);
		}
	}

	public void showViewOrError(Class<? extends AbstractFxmlView> newView) {
		javaFxApplication.showViewOrError(newView);
	}

	public void showView(Class<? extends AbstractFxmlView> newView) {
		javaFxApplication.showView(newView);
	}

	/**
	 * Call after Java Fx onInit and creation spring application context.
	 * Called on worker thread.
	 */
	protected void onInit() {
	}

	/**
	 * Call after Java Fx onStart and full fx support initialization.
	 * Called on FX thread.
	 */
	protected void onStart(Stage stage) {
	}

	/**
	 * Call in Java Fx stop. After that spring application context is onClose.
	 * @see Application#stop()
	 */
	protected void onStop() {
	}

	/**
	 * Call in Java Fx stop after spring application context close.
	 * @see Application#stop()
	 */
	protected void onClose() {

	}
}
