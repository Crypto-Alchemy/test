package kotlin.reflect.jvm.internal.impl.resolve;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Queue;
import java.util.ServiceLoader;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.C7420a;
import kotlin.reflect.jvm.internal.impl.descriptors.C7425c;
import kotlin.reflect.jvm.internal.impl.descriptors.C7427d;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C7433a;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypePreparator;
import org.web3j.ens.contracts.generated.PublicResolver;
import p000.bd3;
import p000.yc3;

public class OverridingUtil {

    /* renamed from: e */
    public static final List<ExternalOverridabilityCondition> f40069e;

    /* renamed from: f */
    public static final OverridingUtil f40070f;

    /* renamed from: g */
    public static final yc3.C9638a f40071g;

    /* renamed from: a */
    public final bd3 f40072a;

    /* renamed from: b */
    public final KotlinTypePreparator f40073b;

    /* renamed from: c */
    public final yc3.C9638a f40074c;

    /* renamed from: d */
    public final fd2<xc3, xc3, Boolean> f40075d;

    public static class OverrideCompatibilityInfo {

        /* renamed from: c */
        public static final OverrideCompatibilityInfo f40076c = new OverrideCompatibilityInfo(Result.OVERRIDABLE, "SUCCESS");

        /* renamed from: a */
        public final Result f40077a;

        /* renamed from: b */
        public final String f40078b;

        public enum Result {
            OVERRIDABLE,
            INCOMPATIBLE,
            CONFLICT
        }

