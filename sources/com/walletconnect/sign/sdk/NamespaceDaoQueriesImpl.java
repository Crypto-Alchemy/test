package com.walletconnect.sign.sdk;

import com.squareup.sqldelight.C5463a;
import java.util.List;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0002,-B\u0017\u0012\u0006\u0010\u001c\u001a\u00020\u0019\u0012\u0006\u0010 \u001a\u00020\u001d¢\u0006\u0004\b*\u0010+JX\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\b\b\u0000\u0010\u0004*\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u000526\u0010\n\u001a2\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\t\u0012\u0004\u0012\u00028\u00000\u0007H\u0016J\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000b2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\bH\u0016JJ\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\t2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\t2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\t2\u0006\u0010\u0015\u001a\u00020\u0005H\u0016J\u0010\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\bH\u0016R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR$\u0010&\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0!8\u0000X\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R$\u0010)\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0!8\u0000X\u0004¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b(\u0010%¨\u0006."}, mo44877d2 = {"Lcom/walletconnect/sign/sdk/NamespaceDaoQueriesImpl;", "Lcom/squareup/sqldelight/a;", "Lb34;", "", "T", "", "session_id", "Lkotlin/Function4;", "", "", "mapper", "Lrz4;", "c0", "value", "topic", "", "s", "key", "accounts", "methods", "events", "request_id", "Lr37;", "N", "V", "Lf16;", "d", "Lf16;", "database", "Lm76;", "e", "Lm76;", "driver", "", "f", "Ljava/util/List;", "j0", "()Ljava/util/List;", "getNamespaces", "g", "k0", "isUpdateNamespaceRequestValid", "<init>", "(Lf16;Lm76;)V", "GetNamespacesQuery", "IsUpdateNamespaceRequestValidQuery", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: SignDatabaseImpl.kt */
public final class NamespaceDaoQueriesImpl extends C5463a implements b34 {

    /* renamed from: d */
    public final f16 f27769d;

    /* renamed from: e */
    public final m76 f27770e;

    /* renamed from: f */
    public final List<rz4<?>> f27771f = fe2.m44300a();

    /* renamed from: g */
    public final List<rz4<?>> f27772g = fe2.m44300a();

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B#\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0012"}, mo44877d2 = {"Lcom/walletconnect/sign/sdk/NamespaceDaoQueriesImpl$GetNamespacesQuery;", "", "T", "Lrz4;", "Ll76;", "a", "", "toString", "", "e", "J", "g", "()J", "session_id", "Lkotlin/Function1;", "mapper", "<init>", "(Lcom/walletconnect/sign/sdk/NamespaceDaoQueriesImpl;JLrc2;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* compiled from: SignDatabaseImpl.kt */
    public final class GetNamespacesQuery<T> extends rz4<T> {

        /* renamed from: e */
        public final long f27773e;

        /* renamed from: f */
        public final /* synthetic */ NamespaceDaoQueriesImpl f27774f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public GetNamespacesQuery(NamespaceDaoQueriesImpl namespaceDaoQueriesImpl, long j, rc2<? super l76, ? extends T> rc2) {
            super(namespaceDaoQueriesImpl.mo41388j0(), rc2);
            vx2.m53591g(rc2, "mapper");
            this.f27774f = namespaceDaoQueriesImpl;
            this.f27773e = j;
        }

        /* renamed from: a */
        public l76 mo40552a() {
            return this.f27774f.f27770e.mo39622r0(1840122212, "SELECT key, accounts, methods, events\nFROM NamespaceDao\nWHERE session_id = ?", 1, new NamespaceDaoQueriesImpl$GetNamespacesQuery$execute$1(this));
        }

        /* renamed from: g */
        public final long mo41390g() {
            return this.f27773e;
        }

        public String toString() {
            return "NamespaceDao.sq:getNamespaces";
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B+\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u0012\u001a\u00020\u0006\u0012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0012\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0017"}, mo44877d2 = {"Lcom/walletconnect/sign/sdk/NamespaceDaoQueriesImpl$IsUpdateNamespaceRequestValidQuery;", "", "T", "Lrz4;", "Ll76;", "a", "", "toString", "", "e", "J", "h", "()J", "value", "f", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "topic", "Lkotlin/Function1;", "mapper", "<init>", "(Lcom/walletconnect/sign/sdk/NamespaceDaoQueriesImpl;JLjava/lang/String;Lrc2;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* compiled from: SignDatabaseImpl.kt */
    public final class IsUpdateNamespaceRequestValidQuery<T> extends rz4<T> {

        /* renamed from: e */
        public final long f27775e;

        /* renamed from: f */
        public final String f27776f;

        /* renamed from: g */
        public final /* synthetic */ NamespaceDaoQueriesImpl f27777g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public IsUpdateNamespaceRequestValidQuery(NamespaceDaoQueriesImpl namespaceDaoQueriesImpl, long j, String str, rc2<? super l76, ? extends T> rc2) {
            super(namespaceDaoQueriesImpl.mo41389k0(), rc2);
            vx2.m53591g(str, "topic");
            vx2.m53591g(rc2, "mapper");
            this.f27777g = namespaceDaoQueriesImpl;
            this.f27775e = j;
            this.f27776f = str;
        }

        /* renamed from: a */
        public l76 mo40552a() {
            return this.f27777g.f27770e.mo39622r0(884688331, "SELECT ? >= (request_id / 1000)\nFROM NamespaceDao\nWHERE session_id = (\n    SELECT id\n    FROM SessionDao\n    WHERE topic = ?\n)", 2, new C5678x8e7eb26(this));
        }

        /* renamed from: g */
        public final String mo41392g() {
            return this.f27776f;
        }

        /* renamed from: h */
        public final long mo41393h() {
            return this.f27775e;
        }

        public String toString() {
            return "NamespaceDao.sq:isUpdateNamespaceRequestValid";
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NamespaceDaoQueriesImpl(f16 f16, m76 m76) {
        super(m76);
        vx2.m53591g(f16, "database");
        vx2.m53591g(m76, "driver");
        this.f27769d = f16;
        this.f27770e = m76;
    }

    /* renamed from: N */
    public void mo29443N(long j, String str, List<String> list, List<String> list2, List<String> list3, long j2) {
        String str2 = str;
        vx2.m53591g(str2, "key");
        List<String> list4 = list;
        vx2.m53591g(list4, "accounts");
        List<String> list5 = list2;
        vx2.m53591g(list5, "methods");
        List<String> list6 = list3;
        vx2.m53591g(list6, "events");
        this.f27770e.mo39621m1(-941578383, "INSERT OR ABORT INTO NamespaceDao(session_id, key, accounts, methods, events, request_id)\nVALUES (?, ?, ?, ?, ?, ?)", 6, new NamespaceDaoQueriesImpl$insertOrAbortNamespace$1(j, str2, this, list4, list5, list6, j2));
        mo39604f0(-941578383, new NamespaceDaoQueriesImpl$insertOrAbortNamespace$2(this));
    }

    /* renamed from: V */
    public void mo29444V(String str) {
        vx2.m53591g(str, "topic");
        this.f27770e.mo39621m1(-966386037, "DELETE FROM NamespaceDao\nWHERE session_id = (\n   SELECT id\n   FROM SessionDao\n   WHERE topic = ?\n)", 1, new NamespaceDaoQueriesImpl$deleteNamespacesByTopic$1(str));
        mo39604f0(-966386037, new NamespaceDaoQueriesImpl$deleteNamespacesByTopic$2(this));
    }

    /* renamed from: c0 */
    public <T> rz4<T> mo29445c0(long j, kd2<? super String, ? super List<String>, ? super List<String>, ? super List<String>, ? extends T> kd2) {
        vx2.m53591g(kd2, "mapper");
        return new GetNamespacesQuery(this, j, new NamespaceDaoQueriesImpl$getNamespaces$1(kd2, this));
    }

    /* renamed from: j0 */
    public final List<rz4<?>> mo41388j0() {
        return this.f27771f;
    }

    /* renamed from: k0 */
    public final List<rz4<?>> mo41389k0() {
        return this.f27772g;
    }

    /* renamed from: s */
    public rz4<Boolean> mo29446s(long j, String str) {
        vx2.m53591g(str, "topic");
        return new IsUpdateNamespaceRequestValidQuery(this, j, str, NamespaceDaoQueriesImpl$isUpdateNamespaceRequestValid$1.INSTANCE);
    }
}
