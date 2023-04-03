package p000;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, mo44877d2 = {"Ld17;", "Lo93;", "a", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: d17 */
/* compiled from: TypeParameterReference.kt */
public final class d17 implements o93 {

    /* renamed from: a */
    public static final C5724a f28010a = new C5724a((DefaultConstructorMarker) null);

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, mo44877d2 = {"Ld17$a;", "", "Lo93;", "typeParameter", "", "a", "<init>", "()V", "kotlin-stdlib"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: d17$a */
    /* compiled from: TypeParameterReference.kt */
    public static final class C5724a {

        @Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
        /* renamed from: d17$a$a */
        /* compiled from: TypeParameterReference.kt */
        public /* synthetic */ class C5725a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f28011a;

            /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
            static {
                /*
                    kotlin.reflect.KVariance[] r0 = kotlin.reflect.KVariance.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    kotlin.reflect.KVariance r1 = kotlin.reflect.KVariance.INVARIANT     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    kotlin.reflect.KVariance r1 = kotlin.reflect.KVariance.IN     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    kotlin.reflect.KVariance r1 = kotlin.reflect.KVariance.OUT     // Catch:{ NoSuchFieldError -> 0x0022 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                    r2 = 3
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
                L_0x0022:
                    f28011a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: p000.d17.C5724a.C5725a.<clinit>():void");
            }
        }

        public C5724a() {
        }

        public /* synthetic */ C5724a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final String mo41806a(o93 o93) {
            vx2.m53591g(o93, "typeParameter");
            StringBuilder sb = new StringBuilder();
            int i = C5725a.f28011a[o93.mo46361j().ordinal()];
            if (i == 2) {
                sb.append("in ");
            } else if (i == 3) {
                sb.append("out ");
            }
            sb.append(o93.getName());
            String sb2 = sb.toString();
            vx2.m53590f(sb2, "StringBuilder().apply(builderAction).toString()");
            return sb2;
        }
    }
}
