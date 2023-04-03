package p000;

import kotlin.reflect.jvm.internal.impl.descriptors.C7420a;

/* renamed from: vx1 */
/* compiled from: ExtensionReceiver */
public class vx1 extends C9588x6 {

    /* renamed from: c */
    public final C7420a f45395c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vx1(C7420a aVar, xc3 xc3, j85 j85) {
        super(xc3, j85);
        if (aVar == null) {
            m73385b(0);
        }
        if (xc3 == null) {
            m73385b(1);
        }
        this.f45395c = aVar;
    }

    /* renamed from: b */
    public static /* synthetic */ void m73385b(int i) {
        String str = i != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[(i != 2 ? 3 : 2)];
        if (i == 1) {
            objArr[0] = "receiverType";
        } else if (i == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver";
        } else if (i != 3) {
            objArr[0] = "callableDescriptor";
        } else {
            objArr[0] = "newType";
        }
        if (i != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver";
        } else {
            objArr[1] = "getDeclarationDescriptor";
        }
        if (i != 2) {
            if (i != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "replaceType";
            }
        }
        String format = String.format(str, objArr);
        throw (i != 2 ? new IllegalArgumentException(format) : new IllegalStateException(format));
    }

    public String toString() {
        return getType() + ": Ext {" + this.f45395c + "}";
    }
}
