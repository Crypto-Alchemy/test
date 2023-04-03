package kotlin.reflect.jvm.internal.impl.load.kotlin.header;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: KotlinClassHeader.kt */
public final class KotlinClassHeader {

    /* renamed from: a */
    public final Kind f39612a;

    /* renamed from: b */
    public final c83 f39613b;

    /* renamed from: c */
    public final String[] f39614c;

    /* renamed from: d */
    public final String[] f39615d;

    /* renamed from: e */
    public final String[] f39616e;

    /* renamed from: f */
    public final String f39617f;

    /* renamed from: g */
    public final int f39618g;

    /* renamed from: h */
    public final String f39619h;

    /* renamed from: i */
    public final byte[] f39620i;

    /* compiled from: KotlinClassHeader.kt */
    public enum Kind {
        UNKNOWN(0),
        CLASS(1),
        FILE_FACADE(2),
        SYNTHETIC_CLASS(3),
        MULTIFILE_CLASS(4),
        MULTIFILE_CLASS_PART(5);
        
        public static final C7512a Companion = null;

        /* renamed from: a */
        public static final Map<Integer, Kind> f39621a = null;

        /* renamed from: id */
        private final int f39623id;

        /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind$a */
        /* compiled from: KotlinClassHeader.kt */
        public static final class C7512a {
            public C7512a() {
            }

            public /* synthetic */ C7512a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final Kind mo53832a(int i) {
                Kind kind = (Kind) Kind.f39621a.get(Integer.valueOf(i));
                if (kind == null) {
                    return Kind.UNKNOWN;
                }
                return kind;
            }
        }

        /* access modifiers changed from: public */
        static {
            int i;
            Companion = new C7512a((DefaultConstructorMarker) null);
            Kind[] values = values();
            LinkedHashMap linkedHashMap = new LinkedHashMap(d75.m43382d(ao3.m31893e(values.length), 16));
            for (Kind kind : values) {
                linkedHashMap.put(Integer.valueOf(kind.f39623id), kind);
            }
            f39621a = linkedHashMap;
        }

        /* access modifiers changed from: public */
        Kind(int i) {
            this.f39623id = i;
        }

        public static final Kind getById(int i) {
            return Companion.mo53832a(i);
        }
    }

    public KotlinClassHeader(Kind kind, c83 c83, String[] strArr, String[] strArr2, String[] strArr3, String str, int i, String str2, byte[] bArr) {
        vx2.m53591g(kind, "kind");
        vx2.m53591g(c83, "metadataVersion");
        this.f39612a = kind;
        this.f39613b = c83;
        this.f39614c = strArr;
        this.f39615d = strArr2;
        this.f39616e = strArr3;
        this.f39617f = str;
        this.f39618g = i;
        this.f39619h = str2;
        this.f39620i = bArr;
    }

    /* renamed from: a */
    public final String[] mo53820a() {
        return this.f39614c;
    }

    /* renamed from: b */
    public final String[] mo53821b() {
        return this.f39615d;
    }

    /* renamed from: c */
    public final Kind mo53822c() {
        return this.f39612a;
    }

    /* renamed from: d */
    public final c83 mo53823d() {
        return this.f39613b;
    }

    /* renamed from: e */
    public final String mo53824e() {
        boolean z;
        String str = this.f39617f;
        if (this.f39612a == Kind.MULTIFILE_CLASS_PART) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return str;
        }
        return null;
    }

    /* renamed from: f */
    public final List<String> mo53825f() {
        boolean z;
        String[] strArr = this.f39614c;
        if (this.f39612a == Kind.MULTIFILE_CLASS) {
            z = true;
        } else {
            z = false;
        }
        List<String> list = null;
        if (!z) {
            strArr = null;
        }
        if (strArr != null) {
            list = C6706xq.m54490d(strArr);
        }
        if (list == null) {
            return ck0.m33062j();
        }
        return list;
    }

    /* renamed from: g */
    public final String[] mo53826g() {
        return this.f39616e;
    }

    /* renamed from: h */
    public final boolean mo53827h(int i, int i2) {
        return (i & i2) != 0;
    }

    /* renamed from: i */
    public final boolean mo53828i() {
        return mo53827h(this.f39618g, 2);
    }

    /* renamed from: j */
    public final boolean mo53829j() {
        if (!mo53827h(this.f39618g, 64) || mo53827h(this.f39618g, 32)) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public final boolean mo53830k() {
        if (!mo53827h(this.f39618g, 16) || mo53827h(this.f39618g, 32)) {
            return false;
        }
        return true;
    }

    public String toString() {
        return this.f39612a + " version=" + this.f39613b;
    }
}
