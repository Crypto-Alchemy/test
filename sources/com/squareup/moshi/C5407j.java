package com.squareup.moshi;

import com.fasterxml.jackson.core.JsonFactory;
import com.squareup.moshi.C5391d;
import com.squareup.moshi.JsonReader;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.squareup.moshi.j */
/* compiled from: StandardJsonAdapters */
public final class C5407j {

    /* renamed from: a */
    public static final C5391d.C5395d f26747a = new C5410c();

    /* renamed from: b */
    public static final C5391d<Boolean> f26748b = new C5411d();

    /* renamed from: c */
    public static final C5391d<Byte> f26749c = new C5412e();

    /* renamed from: d */
    public static final C5391d<Character> f26750d = new C5413f();

    /* renamed from: e */
    public static final C5391d<Double> f26751e = new C5414g();

    /* renamed from: f */
    public static final C5391d<Float> f26752f = new C5415h();

    /* renamed from: g */
    public static final C5391d<Integer> f26753g = new C5416i();

    /* renamed from: h */
    public static final C5391d<Long> f26754h = new C5417j();

    /* renamed from: i */
    public static final C5391d<Short> f26755i = new C5418k();

    /* renamed from: j */
    public static final C5391d<String> f26756j = new C5408a();

    /* renamed from: com.squareup.moshi.j$a */
    /* compiled from: StandardJsonAdapters */
    public class C5408a extends C5391d<String> {
        /* renamed from: k */
        public String mo39346b(JsonReader jsonReader) throws IOException {
            return jsonReader.mo39289n();
        }

        /* renamed from: l */
        public void mo39347j(q73 q73, String str) throws IOException {
            q73.mo39389A(str);
        }

        public String toString() {
            return "JsonAdapter(String)";
        }
    }

