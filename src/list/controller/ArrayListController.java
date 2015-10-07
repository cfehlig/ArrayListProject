package list.controller;

import java.util.ArrayList;

public class ArrayListController
{
	private ArrayList<String> firstWords;
	
	public ArrayListController()
	{
		firstWords = new ArrayList<String>();
	}
	public void start()
	{
		firstWords.add("wefrrfdhgusydfg");
		firstWords.add("babababa");
	}
	
	private void showList()
	{
		for(int spot = 0; spot< firstWords.size(); spot++)
		{
			JOptionPane.showMessageDialog(null, firstWords.get(spot) + " is at spot# " +spot);
		}
	}

}
