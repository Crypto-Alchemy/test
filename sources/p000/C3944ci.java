package p000;

import com.squareup.sqldelight.C5463a;
import com.walletconnect.android.sdk.core.sdk.JsonRpcHistoryQueriesImpl;
import com.walletconnect.android.sdk.core.sdk.MetaDataQueriesImpl;
import com.walletconnect.android.sdk.core.sdk.PairingQueriesImpl;
import kotlin.Metadata;
import p000.m76;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u001fB\u0017\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\b\u001a\u00020\u00038\u0000X\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\u000e\u001a\u00020\t8\u0016X\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0014\u001a\u00020\u000f8\u0016X\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u001a\u001a\u00020\u00158\u0016X\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006 "}, mo44877d2 = {"Lci;", "Lcom/squareup/sqldelight/a;", "Lbi;", "Lvu3;", "d", "Lvu3;", "i0", "()Lvu3;", "MetaDataAdapter", "Lcom/walletconnect/android/sdk/core/sdk/JsonRpcHistoryQueriesImpl;", "e", "Lcom/walletconnect/android/sdk/core/sdk/JsonRpcHistoryQueriesImpl;", "h0", "()Lcom/walletconnect/android/sdk/core/sdk/JsonRpcHistoryQueriesImpl;", "jsonRpcHistoryQueries", "Lcom/walletconnect/android/sdk/core/sdk/MetaDataQueriesImpl;", "f", "Lcom/walletconnect/android/sdk/core/sdk/MetaDataQueriesImpl;", "j0", "()Lcom/walletconnect/android/sdk/core/sdk/MetaDataQueriesImpl;", "metaDataQueries", "Lcom/walletconnect/android/sdk/core/sdk/PairingQueriesImpl;", "g", "Lcom/walletconnect/android/sdk/core/sdk/PairingQueriesImpl;", "k0", "()Lcom/walletconnect/android/sdk/core/sdk/PairingQueriesImpl;", "pairingQueries", "Lm76;", "driver", "<init>", "(Lm76;Lvu3;)V", "a", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: ci */
/* compiled from: AndroidCoreDatabaseImpl.kt */
public final class C3944ci extends C5463a implements C3896bi {

    /* renamed from: d */
    public final vu3 f21784d;

    /* renamed from: e */
    public final JsonRpcHistoryQueriesImpl f21785e;

    /* renamed from: f */
    public final MetaDataQueriesImpl f21786f;

    /* renamed from: g */
    public final PairingQueriesImpl f21787g;

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J \u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016R\u0014\u0010\f\u001a\u00020\u00068VX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, mo44877d2 = {"Lci$a;", "Lm76$b;", "Lm76;", "driver", "Lr37;", "a", "", "oldVersion", "newVersion", "b", "getVersion", "()I", "version", "<init>", "()V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: ci$a */
    /* compiled from: AndroidCoreDatabaseImpl.kt */
    public static final class C3945a implements m76.C6236b {

        /* renamed from: a */
        public static final C3945a f21788a = new C3945a();

        /* renamed from: a */
        public void mo30018a(m76 m76) {
            vx2.m53591g(m76, "driver");
            m76 m762 = m76;
            m76.C6235a.m48110a(m762, (Integer) null, "CREATE TABLE MetaData(\n\tid INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n\tsequence_topic TEXT NOT NULL,\n  \tname TEXT NOT NULL,\n  \tdescription TEXT NOT NULL,\n  \turl TEXT NOT NULL,\n  \ticons TEXT NOT NULL,\n  \tnative TEXT,\n  \ttype TEXT NOT NULL,\n  \tUNIQUE(sequence_topic, type)\n)", 0, (rc2) null, 8, (Object) null);
            m76.C6235a.m48110a(m762, (Integer) null, "CREATE TABLE JsonRpcHistoryDao(\n  id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n  request_id INTEGER UNIQUE NOT NULL,\n  topic TEXT NOT NULL,\n  method TEXT NOT NULL,\n  body TEXT NOT NULL,\n  response TEXT\n)", 0, (rc2) null, 8, (Object) null);
            m76.C6235a.m48110a(m762, (Integer) null, "CREATE TABLE Pairing (\n    id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n    topic TEXT UNIQUE NOT NULL,\n    expiry INTEGER NOT NULL,\n    relay_protocol TEXT NOT NULL,\n    relay_data TEXT,\n    uri TEXT NOT NULL,\n    methods TEXT NOT NULL,\n    is_active INTEGER NOT NULL\n)", 0, (rc2) null, 8, (Object) null);
        }

        /* renamed from: b */
        public void mo30019b(m76 m76, int i, int i2) {
            vx2.m53591g(m76, "driver");
        }

        public int getVersion() {
            return 1;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3944ci(m76 m76, vu3 vu3) {
        super(m76);
        vx2.m53591g(m76, "driver");
        vx2.m53591g(vu3, "MetaDataAdapter");
        this.f21784d = vu3;
        this.f21785e = new JsonRpcHistoryQueriesImpl(this, m76);
        this.f21786f = new MetaDataQueriesImpl(this, m76);
        this.f21787g = new PairingQueriesImpl(this, m76);
    }

    /* renamed from: h0 */
    public JsonRpcHistoryQueriesImpl mo29585b() {
        return this.f21785e;
    }

    /* renamed from: i0 */
    public final vu3 mo30015i0() {
        return this.f21784d;
    }

    /* renamed from: j0 */
    public MetaDataQueriesImpl mo29586c() {
        return this.f21786f;
    }

    /* renamed from: k0 */
    public PairingQueriesImpl mo29587f() {
        return this.f21787g;
    }
}
