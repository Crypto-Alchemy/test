package kotlin.reflect.jvm.internal.impl.resolve.constants;

import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* compiled from: IntegerLiteralTypeConstructor.kt */
public final class IntegerLiteralTypeConstructor$supertypes$2 extends Lambda implements pc2<List<d36>> {
    public final /* synthetic */ IntegerLiteralTypeConstructor this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IntegerLiteralTypeConstructor$supertypes$2(IntegerLiteralTypeConstructor integerLiteralTypeConstructor) {
        super(0);
        this.this$0 = integerLiteralTypeConstructor;
    }

    public final List<d36> invoke() {
        d36 n = this.this$0.mo51813k().mo53184x().mo51464n();
        vx2.m53590f(n, "builtIns.comparable.defaultType");
        List<d36> p = ck0.m33068p(q17.m71170f(n, bk0.m32598e(new h17(Variance.IN_VARIANCE, this.this$0.f40093d)), (rz6) null, 2, (Object) null));
        if (!this.this$0.mo55071n()) {
            p.add(this.this$0.mo51813k().mo53154L());
        }
        return p;
    }
}
