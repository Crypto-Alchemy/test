package com.walletconnect.sign.common.model.p016vo.clientsync.session.payload;

import kotlin.Metadata;
import org.web3j.ens.contracts.generated.PublicResolver;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0005\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u0001HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0004\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0010\u001a\u0004\b\f\u0010\u0011¨\u0006\u0014"}, mo44877d2 = {"Lcom/walletconnect/sign/common/model/vo/clientsync/session/payload/SessionEventVO;", "", "", "name", "data", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Ljava/lang/Object;", "()Ljava/lang/Object;", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
@h43(generateAdapter = true)
/* renamed from: com.walletconnect.sign.common.model.vo.clientsync.session.payload.SessionEventVO */
/* compiled from: SessionEventVO.kt */
public final class SessionEventVO {

    /* renamed from: a */
    public final String f27649a;

    /* renamed from: b */
    public final Object f27650b;

    public SessionEventVO(@y33(name = "name") String str, @y33(name = "data") Object obj) {
        vx2.m53591g(str, PublicResolver.FUNC_NAME);
        vx2.m53591g(obj, "data");
        this.f27649a = str;
        this.f27650b = obj;
    }

    /* renamed from: a */
    public final Object mo41162a() {
        return this.f27650b;
    }

    /* renamed from: b */
    public final String mo41163b() {
        return this.f27649a;
    }

    public final SessionEventVO copy(@y33(name = "name") String str, @y33(name = "data") Object obj) {
        vx2.m53591g(str, PublicResolver.FUNC_NAME);
        vx2.m53591g(obj, "data");
        return new SessionEventVO(str, obj);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionEventVO)) {
            return false;
        }
        SessionEventVO sessionEventVO = (SessionEventVO) obj;
        return vx2.m53586b(this.f27649a, sessionEventVO.f27649a) && vx2.m53586b(this.f27650b, sessionEventVO.f27650b);
    }

    public int hashCode() {
        return (this.f27649a.hashCode() * 31) + this.f27650b.hashCode();
    }

    public String toString() {
        String str = this.f27649a;
        Object obj = this.f27650b;
        return "SessionEventVO(name=" + str + ", data=" + obj + ")";
    }
}
