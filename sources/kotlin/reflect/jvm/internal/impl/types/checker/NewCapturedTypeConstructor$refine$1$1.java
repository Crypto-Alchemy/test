package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Lambda;

/* compiled from: NewCapturedType.kt */
public final class NewCapturedTypeConstructor$refine$1$1 extends Lambda implements pc2<List<? extends w47>> {
    public final /* synthetic */ bd3 $kotlinTypeRefiner;
    public final /* synthetic */ NewCapturedTypeConstructor this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NewCapturedTypeConstructor$refine$1$1(NewCapturedTypeConstructor newCapturedTypeConstructor, bd3 bd3) {
        super(0);
        this.this$0 = newCapturedTypeConstructor;
        this.$kotlinTypeRefiner = bd3;
    }

    public final List<w47> invoke() {
        List<w47> h = this.this$0.mo51811g();
        bd3 bd3 = this.$kotlinTypeRefiner;
        ArrayList arrayList = new ArrayList(dk0.m43495u(h, 10));
        for (w47 M0 : h) {
            arrayList.add(M0.mo51138M0(bd3));
        }
        return arrayList;
    }
}
