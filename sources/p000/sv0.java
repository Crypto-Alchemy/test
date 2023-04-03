package p000;

import kotlin.Metadata;
import kotlin.reflect.jvm.internal.C7376b;
import kotlin.reflect.jvm.internal.C7378c;
import kotlin.reflect.jvm.internal.KCallableImpl;
import kotlin.reflect.jvm.internal.KDeclarationContainerImpl;
import kotlin.reflect.jvm.internal.KFunctionImpl;
import kotlin.reflect.jvm.internal.KMutableProperty0Impl;
import kotlin.reflect.jvm.internal.KMutableProperty1Impl;
import kotlin.reflect.jvm.internal.KProperty0Impl;
import kotlin.reflect.jvm.internal.KProperty1Impl;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.reflect.jvm.internal.impl.descriptors.C7425c;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u00002\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, mo44877d2 = {"Lsv0;", "Li31;", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "Lr37;", "Lkotlin/reflect/jvm/internal/impl/descriptors/c;", "descriptor", "data", "visitFunctionDescriptor", "(Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;Lr37;)Lkotlin/reflect/jvm/internal/KCallableImpl;", "Lfx4;", "visitPropertyDescriptor", "(Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;Lr37;)Lkotlin/reflect/jvm/internal/KCallableImpl;", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "a", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "container", "<init>", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;)V", "kotlin-reflection"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: sv0 */
/* compiled from: util.kt */
public class sv0 extends i31<KCallableImpl<?>, r37> {

    /* renamed from: a */
    public final KDeclarationContainerImpl f44611a;

    public sv0(KDeclarationContainerImpl kDeclarationContainerImpl) {
        vx2.m53591g(kDeclarationContainerImpl, "container");
        this.f44611a = kDeclarationContainerImpl;
    }

    /* renamed from: p */
    public KCallableImpl<?> mo52111i(C7425c cVar, r37 r37) {
        vx2.m53591g(cVar, "descriptor");
        vx2.m53591g(r37, "data");
        return new KFunctionImpl(this.f44611a, cVar);
    }

    /* renamed from: q */
    public KCallableImpl<?> mo52107e(fx4 fx4, r37 r37) {
        int i;
        vx2.m53591g(fx4, "descriptor");
        vx2.m53591g(r37, "data");
        int i2 = 0;
        if (fx4.mo51311G() != null) {
            i = 1;
        } else {
            i = 0;
        }
        if (fx4.mo51315J() != null) {
            i2 = 1;
        }
        int i3 = i + i2;
        if (fx4.mo51761I()) {
            if (i3 == 0) {
                return new KMutableProperty0Impl(this.f44611a, fx4);
            }
            if (i3 == 1) {
                return new KMutableProperty1Impl(this.f44611a, fx4);
            }
            if (i3 == 2) {
                return new C7376b(this.f44611a, fx4);
            }
        } else if (i3 == 0) {
            return new KProperty0Impl(this.f44611a, fx4);
        } else {
            if (i3 == 1) {
                return new KProperty1Impl(this.f44611a, fx4);
            }
            if (i3 == 2) {
                return new C7378c(this.f44611a, fx4);
            }
        }
        throw new KotlinReflectionInternalError("Unsupported property: " + fx4);
    }
}
