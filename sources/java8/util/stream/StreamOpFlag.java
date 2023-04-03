package java8.util.stream;

import java.util.EnumMap;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java8.util.C6037c;

enum StreamOpFlag {
    DISTINCT(0, r2.mo44350e(r4)),
    SORTED(1, m46337f(r1).mo44349d(r3).mo44350e(r4)),
    ORDERED(2, r7.mo44347b(r10)),
    SIZED(3, m46337f(r1).mo44349d(r3).mo44347b(r4)),
    SHORT_CIRCUIT(12, m46337f(r4).mo44349d(r9));
    
    public static final int INITIAL_OPS_VALUE = 0;
    public static final int IS_DISTINCT = 0;
    public static final int IS_ORDERED = 0;
    public static final int IS_SHORT_CIRCUIT = 0;
    public static final int IS_SIZED = 0;
    public static final int IS_SORTED = 0;
    public static final int NOT_DISTINCT = 0;
    public static final int NOT_ORDERED = 0;
    public static final int NOT_SIZED = 0;
    public static final int NOT_SORTED = 0;
    public static final int OP_MASK = 0;
    public static final int SPLITERATOR_CHARACTERISTICS_MASK = 0;
    public static final int STREAM_MASK = 0;
    public static final int TERMINAL_OP_MASK = 0;
    public static final int UPSTREAM_TERMINAL_OP_MASK = 0;

    /* renamed from: a */
    public static final int f30400a = 0;

    /* renamed from: d */
    public static final int f30401d = 0;

    /* renamed from: e */
    public static final int f30402e = 0;
    private final int bitPosition;
    private final int clear;
    private final Map<Type, Integer> maskTable;
    private final int preserve;
    private final int set;

    public enum Type {
        SPLITERATOR,
        STREAM,
        OP,
        TERMINAL_OP,
        UPSTREAM_TERMINAL_OP
    }

    /* renamed from: java8.util.stream.StreamOpFlag$a */
    public static class C6063a {

        /* renamed from: a */
        public final Map<Type, Integer> f30406a;

        public C6063a(Map<Type, Integer> map) {
            this.f30406a = map;
        }

        /* renamed from: a */
        public Map<Type, Integer> mo44346a() {
            Map<Type, Integer> map = this.f30406a;
            int i = 0;
            if (map instanceof ConcurrentMap) {
                ConcurrentMap concurrentMap = (ConcurrentMap) map;
                Type[] values = Type.values();
                int length = values.length;
                while (i < length) {
                    concurrentMap.putIfAbsent(values[i], 0);
                    i++;
                }
                return concurrentMap;
            }
            Type[] values2 = Type.values();
            int length2 = values2.length;
            while (i < length2) {
                C6037c.m46207b(this.f30406a, values2[i], 0);
                i++;
            }
            return this.f30406a;
        }

        /* renamed from: b */
        public C6063a mo44347b(Type type) {
            return mo44348c(type, 2);
        }

        /* renamed from: c */
        public C6063a mo44348c(Type type, Integer num) {
            this.f30406a.put(type, num);
            return this;
        }

        /* renamed from: d */
        public C6063a mo44349d(Type type) {
            return mo44348c(type, 1);
        }

        /* renamed from: e */
        public C6063a mo44350e(Type type) {
            return mo44348c(type, 3);
        }
    }

    /* access modifiers changed from: public */
    static {
        StreamOpFlag streamOpFlag;
        Type type;
        Type type2;
        Type type3;
        StreamOpFlag streamOpFlag2;
        StreamOpFlag streamOpFlag3;
        Type type4;
        Type type5;
        StreamOpFlag streamOpFlag4;
        StreamOpFlag streamOpFlag5;
        SPLITERATOR_CHARACTERISTICS_MASK = m46335d(type);
        int d = m46335d(type2);
        STREAM_MASK = d;
        OP_MASK = m46335d(type3);
        TERMINAL_OP_MASK = m46335d(type4);
        UPSTREAM_TERMINAL_OP_MASK = m46335d(type5);
        f30400a = m46334a();
        f30401d = d;
        int i = d << 1;
        f30402e = i;
        INITIAL_OPS_VALUE = d | i;
        IS_DISTINCT = streamOpFlag.set;
        NOT_DISTINCT = streamOpFlag.clear;
        IS_SORTED = streamOpFlag2.set;
        NOT_SORTED = streamOpFlag2.clear;
        IS_ORDERED = streamOpFlag3.set;
        NOT_ORDERED = streamOpFlag3.clear;
        IS_SIZED = streamOpFlag4.set;
        NOT_SIZED = streamOpFlag4.clear;
        IS_SHORT_CIRCUIT = streamOpFlag5.set;
    }

    /* access modifiers changed from: public */
    StreamOpFlag(int i, C6063a aVar) {
        this.maskTable = aVar.mo44346a();
        int i2 = i * 2;
        this.bitPosition = i2;
        this.set = 1 << i2;
        this.clear = 2 << i2;
        this.preserve = 3 << i2;
    }

    /* renamed from: a */
    public static int m46334a() {
        int i = 0;
        for (StreamOpFlag streamOpFlag : values()) {
            i |= streamOpFlag.preserve;
        }
        return i;
    }

    public static int combineOpFlags(int i, int i2) {
        return i | (i2 & m46336e(i));
    }

    /* renamed from: d */
    public static int m46335d(Type type) {
        int i = 0;
        for (StreamOpFlag streamOpFlag : values()) {
            i |= streamOpFlag.maskTable.get(type).intValue() << streamOpFlag.bitPosition;
        }
        return i;
    }

    /* renamed from: e */
    public static int m46336e(int i) {
        if (i == 0) {
            return f30400a;
        }
        return ~(((i & f30402e) >> 1) | ((f30401d & i) << 1) | i);
    }

    /* renamed from: f */
    public static C6063a m46337f(Type type) {
        return new C6063a(new EnumMap(Type.class)).mo44349d(type);
    }

    public static int fromCharacteristics(z66<?> z66) {
        int characteristics = z66.characteristics();
        if ((characteristics & 4) == 0 || z66.getComparator() == null) {
            return SPLITERATOR_CHARACTERISTICS_MASK & characteristics;
        }
        return SPLITERATOR_CHARACTERISTICS_MASK & characteristics & -5;
    }

    public static int toCharacteristics(int i) {
        return i & SPLITERATOR_CHARACTERISTICS_MASK;
    }

    public static int toStreamFlags(int i) {
        return i & ((~i) >> 1) & f30401d;
    }

    public boolean canSet(Type type) {
        if ((this.maskTable.get(type).intValue() & 1) > 0) {
            return true;
        }
        return false;
    }

    public int clear() {
        return this.clear;
    }

    public boolean isCleared(int i) {
        if ((i & this.preserve) == this.clear) {
            return true;
        }
        return false;
    }

    public boolean isKnown(int i) {
        if ((i & this.preserve) == this.set) {
            return true;
        }
        return false;
    }

    public boolean isPreserved(int i) {
        int i2 = this.preserve;
        if ((i & i2) == i2) {
            return true;
        }
        return false;
    }

    public boolean isStreamFlag() {
        if (this.maskTable.get(Type.STREAM).intValue() > 0) {
            return true;
        }
        return false;
    }

    public int set() {
        return this.set;
    }

    public static int fromCharacteristics(int i) {
        return i & SPLITERATOR_CHARACTERISTICS_MASK;
    }
}
