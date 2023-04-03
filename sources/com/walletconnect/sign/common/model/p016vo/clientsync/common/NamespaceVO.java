package com.walletconnect.sign.common.model.p016vo.clientsync.common;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0001\u0002\u0005\u0006¨\u0006\u0007"}, mo44877d2 = {"Lcom/walletconnect/sign/common/model/vo/clientsync/common/NamespaceVO;", "", "()V", "Proposal", "Session", "Lcom/walletconnect/sign/common/model/vo/clientsync/common/NamespaceVO$Proposal;", "Lcom/walletconnect/sign/common/model/vo/clientsync/common/NamespaceVO$Session;", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1}, mo44881xi = 48)
/* renamed from: com.walletconnect.sign.common.model.vo.clientsync.common.NamespaceVO */
/* compiled from: NamespaceVO.kt */
public abstract class NamespaceVO {

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001:\u0001\u001dBI\u0012\u000e\b\u0001\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0001\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0001\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0010\b\u0001\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003J\u000f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003J\u0011\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002HÆ\u0003JK\u0010\r\u001a\u00020\u00002\u000e\b\u0003\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0003\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0003\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0010\b\u0003\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002HÆ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017¨\u0006\u001e"}, mo44877d2 = {"Lcom/walletconnect/sign/common/model/vo/clientsync/common/NamespaceVO$Proposal;", "Lcom/walletconnect/sign/common/model/vo/clientsync/common/NamespaceVO;", "", "", "a", "b", "c", "Lcom/walletconnect/sign/common/model/vo/clientsync/common/NamespaceVO$Proposal$Extension;", "d", "chains", "methods", "events", "extensions", "copy", "toString", "", "hashCode", "", "other", "", "equals", "Ljava/util/List;", "e", "()Ljava/util/List;", "h", "f", "g", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "Extension", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    @h43(generateAdapter = true)
    /* renamed from: com.walletconnect.sign.common.model.vo.clientsync.common.NamespaceVO$Proposal */
    /* compiled from: NamespaceVO.kt */
    public static final class Proposal extends NamespaceVO {

        /* renamed from: a */
        public final List<String> f27517a;

        /* renamed from: b */
        public final List<String> f27518b;

        /* renamed from: c */
        public final List<String> f27519c;

        /* renamed from: d */
        public final List<Extension> f27520d;

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B7\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0013\u0010\u0014J9\u0010\u0007\u001a\u00020\u00002\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0003HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000f\u001a\u0004\b\u0012\u0010\u0010R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u0015"}, mo44877d2 = {"Lcom/walletconnect/sign/common/model/vo/clientsync/common/NamespaceVO$Proposal$Extension;", "", "", "", "chains", "methods", "events", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "c", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
        @h43(generateAdapter = true)
        /* renamed from: com.walletconnect.sign.common.model.vo.clientsync.common.NamespaceVO$Proposal$Extension */
        /* compiled from: NamespaceVO.kt */
        public static final class Extension {

            /* renamed from: a */
            public final List<String> f27521a;

            /* renamed from: b */
            public final List<String> f27522b;

            /* renamed from: c */
            public final List<String> f27523c;

            public Extension(@y33(name = "chains") List<String> list, @y33(name = "methods") List<String> list2, @y33(name = "events") List<String> list3) {
                vx2.m53591g(list, "chains");
                vx2.m53591g(list2, "methods");
                vx2.m53591g(list3, "events");
                this.f27521a = list;
                this.f27522b = list2;
                this.f27523c = list3;
            }

            /* renamed from: a */
            public final List<String> mo40996a() {
                return this.f27521a;
            }

            /* renamed from: b */
            public final List<String> mo40997b() {
                return this.f27523c;
            }

            /* renamed from: c */
            public final List<String> mo40998c() {
                return this.f27522b;
            }

            public final Extension copy(@y33(name = "chains") List<String> list, @y33(name = "methods") List<String> list2, @y33(name = "events") List<String> list3) {
                vx2.m53591g(list, "chains");
                vx2.m53591g(list2, "methods");
                vx2.m53591g(list3, "events");
                return new Extension(list, list2, list3);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Extension)) {
                    return false;
                }
                Extension extension = (Extension) obj;
                return vx2.m53586b(this.f27521a, extension.f27521a) && vx2.m53586b(this.f27522b, extension.f27522b) && vx2.m53586b(this.f27523c, extension.f27523c);
            }

            public int hashCode() {
                return (((this.f27521a.hashCode() * 31) + this.f27522b.hashCode()) * 31) + this.f27523c.hashCode();
            }

