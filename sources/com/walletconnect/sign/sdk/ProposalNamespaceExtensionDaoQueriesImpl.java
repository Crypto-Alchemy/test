package com.walletconnect.sign.sdk;

import com.squareup.sqldelight.C5463a;
import java.util.List;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001%B\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0006\u0010\u001c\u001a\u00020\u0019¢\u0006\u0004\b#\u0010$JZ\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\b\b\u0000\u0010\u0004*\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u000720\u0010\u000b\u001a,\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n\u0012\u0004\u0012\u00028\u00000\tH\u0016JB\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\n2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\nH\u0016J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0005H\u0016R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR$\u0010\"\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f0\u001d8\u0000X\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006&"}, mo44877d2 = {"Lcom/walletconnect/sign/sdk/ProposalNamespaceExtensionDaoQueriesImpl;", "Lcom/squareup/sqldelight/a;", "Lsx4;", "", "T", "", "namespace_key", "", "session_id", "Lkotlin/Function3;", "", "mapper", "Lrz4;", "A", "chains", "methods", "events", "Lr37;", "u", "topic", "x", "Lf16;", "d", "Lf16;", "database", "Lm76;", "e", "Lm76;", "driver", "", "f", "Ljava/util/List;", "j0", "()Ljava/util/List;", "getProposalNamespaceExtensionByKeyAndSessionId", "<init>", "(Lf16;Lm76;)V", "GetProposalNamespaceExtensionByKeyAndSessionIdQuery", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: SignDatabaseImpl.kt */
public final class ProposalNamespaceExtensionDaoQueriesImpl extends C5463a implements sx4 {

    /* renamed from: d */
    public final f16 f27789d;

    /* renamed from: e */
    public final m76 f27790e;

    /* renamed from: f */
    public final List<rz4<?>> f27791f = fe2.m44300a();

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B+\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\u0012\u001a\u00020\r\u0012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0017\u0010\f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0017"}, mo44877d2 = {"Lcom/walletconnect/sign/sdk/ProposalNamespaceExtensionDaoQueriesImpl$GetProposalNamespaceExtensionByKeyAndSessionIdQuery;", "", "T", "Lrz4;", "Ll76;", "a", "", "toString", "e", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "namespace_key", "", "f", "J", "h", "()J", "session_id", "Lkotlin/Function1;", "mapper", "<init>", "(Lcom/walletconnect/sign/sdk/ProposalNamespaceExtensionDaoQueriesImpl;Ljava/lang/String;JLrc2;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* compiled from: SignDatabaseImpl.kt */
    public final class GetProposalNamespaceExtensionByKeyAndSessionIdQuery<T> extends rz4<T> {

        /* renamed from: e */
        public final String f27792e;

        /* renamed from: f */
        public final long f27793f;

        /* renamed from: g */
        public final /* synthetic */ ProposalNamespaceExtensionDaoQueriesImpl f27794g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public GetProposalNamespaceExtensionByKeyAndSessionIdQuery(ProposalNamespaceExtensionDaoQueriesImpl proposalNamespaceExtensionDaoQueriesImpl, String str, long j, rc2<? super l76, ? extends T> rc2) {
            super(proposalNamespaceExtensionDaoQueriesImpl.mo41420j0(), rc2);
            vx2.m53591g(str, "namespace_key");
            vx2.m53591g(rc2, "mapper");
            this.f27794g = proposalNamespaceExtensionDaoQueriesImpl;
            this.f27792e = str;
            this.f27793f = j;
        }

        /* renamed from: a */
        public l76 mo40552a() {
            return this.f27794g.f27790e.mo39622r0(-1000167799, "SELECT chains, methods, events\nFROM ProposalNamespaceExtensionsDao\nWHERE namespace_key = ? AND session_id = ?", 2, new C5688xe1ce6256(this));
        }

        /* renamed from: g */
        public final String mo41423g() {
            return this.f27792e;
        }

        /* renamed from: h */
        public final long mo41424h() {
            return this.f27793f;
        }

        public String toString() {
            return "ProposalNamespaceExtensionDao.sq:getProposalNamespaceExtensionByKeyAndSessionId";
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProposalNamespaceExtensionDaoQueriesImpl(f16 f16, m76 m76) {
        super(m76);
        vx2.m53591g(f16, "database");
        vx2.m53591g(m76, "driver");
        this.f27789d = f16;
        this.f27790e = m76;
    }

    /* renamed from: A */
    public <T> rz4<T> mo41419A(String str, long j, id2<? super List<String>, ? super List<String>, ? super List<String>, ? extends T> id2) {
        vx2.m53591g(str, "namespace_key");
        vx2.m53591g(id2, "mapper");
        return new GetProposalNamespaceExtensionByKeyAndSessionIdQuery(this, str, j, new C5691xc7a285dd(id2, this));
    }

    /* renamed from: j0 */
    public final List<rz4<?>> mo41420j0() {
        return this.f27791f;
    }

    /* renamed from: u */
    public void mo41421u(String str, long j, List<String> list, List<String> list2, List<String> list3) {
        vx2.m53591g(str, "namespace_key");
        List<String> list4 = list;
        vx2.m53591g(list4, "chains");
        List<String> list5 = list2;
        vx2.m53591g(list5, "methods");
        List<String> list6 = list3;
        vx2.m53591g(list6, "events");
        this.f27790e.mo39621m1(1293571159, "INSERT OR ABORT INTO ProposalNamespaceExtensionsDao(namespace_key, session_id, chains, methods, events)\nVALUES (?, ?, ?, ?, ?)", 5, new C5692xa7204ffd(str, j, this, list4, list5, list6));
        mo39604f0(1293571159, new C5693xa7204ffe(this));
    }

    /* renamed from: x */
    public void mo41422x(String str) {
        vx2.m53591g(str, "topic");
        this.f27790e.mo39621m1(1047895292, "DELETE FROM ProposalNamespaceExtensionsDao\nWHERE session_id = (\n   SELECT id\n   FROM SessionDao\n   WHERE topic = ?\n)", 1, new C5689x3233122(str));
        mo39604f0(1047895292, new C5690x3233123(this));
    }
}
