package p000;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.builtins.C7387a;
import kotlin.reflect.jvm.internal.impl.builtins.C7389b;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;

/* renamed from: mr1 */
/* compiled from: ErrorTypeConstructor.kt */
public final class mr1 implements yz6 {

    /* renamed from: a */
    public final ErrorTypeKind f41002a;

    /* renamed from: b */
    public final String[] f41003b;

    /* renamed from: c */
    public final String f41004c;

    public mr1(ErrorTypeKind errorTypeKind, String... strArr) {
        vx2.m53591g(errorTypeKind, "kind");
        vx2.m53591g(strArr, "formatParams");
        this.f41002a = errorTypeKind;
        this.f41003b = strArr;
        String debugText = ErrorEntity.ERROR_TYPE.getDebugText();
        String debugMessage = errorTypeKind.getDebugMessage();
        Object[] copyOf = Arrays.copyOf(strArr, strArr.length);
        String format = String.format(debugMessage, Arrays.copyOf(copyOf, copyOf.length));
        vx2.m53590f(format, "format(this, *args)");
        String format2 = String.format(debugText, Arrays.copyOf(new Object[]{format}, 1));
        vx2.m53590f(format2, "format(this, *args)");
        this.f41004c = format2;
    }

    /* renamed from: a */
    public yz6 mo51808a(bd3 bd3) {
        vx2.m53591g(bd3, "kotlinTypeRefiner");
        return this;
    }

    /* renamed from: d */
    public eg0 mo51180d() {
        return nr1.f43548a.mo62788h();
    }

    /* renamed from: e */
    public boolean mo51809e() {
        return false;
    }

    /* renamed from: f */
    public final ErrorTypeKind mo56318f() {
        return this.f41002a;
    }

    /* renamed from: g */
    public Collection<xc3> mo51811g() {
        return ck0.m33062j();
    }

    public List<a17> getParameters() {
        return ck0.m33062j();
    }

    /* renamed from: h */
    public final String mo56319h(int i) {
        return this.f41003b[i];
    }

    /* renamed from: k */
    public C7389b mo51813k() {
        return C7387a.f39079h.mo53142a();
    }

    public String toString() {
        return this.f41004c;
    }
}
