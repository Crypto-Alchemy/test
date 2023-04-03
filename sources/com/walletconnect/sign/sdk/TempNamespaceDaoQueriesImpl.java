package com.walletconnect.sign.sdk;

import com.squareup.sqldelight.C5463a;
import java.util.List;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0002'(B\u0017\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\u0006\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b%\u0010&J^\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\b\b\u0000\u0010\u0004*\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052<\u0010\n\u001a8\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\t\u0012\u0004\u0012\u00028\u00000\u0007H\u0016J\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0005H\u0016J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u0013\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\bH\u0016R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR$\u0010!\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0\u001c8\u0000X\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R$\u0010$\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0\u001c8\u0000X\u0004¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b#\u0010 ¨\u0006)"}, mo44877d2 = {"Lcom/walletconnect/sign/sdk/TempNamespaceDaoQueriesImpl;", "Lcom/squareup/sqldelight/a;", "Ltm6;", "", "T", "", "request_id", "Lkotlin/Function5;", "", "", "mapper", "Lrz4;", "i", "topic", "value", "", "M", "Lr37;", "d0", "a0", "Lf16;", "d", "Lf16;", "database", "Lm76;", "e", "Lm76;", "driver", "", "f", "Ljava/util/List;", "j0", "()Ljava/util/List;", "getTempNamespacesByRequestId", "g", "k0", "isUpdateNamespaceRequestValid", "<init>", "(Lf16;Lm76;)V", "GetTempNamespacesByRequestIdQuery", "IsUpdateNamespaceRequestValidQuery", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: SignDatabaseImpl.kt */
public final class TempNamespaceDaoQueriesImpl extends C5463a implements tm6 {

    /* renamed from: d */
    public final f16 f27814d;

    /* renamed from: e */
    public final m76 f27815e;

    /* renamed from: f */
    public final List<rz4<?>> f27816f = fe2.m44300a();

    /* renamed from: g */
    public final List<rz4<?>> f27817g = fe2.m44300a();

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B#\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0012"}, mo44877d2 = {"Lcom/walletconnect/sign/sdk/TempNamespaceDaoQueriesImpl$GetTempNamespacesByRequestIdQuery;", "", "T", "Lrz4;", "Ll76;", "a", "", "toString", "", "e", "J", "g", "()J", "request_id", "Lkotlin/Function1;", "mapper", "<init>", "(Lcom/walletconnect/sign/sdk/TempNamespaceDaoQueriesImpl;JLrc2;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* compiled from: SignDatabaseImpl.kt */
    public final class GetTempNamespacesByRequestIdQuery<T> extends rz4<T> {

        /* renamed from: e */
        public final long f27818e;

        /* renamed from: f */
        public final /* synthetic */ TempNamespaceDaoQueriesImpl f27819f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public GetTempNamespacesByRequestIdQuery(TempNamespaceDaoQueriesImpl tempNamespaceDaoQueriesImpl, long j, rc2<? super l76, ? extends T> rc2) {
            super(tempNamespaceDaoQueriesImpl.mo41478j0(), rc2);
            vx2.m53591g(rc2, "mapper");
            this.f27819f = tempNamespaceDaoQueriesImpl;
            this.f27818e = j;
        }

        /* renamed from: a */
        public l76 mo40552a() {
            return this.f27819f.f27815e.mo39622r0(-2069444790, "SELECT session_id, key, accounts, methods, events\nFROM TempNamespaceDao\nWHERE request_id = ?", 1, new C5695xdb6fa40c(this));
        }

        /* renamed from: g */
        public final long mo41480g() {
            return this.f27818e;
        }

