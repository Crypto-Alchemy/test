package p000;

/* renamed from: ks */
/* compiled from: AttributeArrayOwner.kt */
public abstract class C7807ks<K, T> extends C9303s5<K, T> {

    /* renamed from: a */
    public C7913mq<T> f40526a;

    public C7807ks(C7913mq<T> mqVar) {
        vx2.m53591g(mqVar, "arrayMap");
        this.f40526a = mqVar;
    }

    /* renamed from: e */
    public final C7913mq<T> mo55772e() {
        return this.f40526a;
    }

    /* renamed from: k */
    public final void mo55773k(q83<? extends K> q83, T t) {
        vx2.m53591g(q83, "tClass");
        vx2.m53591g(t, "value");
        int d = mo65776j().mo55400d(q83);
        int e = this.f40526a.mo56310e();
        if (e != 0) {
            if (e == 1) {
                C7913mq<T> mqVar = this.f40526a;
                vx2.m53589e(mqVar, "null cannot be cast to non-null type org.jetbrains.kotlin.util.OneElementArrayMap<T of org.jetbrains.kotlin.util.AttributeArrayOwner>");
                wh4 wh4 = (wh4) mqVar;
                if (wh4.mo66705k() == d) {
                    this.f40526a = new wh4(t, d);
                    return;
                }
                C9003nq nqVar = new C9003nq();
                this.f40526a = nqVar;
                nqVar.mo56313j(wh4.mo66705k(), wh4.mo66706n());
            }
            this.f40526a.mo56313j(d, t);
            return;
        }
        this.f40526a = new wh4(t, d);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C7807ks() {
        /*
            r2 = this;
            po1 r0 = p000.po1.f44076a
            java.lang.String r1 = "null cannot be cast to non-null type org.jetbrains.kotlin.util.ArrayMap<T of org.jetbrains.kotlin.util.AttributeArrayOwner>"
            p000.vx2.m53589e(r0, r1)
            r2.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C7807ks.<init>():void");
    }
}
