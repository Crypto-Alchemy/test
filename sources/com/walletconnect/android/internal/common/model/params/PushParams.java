package com.walletconnect.android.internal.common.model.params;

import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import com.walletconnect.android.internal.common.model.AppMetaData;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0004\b\t\n\u000b¨\u0006\f"}, mo44877d2 = {"Lcom/walletconnect/android/internal/common/model/params/PushParams;", "Lrg0;", "<init>", "()V", "DeleteParams", "MessageParams", "RequestParams", "RequestResponseParams", "Lcom/walletconnect/android/internal/common/model/params/PushParams$DeleteParams;", "Lcom/walletconnect/android/internal/common/model/params/PushParams$MessageParams;", "Lcom/walletconnect/android/internal/common/model/params/PushParams$RequestParams;", "Lcom/walletconnect/android/internal/common/model/params/PushParams$RequestResponseParams;", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* compiled from: PushParams.kt */
public abstract class PushParams implements rg0 {

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0006\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0004HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0004HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0016"}, mo44877d2 = {"Lcom/walletconnect/android/internal/common/model/params/PushParams$DeleteParams;", "Lcom/walletconnect/android/internal/common/model/params/PushParams;", "", "code", "", "message", "copy", "toString", "", "hashCode", "", "other", "", "equals", "a", "J", "()J", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "<init>", "(JLjava/lang/String;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    @h43(generateAdapter = true)
    /* compiled from: PushParams.kt */
    public static final class DeleteParams extends PushParams {

        /* renamed from: a */
        public final long f27158a;

        /* renamed from: b */
        public final String f27159b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public DeleteParams(@y33(name = "code") long j, @y33(name = "message") String str) {
            super((DefaultConstructorMarker) null);
            vx2.m53591g(str, ThrowableDeserializer.PROP_NAME_MESSAGE);
            this.f27158a = j;
            this.f27159b = str;
        }

        /* renamed from: a */
        public final long mo40375a() {
            return this.f27158a;
        }

        /* renamed from: b */
        public final String mo40376b() {
            return this.f27159b;
        }

        public final DeleteParams copy(@y33(name = "code") long j, @y33(name = "message") String str) {
            vx2.m53591g(str, ThrowableDeserializer.PROP_NAME_MESSAGE);
            return new DeleteParams(j, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DeleteParams)) {
                return false;
            }
            DeleteParams deleteParams = (DeleteParams) obj;
            return this.f27158a == deleteParams.f27158a && vx2.m53586b(this.f27159b, deleteParams.f27159b);
        }

        public int hashCode() {
            return (au0.m10781a(this.f27158a) * 31) + this.f27159b.hashCode();
        }

        public String toString() {
            long j = this.f27158a;
            String str = this.f27159b;
            return "DeleteParams(code=" + j + ", message=" + str + ")";
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0015\u0010\u0016J5\u0010\u0007\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u000f\u0010\u0012R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012¨\u0006\u0017"}, mo44877d2 = {"Lcom/walletconnect/android/internal/common/model/params/PushParams$MessageParams;", "Lcom/walletconnect/android/internal/common/model/params/PushParams;", "", "title", "body", "icon", "url", "copy", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "b", "d", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    @h43(generateAdapter = true)
    /* compiled from: PushParams.kt */
    public static final class MessageParams extends PushParams {

        /* renamed from: a */
        public final String f27160a;

        /* renamed from: b */
        public final String f27161b;

        /* renamed from: c */
        public final String f27162c;

        /* renamed from: d */
        public final String f27163d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public MessageParams(@y33(name = "title") String str, @y33(name = "body") String str2, @y33(name = "icon") String str3, @y33(name = "url") String str4) {
            super((DefaultConstructorMarker) null);
            vx2.m53591g(str, "title");
            vx2.m53591g(str2, "body");
            this.f27160a = str;
            this.f27161b = str2;
            this.f27162c = str3;
            this.f27163d = str4;
        }

        /* renamed from: a */
        public final String mo40381a() {
            return this.f27161b;
        }

        /* renamed from: b */
        public final String mo40382b() {
            return this.f27162c;
        }

        /* renamed from: c */
        public final String mo40383c() {
            return this.f27160a;
        }

        public final MessageParams copy(@y33(name = "title") String str, @y33(name = "body") String str2, @y33(name = "icon") String str3, @y33(name = "url") String str4) {
            vx2.m53591g(str, "title");
            vx2.m53591g(str2, "body");
            return new MessageParams(str, str2, str3, str4);
        }

        /* renamed from: d */
        public final String mo40385d() {
            return this.f27163d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MessageParams)) {
                return false;
            }
            MessageParams messageParams = (MessageParams) obj;
            return vx2.m53586b(this.f27160a, messageParams.f27160a) && vx2.m53586b(this.f27161b, messageParams.f27161b) && vx2.m53586b(this.f27162c, messageParams.f27162c) && vx2.m53586b(this.f27163d, messageParams.f27163d);
        }

        public int hashCode() {
            int hashCode = ((this.f27160a.hashCode() * 31) + this.f27161b.hashCode()) * 31;
            String str = this.f27162c;
            int i = 0;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f27163d;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            String str = this.f27160a;
            String str2 = this.f27161b;
            String str3 = this.f27162c;
            String str4 = this.f27163d;
            return "MessageParams(title=" + str + ", body=" + str2 + ", icon=" + str3 + ", url=" + str4 + ")";
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u0007\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0010\u001a\u0004\b\u000f\u0010\u0012¨\u0006\u0018"}, mo44877d2 = {"Lcom/walletconnect/android/internal/common/model/params/PushParams$RequestParams;", "Lcom/walletconnect/android/internal/common/model/params/PushParams;", "", "publicKey", "Lcom/walletconnect/android/internal/common/model/AppMetaData;", "metaData", "account", "copy", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "b", "Lcom/walletconnect/android/internal/common/model/AppMetaData;", "()Lcom/walletconnect/android/internal/common/model/AppMetaData;", "<init>", "(Ljava/lang/String;Lcom/walletconnect/android/internal/common/model/AppMetaData;Ljava/lang/String;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    @h43(generateAdapter = true)
    /* compiled from: PushParams.kt */
    public static final class RequestParams extends PushParams {

        /* renamed from: a */
        public final String f27164a;

        /* renamed from: b */
        public final AppMetaData f27165b;

        /* renamed from: c */
        public final String f27166c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public RequestParams(@y33(name = "publicKey") String str, @y33(name = "metadata") AppMetaData appMetaData, @y33(name = "account") String str2) {
            super((DefaultConstructorMarker) null);
            vx2.m53591g(str, "publicKey");
            vx2.m53591g(appMetaData, "metaData");
            vx2.m53591g(str2, "account");
            this.f27164a = str;
            this.f27165b = appMetaData;
            this.f27166c = str2;
        }

        /* renamed from: a */
        public final String mo40389a() {
            return this.f27166c;
        }

        /* renamed from: b */
        public final AppMetaData mo40390b() {
            return this.f27165b;
        }

        /* renamed from: c */
        public final String mo40391c() {
            return this.f27164a;
        }

        public final RequestParams copy(@y33(name = "publicKey") String str, @y33(name = "metadata") AppMetaData appMetaData, @y33(name = "account") String str2) {
            vx2.m53591g(str, "publicKey");
            vx2.m53591g(appMetaData, "metaData");
            vx2.m53591g(str2, "account");
            return new RequestParams(str, appMetaData, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RequestParams)) {
                return false;
            }
            RequestParams requestParams = (RequestParams) obj;
            return vx2.m53586b(this.f27164a, requestParams.f27164a) && vx2.m53586b(this.f27165b, requestParams.f27165b) && vx2.m53586b(this.f27166c, requestParams.f27166c);
        }

        public int hashCode() {
            return (((this.f27164a.hashCode() * 31) + this.f27165b.hashCode()) * 31) + this.f27166c.hashCode();
        }

        public String toString() {
            String str = this.f27164a;
            AppMetaData appMetaData = this.f27165b;
            String str2 = this.f27166c;
            return "RequestParams(publicKey=" + str + ", metaData=" + appMetaData + ", account=" + str2 + ")";
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0004\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0005\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u0011"}, mo44877d2 = {"Lcom/walletconnect/android/internal/common/model/params/PushParams$RequestResponseParams;", "Lcom/walletconnect/android/internal/common/model/params/PushParams;", "", "publicKey", "copy", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    @h43(generateAdapter = true)
    /* compiled from: PushParams.kt */
    public static final class RequestResponseParams extends PushParams {

        /* renamed from: a */
        public final String f27167a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public RequestResponseParams(@y33(name = "publicKey") String str) {
            super((DefaultConstructorMarker) null);
            vx2.m53591g(str, "publicKey");
            this.f27167a = str;
        }

        /* renamed from: a */
        public final String mo40396a() {
            return this.f27167a;
        }

        public final RequestResponseParams copy(@y33(name = "publicKey") String str) {
            vx2.m53591g(str, "publicKey");
            return new RequestResponseParams(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RequestResponseParams) && vx2.m53586b(this.f27167a, ((RequestResponseParams) obj).f27167a);
        }

        public int hashCode() {
            return this.f27167a.hashCode();
        }

        public String toString() {
            String str = this.f27167a;
            return "RequestResponseParams(publicKey=" + str + ")";
        }
    }

    private PushParams() {
    }

    public /* synthetic */ PushParams(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
