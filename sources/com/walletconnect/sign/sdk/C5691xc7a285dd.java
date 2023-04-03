package com.walletconnect.sign.sdk;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo44877d2 = {"", "T", "Ll76;", "cursor", "invoke", "(Ll76;)Ljava/lang/Object;", "<anonymous>"}, mo44878k = 3, mo44879mv = {1, 7, 1})
/* renamed from: com.walletconnect.sign.sdk.ProposalNamespaceExtensionDaoQueriesImpl$getProposalNamespaceExtensionByKeyAndSessionId$1 */
/* compiled from: SignDatabaseImpl.kt */
public final class C5691xc7a285dd extends Lambda implements rc2<l76, T> {
    public final /* synthetic */ id2<List<String>, List<String>, List<String>, T> $mapper;
    public final /* synthetic */ ProposalNamespaceExtensionDaoQueriesImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5691xc7a285dd(id2<? super List<String>, ? super List<String>, ? super List<String>, ? extends T> id2, ProposalNamespaceExtensionDaoQueriesImpl proposalNamespaceExtensionDaoQueriesImpl) {
        super(1);
        this.$mapper = id2;
        this.this$0 = proposalNamespaceExtensionDaoQueriesImpl;
    }

    public final T invoke(l76 l76) {
        vx2.m53591g(l76, "cursor");
        id2<List<String>, List<String>, List<String>, T> id2 = this.$mapper;
        hl0<List<String>, String> a = this.this$0.f27789d.mo42475o0().mo48258a();
        String string = l76.getString(0);
        vx2.m53588d(string);
        List<String> b = a.mo40237b(string);
        hl0<List<String>, String> c = this.this$0.f27789d.mo42475o0().mo48260c();
        String string2 = l76.getString(1);
        vx2.m53588d(string2);
        List<String> b2 = c.mo40237b(string2);
        hl0<List<String>, String> b3 = this.this$0.f27789d.mo42475o0().mo48259b();
        String string3 = l76.getString(2);
        vx2.m53588d(string3);
        return id2.invoke(b, b2, b3.mo40237b(string3));
    }
}
