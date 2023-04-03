package p000;

import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$MemberKind;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Modality;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Visibility;
import kotlin.reflect.jvm.internal.impl.protobuf.C7621f;

/* renamed from: b42 */
/* compiled from: Flags */
public class b42 {

    /* renamed from: A */
    public static final C6845b f36637A;

    /* renamed from: B */
    public static final C6845b f36638B;

    /* renamed from: C */
    public static final C6845b f36639C;

    /* renamed from: D */
    public static final C6845b f36640D;

    /* renamed from: E */
    public static final C6845b f36641E;

    /* renamed from: F */
    public static final C6845b f36642F;

    /* renamed from: G */
    public static final C6845b f36643G;

    /* renamed from: H */
    public static final C6845b f36644H;

    /* renamed from: I */
    public static final C6845b f36645I;

    /* renamed from: J */
    public static final C6845b f36646J;

    /* renamed from: K */
    public static final C6845b f36647K;

    /* renamed from: L */
    public static final C6845b f36648L;

    /* renamed from: M */
    public static final C6845b f36649M;

    /* renamed from: N */
    public static final C6845b f36650N;

    /* renamed from: O */
    public static final C6845b f36651O = C6847d.m55741c();

    /* renamed from: a */
    public static final C6845b f36652a;

    /* renamed from: b */
    public static final C6845b f36653b;

    /* renamed from: c */
    public static final C6845b f36654c;

    /* renamed from: d */
    public static final C6847d<ProtoBuf$Visibility> f36655d;

    /* renamed from: e */
    public static final C6847d<ProtoBuf$Modality> f36656e;

    /* renamed from: f */
    public static final C6847d<ProtoBuf$Class.Kind> f36657f;

    /* renamed from: g */
    public static final C6845b f36658g;

    /* renamed from: h */
    public static final C6845b f36659h;

    /* renamed from: i */
    public static final C6845b f36660i;

    /* renamed from: j */
    public static final C6845b f36661j;

    /* renamed from: k */
    public static final C6845b f36662k;

    /* renamed from: l */
    public static final C6845b f36663l;

    /* renamed from: m */
    public static final C6845b f36664m;

    /* renamed from: n */
    public static final C6845b f36665n;

    /* renamed from: o */
    public static final C6847d<ProtoBuf$MemberKind> f36666o;

    /* renamed from: p */
    public static final C6845b f36667p;

    /* renamed from: q */
    public static final C6845b f36668q;

    /* renamed from: r */
    public static final C6845b f36669r;

    /* renamed from: s */
    public static final C6845b f36670s;

    /* renamed from: t */
    public static final C6845b f36671t;

    /* renamed from: u */
    public static final C6845b f36672u;

    /* renamed from: v */
    public static final C6845b f36673v;

    /* renamed from: w */
    public static final C6845b f36674w;

    /* renamed from: x */
    public static final C6845b f36675x;

    /* renamed from: y */
    public static final C6845b f36676y;

    /* renamed from: z */
    public static final C6845b f36677z;

    /* renamed from: b42$b */
    /* compiled from: Flags */
    public static class C6845b extends C6847d<Boolean> {
        public C6845b(int i) {
            super(i, 1);
        }

        /* renamed from: f */
        public static /* synthetic */ void m55728f(int i) {
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", new Object[]{"kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$BooleanFlagField", "get"}));
        }

        /* renamed from: g */
        public Boolean mo50465d(int i) {
            boolean z = true;
            if ((i & (1 << this.f36679a)) == 0) {
                z = false;
            }
            Boolean valueOf = Boolean.valueOf(z);
            if (valueOf == null) {
                m55728f(0);
            }
            return valueOf;
        }

        /* renamed from: h */
        public int mo50466e(Boolean bool) {
            if (bool.booleanValue()) {
                return 1 << this.f36679a;
            }
            return 0;
        }
    }

    /* renamed from: b42$c */
    /* compiled from: Flags */
    public static class C6846c<E extends C7621f.C7622a> extends C6847d<E> {

        /* renamed from: c */
        public final E[] f36678c;

        public C6846c(int i, E[] eArr) {
            super(i, m55734g(eArr));
            this.f36678c = eArr;
        }

