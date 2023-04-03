package kotlin.reflect.jvm.internal;

import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;

@Metadata(mo44876d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, mo44877d2 = {"<anonymous>", "Ljava/lang/reflect/Type;", "invoke"}, mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* compiled from: KParameterImpl.kt */
public final class KParameterImpl$type$1 extends Lambda implements pc2<Type> {
    public final /* synthetic */ KParameterImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KParameterImpl$type$1(KParameterImpl kParameterImpl) {
        super(0);
        this.this$0 = kParameterImpl;
    }

    public final Type invoke() {
        ql4 j = this.this$0.mo53067n();
        if (!(j instanceof h85) || !vx2.m53586b(y67.m74279i(this.this$0.mo53066k().mo52984x()), j) || this.this$0.mo53066k().mo52984x().getKind() != CallableMemberDescriptor.Kind.FAKE_OVERRIDE) {
            return this.this$0.mo53066k().mo52981t().mo52786a().get(this.this$0.getIndex());
        }
        d31 b = this.this$0.mo53066k().mo52984x().mo51119b();
        vx2.m53589e(b, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        Class<?> p = y67.m74286p((if0) b);
        if (p != null) {
            return p;
        }
        throw new KotlinReflectionInternalError("Cannot determine receiver Java type of inherited declaration: " + j);
    }
}
