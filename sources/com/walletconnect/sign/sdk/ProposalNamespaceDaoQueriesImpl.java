package com.walletconnect.sign.sdk;

import com.squareup.sqldelight.C5463a;
import java.util.List;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001%B\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0006\u0010\u001c\u001a\u00020\u0019¢\u0006\u0004\b#\u0010$JX\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\b\b\u0000\u0010\u0004*\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u000526\u0010\n\u001a2\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\t\u0012\u0004\u0012\u00028\u00000\u0007H\u0016JB\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\t2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\tH\u0016J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\bH\u0016R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR$\u0010\"\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0\u001d8\u0000X\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006&"}, mo44877d2 = {"Lcom/walletconnect/sign/sdk/ProposalNamespaceDaoQueriesImpl;", "Lcom/squareup/sqldelight/a;", "Lrx4;", "", "T", "", "session_id", "Lkotlin/Function4;", "", "", "mapper", "Lrz4;", "W", "key", "chains", "methods", "events", "Lr37;", "q", "topic", "C", "Lf16;", "d", "Lf16;", "database", "Lm76;", "e", "Lm76;", "driver", "", "f", "Ljava/util/List;", "j0", "()Ljava/util/List;", "getProposalNamespaces", "<init>", "(Lf16;Lm76;)V", "GetProposalNamespacesQuery", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: SignDatabaseImpl.kt */
public final class ProposalNamespaceDaoQueriesImpl extends C5463a implements rx4 {

    /* renamed from: d */
    public final f16 f27784d;

    /* renamed from: e */
    public final m76 f27785e;

    /* renamed from: f */
    public final List<rz4<?>> f27786f = fe2.m44300a();

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B#\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0012"}, mo44877d2 = {"Lcom/walletconnect/sign/sdk/ProposalNamespaceDaoQueriesImpl$GetProposalNamespacesQuery;", "", "T", "Lrz4;", "Ll76;", "a", "", "toString", "", "e", "J", "g", "()J", "session_id", "Lkotlin/Function1;", "mapper", "<init>", "(Lcom/walletconnect/sign/sdk/ProposalNamespaceDaoQueriesImpl;JLrc2;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* compiled from: SignDatabaseImpl.kt */
    public final class GetProposalNamespacesQuery<T> extends rz4<T> {

        /* renamed from: e */
        public final long f27787e;

        /* renamed from: f */
        public final /* synthetic */ ProposalNamespaceDaoQueriesImpl f27788f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public GetProposalNamespacesQuery(ProposalNamespaceDaoQueriesImpl proposalNamespaceDaoQueriesImpl, long j, rc2<? super l76, ? extends T> rc2) {
            super(proposalNamespaceDaoQueriesImpl.mo41411j0(), rc2);
            vx2.m53591g(rc2, "mapper");
            this.f27788f = proposalNamespaceDaoQueriesImpl;
            this.f27787e = j;
        }

        /* renamed from: a */
        public l76 mo40552a() {
            return this.f27788f.f27785e.mo39622r0(1349057010, "SELECT key, chains, methods, events\nFROM ProposalNamespaceDao\nWHERE session_id = ?", 1, new C5685xab17aaad(this));
        }

        /* renamed from: g */
        public final long mo41413g() {
            return this.f27787e;
        }

        public String toString() {
            return "ProposalNamespaceDao.sq:getProposalNamespaces";
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProposalNamespaceDaoQueriesImpl(f16 f16, m76 m76) {
        super(m76);
        vx2.m53591g(f16, "database");
        vx2.m53591g(m76, "driver");
        this.f27784d = f16;
        this.f27785e = m76;
    }

    /* renamed from: C */
    public void mo41409C(String str) {
        vx2.m53591g(str, "topic");
        this.f27785e.mo39621m1(-159069259, "DELETE FROM ProposalNamespaceDao\nWHERE session_id = (\n   SELECT id\n   FROM SessionDao\n   WHERE topic = ?\n)", 1, new C5686xee1b40a9(str));
        mo39604f0(-159069259, new C5687xee1b40aa(this));
    }

    /* renamed from: W */
    public <T> rz4<T> mo41410W(long j, kd2<? super String, ? super List<String>, ? super List<String>, ? super List<String>, ? extends T> kd2) {
        vx2.m53591g(kd2, "mapper");
        return new GetProposalNamespacesQuery(this, j, new ProposalNamespaceDaoQueriesImpl$getProposalNamespaces$1(kd2, this));
    }

    /* renamed from: j0 */
    public final List<rz4<?>> mo41411j0() {
        return this.f27786f;
    }

    /* renamed from: q */
    public void mo41412q(long j, String str, List<String> list, List<String> list2, List<String> list3) {
        String str2 = str;
        vx2.m53591g(str2, "key");
        List<String> list4 = list;
        vx2.m53591g(list4, "chains");
        List<String> list5 = list2;
        vx2.m53591g(list5, "methods");
        List<String> list6 = list3;
        vx2.m53591g(list6, "events");
        this.f27785e.mo39621m1(1627911715, "INSERT OR ABORT INTO ProposalNamespaceDao(session_id, key, chains, methods, events)\nVALUES (?, ?, ?, ?, ?)", 5, new ProposalNamespaceDaoQueriesImpl$insertOrAbortProposalNamespace$1(j, str2, this, list4, list5, list6));
        mo39604f0(1627911715, new ProposalNamespaceDaoQueriesImpl$insertOrAbortProposalNamespace$2(this));
    }
}
