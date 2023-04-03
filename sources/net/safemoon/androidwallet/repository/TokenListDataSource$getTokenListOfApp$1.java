package net.safemoon.androidwallet.repository;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
@v21(mo48631c = "net.safemoon.androidwallet.repository.TokenListDataSource", mo48632f = "TokenListDataSource.kt", mo48633l = {44, 84, 103, 106, 108}, mo48634m = "getTokenListOfApp")
/* compiled from: TokenListDataSource.kt */
public final class TokenListDataSource$getTokenListOfApp$1 extends ContinuationImpl {
    public int I$0;
    public int I$1;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ TokenListDataSource this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TokenListDataSource$getTokenListOfApp$1(TokenListDataSource tokenListDataSource, ns0<? super TokenListDataSource$getTokenListOfApp$1> ns0) {
        super(ns0);
        this.this$0 = tokenListDataSource;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo60763g((Integer) null, this);
    }
}
