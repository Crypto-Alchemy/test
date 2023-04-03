package p000;

import com.squareup.sqldelight.C5463a;
import com.walletconnect.sign.sdk.NamespaceDaoQueriesImpl;
import com.walletconnect.sign.sdk.NamespaceExtensionDaoQueriesImpl;
import com.walletconnect.sign.sdk.ProposalNamespaceDaoQueriesImpl;
import com.walletconnect.sign.sdk.ProposalNamespaceExtensionDaoQueriesImpl;
import com.walletconnect.sign.sdk.SessionDaoQueriesImpl;
import com.walletconnect.sign.sdk.TempNamespaceDaoQueriesImpl;
import com.walletconnect.sign.sdk.TempNamespaceExtensionDaoQueriesImpl;
import kotlin.Metadata;
import p000.m76;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001UB?\u0012\u0006\u0010R\u001a\u00020Q\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0014\u001a\u00020\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u0015\u0012\u0006\u0010 \u001a\u00020\u001b\u0012\u0006\u0010&\u001a\u00020!¢\u0006\u0004\bS\u0010TR\u001a\u0010\b\u001a\u00020\u00038\u0000X\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\u000e\u001a\u00020\t8\u0000X\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0014\u001a\u00020\u000f8\u0000X\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u001a\u001a\u00020\u00158\u0000X\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010 \u001a\u00020\u001b8\u0000X\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010&\u001a\u00020!8\u0000X\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010,\u001a\u00020'8\u0016X\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001a\u00102\u001a\u00020-8\u0016X\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001a\u00108\u001a\u0002038\u0016X\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u001a\u0010>\u001a\u0002098\u0016X\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u001a\u0010D\u001a\u00020?8\u0016X\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u001a\u0010J\u001a\u00020E8\u0016X\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u001a\u0010P\u001a\u00020K8\u0016X\u0004¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O¨\u0006V"}, mo44877d2 = {"Lf16;", "Lcom/squareup/sqldelight/a;", "Le16;", "La34;", "d", "La34;", "h0", "()La34;", "NamespaceDaoAdapter", "Ld34;", "e", "Ld34;", "k0", "()Ld34;", "NamespaceExtensionsDaoAdapter", "Lqx4;", "f", "Lqx4;", "l0", "()Lqx4;", "ProposalNamespaceDaoAdapter", "Ltx4;", "g", "Ltx4;", "o0", "()Ltx4;", "ProposalNamespaceExtensionsDaoAdapter", "Lsm6;", "h", "Lsm6;", "q0", "()Lsm6;", "TempNamespaceDaoAdapter", "Lvm6;", "i", "Lvm6;", "t0", "()Lvm6;", "TempNamespaceExtensionsDaoAdapter", "Lcom/walletconnect/sign/sdk/NamespaceDaoQueriesImpl;", "j", "Lcom/walletconnect/sign/sdk/NamespaceDaoQueriesImpl;", "i0", "()Lcom/walletconnect/sign/sdk/NamespaceDaoQueriesImpl;", "namespaceDaoQueries", "Lcom/walletconnect/sign/sdk/NamespaceExtensionDaoQueriesImpl;", "k", "Lcom/walletconnect/sign/sdk/NamespaceExtensionDaoQueriesImpl;", "j0", "()Lcom/walletconnect/sign/sdk/NamespaceExtensionDaoQueriesImpl;", "namespaceExtensionDaoQueries", "Lcom/walletconnect/sign/sdk/ProposalNamespaceDaoQueriesImpl;", "l", "Lcom/walletconnect/sign/sdk/ProposalNamespaceDaoQueriesImpl;", "m0", "()Lcom/walletconnect/sign/sdk/ProposalNamespaceDaoQueriesImpl;", "proposalNamespaceDaoQueries", "Lcom/walletconnect/sign/sdk/ProposalNamespaceExtensionDaoQueriesImpl;", "m", "Lcom/walletconnect/sign/sdk/ProposalNamespaceExtensionDaoQueriesImpl;", "n0", "()Lcom/walletconnect/sign/sdk/ProposalNamespaceExtensionDaoQueriesImpl;", "proposalNamespaceExtensionDaoQueries", "Lcom/walletconnect/sign/sdk/SessionDaoQueriesImpl;", "n", "Lcom/walletconnect/sign/sdk/SessionDaoQueriesImpl;", "p0", "()Lcom/walletconnect/sign/sdk/SessionDaoQueriesImpl;", "sessionDaoQueries", "Lcom/walletconnect/sign/sdk/TempNamespaceDaoQueriesImpl;", "o", "Lcom/walletconnect/sign/sdk/TempNamespaceDaoQueriesImpl;", "r0", "()Lcom/walletconnect/sign/sdk/TempNamespaceDaoQueriesImpl;", "tempNamespaceDaoQueries", "Lcom/walletconnect/sign/sdk/TempNamespaceExtensionDaoQueriesImpl;", "p", "Lcom/walletconnect/sign/sdk/TempNamespaceExtensionDaoQueriesImpl;", "s0", "()Lcom/walletconnect/sign/sdk/TempNamespaceExtensionDaoQueriesImpl;", "tempNamespaceExtensionDaoQueries", "Lm76;", "driver", "<init>", "(Lm76;La34;Ld34;Lqx4;Ltx4;Lsm6;Lvm6;)V", "a", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: f16 */
/* compiled from: SignDatabaseImpl.kt */
public final class f16 extends C5463a implements e16 {

