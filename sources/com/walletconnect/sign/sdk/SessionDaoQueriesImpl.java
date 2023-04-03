package com.walletconnect.sign.sdk;

import com.squareup.sqldelight.C5463a;
import java.util.List;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u001e\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0005ABCDEB\u0017\u0012\u0006\u0010#\u001a\u00020 \u0012\u0006\u0010'\u001a\u00020$¢\u0006\u0004\b?\u0010@J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0016Jb\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\b\b\u0000\u0010\u0007*\u00020\u00062H\u0010\u000b\u001aD\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00000\bH\u0016Jj\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\b\b\u0000\u0010\u0007*\u00020\u00062\u0006\u0010\r\u001a\u00020\t2H\u0010\u000b\u001aD\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00000\bH\u0016J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\r\u001a\u00020\tH\u0016J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\u0006\u0010\u0010\u001a\u00020\tH\u0016J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\u0006\u0010\r\u001a\u00020\tH\u0016J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\r\u001a\u00020\tH\u0016JV\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0018\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\t2\u0006\u0010\u001a\u001a\u00020\nH\u0016J\u0018\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\tH\u0016J\u0018\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\tH\u0016J\u0010\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\r\u001a\u00020\tH\u0016R\u0014\u0010#\u001a\u00020 8\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010'\u001a\u00020$8\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010&R$\u0010-\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030(8\u0000X\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R$\u00100\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030(8\u0000X\u0004¢\u0006\f\n\u0004\b.\u0010*\u001a\u0004\b/\u0010,R$\u00103\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030(8\u0000X\u0004¢\u0006\f\n\u0004\b1\u0010*\u001a\u0004\b2\u0010,R$\u00106\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030(8\u0000X\u0004¢\u0006\f\n\u0004\b4\u0010*\u001a\u0004\b5\u0010,R$\u00108\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030(8\u0000X\u0004¢\u0006\f\n\u0004\b\f\u0010*\u001a\u0004\b7\u0010,R$\u0010;\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030(8\u0000X\u0004¢\u0006\f\n\u0004\b9\u0010*\u001a\u0004\b:\u0010,R$\u0010>\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030(8\u0000X\u0004¢\u0006\f\n\u0004\b<\u0010*\u001a\u0004\b=\u0010,¨\u0006F"}, mo44877d2 = {"Lcom/walletconnect/sign/sdk/SessionDaoQueriesImpl;", "Lcom/squareup/sqldelight/a;", "Lpx5;", "Lrz4;", "", "I", "", "T", "Lkotlin/Function9;", "", "", "mapper", "j", "topic", "P", "t", "pairingTopic", "S", "O", "y", "expiry", "relay_protocol", "relay_data", "controller_key", "self_participant", "peer_participant", "is_acknowledged", "Lr37;", "X", "z", "Q", "J", "Lf16;", "d", "Lf16;", "database", "Lm76;", "e", "Lm76;", "driver", "", "f", "Ljava/util/List;", "p0", "()Ljava/util/List;", "lastInsertedRow", "g", "l0", "getListOfSessionDaos", "h", "m0", "getSessionByTopic", "i", "n0", "getSessionIdByTopic", "j0", "getAllSessionTopicsByPairingTopic", "k", "o0", "hasTopic", "l", "k0", "getExpiry", "<init>", "(Lf16;Lm76;)V", "GetAllSessionTopicsByPairingTopicQuery", "GetExpiryQuery", "GetSessionByTopicQuery", "GetSessionIdByTopicQuery", "HasTopicQuery", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: SignDatabaseImpl.kt */
public final class SessionDaoQueriesImpl extends C5463a implements px5 {

    /* renamed from: d */
    public final f16 f27795d;

    /* renamed from: e */
    public final m76 f27796e;

    /* renamed from: f */
    public final List<rz4<?>> f27797f = fe2.m44300a();

    /* renamed from: g */
    public final List<rz4<?>> f27798g = fe2.m44300a();

    /* renamed from: h */
    public final List<rz4<?>> f27799h = fe2.m44300a();

    /* renamed from: i */
    public final List<rz4<?>> f27800i = fe2.m44300a();

    /* renamed from: j */
    public final List<rz4<?>> f27801j = fe2.m44300a();

    /* renamed from: k */
    public final List<rz4<?>> f27802k = fe2.m44300a();

    /* renamed from: l */
    public final List<rz4<?>> f27803l = fe2.m44300a();

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B#\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\r¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0017\u0010\f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u0011"}, mo44877d2 = {"Lcom/walletconnect/sign/sdk/SessionDaoQueriesImpl$GetAllSessionTopicsByPairingTopicQuery;", "", "T", "Lrz4;", "Ll76;", "a", "", "toString", "e", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "pairingTopic", "Lkotlin/Function1;", "mapper", "<init>", "(Lcom/walletconnect/sign/sdk/SessionDaoQueriesImpl;Ljava/lang/String;Lrc2;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* compiled from: SignDatabaseImpl.kt */
    public final class GetAllSessionTopicsByPairingTopicQuery<T> extends rz4<T> {

