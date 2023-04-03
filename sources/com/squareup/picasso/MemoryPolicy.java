package com.squareup.picasso;

public enum MemoryPolicy {
    NO_CACHE(1),
    NO_STORE(2);
    
    public final int index;

    /* access modifiers changed from: public */
    MemoryPolicy(int i) {
        this.index = i;
    }

    public static boolean shouldReadFromMemoryCache(int i) {
        if ((i & NO_CACHE.index) == 0) {
            return true;
        }
        return false;
    }

    public static boolean shouldWriteToMemoryCache(int i) {
        if ((i & NO_STORE.index) == 0) {
            return true;
        }
        return false;
    }
}
