package kotlin.reflect.jvm.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"Ln87;", "kotlin.jvm.PlatformType", "it", "", "invoke", "(Ln87;)Ljava/lang/CharSequence;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: ReflectionObjectRenderer.kt */
public final class ReflectionObjectRenderer$renderLambda$1$1 extends Lambda implements rc2<n87, CharSequence> {
    public static final ReflectionObjectRenderer$renderLambda$1$1 INSTANCE = new ReflectionObjectRenderer$renderLambda$1$1();

    public ReflectionObjectRenderer$renderLambda$1$1() {
        super(1);
    }

    public final CharSequence invoke(n87 n87) {
        ReflectionObjectRenderer reflectionObjectRenderer = ReflectionObjectRenderer.f39037a;
        xc3 type = n87.getType();
        vx2.m53590f(type, "it.type");
        return reflectionObjectRenderer.mo53111h(type);
    }
}
