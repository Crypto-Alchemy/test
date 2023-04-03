package com.facebook.cache.disk;

import com.facebook.cache.disk.C1916b;

/* renamed from: com.facebook.cache.disk.a */
/* compiled from: DefaultEntryEvictionComparatorSupplier */
public class C1914a implements wq1 {

    /* renamed from: com.facebook.cache.disk.a$a */
    /* compiled from: DefaultEntryEvictionComparatorSupplier */
    public class C1915a implements C1925e {
        public C1915a() {
        }

        /* renamed from: a */
        public int compare(C1916b.C1917a aVar, C1916b.C1917a aVar2) {
            long timestamp = aVar.getTimestamp();
            long timestamp2 = aVar2.getTimestamp();
            if (timestamp < timestamp2) {
                return -1;
            }
            if (timestamp2 == timestamp) {
                return 0;
            }
            return 1;
        }
    }

    public C1925e get() {
        return new C1915a();
    }
}
