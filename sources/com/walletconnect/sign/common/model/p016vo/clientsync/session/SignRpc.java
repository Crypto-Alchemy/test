package com.walletconnect.sign.common.model.p016vo.clientsync.session;

import com.trustwallet.walletconnect.WCClientKt;
import com.walletconnect.sign.common.model.p016vo.clientsync.session.params.SignParams;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\b\u0005\u0006\u0007\b\t\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0001\b\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014¨\u0006\u0015"}, mo44877d2 = {"Lcom/walletconnect/sign/common/model/vo/clientsync/session/SignRpc;", "Lo63;", "Lcom/walletconnect/sign/common/model/vo/clientsync/session/params/SignParams;", "<init>", "()V", "SessionDelete", "SessionEvent", "SessionExtend", "SessionPing", "SessionPropose", "SessionRequest", "SessionSettle", "SessionUpdate", "Lcom/walletconnect/sign/common/model/vo/clientsync/session/SignRpc$SessionDelete;", "Lcom/walletconnect/sign/common/model/vo/clientsync/session/SignRpc$SessionEvent;", "Lcom/walletconnect/sign/common/model/vo/clientsync/session/SignRpc$SessionExtend;", "Lcom/walletconnect/sign/common/model/vo/clientsync/session/SignRpc$SessionPing;", "Lcom/walletconnect/sign/common/model/vo/clientsync/session/SignRpc$SessionPropose;", "Lcom/walletconnect/sign/common/model/vo/clientsync/session/SignRpc$SessionRequest;", "Lcom/walletconnect/sign/common/model/vo/clientsync/session/SignRpc$SessionSettle;", "Lcom/walletconnect/sign/common/model/vo/clientsync/session/SignRpc$SessionUpdate;", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: com.walletconnect.sign.common.model.vo.clientsync.session.SignRpc */
/* compiled from: SignRpc.kt */
public abstract class SignRpc implements o63<SignParams> {

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ1\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u00042\b\b\u0003\u0010\b\u001a\u00020\u0007HÆ\u0001J\t\u0010\n\u001a\u00020\u0004HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0011\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\u0017R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0015\u0010\u001c¨\u0006\u001f"}, mo44877d2 = {"Lcom/walletconnect/sign/common/model/vo/clientsync/session/SignRpc$SessionDelete;", "Lcom/walletconnect/sign/common/model/vo/clientsync/session/SignRpc;", "", "id", "", "jsonrpc", "method", "Lcom/walletconnect/sign/common/model/vo/clientsync/session/params/SignParams$DeleteParams;", "params", "copy", "toString", "", "hashCode", "", "other", "", "equals", "a", "J", "getId", "()J", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "c", "getMethod", "d", "Lcom/walletconnect/sign/common/model/vo/clientsync/session/params/SignParams$DeleteParams;", "()Lcom/walletconnect/sign/common/model/vo/clientsync/session/params/SignParams$DeleteParams;", "<init>", "(JLjava/lang/String;Ljava/lang/String;Lcom/walletconnect/sign/common/model/vo/clientsync/session/params/SignParams$DeleteParams;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    @h43(generateAdapter = true)
    /* renamed from: com.walletconnect.sign.common.model.vo.clientsync.session.SignRpc$SessionDelete */
    /* compiled from: SignRpc.kt */
    public static final class SessionDelete extends SignRpc {

        /* renamed from: a */
        public final long f27546a;

        /* renamed from: b */
        public final String f27547b;

        /* renamed from: c */
        public final String f27548c;

        /* renamed from: d */
        public final SignParams.DeleteParams f27549d;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ SessionDelete(long j, String str, String str2, SignParams.DeleteParams deleteParams, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, (i & 2) != 0 ? WCClientKt.JSONRPC_VERSION : str, (i & 4) != 0 ? "wc_sessionDelete" : str2, deleteParams);
        }

        /* renamed from: a */
        public String mo41043a() {
            return this.f27547b;
        }

        /* renamed from: b */
        public SignParams.DeleteParams getParams() {
            return this.f27549d;
        }

        public final SessionDelete copy(@y33(name = "id") long j, @y33(name = "jsonrpc") String str, @y33(name = "method") String str2, @y33(name = "params") SignParams.DeleteParams deleteParams) {
            vx2.m53591g(str, "jsonrpc");
            vx2.m53591g(str2, "method");
            vx2.m53591g(deleteParams, "params");
            return new SessionDelete(j, str, str2, deleteParams);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SessionDelete)) {
                return false;
            }
            SessionDelete sessionDelete = (SessionDelete) obj;
            return getId() == sessionDelete.getId() && vx2.m53586b(mo41043a(), sessionDelete.mo41043a()) && vx2.m53586b(getMethod(), sessionDelete.getMethod()) && vx2.m53586b(getParams(), sessionDelete.getParams());
        }

        public long getId() {
            return this.f27546a;
        }

        public String getMethod() {
            return this.f27548c;
        }

        public int hashCode() {
            return (((((au0.m10781a(getId()) * 31) + mo41043a().hashCode()) * 31) + getMethod().hashCode()) * 31) + getParams().hashCode();
        }

        public String toString() {
            long id = getId();
            String a = mo41043a();
            String method = getMethod();
            SignParams.DeleteParams b = getParams();
            return "SessionDelete(id=" + id + ", jsonrpc=" + a + ", method=" + method + ", params=" + b + ")";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public SessionDelete(@y33(name = "id") long j, @y33(name = "jsonrpc") String str, @y33(name = "method") String str2, @y33(name = "params") SignParams.DeleteParams deleteParams) {
            super((DefaultConstructorMarker) null);
            vx2.m53591g(str, "jsonrpc");
            vx2.m53591g(str2, "method");
            vx2.m53591g(deleteParams, "params");
            this.f27546a = j;
            this.f27547b = str;
            this.f27548c = str2;
            this.f27549d = deleteParams;
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ1\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u00042\b\b\u0003\u0010\b\u001a\u00020\u0007HÆ\u0001J\t\u0010\n\u001a\u00020\u0004HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0011\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\u0017R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0015\u0010\u001c¨\u0006\u001f"}, mo44877d2 = {"Lcom/walletconnect/sign/common/model/vo/clientsync/session/SignRpc$SessionEvent;", "Lcom/walletconnect/sign/common/model/vo/clientsync/session/SignRpc;", "", "id", "", "jsonrpc", "method", "Lcom/walletconnect/sign/common/model/vo/clientsync/session/params/SignParams$EventParams;", "params", "copy", "toString", "", "hashCode", "", "other", "", "equals", "a", "J", "getId", "()J", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "c", "getMethod", "d", "Lcom/walletconnect/sign/common/model/vo/clientsync/session/params/SignParams$EventParams;", "()Lcom/walletconnect/sign/common/model/vo/clientsync/session/params/SignParams$EventParams;", "<init>", "(JLjava/lang/String;Ljava/lang/String;Lcom/walletconnect/sign/common/model/vo/clientsync/session/params/SignParams$EventParams;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    @h43(generateAdapter = true)
    /* renamed from: com.walletconnect.sign.common.model.vo.clientsync.session.SignRpc$SessionEvent */
    /* compiled from: SignRpc.kt */
    public static final class SessionEvent extends SignRpc {

        /* renamed from: a */
        public final long f27550a;

        /* renamed from: b */
        public final String f27551b;

        /* renamed from: c */
        public final String f27552c;

        /* renamed from: d */
        public final SignParams.EventParams f27553d;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ SessionEvent(long j, String str, String str2, SignParams.EventParams eventParams, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, (i & 2) != 0 ? WCClientKt.JSONRPC_VERSION : str, (i & 4) != 0 ? "wc_sessionEvent" : str2, eventParams);
        }

        /* renamed from: a */
        public String mo41049a() {
            return this.f27551b;
        }

        /* renamed from: b */
        public SignParams.EventParams getParams() {
            return this.f27553d;
        }

        public final SessionEvent copy(@y33(name = "id") long j, @y33(name = "jsonrpc") String str, @y33(name = "method") String str2, @y33(name = "params") SignParams.EventParams eventParams) {
            vx2.m53591g(str, "jsonrpc");
            vx2.m53591g(str2, "method");
            vx2.m53591g(eventParams, "params");
            return new SessionEvent(j, str, str2, eventParams);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SessionEvent)) {
                return false;
            }
            SessionEvent sessionEvent = (SessionEvent) obj;
            return getId() == sessionEvent.getId() && vx2.m53586b(mo41049a(), sessionEvent.mo41049a()) && vx2.m53586b(getMethod(), sessionEvent.getMethod()) && vx2.m53586b(getParams(), sessionEvent.getParams());
        }

        public long getId() {
            return this.f27550a;
        }

        public String getMethod() {
            return this.f27552c;
        }

        public int hashCode() {
            return (((((au0.m10781a(getId()) * 31) + mo41049a().hashCode()) * 31) + getMethod().hashCode()) * 31) + getParams().hashCode();
        }

        public String toString() {
            long id = getId();
            String a = mo41049a();
            String method = getMethod();
            SignParams.EventParams b = getParams();
            return "SessionEvent(id=" + id + ", jsonrpc=" + a + ", method=" + method + ", params=" + b + ")";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public SessionEvent(@y33(name = "id") long j, @y33(name = "jsonrpc") String str, @y33(name = "method") String str2, @y33(name = "params") SignParams.EventParams eventParams) {
            super((DefaultConstructorMarker) null);
            vx2.m53591g(str, "jsonrpc");
            vx2.m53591g(str2, "method");
            vx2.m53591g(eventParams, "params");
            this.f27550a = j;
            this.f27551b = str;
            this.f27552c = str2;
            this.f27553d = eventParams;
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ1\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u00042\b\b\u0003\u0010\b\u001a\u00020\u0007HÆ\u0001J\t\u0010\n\u001a\u00020\u0004HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0011\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\u0017R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0015\u0010\u001c¨\u0006\u001f"}, mo44877d2 = {"Lcom/walletconnect/sign/common/model/vo/clientsync/session/SignRpc$SessionExtend;", "Lcom/walletconnect/sign/common/model/vo/clientsync/session/SignRpc;", "", "id", "", "jsonrpc", "method", "Lcom/walletconnect/sign/common/model/vo/clientsync/session/params/SignParams$ExtendParams;", "params", "copy", "toString", "", "hashCode", "", "other", "", "equals", "a", "J", "getId", "()J", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "c", "getMethod", "d", "Lcom/walletconnect/sign/common/model/vo/clientsync/session/params/SignParams$ExtendParams;", "()Lcom/walletconnect/sign/common/model/vo/clientsync/session/params/SignParams$ExtendParams;", "<init>", "(JLjava/lang/String;Ljava/lang/String;Lcom/walletconnect/sign/common/model/vo/clientsync/session/params/SignParams$ExtendParams;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    @h43(generateAdapter = true)
    /* renamed from: com.walletconnect.sign.common.model.vo.clientsync.session.SignRpc$SessionExtend */
    /* compiled from: SignRpc.kt */
    public static final class SessionExtend extends SignRpc {

        /* renamed from: a */
        public final long f27554a;

        /* renamed from: b */
        public final String f27555b;

        /* renamed from: c */
        public final String f27556c;

        /* renamed from: d */
        public final SignParams.ExtendParams f27557d;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ SessionExtend(long j, String str, String str2, SignParams.ExtendParams extendParams, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, (i & 2) != 0 ? WCClientKt.JSONRPC_VERSION : str, (i & 4) != 0 ? "wc_sessionExtend" : str2, extendParams);
        }

        /* renamed from: a */
        public String mo41055a() {
            return this.f27555b;
        }

        /* renamed from: b */
        public SignParams.ExtendParams getParams() {
            return this.f27557d;
        }

        public final SessionExtend copy(@y33(name = "id") long j, @y33(name = "jsonrpc") String str, @y33(name = "method") String str2, @y33(name = "params") SignParams.ExtendParams extendParams) {
            vx2.m53591g(str, "jsonrpc");
            vx2.m53591g(str2, "method");
            vx2.m53591g(extendParams, "params");
            return new SessionExtend(j, str, str2, extendParams);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SessionExtend)) {
                return false;
            }
            SessionExtend sessionExtend = (SessionExtend) obj;
            return getId() == sessionExtend.getId() && vx2.m53586b(mo41055a(), sessionExtend.mo41055a()) && vx2.m53586b(getMethod(), sessionExtend.getMethod()) && vx2.m53586b(getParams(), sessionExtend.getParams());
        }

        public long getId() {
            return this.f27554a;
        }

        public String getMethod() {
            return this.f27556c;
        }

        public int hashCode() {
            return (((((au0.m10781a(getId()) * 31) + mo41055a().hashCode()) * 31) + getMethod().hashCode()) * 31) + getParams().hashCode();
        }

        public String toString() {
            long id = getId();
            String a = mo41055a();
            String method = getMethod();
            SignParams.ExtendParams b = getParams();
            return "SessionExtend(id=" + id + ", jsonrpc=" + a + ", method=" + method + ", params=" + b + ")";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public SessionExtend(@y33(name = "id") long j, @y33(name = "jsonrpc") String str, @y33(name = "method") String str2, @y33(name = "params") SignParams.ExtendParams extendParams) {
            super((DefaultConstructorMarker) null);
            vx2.m53591g(str, "jsonrpc");
            vx2.m53591g(str2, "method");
            vx2.m53591g(extendParams, "params");
            this.f27554a = j;
            this.f27555b = str;
            this.f27556c = str2;
            this.f27557d = extendParams;
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ1\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u00042\b\b\u0003\u0010\b\u001a\u00020\u0007HÆ\u0001J\t\u0010\n\u001a\u00020\u0004HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0011\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\u0017R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0015\u0010\u001c¨\u0006\u001f"}, mo44877d2 = {"Lcom/walletconnect/sign/common/model/vo/clientsync/session/SignRpc$SessionPing;", "Lcom/walletconnect/sign/common/model/vo/clientsync/session/SignRpc;", "", "id", "", "jsonrpc", "method", "Lcom/walletconnect/sign/common/model/vo/clientsync/session/params/SignParams$a;", "params", "copy", "toString", "", "hashCode", "", "other", "", "equals", "a", "J", "getId", "()J", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "c", "getMethod", "d", "Lcom/walletconnect/sign/common/model/vo/clientsync/session/params/SignParams$a;", "()Lcom/walletconnect/sign/common/model/vo/clientsync/session/params/SignParams$a;", "<init>", "(JLjava/lang/String;Ljava/lang/String;Lcom/walletconnect/sign/common/model/vo/clientsync/session/params/SignParams$a;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    @h43(generateAdapter = true)
    /* renamed from: com.walletconnect.sign.common.model.vo.clientsync.session.SignRpc$SessionPing */
    /* compiled from: SignRpc.kt */
    public static final class SessionPing extends SignRpc {

        /* renamed from: a */
        public final long f27558a;

        /* renamed from: b */
        public final String f27559b;

        /* renamed from: c */
        public final String f27560c;

        /* renamed from: d */
        public final SignParams.C5625a f27561d;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ SessionPing(long j, String str, String str2, SignParams.C5625a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, (i & 2) != 0 ? WCClientKt.JSONRPC_VERSION : str, (i & 4) != 0 ? "wc_sessionPing" : str2, aVar);
        }

        /* renamed from: a */
        public String mo41061a() {
            return this.f27559b;
        }

        /* renamed from: b */
        public SignParams.C5625a getParams() {
            return this.f27561d;
        }

        public final SessionPing copy(@y33(name = "id") long j, @y33(name = "jsonrpc") String str, @y33(name = "method") String str2, @y33(name = "params") SignParams.C5625a aVar) {
            vx2.m53591g(str, "jsonrpc");
            vx2.m53591g(str2, "method");
            vx2.m53591g(aVar, "params");
            return new SessionPing(j, str, str2, aVar);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SessionPing)) {
                return false;
            }
            SessionPing sessionPing = (SessionPing) obj;
            return getId() == sessionPing.getId() && vx2.m53586b(mo41061a(), sessionPing.mo41061a()) && vx2.m53586b(getMethod(), sessionPing.getMethod()) && vx2.m53586b(getParams(), sessionPing.getParams());
        }

        public long getId() {
            return this.f27558a;
        }

        public String getMethod() {
            return this.f27560c;
        }

        public int hashCode() {
            return (((((au0.m10781a(getId()) * 31) + mo41061a().hashCode()) * 31) + getMethod().hashCode()) * 31) + getParams().hashCode();
        }

        public String toString() {
            long id = getId();
            String a = mo41061a();
            String method = getMethod();
            SignParams.C5625a b = getParams();
            return "SessionPing(id=" + id + ", jsonrpc=" + a + ", method=" + method + ", params=" + b + ")";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public SessionPing(@y33(name = "id") long j, @y33(name = "jsonrpc") String str, @y33(name = "method") String str2, @y33(name = "params") SignParams.C5625a aVar) {
            super((DefaultConstructorMarker) null);
            vx2.m53591g(str, "jsonrpc");
            vx2.m53591g(str2, "method");
            vx2.m53591g(aVar, "params");
            this.f27558a = j;
            this.f27559b = str;
            this.f27560c = str2;
            this.f27561d = aVar;
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ1\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u00042\b\b\u0003\u0010\b\u001a\u00020\u0007HÆ\u0001J\t\u0010\n\u001a\u00020\u0004HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0011\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\u0017R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0015\u0010\u001c¨\u0006\u001f"}, mo44877d2 = {"Lcom/walletconnect/sign/common/model/vo/clientsync/session/SignRpc$SessionPropose;", "Lcom/walletconnect/sign/common/model/vo/clientsync/session/SignRpc;", "", "id", "", "jsonrpc", "method", "Lcom/walletconnect/sign/common/model/vo/clientsync/session/params/SignParams$SessionProposeParams;", "params", "copy", "toString", "", "hashCode", "", "other", "", "equals", "a", "J", "getId", "()J", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "c", "getMethod", "d", "Lcom/walletconnect/sign/common/model/vo/clientsync/session/params/SignParams$SessionProposeParams;", "()Lcom/walletconnect/sign/common/model/vo/clientsync/session/params/SignParams$SessionProposeParams;", "<init>", "(JLjava/lang/String;Ljava/lang/String;Lcom/walletconnect/sign/common/model/vo/clientsync/session/params/SignParams$SessionProposeParams;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    @h43(generateAdapter = true)
    /* renamed from: com.walletconnect.sign.common.model.vo.clientsync.session.SignRpc$SessionPropose */
    /* compiled from: SignRpc.kt */
    public static final class SessionPropose extends SignRpc {

        /* renamed from: a */
        public final long f27562a;

        /* renamed from: b */
        public final String f27563b;

        /* renamed from: c */
        public final String f27564c;

        /* renamed from: d */
        public final SignParams.SessionProposeParams f27565d;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ SessionPropose(long j, String str, String str2, SignParams.SessionProposeParams sessionProposeParams, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, (i & 2) != 0 ? WCClientKt.JSONRPC_VERSION : str, (i & 4) != 0 ? "wc_sessionPropose" : str2, sessionProposeParams);
        }

        /* renamed from: a */
        public String mo41067a() {
            return this.f27563b;
        }

        /* renamed from: b */
        public SignParams.SessionProposeParams getParams() {
            return this.f27565d;
        }

        public final SessionPropose copy(@y33(name = "id") long j, @y33(name = "jsonrpc") String str, @y33(name = "method") String str2, @y33(name = "params") SignParams.SessionProposeParams sessionProposeParams) {
            vx2.m53591g(str, "jsonrpc");
            vx2.m53591g(str2, "method");
            vx2.m53591g(sessionProposeParams, "params");
            return new SessionPropose(j, str, str2, sessionProposeParams);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SessionPropose)) {
                return false;
            }
            SessionPropose sessionPropose = (SessionPropose) obj;
            return getId() == sessionPropose.getId() && vx2.m53586b(mo41067a(), sessionPropose.mo41067a()) && vx2.m53586b(getMethod(), sessionPropose.getMethod()) && vx2.m53586b(getParams(), sessionPropose.getParams());
        }

        public long getId() {
            return this.f27562a;
        }

        public String getMethod() {
            return this.f27564c;
        }

        public int hashCode() {
            return (((((au0.m10781a(getId()) * 31) + mo41067a().hashCode()) * 31) + getMethod().hashCode()) * 31) + getParams().hashCode();
        }

        public String toString() {
            long id = getId();
            String a = mo41067a();
            String method = getMethod();
            SignParams.SessionProposeParams b = getParams();
            return "SessionPropose(id=" + id + ", jsonrpc=" + a + ", method=" + method + ", params=" + b + ")";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public SessionPropose(@y33(name = "id") long j, @y33(name = "jsonrpc") String str, @y33(name = "method") String str2, @y33(name = "params") SignParams.SessionProposeParams sessionProposeParams) {
            super((DefaultConstructorMarker) null);
            vx2.m53591g(str, "jsonrpc");
            vx2.m53591g(str2, "method");
            vx2.m53591g(sessionProposeParams, "params");
            this.f27562a = j;
            this.f27563b = str;
            this.f27564c = str2;
            this.f27565d = sessionProposeParams;
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ1\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u00042\b\b\u0003\u0010\b\u001a\u00020\u0007HÆ\u0001J\t\u0010\n\u001a\u00020\u0004HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0011\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\u0017R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0015\u0010\u001c¨\u0006\u001f"}, mo44877d2 = {"Lcom/walletconnect/sign/common/model/vo/clientsync/session/SignRpc$SessionRequest;", "Lcom/walletconnect/sign/common/model/vo/clientsync/session/SignRpc;", "", "id", "", "jsonrpc", "method", "Lcom/walletconnect/sign/common/model/vo/clientsync/session/params/SignParams$SessionRequestParams;", "params", "copy", "toString", "", "hashCode", "", "other", "", "equals", "a", "J", "getId", "()J", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "c", "getMethod", "d", "Lcom/walletconnect/sign/common/model/vo/clientsync/session/params/SignParams$SessionRequestParams;", "()Lcom/walletconnect/sign/common/model/vo/clientsync/session/params/SignParams$SessionRequestParams;", "<init>", "(JLjava/lang/String;Ljava/lang/String;Lcom/walletconnect/sign/common/model/vo/clientsync/session/params/SignParams$SessionRequestParams;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    @h43(generateAdapter = true)
    /* renamed from: com.walletconnect.sign.common.model.vo.clientsync.session.SignRpc$SessionRequest */
    /* compiled from: SignRpc.kt */
    public static final class SessionRequest extends SignRpc {

        /* renamed from: a */
        public final long f27566a;

        /* renamed from: b */
        public final String f27567b;

        /* renamed from: c */
        public final String f27568c;

        /* renamed from: d */
        public final SignParams.SessionRequestParams f27569d;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ SessionRequest(long j, String str, String str2, SignParams.SessionRequestParams sessionRequestParams, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, (i & 2) != 0 ? WCClientKt.JSONRPC_VERSION : str, (i & 4) != 0 ? "wc_sessionRequest" : str2, sessionRequestParams);
        }

        /* renamed from: a */
        public String mo41073a() {
            return this.f27567b;
        }

        /* renamed from: b */
        public SignParams.SessionRequestParams getParams() {
            return this.f27569d;
        }

        public final SessionRequest copy(@y33(name = "id") long j, @y33(name = "jsonrpc") String str, @y33(name = "method") String str2, @y33(name = "params") SignParams.SessionRequestParams sessionRequestParams) {
            vx2.m53591g(str, "jsonrpc");
            vx2.m53591g(str2, "method");
            vx2.m53591g(sessionRequestParams, "params");
            return new SessionRequest(j, str, str2, sessionRequestParams);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SessionRequest)) {
                return false;
            }
            SessionRequest sessionRequest = (SessionRequest) obj;
            return getId() == sessionRequest.getId() && vx2.m53586b(mo41073a(), sessionRequest.mo41073a()) && vx2.m53586b(getMethod(), sessionRequest.getMethod()) && vx2.m53586b(getParams(), sessionRequest.getParams());
        }

        public long getId() {
            return this.f27566a;
        }

        public String getMethod() {
            return this.f27568c;
        }

        public int hashCode() {
            return (((((au0.m10781a(getId()) * 31) + mo41073a().hashCode()) * 31) + getMethod().hashCode()) * 31) + getParams().hashCode();
        }

        public String toString() {
            long id = getId();
            String a = mo41073a();
            String method = getMethod();
            SignParams.SessionRequestParams b = getParams();
            return "SessionRequest(id=" + id + ", jsonrpc=" + a + ", method=" + method + ", params=" + b + ")";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public SessionRequest(@y33(name = "id") long j, @y33(name = "jsonrpc") String str, @y33(name = "method") String str2, @y33(name = "params") SignParams.SessionRequestParams sessionRequestParams) {
            super((DefaultConstructorMarker) null);
            vx2.m53591g(str, "jsonrpc");
            vx2.m53591g(str2, "method");
            vx2.m53591g(sessionRequestParams, "params");
            this.f27566a = j;
            this.f27567b = str;
            this.f27568c = str2;
            this.f27569d = sessionRequestParams;
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ1\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u00042\b\b\u0003\u0010\b\u001a\u00020\u0007HÆ\u0001J\t\u0010\n\u001a\u00020\u0004HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0011\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\u0017R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0015\u0010\u001c¨\u0006\u001f"}, mo44877d2 = {"Lcom/walletconnect/sign/common/model/vo/clientsync/session/SignRpc$SessionSettle;", "Lcom/walletconnect/sign/common/model/vo/clientsync/session/SignRpc;", "", "id", "", "jsonrpc", "method", "Lcom/walletconnect/sign/common/model/vo/clientsync/session/params/SignParams$SessionSettleParams;", "params", "copy", "toString", "", "hashCode", "", "other", "", "equals", "a", "J", "getId", "()J", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "c", "getMethod", "d", "Lcom/walletconnect/sign/common/model/vo/clientsync/session/params/SignParams$SessionSettleParams;", "()Lcom/walletconnect/sign/common/model/vo/clientsync/session/params/SignParams$SessionSettleParams;", "<init>", "(JLjava/lang/String;Ljava/lang/String;Lcom/walletconnect/sign/common/model/vo/clientsync/session/params/SignParams$SessionSettleParams;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    @h43(generateAdapter = true)
    /* renamed from: com.walletconnect.sign.common.model.vo.clientsync.session.SignRpc$SessionSettle */
    /* compiled from: SignRpc.kt */
    public static final class SessionSettle extends SignRpc {

        /* renamed from: a */
        public final long f27570a;

        /* renamed from: b */
        public final String f27571b;

        /* renamed from: c */
        public final String f27572c;

        /* renamed from: d */
        public final SignParams.SessionSettleParams f27573d;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ SessionSettle(long j, String str, String str2, SignParams.SessionSettleParams sessionSettleParams, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, (i & 2) != 0 ? WCClientKt.JSONRPC_VERSION : str, (i & 4) != 0 ? "wc_sessionSettle" : str2, sessionSettleParams);
        }

        /* renamed from: a */
        public String mo41079a() {
            return this.f27571b;
        }

        /* renamed from: b */
        public SignParams.SessionSettleParams getParams() {
            return this.f27573d;
        }

        public final SessionSettle copy(@y33(name = "id") long j, @y33(name = "jsonrpc") String str, @y33(name = "method") String str2, @y33(name = "params") SignParams.SessionSettleParams sessionSettleParams) {
            vx2.m53591g(str, "jsonrpc");
            vx2.m53591g(str2, "method");
            vx2.m53591g(sessionSettleParams, "params");
            return new SessionSettle(j, str, str2, sessionSettleParams);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SessionSettle)) {
                return false;
            }
            SessionSettle sessionSettle = (SessionSettle) obj;
            return getId() == sessionSettle.getId() && vx2.m53586b(mo41079a(), sessionSettle.mo41079a()) && vx2.m53586b(getMethod(), sessionSettle.getMethod()) && vx2.m53586b(getParams(), sessionSettle.getParams());
        }

        public long getId() {
            return this.f27570a;
        }

        public String getMethod() {
            return this.f27572c;
        }

        public int hashCode() {
            return (((((au0.m10781a(getId()) * 31) + mo41079a().hashCode()) * 31) + getMethod().hashCode()) * 31) + getParams().hashCode();
        }

        public String toString() {
            long id = getId();
            String a = mo41079a();
            String method = getMethod();
            SignParams.SessionSettleParams b = getParams();
            return "SessionSettle(id=" + id + ", jsonrpc=" + a + ", method=" + method + ", params=" + b + ")";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public SessionSettle(@y33(name = "id") long j, @y33(name = "jsonrpc") String str, @y33(name = "method") String str2, @y33(name = "params") SignParams.SessionSettleParams sessionSettleParams) {
            super((DefaultConstructorMarker) null);
            vx2.m53591g(str, "jsonrpc");
            vx2.m53591g(str2, "method");
            vx2.m53591g(sessionSettleParams, "params");
            this.f27570a = j;
            this.f27571b = str;
            this.f27572c = str2;
            this.f27573d = sessionSettleParams;
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ1\u0010\t\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u00042\b\b\u0003\u0010\b\u001a\u00020\u0007HÆ\u0001J\t\u0010\n\u001a\u00020\u0004HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0011\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\u0017R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0015\u0010\u001c¨\u0006\u001f"}, mo44877d2 = {"Lcom/walletconnect/sign/common/model/vo/clientsync/session/SignRpc$SessionUpdate;", "Lcom/walletconnect/sign/common/model/vo/clientsync/session/SignRpc;", "", "id", "", "jsonrpc", "method", "Lcom/walletconnect/sign/common/model/vo/clientsync/session/params/SignParams$UpdateNamespacesParams;", "params", "copy", "toString", "", "hashCode", "", "other", "", "equals", "a", "J", "getId", "()J", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "c", "getMethod", "d", "Lcom/walletconnect/sign/common/model/vo/clientsync/session/params/SignParams$UpdateNamespacesParams;", "()Lcom/walletconnect/sign/common/model/vo/clientsync/session/params/SignParams$UpdateNamespacesParams;", "<init>", "(JLjava/lang/String;Ljava/lang/String;Lcom/walletconnect/sign/common/model/vo/clientsync/session/params/SignParams$UpdateNamespacesParams;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    @h43(generateAdapter = true)
    /* renamed from: com.walletconnect.sign.common.model.vo.clientsync.session.SignRpc$SessionUpdate */
    /* compiled from: SignRpc.kt */
    public static final class SessionUpdate extends SignRpc {

        /* renamed from: a */
        public final long f27574a;

        /* renamed from: b */
        public final String f27575b;

        /* renamed from: c */
        public final String f27576c;

        /* renamed from: d */
        public final SignParams.UpdateNamespacesParams f27577d;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ SessionUpdate(long j, String str, String str2, SignParams.UpdateNamespacesParams updateNamespacesParams, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, (i & 2) != 0 ? WCClientKt.JSONRPC_VERSION : str, (i & 4) != 0 ? "wc_sessionUpdate" : str2, updateNamespacesParams);
        }

        /* renamed from: a */
        public String mo41085a() {
            return this.f27575b;
        }

        /* renamed from: b */
        public SignParams.UpdateNamespacesParams getParams() {
            return this.f27577d;
        }

        public final SessionUpdate copy(@y33(name = "id") long j, @y33(name = "jsonrpc") String str, @y33(name = "method") String str2, @y33(name = "params") SignParams.UpdateNamespacesParams updateNamespacesParams) {
            vx2.m53591g(str, "jsonrpc");
            vx2.m53591g(str2, "method");
            vx2.m53591g(updateNamespacesParams, "params");
            return new SessionUpdate(j, str, str2, updateNamespacesParams);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SessionUpdate)) {
                return false;
            }
            SessionUpdate sessionUpdate = (SessionUpdate) obj;
            return getId() == sessionUpdate.getId() && vx2.m53586b(mo41085a(), sessionUpdate.mo41085a()) && vx2.m53586b(getMethod(), sessionUpdate.getMethod()) && vx2.m53586b(getParams(), sessionUpdate.getParams());
        }

        public long getId() {
            return this.f27574a;
        }

        public String getMethod() {
            return this.f27576c;
        }

        public int hashCode() {
            return (((((au0.m10781a(getId()) * 31) + mo41085a().hashCode()) * 31) + getMethod().hashCode()) * 31) + getParams().hashCode();
        }

        public String toString() {
            long id = getId();
            String a = mo41085a();
            String method = getMethod();
            SignParams.UpdateNamespacesParams b = getParams();
            return "SessionUpdate(id=" + id + ", jsonrpc=" + a + ", method=" + method + ", params=" + b + ")";
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public SessionUpdate(@y33(name = "id") long j, @y33(name = "jsonrpc") String str, @y33(name = "method") String str2, @y33(name = "params") SignParams.UpdateNamespacesParams updateNamespacesParams) {
            super((DefaultConstructorMarker) null);
            vx2.m53591g(str, "jsonrpc");
            vx2.m53591g(str2, "method");
            vx2.m53591g(updateNamespacesParams, "params");
            this.f27574a = j;
            this.f27575b = str;
            this.f27576c = str2;
            this.f27577d = updateNamespacesParams;
        }
    }

    private SignRpc() {
    }

    public /* synthetic */ SignRpc(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
