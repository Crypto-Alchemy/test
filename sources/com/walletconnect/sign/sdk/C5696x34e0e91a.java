package com.walletconnect.sign.sdk;

import com.walletconnect.sign.sdk.TempNamespaceDaoQueriesImpl;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\n\b\u0000\u0010\u0001 \u0001*\u00020\u0000*\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"", "T", "Lo76;", "Lr37;", "invoke", "(Lo76;)V", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* renamed from: com.walletconnect.sign.sdk.TempNamespaceDaoQueriesImpl$IsUpdateNamespaceRequestValidQuery$execute$1 */
/* compiled from: SignDatabaseImpl.kt */
public final class C5696x34e0e91a extends Lambda implements rc2<o76, r37> {
    public final /* synthetic */ TempNamespaceDaoQueriesImpl.IsUpdateNamespaceRequestValidQuery<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5696x34e0e91a(TempNamespaceDaoQueriesImpl.IsUpdateNamespaceRequestValidQuery<? extends T> isUpdateNamespaceRequestValidQuery) {
        super(1);
        this.this$0 = isUpdateNamespaceRequestValidQuery;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((o76) obj);
        return r37.f33317a;
    }

    public final void invoke(o76 o76) {
        vx2.m53591g(o76, "$this$executeQuery");
        o76.bindString(1, this.this$0.mo41482g());
        o76.mo39608b(2, Long.valueOf(this.this$0.mo41483h()));
    }
}