package menuClasses;

import dataManager.DMComponent;
import ioManagementClasses.IOComponent;

public class DeleteFromListAction implements Action {

	@Override
	public void execute(Object arg) {
		DMComponent dm = (DMComponent) arg; 
		IOComponent io = IOComponent.getComponent(); 
		io.output("\nDelete a position from list from the system:\n"); 
		String listName = io.getInput("\nEnter name of list: ");
		int pos = Integer.parseInt(io.getInput("enter position: "));
		
		dm. removeElementFromList(listName, pos); 
	}
}
