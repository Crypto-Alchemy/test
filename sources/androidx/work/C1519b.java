package androidx.work;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: androidx.work.b */
/* compiled from: Data */
public final class C1519b {

    /* renamed from: b */
    public static final String f7527b = qk3.m25728f("Data");

    /* renamed from: c */
    public static final C1519b f7528c = new C1520a().mo10930a();

    /* renamed from: a */
    public Map<String, Object> f7529a;

    /* renamed from: androidx.work.b$a */
    /* compiled from: Data */
    public static final class C1520a {

        /* renamed from: a */
        public Map<String, Object> f7530a = new HashMap();

        /* renamed from: a */
        public C1519b mo10930a() {
            C1519b bVar = new C1519b((Map<String, ?>) this.f7530a);
            C1519b.m10472n(bVar);
            return bVar;
        }

        /* renamed from: b */
        public C1520a mo10931b(String str, Object obj) {
            if (obj == null) {
                this.f7530a.put(str, (Object) null);
            } else {
                Class<?> cls = obj.getClass();
                if (cls == Boolean.class || cls == Byte.class || cls == Integer.class || cls == Long.class || cls == Float.class || cls == Double.class || cls == String.class || cls == Boolean[].class || cls == Byte[].class || cls == Integer[].class || cls == Long[].class || cls == Float[].class || cls == Double[].class || cls == String[].class) {
                    this.f7530a.put(str, obj);
                } else if (cls == boolean[].class) {
                    this.f7530a.put(str, C1519b.m10465a((boolean[]) obj));
                } else if (cls == byte[].class) {
                    this.f7530a.put(str, C1519b.m10466b((byte[]) obj));
                } else if (cls == int[].class) {
                    this.f7530a.put(str, C1519b.m10469e((int[]) obj));
                } else if (cls == long[].class) {
                    this.f7530a.put(str, C1519b.m10470f((long[]) obj));
                } else if (cls == float[].class) {
                    this.f7530a.put(str, C1519b.m10468d((float[]) obj));
                } else if (cls == double[].class) {
                    this.f7530a.put(str, C1519b.m10467c((double[]) obj));
                } else {
                    throw new IllegalArgumentException(String.format("Key %s has invalid type %s", new Object[]{str, cls}));
                }
            }
            return this;
        }

        /* renamed from: c */
        public C1520a mo10932c(C1519b bVar) {
            mo10933d(bVar.f7529a);
            return this;
        }

        /* renamed from: d */
        public C1520a mo10933d(Map<String, Object> map) {
            for (Map.Entry next : map.entrySet()) {
                mo10931b((String) next.getKey(), next.getValue());
            }
            return this;
        }

        /* renamed from: e */
        public C1520a mo10934e(String str, boolean z) {
            this.f7530a.put(str, Boolean.valueOf(z));
            return this;
        }

        /* renamed from: f */
        public C1520a mo10935f(String str, int i) {
            this.f7530a.put(str, Integer.valueOf(i));
            return this;
        }

        /* renamed from: g */
        public C1520a mo10936g(String str, long j) {
            this.f7530a.put(str, Long.valueOf(j));
            return this;
        }

        /* renamed from: h */
        public C1520a mo10937h(String str, String str2) {
            this.f7530a.put(str, str2);
            return this;
        }
    }

    public C1519b() {
    }

    /* renamed from: a */
    public static Boolean[] m10465a(boolean[] zArr) {
        Boolean[] boolArr = new Boolean[zArr.length];
        for (int i = 0; i < zArr.length; i++) {
            boolArr[i] = Boolean.valueOf(zArr[i]);
        }
        return boolArr;
    }

    /* renamed from: b */
    public static Byte[] m10466b(byte[] bArr) {
        Byte[] bArr2 = new Byte[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            bArr2[i] = Byte.valueOf(bArr[i]);
        }
        return bArr2;
    }

    /* renamed from: c */
    public static Double[] m10467c(double[] dArr) {
        Double[] dArr2 = new Double[dArr.length];
        for (int i = 0; i < dArr.length; i++) {
            dArr2[i] = Double.valueOf(dArr[i]);
        }
        return dArr2;
    }

    /* renamed from: d */
    public static Float[] m10468d(float[] fArr) {
        Float[] fArr2 = new Float[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            fArr2[i] = Float.valueOf(fArr[i]);
        }
        return fArr2;
    }

