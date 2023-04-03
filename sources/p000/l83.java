package p000;

import kotlin.NoWhenBranchMatchedException;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import kotlin.text.StringsKt__StringsKt;
import p000.j83;

/* renamed from: l83 */
/* compiled from: methodSignatureMapping.kt */
public final class l83 implements k83<j83> {

    /* renamed from: a */
    public static final l83 f40589a = new l83();

    /* renamed from: l83$a */
    /* compiled from: methodSignatureMapping.kt */
    public /* synthetic */ class C7824a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f40590a;

        static {
            int[] iArr = new int[PrimitiveType.values().length];
            iArr[PrimitiveType.BOOLEAN.ordinal()] = 1;
            iArr[PrimitiveType.CHAR.ordinal()] = 2;
            iArr[PrimitiveType.BYTE.ordinal()] = 3;
            iArr[PrimitiveType.SHORT.ordinal()] = 4;
            iArr[PrimitiveType.INT.ordinal()] = 5;
            iArr[PrimitiveType.FLOAT.ordinal()] = 6;
            iArr[PrimitiveType.LONG.ordinal()] = 7;
            iArr[PrimitiveType.DOUBLE.ordinal()] = 8;
            f40590a = iArr;
        }
    }

    /* renamed from: g */
    public j83 mo52876b(j83 j83) {
        vx2.m53591g(j83, "possiblyPrimitiveType");
        if (!(j83 instanceof j83.C7256d)) {
            return j83;
        }
        j83.C7256d dVar = (j83.C7256d) j83;
        if (dVar.mo52650i() == null) {
            return j83;
        }
        String f = y73.m74292c(dVar.mo52650i().getWrapperFqName()).mo67043f();
        vx2.m53590f(f, "byFqNameWithoutInnerClas…apperFqName).internalName");
        return mo52879e(f);
    }

    /* renamed from: h */
    public j83 mo52875a(String str) {
        JvmPrimitiveType jvmPrimitiveType;
        j83 cVar;
        boolean z;
        vx2.m53591g(str, "representation");
        str.length();
        char charAt = str.charAt(0);
        JvmPrimitiveType[] values = JvmPrimitiveType.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                jvmPrimitiveType = null;
                break;
            }
            jvmPrimitiveType = values[i];
            if (jvmPrimitiveType.getDesc().charAt(0) == charAt) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                break;
            }
            i++;
        }
        if (jvmPrimitiveType != null) {
            return new j83.C7256d(jvmPrimitiveType);
        }
        if (charAt == 'V') {
            return new j83.C7256d((JvmPrimitiveType) null);
        }
        if (charAt == '[') {
            String substring = str.substring(1);
            vx2.m53590f(substring, "this as java.lang.String).substring(startIndex)");
            cVar = new j83.C7253a(mo52875a(substring));
        } else {
            if (charAt == 'L') {
                boolean U = StringsKt__StringsKt.m63087U(str, ';', false, 2, (Object) null);
            }
            String substring2 = str.substring(1, str.length() - 1);
            vx2.m53590f(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
            cVar = new j83.C7255c(substring2);
        }
        return cVar;
    }

    /* renamed from: i */
    public j83.C7255c mo52879e(String str) {
        vx2.m53591g(str, "internalName");
        return new j83.C7255c(str);
    }

    /* renamed from: j */
    public j83 mo52877c(PrimitiveType primitiveType) {
        vx2.m53591g(primitiveType, "primitiveType");
        switch (C7824a.f40590a[primitiveType.ordinal()]) {
            case 1:
                return j83.f38617a.mo52641a();
            case 2:
                return j83.f38617a.mo52643c();
            case 3:
                return j83.f38617a.mo52642b();
            case 4:
                return j83.f38617a.mo52648h();
            case 5:
                return j83.f38617a.mo52646f();
            case 6:
                return j83.f38617a.mo52645e();
            case 7:
                return j83.f38617a.mo52647g();
            case 8:
                return j83.f38617a.mo52644d();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: k */
    public j83 mo52880f() {
        return mo52879e("java/lang/Class");
    }

    /* renamed from: l */
    public String mo52878d(j83 j83) {
        String desc;
        vx2.m53591g(j83, "type");
        if (j83 instanceof j83.C7253a) {
            return '[' + mo52878d(((j83.C7253a) j83).mo52640i());
        } else if (j83 instanceof j83.C7256d) {
            JvmPrimitiveType i = ((j83.C7256d) j83).mo52650i();
            if (i == null || (desc = i.getDesc()) == null) {
                return "V";
            }
            return desc;
        } else if (j83 instanceof j83.C7255c) {
            return 'L' + ((j83.C7255c) j83).mo52649i() + ';';
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}
