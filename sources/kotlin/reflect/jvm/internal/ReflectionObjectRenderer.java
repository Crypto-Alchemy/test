package kotlin.reflect.jvm.internal;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.reflect.KParameter;
import kotlin.reflect.jvm.internal.impl.descriptors.C7420a;
import kotlin.reflect.jvm.internal.impl.descriptors.C7425c;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0006J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0006J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rJ\u001a\u0010\u0015\u001a\u00020\u0014*\u00060\u0010j\u0002`\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002J\u0018\u0010\u0018\u001a\u00020\u0014*\u00060\u0010j\u0002`\u00112\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\u0010\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0016H\u0002R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001b¨\u0006\u001f"}, mo44877d2 = {"Lkotlin/reflect/jvm/internal/ReflectionObjectRenderer;", "", "Lfx4;", "descriptor", "", "g", "Lkotlin/reflect/jvm/internal/impl/descriptors/c;", "d", "invoke", "e", "Lkotlin/reflect/jvm/internal/KParameterImpl;", "parameter", "f", "Lxc3;", "type", "h", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "Lh85;", "receiver", "Lr37;", "a", "Lkotlin/reflect/jvm/internal/impl/descriptors/a;", "callable", "b", "c", "Lkotlin/reflect/jvm/internal/impl/renderer/DescriptorRenderer;", "Lkotlin/reflect/jvm/internal/impl/renderer/DescriptorRenderer;", "renderer", "<init>", "()V", "kotlin-reflection"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: ReflectionObjectRenderer.kt */
public final class ReflectionObjectRenderer {

    /* renamed from: a */
    public static final ReflectionObjectRenderer f39037a = new ReflectionObjectRenderer();

    /* renamed from: b */
    public static final DescriptorRenderer f39038b = DescriptorRenderer.f39992g;

    @Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
    /* renamed from: kotlin.reflect.jvm.internal.ReflectionObjectRenderer$a */
    /* compiled from: ReflectionObjectRenderer.kt */
    public /* synthetic */ class C7374a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f39039a;

        static {
            int[] iArr = new int[KParameter.Kind.values().length];
            iArr[KParameter.Kind.EXTENSION_RECEIVER.ordinal()] = 1;
            iArr[KParameter.Kind.INSTANCE.ordinal()] = 2;
            iArr[KParameter.Kind.VALUE.ordinal()] = 3;
            f39039a = iArr;
        }
    }

    /* renamed from: a */
    public final void mo53104a(StringBuilder sb, h85 h85) {
        if (h85 != null) {
            xc3 type = h85.getType();
            vx2.m53590f(type, "receiver.type");
            sb.append(mo53111h(type));
            sb.append(".");
        }
    }

    /* renamed from: b */
    public final void mo53105b(StringBuilder sb, C7420a aVar) {
        boolean z;
        h85 i = y67.m74279i(aVar);
        h85 J = aVar.mo51315J();
        mo53104a(sb, i);
        if (i == null || J == null) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            sb.append("(");
        }
        mo53104a(sb, J);
        if (z) {
            sb.append(")");
        }
    }

    /* renamed from: c */
    public final String mo53106c(C7420a aVar) {
        if (aVar instanceof fx4) {
            return mo53110g((fx4) aVar);
        }
        if (aVar instanceof C7425c) {
            return mo53107d((C7425c) aVar);
        }
        throw new IllegalStateException(("Illegal callable: " + aVar).toString());
    }

    /* renamed from: d */
    public final String mo53107d(C7425c cVar) {
        vx2.m53591g(cVar, "descriptor");
        StringBuilder sb = new StringBuilder();
        sb.append("fun ");
        ReflectionObjectRenderer reflectionObjectRenderer = f39037a;
        reflectionObjectRenderer.mo53105b(sb, cVar);
        DescriptorRenderer descriptorRenderer = f39038b;
        r24 name = cVar.getName();
        vx2.m53590f(name, "descriptor.name");
        sb.append(descriptorRenderer.mo54814v(name, true));
        List<n87> f = cVar.mo51763f();
        vx2.m53590f(f, "descriptor.valueParameters");
        CollectionsKt___CollectionsKt.m47336g0(f, sb, ", ", "(", ")", 0, (CharSequence) null, ReflectionObjectRenderer$renderFunction$1$1.INSTANCE, 48, (Object) null);
        sb.append(": ");
        xc3 returnType = cVar.getReturnType();
        vx2.m53588d(returnType);
        sb.append(reflectionObjectRenderer.mo53111h(returnType));
        String sb2 = sb.toString();
        vx2.m53590f(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* renamed from: e */
    public final String mo53108e(C7425c cVar) {
        vx2.m53591g(cVar, "invoke");
        StringBuilder sb = new StringBuilder();
        ReflectionObjectRenderer reflectionObjectRenderer = f39037a;
        reflectionObjectRenderer.mo53105b(sb, cVar);
        List<n87> f = cVar.mo51763f();
        vx2.m53590f(f, "invoke.valueParameters");
        CollectionsKt___CollectionsKt.m47336g0(f, sb, ", ", "(", ")", 0, (CharSequence) null, ReflectionObjectRenderer$renderLambda$1$1.INSTANCE, 48, (Object) null);
        sb.append(" -> ");
        xc3 returnType = cVar.getReturnType();
        vx2.m53588d(returnType);
        sb.append(reflectionObjectRenderer.mo53111h(returnType));
        String sb2 = sb.toString();
        vx2.m53590f(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* renamed from: f */
    public final String mo53109f(KParameterImpl kParameterImpl) {
        vx2.m53591g(kParameterImpl, "parameter");
        StringBuilder sb = new StringBuilder();
        int i = C7374a.f39039a[kParameterImpl.getKind().ordinal()];
        if (i == 1) {
            sb.append("extension receiver parameter");
        } else if (i == 2) {
            sb.append("instance parameter");
        } else if (i == 3) {
            sb.append("parameter #" + kParameterImpl.getIndex() + ' ' + kParameterImpl.getName());
        }
        sb.append(" of ");
        sb.append(f39037a.mo53106c(kParameterImpl.mo53066k().mo52984x()));
        String sb2 = sb.toString();
        vx2.m53590f(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* renamed from: g */
    public final String mo53110g(fx4 fx4) {
        String str;
        vx2.m53591g(fx4, "descriptor");
        StringBuilder sb = new StringBuilder();
        if (fx4.mo51761I()) {
            str = "var ";
        } else {
            str = "val ";
        }
        sb.append(str);
        ReflectionObjectRenderer reflectionObjectRenderer = f39037a;
        reflectionObjectRenderer.mo53105b(sb, fx4);
        DescriptorRenderer descriptorRenderer = f39038b;
        r24 name = fx4.getName();
        vx2.m53590f(name, "descriptor.name");
        sb.append(descriptorRenderer.mo54814v(name, true));
        sb.append(": ");
        xc3 type = fx4.getType();
        vx2.m53590f(type, "descriptor.type");
        sb.append(reflectionObjectRenderer.mo53111h(type));
        String sb2 = sb.toString();
        vx2.m53590f(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* renamed from: h */
    public final String mo53111h(xc3 xc3) {
        vx2.m53591g(xc3, "type");
        return f39038b.mo54815w(xc3);
    }
}