        public String toString() {
            return "TempNamespaceDao.sq:getTempNamespacesByRequestId";
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B+\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\u0012\u001a\u00020\r\u0012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0017\u0010\f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0017"}, mo44877d2 = {"Lcom/walletconnect/sign/sdk/TempNamespaceDaoQueriesImpl$IsUpdateNamespaceRequestValidQuery;", "", "T", "Lrz4;", "Ll76;", "a", "", "toString", "e", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "topic", "", "f", "J", "h", "()J", "value", "Lkotlin/Function1;", "mapper", "<init>", "(Lcom/walletconnect/sign/sdk/TempNamespaceDaoQueriesImpl;Ljava/lang/String;JLrc2;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* compiled from: SignDatabaseImpl.kt */
    public final class IsUpdateNamespaceRequestValidQuery<T> extends rz4<T> {

        /* renamed from: e */
        public final String f27820e;

        /* renamed from: f */
        public final long f27821f;

        /* renamed from: g */
        public final /* synthetic */ TempNamespaceDaoQueriesImpl f27822g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public IsUpdateNamespaceRequestValidQuery(TempNamespaceDaoQueriesImpl tempNamespaceDaoQueriesImpl, String str, long j, rc2<? super l76, ? extends T> rc2) {
            super(tempNamespaceDaoQueriesImpl.mo41479k0(), rc2);
            vx2.m53591g(str, "topic");
            vx2.m53591g(rc2, "mapper");
            this.f27822g = tempNamespaceDaoQueriesImpl;
            this.f27820e = str;
            this.f27821f = j;
        }

        /* renamed from: a */
        public l76 mo40552a() {
            return this.f27822g.f27815e.mo39622r0(-954849188, "SELECT COUNT(*) = 0\nFROM TempNamespaceDao\nWHERE topic = ? AND request_id / 1000 >= ? AND isAcknowledged = 1", 2, new C5696x34e0e91a(this));
        }

        /* renamed from: g */
        public final String mo41482g() {
            return this.f27820e;
        }

        /* renamed from: h */
        public final long mo41483h() {
            return this.f27821f;
        }

        public String toString() {
            return "TempNamespaceDao.sq:isUpdateNamespaceRequestValid";
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TempNamespaceDaoQueriesImpl(f16 f16, m76 m76) {
        super(m76);
        vx2.m53591g(f16, "database");
        vx2.m53591g(m76, "driver");
        this.f27814d = f16;
        this.f27815e = m76;
    }

    /* renamed from: M */
    public rz4<Boolean> mo41474M(String str, long j) {
        vx2.m53591g(str, "topic");
        return new IsUpdateNamespaceRequestValidQuery(this, str, j, TempNamespaceDaoQueriesImpl$isUpdateNamespaceRequestValid$1.INSTANCE);
    }

    /* renamed from: a0 */
    public void mo41475a0(String str) {
        vx2.m53591g(str, "topic");
        this.f27815e.mo39621m1(-518614424, "DELETE FROM TempNamespaceDao\nWHERE topic = ?", 1, new TempNamespaceDaoQueriesImpl$deleteTempNamespacesByTopic$1(str));
        mo39604f0(-518614424, new TempNamespaceDaoQueriesImpl$deleteTempNamespacesByTopic$2(this));
    }

    /* renamed from: d0 */
    public void mo41476d0(long j) {
        this.f27815e.mo39621m1(212824701, "UPDATE TempNamespaceDao\nSET isAcknowledged = 1\nWHERE request_id = ?", 1, new TempNamespaceDaoQueriesImpl$markNamespaceAcknowledged$1(j));
        mo39604f0(212824701, new TempNamespaceDaoQueriesImpl$markNamespaceAcknowledged$2(this));
    }

    /* renamed from: i */
    public <T> rz4<T> mo41477i(long j, md2<? super Long, ? super String, ? super List<String>, ? super List<String>, ? super List<String>, ? extends T> md2) {
        vx2.m53591g(md2, "mapper");
        return new GetTempNamespacesByRequestIdQuery(this, j, new TempNamespaceDaoQueriesImpl$getTempNamespacesByRequestId$1(md2, this));
    }

    /* renamed from: j0 */
    public final List<rz4<?>> mo41478j0() {
        return this.f27816f;
    }

    /* renamed from: k0 */
    public final List<rz4<?>> mo41479k0() {
        return this.f27817g;
    }
}
