package kotlin.reflect.jvm.internal.impl.builtins;

import com.google.zxing.oned.Code39Reader;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.builtins.C7395c;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import p000.C6818ad;
import p000.bp4;

/* renamed from: kotlin.reflect.jvm.internal.impl.builtins.b */
/* compiled from: KotlinBuiltIns */
public abstract class C7389b {

    /* renamed from: g */
    public static final r24 f39081g = r24.m71447m("<built-ins module>");

    /* renamed from: a */
    public ModuleDescriptorImpl f39082a;

    /* renamed from: b */
    public q84<ModuleDescriptorImpl> f39083b;

    /* renamed from: c */
    public final q84<C7394e> f39084c;

    /* renamed from: d */
    public final q84<Collection<tk4>> f39085d;

    /* renamed from: e */
    public final vs3<r24, if0> f39086e;

    /* renamed from: f */
    public final da6 f39087f;

    /* renamed from: kotlin.reflect.jvm.internal.impl.builtins.b$a */
    /* compiled from: KotlinBuiltIns */
    public class C7390a implements pc2<Collection<tk4>> {
        public C7390a() {
        }

        /* renamed from: a */
        public Collection<tk4> invoke() {
            return Arrays.asList(new tk4[]{C7389b.this.mo53178r().mo51532N(C7395c.f39113r), C7389b.this.mo53178r().mo51532N(C7395c.f39115t), C7389b.this.mo53178r().mo51532N(C7395c.f39116u), C7389b.this.mo53178r().mo51532N(C7395c.f39114s)});
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.builtins.b$b */
    /* compiled from: KotlinBuiltIns */
    public class C7391b implements pc2<C7394e> {
        public C7391b() {
        }

        /* renamed from: a */
        public C7394e invoke() {
            EnumMap enumMap = new EnumMap(PrimitiveType.class);
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            for (PrimitiveType primitiveType : PrimitiveType.values()) {
                d36 b = C7389b.this.mo53177q(primitiveType.getTypeName().mo65594d());
                d36 b2 = C7389b.this.mo53177q(primitiveType.getArrayTypeName().mo65594d());
                enumMap.put(primitiveType, b2);
                hashMap.put(b, b2);
                hashMap2.put(b2, b);
            }
            return new C7394e(enumMap, hashMap, hashMap2, (C7390a) null);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.builtins.b$c */
    /* compiled from: KotlinBuiltIns */
    public class C7392c implements rc2<r24, if0> {
        public C7392c() {
        }

        /* renamed from: a */
        public if0 invoke(r24 r24) {
            eg0 e = C7389b.this.mo53179s().mo50864e(r24, NoLookupLocation.FROM_BUILTINS);
            if (e == null) {
                throw new AssertionError("Built-in class " + C7395c.f39113r.mo66196c(r24) + " is not found");
            } else if (e instanceof if0) {
                return (if0) e;
            } else {
                throw new AssertionError("Must be a class descriptor " + r24 + ", but was " + e);
            }
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.builtins.b$d */
    /* compiled from: KotlinBuiltIns */
    public class C7393d implements pc2<Void> {

        /* renamed from: a */
        public final /* synthetic */ ModuleDescriptorImpl f39091a;

        public C7393d(ModuleDescriptorImpl moduleDescriptorImpl) {
            this.f39091a = moduleDescriptorImpl;
        }

        /* renamed from: a */
        public Void invoke() {
            if (C7389b.this.f39082a == null) {
                ModuleDescriptorImpl unused = C7389b.this.f39082a = this.f39091a;
                return null;
            }
            throw new AssertionError("Built-ins module is already set: " + C7389b.this.f39082a + " (attempting to reset to " + this.f39091a + ")");
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.builtins.b$e */
    /* compiled from: KotlinBuiltIns */
    public static class C7394e {

        /* renamed from: a */
        public final Map<PrimitiveType, d36> f39093a;

        /* renamed from: b */
        public final Map<xc3, d36> f39094b;

        /* renamed from: c */
        public final Map<d36, d36> f39095c;

        public /* synthetic */ C7394e(Map map, Map map2, Map map3, C7390a aVar) {
            this(map, map2, map3);
        }

        /* renamed from: a */
        public static /* synthetic */ void m60199a(int i) {
            Object[] objArr = new Object[3];
            if (i == 1) {
                objArr[0] = "primitiveKotlinTypeToKotlinArrayType";
            } else if (i != 2) {
                objArr[0] = "primitiveTypeToArrayKotlinType";
            } else {
                objArr[0] = "kotlinArrayTypeToPrimitiveKotlinType";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns$Primitives";
            objArr[2] = "<init>";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        public C7394e(Map<PrimitiveType, d36> map, Map<xc3, d36> map2, Map<d36, d36> map3) {
            if (map == null) {
                m60199a(0);
            }
            if (map2 == null) {
                m60199a(1);
            }
            if (map3 == null) {
                m60199a(2);
            }
            this.f39093a = map;
            this.f39094b = map2;
            this.f39095c = map3;
        }
    }

    public C7389b(da6 da6) {
        if (da6 == null) {
            m60120a(0);
        }
        this.f39087f = da6;
        this.f39085d = da6.mo51164i(new C7390a());
        this.f39084c = da6.mo51164i(new C7391b());
        this.f39086e = da6.mo51163h(new C7392c());
    }

    /* renamed from: A */
    public static xc3 m60113A(xc3 xc3, mx3 mx3) {
        nf0 g;
        nf0 a;
        if0 a2;
        if (xc3 == null) {
            m60120a(71);
        }
        if (mx3 == null) {
            m60120a(72);
        }
        eg0 d = xc3.mo51134H0().mo51180d();
        if (d == null) {
            return null;
        }
        s47 s47 = s47.f44525a;
        if (!s47.mo65819b(d.getName()) || (g = DescriptorUtilsKt.m62446g(d)) == null || (a = s47.mo65818a(g)) == null || (a2 = FindClassInModuleKt.m60278a(mx3, a)) == null) {
            return null;
        }
        return a2.mo51464n();
    }

    /* renamed from: A0 */
    public static boolean m60114A0(d31 d31) {
        if (d31 == null) {
            m60120a(10);
        }
        while (d31 != null) {
            if (d31 instanceof fk4) {
                return ((fk4) d31).mo51711e().mo66204i(C7395c.f39112q);
            }
            d31 = d31.mo51119b();
        }
        return false;
    }

    /* renamed from: B0 */
    public static boolean m60115B0(xc3 xc3) {
        if (xc3 == null) {
            m60120a(142);
        }
        return m60136l0(xc3, C7395c.C7396a.f39166f);
    }

    /* renamed from: C0 */
    public static boolean m60116C0(xc3 xc3) {
        if (xc3 == null) {
            m60120a(132);
        }
        if (m60147w0(xc3) || m60150z0(xc3) || m60148x0(xc3) || m60149y0(xc3)) {
            return true;
        }
        return false;
    }

    /* renamed from: N */
    public static PrimitiveType m60117N(xc3 xc3) {
        if (xc3 == null) {
            m60120a(92);
        }
        eg0 d = xc3.mo51134H0().mo51180d();
        if (d == null) {
            return null;
        }
        return m60118P(d);
    }

    /* renamed from: P */
    public static PrimitiveType m60118P(d31 d31) {
        if (d31 == null) {
            m60120a(77);
        }
        if (C7395c.C7396a.f39135H0.contains(d31.getName())) {
            return C7395c.C7396a.f39139J0.get(dd1.m56821m(d31));
        }
        return null;
    }

    /* renamed from: S */
    public static PrimitiveType m60119S(d31 d31) {
        if (d31 == null) {
            m60120a(76);
        }
        if (C7395c.C7396a.f39133G0.contains(d31.getName())) {
            return C7395c.C7396a.f39137I0.get(dd1.m56821m(d31));
        }
        return null;
    }

    /* renamed from: a */
    public static /* synthetic */ void m60120a(int i) {
        String str;
        int i2;
        Throwable th;
        switch (i) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 68:
            case 69:
            case 70:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 68:
            case 69:
            case 70:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
            case 72:
                objArr[0] = "module";
                break;
            case 2:
                objArr[0] = "computation";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 68:
            case 69:
            case 70:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                break;
            case 9:
            case 10:
            case 76:
            case 77:
            case 89:
            case 96:
            case 103:
            case 107:
            case 108:
            case 145:
            case 146:
            case Code39Reader.ASTERISK_ENCODING:
            case 156:
            case 157:
            case 158:
            case 159:
                objArr[0] = "descriptor";
                break;
            case 12:
            case 98:
            case 100:
            case 102:
            case 104:
            case 106:
            case 135:
                objArr[0] = "fqName";
                break;
            case 14:
                objArr[0] = "simpleName";
                break;
            case 16:
            case 17:
            case 53:
            case 88:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 97:
            case 99:
            case 105:
            case 109:
            case 110:
            case 111:
            case 113:
            case 114:
            case 115:
            case 116:
            case 117:
            case 118:
            case 119:
            case 120:
            case 121:
            case 122:
            case 123:
            case 124:
            case 125:
            case 126:
            case 127:
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 136:
            case 137:
            case 138:
            case 139:
            case 140:
            case 141:
            case 142:
            case 143:
            case 144:
            case 147:
            case 149:
            case 150:
            case 151:
            case 152:
            case 153:
            case 154:
            case 155:
            case 161:
                objArr[0] = "type";
                break;
            case 46:
                objArr[0] = "classSimpleName";
                break;
            case 67:
                objArr[0] = "arrayType";
                break;
            case 71:
                objArr[0] = "notNullArrayType";
                break;
            case 73:
                objArr[0] = "primitiveType";
                break;
            case 75:
                objArr[0] = "kotlinType";
                break;
            case 78:
            case 82:
                objArr[0] = "projectionType";
                break;
            case 79:
            case 83:
            case 85:
                objArr[0] = "argument";
                break;
            case 80:
                objArr[0] = "annotations";
                break;
            case 101:
                objArr[0] = "typeConstructor";
                break;
            case 112:
                objArr[0] = "classDescriptor";
                break;
            case 160:
                objArr[0] = "declarationDescriptor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i) {
            case 3:
                objArr[1] = "getAdditionalClassPartsProvider";
                break;
            case 4:
                objArr[1] = "getPlatformDependentDeclarationFilter";
                break;
            case 5:
                objArr[1] = "getClassDescriptorFactories";
                break;
            case 6:
                objArr[1] = "getStorageManager";
                break;
            case 7:
                objArr[1] = "getBuiltInsModule";
                break;
            case 8:
                objArr[1] = "getBuiltInPackagesImportedByDefault";
                break;
            case 11:
                objArr[1] = "getBuiltInsPackageScope";
                break;
            case 13:
                objArr[1] = "getBuiltInClassByFqName";
                break;
            case 15:
                objArr[1] = "getBuiltInClassByName";
                break;
            case 18:
                objArr[1] = "getSuspendFunction";
                break;
            case 19:
                objArr[1] = "getKFunction";
                break;
            case 20:
                objArr[1] = "getKSuspendFunction";
                break;
            case 21:
                objArr[1] = "getKClass";
                break;
            case 22:
                objArr[1] = "getKCallable";
                break;
            case 23:
                objArr[1] = "getKProperty";
                break;
            case 24:
                objArr[1] = "getKProperty0";
                break;
            case 25:
                objArr[1] = "getKProperty1";
                break;
            case 26:
                objArr[1] = "getKProperty2";
                break;
            case 27:
                objArr[1] = "getKMutableProperty0";
                break;
            case 28:
                objArr[1] = "getKMutableProperty1";
                break;
            case 29:
                objArr[1] = "getKMutableProperty2";
                break;
            case 30:
                objArr[1] = "getIterator";
                break;
            case 31:
                objArr[1] = "getIterable";
                break;
            case 32:
                objArr[1] = "getMutableIterable";
                break;
            case 33:
                objArr[1] = "getMutableIterator";
                break;
            case 34:
                objArr[1] = "getCollection";
                break;
            case 35:
                objArr[1] = "getMutableCollection";
                break;
            case 36:
                objArr[1] = "getList";
                break;
            case 37:
                objArr[1] = "getMutableList";
                break;
            case 38:
                objArr[1] = "getSet";
                break;
            case 39:
                objArr[1] = "getMutableSet";
                break;
            case 40:
                objArr[1] = "getMap";
                break;
            case 41:
                objArr[1] = "getMutableMap";
                break;
            case 42:
                objArr[1] = "getMapEntry";
                break;
            case 43:
                objArr[1] = "getMutableMapEntry";
                break;
            case 44:
                objArr[1] = "getListIterator";
                break;
            case 45:
                objArr[1] = "getMutableListIterator";
                break;
            case 47:
                objArr[1] = "getBuiltInTypeByClassName";
                break;
            case 48:
                objArr[1] = "getNothingType";
                break;
            case 49:
                objArr[1] = "getNullableNothingType";
                break;
            case 50:
                objArr[1] = "getAnyType";
                break;
            case 51:
                objArr[1] = "getNullableAnyType";
                break;
            case 52:
                objArr[1] = "getDefaultBound";
                break;
            case 54:
                objArr[1] = "getPrimitiveKotlinType";
                break;
            case 55:
                objArr[1] = "getNumberType";
                break;
            case 56:
                objArr[1] = "getByteType";
                break;
            case 57:
                objArr[1] = "getShortType";
                break;
            case 58:
                objArr[1] = "getIntType";
                break;
            case 59:
                objArr[1] = "getLongType";
                break;
            case 60:
                objArr[1] = "getFloatType";
                break;
            case 61:
                objArr[1] = "getDoubleType";
                break;
            case 62:
                objArr[1] = "getCharType";
                break;
            case 63:
                objArr[1] = "getBooleanType";
                break;
            case 64:
                objArr[1] = "getUnitType";
                break;
            case 65:
                objArr[1] = "getStringType";
                break;
            case 66:
                objArr[1] = "getIterableType";
                break;
            case 68:
            case 69:
            case 70:
                objArr[1] = "getArrayElementType";
                break;
            case 74:
                objArr[1] = "getPrimitiveArrayKotlinType";
                break;
            case 81:
            case 84:
                objArr[1] = "getArrayType";
                break;
            case 86:
                objArr[1] = "getEnumType";
                break;
            case 87:
                objArr[1] = "getAnnotationType";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/builtins/KotlinBuiltIns";
                break;
        }
        switch (i) {
            case 1:
                objArr[2] = "setBuiltInsModule";
                break;
            case 2:
                objArr[2] = "setPostponedBuiltinsModuleComputation";
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 68:
            case 69:
            case 70:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                break;
            case 9:
                objArr[2] = "isBuiltIn";
                break;
            case 10:
                objArr[2] = "isUnderKotlinPackage";
                break;
            case 12:
                objArr[2] = "getBuiltInClassByFqName";
                break;
            case 14:
                objArr[2] = "getBuiltInClassByName";
                break;
            case 16:
                objArr[2] = "getPrimitiveClassDescriptor";
                break;
            case 17:
                objArr[2] = "getPrimitiveArrayClassDescriptor";
                break;
            case 46:
                objArr[2] = "getBuiltInTypeByClassName";
                break;
            case 53:
                objArr[2] = "getPrimitiveKotlinType";
                break;
            case 67:
                objArr[2] = "getArrayElementType";
                break;
            case 71:
            case 72:
                objArr[2] = "getElementTypeForUnsignedArray";
                break;
            case 73:
                objArr[2] = "getPrimitiveArrayKotlinType";
                break;
            case 75:
                objArr[2] = "getPrimitiveArrayKotlinTypeByPrimitiveKotlinType";
                break;
            case 76:
            case 93:
                objArr[2] = "getPrimitiveType";
                break;
            case 77:
                objArr[2] = "getPrimitiveArrayType";
                break;
            case 78:
            case 79:
            case 80:
            case 82:
            case 83:
                objArr[2] = "getArrayType";
                break;
            case 85:
                objArr[2] = "getEnumType";
                break;
            case 88:
                objArr[2] = "isArray";
                break;
            case 89:
            case 90:
                objArr[2] = "isArrayOrPrimitiveArray";
                break;
            case 91:
                objArr[2] = "isPrimitiveArray";
                break;
            case 92:
                objArr[2] = "getPrimitiveArrayElementType";
                break;
            case 94:
                objArr[2] = "isPrimitiveType";
                break;
            case 95:
                objArr[2] = "isPrimitiveTypeOrNullablePrimitiveType";
                break;
            case 96:
                objArr[2] = "isPrimitiveClass";
                break;
            case 97:
            case 98:
            case 99:
            case 100:
                objArr[2] = "isConstructedFromGivenClass";
                break;
            case 101:
            case 102:
                objArr[2] = "isTypeConstructorForGivenClass";
                break;
            case 103:
            case 104:
                objArr[2] = "classFqNameEquals";
                break;
            case 105:
            case 106:
                objArr[2] = "isNotNullConstructedFromGivenClass";
                break;
            case 107:
                objArr[2] = "isSpecialClassWithNoSupertypes";
                break;
            case 108:
            case 109:
                objArr[2] = "isAny";
                break;
            case 110:
            case 112:
                objArr[2] = "isBoolean";
                break;
            case 111:
                objArr[2] = "isBooleanOrNullableBoolean";
                break;
            case 113:
                objArr[2] = "isNumber";
                break;
            case 114:
                objArr[2] = "isChar";
                break;
            case 115:
                objArr[2] = "isCharOrNullableChar";
                break;
            case 116:
                objArr[2] = "isInt";
                break;
            case 117:
                objArr[2] = "isByte";
                break;
            case 118:
                objArr[2] = "isLong";
                break;
            case 119:
                objArr[2] = "isLongOrNullableLong";
                break;
            case 120:
                objArr[2] = "isShort";
                break;
            case 121:
                objArr[2] = "isFloat";
                break;
            case 122:
                objArr[2] = "isFloatOrNullableFloat";
                break;
            case 123:
                objArr[2] = "isDouble";
                break;
            case 124:
                objArr[2] = "isUByte";
                break;
            case 125:
                objArr[2] = "isUShort";
                break;
            case 126:
                objArr[2] = "isUInt";
                break;
            case 127:
                objArr[2] = "isULong";
                break;
            case 128:
                objArr[2] = "isUByteArray";
                break;
            case 129:
                objArr[2] = "isUShortArray";
                break;
            case 130:
                objArr[2] = "isUIntArray";
                break;
            case 131:
                objArr[2] = "isULongArray";
                break;
            case 132:
                objArr[2] = "isUnsignedArrayType";
                break;
            case 133:
                objArr[2] = "isDoubleOrNullableDouble";
                break;
            case 134:
            case 135:
                objArr[2] = "isConstructedFromGivenClassAndNotNullable";
                break;
            case 136:
                objArr[2] = "isNothing";
                break;
            case 137:
                objArr[2] = "isNullableNothing";
                break;
            case 138:
                objArr[2] = "isNothingOrNullableNothing";
                break;
            case 139:
                objArr[2] = "isAnyOrNullableAny";
                break;
            case 140:
                objArr[2] = "isNullableAny";
                break;
            case 141:
                objArr[2] = "isDefaultBound";
                break;
            case 142:
                objArr[2] = "isUnit";
                break;
            case 143:
                objArr[2] = "isUnitOrNullableUnit";
                break;
            case 144:
                objArr[2] = "isBooleanOrSubtype";
                break;
            case 145:
                objArr[2] = "isMemberOfAny";
                break;
            case 146:
            case 147:
                objArr[2] = "isEnum";
                break;
            case Code39Reader.ASTERISK_ENCODING:
            case 149:
                objArr[2] = "isComparable";
                break;
            case 150:
                objArr[2] = "isCollectionOrNullableCollection";
                break;
            case 151:
                objArr[2] = "isListOrNullableList";
                break;
            case 152:
                objArr[2] = "isSetOrNullableSet";
                break;
            case 153:
                objArr[2] = "isMapOrNullableMap";
                break;
            case 154:
                objArr[2] = "isIterableOrNullableIterable";
                break;
            case 155:
                objArr[2] = "isThrowableOrNullableThrowable";
                break;
            case 156:
                objArr[2] = "isThrowable";
                break;
            case 157:
                objArr[2] = "isKClass";
                break;
            case 158:
                objArr[2] = "isNonPrimitiveArray";
                break;
            case 159:
                objArr[2] = "isCloneable";
                break;
            case 160:
                objArr[2] = "isDeprecated";
                break;
            case 161:
                objArr[2] = "isNotNullOrNullableFunctionSupertype";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 11:
            case 13:
            case 15:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 68:
            case 69:
            case 70:
            case 74:
            case 81:
            case 84:
            case 86:
            case 87:
                th = new IllegalStateException(format);
                break;
            default:
                th = new IllegalArgumentException(format);
                break;
        }
        throw th;
    }

    /* renamed from: a0 */
    public static boolean m60121a0(if0 if0) {
        if (if0 == null) {
            m60120a(108);
        }
        return m60128e(if0, C7395c.C7396a.f39158b);
    }

    /* renamed from: b0 */
    public static boolean m60123b0(xc3 xc3) {
        if (xc3 == null) {
            m60120a(139);
        }
        return m60131g0(xc3, C7395c.C7396a.f39158b);
    }

    /* renamed from: c0 */
    public static boolean m60125c0(xc3 xc3) {
        if (xc3 == null) {
            m60120a(88);
        }
        return m60131g0(xc3, C7395c.C7396a.f39172i);
    }

    /* renamed from: d0 */
    public static boolean m60127d0(if0 if0) {
        if (if0 == null) {
            m60120a(89);
        }
        if (m60128e(if0, C7395c.C7396a.f39172i) || m60118P(if0) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public static boolean m60128e(eg0 eg0, v82 v82) {
        if (eg0 == null) {
            m60120a(103);
        }
        if (v82 == null) {
            m60120a(104);
        }
        if (!eg0.getName().equals(v82.mo66451i()) || !v82.equals(dd1.m56821m(eg0))) {
            return false;
        }
        return true;
    }

    /* renamed from: e0 */
    public static boolean m60129e0(xc3 xc3) {
        if (xc3 == null) {
            m60120a(90);
        }
        if (m60125c0(xc3) || m60140p0(xc3)) {
            return true;
        }
        return false;
    }

    /* renamed from: f0 */
    public static boolean m60130f0(d31 d31) {
        if (d31 == null) {
            m60120a(9);
        }
        if (dd1.m56826r(d31, k50.class, false) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: g0 */
    public static boolean m60131g0(xc3 xc3, v82 v82) {
        if (xc3 == null) {
            m60120a(97);
        }
        if (v82 == null) {
            m60120a(98);
        }
        return m60146v0(xc3.mo51134H0(), v82);
    }

    /* renamed from: h0 */
    public static boolean m60132h0(xc3 xc3, v82 v82) {
        if (xc3 == null) {
            m60120a(134);
        }
        if (v82 == null) {
            m60120a(135);
        }
        if (!m60131g0(xc3, v82) || xc3.mo51135I0()) {
            return false;
        }
        return true;
    }

    /* renamed from: i0 */
    public static boolean m60133i0(xc3 xc3) {
        if (xc3 == null) {
            m60120a(141);
        }
        return m60139o0(xc3);
    }

    /* renamed from: j0 */
    public static boolean m60134j0(d31 d31) {
        if (d31 == null) {
            m60120a(160);
        }
        if (d31.mo50045a().getAnnotations().mo51224C0(C7395c.C7396a.f39204y)) {
            return true;
        }
        if (!(d31 instanceof fx4)) {
            return false;
        }
        fx4 fx4 = (fx4) d31;
        boolean I = fx4.mo51761I();
        ix4 getter = fx4.getGetter();
        lx4 setter = fx4.getSetter();
        if (getter != null && m60134j0(getter)) {
            if (!I) {
                return true;
            }
            if (setter != null && m60134j0(setter)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k0 */
    public static boolean m60135k0(if0 if0) {
        if (if0 == null) {
            m60120a(157);
        }
        return m60128e(if0, C7395c.C7396a.f39173i0);
    }

    /* renamed from: l0 */
    public static boolean m60136l0(xc3 xc3, v82 v82) {
        if (xc3 == null) {
            m60120a(105);
        }
        if (v82 == null) {
            m60120a(106);
        }
        if (xc3.mo51135I0() || !m60131g0(xc3, v82)) {
            return false;
        }
        return true;
    }

    /* renamed from: m0 */
    public static boolean m60137m0(xc3 xc3) {
        if (xc3 == null) {
            m60120a(136);
        }
        if (!m60138n0(xc3) || x17.m73828l(xc3)) {
            return false;
        }
        return true;
    }

    /* renamed from: n0 */
    public static boolean m60138n0(xc3 xc3) {
        if (xc3 == null) {
            m60120a(138);
        }
        return m60131g0(xc3, C7395c.C7396a.f39160c);
    }

    /* renamed from: o0 */
    public static boolean m60139o0(xc3 xc3) {
        if (xc3 == null) {
            m60120a(140);
        }
        if (!m60123b0(xc3) || !xc3.mo51135I0()) {
            return false;
        }
        return true;
    }

    /* renamed from: p0 */
    public static boolean m60140p0(xc3 xc3) {
        if (xc3 == null) {
            m60120a(91);
        }
        eg0 d = xc3.mo51134H0().mo51180d();
        if (d == null || m60118P(d) == null) {
            return false;
        }
        return true;
    }

    /* renamed from: q0 */
    public static boolean m60141q0(if0 if0) {
        if (if0 == null) {
            m60120a(96);
        }
        if (m60119S(if0) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: r0 */
    public static boolean m60142r0(xc3 xc3) {
        if (xc3 == null) {
            m60120a(94);
        }
        if (xc3.mo51135I0() || !m60143s0(xc3)) {
            return false;
        }
        return true;
    }

    /* renamed from: s0 */
    public static boolean m60143s0(xc3 xc3) {
        if (xc3 == null) {
            m60120a(95);
        }
        eg0 d = xc3.mo51134H0().mo51180d();
        if (!(d instanceof if0) || !m60141q0((if0) d)) {
            return false;
        }
        return true;
    }

    /* renamed from: t0 */
    public static boolean m60144t0(if0 if0) {
        if (if0 == null) {
            m60120a(107);
        }
        if (m60128e(if0, C7395c.C7396a.f39158b) || m60128e(if0, C7395c.C7396a.f39160c)) {
            return true;
        }
        return false;
    }

    /* renamed from: u0 */
    public static boolean m60145u0(xc3 xc3) {
        if (xc3 == null || !m60136l0(xc3, C7395c.C7396a.f39170h)) {
            return false;
        }
        return true;
    }

    /* renamed from: v0 */
    public static boolean m60146v0(yz6 yz6, v82 v82) {
        if (yz6 == null) {
            m60120a(101);
        }
        if (v82 == null) {
            m60120a(102);
        }
        eg0 d = yz6.mo51180d();
        if (!(d instanceof if0) || !m60128e(d, v82)) {
            return false;
        }
        return true;
    }

    /* renamed from: w0 */
    public static boolean m60147w0(xc3 xc3) {
        if (xc3 == null) {
            m60120a(128);
        }
        return m60132h0(xc3, C7395c.C7396a.f39125C0.mo66205j());
    }

    /* renamed from: x0 */
    public static boolean m60148x0(xc3 xc3) {
        if (xc3 == null) {
            m60120a(130);
        }
        return m60132h0(xc3, C7395c.C7396a.f39129E0.mo66205j());
    }

    /* renamed from: y0 */
    public static boolean m60149y0(xc3 xc3) {
        if (xc3 == null) {
            m60120a(131);
        }
        return m60132h0(xc3, C7395c.C7396a.f39131F0.mo66205j());
    }

    /* renamed from: z0 */
    public static boolean m60150z0(xc3 xc3) {
        if (xc3 == null) {
            m60120a(129);
        }
        return m60132h0(xc3, C7395c.C7396a.f39127D0.mo66205j());
    }

    /* renamed from: B */
    public d36 mo53143B() {
        d36 R = mo53158R(PrimitiveType.FLOAT);
        if (R == null) {
            m60120a(60);
        }
        return R;
    }

    /* renamed from: C */
    public if0 mo53144C(int i) {
        return mo53176p(C7395c.m60201b(i));
    }

    /* renamed from: D */
    public d36 mo53145D() {
        d36 R = mo53158R(PrimitiveType.INT);
        if (R == null) {
            m60120a(58);
        }
        return R;
    }

    /* renamed from: D0 */
    public void mo53146D0(ModuleDescriptorImpl moduleDescriptorImpl) {
        if (moduleDescriptorImpl == null) {
            m60120a(1);
        }
        this.f39087f.mo51160e(new C7393d(moduleDescriptorImpl));
    }

    /* renamed from: E */
    public if0 mo53147E() {
        if0 o = mo53175o(C7395c.C7396a.f39173i0.mo66454l());
        if (o == null) {
            m60120a(21);
        }
        return o;
    }

    /* renamed from: F */
    public d36 mo53148F() {
        d36 R = mo53158R(PrimitiveType.LONG);
        if (R == null) {
            m60120a(59);
        }
        return R;
    }

    /* renamed from: G */
    public if0 mo53149G() {
        return mo53176p("Nothing");
    }

    /* renamed from: H */
    public d36 mo53150H() {
        d36 n = mo53149G().mo51464n();
        if (n == null) {
            m60120a(48);
        }
        return n;
    }

    /* renamed from: I */
    public d36 mo53151I() {
        d36 O0 = mo53169i().mo51121O0(true);
        if (O0 == null) {
            m60120a(51);
        }
        return O0;
    }

    /* renamed from: J */
    public d36 mo53152J() {
        d36 O0 = mo53150H().mo51121O0(true);
        if (O0 == null) {
            m60120a(49);
        }
        return O0;
    }

    /* renamed from: K */
    public if0 mo53153K() {
        return mo53176p("Number");
    }

    /* renamed from: L */
    public d36 mo53154L() {
        d36 n = mo53153K().mo51464n();
        if (n == null) {
            m60120a(55);
        }
        return n;
    }

    /* renamed from: M */
    public bp4 mo53155M() {
        bp4.C6872b bVar = bp4.C6872b.f36922a;
        if (bVar == null) {
            m60120a(4);
        }
        return bVar;
    }

    /* renamed from: O */
    public d36 mo53156O(PrimitiveType primitiveType) {
        if (primitiveType == null) {
            m60120a(73);
        }
        d36 d36 = ((C7394e) this.f39084c.invoke()).f39093a.get(primitiveType);
        if (d36 == null) {
            m60120a(74);
        }
        return d36;
    }

    /* renamed from: Q */
    public final if0 mo53157Q(PrimitiveType primitiveType) {
        if (primitiveType == null) {
            m60120a(16);
        }
        return mo53176p(primitiveType.getTypeName().mo65594d());
    }

    /* renamed from: R */
    public d36 mo53158R(PrimitiveType primitiveType) {
        if (primitiveType == null) {
            m60120a(53);
        }
        d36 n = mo53157Q(primitiveType).mo51464n();
        if (n == null) {
            m60120a(54);
        }
        return n;
    }

    /* renamed from: T */
    public d36 mo53159T() {
        d36 R = mo53158R(PrimitiveType.SHORT);
        if (R == null) {
            m60120a(57);
        }
        return R;
    }

    /* renamed from: U */
    public da6 mo53160U() {
        da6 da6 = this.f39087f;
        if (da6 == null) {
            m60120a(6);
        }
        return da6;
    }

    /* renamed from: V */
    public if0 mo53161V() {
        return mo53176p("String");
    }

    /* renamed from: W */
    public d36 mo53162W() {
        d36 n = mo53161V().mo51464n();
        if (n == null) {
            m60120a(65);
        }
        return n;
    }

    /* renamed from: X */
    public if0 mo53163X(int i) {
        if0 o = mo53175o(C7395c.f39105j.mo66196c(r24.m71445h(C7395c.m60203d(i))));
        if (o == null) {
            m60120a(18);
        }
        return o;
    }

    /* renamed from: Y */
    public if0 mo53164Y() {
        return mo53176p("Unit");
    }

    /* renamed from: Z */
    public d36 mo53165Z() {
        d36 n = mo53164Y().mo51464n();
        if (n == null) {
            m60120a(64);
        }
        return n;
    }

    /* renamed from: f */
    public void mo53166f(boolean z) {
        ModuleDescriptorImpl moduleDescriptorImpl = new ModuleDescriptorImpl(f39081g, this.f39087f, this, (ql6) null);
        this.f39082a = moduleDescriptorImpl;
        moduleDescriptorImpl.mo53294M0(BuiltInsLoader.f39060a.mo53128a().mo53127a(this.f39087f, this.f39082a, mo53182v(), mo53155M(), mo53167g(), z));
        ModuleDescriptorImpl moduleDescriptorImpl2 = this.f39082a;
        moduleDescriptorImpl2.mo53300S0(moduleDescriptorImpl2);
    }

    /* renamed from: g */
    public C6818ad mo53167g() {
        C6818ad.C6819a aVar = C6818ad.C6819a.f36428a;
        if (aVar == null) {
            m60120a(3);
        }
        return aVar;
    }

    /* renamed from: h */
    public if0 mo53168h() {
        return mo53176p("Any");
    }

    /* renamed from: i */
    public d36 mo53169i() {
        d36 n = mo53168h().mo51464n();
        if (n == null) {
            m60120a(50);
        }
        return n;
    }

    /* renamed from: j */
    public if0 mo53170j() {
        return mo53176p("Array");
    }

    /* renamed from: k */
    public xc3 mo53171k(xc3 xc3) {
        xc3 A;
        if (xc3 == null) {
            m60120a(67);
        }
        if (!m60125c0(xc3)) {
            xc3 n = x17.m73830n(xc3);
            xc3 xc32 = ((C7394e) this.f39084c.invoke()).f39095c.get(n);
            if (xc32 != null) {
                return xc32;
            }
            mx3 i = dd1.m56817i(n);
            if (i != null && (A = m60113A(n, i)) != null) {
                return A;
            }
            throw new IllegalStateException("not array: " + xc3);
        } else if (xc3.mo51132F0().size() == 1) {
            xc3 type = xc3.mo51132F0().get(0).getType();
            if (type == null) {
                m60120a(68);
            }
            return type;
        } else {
            throw new IllegalStateException();
        }
    }

    /* renamed from: l */
    public d36 mo53172l(Variance variance, xc3 xc3) {
        if (variance == null) {
            m60120a(82);
        }
        if (xc3 == null) {
            m60120a(83);
        }
        d36 m = mo53173m(variance, xc3, C6983dm.f37317b.mo51228b());
        if (m == null) {
            m60120a(84);
        }
        return m;
    }

    /* renamed from: m */
    public d36 mo53173m(Variance variance, xc3 xc3, C6983dm dmVar) {
        if (variance == null) {
            m60120a(78);
        }
        if (xc3 == null) {
            m60120a(79);
        }
        if (dmVar == null) {
            m60120a(80);
        }
        d36 g = KotlinTypeFactory.m62851g(sz6.m72128b(dmVar), mo53170j(), Collections.singletonList(new h17(variance, xc3)));
        if (g == null) {
            m60120a(81);
        }
        return g;
    }

    /* renamed from: n */
    public d36 mo53174n() {
        d36 R = mo53158R(PrimitiveType.BOOLEAN);
        if (R == null) {
            m60120a(63);
        }
        return R;
    }

    /* renamed from: o */
    public if0 mo53175o(u82 u82) {
        if (u82 == null) {
            m60120a(12);
        }
        if0 c = cd1.m56380c(mo53178r(), u82, NoLookupLocation.FROM_BUILTINS);
        if (c == null) {
            m60120a(13);
        }
        return c;
    }

    /* renamed from: p */
    public final if0 mo53176p(String str) {
        if (str == null) {
            m60120a(14);
        }
        if0 invoke = this.f39086e.invoke(r24.m71445h(str));
        if (invoke == null) {
            m60120a(15);
        }
        return invoke;
    }

    /* renamed from: q */
    public final d36 mo53177q(String str) {
        if (str == null) {
            m60120a(46);
        }
        d36 n = mo53176p(str).mo51464n();
        if (n == null) {
            m60120a(47);
        }
        return n;
    }

    /* renamed from: r */
    public ModuleDescriptorImpl mo53178r() {
        if (this.f39082a == null) {
            this.f39082a = (ModuleDescriptorImpl) this.f39083b.invoke();
        }
        ModuleDescriptorImpl moduleDescriptorImpl = this.f39082a;
        if (moduleDescriptorImpl == null) {
            m60120a(7);
        }
        return moduleDescriptorImpl;
    }

    /* renamed from: s */
    public MemberScope mo53179s() {
        MemberScope m = mo53178r().mo51532N(C7395c.f39113r).mo53288m();
        if (m == null) {
            m60120a(11);
        }
        return m;
    }

    /* renamed from: t */
    public d36 mo53180t() {
        d36 R = mo53158R(PrimitiveType.BYTE);
        if (R == null) {
            m60120a(56);
        }
        return R;
    }

    /* renamed from: u */
    public d36 mo53181u() {
        d36 R = mo53158R(PrimitiveType.CHAR);
        if (R == null) {
            m60120a(62);
        }
        return R;
    }

    /* renamed from: v */
    public Iterable<kf0> mo53182v() {
        List singletonList = Collections.singletonList(new f50(this.f39087f, mo53178r()));
        if (singletonList == null) {
            m60120a(5);
        }
        return singletonList;
    }

    /* renamed from: w */
    public if0 mo53183w() {
        if0 o = mo53175o(C7395c.C7396a.f39150U);
        if (o == null) {
            m60120a(34);
        }
        return o;
    }

    /* renamed from: x */
    public if0 mo53184x() {
        return mo53176p("Comparable");
    }

    /* renamed from: y */
    public d36 mo53185y() {
        d36 I = mo53151I();
        if (I == null) {
            m60120a(52);
        }
        return I;
    }

    /* renamed from: z */
    public d36 mo53186z() {
        d36 R = mo53158R(PrimitiveType.DOUBLE);
        if (R == null) {
            m60120a(61);
        }
        return R;
    }
}