        public OverrideCompatibilityInfo(Result result, String str) {
            if (result == null) {
                m62395a(3);
            }
            if (str == null) {
                m62395a(4);
            }
            this.f40077a = result;
            this.f40078b = str;
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x0038  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x003b  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0040  */
        /* JADX WARNING: Removed duplicated region for block: B:25:0x0045  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0049  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x005a  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static /* synthetic */ void m62395a(int r10) {
            /*
                r0 = 4
                r1 = 3
                r2 = 2
                r3 = 1
                if (r10 == r3) goto L_0x000f
                if (r10 == r2) goto L_0x000f
                if (r10 == r1) goto L_0x000f
                if (r10 == r0) goto L_0x000f
                java.lang.String r4 = "@NotNull method %s.%s must not return null"
                goto L_0x0011
            L_0x000f:
                java.lang.String r4 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            L_0x0011:
                if (r10 == r3) goto L_0x001b
                if (r10 == r2) goto L_0x001b
                if (r10 == r1) goto L_0x001b
                if (r10 == r0) goto L_0x001b
                r5 = r2
                goto L_0x001c
            L_0x001b:
                r5 = r1
            L_0x001c:
                java.lang.Object[] r5 = new java.lang.Object[r5]
                java.lang.String r6 = "success"
                java.lang.String r7 = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$OverrideCompatibilityInfo"
                r8 = 0
                if (r10 == r3) goto L_0x0031
                if (r10 == r2) goto L_0x0031
                if (r10 == r1) goto L_0x002e
                if (r10 == r0) goto L_0x0031
                r5[r8] = r7
                goto L_0x0035
            L_0x002e:
                r5[r8] = r6
                goto L_0x0035
            L_0x0031:
                java.lang.String r9 = "debugMessage"
                r5[r8] = r9
            L_0x0035:
                switch(r10) {
                    case 1: goto L_0x0045;
                    case 2: goto L_0x0045;
                    case 3: goto L_0x0045;
                    case 4: goto L_0x0045;
                    case 5: goto L_0x0040;
                    case 6: goto L_0x003b;
                    default: goto L_0x0038;
                }
            L_0x0038:
                r5[r3] = r6
                goto L_0x0047
            L_0x003b:
                java.lang.String r6 = "getDebugMessage"
                r5[r3] = r6
                goto L_0x0047
            L_0x0040:
                java.lang.String r6 = "getResult"
                r5[r3] = r6
                goto L_0x0047
            L_0x0045:
                r5[r3] = r7
            L_0x0047:
                if (r10 == r3) goto L_0x005a
                if (r10 == r2) goto L_0x0055
                if (r10 == r1) goto L_0x0050
                if (r10 == r0) goto L_0x0050
                goto L_0x005e
            L_0x0050:
                java.lang.String r6 = "<init>"
                r5[r2] = r6
                goto L_0x005e
            L_0x0055:
                java.lang.String r6 = "conflict"
                r5[r2] = r6
                goto L_0x005e
            L_0x005a:
                java.lang.String r6 = "incompatible"
                r5[r2] = r6
            L_0x005e:
                java.lang.String r4 = java.lang.String.format(r4, r5)
                if (r10 == r3) goto L_0x0070
                if (r10 == r2) goto L_0x0070
                if (r10 == r1) goto L_0x0070
                if (r10 == r0) goto L_0x0070
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                r10.<init>(r4)
                goto L_0x0075
            L_0x0070:
                java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
                r10.<init>(r4)
            L_0x0075:
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.m62395a(int):void");
        }

        /* renamed from: b */
        public static OverrideCompatibilityInfo m62396b(String str) {
            if (str == null) {
                m62395a(2);
            }
            return new OverrideCompatibilityInfo(Result.CONFLICT, str);
        }

        /* renamed from: d */
        public static OverrideCompatibilityInfo m62397d(String str) {
            if (str == null) {
                m62395a(1);
            }
            return new OverrideCompatibilityInfo(Result.INCOMPATIBLE, str);
        }

        /* renamed from: e */
        public static OverrideCompatibilityInfo m62398e() {
            OverrideCompatibilityInfo overrideCompatibilityInfo = f40076c;
            if (overrideCompatibilityInfo == null) {
                m62395a(0);
            }
            return overrideCompatibilityInfo;
        }

        /* renamed from: c */
        public Result mo55056c() {
            Result result = this.f40077a;
            if (result == null) {
                m62395a(5);
            }
            return result;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$a */
    public static class C7652a implements yc3.C9638a {
        /* renamed from: b */
        public static /* synthetic */ void m62400b(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "a";
            } else {
                objArr[0] = "b";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$1";
            objArr[2] = "equals";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        /* renamed from: a */
        public boolean mo55047a(yz6 yz6, yz6 yz62) {
            if (yz6 == null) {
                m62400b(0);
            }
            if (yz62 == null) {
                m62400b(1);
            }
            return yz6.equals(yz62);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$b */
    public static class C7653b implements fd2<D, D, Pair<C7420a, C7420a>> {
        /* renamed from: a */
        public Pair<C7420a, C7420a> invoke(D d, D d2) {
            return new Pair<>(d, d2);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$c */
    public static class C7654c implements rc2<CallableMemberDescriptor, Boolean> {

        /* renamed from: a */
        public final /* synthetic */ d31 f40080a;

        public C7654c(d31 d31) {
            this.f40080a = d31;
        }

        /* renamed from: a */
        public Boolean invoke(CallableMemberDescriptor callableMemberDescriptor) {
            boolean z;
            if (callableMemberDescriptor.mo51119b() == this.f40080a) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$d */
    public static class C7655d implements rc2<CallableMemberDescriptor, C7420a> {
        /* renamed from: a */
        public CallableMemberDescriptor invoke(CallableMemberDescriptor callableMemberDescriptor) {
            return callableMemberDescriptor;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$e */
    public static class C7656e implements rc2<CallableMemberDescriptor, Boolean> {

        /* renamed from: a */
        public final /* synthetic */ if0 f40081a;

        public C7656e(if0 if0) {
            this.f40081a = if0;
        }

        /* renamed from: a */
        public Boolean invoke(CallableMemberDescriptor callableMemberDescriptor) {
            boolean z = false;
            if (!ed1.m57282g(callableMemberDescriptor.getVisibility()) && ed1.m57283h(callableMemberDescriptor, this.f40081a, false)) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$f */
    public static class C7657f implements rc2<CallableMemberDescriptor, C7420a> {
        /* renamed from: a */
        public C7420a invoke(CallableMemberDescriptor callableMemberDescriptor) {
            return callableMemberDescriptor;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$g */
    public static class C7658g implements rc2<CallableMemberDescriptor, r37> {

        /* renamed from: a */
        public final /* synthetic */ jj4 f40082a;

        /* renamed from: d */
        public final /* synthetic */ CallableMemberDescriptor f40083d;

        public C7658g(jj4 jj4, CallableMemberDescriptor callableMemberDescriptor) {
            this.f40082a = jj4;
            this.f40083d = callableMemberDescriptor;
        }

        /* renamed from: a */
        public r37 invoke(CallableMemberDescriptor callableMemberDescriptor) {
            this.f40082a.mo52728b(this.f40083d, callableMemberDescriptor);
            return r37.f33317a;
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$h */
    public static /* synthetic */ class C7659h {

        /* renamed from: a */
        public static final /* synthetic */ int[] f40084a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f40085b;

        /* renamed from: c */
        public static final /* synthetic */ int[] f40086c;

        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|17|18|19|20|21|22|23|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0044 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0069 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0073 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x007d */
        static {
            /*
                kotlin.reflect.jvm.internal.impl.descriptors.Modality[] r0 = kotlin.reflect.jvm.internal.impl.descriptors.Modality.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f40086c = r0
                r1 = 1
                kotlin.reflect.jvm.internal.impl.descriptors.Modality r2 = kotlin.reflect.jvm.internal.impl.descriptors.Modality.FINAL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f40086c     // Catch:{ NoSuchFieldError -> 0x001d }
                kotlin.reflect.jvm.internal.impl.descriptors.Modality r3 = kotlin.reflect.jvm.internal.impl.descriptors.Modality.SEALED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f40086c     // Catch:{ NoSuchFieldError -> 0x0028 }
                kotlin.reflect.jvm.internal.impl.descriptors.Modality r4 = kotlin.reflect.jvm.internal.impl.descriptors.Modality.OPEN     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = f40086c     // Catch:{ NoSuchFieldError -> 0x0033 }
                kotlin.reflect.jvm.internal.impl.descriptors.Modality r5 = kotlin.reflect.jvm.internal.impl.descriptors.Modality.ABSTRACT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo$Result[] r4 = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f40085b = r4
                kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo$Result r5 = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result.OVERRIDABLE     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                int[] r4 = f40085b     // Catch:{ NoSuchFieldError -> 0x004e }
                kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo$Result r5 = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result.CONFLICT     // Catch:{ NoSuchFieldError -> 0x004e }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r4[r5] = r0     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r4 = f40085b     // Catch:{ NoSuchFieldError -> 0x0058 }
                kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil$OverrideCompatibilityInfo$Result r5 = kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.OverrideCompatibilityInfo.Result.INCOMPATIBLE     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r4[r5] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Result[] r4 = kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                f40084a = r4
                kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Result r5 = kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result.OVERRIDABLE     // Catch:{ NoSuchFieldError -> 0x0069 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0069 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0069 }
            L_0x0069:
                int[] r1 = f40084a     // Catch:{ NoSuchFieldError -> 0x0073 }
                kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Result r4 = kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result.CONFLICT     // Catch:{ NoSuchFieldError -> 0x0073 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0073 }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x0073 }
            L_0x0073:
                int[] r0 = f40084a     // Catch:{ NoSuchFieldError -> 0x007d }
                kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Result r1 = kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result.INCOMPATIBLE     // Catch:{ NoSuchFieldError -> 0x007d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x007d }
            L_0x007d:
                int[] r0 = f40084a     // Catch:{ NoSuchFieldError -> 0x0087 }
                kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Result r1 = kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result.UNKNOWN     // Catch:{ NoSuchFieldError -> 0x0087 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0087 }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x0087 }
            L_0x0087:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.C7659h.<clinit>():void");
        }
    }

    static {
        Class<ExternalOverridabilityCondition> cls = ExternalOverridabilityCondition.class;
        f40069e = CollectionsKt___CollectionsKt.m47311K0(ServiceLoader.load(cls, cls.getClassLoader()));
        C7652a aVar = new C7652a();
        f40071g = aVar;
        f40070f = new OverridingUtil(aVar, bd3.C6859a.f36799a, KotlinTypePreparator.C7727a.f40292a, (fd2<xc3, xc3, Boolean>) null);
    }

    public OverridingUtil(yc3.C9638a aVar, bd3 bd3, KotlinTypePreparator kotlinTypePreparator, fd2<xc3, xc3, Boolean> fd2) {
        if (aVar == null) {
            m62366a(5);
        }
        if (bd3 == null) {
            m62366a(6);
        }
        if (kotlinTypePreparator == null) {
            m62366a(7);
        }
        this.f40074c = aVar;
        this.f40072a = bd3;
        this.f40073b = kotlinTypePreparator;
        this.f40075d = fd2;
    }

    /* renamed from: A */
    public static boolean m62357A(C7427d dVar, C7427d dVar2) {
        if (dVar == null || dVar2 == null) {
            return true;
        }
        return m62361H(dVar, dVar2);
    }

    /* renamed from: B */
    public static boolean m62358B(C7420a aVar, C7420a aVar2) {
        if (aVar == null) {
            m62366a(67);
        }
        if (aVar2 == null) {
            m62366a(68);
        }
        xc3 returnType = aVar.getReturnType();
        xc3 returnType2 = aVar2.getReturnType();
        if (!m62361H(aVar, aVar2)) {
            return false;
        }
        TypeCheckerState l = f40070f.mo55053l(aVar.getTypeParameters(), aVar2.getTypeParameters());
        if (aVar instanceof C7425c) {
            return m62360G(aVar, returnType, aVar2, returnType2, l);
        }
        if (aVar instanceof fx4) {
            fx4 fx4 = (fx4) aVar;
            fx4 fx42 = (fx4) aVar2;
            if (!m62357A(fx4.getSetter(), fx42.getSetter())) {
                return false;
            }
            if (fx4.mo51761I() && fx42.mo51761I()) {
                return AbstractTypeChecker.f40248a.mo55263k(l, returnType.mo64506K0(), returnType2.mo64506K0());
            }
            if ((fx4.mo51761I() || !fx42.mo51761I()) && m62360G(aVar, returnType, aVar2, returnType2, l)) {
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException("Unexpected callable: " + aVar.getClass());
    }

    /* renamed from: C */
    public static boolean m62359C(C7420a aVar, Collection<C7420a> collection) {
        if (aVar == null) {
            m62366a(71);
        }
        if (collection == null) {
            m62366a(72);
        }
        for (C7420a B : collection) {
            if (!m62358B(aVar, B)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: G */
    public static boolean m62360G(C7420a aVar, xc3 xc3, C7420a aVar2, xc3 xc32, TypeCheckerState typeCheckerState) {
        if (aVar == null) {
            m62366a(73);
        }
        if (xc3 == null) {
            m62366a(74);
        }
        if (aVar2 == null) {
            m62366a(75);
        }
        if (xc32 == null) {
            m62366a(76);
        }
        if (typeCheckerState == null) {
            m62366a(77);
        }
        return AbstractTypeChecker.f40248a.mo55270r(typeCheckerState, xc3.mo64506K0(), xc32.mo64506K0());
    }

    /* renamed from: H */
    public static boolean m62361H(k31 k31, k31 k312) {
        if (k31 == null) {
            m62366a(69);
        }
        if (k312 == null) {
            m62366a(70);
        }
        Integer d = ed1.m57279d(k31.getVisibility(), k312.getVisibility());
        if (d == null || d.intValue() >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: I */
    public static boolean m62362I(ns3 ns3, ns3 ns32, boolean z) {
        if (ns3 == null) {
            m62366a(57);
        }
        if (ns32 == null) {
            m62366a(58);
        }
        if (ed1.m57282g(ns32.getVisibility()) || !ed1.m57283h(ns32, ns3, z)) {
            return false;
        }
        return true;
    }

    /* renamed from: J */
    public static <D extends C7420a> boolean m62363J(D d, D d2, boolean z, boolean z2) {
        if (d == null) {
            m62366a(13);
        }
        if (d2 == null) {
            m62366a(14);
        }
        if (!d.equals(d2) && DescriptorEquivalenceForOverrides.f40061a.mo55041d(d.mo50045a(), d2.mo50045a(), z, z2)) {
            return true;
        }
        C7420a a = d2.mo50045a();
        for (C7420a d3 : dd1.m56812d(d)) {
            if (DescriptorEquivalenceForOverrides.f40061a.mo55041d(a, d3, z, z2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: K */
    public static void m62364K(CallableMemberDescriptor callableMemberDescriptor, rc2<CallableMemberDescriptor, r37> rc2) {
        fd1 fd1;
        rc2<CallableMemberDescriptor, r37> rc22;
        if (callableMemberDescriptor == null) {
            m62366a(107);
        }
        for (CallableMemberDescriptor callableMemberDescriptor2 : callableMemberDescriptor.mo51659d()) {
            if (callableMemberDescriptor2.getVisibility() == ed1.f37512g) {
                m62364K(callableMemberDescriptor2, rc2);
            }
        }
        if (callableMemberDescriptor.getVisibility() == ed1.f37512g) {
            fd1 h = m62373h(callableMemberDescriptor);
            if (h == null) {
                if (rc2 != null) {
                    rc2.invoke(callableMemberDescriptor);
                }
                fd1 = ed1.f37510e;
            } else {
                fd1 = h;
            }
            if (callableMemberDescriptor instanceof gx4) {
                ((gx4) callableMemberDescriptor).mo52051W0(fd1);
                for (C7427d next : ((fx4) callableMemberDescriptor).mo51771t()) {
                    if (h == null) {
                        rc22 = null;
                    } else {
                        rc22 = rc2;
                    }
                    m62364K(next, rc22);
                }
            } else if (callableMemberDescriptor instanceof C7433a) {
                ((C7433a) callableMemberDescriptor).mo53339d1(fd1);
            } else {
                dx4 dx4 = (dx4) callableMemberDescriptor;
                dx4.mo51314I0(fd1);
                if (fd1 != dx4.mo51316R().getVisibility()) {
                    dx4.mo51312G0(false);
                }
            }
        }
    }

    /* renamed from: L */
    public static <H> H m62365L(Collection<H> collection, rc2<H, C7420a> rc2) {
        if (collection == null) {
            m62366a(78);
        }
        if (rc2 == null) {
            m62366a(79);
        }
        if (collection.size() == 1) {
            H Y = CollectionsKt___CollectionsKt.m47328Y(collection);
            if (Y == null) {
                m62366a(80);
            }
            return Y;
        }
        ArrayList arrayList = new ArrayList(2);
        List<C7420a> n0 = CollectionsKt___CollectionsKt.m47343n0(collection, rc2);
        H Y2 = CollectionsKt___CollectionsKt.m47328Y(collection);
        C7420a invoke = rc2.invoke(Y2);
        for (H next : collection) {
            C7420a invoke2 = rc2.invoke(next);
            if (m62359C(invoke2, n0)) {
                arrayList.add(next);
            }
            if (m62358B(invoke2, invoke) && !m62358B(invoke, invoke2)) {
                Y2 = next;
            }
        }
        if (arrayList.isEmpty()) {
            if (Y2 == null) {
                m62366a(81);
            }
            return Y2;
        } else if (arrayList.size() == 1) {
            H Y3 = CollectionsKt___CollectionsKt.m47328Y(arrayList);
            if (Y3 == null) {
                m62366a(82);
            }
            return Y3;
        } else {
            H h = null;
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                H next2 = it.next();
                if (!n42.m64516b(rc2.invoke(next2).getReturnType())) {
                    h = next2;
                    break;
                }
            }
            if (h != null) {
                return h;
            }
            H Y4 = CollectionsKt___CollectionsKt.m47328Y(arrayList);
            if (Y4 == null) {
                m62366a(84);
            }
            return Y4;
        }
    }

    /* renamed from: a */
    public static /* synthetic */ void m62366a(int i) {
        String str;
        int i2;
        Throwable th;
        int i3 = i;
        if (!(i3 == 11 || i3 == 12 || i3 == 16 || i3 == 21 || i3 == 95 || i3 == 98 || i3 == 103 || i3 == 44 || i3 == 45)) {
            switch (i3) {
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                    break;
                default:
                    switch (i3) {
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                            break;
                        default:
                            switch (i3) {
                                case 80:
                                case 81:
                                case 82:
                                case 83:
                                case 84:
                                    break;
                                default:
                                    switch (i3) {
                                        case 90:
                                        case 91:
                                        case 92:
                                            break;
                                        default:
                                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                            break;
                                    }
                            }
                    }
            }
        }
        str = "@NotNull method %s.%s must not return null";
        if (!(i3 == 11 || i3 == 12 || i3 == 16 || i3 == 21 || i3 == 95 || i3 == 98 || i3 == 103 || i3 == 44 || i3 == 45)) {
            switch (i3) {
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                    break;
                default:
                    switch (i3) {
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                            break;
                        default:
                            switch (i3) {
                                case 80:
                                case 81:
                                case 82:
                                case 83:
                                case 84:
                                    break;
                                default:
                                    switch (i3) {
                                        case 90:
                                        case 91:
                                        case 92:
                                            break;
                                        default:
                                            i2 = 3;
                                            break;
                                    }
                            }
                    }
            }
        }
        i2 = 2;
        Object[] objArr = new Object[i2];
        switch (i3) {
            case 1:
            case 7:
                objArr[0] = "kotlinTypePreparator";
                break;
            case 2:
                objArr[0] = "customSubtype";
                break;
            case 4:
                objArr[0] = "equalityAxioms";
                break;
            case 5:
                objArr[0] = "axioms";
                break;
            case 8:
            case 9:
                objArr[0] = "candidateSet";
                break;
            case 10:
                objArr[0] = "transformFirst";
                break;
            case 11:
            case 12:
            case 16:
            case 21:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 44:
            case 45:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 90:
            case 91:
            case 92:
            case 95:
            case 98:
            case 103:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil";
                break;
            case 13:
                objArr[0] = "f";
                break;
            case 14:
                objArr[0] = "g";
                break;
            case 15:
            case 17:
                objArr[0] = "descriptor";
                break;
            case 18:
                objArr[0] = "result";
                break;
            case 19:
            case 22:
            case 30:
            case 40:
                objArr[0] = "superDescriptor";
                break;
            case 20:
            case 23:
            case 31:
            case 41:
                objArr[0] = "subDescriptor";
                break;
            case 42:
                objArr[0] = "firstParameters";
                break;
            case 43:
                objArr[0] = "secondParameters";
                break;
            case 46:
                objArr[0] = "typeInSuper";
                break;
            case 47:
                objArr[0] = "typeInSub";
                break;
            case 48:
            case 51:
            case 77:
                objArr[0] = "typeCheckerState";
                break;
            case 49:
                objArr[0] = "superTypeParameter";
                break;
            case 50:
                objArr[0] = "subTypeParameter";
                break;
            case 52:
                objArr[0] = PublicResolver.FUNC_NAME;
                break;
            case 53:
                objArr[0] = "membersFromSupertypes";
                break;
            case 54:
                objArr[0] = "membersFromCurrent";
                break;
            case 55:
            case 61:
            case 64:
            case 86:
            case 89:
            case 96:
                objArr[0] = "current";
                break;
            case 56:
            case 62:
            case 66:
            case 87:
            case 106:
                objArr[0] = "strategy";
                break;
            case 57:
                objArr[0] = "overriding";
                break;
            case 58:
                objArr[0] = "fromSuper";
                break;
            case 59:
                objArr[0] = "fromCurrent";
                break;
            case 60:
                objArr[0] = "descriptorsFromSuper";
                break;
            case 63:
            case 65:
                objArr[0] = "notOverridden";
                break;
            case 67:
            case 69:
            case 73:
                objArr[0] = "a";
                break;
            case 68:
            case 70:
            case 75:
                objArr[0] = "b";
                break;
            case 71:
                objArr[0] = "candidate";
                break;
            case 72:
            case 88:
            case 93:
            case 109:
                objArr[0] = "descriptors";
                break;
            case 74:
                objArr[0] = "aReturnType";
                break;
            case 76:
                objArr[0] = "bReturnType";
                break;
            case 78:
            case 85:
                objArr[0] = "overridables";
                break;
            case 79:
            case 101:
                objArr[0] = "descriptorByHandle";
                break;
            case 94:
                objArr[0] = "classModality";
                break;
            case 97:
                objArr[0] = "toFilter";
                break;
            case 99:
            case 104:
                objArr[0] = "overrider";
                break;
            case 100:
            case 105:
                objArr[0] = "extractFrom";
                break;
            case 102:
                objArr[0] = "onConflict";
                break;
            case 107:
            case 108:
                objArr[0] = "memberDescriptor";
                break;
            default:
                objArr[0] = "kotlinTypeRefiner";
                break;
        }
        if (i3 == 11 || i3 == 12) {
            objArr[1] = "filterOverrides";
        } else if (i3 != 16) {
            if (i3 != 21) {
                if (i3 == 95) {
                    objArr[1] = "getMinimalModality";
                } else if (i3 == 98) {
                    objArr[1] = "filterVisibleFakeOverrides";
                } else if (i3 != 103) {
                    if (i3 != 44 && i3 != 45) {
                        switch (i3) {
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                                break;
                            default:
                                switch (i3) {
                                    case 32:
                                    case 33:
                                    case 34:
                                    case 35:
                                    case 36:
                                    case 37:
                                    case 38:
                                    case 39:
                                        objArr[1] = "isOverridableByWithoutExternalConditions";
                                        break;
                                    default:
                                        switch (i3) {
                                            case 80:
                                            case 81:
                                            case 82:
                                            case 83:
                                            case 84:
                                                objArr[1] = "selectMostSpecificMember";
                                                break;
                                            default:
                                                switch (i3) {
                                                    case 90:
                                                    case 91:
                                                    case 92:
                                                        objArr[1] = "determineModalityForFakeOverride";
                                                        break;
                                                    default:
                                                        objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil";
                                                        break;
                                                }
                                        }
                                }
                        }
                    } else {
                        objArr[1] = "createTypeCheckerState";
                    }
                } else {
                    objArr[1] = "extractMembersOverridableInBothWays";
                }
            }
            objArr[1] = "isOverridableBy";
        } else {
            objArr[1] = "getOverriddenDeclarations";
        }
        switch (i3) {
            case 1:
            case 2:
                objArr[2] = "createWithTypePreparatorAndCustomSubtype";
                break;
            case 3:
            case 4:
                objArr[2] = "create";
                break;
            case 5:
            case 6:
            case 7:
                objArr[2] = "<init>";
                break;
            case 8:
                objArr[2] = "filterOutOverridden";
                break;
            case 9:
            case 10:
                objArr[2] = "filterOverrides";
                break;
            case 11:
            case 12:
            case 16:
            case 21:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 44:
            case 45:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
            case 90:
            case 91:
            case 92:
            case 95:
            case 98:
            case 103:
                break;
            case 13:
            case 14:
                objArr[2] = "overrides";
                break;
            case 15:
                objArr[2] = "getOverriddenDeclarations";
                break;
            case 17:
            case 18:
                objArr[2] = "collectOverriddenDeclarations";
                break;
            case 19:
            case 20:
            case 22:
            case 23:
                objArr[2] = "isOverridableBy";
                break;
            case 30:
            case 31:
                objArr[2] = "isOverridableByWithoutExternalConditions";
                break;
            case 40:
            case 41:
                objArr[2] = "getBasicOverridabilityProblem";
                break;
            case 42:
            case 43:
                objArr[2] = "createTypeCheckerState";
                break;
            case 46:
            case 47:
            case 48:
                objArr[2] = "areTypesEquivalent";
                break;
            case 49:
            case 50:
            case 51:
                objArr[2] = "areTypeParametersEquivalent";
                break;
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
                objArr[2] = "generateOverridesInFunctionGroup";
                break;
            case 57:
            case 58:
                objArr[2] = "isVisibleForOverride";
                break;
            case 59:
            case 60:
            case 61:
            case 62:
                objArr[2] = "extractAndBindOverridesForMember";
                break;
            case 63:
                objArr[2] = "allHasSameContainingDeclaration";
                break;
            case 64:
            case 65:
            case 66:
                objArr[2] = "createAndBindFakeOverrides";
                break;
            case 67:
            case 68:
                objArr[2] = "isMoreSpecific";
                break;
            case 69:
            case 70:
                objArr[2] = "isVisibilityMoreSpecific";
                break;
            case 71:
            case 72:
                objArr[2] = "isMoreSpecificThenAllOf";
                break;
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
                objArr[2] = "isReturnTypeMoreSpecific";
                break;
            case 78:
            case 79:
                objArr[2] = "selectMostSpecificMember";
                break;
            case 85:
            case 86:
            case 87:
                objArr[2] = "createAndBindFakeOverride";
                break;
            case 88:
            case 89:
                objArr[2] = "determineModalityForFakeOverride";
                break;
            case 93:
            case 94:
                objArr[2] = "getMinimalModality";
                break;
            case 96:
            case 97:
                objArr[2] = "filterVisibleFakeOverrides";
                break;
            case 99:
            case 100:
            case 101:
            case 102:
            case 104:
            case 105:
            case 106:
                objArr[2] = "extractMembersOverridableInBothWays";
                break;
            case 107:
                objArr[2] = "resolveUnknownVisibilityForMember";
                break;
            case 108:
                objArr[2] = "computeVisibilityToInherit";
                break;
            case 109:
                objArr[2] = "findMaxVisibility";
                break;
            default:
                objArr[2] = "createWithTypeRefiner";
                break;
        }
        String format = String.format(str, objArr);
        if (!(i3 == 11 || i3 == 12 || i3 == 16 || i3 == 21 || i3 == 95 || i3 == 98 || i3 == 103 || i3 == 44 || i3 == 45)) {
            switch (i3) {
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                    break;
                default:
                    switch (i3) {
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                            break;
                        default:
                            switch (i3) {
                                case 80:
                                case 81:
                                case 82:
                                case 83:
                                case 84:
                                    break;
                                default:
                                    switch (i3) {
                                        case 90:
                                        case 91:
                                        case 92:
                                            break;
                                        default:
                                            th = new IllegalArgumentException(format);
                                            break;
                                    }
                            }
                    }
            }
        }
        th = new IllegalStateException(format);
        throw th;
    }

    /* renamed from: b */
    public static boolean m62367b(Collection<CallableMemberDescriptor> collection) {
        if (collection == null) {
            m62366a(63);
        }
        if (collection.size() < 2) {
            return true;
        }
        return CollectionsKt___CollectionsKt.m47316P(collection, new C7654c(collection.iterator().next().mo51119b()));
    }

    /* renamed from: c */
    public static boolean m62368c(a17 a17, a17 a172, TypeCheckerState typeCheckerState) {
        if (a17 == null) {
            m62366a(49);
        }
        if (a172 == null) {
            m62366a(50);
        }
        if (typeCheckerState == null) {
            m62366a(51);
        }
        List<xc3> upperBounds = a17.getUpperBounds();
        ArrayList arrayList = new ArrayList(a172.getUpperBounds());
        if (upperBounds.size() != arrayList.size()) {
            return false;
        }
        for (xc3 next : upperBounds) {
            ListIterator listIterator = arrayList.listIterator();
            while (listIterator.hasNext()) {
                if (m62369d(next, (xc3) listIterator.next(), typeCheckerState)) {
                    listIterator.remove();
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static boolean m62369d(xc3 xc3, xc3 xc32, TypeCheckerState typeCheckerState) {
        boolean z;
        if (xc3 == null) {
            m62366a(46);
        }
        if (xc32 == null) {
            m62366a(47);
        }
        if (typeCheckerState == null) {
            m62366a(48);
        }
        if (!zc3.m74855a(xc3) || !zc3.m74855a(xc32)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return true;
        }
        return AbstractTypeChecker.f40248a.mo55263k(typeCheckerState, xc3.mo64506K0(), xc32.mo64506K0());
    }

    /* renamed from: e */
    public static OverrideCompatibilityInfo m62370e(C7420a aVar, C7420a aVar2) {
        boolean z;
        boolean z2 = true;
        if (aVar.mo51315J() == null) {
            z = true;
        } else {
            z = false;
        }
        if (aVar2.mo51315J() != null) {
            z2 = false;
        }
        if (z != z2) {
            return OverrideCompatibilityInfo.m62397d("Receiver presence mismatch");
        }
        if (aVar.mo51763f().size() != aVar2.mo51763f().size()) {
            return OverrideCompatibilityInfo.m62397d("Value parameter number mismatch");
        }
        return null;
    }

    /* renamed from: f */
    public static void m62371f(CallableMemberDescriptor callableMemberDescriptor, Set<CallableMemberDescriptor> set) {
        if (callableMemberDescriptor == null) {
            m62366a(17);
        }
        if (set == null) {
            m62366a(18);
        }
        if (callableMemberDescriptor.getKind().isReal()) {
            set.add(callableMemberDescriptor);
        } else if (!callableMemberDescriptor.mo51659d().isEmpty()) {
            for (CallableMemberDescriptor f : callableMemberDescriptor.mo51659d()) {
                m62371f(f, set);
            }
        } else {
            throw new IllegalStateException("No overridden descriptors found for (fake override) " + callableMemberDescriptor);
        }
    }

    /* renamed from: g */
    public static List<xc3> m62372g(C7420a aVar) {
        h85 J = aVar.mo51315J();
        ArrayList arrayList = new ArrayList();
        if (J != null) {
            arrayList.add(J.getType());
        }
        for (n87 type : aVar.mo51763f()) {
            arrayList.add(type.getType());
        }
        return arrayList;
    }

    /* renamed from: h */
    public static fd1 m62373h(CallableMemberDescriptor callableMemberDescriptor) {
        if (callableMemberDescriptor == null) {
            m62366a(108);
        }
        Collection<? extends CallableMemberDescriptor> d = callableMemberDescriptor.mo51659d();
        fd1 u = m62384u(d);
        if (u == null) {
            return null;
        }
        if (callableMemberDescriptor.getKind() != CallableMemberDescriptor.Kind.FAKE_OVERRIDE) {
            return u.mo51644f();
        }
        for (CallableMemberDescriptor callableMemberDescriptor2 : d) {
            if (callableMemberDescriptor2.mo51326p() != Modality.ABSTRACT && !callableMemberDescriptor2.getVisibility().equals(u)) {
                return null;
            }
        }
        return u;
    }

    /* renamed from: i */
    public static OverridingUtil m62374i(bd3 bd3, yc3.C9638a aVar) {
        if (bd3 == null) {
            m62366a(3);
        }
        if (aVar == null) {
            m62366a(4);
        }
        return new OverridingUtil(aVar, bd3, KotlinTypePreparator.C7727a.f40292a, (fd2<xc3, xc3, Boolean>) null);
    }

    /* renamed from: j */
    public static void m62375j(Collection<CallableMemberDescriptor> collection, if0 if0, jj4 jj4) {
        fd1 fd1;
        if (collection == null) {
            m62366a(85);
        }
        if (if0 == null) {
            m62366a(86);
        }
        if (jj4 == null) {
            m62366a(87);
        }
        Collection<CallableMemberDescriptor> t = m62383t(if0, collection);
        boolean isEmpty = t.isEmpty();
        if (!isEmpty) {
            collection = t;
        }
        Modality n = m62378n(collection, if0);
        if (isEmpty) {
            fd1 = ed1.f37513h;
        } else {
            fd1 = ed1.f37512g;
        }
        if0 if02 = if0;
        CallableMemberDescriptor f0 = ((CallableMemberDescriptor) m62365L(collection, new C7655d())).mo50948f0(if02, n, fd1, CallableMemberDescriptor.Kind.FAKE_OVERRIDE, false);
        jj4.mo50136d(f0, collection);
        jj4.mo50135a(f0);
    }

    /* renamed from: k */
    public static void m62376k(if0 if0, Collection<CallableMemberDescriptor> collection, jj4 jj4) {
        if (if0 == null) {
            m62366a(64);
        }
        if (collection == null) {
            m62366a(65);
        }
        if (jj4 == null) {
            m62366a(66);
        }
        if (m62367b(collection)) {
            for (CallableMemberDescriptor singleton : collection) {
                m62375j(Collections.singleton(singleton), if0, jj4);
            }
            return;
        }
        LinkedList linkedList = new LinkedList(collection);
        while (!linkedList.isEmpty()) {
            m62375j(m62380q(mf7.m64318a(linkedList), linkedList, jj4), if0, jj4);
        }
    }

    /* renamed from: m */
    public static OverridingUtil m62377m(bd3 bd3) {
        if (bd3 == null) {
            m62366a(0);
        }
        return new OverridingUtil(f40071g, bd3, KotlinTypePreparator.C7727a.f40292a, (fd2<xc3, xc3, Boolean>) null);
    }

    /* renamed from: n */
    public static Modality m62378n(Collection<CallableMemberDescriptor> collection, if0 if0) {
        Modality modality;
        if (collection == null) {
            m62366a(88);
        }
        if (if0 == null) {
            m62366a(89);
        }
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        for (CallableMemberDescriptor next : collection) {
            int i = C7659h.f40086c[next.mo51326p().ordinal()];
            if (i == 1) {
                Modality modality2 = Modality.FINAL;
                if (modality2 == null) {
                    m62366a(90);
                }
                return modality2;
            } else if (i == 2) {
                throw new IllegalStateException("Member cannot have SEALED modality: " + next);
            } else if (i == 3) {
                z2 = true;
            } else if (i == 4) {
                z3 = true;
            }
        }
        if (!(!if0.mo51319d0() || if0.mo51326p() == Modality.ABSTRACT || if0.mo51326p() == Modality.SEALED)) {
            z = true;
        }
        if (z2 && !z3) {
            Modality modality3 = Modality.OPEN;
            if (modality3 == null) {
                m62366a(91);
            }
            return modality3;
        } else if (z2 || !z3) {
            HashSet hashSet = new HashSet();
            for (CallableMemberDescriptor z4 : collection) {
                hashSet.addAll(m62388z(z4));
            }
            return m62387y(m62381r(hashSet), z, if0.mo51326p());
        } else {
            if (z) {
                modality = if0.mo51326p();
            } else {
                modality = Modality.ABSTRACT;
            }
            if (modality == null) {
                m62366a(92);
            }
            return modality;
        }
    }

    /* renamed from: p */
    public static <H> Collection<H> m62379p(H h, Collection<H> collection, rc2<H, C7420a> rc2, rc2<H, r37> rc22) {
        if (h == null) {
            m62366a(99);
        }
        if (collection == null) {
            m62366a(100);
        }
        if (rc2 == null) {
            m62366a(101);
        }
        if (rc22 == null) {
            m62366a(102);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(h);
        C7420a invoke = rc2.invoke(h);
        Iterator<H> it = collection.iterator();
        while (it.hasNext()) {
            H next = it.next();
            C7420a invoke2 = rc2.invoke(next);
            if (h == next) {
                it.remove();
            } else {
                OverrideCompatibilityInfo.Result x = m62386x(invoke, invoke2);
                if (x == OverrideCompatibilityInfo.Result.OVERRIDABLE) {
                    arrayList.add(next);
                    it.remove();
                } else if (x == OverrideCompatibilityInfo.Result.CONFLICT) {
                    rc22.invoke(next);
                    it.remove();
                }
            }
        }
        return arrayList;
    }

    /* renamed from: q */
    public static Collection<CallableMemberDescriptor> m62380q(CallableMemberDescriptor callableMemberDescriptor, Queue<CallableMemberDescriptor> queue, jj4 jj4) {
        if (callableMemberDescriptor == null) {
            m62366a(104);
        }
        if (queue == null) {
            m62366a(105);
        }
        if (jj4 == null) {
            m62366a(106);
        }
        return m62379p(callableMemberDescriptor, queue, new C7657f(), new C7658g(jj4, callableMemberDescriptor));
    }

    /* renamed from: r */
    public static <D extends C7420a> Set<D> m62381r(Set<D> set) {
        boolean z;
        if (set == null) {
            m62366a(8);
        }
        if (set.isEmpty() || !DescriptorUtilsKt.m62456q(DescriptorUtilsKt.m62451l((d31) set.iterator().next()))) {
            z = false;
        } else {
            z = true;
        }
        return m62382s(set, z, (pc2<?>) null, new C7653b());
    }

    /* renamed from: s */
    public static <D> Set<D> m62382s(Set<D> set, boolean z, pc2<?> pc2, fd2<? super D, ? super D, Pair<C7420a, C7420a>> fd2) {
        if (set == null) {
            m62366a(9);
        }
        if (fd2 == null) {
            m62366a(10);
        }
        if (set.size() <= 1) {
            return set;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (D next : set) {
            if (pc2 != null) {
                pc2.invoke();
            }
            Iterator it = linkedHashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    linkedHashSet.add(next);
                    break;
                }
                Pair invoke = fd2.invoke(next, it.next());
                C7420a aVar = (C7420a) invoke.component1();
                C7420a aVar2 = (C7420a) invoke.component2();
                if (m62363J(aVar, aVar2, z, true)) {
                    it.remove();
                } else if (m62363J(aVar2, aVar, z, true)) {
                    break;
                }
            }
        }
        return linkedHashSet;
    }

    /* renamed from: t */
    public static Collection<CallableMemberDescriptor> m62383t(if0 if0, Collection<CallableMemberDescriptor> collection) {
        if (if0 == null) {
            m62366a(96);
        }
        if (collection == null) {
            m62366a(97);
        }
        List<T> V = CollectionsKt___CollectionsKt.m47325V(collection, new C7656e(if0));
        if (V == null) {
            m62366a(98);
        }
        return V;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0045  */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p000.fd1 m62384u(java.util.Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> r5) {
        /*
            if (r5 != 0) goto L_0x0007
            r0 = 109(0x6d, float:1.53E-43)
            m62366a(r0)
        L_0x0007:
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x0010
            fd1 r5 = p000.ed1.f37517l
            return r5
        L_0x0010:
            java.util.Iterator r0 = r5.iterator()
            r1 = 0
        L_0x0015:
            r2 = r1
        L_0x0016:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0038
            java.lang.Object r3 = r0.next()
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r3 = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) r3
            fd1 r3 = r3.getVisibility()
            if (r2 != 0) goto L_0x002a
        L_0x0028:
            r2 = r3
            goto L_0x0016
        L_0x002a:
            java.lang.Integer r4 = p000.ed1.m57279d(r3, r2)
            if (r4 != 0) goto L_0x0031
            goto L_0x0015
        L_0x0031:
            int r4 = r4.intValue()
            if (r4 <= 0) goto L_0x0016
            goto L_0x0028
        L_0x0038:
            if (r2 != 0) goto L_0x003b
            return r1
        L_0x003b:
            java.util.Iterator r5 = r5.iterator()
        L_0x003f:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x005c
            java.lang.Object r0 = r5.next()
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r0 = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) r0
            fd1 r0 = r0.getVisibility()
            java.lang.Integer r0 = p000.ed1.m57279d(r2, r0)
            if (r0 == 0) goto L_0x005b
            int r0 = r0.intValue()
            if (r0 >= 0) goto L_0x003f
        L_0x005b:
            return r1
        L_0x005c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil.m62384u(java.util.Collection):fd1");
    }

    /* renamed from: w */
    public static OverrideCompatibilityInfo m62385w(C7420a aVar, C7420a aVar2) {
        boolean z;
        if (aVar == null) {
            m62366a(40);
        }
        if (aVar2 == null) {
            m62366a(41);
        }
        boolean z2 = aVar instanceof C7425c;
        if ((z2 && !(aVar2 instanceof C7425c)) || (((z = aVar instanceof fx4)) && !(aVar2 instanceof fx4))) {
            return OverrideCompatibilityInfo.m62397d("Member kind mismatch");
        }
        if (!z2 && !z) {
            throw new IllegalArgumentException("This type of CallableDescriptor cannot be checked for overridability: " + aVar);
        } else if (!aVar.getName().equals(aVar2.getName())) {
            return OverrideCompatibilityInfo.m62397d("Name mismatch");
        } else {
            OverrideCompatibilityInfo e = m62370e(aVar, aVar2);
            if (e != null) {
                return e;
            }
            return null;
        }
    }

    /* renamed from: x */
    public static OverrideCompatibilityInfo.Result m62386x(C7420a aVar, C7420a aVar2) {
        OverridingUtil overridingUtil = f40070f;
        OverrideCompatibilityInfo.Result c = overridingUtil.mo55050D(aVar2, aVar, (if0) null).mo55056c();
        OverrideCompatibilityInfo.Result c2 = overridingUtil.mo55050D(aVar, aVar2, (if0) null).mo55056c();
        OverrideCompatibilityInfo.Result result = OverrideCompatibilityInfo.Result.OVERRIDABLE;
        if (c == result && c2 == result) {
            return result;
        }
        OverrideCompatibilityInfo.Result result2 = OverrideCompatibilityInfo.Result.CONFLICT;
        if (c == result2 || c2 == result2) {
            return result2;
        }
        return OverrideCompatibilityInfo.Result.INCOMPATIBLE;
    }

    /* renamed from: y */
    public static Modality m62387y(Collection<CallableMemberDescriptor> collection, boolean z, Modality modality) {
        Modality modality2;
        if (collection == null) {
            m62366a(93);
        }
        if (modality == null) {
            m62366a(94);
        }
        Modality modality3 = Modality.ABSTRACT;
        for (CallableMemberDescriptor next : collection) {
            if (!z || next.mo51326p() != Modality.ABSTRACT) {
                modality2 = next.mo51326p();
            } else {
                modality2 = modality;
            }
            if (modality2.compareTo(modality3) < 0) {
                modality3 = modality2;
            }
        }
        if (modality3 == null) {
            m62366a(95);
        }
        return modality3;
    }

    /* renamed from: z */
    public static Set<CallableMemberDescriptor> m62388z(CallableMemberDescriptor callableMemberDescriptor) {
        if (callableMemberDescriptor == null) {
            m62366a(15);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        m62371f(callableMemberDescriptor, linkedHashSet);
        return linkedHashSet;
    }

    /* renamed from: D */
    public OverrideCompatibilityInfo mo55050D(C7420a aVar, C7420a aVar2, if0 if0) {
        if (aVar == null) {
            m62366a(19);
        }
        if (aVar2 == null) {
            m62366a(20);
        }
        OverrideCompatibilityInfo E = mo55051E(aVar, aVar2, if0, false);
        if (E == null) {
            m62366a(21);
        }
        return E;
    }

    /* renamed from: E */
    public OverrideCompatibilityInfo mo55051E(C7420a aVar, C7420a aVar2, if0 if0, boolean z) {
        boolean z2;
        if (aVar == null) {
            m62366a(22);
        }
        if (aVar2 == null) {
            m62366a(23);
        }
        OverrideCompatibilityInfo F = mo55052F(aVar, aVar2, z);
        if (F.mo55056c() == OverrideCompatibilityInfo.Result.OVERRIDABLE) {
            z2 = true;
        } else {
            z2 = false;
        }
        for (ExternalOverridabilityCondition next : f40069e) {
            if (next.getContract() != ExternalOverridabilityCondition.Contract.CONFLICTS_ONLY && (!z2 || next.getContract() != ExternalOverridabilityCondition.Contract.SUCCESS_ONLY)) {
                int i = C7659h.f40084a[next.mo52362a(aVar, aVar2, if0).ordinal()];
                if (i == 1) {
                    z2 = true;
                } else if (i == 2) {
                    OverrideCompatibilityInfo b = OverrideCompatibilityInfo.m62396b("External condition failed");
                    if (b == null) {
                        m62366a(24);
                    }
                    return b;
                } else if (i == 3) {
                    OverrideCompatibilityInfo d = OverrideCompatibilityInfo.m62397d("External condition");
                    if (d == null) {
                        m62366a(25);
                    }
                    return d;
                }
            }
        }
        if (!z2) {
            return F;
        }
        for (ExternalOverridabilityCondition next2 : f40069e) {
            if (next2.getContract() == ExternalOverridabilityCondition.Contract.CONFLICTS_ONLY) {
                int i2 = C7659h.f40084a[next2.mo52362a(aVar, aVar2, if0).ordinal()];
                if (i2 == 1) {
                    throw new IllegalStateException("Contract violation in " + next2.getClass().getName() + " condition. It's not supposed to end with success");
                } else if (i2 == 2) {
                    OverrideCompatibilityInfo b2 = OverrideCompatibilityInfo.m62396b("External condition failed");
                    if (b2 == null) {
                        m62366a(27);
                    }
                    return b2;
                } else if (i2 == 3) {
                    OverrideCompatibilityInfo d2 = OverrideCompatibilityInfo.m62397d("External condition");
                    if (d2 == null) {
                        m62366a(28);
                    }
                    return d2;
                }
            }
        }
        OverrideCompatibilityInfo e = OverrideCompatibilityInfo.m62398e();
        if (e == null) {
            m62366a(29);
        }
        return e;
    }

    /* renamed from: F */
    public OverrideCompatibilityInfo mo55052F(C7420a aVar, C7420a aVar2, boolean z) {
        if (aVar == null) {
            m62366a(30);
        }
        if (aVar2 == null) {
            m62366a(31);
        }
        OverrideCompatibilityInfo w = m62385w(aVar, aVar2);
        if (w != null) {
            return w;
        }
        List<xc3> g = m62372g(aVar);
        List<xc3> g2 = m62372g(aVar2);
        List<a17> typeParameters = aVar.getTypeParameters();
        List<a17> typeParameters2 = aVar2.getTypeParameters();
        int i = 0;
        if (typeParameters.size() != typeParameters2.size()) {
            while (i < g.size()) {
                if (!yc3.f46193a.mo55822b(g.get(i), g2.get(i))) {
                    OverrideCompatibilityInfo d = OverrideCompatibilityInfo.m62397d("Type parameter number mismatch");
                    if (d == null) {
                        m62366a(33);
                    }
                    return d;
                }
                i++;
            }
            OverrideCompatibilityInfo b = OverrideCompatibilityInfo.m62396b("Type parameter number mismatch");
            if (b == null) {
                m62366a(34);
            }
            return b;
        }
        TypeCheckerState l = mo55053l(typeParameters, typeParameters2);
        for (int i2 = 0; i2 < typeParameters.size(); i2++) {
            if (!m62368c(typeParameters.get(i2), typeParameters2.get(i2), l)) {
                OverrideCompatibilityInfo d2 = OverrideCompatibilityInfo.m62397d("Type parameter bounds mismatch");
                if (d2 == null) {
                    m62366a(35);
                }
                return d2;
            }
        }
        for (int i3 = 0; i3 < g.size(); i3++) {
            if (!m62369d(g.get(i3), g2.get(i3), l)) {
                OverrideCompatibilityInfo d3 = OverrideCompatibilityInfo.m62397d("Value parameter type mismatch");
                if (d3 == null) {
                    m62366a(36);
                }
                return d3;
            }
        }
        if (!(aVar instanceof C7425c) || !(aVar2 instanceof C7425c) || ((C7425c) aVar).isSuspend() == ((C7425c) aVar2).isSuspend()) {
            if (z) {
                xc3 returnType = aVar.getReturnType();
                xc3 returnType2 = aVar2.getReturnType();
                if (!(returnType == null || returnType2 == null)) {
                    if (zc3.m74855a(returnType2) && zc3.m74855a(returnType)) {
                        i = 1;
                    }
                    if (i == 0 && !AbstractTypeChecker.f40248a.mo55270r(l, returnType2.mo64506K0(), returnType.mo64506K0())) {
                        OverrideCompatibilityInfo b2 = OverrideCompatibilityInfo.m62396b("Return type mismatch");
                        if (b2 == null) {
                            m62366a(38);
                        }
                        return b2;
                    }
                }
            }
            OverrideCompatibilityInfo e = OverrideCompatibilityInfo.m62398e();
            if (e == null) {
                m62366a(39);
            }
            return e;
        }
        OverrideCompatibilityInfo b3 = OverrideCompatibilityInfo.m62396b("Incompatible suspendability");
        if (b3 == null) {
            m62366a(37);
        }
        return b3;
    }

    /* renamed from: l */
    public final TypeCheckerState mo55053l(List<a17> list, List<a17> list2) {
        if (list == null) {
            m62366a(42);
        }
        if (list2 == null) {
            m62366a(43);
        }
        if (list.isEmpty()) {
            TypeCheckerState H0 = new kj4((Map<yz6, ? extends yz6>) null, this.f40074c, this.f40072a, this.f40073b, this.f40075d).mo52959H0(true, true);
            if (H0 == null) {
                m62366a(44);
            }
            return H0;
        }
        HashMap hashMap = new HashMap();
        for (int i = 0; i < list.size(); i++) {
            hashMap.put(list.get(i).mo50046g(), list2.get(i).mo50046g());
        }
        TypeCheckerState H02 = new kj4(hashMap, this.f40074c, this.f40072a, this.f40073b, this.f40075d).mo52959H0(true, true);
        if (H02 == null) {
            m62366a(45);
        }
        return H02;
    }

    /* renamed from: o */
    public final Collection<CallableMemberDescriptor> mo55054o(CallableMemberDescriptor callableMemberDescriptor, Collection<? extends CallableMemberDescriptor> collection, if0 if0, jj4 jj4) {
        if (callableMemberDescriptor == null) {
            m62366a(59);
        }
        if (collection == null) {
            m62366a(60);
        }
        if (if0 == null) {
            m62366a(61);
        }
        if (jj4 == null) {
            m62366a(62);
        }
        ArrayList arrayList = new ArrayList(collection.size());
        w46 e = w46.m73463e();
        for (CallableMemberDescriptor callableMemberDescriptor2 : collection) {
            OverrideCompatibilityInfo.Result c = mo55050D(callableMemberDescriptor2, callableMemberDescriptor, if0).mo55056c();
            boolean I = m62362I(callableMemberDescriptor, callableMemberDescriptor2, false);
            int i = C7659h.f40085b[c.ordinal()];
            if (i == 1) {
                if (I) {
                    e.add(callableMemberDescriptor2);
                }
                arrayList.add(callableMemberDescriptor2);
            } else if (i == 2) {
                if (I) {
                    jj4.mo52729c(callableMemberDescriptor2, callableMemberDescriptor);
                }
                arrayList.add(callableMemberDescriptor2);
            }
        }
        jj4.mo50136d(callableMemberDescriptor, e);
        return arrayList;
    }

    /* renamed from: v */
    public void mo55055v(r24 r24, Collection<? extends CallableMemberDescriptor> collection, Collection<? extends CallableMemberDescriptor> collection2, if0 if0, jj4 jj4) {
        if (r24 == null) {
            m62366a(52);
        }
        if (collection == null) {
            m62366a(53);
        }
        if (collection2 == null) {
            m62366a(54);
        }
        if (if0 == null) {
            m62366a(55);
        }
        if (jj4 == null) {
            m62366a(56);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        for (CallableMemberDescriptor o : collection2) {
            linkedHashSet.removeAll(mo55054o(o, collection, if0, jj4));
        }
        m62376k(if0, linkedHashSet, jj4);
    }
}
