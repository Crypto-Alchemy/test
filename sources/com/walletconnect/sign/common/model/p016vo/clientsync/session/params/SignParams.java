package com.walletconnect.sign.common.model.p016vo.clientsync.session.params;

import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import com.walletconnect.android.internal.common.model.RelayProtocolOptions;
import com.walletconnect.android.internal.common.model.SessionProposer;
import com.walletconnect.android.internal.common.model.params.CoreSignParams;
import com.walletconnect.sign.common.model.p016vo.clientsync.common.NamespaceVO;
import com.walletconnect.sign.common.model.p016vo.clientsync.common.SessionParticipantVO;
import com.walletconnect.sign.common.model.p016vo.clientsync.session.payload.SessionEventVO;
import com.walletconnect.sign.common.model.p016vo.clientsync.session.payload.SessionRequestVO;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, mo44877d2 = {"Lcom/walletconnect/sign/common/model/vo/clientsync/session/params/SignParams;", "Lcom/walletconnect/android/internal/common/model/params/CoreSignParams;", "<init>", "()V", "DeleteParams", "EventParams", "ExtendParams", "a", "SessionProposeParams", "SessionRequestParams", "SessionSettleParams", "UpdateNamespacesParams", "Lcom/walletconnect/sign/common/model/vo/clientsync/session/params/SignParams$DeleteParams;", "Lcom/walletconnect/sign/common/model/vo/clientsync/session/params/SignParams$EventParams;", "Lcom/walletconnect/sign/common/model/vo/clientsync/session/params/SignParams$ExtendParams;", "Lcom/walletconnect/sign/common/model/vo/clientsync/session/params/SignParams$a;", "Lcom/walletconnect/sign/common/model/vo/clientsync/session/params/SignParams$SessionProposeParams;", "Lcom/walletconnect/sign/common/model/vo/clientsync/session/params/SignParams$SessionRequestParams;", "Lcom/walletconnect/sign/common/model/vo/clientsync/session/params/SignParams$SessionSettleParams;", "Lcom/walletconnect/sign/common/model/vo/clientsync/session/params/SignParams$UpdateNamespacesParams;", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: com.walletconnect.sign.common.model.vo.clientsync.session.params.SignParams */
/* compiled from: SignParams.kt */
public abstract class SignParams extends CoreSignParams {

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0006\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0004HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0004HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0012\u001a\u0004\b\u000e\u0010\u0013¨\u0006\u0016"}, mo44877d2 = {"Lcom/walletconnect/sign/common/model/vo/clientsync/session/params/SignParams$EventParams;", "Lcom/walletconnect/sign/common/model/vo/clientsync/session/params/SignParams;", "Lcom/walletconnect/sign/common/model/vo/clientsync/session/payload/SessionEventVO;", "event", "", "chainId", "copy", "toString", "", "hashCode", "", "other", "", "equals", "a", "Lcom/walletconnect/sign/common/model/vo/clientsync/session/payload/SessionEventVO;", "b", "()Lcom/walletconnect/sign/common/model/vo/clientsync/session/payload/SessionEventVO;", "Ljava/lang/String;", "()Ljava/lang/String;", "<init>", "(Lcom/walletconnect/sign/common/model/vo/clientsync/session/payload/SessionEventVO;Ljava/lang/String;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: com.walletconnect.sign.common.model.vo.clientsync.session.params.SignParams$EventParams */
    /* compiled from: SignParams.kt */
    public static final class EventParams extends SignParams {

        /* renamed from: a */
        public final SessionEventVO f27620a;

        /* renamed from: b */
        public final String f27621b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public EventParams(@y33(name = "event") SessionEventVO sessionEventVO, @y33(name = "chainId") String str) {
            super((DefaultConstructorMarker) null);
            vx2.m53591g(sessionEventVO, "event");
            vx2.m53591g(str, "chainId");
            this.f27620a = sessionEventVO;
            this.f27621b = str;
        }

        /* renamed from: a */
        public final String mo41117a() {
            return this.f27621b;
        }

        /* renamed from: b */
        public final SessionEventVO mo41118b() {
            return this.f27620a;
        }

        public final EventParams copy(@y33(name = "event") SessionEventVO sessionEventVO, @y33(name = "chainId") String str) {
            vx2.m53591g(sessionEventVO, "event");
            vx2.m53591g(str, "chainId");
            return new EventParams(sessionEventVO, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EventParams)) {
                return false;
            }
            EventParams eventParams = (EventParams) obj;
            return vx2.m53586b(this.f27620a, eventParams.f27620a) && vx2.m53586b(this.f27621b, eventParams.f27621b);
        }

        public int hashCode() {
            return (this.f27620a.hashCode() * 31) + this.f27621b.hashCode();
        }

        public String toString() {
            SessionEventVO sessionEventVO = this.f27620a;
            String str = this.f27621b;
            return "EventParams(event=" + sessionEventVO + ", chainId=" + str + ")";
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0004\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f¨\u0006\u0012"}, mo44877d2 = {"Lcom/walletconnect/sign/common/model/vo/clientsync/session/params/SignParams$ExtendParams;", "Lcom/walletconnect/sign/common/model/vo/clientsync/session/params/SignParams;", "", "expiry", "copy", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "J", "()J", "<init>", "(J)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: com.walletconnect.sign.common.model.vo.clientsync.session.params.SignParams$ExtendParams */
    /* compiled from: SignParams.kt */
    public static final class ExtendParams extends SignParams {

        /* renamed from: a */
        public final long f27622a;

        public ExtendParams(@y33(name = "expiry") long j) {
            super((DefaultConstructorMarker) null);
            this.f27622a = j;
        }

        /* renamed from: a */
        public final long mo41123a() {
            return this.f27622a;
        }

        public final ExtendParams copy(@y33(name = "expiry") long j) {
            return new ExtendParams(j);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ExtendParams) && this.f27622a == ((ExtendParams) obj).f27622a;
        }

        public int hashCode() {
            return au0.m10781a(this.f27622a);
        }

        public String toString() {
            long j = this.f27622a;
            return "ExtendParams(expiry=" + j + ")";
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\b\u0018\u00002\u00020\u0001B7\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0014\b\u0001\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ9\u0010\u000b\u001a\u00020\u00002\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00052\u0014\b\u0003\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007HÆ\u0001J\t\u0010\f\u001a\u00020\bHÖ\u0001J\t\u0010\u000e\u001a\u00020\rHÖ\u0001J\u0013\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00078\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001a\u001a\u0004\b\u0013\u0010\u001b¨\u0006\u001e"}, mo44877d2 = {"Lcom/walletconnect/sign/common/model/vo/clientsync/session/params/SignParams$SessionProposeParams;", "Lcom/walletconnect/sign/common/model/vo/clientsync/session/params/SignParams;", "", "Lcom/walletconnect/android/internal/common/model/RelayProtocolOptions;", "relays", "Lcom/walletconnect/android/internal/common/model/SessionProposer;", "proposer", "", "", "Lcom/walletconnect/sign/common/model/vo/clientsync/common/NamespaceVO$Proposal;", "namespaces", "copy", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/util/List;", "c", "()Ljava/util/List;", "b", "Lcom/walletconnect/android/internal/common/model/SessionProposer;", "()Lcom/walletconnect/android/internal/common/model/SessionProposer;", "Ljava/util/Map;", "()Ljava/util/Map;", "<init>", "(Ljava/util/List;Lcom/walletconnect/android/internal/common/model/SessionProposer;Ljava/util/Map;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    @h43(generateAdapter = true)
    /* renamed from: com.walletconnect.sign.common.model.vo.clientsync.session.params.SignParams$SessionProposeParams */
    /* compiled from: SignParams.kt */
    public static final class SessionProposeParams extends SignParams {

        /* renamed from: a */
        public final List<RelayProtocolOptions> f27623a;

        /* renamed from: b */
        public final SessionProposer f27624b;

        /* renamed from: c */
        public final Map<String, NamespaceVO.Proposal> f27625c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public SessionProposeParams(@y33(name = "relays") List<RelayProtocolOptions> list, @y33(name = "proposer") SessionProposer sessionProposer, @y33(name = "requiredNamespaces") Map<String, NamespaceVO.Proposal> map) {
            super((DefaultConstructorMarker) null);
            vx2.m53591g(list, "relays");
            vx2.m53591g(sessionProposer, "proposer");
            vx2.m53591g(map, "namespaces");
            this.f27623a = list;
            this.f27624b = sessionProposer;
            this.f27625c = map;
        }

        /* renamed from: a */
        public final Map<String, NamespaceVO.Proposal> mo41128a() {
            return this.f27625c;
        }

        /* renamed from: b */
        public final SessionProposer mo41129b() {
            return this.f27624b;
        }

        /* renamed from: c */
        public final List<RelayProtocolOptions> mo41130c() {
            return this.f27623a;
        }

        public final SessionProposeParams copy(@y33(name = "relays") List<RelayProtocolOptions> list, @y33(name = "proposer") SessionProposer sessionProposer, @y33(name = "requiredNamespaces") Map<String, NamespaceVO.Proposal> map) {
            vx2.m53591g(list, "relays");
            vx2.m53591g(sessionProposer, "proposer");
            vx2.m53591g(map, "namespaces");
            return new SessionProposeParams(list, sessionProposer, map);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SessionProposeParams)) {
                return false;
            }
            SessionProposeParams sessionProposeParams = (SessionProposeParams) obj;
            return vx2.m53586b(this.f27623a, sessionProposeParams.f27623a) && vx2.m53586b(this.f27624b, sessionProposeParams.f27624b) && vx2.m53586b(this.f27625c, sessionProposeParams.f27625c);
        }

        public int hashCode() {
            return (((this.f27623a.hashCode() * 31) + this.f27624b.hashCode()) * 31) + this.f27625c.hashCode();
        }

        public String toString() {
            List<RelayProtocolOptions> list = this.f27623a;
            SessionProposer sessionProposer = this.f27624b;
            Map<String, NamespaceVO.Proposal> map = this.f27625c;
            return "SessionProposeParams(relays=" + list + ", proposer=" + sessionProposer + ", namespaces=" + map + ")";
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0006\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0004HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0004HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0012\u001a\u0004\b\u000e\u0010\u0013¨\u0006\u0016"}, mo44877d2 = {"Lcom/walletconnect/sign/common/model/vo/clientsync/session/params/SignParams$SessionRequestParams;", "Lcom/walletconnect/sign/common/model/vo/clientsync/session/params/SignParams;", "Lcom/walletconnect/sign/common/model/vo/clientsync/session/payload/SessionRequestVO;", "request", "", "chainId", "copy", "toString", "", "hashCode", "", "other", "", "equals", "a", "Lcom/walletconnect/sign/common/model/vo/clientsync/session/payload/SessionRequestVO;", "b", "()Lcom/walletconnect/sign/common/model/vo/clientsync/session/payload/SessionRequestVO;", "Ljava/lang/String;", "()Ljava/lang/String;", "<init>", "(Lcom/walletconnect/sign/common/model/vo/clientsync/session/payload/SessionRequestVO;Ljava/lang/String;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    @h43(generateAdapter = true)
    /* renamed from: com.walletconnect.sign.common.model.vo.clientsync.session.params.SignParams$SessionRequestParams */
    /* compiled from: SignParams.kt */
    public static final class SessionRequestParams extends SignParams {

        /* renamed from: a */
        public final SessionRequestVO f27626a;

        /* renamed from: b */
        public final String f27627b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public SessionRequestParams(@y33(name = "request") SessionRequestVO sessionRequestVO, @y33(name = "chainId") String str) {
            super((DefaultConstructorMarker) null);
            vx2.m53591g(sessionRequestVO, "request");
            vx2.m53591g(str, "chainId");
            this.f27626a = sessionRequestVO;
            this.f27627b = str;
        }

        /* renamed from: a */
        public final String mo41135a() {
            return this.f27627b;
        }

        /* renamed from: b */
        public final SessionRequestVO mo41136b() {
            return this.f27626a;
        }

        public final SessionRequestParams copy(@y33(name = "request") SessionRequestVO sessionRequestVO, @y33(name = "chainId") String str) {
            vx2.m53591g(sessionRequestVO, "request");
            vx2.m53591g(str, "chainId");
            return new SessionRequestParams(sessionRequestVO, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SessionRequestParams)) {
                return false;
            }
            SessionRequestParams sessionRequestParams = (SessionRequestParams) obj;
            return vx2.m53586b(this.f27626a, sessionRequestParams.f27626a) && vx2.m53586b(this.f27627b, sessionRequestParams.f27627b);
        }

        public int hashCode() {
            return (this.f27626a.hashCode() * 31) + this.f27627b.hashCode();
        }

        public String toString() {
            SessionRequestVO sessionRequestVO = this.f27626a;
            String str = this.f27627b;
            return "SessionRequestParams(request=" + sessionRequestVO + ", chainId=" + str + ")";
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0014\b\u0001\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b \u0010!J=\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\u0014\b\u0003\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\b\b\u0003\u0010\u000b\u001a\u00020\nHÆ\u0001J\t\u0010\r\u001a\u00020\u0007HÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u001aR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001e\u001a\u0004\b\u0018\u0010\u001f¨\u0006\""}, mo44877d2 = {"Lcom/walletconnect/sign/common/model/vo/clientsync/session/params/SignParams$SessionSettleParams;", "Lcom/walletconnect/sign/common/model/vo/clientsync/session/params/SignParams;", "Lcom/walletconnect/android/internal/common/model/RelayProtocolOptions;", "relay", "Lcom/walletconnect/sign/common/model/vo/clientsync/common/SessionParticipantVO;", "controller", "", "", "Lcom/walletconnect/sign/common/model/vo/clientsync/common/NamespaceVO$Session;", "namespaces", "", "expiry", "copy", "toString", "", "hashCode", "", "other", "", "equals", "a", "Lcom/walletconnect/android/internal/common/model/RelayProtocolOptions;", "d", "()Lcom/walletconnect/android/internal/common/model/RelayProtocolOptions;", "b", "Lcom/walletconnect/sign/common/model/vo/clientsync/common/SessionParticipantVO;", "()Lcom/walletconnect/sign/common/model/vo/clientsync/common/SessionParticipantVO;", "c", "Ljava/util/Map;", "()Ljava/util/Map;", "J", "()J", "<init>", "(Lcom/walletconnect/android/internal/common/model/RelayProtocolOptions;Lcom/walletconnect/sign/common/model/vo/clientsync/common/SessionParticipantVO;Ljava/util/Map;J)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    @h43(generateAdapter = true)
    /* renamed from: com.walletconnect.sign.common.model.vo.clientsync.session.params.SignParams$SessionSettleParams */
    /* compiled from: SignParams.kt */
    public static final class SessionSettleParams extends SignParams {

        /* renamed from: a */
        public final RelayProtocolOptions f27628a;

        /* renamed from: b */
        public final SessionParticipantVO f27629b;

        /* renamed from: c */
        public final Map<String, NamespaceVO.Session> f27630c;

        /* renamed from: d */
        public final long f27631d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public SessionSettleParams(@y33(name = "relay") RelayProtocolOptions relayProtocolOptions, @y33(name = "controller") SessionParticipantVO sessionParticipantVO, @y33(name = "namespaces") Map<String, NamespaceVO.Session> map, @y33(name = "expiry") long j) {
            super((DefaultConstructorMarker) null);
            vx2.m53591g(relayProtocolOptions, "relay");
            vx2.m53591g(sessionParticipantVO, "controller");
            vx2.m53591g(map, "namespaces");
            this.f27628a = relayProtocolOptions;
            this.f27629b = sessionParticipantVO;
            this.f27630c = map;
            this.f27631d = j;
        }

        /* renamed from: a */
        public final SessionParticipantVO mo41141a() {
            return this.f27629b;
        }

        /* renamed from: b */
        public final long mo41142b() {
            return this.f27631d;
        }

        /* renamed from: c */
        public final Map<String, NamespaceVO.Session> mo41143c() {
            return this.f27630c;
        }

        public final SessionSettleParams copy(@y33(name = "relay") RelayProtocolOptions relayProtocolOptions, @y33(name = "controller") SessionParticipantVO sessionParticipantVO, @y33(name = "namespaces") Map<String, NamespaceVO.Session> map, @y33(name = "expiry") long j) {
            vx2.m53591g(relayProtocolOptions, "relay");
            vx2.m53591g(sessionParticipantVO, "controller");
            vx2.m53591g(map, "namespaces");
            return new SessionSettleParams(relayProtocolOptions, sessionParticipantVO, map, j);
        }

        /* renamed from: d */
        public final RelayProtocolOptions mo41145d() {
            return this.f27628a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SessionSettleParams)) {
                return false;
            }
            SessionSettleParams sessionSettleParams = (SessionSettleParams) obj;
            return vx2.m53586b(this.f27628a, sessionSettleParams.f27628a) && vx2.m53586b(this.f27629b, sessionSettleParams.f27629b) && vx2.m53586b(this.f27630c, sessionSettleParams.f27630c) && this.f27631d == sessionSettleParams.f27631d;
        }

        public int hashCode() {
            return (((((this.f27628a.hashCode() * 31) + this.f27629b.hashCode()) * 31) + this.f27630c.hashCode()) * 31) + au0.m10781a(this.f27631d);
        }

        public String toString() {
            RelayProtocolOptions relayProtocolOptions = this.f27628a;
            SessionParticipantVO sessionParticipantVO = this.f27629b;
            Map<String, NamespaceVO.Session> map = this.f27630c;
            long j = this.f27631d;
            return "SessionSettleParams(relay=" + relayProtocolOptions + ", controller=" + sessionParticipantVO + ", namespaces=" + map + ", expiry=" + j + ")";
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0014\b\u0001\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\t\u0010\nR#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007¨\u0006\u000b"}, mo44877d2 = {"Lcom/walletconnect/sign/common/model/vo/clientsync/session/params/SignParams$UpdateNamespacesParams;", "Lcom/walletconnect/sign/common/model/vo/clientsync/session/params/SignParams;", "", "", "Lcom/walletconnect/sign/common/model/vo/clientsync/common/NamespaceVO$Session;", "a", "Ljava/util/Map;", "()Ljava/util/Map;", "namespaces", "<init>", "(Ljava/util/Map;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: com.walletconnect.sign.common.model.vo.clientsync.session.params.SignParams$UpdateNamespacesParams */
    /* compiled from: SignParams.kt */
    public static final class UpdateNamespacesParams extends SignParams {

        /* renamed from: a */
        public final Map<String, NamespaceVO.Session> f27632a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public UpdateNamespacesParams(@y33(name = "namespaces") Map<String, NamespaceVO.Session> map) {
            super((DefaultConstructorMarker) null);
            vx2.m53591g(map, "namespaces");
            this.f27632a = map;
        }

        /* renamed from: a */
        public final Map<String, NamespaceVO.Session> mo41149a() {
            return this.f27632a;
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo44877d2 = {"Lcom/walletconnect/sign/common/model/vo/clientsync/session/params/SignParams$a;", "Lcom/walletconnect/sign/common/model/vo/clientsync/session/params/SignParams;", "<init>", "()V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: com.walletconnect.sign.common.model.vo.clientsync.session.params.SignParams$a */
    /* compiled from: SignParams.kt */
    public static final class C5625a extends SignParams {
        public C5625a() {
            super((DefaultConstructorMarker) null);
        }
    }

    private SignParams() {
    }

    public /* synthetic */ SignParams(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n¨\u0006\u000e"}, mo44877d2 = {"Lcom/walletconnect/sign/common/model/vo/clientsync/session/params/SignParams$DeleteParams;", "Lcom/walletconnect/sign/common/model/vo/clientsync/session/params/SignParams;", "", "a", "I", "()I", "code", "", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "message", "<init>", "(ILjava/lang/String;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    @h43(generateAdapter = true)
    /* renamed from: com.walletconnect.sign.common.model.vo.clientsync.session.params.SignParams$DeleteParams */
    /* compiled from: SignParams.kt */
    public static final class DeleteParams extends SignParams {

        /* renamed from: a */
        public final int f27618a;

        /* renamed from: b */
        public final String f27619b;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ DeleteParams(int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? vx2.m53591g(iw2.f30141a, "<this>") : i, str);
        }

        /* renamed from: a */
        public final int mo41115a() {
            return this.f27618a;
        }

        /* renamed from: b */
        public final String mo41116b() {
            return this.f27619b;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public DeleteParams(@y33(name = "code") int i, @y33(name = "message") String str) {
            super((DefaultConstructorMarker) null);
            vx2.m53591g(str, ThrowableDeserializer.PROP_NAME_MESSAGE);
            this.f27618a = i;
            this.f27619b = str;
        }
    }
}
