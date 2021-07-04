package Milestone2;

import java.util.Comparator;

public class ComparatorName implements Comparator<AllContact>{
	
	@Override
	public int compare(AllContact o1, AllContact o2) {
		return o1.getName().compareTo(o2.getName());
	}
}
