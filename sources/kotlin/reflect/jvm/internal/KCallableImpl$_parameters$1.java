package kotlin.reflect.jvm.internal;

import java.util.ArrayList;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KParameter;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;

@Metadata(mo44876d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u0001\"\u0006\b\u0000\u0010\u0004 \u0001H\n¢\u0006\u0002\b\u0005"}, mo44877d2 = {"<anonymous>", "Ljava/util/ArrayList;", "Lkotlin/reflect/KParameter;", "kotlin.jvm.PlatformType", "R", "invoke"}, mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: KCallableImpl.kt */
public final class KCallableImpl$_parameters$1 extends Lambda implements pc2<ArrayList<KParameter>> {
    public final /* synthetic */ KCallableImpl<R> this$0;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo44877d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
    /* renamed from: kotlin.reflect.jvm.internal.KCallableImpl$_parameters$1$a */
    /* compiled from: Comparisons.kt */
    public static final class C7359a<T> implements Comparator {
        public final int compare(T t, T t2) {
            return xl0.m54426a(((KParameter) t).getName(), ((KParameter) t2).getName());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KCallableImpl$_parameters$1(KCallableImpl<? extends R> kCallableImpl) {
        super(0);
        this.this$0 = kCallableImpl;
    }

    public final ArrayList<KParameter> invoke() {
        int i;
        final CallableMemberDescriptor x = this.this$0.mo52984x();
        ArrayList<KParameter> arrayList = new ArrayList<>();
        final int i2 = 0;
        if (!this.this$0.mo52986z()) {
            final h85 i3 = y67.m74279i(x);
            if (i3 != null) {
                arrayList.add(new KParameterImpl(this.this$0, 0, KParameter.Kind.INSTANCE, new pc2<ql4>() {
                    public final ql4 invoke() {
                        return i3;
                    }
                }));
                i = 1;
            } else {
                i = 0;
            }
            final h85 J = x.mo51315J();
            if (J != null) {
                arrayList.add(new KParameterImpl(this.this$0, i, KParameter.Kind.EXTENSION_RECEIVER, new pc2<ql4>() {
                    public final ql4 invoke() {
                        return J;
                    }
                }));
                i++;
            }
        } else {
            i = 0;
        }
        int size = x.mo51763f().size();
        while (i2 < size) {
            arrayList.add(new KParameterImpl(this.this$0, i, KParameter.Kind.VALUE, new pc2<ql4>() {
                public final ql4 invoke() {
                    n87 n87 = x.mo51763f().get(i2);
                    vx2.m53590f(n87, "descriptor.valueParameters[i]");
                    return n87;
                }
            }));
            i2++;
            i++;
        }
        if (this.this$0.mo52985y() && (x instanceof o03) && arrayList.size() > 1) {
            gk0.m44738y(arrayList, new C7359a());
        }
        arrayList.trimToSize();
        return arrayList;
    }
}
