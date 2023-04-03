package com.walletconnect.utils;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;
import org.koin.core.scope.Scope;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, mo44877d2 = {"Lorg/koin/core/scope/Scope;", "Lul4;", "it", "Lkotlin/Pair;", "", "Lq83;", "invoke", "(Lorg/koin/core/scope/Scope;Lul4;)Lkotlin/Pair;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: UtilFunctions.kt */
public final class UtilFunctionsKt$addDeserializerEntry$1 extends Lambda implements fd2<Scope, ul4, Pair<? extends String, ? extends q83<?>>> {
    public final /* synthetic */ String $key;
    public final /* synthetic */ q83<?> $value;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UtilFunctionsKt$addDeserializerEntry$1(String str, q83<?> q83) {
        super(2);
        this.$key = str;
        this.$value = q83;
    }

    public final Pair<String, q83<?>> invoke(Scope scope, ul4 ul4) {
        vx2.m53591g(scope, "$this$single");
        vx2.m53591g(ul4, "it");
        return wy6.m54142a(this.$key, this.$value);
    }
}
