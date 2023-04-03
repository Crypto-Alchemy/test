package p000;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.reflect.jvm.internal.impl.descriptors.C7425c;
import p000.de0;

/* renamed from: m87 */
/* compiled from: modifierChecks.kt */
public abstract class m87 implements de0 {

    /* renamed from: a */
    public final String f40804a;

    /* renamed from: m87$a */
    /* compiled from: modifierChecks.kt */
    public static final class C7866a extends m87 {

        /* renamed from: b */
        public final int f40805b;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C7866a(int r3) {
            /*
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "must have at least "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r1 = " value parameter"
                r0.append(r1)
                r1 = 1
                if (r3 <= r1) goto L_0x0018
                java.lang.String r1 = "s"
                goto L_0x001a
            L_0x0018:
                java.lang.String r1 = ""
            L_0x001a:
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r1 = 0
                r2.<init>(r0, r1)
                r2.f40805b = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.m87.C7866a.<init>(int):void");
        }

        /* renamed from: b */
        public boolean mo51176b(C7425c cVar) {
            vx2.m53591g(cVar, "functionDescriptor");
            if (cVar.mo51763f().size() >= this.f40805b) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: m87$b */
    /* compiled from: modifierChecks.kt */
    public static final class C7867b extends m87 {

        /* renamed from: b */
        public final int f40806b;

        public C7867b(int i) {
            super("must have exactly " + i + " value parameters", (DefaultConstructorMarker) null);
            this.f40806b = i;
        }

        /* renamed from: b */
        public boolean mo51176b(C7425c cVar) {
            vx2.m53591g(cVar, "functionDescriptor");
            if (cVar.mo51763f().size() == this.f40806b) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: m87$c */
    /* compiled from: modifierChecks.kt */
    public static final class C7868c extends m87 {

        /* renamed from: b */
        public static final C7868c f40807b = new C7868c();

        public C7868c() {
            super("must have no value parameters", (DefaultConstructorMarker) null);
        }

        /* renamed from: b */
        public boolean mo51176b(C7425c cVar) {
            vx2.m53591g(cVar, "functionDescriptor");
            return cVar.mo51763f().isEmpty();
        }
    }

    /* renamed from: m87$d */
    /* compiled from: modifierChecks.kt */
    public static final class C7869d extends m87 {

        /* renamed from: b */
        public static final C7869d f40808b = new C7869d();

        public C7869d() {
            super("must have a single value parameter", (DefaultConstructorMarker) null);
        }

        /* renamed from: b */
        public boolean mo51176b(C7425c cVar) {
            vx2.m53591g(cVar, "functionDescriptor");
            if (cVar.mo51763f().size() == 1) {
                return true;
            }
            return false;
        }
    }

    public m87(String str) {
        this.f40804a = str;
    }

    public /* synthetic */ m87(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    /* renamed from: a */
    public String mo51175a(C7425c cVar) {
        return de0.C6971a.m56837a(this, cVar);
    }

    public String getDescription() {
        return this.f40804a;
    }
}