        /* renamed from: f */
        public static /* synthetic */ void m55733f(int i) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", new Object[]{"enumEntries", "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$EnumLiteFlagField", "bitWidth"}));
        }

        /* renamed from: g */
        public static <E> int m55734g(E[] eArr) {
            if (eArr == null) {
                m55733f(0);
            }
            int length = eArr.length - 1;
            if (length == 0) {
                return 1;
            }
            for (int i = 31; i >= 0; i--) {
                if (((1 << i) & length) != 0) {
                    return i + 1;
                }
            }
            throw new IllegalStateException("Empty enum: " + eArr.getClass());
        }

        /* renamed from: h */
        public E mo50465d(int i) {
            int i2 = this.f36679a;
            int i3 = (i & (((1 << this.f36680b) - 1) << i2)) >> i2;
            for (E e : this.f36678c) {
                if (e.getNumber() == i3) {
                    return e;
                }
            }
            return null;
        }

        /* renamed from: i */
        public int mo50466e(E e) {
            return e.getNumber() << this.f36679a;
        }
    }

    /* renamed from: b42$d */
    /* compiled from: Flags */
    public static abstract class C6847d<E> {

        /* renamed from: a */
        public final int f36679a;

        /* renamed from: b */
        public final int f36680b;

        /* renamed from: a */
        public static <E extends C7621f.C7622a> C6847d<E> m55739a(C6847d<?> dVar, E[] eArr) {
            return new C6846c(dVar.f36679a + dVar.f36680b, eArr);
        }

        /* renamed from: b */
        public static C6845b m55740b(C6847d<?> dVar) {
            return new C6845b(dVar.f36679a + dVar.f36680b);
        }

        /* renamed from: c */
        public static C6845b m55741c() {
            return new C6845b(0);
        }

        /* renamed from: d */
        public abstract E mo50465d(int i);

        /* renamed from: e */
        public abstract int mo50466e(E e);

        public C6847d(int i, int i2) {
            this.f36679a = i;
            this.f36680b = i2;
        }
    }

    static {
        C6845b c = C6847d.m55741c();
        f36652a = c;
        f36653b = C6847d.m55740b(c);
        C6845b c2 = C6847d.m55741c();
        f36654c = c2;
        C6847d<ProtoBuf$Visibility> a = C6847d.m55739a(c2, ProtoBuf$Visibility.values());
        f36655d = a;
        C6847d<ProtoBuf$Modality> a2 = C6847d.m55739a(a, ProtoBuf$Modality.values());
        f36656e = a2;
        C6847d<ProtoBuf$Class.Kind> a3 = C6847d.m55739a(a2, ProtoBuf$Class.Kind.values());
        f36657f = a3;
        C6845b b = C6847d.m55740b(a3);
        f36658g = b;
        C6845b b2 = C6847d.m55740b(b);
        f36659h = b2;
        C6845b b3 = C6847d.m55740b(b2);
        f36660i = b3;
        C6845b b4 = C6847d.m55740b(b3);
        f36661j = b4;
        C6845b b5 = C6847d.m55740b(b4);
        f36662k = b5;
        f36663l = C6847d.m55740b(b5);
        C6845b b6 = C6847d.m55740b(a);
        f36664m = b6;
        f36665n = C6847d.m55740b(b6);
        C6847d<ProtoBuf$MemberKind> a4 = C6847d.m55739a(a2, ProtoBuf$MemberKind.values());
        f36666o = a4;
        C6845b b7 = C6847d.m55740b(a4);
        f36667p = b7;
        C6845b b8 = C6847d.m55740b(b7);
        f36668q = b8;
        C6845b b9 = C6847d.m55740b(b8);
        f36669r = b9;
        C6845b b10 = C6847d.m55740b(b9);
        f36670s = b10;
        C6845b b11 = C6847d.m55740b(b10);
        f36671t = b11;
        C6845b b12 = C6847d.m55740b(b11);
        f36672u = b12;
        C6845b b13 = C6847d.m55740b(b12);
        f36673v = b13;
        f36674w = C6847d.m55740b(b13);
        C6845b b14 = C6847d.m55740b(a4);
        f36675x = b14;
        C6845b b15 = C6847d.m55740b(b14);
        f36676y = b15;
        C6845b b16 = C6847d.m55740b(b15);
        f36677z = b16;
        C6845b b17 = C6847d.m55740b(b16);
        f36637A = b17;
        C6845b b18 = C6847d.m55740b(b17);
        f36638B = b18;
        C6845b b19 = C6847d.m55740b(b18);
        f36639C = b19;
        C6845b b20 = C6847d.m55740b(b19);
        f36640D = b20;
        C6845b b21 = C6847d.m55740b(b20);
        f36641E = b21;
        f36642F = C6847d.m55740b(b21);
        C6845b b22 = C6847d.m55740b(c2);
        f36643G = b22;
        C6845b b23 = C6847d.m55740b(b22);
        f36644H = b23;
        f36645I = C6847d.m55740b(b23);
        C6845b b24 = C6847d.m55740b(a2);
        f36646J = b24;
        C6845b b25 = C6847d.m55740b(b24);
        f36647K = b25;
        f36648L = C6847d.m55740b(b25);
        C6845b c3 = C6847d.m55741c();
        f36649M = c3;
        f36650N = C6847d.m55740b(c3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void m55726a(int r5) {
        /*
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 1
            r2 = 0
            r3 = 2
            if (r5 == r1) goto L_0x002b
            if (r5 == r3) goto L_0x0026
            r4 = 5
            if (r5 == r4) goto L_0x002b
            r4 = 6
            if (r5 == r4) goto L_0x0021
            r4 = 8
            if (r5 == r4) goto L_0x002b
            r4 = 9
            if (r5 == r4) goto L_0x0021
            r4 = 11
            if (r5 == r4) goto L_0x002b
            java.lang.String r4 = "visibility"
            r0[r2] = r4
            goto L_0x002f
        L_0x0021:
            java.lang.String r4 = "memberKind"
            r0[r2] = r4
            goto L_0x002f
        L_0x0026:
            java.lang.String r4 = "kind"
            r0[r2] = r4
            goto L_0x002f
        L_0x002b:
            java.lang.String r4 = "modality"
            r0[r2] = r4
        L_0x002f:
            java.lang.String r2 = "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags"
            r0[r1] = r2
            switch(r5) {
                case 3: goto L_0x004a;
                case 4: goto L_0x0045;
                case 5: goto L_0x0045;
                case 6: goto L_0x0045;
                case 7: goto L_0x0040;
                case 8: goto L_0x0040;
                case 9: goto L_0x0040;
                case 10: goto L_0x003b;
                case 11: goto L_0x003b;
                default: goto L_0x0036;
            }
        L_0x0036:
            java.lang.String r5 = "getClassFlags"
            r0[r3] = r5
            goto L_0x004e
        L_0x003b:
            java.lang.String r5 = "getAccessorFlags"
            r0[r3] = r5
            goto L_0x004e
        L_0x0040:
            java.lang.String r5 = "getPropertyFlags"
            r0[r3] = r5
            goto L_0x004e
        L_0x0045:
            java.lang.String r5 = "getFunctionFlags"
            r0[r3] = r5
            goto L_0x004e
        L_0x004a:
            java.lang.String r5 = "getConstructorFlags"
            r0[r3] = r5
        L_0x004e:
            java.lang.String r5 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            java.lang.String r5 = java.lang.String.format(r5, r0)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.b42.m55726a(int):void");
    }

    /* renamed from: b */
    public static int m55727b(boolean z, ProtoBuf$Visibility protoBuf$Visibility, ProtoBuf$Modality protoBuf$Modality, boolean z2, boolean z3, boolean z4) {
        if (protoBuf$Visibility == null) {
            m55726a(10);
        }
        if (protoBuf$Modality == null) {
            m55726a(11);
        }
        return f36654c.mo50466e(Boolean.valueOf(z)) | f36656e.mo50466e(protoBuf$Modality) | f36655d.mo50466e(protoBuf$Visibility) | f36646J.mo50466e(Boolean.valueOf(z2)) | f36647K.mo50466e(Boolean.valueOf(z3)) | f36648L.mo50466e(Boolean.valueOf(z4));
    }
}
