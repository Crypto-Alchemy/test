package com.walletconnect.foundation.network;

import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import com.walletconnect.foundation.network.model.RelayDTO;
import com.walletconnect.foundation.network.model.RelayDTO$Subscription$Result$Acknowledgement;
import com.walletconnect.foundation.p015di.FoundationCommonModuleKt;
import kotlin.C6169a;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineStart;
import p000.ec5;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000 72\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b5\u00106J=\u0010\f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0018\u0010\u000b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0004\u0012\u00020\n0\u0007H\u0017ø\u0001\u0000J-\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0018\u0010\u000b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\b\u0012\u0004\u0012\u00020\n0\u0007H\u0017ø\u0001\u0000J5\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0018\u0010\u000b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\b\u0012\u0004\u0012\u00020\n0\u0007H\u0017ø\u0001\u0000J%\u0010\u0012\u001a\u00020\n2\u0018\u0010\u000b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0004\u0012\u00020\n0\u0007H\u0003ø\u0001\u0000J%\u0010\u0013\u001a\u00020\n2\u0018\u0010\u000b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\b\u0012\u0004\u0012\u00020\n0\u0007H\u0003ø\u0001\u0000J%\u0010\u0014\u001a\u00020\n2\u0018\u0010\u000b\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\b\u0012\u0004\u0012\u00020\n0\u0007H\u0003ø\u0001\u0000J\u0010\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\"\u0010#\u001a\u00020\u001c8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010*\u001a\u00020$8\u0004@\u0004X\u000e¢\u0006\u0012\n\u0004\b\f\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R!\u00100\u001a\b\u0012\u0004\u0012\u00020,0+8VX\u0002¢\u0006\f\n\u0004\b\u000e\u0010-\u001a\u0004\b.\u0010/R!\u00104\u001a\b\u0012\u0004\u0012\u000202018VX\u0002¢\u0006\f\n\u0004\b\u0011\u0010-\u001a\u0004\b\u001d\u00103\u0002\u0004\n\u0002\b\u0019¨\u00068"}, mo44877d2 = {"Lcom/walletconnect/foundation/network/BaseRelayClient;", "Lgc5;", "", "topic", "message", "Lec5$c;", "params", "Lkotlin/Function1;", "Lkotlin/Result;", "Lec5$a$a$a;", "Lr37;", "onResult", "c", "Lec5$a$b$a;", "d", "subscriptionId", "Lec5$a$d$a;", "e", "j", "k", "l", "", "id", "m", "Lgc3;", "a", "Lgc3;", "foundationKoinApp", "Lic5;", "b", "Lic5;", "i", "()Lic5;", "o", "(Lic5;)V", "relayService", "Lsk3;", "Lsk3;", "h", "()Lsk3;", "n", "(Lsk3;)V", "logger", "Lxz5;", "Lec5$b;", "Lef3;", "g", "()Lxz5;", "eventsFlow", "Lz42;", "Lec5$a$c$a;", "()Lz42;", "subscriptionRequest", "<init>", "()V", "f", "foundation"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: BaseRelayClient.kt */
public abstract class BaseRelayClient implements gc5 {

    /* renamed from: f */
    public static final C5602a f27363f = new C5602a((DefaultConstructorMarker) null);

    /* renamed from: a */
    public gc3 f27364a;

    /* renamed from: b */
    public ic5 f27365b;

    /* renamed from: c */
    public sk3 f27366c = ((sk3) this.f27364a.mo51892b().mo51636g().mo56284d().mo64988f(ua5.m52727b(sk3.class), (oz4) null, (pc2<? extends ul4>) null));

    /* renamed from: d */
    public final ef3 f27367d = C6169a.m47232a(new BaseRelayClient$eventsFlow$2(this));

    /* renamed from: e */
    public final ef3 f27368e = C6169a.m47232a(new BaseRelayClient$subscriptionRequest$2(this));

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, mo44877d2 = {"Lcom/walletconnect/foundation/network/BaseRelayClient$a;", "", "", "REPLAY", "I", "<init>", "()V", "foundation"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: com.walletconnect.foundation.network.BaseRelayClient$a */
    /* compiled from: BaseRelayClient.kt */
    public static final class C5602a {
        public C5602a() {
        }

        public /* synthetic */ C5602a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public BaseRelayClient() {
        gc3 a = gc3.f38004c.mo51897a();
        this.f27364a = a;
        a.mo51894d(FoundationCommonModuleKt.m42484a());
    }

    /* renamed from: b */
    public z42<ec5.C5764a.C5769c.C5770a> mo40730b() {
        return (z42) this.f27368e.getValue();
    }

    /* renamed from: c */
    public void mo40731c(String str, String str2, ec5.C5781c cVar, rc2<? super Result<ec5.C5764a.C5765a.C5766a>, r37> rc2) {
        String str3 = str;
        rc2<? super Result<ec5.C5764a.C5765a.C5766a>, r37> rc22 = rc2;
        vx2.m53591g(str3, "topic");
        String str4 = str2;
        vx2.m53591g(str4, ThrowableDeserializer.PROP_NAME_MESSAGE);
        vx2.m53591g(cVar, "params");
        vx2.m53591g(rc22, "onResult");
        RelayDTO.Publish.Request request = new RelayDTO.Publish.Request(x67.m54246b(), (String) null, (String) null, new RelayDTO.Publish.Request.Params(new es6(str3), str4, new ky6(cVar.mo42258b()), cVar.mo42257a(), Boolean.valueOf(cVar.mo42259c())), 6, (DefaultConstructorMarker) null);
        mo40737j(rc22);
        mo40736i().mo43559j(request);
    }

    /* renamed from: d */
    public void mo40732d(String str, rc2<? super Result<ec5.C5764a.C5767b.C5768a>, r37> rc2) {
        vx2.m53591g(str, "topic");
        vx2.m53591g(rc2, "onResult");
        RelayDTO.Subscribe.Request request = new RelayDTO.Subscribe.Request(x67.m54246b(), (String) null, (String) null, new RelayDTO.Subscribe.Request.Params(new es6(str)), 6, (DefaultConstructorMarker) null);
        mo40738k(rc2);
        mo40736i().mo43550a(request);
    }

    /* renamed from: e */
    public void mo40733e(String str, String str2, rc2<? super Result<ec5.C5764a.C5773d.C5774a>, r37> rc2) {
        vx2.m53591g(str, "topic");
        vx2.m53591g(str2, "subscriptionId");
        vx2.m53591g(rc2, "onResult");
        RelayDTO.Unsubscribe.Request request = new RelayDTO.Unsubscribe.Request(x67.m54246b(), (String) null, (String) null, new RelayDTO.Unsubscribe.Request.Params(new es6(str), new sc6(str2)), 6, (DefaultConstructorMarker) null);
        mo40739l(rc2);
        mo40736i().mo43558i(request);
    }

    /* renamed from: g */
    public xz5<ec5.C5775b> mo40734g() {
        return (xz5) this.f27367d.getValue();
    }

    /* renamed from: h */
    public final sk3 mo40735h() {
        return this.f27366c;
    }

    /* renamed from: i */
    public final ic5 mo40736i() {
        ic5 ic5 = this.f27365b;
        if (ic5 != null) {
            return ic5;
        }
        vx2.m53605u("relayService");
        return null;
    }

    /* renamed from: j */
    public final void mo40737j(rc2<? super Result<ec5.C5764a.C5765a.C5766a>, r37> rc2) {
        y23 unused = d50.m56748b(ln5.m47865a(), (CoroutineContext) null, (CoroutineStart) null, new BaseRelayClient$observePublishResult$1(this, rc2, (ns0<? super BaseRelayClient$observePublishResult$1>) null), 3, (Object) null);
    }

    /* renamed from: k */
    public final void mo40738k(rc2<? super Result<ec5.C5764a.C5767b.C5768a>, r37> rc2) {
        y23 unused = d50.m56748b(ln5.m47865a(), (CoroutineContext) null, (CoroutineStart) null, new BaseRelayClient$observeSubscribeResult$1(this, rc2, (ns0<? super BaseRelayClient$observeSubscribeResult$1>) null), 3, (Object) null);
    }

    /* renamed from: l */
    public final void mo40739l(rc2<? super Result<ec5.C5764a.C5773d.C5774a>, r37> rc2) {
        y23 unused = d50.m56748b(ln5.m47865a(), (CoroutineContext) null, (CoroutineStart) null, new BaseRelayClient$observeUnsubscribeResult$1(this, rc2, (ns0<? super BaseRelayClient$observeUnsubscribeResult$1>) null), 3, (Object) null);
    }

    /* renamed from: m */
    public final void mo40740m(long j) {
        mo40736i().mo43552c(new RelayDTO$Subscription$Result$Acknowledgement(j, (String) null, true, 2, (DefaultConstructorMarker) null));
    }

    /* renamed from: n */
    public final void mo40741n(sk3 sk3) {
        vx2.m53591g(sk3, "<set-?>");
        this.f27366c = sk3;
    }

    /* renamed from: o */
    public final void mo40742o(ic5 ic5) {
        vx2.m53591g(ic5, "<set-?>");
        this.f27365b = ic5;
    }
}
