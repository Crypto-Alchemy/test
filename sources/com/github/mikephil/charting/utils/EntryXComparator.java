package com.github.mikephil.charting.utils;

import com.github.mikephil.charting.data.Entry;
import java.util.Comparator;

public class EntryXComparator implements Comparator<Entry> {
    public int compare(Entry entry, Entry entry2) {
        int i = ((entry.getX() - entry2.getX()) > Utils.FLOAT_EPSILON ? 1 : ((entry.getX() - entry2.getX()) == Utils.FLOAT_EPSILON ? 0 : -1));
        if (i == 0) {
            return 0;
        }
        return i > 0 ? 1 : -1;
    }
}
