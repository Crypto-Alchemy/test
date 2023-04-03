package com.walletconnect.sign.sdk;

import com.squareup.sqldelight.C5463a;
import java.util.List;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001!B\u0017\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b\u001f\u0010 JZ\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\b\b\u0000\u0010\u0004*\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u000720\u0010\u000b\u001a,\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n\u0012\u0004\u0012\u00028\u00000\tH\u0016J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0005H\u0016R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R$\u0010\u001e\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f0\u00198\u0000X\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\""}, mo44877d2 = {"Lcom/walletconnect/sign/sdk/TempNamespaceExtensionDaoQueriesImpl;", "Lcom/squareup/sqldelight/a;", "Lum6;", "", "T", "", "namespace_key", "", "session_id", "Lkotlin/Function3;", "", "mapper", "Lrz4;", "a", "topic", "Lr37;", "B", "Lf16;", "d", "Lf16;", "database", "Lm76;", "e", "Lm76;", "driver", "", "f", "Ljava/util/List;", "j0", "()Ljava/util/List;", "getNamespaceExtensionByNamespaceKeyAndSessionId", "<init>", "(Lf16;Lm76;)V", "GetNamespaceExtensionByNamespaceKeyAndSessionIdQuery", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: SignDatabaseImpl.kt */
public final class TempNamespaceExtensionDaoQueriesImpl extends C5463a implements um6 {

    /* renamed from: d */
    public final f16 f27823d;

    /* renamed from: e */
    public final m76 f27824e;

    /* renamed from: f */
    public final List<rz4<?>> f27825f = fe2.m44300a();

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0004\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B+\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\u0012\u001a\u00020\r\u0012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0017\u0010\f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0017"}, mo44877d2 = {"Lcom/walletconnect/sign/sdk/TempNamespaceExtensionDaoQueriesImpl$GetNamespaceExtensionByNamespaceKeyAndSessionIdQuery;", "", "T", "Lrz4;", "Ll76;", "a", "", "toString", "e", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "namespace_key", "", "f", "J", "h", "()J", "session_id", "Lkotlin/Function1;", "mapper", "<init>", "(Lcom/walletconnect/sign/sdk/TempNamespaceExtensionDaoQueriesImpl;Ljava/lang/String;JLrc2;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* compiled from: SignDatabaseImpl.kt */
    public final class GetNamespaceExtensionByNamespaceKeyAndSessionIdQuery<T> extends rz4<T> {

        /* renamed from: e */
        public final String f27826e;

        /* renamed from: f */
        public final long f27827f;

        /* renamed from: g */
        public final /* synthetic */ TempNamespaceExtensionDaoQueriesImpl f27828g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public GetNamespaceExtensionByNamespaceKeyAndSessionIdQuery(TempNamespaceExtensionDaoQueriesImpl tempNamespaceExtensionDaoQueriesImpl, String str, long j, rc2<? super l76, ? extends T> rc2) {
            super(tempNamespaceExtensionDaoQueriesImpl.mo41493j0(), rc2);
            vx2.m53591g(str, "namespace_key");
            vx2.m53591g(rc2, "mapper");
            this.f27828g = tempNamespaceExtensionDaoQueriesImpl;
            this.f27826e = str;
            this.f27827f = j;
        }

        /* renamed from: a */
        public l76 mo40552a() {
            return this.f27828g.f27824e.mo39622r0(1867470919, "SELECT accounts, methods, events\nFROM TempNamespaceExtensionsDao\nWHERE namespace_key = ? AND session_id = ?", 2, new C5697xe244e20f(this));
        }

        /* renamed from: g */
        public final String mo41494g() {
            return this.f27826e;
        }

        /* renamed from: h */
        public final long mo41495h() {
            return this.f27827f;
        }

        public String toString() {
            return "TempNamespaceExtensionDao.sq:getNamespaceExtensionByNamespaceKeyAndSessionId";
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TempNamespaceExtensionDaoQueriesImpl(f16 f16, m76 m76) {
        super(m76);
        vx2.m53591g(f16, "database");
        vx2.m53591g(m76, "driver");
        this.f27823d = f16;
        this.f27824e = m76;
    }

    /* renamed from: B */
    public void mo41491B(String str) {
        vx2.m53591g(str, "topic");
        this.f27824e.mo39621m1(-208671688, "DELETE FROM TempNamespaceExtensionsDao\nWHERE topic = ?", 1, new C5698x17930615(str));
        mo39604f0(-208671688, new C5699x17930616(this));
    }

    /* renamed from: a */
    public <T> rz4<T> mo41492a(String str, long j, id2<? super List<String>, ? super List<String>, ? super List<String>, ? extends T> id2) {
        vx2.m53591g(str, "namespace_key");
        vx2.m53591g(id2, "mapper");
        return new GetNamespaceExtensionByNamespaceKeyAndSessionIdQuery(this, str, j, new C5700xb438f1c4(id2, this));
    }

    /* renamed from: j0 */
    public final List<rz4<?>> mo41493j0() {
        return this.f27825f;
    }
}
