package net.safemoon.androidwallet.mapper.token;

import androidx.lifecycle.LiveData;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import net.safemoon.androidwallet.common.TokenType;
import net.safemoon.androidwallet.model.token.abstraction.IToken;

@Metadata(mo44878k = 3, mo44879mv = {1, 7, 1}, mo44881xi = 48)
@v21(mo48631c = "net.safemoon.androidwallet.mapper.token.TokenDisplayModelMapper", mo48632f = "TokenDisplayModelMapper.kt", mo48633l = {45}, mo48634m = "map")
/* compiled from: TokenDisplayModelMapper.kt */
public final class TokenDisplayModelMapper$map$1 extends ContinuationImpl {
    public int I$0;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public Object L$6;
    public Object L$7;
    public Object L$8;
    public Object L$9;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ TokenDisplayModelMapper this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TokenDisplayModelMapper$map$1(TokenDisplayModelMapper tokenDisplayModelMapper, ns0<? super TokenDisplayModelMapper$map$1> ns0) {
        super(ns0);
        this.this$0 = tokenDisplayModelMapper;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo58178a((LiveData<List<IToken>>) null, (TokenType) null, this);
    }
}
