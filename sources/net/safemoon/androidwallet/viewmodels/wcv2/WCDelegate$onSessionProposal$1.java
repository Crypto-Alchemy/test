package net.safemoon.androidwallet.viewmodels.wcv2;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.hg7;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "net.safemoon.androidwallet.viewmodels.wcv2.WCDelegate$onSessionProposal$1", mo48632f = "WCDelegate.kt", mo48633l = {68}, mo48634m = "invokeSuspend")
/* compiled from: WCDelegate.kt */
public final class WCDelegate$onSessionProposal$1 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public final /* synthetic */ hg7.C5914i $sessionProposal;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WCDelegate$onSessionProposal$1(hg7.C5914i iVar, ns0<? super WCDelegate$onSessionProposal$1> ns0) {
        super(2, ns0);
        this.$sessionProposal = iVar;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        return new WCDelegate$onSessionProposal$1(this.$sessionProposal, ns0);
    }

    public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
        return ((WCDelegate$onSessionProposal$1) create(hu0, ns0)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d = wx2.m54101d();
        int i = this.label;
        if (i == 0) {
            hg5.m45199b(obj);
            r04 k = WCDelegate.f43178e;
            hg7.C5914i iVar = this.$sessionProposal;
            this.label = 1;
            if (k.emit(iVar, this) == d) {
                return d;
            }
        } else if (i == 1) {
            hg5.m45199b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return r37.f33317a;
    }
}
