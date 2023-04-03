package kotlin.reflect.jvm.internal.impl.load.kotlin.header;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import p000.tc3;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.header.a */
/* compiled from: ReadKotlinClassHeaderAnnotationVisitor */
public class C7513a implements tc3.C9343c {

    /* renamed from: j */
    public static final boolean f39624j = "true".equals(System.getProperty("kotlin.ignore.old.metadata"));

    /* renamed from: k */
    public static final Map<nf0, KotlinClassHeader.Kind> f39625k;

    /* renamed from: a */
    public int[] f39626a = null;

    /* renamed from: b */
    public String f39627b = null;

    /* renamed from: c */
    public int f39628c = 0;

    /* renamed from: d */
    public String f39629d = null;

    /* renamed from: e */
    public String[] f39630e = null;

    /* renamed from: f */
    public String[] f39631f = null;

    /* renamed from: g */
    public String[] f39632g = null;

    /* renamed from: h */
    public KotlinClassHeader.Kind f39633h = null;

    /* renamed from: i */
    public String[] f39634i = null;

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.header.a$b */
    /* compiled from: ReadKotlinClassHeaderAnnotationVisitor */
    public static abstract class C7515b implements tc3.C9342b {

        /* renamed from: a */
        public final List<String> f39635a = new ArrayList();