    /* renamed from: e */
    public static Integer[] m10469e(int[] iArr) {
        Integer[] numArr = new Integer[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            numArr[i] = Integer.valueOf(iArr[i]);
        }
        return numArr;
    }

    /* renamed from: f */
    public static Long[] m10470f(long[] jArr) {
        Long[] lArr = new Long[jArr.length];
        for (int i = 0; i < jArr.length; i++) {
            lArr[i] = Long.valueOf(jArr[i]);
        }
        return lArr;
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x002c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x003c */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0039 A[SYNTHETIC, Splitter:B:20:0x0039] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0042 A[SYNTHETIC, Splitter:B:28:0x0042] */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.work.C1519b m10471g(byte[] r5) {
        /*
            int r0 = r5.length
            r1 = 10240(0x2800, float:1.4349E-41)
            if (r0 > r1) goto L_0x004c
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r1.<init>(r5)
            r5 = 0
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch:{ IOException | ClassNotFoundException -> 0x0040, all -> 0x0034 }
            r2.<init>(r1)     // Catch:{ IOException | ClassNotFoundException -> 0x0040, all -> 0x0034 }
            int r5 = r2.readInt()     // Catch:{ IOException | ClassNotFoundException -> 0x0032, all -> 0x0030 }
        L_0x0019:
            if (r5 <= 0) goto L_0x0029
            java.lang.String r3 = r2.readUTF()     // Catch:{ IOException | ClassNotFoundException -> 0x0032, all -> 0x0030 }
            java.lang.Object r4 = r2.readObject()     // Catch:{ IOException | ClassNotFoundException -> 0x0032, all -> 0x0030 }
            r0.put(r3, r4)     // Catch:{ IOException | ClassNotFoundException -> 0x0032, all -> 0x0030 }
            int r5 = r5 + -1
            goto L_0x0019
        L_0x0029:
            r2.close()     // Catch:{ IOException -> 0x002c }
        L_0x002c:
            r1.close()     // Catch:{ IOException -> 0x0046 }
            goto L_0x0046
        L_0x0030:
            r5 = move-exception
            goto L_0x0037
        L_0x0032:
            r5 = r2
            goto L_0x0040
        L_0x0034:
            r0 = move-exception
            r2 = r5
            r5 = r0
        L_0x0037:
            if (r2 == 0) goto L_0x003c
            r2.close()     // Catch:{ IOException -> 0x003c }
        L_0x003c:
            r1.close()     // Catch:{ IOException -> 0x003f }
        L_0x003f:
            throw r5
        L_0x0040:
            if (r5 == 0) goto L_0x002c
            r5.close()     // Catch:{ IOException -> 0x002c }
            goto L_0x002c
        L_0x0046:
            androidx.work.b r5 = new androidx.work.b
            r5.<init>((java.util.Map<java.lang.String, ?>) r0)
            return r5
        L_0x004c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Data cannot occupy more than 10240 bytes when serialized"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.C1519b.m10471g(byte[]):androidx.work.b");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:23|(2:34|35)|36|37|38) */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:24|25|(0)|29|30|31) */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x003c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x005b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0064 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:36:0x006d */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0061 A[SYNTHETIC, Splitter:B:27:0x0061] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006a A[SYNTHETIC, Splitter:B:34:0x006a] */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] m10472n(androidx.work.C1519b r4) {
        /*
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            r1 = 0
            java.io.ObjectOutputStream r2 = new java.io.ObjectOutputStream     // Catch:{ IOException -> 0x005b }
            r2.<init>(r0)     // Catch:{ IOException -> 0x005b }
            int r1 = r4.mo10928m()     // Catch:{ IOException -> 0x0057, all -> 0x0054 }
            r2.writeInt(r1)     // Catch:{ IOException -> 0x0057, all -> 0x0054 }
            java.util.Map<java.lang.String, java.lang.Object> r4 = r4.f7529a     // Catch:{ IOException -> 0x0057, all -> 0x0054 }
            java.util.Set r4 = r4.entrySet()     // Catch:{ IOException -> 0x0057, all -> 0x0054 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ IOException -> 0x0057, all -> 0x0054 }
        L_0x001c:
            boolean r1 = r4.hasNext()     // Catch:{ IOException -> 0x0057, all -> 0x0054 }
            if (r1 == 0) goto L_0x0039
            java.lang.Object r1 = r4.next()     // Catch:{ IOException -> 0x0057, all -> 0x0054 }
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ IOException -> 0x0057, all -> 0x0054 }
            java.lang.Object r3 = r1.getKey()     // Catch:{ IOException -> 0x0057, all -> 0x0054 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ IOException -> 0x0057, all -> 0x0054 }
            r2.writeUTF(r3)     // Catch:{ IOException -> 0x0057, all -> 0x0054 }
            java.lang.Object r1 = r1.getValue()     // Catch:{ IOException -> 0x0057, all -> 0x0054 }
            r2.writeObject(r1)     // Catch:{ IOException -> 0x0057, all -> 0x0054 }
            goto L_0x001c
        L_0x0039:
            r2.close()     // Catch:{ IOException -> 0x003c }
        L_0x003c:
            r0.close()     // Catch:{ IOException -> 0x003f }
        L_0x003f:
            int r4 = r0.size()
            r1 = 10240(0x2800, float:1.4349E-41)
            if (r4 > r1) goto L_0x004c
            byte[] r4 = r0.toByteArray()
            return r4
        L_0x004c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "Data cannot occupy more than 10240 bytes when serialized"
            r4.<init>(r0)
            throw r4
        L_0x0054:
            r4 = move-exception
            r1 = r2
            goto L_0x0068
        L_0x0057:
            r1 = r2
            goto L_0x005b
        L_0x0059:
            r4 = move-exception
            goto L_0x0068
        L_0x005b:
            byte[] r4 = r0.toByteArray()     // Catch:{ all -> 0x0059 }
            if (r1 == 0) goto L_0x0064
            r1.close()     // Catch:{ IOException -> 0x0064 }
        L_0x0064:
            r0.close()     // Catch:{ IOException -> 0x0067 }
        L_0x0067:
            return r4
        L_0x0068:
            if (r1 == 0) goto L_0x006d
            r1.close()     // Catch:{ IOException -> 0x006d }
        L_0x006d:
            r0.close()     // Catch:{ IOException -> 0x0070 }
        L_0x0070:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.C1519b.m10472n(androidx.work.b):byte[]");
    }

    public boolean equals(Object obj) {
        boolean z;
        if (this == obj) {
            return true;
        }
        if (obj == null || C1519b.class != obj.getClass()) {
            return false;
        }
        C1519b bVar = (C1519b) obj;
        Set<String> keySet = this.f7529a.keySet();
        if (!keySet.equals(bVar.f7529a.keySet())) {
            return false;
        }
        for (String next : keySet) {
            Object obj2 = this.f7529a.get(next);
            Object obj3 = bVar.f7529a.get(next);
            if (obj2 == null || obj3 == null) {
                if (obj2 == obj3) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
            } else if (!(obj2 instanceof Object[]) || !(obj3 instanceof Object[])) {
                z = obj2.equals(obj3);
                continue;
            } else {
                z = Arrays.deepEquals((Object[]) obj2, (Object[]) obj3);
                continue;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: h */
    public boolean mo10922h(String str, boolean z) {
        Object obj = this.f7529a.get(str);
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        return z;
    }

    public int hashCode() {
        return this.f7529a.hashCode() * 31;
    }

    /* renamed from: i */
    public int mo10924i(String str, int i) {
        Object obj = this.f7529a.get(str);
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        return i;
    }

    /* renamed from: j */
    public Map<String, Object> mo10925j() {
        return Collections.unmodifiableMap(this.f7529a);
    }

    /* renamed from: k */
    public long mo10926k(String str, long j) {
        Object obj = this.f7529a.get(str);
        if (obj instanceof Long) {
            return ((Long) obj).longValue();
        }
        return j;
    }

    /* renamed from: l */
    public String mo10927l(String str) {
        Object obj = this.f7529a.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    /* renamed from: m */
    public int mo10928m() {
        return this.f7529a.size();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Data {");
        if (!this.f7529a.isEmpty()) {
            for (String next : this.f7529a.keySet()) {
                sb.append(next);
                sb.append(" : ");
                Object obj = this.f7529a.get(next);
                if (obj instanceof Object[]) {
                    sb.append(Arrays.toString((Object[]) obj));
                } else {
                    sb.append(obj);
                }
                sb.append(", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }

    public C1519b(C1519b bVar) {
        this.f7529a = new HashMap(bVar.f7529a);
    }

    public C1519b(Map<String, ?> map) {
        this.f7529a = new HashMap(map);
    }
}
