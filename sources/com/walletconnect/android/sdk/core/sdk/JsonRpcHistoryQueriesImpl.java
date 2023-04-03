package com.walletconnect.android.sdk.core.sdk;

import com.squareup.sqldelight.C5463a;
import java.util.List;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0016\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u000223B\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0017\u0012\u0006\u0010\u001d\u001a\u00020\u001a¢\u0006\u0004\b0\u00101JN\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\b\b\u0000\u0010\u0004*\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052,\u0010\t\u001a(\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0016J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\nH\u0016J(\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\bH\u0016J\u001a\u0010\u0015\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\bH\u0016R\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR$\u0010#\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\u001e8\u0000X\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R$\u0010&\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\u001e8\u0000X\u0004¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b%\u0010\"R$\u0010)\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\u001e8\u0000X\u0004¢\u0006\f\n\u0004\b'\u0010 \u001a\u0004\b(\u0010\"R$\u0010,\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\u001e8\u0000X\u0004¢\u0006\f\n\u0004\b*\u0010 \u001a\u0004\b+\u0010\"R$\u0010/\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\u001e8\u0000X\u0004¢\u0006\f\n\u0004\b-\u0010 \u001a\u0004\b.\u0010\"¨\u00064"}, mo44877d2 = {"Lcom/walletconnect/android/sdk/core/sdk/JsonRpcHistoryQueriesImpl;", "Lcom/squareup/sqldelight/a;", "Lp63;", "", "T", "", "request_id", "Lkotlin/Function5;", "", "mapper", "Lrz4;", "U", "", "R", "o", "topic", "method", "body", "Lr37;", "L", "response", "d", "K", "Lci;", "Lci;", "database", "Lm76;", "e", "Lm76;", "driver", "", "f", "Ljava/util/List;", "k0", "()Ljava/util/List;", "getJsonRpcHistoryRecord", "g", "m0", "getJsonRpcRecordsByTopic", "h", "l0", "getJsonRpcRecords", "i", "j0", "doesJsonRpcNotExist", "j", "getSelectLastInsertedRowId$sdk_release", "selectLastInsertedRowId", "<init>", "(Lci;Lm76;)V", "DoesJsonRpcNotExistQuery", "GetJsonRpcHistoryRecordQuery", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: AndroidCoreDatabaseImpl.kt */
public final class JsonRpcHistoryQueriesImpl extends C5463a implements p63 {

    /* renamed from: d */
    public final C3944ci f27255d;

    /* renamed from: e */
    public final m76 f27256e;

    /* renamed from: f */
    public final List<rz4<?>> f27257f = fe2.m44300a();

    /* renamed from: g */
    public final List<rz4<?>> f27258g = fe2.m44300a();

    /* renamed from: h */
    public final List<rz4<?>> f27259h = fe2.m44300a();

    /* renamed from: i */
    public final List<rz4<?>> f27260i = fe2.m44300a();

    /* renamed from: j */
    public final List<rz4<?>> f27261j = fe2.m44300a();

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B#\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0012"}, mo44877d2 = {"Lcom/walletconnect/android/sdk/core/sdk/JsonRpcHistoryQueriesImpl$DoesJsonRpcNotExistQuery;", "", "T", "Lrz4;", "Ll76;", "a", "", "toString", "", "e", "J", "g", "()J", "request_id", "Lkotlin/Function1;", "mapper", "<init>", "(Lcom/walletconnect/android/sdk/core/sdk/JsonRpcHistoryQueriesImpl;JLrc2;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* compiled from: AndroidCoreDatabaseImpl.kt */
    public final class DoesJsonRpcNotExistQuery<T> extends rz4<T> {

        /* renamed from: e */
        public final long f27262e;

        /* renamed from: f */
        public final /* synthetic */ JsonRpcHistoryQueriesImpl f27263f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public DoesJsonRpcNotExistQuery(JsonRpcHistoryQueriesImpl jsonRpcHistoryQueriesImpl, long j, rc2<? super l76, ? extends T> rc2) {
            super(jsonRpcHistoryQueriesImpl.mo40547j0(), rc2);
            vx2.m53591g(rc2, "mapper");
            this.f27263f = jsonRpcHistoryQueriesImpl;
            this.f27262e = j;
        }

        /* renamed from: a */
        public l76 mo40552a() {
            return this.f27263f.f27256e.mo39622r0(614208135, "SELECT NOT EXISTS (\n    SELECT 1\n    FROM JsonRpcHistoryDao\n    WHERE request_id = ?\n    LIMIT 1\n)", 1, new JsonRpcHistoryQueriesImpl$DoesJsonRpcNotExistQuery$execute$1(this));
        }

        /* renamed from: g */
        public final long mo40553g() {
            return this.f27262e;
        }

        public String toString() {
            return "JsonRpcHistory.sq:doesJsonRpcNotExist";
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B#\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0012"}, mo44877d2 = {"Lcom/walletconnect/android/sdk/core/sdk/JsonRpcHistoryQueriesImpl$GetJsonRpcHistoryRecordQuery;", "", "T", "Lrz4;", "Ll76;", "a", "", "toString", "", "e", "J", "g", "()J", "request_id", "Lkotlin/Function1;", "mapper", "<init>", "(Lcom/walletconnect/android/sdk/core/sdk/JsonRpcHistoryQueriesImpl;JLrc2;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* compiled from: AndroidCoreDatabaseImpl.kt */
    public final class GetJsonRpcHistoryRecordQuery<T> extends rz4<T> {

        /* renamed from: e */
        public final long f27264e;

        /* renamed from: f */
        public final /* synthetic */ JsonRpcHistoryQueriesImpl f27265f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public GetJsonRpcHistoryRecordQuery(JsonRpcHistoryQueriesImpl jsonRpcHistoryQueriesImpl, long j, rc2<? super l76, ? extends T> rc2) {
            super(jsonRpcHistoryQueriesImpl.mo40548k0(), rc2);
            vx2.m53591g(rc2, "mapper");
            this.f27265f = jsonRpcHistoryQueriesImpl;
            this.f27264e = j;
        }

        /* renamed from: a */
        public l76 mo40552a() {
            return this.f27265f.f27256e.mo39622r0(-1563490947, "SELECT request_id, topic, method, body, response\nFROM JsonRpcHistoryDao\nWHERE  request_id = ?", 1, new JsonRpcHistoryQueriesImpl$GetJsonRpcHistoryRecordQuery$execute$1(this));
        }

        /* renamed from: g */
        public final long mo40555g() {
            return this.f27264e;
        }

        public String toString() {
            return "JsonRpcHistory.sq:getJsonRpcHistoryRecord";
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JsonRpcHistoryQueriesImpl(C3944ci ciVar, m76 m76) {
        super(m76);
        vx2.m53591g(ciVar, "database");
        vx2.m53591g(m76, "driver");
        this.f27255d = ciVar;
        this.f27256e = m76;
    }

    /* renamed from: K */
    public void mo40542K(String str) {
        vx2.m53591g(str, "topic");
        this.f27256e.mo39621m1(-319142653, "DELETE FROM JsonRpcHistoryDao\nWHERE topic = ?", 1, new JsonRpcHistoryQueriesImpl$deleteJsonRpcHistory$1(str));
        mo39604f0(-319142653, new JsonRpcHistoryQueriesImpl$deleteJsonRpcHistory$2(this));
    }

    /* renamed from: L */
    public void mo40543L(long j, String str, String str2, String str3) {
        vx2.m53591g(str, "topic");
        vx2.m53591g(str2, "method");
        vx2.m53591g(str3, "body");
        this.f27256e.mo39621m1(-1017809526, "INSERT OR ABORT INTO JsonRpcHistoryDao (request_id, topic, method, body)\nVALUES (?, ?, ?, ?)", 4, new JsonRpcHistoryQueriesImpl$insertOrAbortJsonRpcHistory$1(j, str, str2, str3));
        mo39604f0(-1017809526, new JsonRpcHistoryQueriesImpl$insertOrAbortJsonRpcHistory$2(this));
    }

    /* renamed from: R */
    public rz4<Boolean> mo40544R(long j) {
        return new DoesJsonRpcNotExistQuery(this, j, JsonRpcHistoryQueriesImpl$doesJsonRpcNotExist$1.INSTANCE);
    }

    /* renamed from: U */
    public <T> rz4<T> mo40545U(long j, md2<? super Long, ? super String, ? super String, ? super String, ? super String, ? extends T> md2) {
        vx2.m53591g(md2, "mapper");
        return new GetJsonRpcHistoryRecordQuery(this, j, new JsonRpcHistoryQueriesImpl$getJsonRpcHistoryRecord$1(md2));
    }

    /* renamed from: d */
    public void mo40546d(String str, long j) {
        this.f27256e.mo39621m1(-1110103135, "UPDATE JsonRpcHistoryDao\nSET response = ?\nWHERE request_id = ?", 2, new JsonRpcHistoryQueriesImpl$updateJsonRpcHistory$1(str, j));
        mo39604f0(-1110103135, new JsonRpcHistoryQueriesImpl$updateJsonRpcHistory$2(this));
    }

    /* renamed from: j0 */
    public final List<rz4<?>> mo40547j0() {
        return this.f27260i;
    }

    /* renamed from: k0 */
    public final List<rz4<?>> mo40548k0() {
        return this.f27257f;
    }

    /* renamed from: l0 */
    public final List<rz4<?>> mo40549l0() {
        return this.f27259h;
    }

    /* renamed from: m0 */
    public final List<rz4<?>> mo40550m0() {
        return this.f27258g;
    }

    /* renamed from: o */
    public rz4<Long> mo40551o() {
        return k05.m46848a(-36025942, this.f27261j, this.f27256e, "JsonRpcHistory.sq", "selectLastInsertedRowId", "SELECT last_insert_rowid()", JsonRpcHistoryQueriesImpl$selectLastInsertedRowId$1.INSTANCE);
    }
}
