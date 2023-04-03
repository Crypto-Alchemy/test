package com.google.common.collect;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public abstract class MultimapBuilder<K0, V0> {

    public static final class ArrayListSupplier<V> implements rd6<List<V>>, Serializable {
        private final int expectedValuesPerKey;

        public ArrayListSupplier(int i) {
            this.expectedValuesPerKey = ki0.m47100b(i, "expectedValuesPerKey");
        }

        public List<V> get() {
            return new ArrayList(this.expectedValuesPerKey);
        }
    }

    /* renamed from: com.google.common.collect.MultimapBuilder$a */
    public class C4597a extends C4600d<Object> {

        /* renamed from: a */
        public final /* synthetic */ int f24961a;

        public C4597a(int i) {
            this.f24961a = i;
        }

        /* renamed from: c */
        public <K, V> Map<K, Collection<V>> mo35055c() {
            return C4627f.m37019c(this.f24961a);
        }
    }

    /* renamed from: com.google.common.collect.MultimapBuilder$b */
    public class C4598b extends C4600d<K0> {

        /* renamed from: a */
        public final /* synthetic */ Comparator f24962a;

        public C4598b(Comparator comparator) {
            this.f24962a = comparator;
        }

        /* renamed from: c */
        public <K extends K0, V> Map<K, Collection<V>> mo35055c() {
            return new TreeMap(this.f24962a);
        }
    }

    /* renamed from: com.google.common.collect.MultimapBuilder$c */
    public static abstract class C4599c<K0, V0> extends MultimapBuilder<K0, V0> {
        public C4599c() {
            super((C4597a) null);
        }

        /* renamed from: e */
        public abstract <K extends K0, V extends V0> zh3<K, V> mo35056e();
    }

    /* renamed from: com.google.common.collect.MultimapBuilder$d */
    public static abstract class C4600d<K0> {

        /* renamed from: com.google.common.collect.MultimapBuilder$d$a */
        public class C4601a extends C4599c<K0, Object> {

            /* renamed from: a */
            public final /* synthetic */ int f24963a;

            public C4601a(int i) {
                this.f24963a = i;
            }

            /* renamed from: e */
            public <K extends K0, V> zh3<K, V> mo35056e() {
                return Multimaps.m36958b(C4600d.this.mo35055c(), new ArrayListSupplier(this.f24963a));
            }
        }

        /* renamed from: a */
        public C4599c<K0, Object> mo35057a() {
            return mo35058b(2);
        }

        /* renamed from: b */
        public C4599c<K0, Object> mo35058b(int i) {
            ki0.m47100b(i, "expectedValuesPerKey");
            return new C4601a(i);
        }

        /* renamed from: c */
        public abstract <K extends K0, V> Map<K, Collection<V>> mo35055c();
    }

    public MultimapBuilder() {
    }

    public /* synthetic */ MultimapBuilder(C4597a aVar) {
        this();
    }

    /* renamed from: a */
    public static C4600d<Object> m36946a() {
        return m36947b(8);
    }

    /* renamed from: b */
    public static C4600d<Object> m36947b(int i) {
        ki0.m47100b(i, "expectedKeys");
        return new C4597a(i);
    }

    /* renamed from: c */
    public static C4600d<Comparable> m36948c() {
        return m36949d(Ordering.natural());
    }

    /* renamed from: d */
    public static <K0> C4600d<K0> m36949d(Comparator<K0> comparator) {
        du4.m43691k(comparator);
        return new C4598b(comparator);
    }
}
