package menuClasses;

import dataManager.DMComponent;

public class AlterlistContentAction implements Action {

	@Override
	public void execute(Object arg) {
		DMComponent dm = (DMComponent) arg; 
		dm.getMenuStack().push(AlterListContentMenu.getAlterListContentMenu()); 
	}

}
