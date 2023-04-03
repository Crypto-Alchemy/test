package com.google.common.collect;

import java.util.AbstractMap;
import java.util.Map;
import java.util.Objects;

final class RegularImmutableMap<K, V> extends ImmutableMap<K, V> {
    public static final ImmutableMap<Object, Object> EMPTY = new RegularImmutableMap((Object) null, new Object[0], 0);
    private static final long serialVersionUID = 0;
    public final transient Object[] alternatingKeysAndValues;

    /* renamed from: k */
    public final transient Object f24979k;

    /* renamed from: r */
    public final transient int f24980r;

    public static class EntrySet<K, V> extends ImmutableSet<Map.Entry<K, V>> {

        /* renamed from: e */
        public final transient ImmutableMap<K, V> f24981e;

        /* renamed from: g */
        public final transient Object[] f24982g;

        /* renamed from: k */
        public final transient int f24983k;

        /* renamed from: r */
        public final transient int f24984r;

        public EntrySet(ImmutableMap<K, V> immutableMap, Object[] objArr, int i, int i2) {
            this.f24981e = immutableMap;
            this.f24982g = objArr;
            this.f24983k = i;
            this.f24984r = i2;
        }

        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value == null || !value.equals(this.f24981e.get(key))) {
                return false;
            }
            return true;
        }

        public int copyIntoArray(Object[] objArr, int i) {
            return asList().copyIntoArray(objArr, i);
        }

        public ImmutableList<Map.Entry<K, V>> createAsList() {
            return new ImmutableList<Map.Entry<K, V>>() {
                public boolean isPartialView() {
                    return true;
                }

                public int size() {
                    return EntrySet.this.f24984r;
                }

                public Map.Entry<K, V> get(int i) {
                    du4.m43689i(i, EntrySet.this.f24984r);
                    int i2 = i * 2;
                    Object obj = EntrySet.this.f24982g[EntrySet.this.f24983k + i2];
                    Objects.requireNonNull(obj);
                    Object obj2 = EntrySet.this.f24982g[i2 + (EntrySet.this.f24983k ^ 1)];
                    Objects.requireNonNull(obj2);
                    return new AbstractMap.SimpleImmutableEntry(obj, obj2);
                }
            };
        }

        public boolean isPartialView() {
            return true;
        }

        public int size() {
            return this.f24984r;
        }

        public c47<Map.Entry<K, V>> iterator() {
            return asList().iterator();
        }
    }

    public static final class KeySet<K> extends ImmutableSet<K> {

        /* renamed from: e */
        public final transient ImmutableMap<K, ?> f24985e;

        /* renamed from: g */
        public final transient ImmutableList<K> f24986g;

        public KeySet(ImmutableMap<K, ?> immutableMap, ImmutableList<K> immutableList) {
            this.f24985e = immutableMap;
            this.f24986g = immutableList;
        }

        public ImmutableList<K> asList() {
            return this.f24986g;
        }

        public boolean contains(Object obj) {
            if (this.f24985e.get(obj) != null) {
                return true;
            }
            return false;
        }

        public int copyIntoArray(Object[] objArr, int i) {
            return asList().copyIntoArray(objArr, i);
        }

        public boolean isPartialView() {
            return true;
        }

        public int size() {
            return this.f24985e.size();
        }

        public c47<K> iterator() {
            return asList().iterator();
        }
    }

    public static final class KeysOrValuesAsList extends ImmutableList<Object> {

        /* renamed from: e */
        public final transient Object[] f24987e;

        /* renamed from: g */
        public final transient int f24988g;

        /* renamed from: k */
        public final transient int f24989k;

        public KeysOrValuesAsList(Object[] objArr, int i, int i2) {
            this.f24987e = objArr;
            this.f24988g = i;
            this.f24989k = i2;
        }

        public Object get(int i) {
            du4.m43689i(i, this.f24989k);
            Object obj = this.f24987e[(i * 2) + this.f24988g];
            Objects.requireNonNull(obj);
            return obj;
        }

        public boolean isPartialView() {
            return true;
        }

        public int size() {
            return this.f24989k;
        }
    }

    public RegularImmutableMap(Object obj, Object[] objArr, int i) {
        this.f24979k = obj;
        this.alternatingKeysAndValues = objArr;
        this.f24980r = i;
    }

    /* renamed from: a */
    public static IllegalArgumentException m36978a(Object obj, Object obj2, Object[] objArr, int i) {
        String valueOf = String.valueOf(obj);
        String valueOf2 = String.valueOf(obj2);
        String valueOf3 = String.valueOf(objArr[i]);
        String valueOf4 = String.valueOf(objArr[i ^ 1]);
        StringBuilder sb = new StringBuilder(valueOf.length() + 39 + valueOf2.length() + valueOf3.length() + valueOf4.length());
        sb.append("Multiple entries with same key: ");
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        sb.append(" and ");
        sb.append(valueOf3);
        sb.append("=");
        sb.append(valueOf4);
        return new IllegalArgumentException(sb.toString());
    }

    public static <K, V> RegularImmutableMap<K, V> create(int i, Object[] objArr) {
        if (i == 0) {
            return (RegularImmutableMap) EMPTY;
        }
        if (i == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[1];
            Objects.requireNonNull(obj2);
            ki0.m47099a(obj, obj2);
            return new RegularImmutableMap<>((Object) null, objArr, 1);
        }
        du4.m43693m(i, objArr.length >> 1);
        return new RegularImmutableMap<>(createHashTable(objArr, i, ImmutableSet.chooseTableSize(i), 0), objArr, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0045, code lost:
        r11[r5] = (byte) r1;
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008b, code lost:
        r11[r5] = (short) r1;
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00c8, code lost:
        r11[r6] = r1;
        r2 = r2 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object createHashTable(java.lang.Object[] r9, int r10, int r11, int r12) {
        /*
            r0 = 1
            if (r10 != r0) goto L_0x0014
            r10 = r9[r12]
            java.util.Objects.requireNonNull(r10)
            r11 = r12 ^ 1
            r9 = r9[r11]
            java.util.Objects.requireNonNull(r9)
            p000.ki0.m47099a(r10, r9)
            r9 = 0
            return r9
        L_0x0014:
            int r0 = r11 + -1
            r1 = 128(0x80, float:1.794E-43)
            r2 = 0
            r3 = -1
            if (r11 > r1) goto L_0x005c
            byte[] r11 = new byte[r11]
            java.util.Arrays.fill(r11, r3)
        L_0x0021:
            if (r2 >= r10) goto L_0x005b
            int r1 = r2 * 2
            int r1 = r1 + r12
            r3 = r9[r1]
            java.util.Objects.requireNonNull(r3)
            r4 = r1 ^ 1
            r4 = r9[r4]
            java.util.Objects.requireNonNull(r4)
            p000.ki0.m47099a(r3, r4)
            int r5 = r3.hashCode()
            int r5 = p000.ml2.m48361b(r5)
        L_0x003d:
            r5 = r5 & r0
            byte r6 = r11[r5]
            r7 = 255(0xff, float:3.57E-43)
            r6 = r6 & r7
            if (r6 != r7) goto L_0x004b
            byte r1 = (byte) r1
            r11[r5] = r1
            int r2 = r2 + 1
            goto L_0x0021
        L_0x004b:
            r7 = r9[r6]
            boolean r7 = r3.equals(r7)
            if (r7 != 0) goto L_0x0056
            int r5 = r5 + 1
            goto L_0x003d
        L_0x0056:
            java.lang.IllegalArgumentException r9 = m36978a(r3, r4, r9, r6)
            throw r9
        L_0x005b:
            return r11
        L_0x005c:
            r1 = 32768(0x8000, float:4.5918E-41)
            if (r11 > r1) goto L_0x00a2
            short[] r11 = new short[r11]
            java.util.Arrays.fill(r11, r3)
        L_0x0066:
            if (r2 >= r10) goto L_0x00a1
            int r1 = r2 * 2
            int r1 = r1 + r12
            r3 = r9[r1]
            java.util.Objects.requireNonNull(r3)
            r4 = r1 ^ 1
            r4 = r9[r4]
            java.util.Objects.requireNonNull(r4)
            p000.ki0.m47099a(r3, r4)
            int r5 = r3.hashCode()
            int r5 = p000.ml2.m48361b(r5)
        L_0x0082:
            r5 = r5 & r0
            short r6 = r11[r5]
            r7 = 65535(0xffff, float:9.1834E-41)
            r6 = r6 & r7
            if (r6 != r7) goto L_0x0091
            short r1 = (short) r1
            r11[r5] = r1
            int r2 = r2 + 1
            goto L_0x0066
        L_0x0091:
            r7 = r9[r6]
            boolean r7 = r3.equals(r7)
            if (r7 != 0) goto L_0x009c
            int r5 = r5 + 1
            goto L_0x0082
        L_0x009c:
            java.lang.IllegalArgumentException r9 = m36978a(r3, r4, r9, r6)
            throw r9
        L_0x00a1:
            return r11
        L_0x00a2:
            int[] r11 = new int[r11]
            java.util.Arrays.fill(r11, r3)
        L_0x00a7:
            if (r2 >= r10) goto L_0x00dd
            int r1 = r2 * 2
            int r1 = r1 + r12
            r4 = r9[r1]
            java.util.Objects.requireNonNull(r4)
            r5 = r1 ^ 1
            r5 = r9[r5]
            java.util.Objects.requireNonNull(r5)
            p000.ki0.m47099a(r4, r5)
            int r6 = r4.hashCode()
            int r6 = p000.ml2.m48361b(r6)
        L_0x00c3:
            r6 = r6 & r0
            r7 = r11[r6]
            if (r7 != r3) goto L_0x00cd
            r11[r6] = r1
            int r2 = r2 + 1
            goto L_0x00a7
        L_0x00cd:
            r8 = r9[r7]
            boolean r8 = r4.equals(r8)
            if (r8 != 0) goto L_0x00d8
            int r6 = r6 + 1
            goto L_0x00c3
        L_0x00d8:
            java.lang.IllegalArgumentException r9 = m36978a(r4, r5, r9, r7)
            throw r9
        L_0x00dd:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.RegularImmutableMap.createHashTable(java.lang.Object[], int, int, int):java.lang.Object");
    }

    public ImmutableSet<Map.Entry<K, V>> createEntrySet() {
        return new EntrySet(this, this.alternatingKeysAndValues, 0, this.f24980r);
    }

    public ImmutableSet<K> createKeySet() {
        return new KeySet(this, new KeysOrValuesAsList(this.alternatingKeysAndValues, 0, this.f24980r));
    }

    public ImmutableCollection<V> createValues() {
        return new KeysOrValuesAsList(this.alternatingKeysAndValues, 1, this.f24980r);
    }

    public V get(Object obj) {
        V v = get(this.f24979k, this.alternatingKeysAndValues, this.f24980r, 0, obj);
        if (v == null) {
            return null;
        }
        return v;
    }

    public boolean isPartialView() {
        return false;
    }

    public int size() {
        return this.f24980r;
    }

    public static Object get(Object obj, Object[] objArr, int i, int i2, Object obj2) {
        if (obj2 == null) {
            return null;
        }
        if (i == 1) {
            Object obj3 = objArr[i2];
            Objects.requireNonNull(obj3);
            if (!obj3.equals(obj2)) {
                return null;
            }
            Object obj4 = objArr[i2 ^ 1];
            Objects.requireNonNull(obj4);
            return obj4;
        } else if (obj == null) {
            return null;
        } else {
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                int length = bArr.length - 1;
                int b = ml2.m48361b(obj2.hashCode());
                while (true) {
                    int i3 = b & length;
                    byte b2 = bArr[i3] & 255;
                    if (b2 == 255) {
                        return null;
                    }
                    if (obj2.equals(objArr[b2])) {
                        return objArr[b2 ^ 1];
                    }
                    b = i3 + 1;
                }
            } else if (obj instanceof short[]) {
                short[] sArr = (short[]) obj;
                int length2 = sArr.length - 1;
                int b3 = ml2.m48361b(obj2.hashCode());
                while (true) {
                    int i4 = b3 & length2;
                    short s = sArr[i4] & 65535;
                    if (s == 65535) {
                        return null;
                    }
                    if (obj2.equals(objArr[s])) {
                        return objArr[s ^ 1];
                    }
                    b3 = i4 + 1;
                }
            } else {
                int[] iArr = (int[]) obj;
                int length3 = iArr.length - 1;
                int b4 = ml2.m48361b(obj2.hashCode());
                while (true) {
                    int i5 = b4 & length3;
                    int i6 = iArr[i5];
                    if (i6 == -1) {
                        return null;
                    }
                    if (obj2.equals(objArr[i6])) {
                        return objArr[i6 ^ 1];
                    }
                    b4 = i5 + 1;
                }
            }
        }
    }
}