    /* renamed from: com.squareup.moshi.j$b */
    /* compiled from: StandardJsonAdapters */
    public static /* synthetic */ class C5409b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f26757a;

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
                f26757a = r0
                com.squareup.moshi.JsonReader$Token r1 = com.squareup.moshi.JsonReader.Token.BEGIN_ARRAY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f26757a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.squareup.moshi.JsonReader$Token r1 = com.squareup.moshi.JsonReader.Token.BEGIN_OBJECT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f26757a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.squareup.moshi.JsonReader$Token r1 = com.squareup.moshi.JsonReader.Token.STRING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f26757a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.squareup.moshi.JsonReader$Token r1 = com.squareup.moshi.JsonReader.Token.NUMBER     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f26757a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.squareup.moshi.JsonReader$Token r1 = com.squareup.moshi.JsonReader.Token.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f26757a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.squareup.moshi.JsonReader$Token r1 = com.squareup.moshi.JsonReader.Token.NULL     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squareup.moshi.C5407j.C5409b.<clinit>():void");
        }
    }

    /* renamed from: com.squareup.moshi.j$c */
    /* compiled from: StandardJsonAdapters */
    public class C5410c implements C5391d.C5395d {
        /* renamed from: a */
        public C5391d<?> mo39349a(Type type, Set<? extends Annotation> set, C5401h hVar) {
            if (!set.isEmpty()) {
                return null;
            }
            if (type == Boolean.TYPE) {
                return C5407j.f26748b;
            }
            if (type == Byte.TYPE) {
                return C5407j.f26749c;
            }
            if (type == Character.TYPE) {
                return C5407j.f26750d;
            }
            if (type == Double.TYPE) {
                return C5407j.f26751e;
            }
            if (type == Float.TYPE) {
                return C5407j.f26752f;
            }
            if (type == Integer.TYPE) {
                return C5407j.f26753g;
            }
            if (type == Long.TYPE) {
                return C5407j.f26754h;
            }
            if (type == Short.TYPE) {
                return C5407j.f26755i;
            }
            if (type == Boolean.class) {
                return C5407j.f26748b.mo39365f();
            }
            if (type == Byte.class) {
                return C5407j.f26749c.mo39365f();
            }
            if (type == Character.class) {
                return C5407j.f26750d.mo39365f();
            }
            if (type == Double.class) {
                return C5407j.f26751e.mo39365f();
            }
            if (type == Float.class) {
                return C5407j.f26752f.mo39365f();
            }
            if (type == Integer.class) {
                return C5407j.f26753g.mo39365f();
            }
            if (type == Long.class) {
                return C5407j.f26754h.mo39365f();
            }
            if (type == Short.class) {
                return C5407j.f26755i.mo39365f();
            }
            if (type == String.class) {
                return C5407j.f26756j.mo39365f();
            }
            if (type == Object.class) {
                return new C5420m(hVar).mo39365f();
            }
            Class<?> g = u27.m52591g(type);
            C5391d<?> d = t67.m52103d(hVar, type, g);
            if (d != null) {
                return d;
            }
            if (g.isEnum()) {
                return new C5419l(g).mo39365f();
            }
            return null;
        }
    }

    /* renamed from: com.squareup.moshi.j$d */
    /* compiled from: StandardJsonAdapters */
    public class C5411d extends C5391d<Boolean> {
        /* renamed from: k */
        public Boolean mo39346b(JsonReader jsonReader) throws IOException {
            return Boolean.valueOf(jsonReader.mo39283h());
        }

        /* renamed from: l */
        public void mo39347j(q73 q73, Boolean bool) throws IOException {
            q73.mo39390C(bool.booleanValue());
        }

        public String toString() {
            return "JsonAdapter(Boolean)";
        }
    }

    /* renamed from: com.squareup.moshi.j$e */
    /* compiled from: StandardJsonAdapters */
    public class C5412e extends C5391d<Byte> {
        /* renamed from: k */
        public Byte mo39346b(JsonReader jsonReader) throws IOException {
            return Byte.valueOf((byte) C5407j.m41663a(jsonReader, "a byte", -128, 255));
        }

        /* renamed from: l */
        public void mo39347j(q73 q73, Byte b) throws IOException {
            q73.mo39402y((long) (b.intValue() & 255));
        }

        public String toString() {
            return "JsonAdapter(Byte)";
        }
    }

    /* renamed from: com.squareup.moshi.j$f */
    /* compiled from: StandardJsonAdapters */
    public class C5413f extends C5391d<Character> {
        /* renamed from: k */
        public Character mo39346b(JsonReader jsonReader) throws IOException {
            String n = jsonReader.mo39289n();
            if (n.length() <= 1) {
                return Character.valueOf(n.charAt(0));
            }
            throw new JsonDataException(String.format("Expected %s but was %s at path %s", new Object[]{"a char", JsonFactory.DEFAULT_QUOTE_CHAR + n + JsonFactory.DEFAULT_QUOTE_CHAR, jsonReader.getPath()}));
        }

        /* renamed from: l */
        public void mo39347j(q73 q73, Character ch) throws IOException {
            q73.mo39389A(ch.toString());
        }

        public String toString() {
            return "JsonAdapter(Character)";
        }
    }

    /* renamed from: com.squareup.moshi.j$g */
    /* compiled from: StandardJsonAdapters */
    public class C5414g extends C5391d<Double> {
        /* renamed from: k */
        public Double mo39346b(JsonReader jsonReader) throws IOException {
            return Double.valueOf(jsonReader.mo39284i());
        }

        /* renamed from: l */
        public void mo39347j(q73 q73, Double d) throws IOException {
            q73.mo39401x(d.doubleValue());
        }

        public String toString() {
            return "JsonAdapter(Double)";
        }
    }

    /* renamed from: com.squareup.moshi.j$h */
    /* compiled from: StandardJsonAdapters */
    public class C5415h extends C5391d<Float> {
        /* renamed from: k */
        public Float mo39346b(JsonReader jsonReader) throws IOException {
            float i = (float) jsonReader.mo39284i();
            if (jsonReader.mo39281g() || !Float.isInfinite(i)) {
                return Float.valueOf(i);
            }
            throw new JsonDataException("JSON forbids NaN and infinities: " + i + " at path " + jsonReader.getPath());
        }

        /* renamed from: l */
        public void mo39347j(q73 q73, Float f) throws IOException {
            f.getClass();
            q73.mo39403z(f);
        }

        public String toString() {
            return "JsonAdapter(Float)";
        }
    }

    /* renamed from: com.squareup.moshi.j$i */
    /* compiled from: StandardJsonAdapters */
    public class C5416i extends C5391d<Integer> {
        /* renamed from: k */
        public Integer mo39346b(JsonReader jsonReader) throws IOException {
            return Integer.valueOf(jsonReader.mo39285j());
        }

        /* renamed from: l */
        public void mo39347j(q73 q73, Integer num) throws IOException {
            q73.mo39402y((long) num.intValue());
        }

        public String toString() {
            return "JsonAdapter(Integer)";
        }
    }

    /* renamed from: com.squareup.moshi.j$j */
    /* compiled from: StandardJsonAdapters */
    public class C5417j extends C5391d<Long> {
        /* renamed from: k */
        public Long mo39346b(JsonReader jsonReader) throws IOException {
            return Long.valueOf(jsonReader.mo39286k());
        }

        /* renamed from: l */
        public void mo39347j(q73 q73, Long l) throws IOException {
            q73.mo39402y(l.longValue());
        }

        public String toString() {
            return "JsonAdapter(Long)";
        }
    }

    /* renamed from: com.squareup.moshi.j$k */
    /* compiled from: StandardJsonAdapters */
    public class C5418k extends C5391d<Short> {
        /* renamed from: k */
        public Short mo39346b(JsonReader jsonReader) throws IOException {
            return Short.valueOf((short) C5407j.m41663a(jsonReader, "a short", -32768, 32767));
        }

        /* renamed from: l */
        public void mo39347j(q73 q73, Short sh) throws IOException {
            q73.mo39402y((long) sh.intValue());
        }

        public String toString() {
            return "JsonAdapter(Short)";
        }
    }

    /* renamed from: com.squareup.moshi.j$l */
    /* compiled from: StandardJsonAdapters */
    public static final class C5419l<T extends Enum<T>> extends C5391d<T> {

        /* renamed from: a */
        public final Class<T> f26758a;

        /* renamed from: b */
        public final String[] f26759b;

        /* renamed from: c */
        public final T[] f26760c;

        /* renamed from: d */
        public final JsonReader.C5372b f26761d;

        public C5419l(Class<T> cls) {
            this.f26758a = cls;
            try {
                T[] tArr = (Enum[]) cls.getEnumConstants();
                this.f26760c = tArr;
                this.f26759b = new String[tArr.length];
                int i = 0;
                while (true) {
                    T[] tArr2 = this.f26760c;
                    if (i < tArr2.length) {
                        String name = tArr2[i].name();
                        this.f26759b[i] = t67.m52112m(name, cls.getField(name));
                        i++;
                    } else {
                        this.f26761d = JsonReader.C5372b.m41530a(this.f26759b);
                        return;
                    }
                }
            } catch (NoSuchFieldException e) {
                throw new AssertionError("Missing field in " + cls.getName(), e);
            }
        }

        /* renamed from: k */
        public T mo39346b(JsonReader jsonReader) throws IOException {
            int A = jsonReader.mo39269A(this.f26761d);
            if (A != -1) {
                return this.f26760c[A];
            }
            String path = jsonReader.getPath();
            String n = jsonReader.mo39289n();
            throw new JsonDataException("Expected one of " + Arrays.asList(this.f26759b) + " but was " + n + " at path " + path);
        }

        /* renamed from: l */
        public void mo39347j(q73 q73, T t) throws IOException {
            q73.mo39389A(this.f26759b[t.ordinal()]);
        }

        public String toString() {
            return "JsonAdapter(" + this.f26758a.getName() + ")";
        }
    }

    /* renamed from: com.squareup.moshi.j$m */
    /* compiled from: StandardJsonAdapters */
    public static final class C5420m extends C5391d<Object> {

        /* renamed from: a */
        public final C5401h f26762a;

        /* renamed from: b */
        public final C5391d<List> f26763b;

        /* renamed from: c */
        public final C5391d<Map> f26764c;

        /* renamed from: d */
        public final C5391d<String> f26765d;

        /* renamed from: e */
        public final C5391d<Double> f26766e;

        /* renamed from: f */
        public final C5391d<Boolean> f26767f;

        public C5420m(C5401h hVar) {
            this.f26762a = hVar;
            this.f26763b = hVar.mo39408c(List.class);
            this.f26764c = hVar.mo39408c(Map.class);
            this.f26765d = hVar.mo39408c(String.class);
            this.f26766e = hVar.mo39408c(Double.class);
            this.f26767f = hVar.mo39408c(Boolean.class);
        }

        /* renamed from: b */
        public Object mo39346b(JsonReader jsonReader) throws IOException {
            switch (C5409b.f26757a[jsonReader.mo39290q().ordinal()]) {
                case 1:
                    return this.f26763b.mo39346b(jsonReader);
                case 2:
                    return this.f26764c.mo39346b(jsonReader);
                case 3:
                    return this.f26765d.mo39346b(jsonReader);
                case 4:
                    return this.f26766e.mo39346b(jsonReader);
                case 5:
                    return this.f26767f.mo39346b(jsonReader);
                case 6:
                    return jsonReader.mo39288m();
                default:
                    throw new IllegalStateException("Expected a value but was " + jsonReader.mo39290q() + " at path " + jsonReader.getPath());
            }
        }

        /* renamed from: j */
        public void mo39347j(q73 q73, Object obj) throws IOException {
            Class<?> cls = obj.getClass();
            if (cls == Object.class) {
                q73.mo39394c();
                q73.mo39398g();
                return;
            }
            this.f26762a.mo39410e(mo39452k(cls), t67.f34128a).mo39347j(q73, obj);
        }

        /* renamed from: k */
        public final Class<?> mo39452k(Class<?> cls) {
            if (Map.class.isAssignableFrom(cls)) {
                return Map.class;
            }
            if (Collection.class.isAssignableFrom(cls)) {
                return Collection.class;
            }
            return cls;
        }

        public String toString() {
            return "JsonAdapter(Object)";
        }
    }

    /* renamed from: a */
    public static int m41663a(JsonReader jsonReader, String str, int i, int i2) throws IOException {
        int j = jsonReader.mo39285j();
        if (j >= i && j <= i2) {
            return j;
        }
        throw new JsonDataException(String.format("Expected %s but was %s at path %s", new Object[]{str, Integer.valueOf(j), jsonReader.getPath()}));
    }
}
