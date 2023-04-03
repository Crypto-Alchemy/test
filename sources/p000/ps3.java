package p000;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.descriptors.C7425c;
import p000.de0;

/* renamed from: ps3 */
/* compiled from: modifierChecks.kt */
public abstract class ps3 implements de0 {

    /* renamed from: a */
    public final String f44107a;

    /* renamed from: ps3$a */
    /* compiled from: modifierChecks.kt */
    public static final class C9193a extends ps3 {

        /* renamed from: b */
        public static final C9193a f44108b = new C9193a();

        public C9193a() {
            super("must be a member function", (DefaultConstructorMarker) null);
        }

        /* renamed from: b */
        public boolean mo51176b(C7425c cVar) {
            vx2.m53591g(cVar, "functionDescriptor");
            if (cVar.mo51311G() != null) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: ps3$b */
    /* compiled from: modifierChecks.kt */
    public static final class C9194b extends ps3 {

        /* renamed from: b */
        public static final C9194b f44109b = new C9194b();

        public C9194b() {
            super("must be a member or an extension function", (DefaultConstructorMarker) null);
        }

        /* renamed from: b */
        public boolean mo51176b(C7425c cVar) {
            vx2.m53591g(cVar, "functionDescriptor");
            if (cVar.mo51311G() == null && cVar.mo51315J() == null) {
                return false;
            }
            return true;
        }
    }

    public ps3(String str) {
        this.f44107a = str;
    }

    public /* synthetic */ ps3(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    /* renamed from: a */
    public String mo51175a(C7425c cVar) {
        return de0.C6971a.m56837a(this, cVar);
    }

    public String getDescription() {
        return this.f44107a;
    }
}
