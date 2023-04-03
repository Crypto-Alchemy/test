package com.walletconnect.sign.sdk;

import com.squareup.sqldelight.C5463a;
import java.util.List;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001%B\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0015\u0012\u0006\u0010\u001c\u001a\u00020\u0019¢\u0006\u0004\b#\u0010$JZ\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\b\b\u0000\u0010\u0004*\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u000720\u0010\u000b\u001a,\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n\u0012\u0004\u0012\u00028\u00000\tH\u0016JB\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\n2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\n2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\nH\u0016J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0005H\u0016R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR$\u0010\"\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f0\u001d8\u0000X\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006&"}, mo44877d2 = {"Lcom/walletconnect/sign/sdk/NamespaceExtensionDaoQueriesImpl;", "Lcom/squareup/sqldelight/a;", "Lc34;", "", "T", "", "namespace_key", "", "session_id", "Lkotlin/Function3;", "", "mapper", "Lrz4;", "a", "accounts", "methods", "events", "Lr37;", "k", "topic", "H", "Lf16;", "d", "Lf16;", "database", "Lm76;", "e", "Lm76;", "driver", "", "f", "Ljava/util/List;", "j0", "()Ljava/util/List;", "getNamespaceExtensionByNamespaceKeyAndSessionId", "<init>", "(Lf16;Lm76;)V", "GetNamespaceExtensionByNamespaceKeyAndSessionIdQuery", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: SignDatabaseImpl.kt */
public final class NamespaceExtensionDaoQueriesImpl extends C5463a implements c34 {

    /* renamed from: d */
    public final f16 f27778d;

    /* renamed from: e */
    public final m76 f27779e;

    /* renamed from: f */
    public final List<rz4<?>> f27780f = fe2.m44300a();

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B+\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\u0012\u001a\u00020\r\u0012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0017\u0010\f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0017"}, mo44877d2 = {"Lcom/walletconnect/sign/sdk/NamespaceExtensionDaoQueriesImpl$GetNamespaceExtensionByNamespaceKeyAndSessionIdQuery;", "", "T", "Lrz4;", "Ll76;", "a", "", "toString", "e", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "namespace_key", "", "f", "J", "h", "()J", "session_id", "Lkotlin/Function1;", "mapper", "<init>", "(Lcom/walletconnect/sign/sdk/NamespaceExtensionDaoQueriesImpl;Ljava/lang/String;JLrc2;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* compiled from: SignDatabaseImpl.kt */
    public final class GetNamespaceExtensionByNamespaceKeyAndSessionIdQuery<T> extends rz4<T> {

        /* renamed from: e */
        public final String f27781e;

        /* renamed from: f */
        public final long f27782f;

        /* renamed from: g */
        public final /* synthetic */ NamespaceExtensionDaoQueriesImpl f27783g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public GetNamespaceExtensionByNamespaceKeyAndSessionIdQuery(NamespaceExtensionDaoQueriesImpl namespaceExtensionDaoQueriesImpl, String str, long j, rc2<? super l76, ? extends T> rc2) {
            super(namespaceExtensionDaoQueriesImpl.mo41401j0(), rc2);
            vx2.m53591g(str, "namespace_key");
            vx2.m53591g(rc2, "mapper");
            this.f27783g = namespaceExtensionDaoQueriesImpl;
            this.f27781e = str;
            this.f27782f = j;
        }

        /* renamed from: a */
        public l76 mo40552a() {
            return this.f27783g.f27779e.mo39622r0(-1157477000, "SELECT accounts, methods, events\nFROM NamespaceExtensionsDao\nWHERE namespace_key = ? AND session_id = ?", 2, new C5679xadb8f883(this));
        }

        /* renamed from: g */
        public final String mo41402g() {
            return this.f27781e;
        }

        /* renamed from: h */
        public final long mo41403h() {
            return this.f27782f;
        }

        public String toString() {
            return "NamespaceExtensionDao.sq:getNamespaceExtensionByNamespaceKeyAndSessionId";
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NamespaceExtensionDaoQueriesImpl(f16 f16, m76 m76) {
        super(m76);
        vx2.m53591g(f16, "database");
        vx2.m53591g(m76, "driver");
        this.f27778d = f16;
        this.f27779e = m76;
    }

    /* renamed from: H */
    public void mo29864H(String str) {
        vx2.m53591g(str, "topic");
        this.f27779e.mo39621m1(1014648778, "DELETE FROM NamespaceExtensionsDao\nWHERE session_id = (\n   SELECT id\n   FROM SessionDao\n   WHERE topic = ?\n)", 1, new C5680xe3ea13e2(str));
        mo39604f0(1014648778, new C5681xe3ea13e3(this));
    }

    /* renamed from: a */
    public <T> rz4<T> mo29865a(String str, long j, id2<? super List<String>, ? super List<String>, ? super List<String>, ? extends T> id2) {
        vx2.m53591g(str, "namespace_key");
        vx2.m53591g(id2, "mapper");
        return new GetNamespaceExtensionByNamespaceKeyAndSessionIdQuery(this, str, j, new C5682x5d1d6ed0(id2, this));
    }

    /* renamed from: j0 */
    public final List<rz4<?>> mo41401j0() {
        return this.f27780f;
    }

    /* renamed from: k */
    public void mo29866k(String str, long j, List<String> list, List<String> list2, List<String> list3) {
        vx2.m53591g(str, "namespace_key");
        List<String> list4 = list;
        vx2.m53591g(list4, "accounts");
        List<String> list5 = list2;
        vx2.m53591g(list5, "methods");
        List<String> list6 = list3;
        vx2.m53591g(list6, "events");
        this.f27779e.mo39621m1(952380481, "INSERT OR ABORT INTO NamespaceExtensionsDao(namespace_key, session_id, accounts, methods, events)\nVALUES (?, ?, ?, ?, ?)", 5, new C5683x584fb559(str, j, this, list4, list5, list6));
        mo39604f0(952380481, new C5684x584fb55a(this));
    }
}
