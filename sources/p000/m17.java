package p000;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.WritableTypeId;
import com.fasterxml.jackson.databind.BeanProperty;
import java.io.IOException;

/* renamed from: m17 */
/* compiled from: TypeSerializer */
public abstract class m17 {

    /* renamed from: m17$a */
    /* compiled from: TypeSerializer */
    public static /* synthetic */ class C2803a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f14791a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.fasterxml.jackson.annotation.JsonTypeInfo$As[] r0 = com.fasterxml.jackson.annotation.JsonTypeInfo.C1971As.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f14791a = r0
                com.fasterxml.jackson.annotation.JsonTypeInfo$As r1 = com.fasterxml.jackson.annotation.JsonTypeInfo.C1971As.EXISTING_PROPERTY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f14791a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.fasterxml.jackson.annotation.JsonTypeInfo$As r1 = com.fasterxml.jackson.annotation.JsonTypeInfo.C1971As.EXTERNAL_PROPERTY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f14791a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.fasterxml.jackson.annotation.JsonTypeInfo$As r1 = com.fasterxml.jackson.annotation.JsonTypeInfo.C1971As.PROPERTY     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f14791a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.fasterxml.jackson.annotation.JsonTypeInfo$As r1 = com.fasterxml.jackson.annotation.JsonTypeInfo.C1971As.WRAPPER_ARRAY     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f14791a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.fasterxml.jackson.annotation.JsonTypeInfo$As r1 = com.fasterxml.jackson.annotation.JsonTypeInfo.C1971As.WRAPPER_OBJECT     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.m17.C2803a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public abstract m17 mo11783a(BeanProperty beanProperty);

    /* renamed from: b */
    public abstract String mo16711b();

    /* renamed from: c */
    public abstract JsonTypeInfo.C1971As mo11784c();

    /* renamed from: d */
    public WritableTypeId mo23018d(Object obj, JsonToken jsonToken) {
        WritableTypeId writableTypeId = new WritableTypeId(obj, jsonToken);
        int i = C2803a.f14791a[mo11784c().ordinal()];
        if (i == 1) {
            writableTypeId.f9863e = WritableTypeId.Inclusion.PAYLOAD_PROPERTY;
            writableTypeId.f9862d = mo16711b();
        } else if (i == 2) {
            writableTypeId.f9863e = WritableTypeId.Inclusion.PARENT_PROPERTY;
            writableTypeId.f9862d = mo16711b();
        } else if (i == 3) {
            writableTypeId.f9863e = WritableTypeId.Inclusion.METADATA_PROPERTY;
            writableTypeId.f9862d = mo16711b();
        } else if (i == 4) {
            writableTypeId.f9863e = WritableTypeId.Inclusion.WRAPPER_ARRAY;
        } else if (i != 5) {
            c97.m11761c();
        } else {
            writableTypeId.f9863e = WritableTypeId.Inclusion.WRAPPER_OBJECT;
        }
        return writableTypeId;
    }

    /* renamed from: e */
    public WritableTypeId mo23019e(Object obj, JsonToken jsonToken, Object obj2) {
        WritableTypeId d = mo23018d(obj, jsonToken);
        d.f9861c = obj2;
        return d;
    }

    /* renamed from: f */
    public WritableTypeId mo23020f(Object obj, Class<?> cls, JsonToken jsonToken) {
        WritableTypeId d = mo23018d(obj, jsonToken);
        d.f9860b = cls;
        return d;
    }

    /* renamed from: g */
    public abstract WritableTypeId mo16712g(JsonGenerator jsonGenerator, WritableTypeId writableTypeId) throws IOException;

    /* renamed from: h */
    public abstract WritableTypeId mo16713h(JsonGenerator jsonGenerator, WritableTypeId writableTypeId) throws IOException;
}
