package kotlin.reflect.jvm.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KParameter;
import kotlin.reflect.jvm.internal.JvmFunctionSignature;
import kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u0012\u0012\u0002\b\u0003 \u0001*\b\u0012\u0002\b\u0003\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo44877d2 = {"Lu90;", "kotlin.jvm.PlatformType", "invoke", "()Lu90;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: KFunctionImpl.kt */
public final class KFunctionImpl$caller$2 extends Lambda implements pc2<u90<? extends Member>> {
    public final /* synthetic */ KFunctionImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KFunctionImpl$caller$2(KFunctionImpl kFunctionImpl) {
        super(0);
        this.this$0 = kFunctionImpl;
    }

    public final u90<Member> invoke() {
        Object obj;
        u90 u90;
        JvmFunctionSignature g = si5.f44568a.mo65862g(this.this$0.mo52984x());
        if (g instanceof JvmFunctionSignature.C7354b) {
            if (this.this$0.mo52985y()) {
                Class<?> k = this.this$0.mo52982v().mo41920k();
                List<KParameter> parameters = this.this$0.getParameters();
                ArrayList arrayList = new ArrayList(dk0.m43495u(parameters, 10));
                for (KParameter name : parameters) {
                    String name2 = name.getName();
                    vx2.m53588d(name2);
                    arrayList.add(name2);
                }
                return new AnnotationConstructorCaller(k, arrayList, AnnotationConstructorCaller.CallMode.POSITIONAL_CALL, AnnotationConstructorCaller.Origin.KOTLIN, (List) null, 16, (DefaultConstructorMarker) null);
            }
            obj = this.this$0.mo52982v().mo53023p(((JvmFunctionSignature.C7354b) g).mo52972b());
        } else if (g instanceof JvmFunctionSignature.C7355c) {
            JvmFunctionSignature.C7355c cVar = (JvmFunctionSignature.C7355c) g;
            obj = this.this$0.mo52982v().mo53027u(cVar.mo52974c(), cVar.mo52973b());
        } else if (g instanceof JvmFunctionSignature.C7353a) {
            obj = ((JvmFunctionSignature.C7353a) g).mo52971b();
        } else if (g instanceof JvmFunctionSignature.JavaConstructor) {
            obj = ((JvmFunctionSignature.JavaConstructor) g).mo52970b();
        } else if (g instanceof JvmFunctionSignature.FakeJavaAnnotationConstructor) {
            List<Method> b = ((JvmFunctionSignature.FakeJavaAnnotationConstructor) g).mo52968b();
            Class<?> k2 = this.this$0.mo52982v().mo41920k();
            ArrayList arrayList2 = new ArrayList(dk0.m43495u(b, 10));
            for (Method name3 : b) {
                arrayList2.add(name3.getName());
            }
            return new AnnotationConstructorCaller(k2, arrayList2, AnnotationConstructorCaller.CallMode.POSITIONAL_CALL, AnnotationConstructorCaller.Origin.JAVA, b);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        if (obj instanceof Constructor) {
            KFunctionImpl kFunctionImpl = this.this$0;
            u90 = kFunctionImpl.mo53038F((Constructor) obj, kFunctionImpl.mo52984x(), false);
        } else if (obj instanceof Method) {
            Method method = (Method) obj;
            if (!Modifier.isStatic(method.getModifiers())) {
                u90 = this.this$0.mo53039G(method);
            } else if (this.this$0.mo52984x().getAnnotations().mo51226x(y67.m74280j()) != null) {
                u90 = this.this$0.mo53040H(method);
            } else {
                u90 = this.this$0.mo53041I(method);
            }
        } else {
            throw new KotlinReflectionInternalError("Could not compute caller for function: " + this.this$0.mo52984x() + " (member = " + obj + ')');
        }
        return ku2.m63615c(u90, this.this$0.mo52984x(), false, 2, (Object) null);
    }
}
