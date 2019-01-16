package droidninja.filepicker.models.sort;

import java.util.Comparator;

import droidninja.filepicker.models.Document;

/**
 * Created by gabriel on 10/2/17.
 */

public class TimeComparator implements Comparator<Document> {

    protected TimeComparator() { }

    @Override
    public int compare(Document o1, Document o2) {
        if(o1.getTime() > o2.getTime())
            return -1;
        if(o1.getTime() < o2.getTime())
            return 1;
        return 0;
    }
}