        /* renamed from: e */
        public final String f27804e;

        /* renamed from: f */
        public final /* synthetic */ SessionDaoQueriesImpl f27805f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public GetAllSessionTopicsByPairingTopicQuery(SessionDaoQueriesImpl sessionDaoQueriesImpl, String str, rc2<? super l76, ? extends T> rc2) {
            super(sessionDaoQueriesImpl.mo41438j0(), rc2);
            vx2.m53591g(str, "pairingTopic");
            vx2.m53591g(rc2, "mapper");
            this.f27805f = sessionDaoQueriesImpl;
            this.f27804e = str;
        }

        /* renamed from: a */
        public l76 mo40552a() {
            return this.f27805f.f27796e.mo39622r0(1480104057, "SELECT topic\nFROM SessionDao\nWHERE pairingTopic = ?", 1, new C5694x6a836613(this));
        }

        /* renamed from: g */
        public final String mo41448g() {
            return this.f27804e;
        }

        public String toString() {
            return "SessionDao.sq:getAllSessionTopicsByPairingTopic";
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B#\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\r¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0017\u0010\f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u0011"}, mo44877d2 = {"Lcom/walletconnect/sign/sdk/SessionDaoQueriesImpl$GetExpiryQuery;", "", "T", "Lrz4;", "Ll76;", "a", "", "toString", "e", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "topic", "Lkotlin/Function1;", "mapper", "<init>", "(Lcom/walletconnect/sign/sdk/SessionDaoQueriesImpl;Ljava/lang/String;Lrc2;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* compiled from: SignDatabaseImpl.kt */
    public final class GetExpiryQuery<T> extends rz4<T> {

        /* renamed from: e */
        public final String f27806e;

        /* renamed from: f */
        public final /* synthetic */ SessionDaoQueriesImpl f27807f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public GetExpiryQuery(SessionDaoQueriesImpl sessionDaoQueriesImpl, String str, rc2<? super l76, ? extends T> rc2) {
            super(sessionDaoQueriesImpl.mo41439k0(), rc2);
            vx2.m53591g(str, "topic");
            vx2.m53591g(rc2, "mapper");
            this.f27807f = sessionDaoQueriesImpl;
            this.f27806e = str;
        }

        /* renamed from: a */
        public l76 mo40552a() {
            return this.f27807f.f27796e.mo39622r0(1261609685, "SELECT expiry\nFROM SessionDao\nWHERE ? = topic", 1, new SessionDaoQueriesImpl$GetExpiryQuery$execute$1(this));
        }

        /* renamed from: g */
        public final String mo41450g() {
            return this.f27806e;
        }

        public String toString() {
            return "SessionDao.sq:getExpiry";
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B#\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\r¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0017\u0010\f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u0011"}, mo44877d2 = {"Lcom/walletconnect/sign/sdk/SessionDaoQueriesImpl$GetSessionByTopicQuery;", "", "T", "Lrz4;", "Ll76;", "a", "", "toString", "e", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "topic", "Lkotlin/Function1;", "mapper", "<init>", "(Lcom/walletconnect/sign/sdk/SessionDaoQueriesImpl;Ljava/lang/String;Lrc2;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* compiled from: SignDatabaseImpl.kt */
    public final class GetSessionByTopicQuery<T> extends rz4<T> {

        /* renamed from: e */
        public final String f27808e;

        /* renamed from: f */
        public final /* synthetic */ SessionDaoQueriesImpl f27809f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public GetSessionByTopicQuery(SessionDaoQueriesImpl sessionDaoQueriesImpl, String str, rc2<? super l76, ? extends T> rc2) {
            super(sessionDaoQueriesImpl.mo41441m0(), rc2);
            vx2.m53591g(str, "topic");
            vx2.m53591g(rc2, "mapper");
            this.f27809f = sessionDaoQueriesImpl;
            this.f27808e = str;
        }

        /* renamed from: a */
        public l76 mo40552a() {
            return this.f27809f.f27796e.mo39622r0(-352980156, "SELECT sd.id, sd.topic, sd.expiry, sd.relay_protocol, sd.relay_data, sd.controller_key, sd.self_participant, sd.peer_participant, sd.is_acknowledged\nFROM SessionDao sd\nWHERE topic = ?", 1, new SessionDaoQueriesImpl$GetSessionByTopicQuery$execute$1(this));
        }

        /* renamed from: g */
        public final String mo41452g() {
            return this.f27808e;
        }

        public String toString() {
            return "SessionDao.sq:getSessionByTopic";
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B#\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\r¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0017\u0010\f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u0011"}, mo44877d2 = {"Lcom/walletconnect/sign/sdk/SessionDaoQueriesImpl$GetSessionIdByTopicQuery;", "", "T", "Lrz4;", "Ll76;", "a", "", "toString", "e", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "topic", "Lkotlin/Function1;", "mapper", "<init>", "(Lcom/walletconnect/sign/sdk/SessionDaoQueriesImpl;Ljava/lang/String;Lrc2;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* compiled from: SignDatabaseImpl.kt */
    public final class GetSessionIdByTopicQuery<T> extends rz4<T> {

        /* renamed from: e */
        public final String f27810e;

        /* renamed from: f */
        public final /* synthetic */ SessionDaoQueriesImpl f27811f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public GetSessionIdByTopicQuery(SessionDaoQueriesImpl sessionDaoQueriesImpl, String str, rc2<? super l76, ? extends T> rc2) {
            super(sessionDaoQueriesImpl.mo41442n0(), rc2);
            vx2.m53591g(str, "topic");
            vx2.m53591g(rc2, "mapper");
            this.f27811f = sessionDaoQueriesImpl;
            this.f27810e = str;
        }

        /* renamed from: a */
        public l76 mo40552a() {
            return this.f27811f.f27796e.mo39622r0(-452641111, "SELECT id\nFROM SessionDao\nWHERE topic = ?", 1, new SessionDaoQueriesImpl$GetSessionIdByTopicQuery$execute$1(this));
        }

        /* renamed from: g */
        public final String mo41454g() {
            return this.f27810e;
        }

        public String toString() {
            return "SessionDao.sq:getSessionIdByTopic";
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B#\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\r¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0017\u0010\f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u0011"}, mo44877d2 = {"Lcom/walletconnect/sign/sdk/SessionDaoQueriesImpl$HasTopicQuery;", "", "T", "Lrz4;", "Ll76;", "a", "", "toString", "e", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "topic", "Lkotlin/Function1;", "mapper", "<init>", "(Lcom/walletconnect/sign/sdk/SessionDaoQueriesImpl;Ljava/lang/String;Lrc2;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* compiled from: SignDatabaseImpl.kt */
    public final class HasTopicQuery<T> extends rz4<T> {

        /* renamed from: e */
        public final String f27812e;

        /* renamed from: f */
        public final /* synthetic */ SessionDaoQueriesImpl f27813f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public HasTopicQuery(SessionDaoQueriesImpl sessionDaoQueriesImpl, String str, rc2<? super l76, ? extends T> rc2) {
            super(sessionDaoQueriesImpl.mo41443o0(), rc2);
            vx2.m53591g(str, "topic");
            vx2.m53591g(rc2, "mapper");
            this.f27813f = sessionDaoQueriesImpl;
            this.f27812e = str;
        }

        /* renamed from: a */
        public l76 mo40552a() {
            return this.f27813f.f27796e.mo39622r0(-396078455, "SELECT topic\nFROM SessionDao\nWHERE ? = topic", 1, new SessionDaoQueriesImpl$HasTopicQuery$execute$1(this));
        }

        /* renamed from: g */
        public final String mo41456g() {
            return this.f27812e;
        }

        public String toString() {
            return "SessionDao.sq:hasTopic";
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SessionDaoQueriesImpl(f16 f16, m76 m76) {
        super(m76);
        vx2.m53591g(f16, "database");
        vx2.m53591g(m76, "driver");
        this.f27795d = f16;
        this.f27796e = m76;
    }

    /* renamed from: I */
    public rz4<Long> mo41430I() {
        return k05.m46848a(-1497460008, this.f27797f, this.f27796e, "SessionDao.sq", "lastInsertedRow", "SELECT id\nFROM SessionDao\nWHERE id = (SELECT MAX(id) FROM SessionDao)", SessionDaoQueriesImpl$lastInsertedRow$1.INSTANCE);
    }

    /* renamed from: J */
    public void mo41431J(String str) {
        vx2.m53591g(str, "topic");
        this.f27796e.mo39621m1(91568919, "DELETE FROM SessionDao\nWHERE topic = ?", 1, new SessionDaoQueriesImpl$deleteSession$1(str));
        mo39604f0(91568919, new SessionDaoQueriesImpl$deleteSession$2(this));
    }

    /* renamed from: O */
    public rz4<String> mo41432O(String str) {
        vx2.m53591g(str, "topic");
        return new HasTopicQuery(this, str, SessionDaoQueriesImpl$hasTopic$1.INSTANCE);
    }

    /* renamed from: P */
    public <T> rz4<T> mo41433P(String str, rd2<? super Long, ? super String, ? super Long, ? super String, ? super String, ? super String, ? super String, ? super String, ? super Boolean, ? extends T> rd2) {
        vx2.m53591g(str, "topic");
        vx2.m53591g(rd2, "mapper");
        return new GetSessionByTopicQuery(this, str, new SessionDaoQueriesImpl$getSessionByTopic$1(rd2));
    }

    /* renamed from: Q */
    public void mo41434Q(long j, String str) {
        vx2.m53591g(str, "topic");
        this.f27796e.mo39621m1(-1248262964, "UPDATE OR ABORT SessionDao\nSET expiry = ?\nWHERE topic = ?", 2, new SessionDaoQueriesImpl$updateSessionExpiry$1(j, str));
        mo39604f0(-1248262964, new SessionDaoQueriesImpl$updateSessionExpiry$2(this));
    }

    /* renamed from: S */
    public rz4<String> mo41435S(String str) {
        vx2.m53591g(str, "pairingTopic");
        return new GetAllSessionTopicsByPairingTopicQuery(this, str, SessionDaoQueriesImpl$getAllSessionTopicsByPairingTopic$1.INSTANCE);
    }

    /* renamed from: X */
    public void mo41436X(String str, String str2, long j, String str3, String str4, String str5, String str6, String str7, boolean z) {
        String str8 = str;
        vx2.m53591g(str8, "topic");
        String str9 = str2;
        vx2.m53591g(str9, "pairingTopic");
        String str10 = str3;
        vx2.m53591g(str10, "relay_protocol");
        String str11 = str6;
        vx2.m53591g(str11, "self_participant");
        this.f27796e.mo39621m1(-1443047498, "INSERT OR ABORT INTO SessionDao(topic, pairingTopic, expiry, relay_protocol, relay_data, controller_key, self_participant, peer_participant, is_acknowledged)\nVALUES (?,  ?, ?,?, ?, ?, ?, ?, ?)", 9, new SessionDaoQueriesImpl$insertOrAbortSession$1(str8, str9, j, str10, str4, str5, str11, str7, z));
        mo39604f0(-1443047498, new SessionDaoQueriesImpl$insertOrAbortSession$2(this));
    }

    /* renamed from: j */
    public <T> rz4<T> mo41437j(rd2<? super Long, ? super String, ? super Long, ? super String, ? super String, ? super String, ? super String, ? super String, ? super Boolean, ? extends T> rd2) {
        vx2.m53591g(rd2, "mapper");
        return k05.m46848a(-433596000, this.f27798g, this.f27796e, "SessionDao.sq", "getListOfSessionDaos", "SELECT sd.id, sd.topic, sd.expiry, sd.relay_protocol, sd.relay_data, sd.controller_key, sd.self_participant, sd.peer_participant, sd.is_acknowledged\nFROM SessionDao sd", new SessionDaoQueriesImpl$getListOfSessionDaos$1(rd2));
    }

    /* renamed from: j0 */
    public final List<rz4<?>> mo41438j0() {
        return this.f27801j;
    }

    /* renamed from: k0 */
    public final List<rz4<?>> mo41439k0() {
        return this.f27803l;
    }

    /* renamed from: l0 */
    public final List<rz4<?>> mo41440l0() {
        return this.f27798g;
    }

    /* renamed from: m0 */
    public final List<rz4<?>> mo41441m0() {
        return this.f27799h;
    }

    /* renamed from: n0 */
    public final List<rz4<?>> mo41442n0() {
        return this.f27800i;
    }

    /* renamed from: o0 */
    public final List<rz4<?>> mo41443o0() {
        return this.f27802k;
    }

    /* renamed from: p0 */
    public final List<rz4<?>> mo41444p0() {
        return this.f27797f;
    }

    /* renamed from: t */
    public rz4<Long> mo41445t(String str) {
        vx2.m53591g(str, "topic");
        return new GetSessionIdByTopicQuery(this, str, SessionDaoQueriesImpl$getSessionIdByTopic$1.INSTANCE);
    }

    /* renamed from: y */
    public rz4<Long> mo41446y(String str) {
        vx2.m53591g(str, "topic");
        return new GetExpiryQuery(this, str, SessionDaoQueriesImpl$getExpiry$1.INSTANCE);
    }

    /* renamed from: z */
    public void mo41447z(boolean z, String str) {
        vx2.m53591g(str, "topic");
        this.f27796e.mo39621m1(-1339683026, "UPDATE OR ABORT SessionDao\nSET is_acknowledged = ?\nWHERE topic = ?", 2, new SessionDaoQueriesImpl$acknowledgeSession$1(z, str));
        mo39604f0(-1339683026, new SessionDaoQueriesImpl$acknowledgeSession$2(this));
    }
}