        /* renamed from: f */
        public static /* synthetic */ void m61182f(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "enumEntryName";
            } else if (i == 2) {
                objArr[0] = "classLiteralValue";
            } else if (i != 3) {
                objArr[0] = "enumClassId";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$CollectStringArrayAnnotationVisitor";
            if (i == 2) {
                objArr[2] = "visitClassLiteral";
            } else if (i != 3) {
                objArr[2] = "visitEnum";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: a */
        public void mo52591a() {
            mo53835g((String[]) this.f39635a.toArray(new String[0]));
        }

        /* renamed from: b */
        public tc3.C9341a mo52592b(nf0 nf0) {
            if (nf0 != null) {
                return null;
            }
            m61182f(3);
            return null;
        }

        /* renamed from: c */
        public void mo52593c(Object obj) {
            if (obj instanceof String) {
                this.f39635a.add((String) obj);
            }
        }

        /* renamed from: d */
        public void mo52594d(nf0 nf0, r24 r24) {
            if (nf0 == null) {
                m61182f(0);
            }
            if (r24 == null) {
                m61182f(1);
            }
        }

        /* renamed from: e */
        public void mo52595e(of0 of0) {
            if (of0 == null) {
                m61182f(2);
            }
        }

        /* renamed from: g */
        public abstract void mo53835g(String[] strArr);
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.header.a$c */
    /* compiled from: ReadKotlinClassHeaderAnnotationVisitor */
    public class C7516c implements tc3.C9341a {

        /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.header.a$c$a */
        /* compiled from: ReadKotlinClassHeaderAnnotationVisitor */
        public class C7517a extends C7515b {
            public C7517a() {
            }

            /* renamed from: f */
            public static /* synthetic */ void m61198f(int i) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$1", "visitEnd"}));
            }

            /* renamed from: g */
            public void mo53835g(String[] strArr) {
                if (strArr == null) {
                    m61198f(0);
                }
                String[] unused = C7513a.this.f39630e = strArr;
            }
        }

        /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.header.a$c$b */
        /* compiled from: ReadKotlinClassHeaderAnnotationVisitor */
        public class C7518b extends C7515b {
            public C7518b() {
            }

            /* renamed from: f */
            public static /* synthetic */ void m61200f(int i) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$2", "visitEnd"}));
            }

            /* renamed from: g */
            public void mo53835g(String[] strArr) {
                if (strArr == null) {
                    m61200f(0);
                }
                String[] unused = C7513a.this.f39631f = strArr;
            }
        }

        public C7516c() {
        }

        /* renamed from: g */
        public static /* synthetic */ void m61189g(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "enumClassId";
            } else if (i == 2) {
                objArr[0] = "enumEntryName";
            } else if (i != 3) {
                objArr[0] = "classLiteralValue";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor";
            if (i == 1 || i == 2) {
                objArr[2] = "visitEnum";
            } else if (i != 3) {
                objArr[2] = "visitClassLiteral";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: a */
        public void mo52590a() {
        }

        /* renamed from: b */
        public void mo52583b(r24 r24, of0 of0) {
            if (of0 == null) {
                m61189g(0);
            }
        }

        /* renamed from: c */
        public tc3.C9342b mo52584c(r24 r24) {
            String str;
            if (r24 != null) {
                str = r24.mo65594d();
            } else {
                str = null;
            }
            if ("d1".equals(str)) {
                return mo53836h();
            }
            if ("d2".equals(str)) {
                return mo53837i();
            }
            return null;
        }

        /* renamed from: d */
        public void mo52585d(r24 r24, nf0 nf0, r24 r242) {
            if (nf0 == null) {
                m61189g(1);
            }
            if (r242 == null) {
                m61189g(2);
            }
        }

        /* renamed from: e */
        public tc3.C9341a mo52586e(r24 r24, nf0 nf0) {
            if (nf0 != null) {
                return null;
            }
            m61189g(3);
            return null;
        }

        /* renamed from: f */
        public void mo52587f(r24 r24, Object obj) {
            if (r24 != null) {
                String d = r24.mo65594d();
                if ("k".equals(d)) {
                    if (obj instanceof Integer) {
                        KotlinClassHeader.Kind unused = C7513a.this.f39633h = KotlinClassHeader.Kind.getById(((Integer) obj).intValue());
                    }
                } else if ("mv".equals(d)) {
                    if (obj instanceof int[]) {
                        int[] unused2 = C7513a.this.f39626a = (int[]) obj;
                    }
                } else if ("xs".equals(d)) {
                    if (obj instanceof String) {
                        String unused3 = C7513a.this.f39627b = (String) obj;
                    }
                } else if ("xi".equals(d)) {
                    if (obj instanceof Integer) {
                        int unused4 = C7513a.this.f39628c = ((Integer) obj).intValue();
                    }
                } else if ("pn".equals(d) && (obj instanceof String)) {
                    String unused5 = C7513a.this.f39629d = (String) obj;
                }
            }
        }

        /* renamed from: h */
        public final tc3.C9342b mo53836h() {
            return new C7517a();
        }

        /* renamed from: i */
        public final tc3.C9342b mo53837i() {
            return new C7518b();
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.header.a$d */
    /* compiled from: ReadKotlinClassHeaderAnnotationVisitor */
    public class C7519d implements tc3.C9341a {

        /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.header.a$d$a */
        /* compiled from: ReadKotlinClassHeaderAnnotationVisitor */
        public class C7520a extends C7515b {
            public C7520a() {
            }

            /* renamed from: f */
            public static /* synthetic */ void m61210f(int i) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinSerializedIrArgumentVisitor$1", "visitEnd"}));
            }

            /* renamed from: g */
            public void mo53835g(String[] strArr) {
                if (strArr == null) {
                    m61210f(0);
                }
                String[] unused = C7513a.this.f39634i = strArr;
            }
        }

        public C7519d() {
        }

        /* renamed from: g */
        public static /* synthetic */ void m61202g(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "enumClassId";
            } else if (i == 2) {
                objArr[0] = "enumEntryName";
            } else if (i != 3) {
                objArr[0] = "classLiteralValue";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinSerializedIrArgumentVisitor";
            if (i == 1 || i == 2) {
                objArr[2] = "visitEnum";
            } else if (i != 3) {
                objArr[2] = "visitClassLiteral";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: a */
        public void mo52590a() {
        }

        /* renamed from: b */
        public void mo52583b(r24 r24, of0 of0) {
            if (of0 == null) {
                m61202g(0);
            }
        }

        /* renamed from: c */
        public tc3.C9342b mo52584c(r24 r24) {
            String str;
            if (r24 != null) {
                str = r24.mo65594d();
            } else {
                str = null;
            }
            if ("b".equals(str)) {
                return mo53838h();
            }
            return null;
        }

        /* renamed from: d */
        public void mo52585d(r24 r24, nf0 nf0, r24 r242) {
            if (nf0 == null) {
                m61202g(1);
            }
            if (r242 == null) {
                m61202g(2);
            }
        }

        /* renamed from: e */
        public tc3.C9341a mo52586e(r24 r24, nf0 nf0) {
            if (nf0 != null) {
                return null;
            }
            m61202g(3);
            return null;
        }

        /* renamed from: f */
        public void mo52587f(r24 r24, Object obj) {
        }

        /* renamed from: h */
        public final tc3.C9342b mo53838h() {
            return new C7520a();
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.header.a$e */
    /* compiled from: ReadKotlinClassHeaderAnnotationVisitor */
    public class C7521e implements tc3.C9341a {

        /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.header.a$e$a */
        /* compiled from: ReadKotlinClassHeaderAnnotationVisitor */
        public class C7522a extends C7515b {
            public C7522a() {
            }

            /* renamed from: f */
            public static /* synthetic */ void m61221f(int i) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"data", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$1", "visitEnd"}));
            }

            /* renamed from: g */
            public void mo53835g(String[] strArr) {
                if (strArr == null) {
                    m61221f(0);
                }
                String[] unused = C7513a.this.f39630e = strArr;
            }
        }

        /* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.header.a$e$b */
        /* compiled from: ReadKotlinClassHeaderAnnotationVisitor */
        public class C7523b extends C7515b {
            public C7523b() {
            }

            /* renamed from: f */
            public static /* synthetic */ void m61223f(int i) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"data", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$2", "visitEnd"}));
            }

            /* renamed from: g */
            public void mo53835g(String[] strArr) {
                if (strArr == null) {
                    m61223f(0);
                }
                String[] unused = C7513a.this.f39631f = strArr;
            }
        }

        public C7521e() {
        }

        /* renamed from: g */
        public static /* synthetic */ void m61212g(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "enumClassId";
            } else if (i == 2) {
                objArr[0] = "enumEntryName";
            } else if (i != 3) {
                objArr[0] = "classLiteralValue";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor";
            if (i == 1 || i == 2) {
                objArr[2] = "visitEnum";
            } else if (i != 3) {
                objArr[2] = "visitClassLiteral";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: a */
        public void mo52590a() {
        }

        /* renamed from: b */
        public void mo52583b(r24 r24, of0 of0) {
            if (of0 == null) {
                m61212g(0);
            }
        }

        /* renamed from: c */
        public tc3.C9342b mo52584c(r24 r24) {
            String str;
            if (r24 != null) {
                str = r24.mo65594d();
            } else {
                str = null;
            }
            if ("data".equals(str) || "filePartClassNames".equals(str)) {
                return mo53839h();
            }
            if ("strings".equals(str)) {
                return mo53840i();
            }
            return null;
        }

        /* renamed from: d */
        public void mo52585d(r24 r24, nf0 nf0, r24 r242) {
            if (nf0 == null) {
                m61212g(1);
            }
            if (r242 == null) {
                m61212g(2);
            }
        }

        /* renamed from: e */
        public tc3.C9341a mo52586e(r24 r24, nf0 nf0) {
            if (nf0 != null) {
                return null;
            }
            m61212g(3);
            return null;
        }

        /* renamed from: f */
        public void mo52587f(r24 r24, Object obj) {
            String str;
            if (r24 != null) {
                String d = r24.mo65594d();
                if ("version".equals(d)) {
                    if (obj instanceof int[]) {
                        int[] unused = C7513a.this.f39626a = (int[]) obj;
                    }
                } else if ("multifileClassName".equals(d)) {
                    C7513a aVar = C7513a.this;
                    if (obj instanceof String) {
                        str = (String) obj;
                    } else {
                        str = null;
                    }
                    String unused2 = aVar.f39627b = str;
                }
            }
        }

        /* renamed from: h */
        public final tc3.C9342b mo53839h() {
            return new C7522a();
        }

        /* renamed from: i */
        public final tc3.C9342b mo53840i() {
            return new C7523b();
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f39625k = hashMap;
        hashMap.put(nf0.m69751m(new u82("kotlin.jvm.internal.KotlinClass")), KotlinClassHeader.Kind.CLASS);
        hashMap.put(nf0.m69751m(new u82("kotlin.jvm.internal.KotlinFileFacade")), KotlinClassHeader.Kind.FILE_FACADE);
        hashMap.put(nf0.m69751m(new u82("kotlin.jvm.internal.KotlinMultifileClass")), KotlinClassHeader.Kind.MULTIFILE_CLASS);
        hashMap.put(nf0.m69751m(new u82("kotlin.jvm.internal.KotlinMultifileClassPart")), KotlinClassHeader.Kind.MULTIFILE_CLASS_PART);
        hashMap.put(nf0.m69751m(new u82("kotlin.jvm.internal.KotlinSyntheticClass")), KotlinClassHeader.Kind.SYNTHETIC_CLASS);
    }

    /* renamed from: d */
    public static /* synthetic */ void m61169d(int i) {
        Object[] objArr = new Object[3];
        if (i != 1) {
            objArr[0] = "classId";
        } else {
            objArr[0] = "source";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor";
        objArr[2] = "visitAnnotation";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    /* renamed from: a */
    public void mo53770a() {
    }

    /* renamed from: b */
    public tc3.C9341a mo53771b(nf0 nf0, a66 a66) {
        KotlinClassHeader.Kind kind;
        if (nf0 == null) {
            m61169d(0);
        }
        if (a66 == null) {
            m61169d(1);
        }
        u82 b = nf0.mo62673b();
        if (b.equals(t73.f44653a)) {
            return new C7516c();
        }
        if (b.equals(t73.f44671s)) {
            return new C7519d();
        }
        if (f39624j || this.f39633h != null || (kind = f39625k.get(nf0)) == null) {
            return null;
        }
        this.f39633h = kind;
        return new C7521e();
    }

    /* renamed from: m */
    public KotlinClassHeader mo53833m() {
        boolean z;
        byte[] bArr = null;
        if (this.f39633h == null || this.f39626a == null) {
            return null;
        }
        int[] iArr = this.f39626a;
        if ((this.f39628c & 8) != 0) {
            z = true;
        } else {
            z = false;
        }
        c83 c83 = new c83(iArr, z);
        if (!c83.mo50845h()) {
            this.f39632g = this.f39630e;
            this.f39630e = null;
        } else if (mo53834n() && this.f39630e == null) {
            return null;
        }
        String[] strArr = this.f39634i;
        if (strArr != null) {
            bArr = v10.m73024e(strArr);
        }
        return new KotlinClassHeader(this.f39633h, c83, this.f39630e, this.f39632g, this.f39631f, this.f39627b, this.f39628c, this.f39629d, bArr);
    }

    /* renamed from: n */
    public final boolean mo53834n() {
        KotlinClassHeader.Kind kind = this.f39633h;
        if (kind == KotlinClassHeader.Kind.CLASS || kind == KotlinClassHeader.Kind.FILE_FACADE || kind == KotlinClassHeader.Kind.MULTIFILE_CLASS_PART) {
            return true;
        }
        return false;
    }
}
