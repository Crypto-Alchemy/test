package kotlin.reflect.jvm.internal;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import kotlin.C6169a;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.types.Variance;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo44877d2 = {"", "Lq93;", "kotlin.jvm.PlatformType", "invoke", "()Ljava/util/List;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: KTypeImpl.kt */
public final class KTypeImpl$arguments$2 extends Lambda implements pc2<List<? extends q93>> {
    public final /* synthetic */ pc2<Type> $computeJavaType;
    public final /* synthetic */ KTypeImpl this$0;

    @Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* renamed from: kotlin.reflect.jvm.internal.KTypeImpl$arguments$2$a */
    /* compiled from: KTypeImpl.kt */
    public /* synthetic */ class C7372a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f39030a;

        static {
            int[] iArr = new int[Variance.values().length];
            iArr[Variance.INVARIANT.ordinal()] = 1;
            iArr[Variance.IN_VARIANCE.ordinal()] = 2;
            iArr[Variance.OUT_VARIANCE.ordinal()] = 3;
            f39030a = iArr;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KTypeImpl$arguments$2(KTypeImpl kTypeImpl, pc2<? extends Type> pc2) {
        super(0);
        this.this$0 = kTypeImpl;
        this.$computeJavaType = pc2;
    }

    /* renamed from: a */
    public static final List<Type> m60050a(ef3<? extends List<? extends Type>> ef3) {
        return (List) ef3.getValue();
    }

    public final List<q93> invoke() {
        q93 q93;
        List<f17> F0 = this.this$0.mo53096n().mo51132F0();
        if (F0.isEmpty()) {
            return ck0.m33062j();
        }
        ef3 b = C6169a.m47233b(LazyThreadSafetyMode.PUBLICATION, new KTypeImpl$arguments$2$parameterizedTypeArguments$2(this.this$0));
        pc2<Type> pc2 = this.$computeJavaType;
        KTypeImpl kTypeImpl = this.this$0;
        ArrayList arrayList = new ArrayList(dk0.m43495u(F0, 10));
        int i = 0;
        for (T next : F0) {
            int i2 = i + 1;
            if (i < 0) {
                ck0.m33072t();
            }
            f17 f17 = (f17) next;
            if (f17.mo51408b()) {
                q93 = q93.f33000c.mo47035c();
            } else {
                xc3 type = f17.getType();
                vx2.m53590f(type, "typeProjection.type");
                KTypeImpl kTypeImpl2 = new KTypeImpl(type, pc2 == null ? null : new KTypeImpl$arguments$2$1$type$1(kTypeImpl, i, b));
                int i3 = C7372a.f39030a[f17.mo51409c().ordinal()];
                if (i3 == 1) {
                    q93 = q93.f33000c.mo47036d(kTypeImpl2);
                } else if (i3 == 2) {
                    q93 = q93.f33000c.mo47033a(kTypeImpl2);
                } else if (i3 == 3) {
                    q93 = q93.f33000c.mo47034b(kTypeImpl2);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
            arrayList.add(q93);
            i = i2;
        }
        return arrayList;
    }
}
