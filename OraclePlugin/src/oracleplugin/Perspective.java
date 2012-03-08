package oracleplugin;

import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

public class Perspective implements IPerspectiveFactory {

	public void createInitialLayout(IPageLayout layout) {
		String editorArea = layout.getEditorArea();
		layout.setEditorAreaVisible(false);
//		layout.setFixed(true);
		layout.addStandaloneView("oraclePlugin.PaneView",  true, IPageLayout.LEFT, 1.0f, editorArea);		
//		layout.addView("oraclePlugin.PaneView", IPageLayout.TOP,
//				IPageLayout.RATIO_MAX, IPageLayout.ID_EDITOR_AREA);
	}
}
