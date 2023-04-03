package com.squareup.moshi;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import okio.ByteString;

public abstract class JsonReader implements Closeable {

    /* renamed from: a */
    public int f26662a;

    /* renamed from: d */
    public int[] f26663d;

    /* renamed from: e */
    public String[] f26664e;

    /* renamed from: g */
    public int[] f26665g;

    /* renamed from: k */
    public boolean f26666k;

    /* renamed from: r */
    public boolean f26667r;

    public enum Token {
        BEGIN_ARRAY,
        END_ARRAY,
        BEGIN_OBJECT,
        END_OBJECT,
        NAME,
        STRING,
        NUMBER,
        BOOLEAN,
        NULL,
        END_DOCUMENT
    }

    /* renamed from: com.squareup.moshi.JsonReader$a */
    public static /* synthetic */ class C5371a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f26669a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.squareup.moshi.JsonReader$Token[] r0 = com.squareup.moshi.JsonReader.Token.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f26669a = r0
                com.squareup.moshi.JsonReader$Token r1 = com.squareup.moshi.JsonReader.Token.BEGIN_ARRAY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f26669a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.squareup.moshi.JsonReader$Token r1 = com.squareup.moshi.JsonReader.Token.BEGIN_OBJECT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f26669a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.squareup.moshi.JsonReader$Token r1 = com.squareup.moshi.JsonReader.Token.STRING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f26669a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.squareup.moshi.JsonReader$Token r1 = com.squareup.moshi.JsonReader.Token.NUMBER     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f26669a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.squareup.moshi.JsonReader$Token r1 = com.squareup.moshi.JsonReader.Token.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f26669a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.squareup.moshi.JsonReader$Token r1 = com.squareup.moshi.JsonReader.Token.NULL     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.moshi.JsonReader.C5371a.<clinit>():void");
        }
    }

    /* renamed from: com.squareup.moshi.JsonReader$b */
    public static final class C5372b {

        /* renamed from: a */
        public final String[] f26670a;

        /* renamed from: b */
        public final wi4 f26671b;

        public C5372b(String[] strArr, wi4 wi4) {
            this.f26670a = strArr;
            this.f26671b = wi4;
        }

        /* renamed from: a */
        public static C5372b m41530a(String... strArr) {
            try {
                ByteString[] byteStringArr = new ByteString[strArr.length];
                m40 m40 = new m40();
                for (int i = 0; i < strArr.length; i++) {
                    i73.m45504P(m40, strArr[i]);
                    m40.readByte();
                    byteStringArr[i] = m40.mo56042V0();
                }
                return new C5372b((String[]) strArr.clone(), wi4.m73611t(byteStringArr));
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }
    }

    public JsonReader() {
        this.f26663d = new int[32];
        this.f26664e = new String[32];
        this.f26665g = new int[32];
    }

    /* renamed from: p */
    public static JsonReader m41502p(w40 w40) {
        return new C5396e(w40);
    }

    /* renamed from: A */
    public abstract int mo39269A(C5372b bVar) throws IOException;

    /* renamed from: C */
    public final void mo39270C(boolean z) {
        this.f26667r = z;
    }

    /* renamed from: G */
    public final void mo39271G(boolean z) {
        this.f26666k = z;
    }

    /* renamed from: I */
    public abstract void mo39272I() throws IOException;

    /* renamed from: J */
    public abstract void mo39273J() throws IOException;

    /* renamed from: K */
    public final JsonEncodingException mo39274K(String str) throws JsonEncodingException {
        throw new JsonEncodingException(str + " at path " + getPath());
    }

    /* renamed from: a */
    public abstract void mo39275a() throws IOException;

    /* renamed from: b */
    public abstract void mo39276b() throws IOException;

    /* renamed from: c */
    public abstract void mo39277c() throws IOException;

    /* renamed from: d */
    public abstract void mo39278d() throws IOException;

    /* renamed from: e */
    public final boolean mo39279e() {
        return this.f26667r;
    }

    /* renamed from: f */
    public abstract boolean mo39280f() throws IOException;

    /* renamed from: g */
    public final boolean mo39281g() {
        return this.f26666k;
    }

    public final String getPath() {
        return v63.m53288a(this.f26662a, this.f26663d, this.f26664e, this.f26665g);
    }

    /* renamed from: h */
    public abstract boolean mo39283h() throws IOException;

    /* renamed from: i */
    public abstract double mo39284i() throws IOException;

    /* renamed from: j */
    public abstract int mo39285j() throws IOException;

    /* renamed from: k */
    public abstract long mo39286k() throws IOException;

    /* renamed from: l */
    public abstract String mo39287l() throws IOException;

    /* renamed from: m */
    public abstract <T> T mo39288m() throws IOException;

    /* renamed from: n */
    public abstract String mo39289n() throws IOException;

    /* renamed from: q */
    public abstract Token mo39290q() throws IOException;

    /* renamed from: s */
    public abstract JsonReader mo39291s();

    /* renamed from: v */
    public abstract void mo39292v() throws IOException;

    /* renamed from: x */
    public final void mo39293x(int i) {
        int i2 = this.f26662a;
        int[] iArr = this.f26663d;
        if (i2 == iArr.length) {
            if (i2 != 256) {
                this.f26663d = Arrays.copyOf(iArr, iArr.length * 2);
                String[] strArr = this.f26664e;
                this.f26664e = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                int[] iArr2 = this.f26665g;
                this.f26665g = Arrays.copyOf(iArr2, iArr2.length * 2);
            } else {
                throw new JsonDataException("Nesting too deep at " + getPath());
            }
        }
        int[] iArr3 = this.f26663d;
        int i3 = this.f26662a;
        this.f26662a = i3 + 1;
        iArr3[i3] = i;
    }

    /* renamed from: y */
    public final Object mo39294y() throws IOException {
        switch (C5371a.f26669a[mo39290q().ordinal()]) {
            case 1:
                ArrayList arrayList = new ArrayList();
                mo39275a();
                while (mo39280f()) {
                    arrayList.add(mo39294y());
                }
                mo39277c();
                return arrayList;
            case 2:
                LinkedHashTreeMap linkedHashTreeMap = new LinkedHashTreeMap();
                mo39276b();
                while (mo39280f()) {
                    String l = mo39287l();
                    Object y = mo39294y();
                    Object put = linkedHashTreeMap.put(l, y);
                    if (put != null) {
                        throw new JsonDataException("Map key '" + l + "' has multiple values at path " + getPath() + ": " + put + " and " + y);
                    }
                }
                mo39278d();
                return linkedHashTreeMap;
            case 3:
                return mo39289n();
            case 4:
                return Double.valueOf(mo39284i());
            case 5:
                return Boolean.valueOf(mo39283h());
            case 6:
                return mo39288m();
            default:
                throw new IllegalStateException("Expected a value but was " + mo39290q() + " at path " + getPath());
        }
    }

    /* renamed from: z */
    public abstract int mo39295z(C5372b bVar) throws IOException;

    public JsonReader(JsonReader jsonReader) {
        this.f26662a = jsonReader.f26662a;
        this.f26663d = (int[]) jsonReader.f26663d.clone();
        this.f26664e = (String[]) jsonReader.f26664e.clone();
        this.f26665g = (int[]) jsonReader.f26665g.clone();
        this.f26666k = jsonReader.f26666k;
        this.f26667r = jsonReader.f26667r;
    }
}
