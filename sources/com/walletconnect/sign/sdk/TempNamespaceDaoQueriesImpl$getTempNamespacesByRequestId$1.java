package com.walletconnect.sign.sdk;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"", "T", "Ll76;", "cursor", "invoke", "(Ll76;)Ljava/lang/Object;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* compiled from: SignDatabaseImpl.kt */
public final class TempNamespaceDaoQueriesImpl$getTempNamespacesByRequestId$1 extends Lambda implements rc2<l76, T> {
    public final /* synthetic */ md2<Long, String, List<String>, List<String>, List<String>, T> $mapper;
    public final /* synthetic */ TempNamespaceDaoQueriesImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TempNamespaceDaoQueriesImpl$getTempNamespacesByRequestId$1(md2<? super Long, ? super String, ? super List<String>, ? super List<String>, ? super List<String>, ? extends T> md2, TempNamespaceDaoQueriesImpl tempNamespaceDaoQueriesImpl) {
        super(1);
        this.$mapper = md2;
        this.this$0 = tempNamespaceDaoQueriesImpl;
    }

    public final T invoke(l76 l76) {
        vx2.m53591g(l76, "cursor");
        md2<Long, String, List<String>, List<String>, List<String>, T> md2 = this.$mapper;
        Long l = l76.getLong(0);
        vx2.m53588d(l);
        String string = l76.getString(1);
        vx2.m53588d(string);
        hl0<List<String>, String> a = this.this$0.f27814d.mo42477q0().mo47840a();
        String string2 = l76.getString(2);
        vx2.m53588d(string2);
        List<String> b = a.mo40237b(string2);
        hl0<List<String>, String> c = this.this$0.f27814d.mo42477q0().mo47842c();
        String string3 = l76.getString(3);
        vx2.m53588d(string3);
        List<String> b2 = c.mo40237b(string3);
        hl0<List<String>, String> b3 = this.this$0.f27814d.mo42477q0().mo47841b();
        String string4 = l76.getString(4);
        vx2.m53588d(string4);
        return md2.invoke(l, string, b, b2, b3.mo40237b(string4));
    }
}
