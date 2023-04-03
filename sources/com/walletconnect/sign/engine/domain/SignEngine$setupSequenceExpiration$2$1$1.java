package com.walletconnect.sign.engine.domain;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo44877d2 = {"Lr37;", "invoke", "()V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: SignEngine.kt */
public final class SignEngine$setupSequenceExpiration$2$1$1 extends Lambda implements pc2<r37> {
    public final /* synthetic */ String $sessionTopic;
    public final /* synthetic */ SignEngine this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SignEngine$setupSequenceExpiration$2$1$1(SignEngine signEngine, String str) {
        super(0);
        this.this$0 = signEngine;
        this.$sessionTopic = str;
    }

    public final void invoke() {
        this.this$0.f27660d.mo41508k(new es6(this.$sessionTopic));
        this.this$0.f27659c.mo47352a(this.$sessionTopic);
    }
}