    /* renamed from: d */
    public final a34 f28713d;

    /* renamed from: e */
    public final d34 f28714e;

    /* renamed from: f */
    public final qx4 f28715f;

    /* renamed from: g */
    public final tx4 f28716g;

    /* renamed from: h */
    public final sm6 f28717h;

    /* renamed from: i */
    public final vm6 f28718i;

    /* renamed from: j */
    public final NamespaceDaoQueriesImpl f28719j;

    /* renamed from: k */
    public final NamespaceExtensionDaoQueriesImpl f28720k;

    /* renamed from: l */
    public final ProposalNamespaceDaoQueriesImpl f28721l;

    /* renamed from: m */
    public final ProposalNamespaceExtensionDaoQueriesImpl f28722m;

    /* renamed from: n */
    public final SessionDaoQueriesImpl f28723n;

    /* renamed from: o */
    public final TempNamespaceDaoQueriesImpl f28724o;

    /* renamed from: p */
    public final TempNamespaceExtensionDaoQueriesImpl f28725p;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J \u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016R\u0014\u0010\f\u001a\u00020\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, mo44877d2 = {"Lf16$a;", "Lm76$b;", "Lm76;", "driver", "Lr37;", "a", "", "oldVersion", "newVersion", "b", "getVersion", "()I", "version", "<init>", "()V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: f16$a */
    /* compiled from: SignDatabaseImpl.kt */
    public static final class C5824a implements m76.C6236b {

        /* renamed from: a */
        public static final C5824a f28726a = new C5824a();

        /* renamed from: a */
        public void mo30018a(m76 m76) {
            vx2.m53591g(m76, "driver");
            m76 m762 = m76;
            m76.C6235a.m48110a(m762, (Integer) null, "CREATE TABLE TempNamespaceExtensionsDao(\n    id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n    namespace_key TEXT NOT NULL,\n    session_id INTEGER NOT NULL,\n    topic TEXT NOT NULL,\n    accounts TEXT NOT NULL,\n    methods TEXT NOT NULL,\n    events TEXT  NOT NULL,\n    request_id INTEGER NOT NULL\n)", 0, (rc2) null, 8, (Object) null);
            m76.C6235a.m48110a(m762, (Integer) null, "CREATE TABLE TempNamespaceDao(\n    request_id INTEGER PRIMARY KEY NOT NULL,\n    session_id INTEGER NOT NULL,\n    topic TEXT NOT NULL,\n    key TEXT NOT NULL,\n    accounts TEXT NOT NULL,\n    methods TEXT NOT NULL,\n    events TEXT NOT NULL,\n    isAcknowledged INTEGER DEFAULT 0\n)", 0, (rc2) null, 8, (Object) null);
            m76.C6235a.m48110a(m762, (Integer) null, "CREATE TABLE ProposalNamespaceDao (\n    id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n    session_id INTEGER NOT NULL,\n    key TEXT NOT NULL,\n    chains TEXT NOT NULL,\n    methods TEXT NOT NULL,\n    events TEXT NOT NULL,\n    UNIQUE(session_id, key)\n)", 0, (rc2) null, 8, (Object) null);
            m76.C6235a.m48110a(m762, (Integer) null, "CREATE TABLE ProposalNamespaceExtensionsDao (\n    id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n    namespace_key TEXT NOT NULL,\n    session_id INTEGER NOT NULL,\n    chains TEXT NOT NULL,\n    methods TEXT NOT NULL,\n    events TEXT  NOT NULL\n)", 0, (rc2) null, 8, (Object) null);
            m76.C6235a.m48110a(m762, (Integer) null, "CREATE TABLE NamespaceDao(\n    id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n    session_id INTEGER NOT NULL,\n    key TEXT NOT NULL,\n    accounts TEXT NOT NULL,\n    methods TEXT NOT NULL,\n    events TEXT NOT NULL,\n    request_id INTEGER NOT NULL,\n    UNIQUE(session_id, key)\n)", 0, (rc2) null, 8, (Object) null);
            m76.C6235a.m48110a(m762, (Integer) null, "CREATE TABLE NamespaceExtensionsDao(\n    id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n    namespace_key TEXT NOT NULL,\n    session_id INTEGER NOT NULL,\n    accounts TEXT NOT NULL,\n    methods TEXT NOT NULL,\n    events TEXT  NOT NULL\n)", 0, (rc2) null, 8, (Object) null);
            m76.C6235a.m48110a(m762, (Integer) null, "CREATE TABLE SessionDao(\n   id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n   topic TEXT UNIQUE NOT NULL,\n   pairingTopic TEXT NOT NULL,\n   expiry INTEGER NOT NULL,\n   relay_protocol TEXT NOT NULL,\n   relay_data TEXT,\n   controller_key TEXT,\n   self_participant TEXT NOT NULL,\n   peer_participant TEXT,\n   is_acknowledged INTEGER NOT NULL\n)", 0, (rc2) null, 8, (Object) null);
        }

        /* renamed from: b */
        public void mo30019b(m76 m76, int i, int i2) {
            vx2.m53591g(m76, "driver");
            if (i <= 1 && i2 > 1) {
                m76 m762 = m76;
                m76.C6235a.m48110a(m762, (Integer) null, "DROP TABLE IF EXISTS JsonRpcHistoryDao", 0, (rc2) null, 8, (Object) null);
                m76.C6235a.m48110a(m762, (Integer) null, "DROP TABLE IF EXISTS MetaDataDao", 0, (rc2) null, 8, (Object) null);
                m76.C6235a.m48110a(m762, (Integer) null, "DROP TABLE IF EXISTS NamespaceDao", 0, (rc2) null, 8, (Object) null);
                m76.C6235a.m48110a(m762, (Integer) null, "DROP TABLE IF EXISTS NamespaceExtensionsDao", 0, (rc2) null, 8, (Object) null);
                m76.C6235a.m48110a(m762, (Integer) null, "DROP TABLE IF EXISTS PairingDao", 0, (rc2) null, 8, (Object) null);
                m76.C6235a.m48110a(m762, (Integer) null, "DROP TABLE IF EXISTS ProposalNamespaceDao", 0, (rc2) null, 8, (Object) null);
                m76.C6235a.m48110a(m762, (Integer) null, "DROP TABLE IF EXISTS ProposalNamespaceExtensionsDao", 0, (rc2) null, 8, (Object) null);
                m76.C6235a.m48110a(m762, (Integer) null, "DROP TABLE IF EXISTS SessionDao", 0, (rc2) null, 8, (Object) null);
                m76.C6235a.m48110a(m762, (Integer) null, "DROP TABLE IF EXISTS TempNamespaceDao", 0, (rc2) null, 8, (Object) null);
                m76.C6235a.m48110a(m762, (Integer) null, "DROP TABLE IF EXISTS TempNamespaceExtensionsDao", 0, (rc2) null, 8, (Object) null);
                m76.C6235a.m48110a(m762, (Integer) null, "CREATE TABLE JsonRpcHistoryDao(\n  id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n  request_id INTEGER UNIQUE NOT NULL,\n  topic TEXT NOT NULL,\n  method TEXT NOT NULL,\n  body TEXT NOT NULL,\n  response TEXT\n)", 0, (rc2) null, 8, (Object) null);
                m76.C6235a.m48110a(m762, (Integer) null, "CREATE TABLE MetaDataDao(\n\tid INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n\tsequence_topic TEXT NOT NULL,\n  \tname TEXT NOT NULL,\n  \tdescription TEXT NOT NULL,\n  \turl TEXT NOT NULL,\n  \ticons TEXT NOT NULL,\n  \ttype TEXT NOT NULL,\n  \tUNIQUE(sequence_topic, type)\n)", 0, (rc2) null, 8, (Object) null);
                m76.C6235a.m48110a(m762, (Integer) null, "CREATE TABLE NamespaceDao(\n    id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n    session_id INTEGER NOT NULL,\n    key TEXT NOT NULL,\n    accounts TEXT NOT NULL,\n    methods TEXT NOT NULL,\n    events TEXT NOT NULL,\n    UNIQUE(session_id, key)\n)", 0, (rc2) null, 8, (Object) null);
                m76.C6235a.m48110a(m762, (Integer) null, "CREATE TABLE NamespaceExtensionsDao(\n    id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n    namespace_key TEXT NOT NULL,\n    session_id INTEGER NOT NULL,\n    accounts TEXT NOT NULL,\n    methods TEXT NOT NULL,\n    events TEXT  NOT NULL\n)", 0, (rc2) null, 8, (Object) null);
                m76.C6235a.m48110a(m762, (Integer) null, "CREATE TABLE PairingDao (\n    id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n    topic TEXT UNIQUE NOT NULL,\n    expiry INTEGER NOT NULL,\n    relay_protocol TEXT NOT NULL,\n    relay_data TEXT,\n    uri TEXT NOT NULL,\n    is_active INTEGER NOT NULL\n)", 0, (rc2) null, 8, (Object) null);
                m76.C6235a.m48110a(m762, (Integer) null, "CREATE TABLE SessionDao(\n   id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n   topic TEXT UNIQUE NOT NULL,\n   expiry INTEGER NOT NULL,\n   relay_protocol TEXT NOT NULL,\n   relay_data TEXT,\n   controller_key TEXT,\n   self_participant TEXT NOT NULL,\n   peer_participant TEXT,\n   is_acknowledged INTEGER NOT NULL\n)", 0, (rc2) null, 8, (Object) null);
            }
            if (i <= 2 && i2 > 2) {
                m76 m763 = m76;
                m76.C6235a.m48110a(m763, (Integer) null, "DROP TABLE IF EXISTS JsonRpcHistoryDao", 0, (rc2) null, 8, (Object) null);
                m76.C6235a.m48110a(m763, (Integer) null, "DROP TABLE IF EXISTS MetaDataDao", 0, (rc2) null, 8, (Object) null);
                m76.C6235a.m48110a(m763, (Integer) null, "DROP TABLE IF EXISTS NamespaceDao", 0, (rc2) null, 8, (Object) null);
                m76.C6235a.m48110a(m763, (Integer) null, "DROP TABLE IF EXISTS NamespaceExtensionsDao", 0, (rc2) null, 8, (Object) null);
                m76.C6235a.m48110a(m763, (Integer) null, "DROP TABLE IF EXISTS PairingDao", 0, (rc2) null, 8, (Object) null);
                m76.C6235a.m48110a(m763, (Integer) null, "DROP TABLE IF EXISTS SessionDao", 0, (rc2) null, 8, (Object) null);
                m76.C6235a.m48110a(m763, (Integer) null, "CREATE TABLE JsonRpcHistoryDao(\n  id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n  request_id INTEGER UNIQUE NOT NULL,\n  topic TEXT NOT NULL,\n  method TEXT NOT NULL,\n  body TEXT NOT NULL,\n  response TEXT\n)", 0, (rc2) null, 8, (Object) null);
                m76.C6235a.m48110a(m763, (Integer) null, "CREATE TABLE MetaDataDao(\n\tid INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n\tsequence_topic TEXT NOT NULL,\n  \tname TEXT NOT NULL,\n  \tdescription TEXT NOT NULL,\n  \turl TEXT NOT NULL,\n  \ticons TEXT NOT NULL,\n  \ttype TEXT NOT NULL,\n  \tUNIQUE(sequence_topic, type)\n)", 0, (rc2) null, 8, (Object) null);
                m76.C6235a.m48110a(m763, (Integer) null, "CREATE TABLE NamespaceDao(\n    id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n    session_id INTEGER NOT NULL,\n    key TEXT NOT NULL,\n    accounts TEXT NOT NULL,\n    methods TEXT NOT NULL,\n    events TEXT NOT NULL,\n    request_id INTEGER NOT NULL,\n    UNIQUE(session_id, key)\n)", 0, (rc2) null, 8, (Object) null);
                m76.C6235a.m48110a(m763, (Integer) null, "CREATE TABLE NamespaceExtensionsDao(\n    id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n    namespace_key TEXT NOT NULL,\n    session_id INTEGER NOT NULL,\n    accounts TEXT NOT NULL,\n    methods TEXT NOT NULL,\n    events TEXT  NOT NULL\n)", 0, (rc2) null, 8, (Object) null);
                m76.C6235a.m48110a(m763, (Integer) null, "CREATE TABLE PairingDao (\n    id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n    topic TEXT UNIQUE NOT NULL,\n    expiry INTEGER NOT NULL,\n    relay_protocol TEXT NOT NULL,\n    relay_data TEXT,\n    uri TEXT NOT NULL,\n    is_active INTEGER NOT NULL\n)", 0, (rc2) null, 8, (Object) null);
                m76.C6235a.m48110a(m763, (Integer) null, "CREATE TABLE ProposalNamespaceDao (\n    id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n    session_id INTEGER NOT NULL,\n    key TEXT NOT NULL,\n    chains TEXT NOT NULL,\n    methods TEXT NOT NULL,\n    events TEXT NOT NULL,\n    UNIQUE(session_id, key)\n)", 0, (rc2) null, 8, (Object) null);
                m76.C6235a.m48110a(m763, (Integer) null, "CREATE TABLE ProposalNamespaceExtensionsDao (\n    id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n    namespace_key TEXT NOT NULL,\n    session_id INTEGER NOT NULL,\n    chains TEXT NOT NULL,\n    methods TEXT NOT NULL,\n    events TEXT NOT NULL\n)", 0, (rc2) null, 8, (Object) null);
                m76.C6235a.m48110a(m763, (Integer) null, "CREATE TABLE SessionDao(\n   id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n   topic TEXT UNIQUE NOT NULL,\n   expiry INTEGER NOT NULL,\n   relay_protocol TEXT NOT NULL,\n   relay_data TEXT,\n   controller_key TEXT,\n   self_participant TEXT NOT NULL,\n   peer_participant TEXT,\n   is_acknowledged INTEGER NOT NULL\n)", 0, (rc2) null, 8, (Object) null);
                m76.C6235a.m48110a(m763, (Integer) null, "CREATE TABLE TempNamespaceDao(\n    id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n    session_id INTEGER NOT NULL,\n    topic TEXT NOT NULL,\n    key TEXT NOT NULL,\n    accounts TEXT NOT NULL,\n    methods TEXT NOT NULL,\n    events TEXT NOT NULL,\n    request_id INTEGER NOT NULL,\n    isAcknowledged INTEGER DEFAULT 0,\n    UNIQUE(session_id, key)\n)", 0, (rc2) null, 8, (Object) null);
                m76.C6235a.m48110a(m763, (Integer) null, "CREATE TABLE TempNamespaceExtensionsDao(\n    id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n    namespace_key TEXT NOT NULL,\n    session_id INTEGER NOT NULL,\n    topic TEXT NOT NULL,\n    accounts TEXT NOT NULL,\n    methods TEXT NOT NULL,\n    events TEXT  NOT NULL,\n    request_id INTEGER NOT NULL\n)", 0, (rc2) null, 8, (Object) null);
            }
            if (i <= 3 && i2 > 3) {
                m76 m764 = m76;
                m76.C6235a.m48110a(m764, (Integer) null, "DROP TABLE IF EXISTS JsonRpcHistoryDao", 0, (rc2) null, 8, (Object) null);
                m76.C6235a.m48110a(m764, (Integer) null, "DROP TABLE IF EXISTS MetaDataDao", 0, (rc2) null, 8, (Object) null);
                m76.C6235a.m48110a(m764, (Integer) null, "DROP TABLE IF EXISTS MetaDataDao", 0, (rc2) null, 8, (Object) null);
                m76.C6235a.m48110a(m764, (Integer) null, "DROP TABLE IF EXISTS NamespaceDao", 0, (rc2) null, 8, (Object) null);
                m76.C6235a.m48110a(m764, (Integer) null, "DROP TABLE IF EXISTS NamespaceExtensionsDao", 0, (rc2) null, 8, (Object) null);
                m76.C6235a.m48110a(m764, (Integer) null, "DROP TABLE IF EXISTS NamespaceExtensionsDao", 0, (rc2) null, 8, (Object) null);
                m76.C6235a.m48110a(m764, (Integer) null, "DROP TABLE IF EXISTS PairingDao", 0, (rc2) null, 8, (Object) null);
                m76.C6235a.m48110a(m764, (Integer) null, "DROP TABLE IF EXISTS ProposalNamespaceDao", 0, (rc2) null, 8, (Object) null);
                m76.C6235a.m48110a(m764, (Integer) null, "DROP TABLE IF EXISTS ProposalNamespaceExtensionsDao", 0, (rc2) null, 8, (Object) null);
                m76.C6235a.m48110a(m764, (Integer) null, "DROP TABLE IF EXISTS SessionDao", 0, (rc2) null, 8, (Object) null);
                m76.C6235a.m48110a(m764, (Integer) null, "DROP TABLE IF EXISTS TempNamespaceDao", 0, (rc2) null, 8, (Object) null);
                m76.C6235a.m48110a(m764, (Integer) null, "DROP TABLE IF EXISTS TempNamespaceExtensionsDao", 0, (rc2) null, 8, (Object) null);
                m76.C6235a.m48110a(m764, (Integer) null, "CREATE TABLE JsonRpcHistoryDao(\n  id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n  request_id INTEGER UNIQUE NOT NULL,\n  topic TEXT NOT NULL,\n  method TEXT NOT NULL,\n  body TEXT NOT NULL,\n  response TEXT\n)", 0, (rc2) null, 8, (Object) null);
                m76.C6235a.m48110a(m764, (Integer) null, "CREATE TABLE MetaDataDao(\n\tid INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n\tsequence_topic TEXT NOT NULL,\n  \tname TEXT NOT NULL,\n  \tdescription TEXT NOT NULL,\n  \turl TEXT NOT NULL,\n  \ticons TEXT NOT NULL,\n  \ttype TEXT NOT NULL,\n  \tUNIQUE(sequence_topic, type)\n)", 0, (rc2) null, 8, (Object) null);
                m76.C6235a.m48110a(m764, (Integer) null, "CREATE TABLE NamespaceDao(\n    id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n    session_id INTEGER NOT NULL,\n    key TEXT NOT NULL,\n    accounts TEXT NOT NULL,\n    methods TEXT NOT NULL,\n    events TEXT NOT NULL,\n    request_id INTEGER NOT NULL,\n    UNIQUE(session_id, key)\n)", 0, (rc2) null, 8, (Object) null);
                m76.C6235a.m48110a(m764, (Integer) null, "CREATE TABLE NamespaceExtensionsDao(\n    id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n    namespace_key TEXT NOT NULL,\n    session_id INTEGER NOT NULL,\n    accounts TEXT NOT NULL,\n    methods TEXT NOT NULL,\n    events TEXT  NOT NULL\n)", 0, (rc2) null, 8, (Object) null);
                m76.C6235a.m48110a(m764, (Integer) null, "CREATE TABLE PairingDao (\n    id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n    topic TEXT UNIQUE NOT NULL,\n    expiry INTEGER NOT NULL,\n    relay_protocol TEXT NOT NULL,\n    relay_data TEXT,\n    uri TEXT NOT NULL,\n    is_active INTEGER NOT NULL\n)", 0, (rc2) null, 8, (Object) null);
                m76.C6235a.m48110a(m764, (Integer) null, "CREATE TABLE ProposalNamespaceDao (\n    id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n    session_id INTEGER NOT NULL,\n    key TEXT NOT NULL,\n    chains TEXT NOT NULL,\n    methods TEXT NOT NULL,\n    events TEXT NOT NULL,\n    UNIQUE(session_id, key)\n)", 0, (rc2) null, 8, (Object) null);
                m76.C6235a.m48110a(m764, (Integer) null, "CREATE TABLE ProposalNamespaceExtensionsDao (\n    id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n    namespace_key TEXT NOT NULL,\n    session_id INTEGER NOT NULL,\n    chains TEXT NOT NULL,\n    methods TEXT NOT NULL,\n    events TEXT NOT NULL\n)", 0, (rc2) null, 8, (Object) null);
                m76.C6235a.m48110a(m764, (Integer) null, "CREATE TABLE SessionDao(\n   id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n   topic TEXT UNIQUE NOT NULL,\n   expiry INTEGER NOT NULL,\n   relay_protocol TEXT NOT NULL,\n   relay_data TEXT,\n   controller_key TEXT,\n   self_participant TEXT NOT NULL,\n   peer_participant TEXT,\n   is_acknowledged INTEGER NOT NULL\n)", 0, (rc2) null, 8, (Object) null);
                m76.C6235a.m48110a(m764, (Integer) null, "CREATE TABLE TempNamespaceDao(\n    request_id INTEGER PRIMARY KEY NOT NULL,\n    session_id INTEGER NOT NULL,\n    topic TEXT NOT NULL,\n    key TEXT NOT NULL,\n    accounts TEXT NOT NULL,\n    methods TEXT NOT NULL,\n    events TEXT NOT NULL,\n    isAcknowledged INTEGER DEFAULT 0\n)", 0, (rc2) null, 8, (Object) null);
                m76.C6235a.m48110a(m764, (Integer) null, "CREATE TABLE TempNamespaceExtensionsDao(\n    id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n    namespace_key TEXT NOT NULL,\n    session_id INTEGER NOT NULL,\n    topic TEXT NOT NULL,\n    accounts TEXT NOT NULL,\n    methods TEXT NOT NULL,\n    events TEXT  NOT NULL,\n    request_id INTEGER NOT NULL\n)", 0, (rc2) null, 8, (Object) null);
            }
            if (i <= 4 && i2 > 4) {
                m76 m765 = m76;
                m76.C6235a.m48110a(m765, (Integer) null, "DROP TABLE IF EXISTS JsonRpcHistoryDao", 0, (rc2) null, 8, (Object) null);
                m76.C6235a.m48110a(m765, (Integer) null, "DROP TABLE IF EXISTS MetaDataDao", 0, (rc2) null, 8, (Object) null);
                m76.C6235a.m48110a(m765, (Integer) null, "DROP TABLE IF EXISTS NamespaceDao", 0, (rc2) null, 8, (Object) null);
                m76.C6235a.m48110a(m765, (Integer) null, "DROP TABLE IF EXISTS NamespaceExtensionsDao", 0, (rc2) null, 8, (Object) null);
                m76.C6235a.m48110a(m765, (Integer) null, "DROP TABLE IF EXISTS PairingDao", 0, (rc2) null, 8, (Object) null);
                m76.C6235a.m48110a(m765, (Integer) null, "DROP TABLE IF EXISTS ProposalNamespaceDao", 0, (rc2) null, 8, (Object) null);
                m76.C6235a.m48110a(m765, (Integer) null, "DROP TABLE IF EXISTS ProposalNamespaceExtensionsDao", 0, (rc2) null, 8, (Object) null);
                m76.C6235a.m48110a(m765, (Integer) null, "DROP TABLE IF EXISTS SessionDao", 0, (rc2) null, 8, (Object) null);
                m76.C6235a.m48110a(m765, (Integer) null, "DROP TABLE IF EXISTS TempNamespaceDao", 0, (rc2) null, 8, (Object) null);
                m76.C6235a.m48110a(m765, (Integer) null, "DROP TABLE IF EXISTS TempNamespaceExtensionsDao", 0, (rc2) null, 8, (Object) null);
                m76.C6235a.m48110a(m765, (Integer) null, "CREATE TABLE JsonRpcHistoryDao(\n  id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n  request_id INTEGER UNIQUE NOT NULL,\n  topic TEXT NOT NULL,\n  method TEXT NOT NULL,\n  body TEXT NOT NULL,\n  response TEXT\n)", 0, (rc2) null, 8, (Object) null);
                m76.C6235a.m48110a(m765, (Integer) null, "CREATE TABLE MetaDataDao(\n\tid INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n\tsequence_topic TEXT NOT NULL,\n  \tname TEXT NOT NULL,\n  \tdescription TEXT NOT NULL,\n  \turl TEXT NOT NULL,\n  \tnative TEXT,\n    icons TEXT NOT NULL,\n    type TEXT NOT NULL,\n  \tUNIQUE(sequence_topic, type)\n)", 0, (rc2) null, 8, (Object) null);
                m76.C6235a.m48110a(m765, (Integer) null, "CREATE TABLE NamespaceDao(\n    id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n    session_id INTEGER NOT NULL,\n    key TEXT NOT NULL,\n    accounts TEXT NOT NULL,\n    methods TEXT NOT NULL,\n    events TEXT NOT NULL,\n    request_id INTEGER NOT NULL,\n    UNIQUE(session_id, key)\n)", 0, (rc2) null, 8, (Object) null);
                m76.C6235a.m48110a(m765, (Integer) null, "CREATE TABLE NamespaceExtensionsDao(\n    id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n    namespace_key TEXT NOT NULL,\n    session_id INTEGER NOT NULL,\n    accounts TEXT NOT NULL,\n    methods TEXT NOT NULL,\n    events TEXT  NOT NULL\n)", 0, (rc2) null, 8, (Object) null);
                m76.C6235a.m48110a(m765, (Integer) null, "CREATE TABLE PairingDao (\n    id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n    topic TEXT UNIQUE NOT NULL,\n    expiry INTEGER NOT NULL,\n    relay_protocol TEXT NOT NULL,\n    relay_data TEXT,\n    uri TEXT NOT NULL,\n    is_active INTEGER NOT NULL\n)", 0, (rc2) null, 8, (Object) null);
                m76.C6235a.m48110a(m765, (Integer) null, "CREATE TABLE ProposalNamespaceDao (\n    id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n    session_id INTEGER NOT NULL,\n    key TEXT NOT NULL,\n    chains TEXT NOT NULL,\n    methods TEXT NOT NULL,\n    events TEXT NOT NULL,\n    UNIQUE(session_id, key)\n)", 0, (rc2) null, 8, (Object) null);
                m76.C6235a.m48110a(m765, (Integer) null, "CREATE TABLE ProposalNamespaceExtensionsDao (\n    id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n    namespace_key TEXT NOT NULL,\n    session_id INTEGER NOT NULL,\n    chains TEXT NOT NULL,\n    methods TEXT NOT NULL,\n    events TEXT NOT NULL\n)", 0, (rc2) null, 8, (Object) null);
                m76.C6235a.m48110a(m765, (Integer) null, "CREATE TABLE SessionDao(\n   id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n   topic TEXT UNIQUE NOT NULL,\n   expiry INTEGER NOT NULL,\n   relay_protocol TEXT NOT NULL,\n   relay_data TEXT,\n   controller_key TEXT,\n   self_participant TEXT NOT NULL,\n   peer_participant TEXT,\n   is_acknowledged INTEGER NOT NULL\n)", 0, (rc2) null, 8, (Object) null);
                m76.C6235a.m48110a(m765, (Integer) null, "CREATE TABLE TempNamespaceDao(\n    request_id INTEGER PRIMARY KEY NOT NULL,\n    session_id INTEGER NOT NULL,\n    topic TEXT NOT NULL,\n    key TEXT NOT NULL,\n    accounts TEXT NOT NULL,\n    methods TEXT NOT NULL,\n    events TEXT NOT NULL,\n    isAcknowledged INTEGER DEFAULT 0\n)", 0, (rc2) null, 8, (Object) null);
                m76.C6235a.m48110a(m765, (Integer) null, "CREATE TABLE TempNamespaceExtensionsDao(\n    id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n    namespace_key TEXT NOT NULL,\n    session_id INTEGER NOT NULL,\n    topic TEXT NOT NULL,\n    accounts TEXT NOT NULL,\n    methods TEXT NOT NULL,\n    events TEXT  NOT NULL,\n    request_id INTEGER NOT NULL\n)", 0, (rc2) null, 8, (Object) null);
            }
            if (i <= 5 && i2 > 5) {
                m76 m766 = m76;
                m76.C6235a.m48110a(m766, (Integer) null, "DROP TABLE IF EXISTS JsonRpcHistoryDao", 0, (rc2) null, 8, (Object) null);
                m76.C6235a.m48110a(m766, (Integer) null, "DROP TABLE IF EXISTS MetaDataDao", 0, (rc2) null, 8, (Object) null);
                m76.C6235a.m48110a(m766, (Integer) null, "DROP TABLE IF EXISTS MetaDataDao", 0, (rc2) null, 8, (Object) null);
                m76.C6235a.m48110a(m766, (Integer) null, "DROP TABLE IF EXISTS NamespaceDao", 0, (rc2) null, 8, (Object) null);
                m76.C6235a.m48110a(m766, (Integer) null, "DROP TABLE IF EXISTS NamespaceExtensionsDao", 0, (rc2) null, 8, (Object) null);
                m76.C6235a.m48110a(m766, (Integer) null, "DROP TABLE IF EXISTS PairingDao", 0, (rc2) null, 8, (Object) null);
                m76.C6235a.m48110a(m766, (Integer) null, "DROP TABLE IF EXISTS ProposalNamespaceDao", 0, (rc2) null, 8, (Object) null);
                m76.C6235a.m48110a(m766, (Integer) null, "DROP TABLE IF EXISTS ProposalNamespaceExtensionsDao", 0, (rc2) null, 8, (Object) null);
                m76.C6235a.m48110a(m766, (Integer) null, "DROP TABLE IF EXISTS SessionDao", 0, (rc2) null, 8, (Object) null);
                m76.C6235a.m48110a(m766, (Integer) null, "DROP TABLE IF EXISTS TempNamespaceDao", 0, (rc2) null, 8, (Object) null);
                m76.C6235a.m48110a(m766, (Integer) null, "DROP TABLE IF EXISTS TempNamespaceExtensionsDao", 0, (rc2) null, 8, (Object) null);
                m76.C6235a.m48110a(m766, (Integer) null, "CREATE TABLE NamespaceDao(\n    id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n    session_id INTEGER NOT NULL,\n    key TEXT NOT NULL,\n    accounts TEXT NOT NULL,\n    methods TEXT NOT NULL,\n    events TEXT NOT NULL,\n    request_id INTEGER NOT NULL,\n    UNIQUE(session_id, key)\n)", 0, (rc2) null, 8, (Object) null);
                m76.C6235a.m48110a(m766, (Integer) null, "CREATE TABLE NamespaceExtensionsDao(\n    id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n    namespace_key TEXT NOT NULL,\n    session_id INTEGER NOT NULL,\n    accounts TEXT NOT NULL,\n    methods TEXT NOT NULL,\n    events TEXT  NOT NULL\n)", 0, (rc2) null, 8, (Object) null);
                m76.C6235a.m48110a(m766, (Integer) null, "CREATE TABLE ProposalNamespaceDao (\n    id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n    session_id INTEGER NOT NULL,\n    key TEXT NOT NULL,\n    chains TEXT NOT NULL,\n    methods TEXT NOT NULL,\n    events TEXT NOT NULL,\n    UNIQUE(session_id, key)\n)", 0, (rc2) null, 8, (Object) null);
                m76.C6235a.m48110a(m766, (Integer) null, "CREATE TABLE ProposalNamespaceExtensionsDao (\n    id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n    namespace_key TEXT NOT NULL,\n    session_id INTEGER NOT NULL,\n    chains TEXT NOT NULL,\n    methods TEXT NOT NULL,\n    events TEXT NOT NULL\n)", 0, (rc2) null, 8, (Object) null);
                m76.C6235a.m48110a(m766, (Integer) null, "CREATE TABLE SessionDao(\n   id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n   topic TEXT UNIQUE NOT NULL,\n   pairingTopic TEXT NOT NULL,\n   expiry INTEGER NOT NULL,\n   relay_protocol TEXT NOT NULL,\n   relay_data TEXT,\n   controller_key TEXT,\n   self_participant TEXT NOT NULL,\n   peer_participant TEXT,\n   is_acknowledged INTEGER NOT NULL\n)", 0, (rc2) null, 8, (Object) null);
                m76.C6235a.m48110a(m766, (Integer) null, "CREATE TABLE TempNamespaceDao(\n    request_id INTEGER PRIMARY KEY NOT NULL,\n    session_id INTEGER NOT NULL,\n    topic TEXT NOT NULL,\n    key TEXT NOT NULL,\n    accounts TEXT NOT NULL,\n    methods TEXT NOT NULL,\n    events TEXT NOT NULL,\n    isAcknowledged INTEGER DEFAULT 0\n)", 0, (rc2) null, 8, (Object) null);
                m76.C6235a.m48110a(m766, (Integer) null, "CREATE TABLE TempNamespaceExtensionsDao(\n    id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n    namespace_key TEXT NOT NULL,\n    session_id INTEGER NOT NULL,\n    topic TEXT NOT NULL,\n    accounts TEXT NOT NULL,\n    methods TEXT NOT NULL,\n    events TEXT  NOT NULL,\n    request_id INTEGER NOT NULL\n)", 0, (rc2) null, 8, (Object) null);
            }
        }

        public int getVersion() {
            return 6;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f16(m76 m76, a34 a34, d34 d34, qx4 qx4, tx4 tx4, sm6 sm6, vm6 vm6) {
        super(m76);
        vx2.m53591g(m76, "driver");
        vx2.m53591g(a34, "NamespaceDaoAdapter");
        vx2.m53591g(d34, "NamespaceExtensionsDaoAdapter");
        vx2.m53591g(qx4, "ProposalNamespaceDaoAdapter");
        vx2.m53591g(tx4, "ProposalNamespaceExtensionsDaoAdapter");
        vx2.m53591g(sm6, "TempNamespaceDaoAdapter");
        vx2.m53591g(vm6, "TempNamespaceExtensionsDaoAdapter");
        this.f28713d = a34;
        this.f28714e = d34;
        this.f28715f = qx4;
        this.f28716g = tx4;
        this.f28717h = sm6;
        this.f28718i = vm6;
        this.f28719j = new NamespaceDaoQueriesImpl(this, m76);
        this.f28720k = new NamespaceExtensionDaoQueriesImpl(this, m76);
        this.f28721l = new ProposalNamespaceDaoQueriesImpl(this, m76);
        this.f28722m = new ProposalNamespaceExtensionDaoQueriesImpl(this, m76);
        this.f28723n = new SessionDaoQueriesImpl(this, m76);
        this.f28724o = new TempNamespaceDaoQueriesImpl(this, m76);
        this.f28725p = new TempNamespaceExtensionDaoQueriesImpl(this, m76);
    }

    /* renamed from: h0 */
    public final a34 mo42468h0() {
        return this.f28713d;
    }

    /* renamed from: i0 */
    public NamespaceDaoQueriesImpl mo42108T() {
        return this.f28719j;
    }

    /* renamed from: j0 */
    public NamespaceExtensionDaoQueriesImpl mo42109Z() {
        return this.f28720k;
    }

    /* renamed from: k0 */
    public final d34 mo42471k0() {
        return this.f28714e;
    }

    /* renamed from: l0 */
    public final qx4 mo42472l0() {
        return this.f28715f;
    }

    /* renamed from: m0 */
    public ProposalNamespaceDaoQueriesImpl mo42110e() {
        return this.f28721l;
    }

    /* renamed from: n0 */
    public ProposalNamespaceExtensionDaoQueriesImpl mo42107F() {
        return this.f28722m;
    }

    /* renamed from: o0 */
    public final tx4 mo42475o0() {
        return this.f28716g;
    }

    /* renamed from: p0 */
    public SessionDaoQueriesImpl mo42113r() {
        return this.f28723n;
    }

    /* renamed from: q0 */
    public final sm6 mo42477q0() {
        return this.f28717h;
    }

    /* renamed from: r0 */
    public TempNamespaceDaoQueriesImpl mo42112l() {
        return this.f28724o;
    }

    /* renamed from: s0 */
    public TempNamespaceExtensionDaoQueriesImpl mo42111g() {
        return this.f28725p;
    }

    /* renamed from: t0 */
    public final vm6 mo42480t0() {
        return this.f28718i;
    }
}