            public String toString() {
                List<String> list = this.f27521a;
                List<String> list2 = this.f27522b;
                List<String> list3 = this.f27523c;
                return "Extension(chains=" + list + ", methods=" + list2 + ", events=" + list3 + ")";
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Proposal(@y33(name = "chains") List<String> list, @y33(name = "methods") List<String> list2, @y33(name = "events") List<String> list3, @y33(name = "extension") List<Extension> list4) {
            super((DefaultConstructorMarker) null);
            vx2.m53591g(list, "chains");
            vx2.m53591g(list2, "methods");
            vx2.m53591g(list3, "events");
            this.f27517a = list;
            this.f27518b = list2;
            this.f27519c = list3;
            this.f27520d = list4;
        }

        /* renamed from: a */
        public final List<String> mo40984a() {
            return this.f27517a;
        }

        /* renamed from: b */
        public final List<String> mo40985b() {
            return this.f27518b;
        }

        /* renamed from: c */
        public final List<String> mo40986c() {
            return this.f27519c;
        }

        public final Proposal copy(@y33(name = "chains") List<String> list, @y33(name = "methods") List<String> list2, @y33(name = "events") List<String> list3, @y33(name = "extension") List<Extension> list4) {
            vx2.m53591g(list, "chains");
            vx2.m53591g(list2, "methods");
            vx2.m53591g(list3, "events");
            return new Proposal(list, list2, list3, list4);
        }

        /* renamed from: d */
        public final List<Extension> mo40988d() {
            return this.f27520d;
        }

        /* renamed from: e */
        public final List<String> mo40989e() {
            return this.f27517a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Proposal)) {
                return false;
            }
            Proposal proposal = (Proposal) obj;
            return vx2.m53586b(this.f27517a, proposal.f27517a) && vx2.m53586b(this.f27518b, proposal.f27518b) && vx2.m53586b(this.f27519c, proposal.f27519c) && vx2.m53586b(this.f27520d, proposal.f27520d);
        }

        /* renamed from: f */
        public final List<String> mo40991f() {
            return this.f27519c;
        }

        /* renamed from: g */
        public final List<Extension> mo40992g() {
            return this.f27520d;
        }

        /* renamed from: h */
        public final List<String> mo40993h() {
            return this.f27518b;
        }

        public int hashCode() {
            int hashCode = ((((this.f27517a.hashCode() * 31) + this.f27518b.hashCode()) * 31) + this.f27519c.hashCode()) * 31;
            List<Extension> list = this.f27520d;
            return hashCode + (list == null ? 0 : list.hashCode());
        }

        public String toString() {
            List<String> list = this.f27517a;
            List<String> list2 = this.f27518b;
            List<String> list3 = this.f27519c;
            List<Extension> list4 = this.f27520d;
            return "Proposal(chains=" + list + ", methods=" + list2 + ", events=" + list3 + ", extensions=" + list4 + ")";
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001:\u0001\u001dBI\u0012\u000e\b\u0001\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0001\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0001\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0010\b\u0001\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003J\u000f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003J\u0011\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002HÆ\u0003JK\u0010\r\u001a\u00020\u00002\u000e\b\u0003\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0003\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0003\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0010\b\u0003\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002HÆ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0010\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017¨\u0006\u001e"}, mo44877d2 = {"Lcom/walletconnect/sign/common/model/vo/clientsync/common/NamespaceVO$Session;", "Lcom/walletconnect/sign/common/model/vo/clientsync/common/NamespaceVO;", "", "", "a", "b", "c", "Lcom/walletconnect/sign/common/model/vo/clientsync/common/NamespaceVO$Session$Extension;", "d", "accounts", "methods", "events", "extensions", "copy", "toString", "", "hashCode", "", "other", "", "equals", "Ljava/util/List;", "e", "()Ljava/util/List;", "h", "f", "g", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "Extension", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    @h43(generateAdapter = true)
    /* renamed from: com.walletconnect.sign.common.model.vo.clientsync.common.NamespaceVO$Session */
    /* compiled from: NamespaceVO.kt */
    public static final class Session extends NamespaceVO {

        /* renamed from: a */
        public final List<String> f27524a;

        /* renamed from: b */
        public final List<String> f27525b;

        /* renamed from: c */
        public final List<String> f27526c;

        /* renamed from: d */
        public final List<Extension> f27527d;

        @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B7\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0013\u0010\u0014J9\u0010\u0007\u001a\u00020\u00002\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0003HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000f\u001a\u0004\b\u0012\u0010\u0010R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u0015"}, mo44877d2 = {"Lcom/walletconnect/sign/common/model/vo/clientsync/common/NamespaceVO$Session$Extension;", "", "", "", "accounts", "methods", "events", "copy", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "c", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
        @h43(generateAdapter = true)
        /* renamed from: com.walletconnect.sign.common.model.vo.clientsync.common.NamespaceVO$Session$Extension */
        /* compiled from: NamespaceVO.kt */
        public static final class Extension {

            /* renamed from: a */
            public final List<String> f27528a;

            /* renamed from: b */
            public final List<String> f27529b;

            /* renamed from: c */
            public final List<String> f27530c;

            public Extension(@y33(name = "accounts") List<String> list, @y33(name = "methods") List<String> list2, @y33(name = "events") List<String> list3) {
                vx2.m53591g(list, "accounts");
                vx2.m53591g(list2, "methods");
                vx2.m53591g(list3, "events");
                this.f27528a = list;
                this.f27529b = list2;
                this.f27530c = list3;
            }

            /* renamed from: a */
            public final List<String> mo41015a() {
                return this.f27528a;
            }

            /* renamed from: b */
            public final List<String> mo41016b() {
                return this.f27530c;
            }

            /* renamed from: c */
            public final List<String> mo41017c() {
                return this.f27529b;
            }

            public final Extension copy(@y33(name = "accounts") List<String> list, @y33(name = "methods") List<String> list2, @y33(name = "events") List<String> list3) {
                vx2.m53591g(list, "accounts");
                vx2.m53591g(list2, "methods");
                vx2.m53591g(list3, "events");
                return new Extension(list, list2, list3);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Extension)) {
                    return false;
                }
                Extension extension = (Extension) obj;
                return vx2.m53586b(this.f27528a, extension.f27528a) && vx2.m53586b(this.f27529b, extension.f27529b) && vx2.m53586b(this.f27530c, extension.f27530c);
            }

            public int hashCode() {
                return (((this.f27528a.hashCode() * 31) + this.f27529b.hashCode()) * 31) + this.f27530c.hashCode();
            }

            public String toString() {
                List<String> list = this.f27528a;
                List<String> list2 = this.f27529b;
                List<String> list3 = this.f27530c;
                return "Extension(accounts=" + list + ", methods=" + list2 + ", events=" + list3 + ")";
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Session(@y33(name = "accounts") List<String> list, @y33(name = "methods") List<String> list2, @y33(name = "events") List<String> list3, @y33(name = "extension") List<Extension> list4) {
            super((DefaultConstructorMarker) null);
            vx2.m53591g(list, "accounts");
            vx2.m53591g(list2, "methods");
            vx2.m53591g(list3, "events");
            this.f27524a = list;
            this.f27525b = list2;
            this.f27526c = list3;
            this.f27527d = list4;
        }

        /* renamed from: a */
        public final List<String> mo41003a() {
            return this.f27524a;
        }

        /* renamed from: b */
        public final List<String> mo41004b() {
            return this.f27525b;
        }

        /* renamed from: c */
        public final List<String> mo41005c() {
            return this.f27526c;
        }

        public final Session copy(@y33(name = "accounts") List<String> list, @y33(name = "methods") List<String> list2, @y33(name = "events") List<String> list3, @y33(name = "extension") List<Extension> list4) {
            vx2.m53591g(list, "accounts");
            vx2.m53591g(list2, "methods");
            vx2.m53591g(list3, "events");
            return new Session(list, list2, list3, list4);
        }

        /* renamed from: d */
        public final List<Extension> mo41007d() {
            return this.f27527d;
        }

        /* renamed from: e */
        public final List<String> mo41008e() {
            return this.f27524a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Session)) {
                return false;
            }
            Session session = (Session) obj;
            return vx2.m53586b(this.f27524a, session.f27524a) && vx2.m53586b(this.f27525b, session.f27525b) && vx2.m53586b(this.f27526c, session.f27526c) && vx2.m53586b(this.f27527d, session.f27527d);
        }

        /* renamed from: f */
        public final List<String> mo41010f() {
            return this.f27526c;
        }

        /* renamed from: g */
        public final List<Extension> mo41011g() {
            return this.f27527d;
        }

        /* renamed from: h */
        public final List<String> mo41012h() {
            return this.f27525b;
        }

        public int hashCode() {
            int hashCode = ((((this.f27524a.hashCode() * 31) + this.f27525b.hashCode()) * 31) + this.f27526c.hashCode()) * 31;
            List<Extension> list = this.f27527d;
            return hashCode + (list == null ? 0 : list.hashCode());
        }

        public String toString() {
            List<String> list = this.f27524a;
            List<String> list2 = this.f27525b;
            List<String> list3 = this.f27526c;
            List<Extension> list4 = this.f27527d;
            return "Session(accounts=" + list + ", methods=" + list2 + ", events=" + list3 + ", extensions=" + list4 + ")";
        }
    }

    private NamespaceVO() {
    }

    public /* synthetic */ NamespaceVO(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
