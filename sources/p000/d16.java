package p000;

import com.walletconnect.sign.client.SignProtocol;
import java.util.List;
import kotlin.Metadata;
import p000.a16;
import p000.b16;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ;\u0010\t\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u0004H\u0001J;\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u0004H\u0001J\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0001J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0011H\u0001J%\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00132\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u0004H\u0001J;\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00162\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u0004H\u0001J\u0011\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¨\u0006\u001e"}, mo44877d2 = {"Ld16;", "", "Lb16$a;", "approve", "Lkotlin/Function1;", "Lr37;", "onSuccess", "La16$c;", "onError", "a", "Lb16$b;", "disconnect", "b", "", "topic", "La16$f;", "c", "", "d", "Lb16$c;", "init", "e", "Lb16$d;", "response", "f", "Lo16;", "delegate", "g", "<init>", "()V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: d16 */
/* compiled from: SignClient.kt */
public final class d16 {

    /* renamed from: b */
    public static final d16 f28008b = new d16();

    /* renamed from: a */
    public final /* synthetic */ SignProtocol f28009a = SignProtocol.f27514b.mo40979a();

    /* renamed from: a */
    public void mo41799a(b16.C3871a aVar, rc2<? super b16.C3871a, r37> rc2, rc2<? super a16.C3780c, r37> rc22) {
        vx2.m53591g(aVar, "approve");
        vx2.m53591g(rc2, "onSuccess");
        vx2.m53591g(rc22, "onError");
        this.f28009a.mo40971b(aVar, rc2, rc22);
    }

    /* renamed from: b */
    public void mo41800b(b16.C3872b bVar, rc2<? super b16.C3872b, r37> rc2, rc2<? super a16.C3780c, r37> rc22) {
        vx2.m53591g(bVar, "disconnect");
        vx2.m53591g(rc2, "onSuccess");
        vx2.m53591g(rc22, "onError");
        this.f28009a.mo40973d(bVar, rc2, rc22);
    }

    /* renamed from: c */
    public a16.C3789f mo41801c(String str) {
        vx2.m53591g(str, "topic");
        return this.f28009a.mo40974e(str);
    }

    /* renamed from: d */
    public List<a16.C3789f> mo41802d() {
        return this.f28009a.mo40975f();
    }

    /* renamed from: e */
    public void mo41803e(b16.C3873c cVar, rc2<? super a16.C3780c, r37> rc2) {
        vx2.m53591g(cVar, ZendeskBlipsProvider.ACTION_CORE_INIT);
        vx2.m53591g(rc2, "onError");
        this.f28009a.mo40976g(cVar, rc2);
    }

    /* renamed from: f */
    public void mo41804f(b16.C3874d dVar, rc2<? super b16.C3874d, r37> rc2, rc2<? super a16.C3780c, r37> rc22) {
        vx2.m53591g(dVar, "response");
        vx2.m53591g(rc2, "onSuccess");
        vx2.m53591g(rc22, "onError");
        this.f28009a.mo40977h(dVar, rc2, rc22);
    }

    /* renamed from: g */
    public void mo41805g(o16 o16) {
        vx2.m53591g(o16, "delegate");
        this.f28009a.mo40978i(o16);
    }
}
