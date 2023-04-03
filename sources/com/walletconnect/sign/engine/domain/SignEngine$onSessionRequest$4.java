package com.walletconnect.sign.engine.domain;

import com.walletconnect.android.internal.common.model.AppMetaData;
import com.walletconnect.sign.common.model.p016vo.clientsync.session.params.SignParams;
import com.walletconnect.sign.engine.model.EngineDO;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo44877d2 = {"Lhu0;", "Lr37;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
@v21(mo48631c = "com.walletconnect.sign.engine.domain.SignEngine$onSessionRequest$4", mo48632f = "SignEngine.kt", mo48633l = {656}, mo48634m = "invokeSuspend")
/* compiled from: SignEngine.kt */
public final class SignEngine$onSessionRequest$4 extends SuspendLambda implements fd2<hu0, ns0<? super r37>, Object> {
    public final /* synthetic */ SignParams.SessionRequestParams $params;
    public final /* synthetic */ rf7 $request;
    public final /* synthetic */ AppMetaData $sessionPeerAppMetaData;
    public int label;
    public final /* synthetic */ SignEngine this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SignEngine$onSessionRequest$4(SignEngine signEngine, SignParams.SessionRequestParams sessionRequestParams, rf7 rf7, AppMetaData appMetaData, ns0<? super SignEngine$onSessionRequest$4> ns0) {
        super(2, ns0);
        this.this$0 = signEngine;
        this.$params = sessionRequestParams;
        this.$request = rf7;
        this.$sessionPeerAppMetaData = appMetaData;
    }

    public final ns0<r37> create(Object obj, ns0<?> ns0) {
        return new SignEngine$onSessionRequest$4(this.this$0, this.$params, this.$request, this.$sessionPeerAppMetaData, ns0);
    }

    public final Object invoke(hu0 hu0, ns0<? super r37> ns0) {
        return ((SignEngine$onSessionRequest$4) create(hu0, ns0)).invokeSuspend(r37.f33317a);
    }

    public final Object invokeSuspend(Object obj) {
        Object d = wx2.m54101d();
        int i = this.label;
        if (i == 0) {
            hg5.m45199b(obj);
            r04 k = this.this$0.f27669m;
            EngineDO.C5669l h = gq1.m44825h(this.$params, this.$request, this.$sessionPeerAppMetaData);
            this.label = 1;
            if (k.emit(h, this) == d) {
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
