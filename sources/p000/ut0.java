package p000;

import com.walletconnect.android.internal.common.model.AppMetaDataType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p000.tt0;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0004\b\t\n\u000b¨\u0006\f"}, mo44877d2 = {"Lut0;", "", "<init>", "()V", "a", "b", "c", "d", "Lut0$a;", "Lut0$b;", "Lut0$c;", "Lut0$d;", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: ut0 */
/* compiled from: Core.kt */
public abstract class ut0 {

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f¨\u0006\u0010"}, mo44877d2 = {"Lut0$a;", "Lut0;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "topic", "<init>", "(Ljava/lang/String;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: ut0$a */
    /* compiled from: Core.kt */
    public static final class C6576a extends ut0 {

        /* renamed from: a */
        public final String f34700a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6576a(String str) {
            super((DefaultConstructorMarker) null);
            vx2.m53591g(str, "topic");
            this.f34700a = str;
        }

        /* renamed from: a */
        public final String mo48506a() {
            return this.f34700a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C6576a) && vx2.m53586b(this.f34700a, ((C6576a) obj).f34700a);
        }

        public int hashCode() {
            return this.f34700a.hashCode();
        }

        public String toString() {
            String str = this.f34700a;
            return "Activate(topic=" + str + ")";
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f¨\u0006\u0010"}, mo44877d2 = {"Lut0$b;", "Lut0;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "uri", "<init>", "(Ljava/lang/String;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: ut0$b */
    /* compiled from: Core.kt */
    public static final class C6577b extends ut0 {

        /* renamed from: a */
        public final String f34701a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6577b(String str) {
            super((DefaultConstructorMarker) null);
            vx2.m53591g(str, "uri");
            this.f34701a = str;
        }

        /* renamed from: a */
        public final String mo48510a() {
            return this.f34701a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C6577b) && vx2.m53586b(this.f34701a, ((C6577b) obj).f34701a);
        }

        public int hashCode() {
            return this.f34701a.hashCode();
        }

        public String toString() {
            String str = this.f34701a;
            return "Pair(uri=" + str + ")";
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0012\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\f\u0010\u0010\u001a\u0004\b\n\u0010\u0011¨\u0006\u0015"}, mo44877d2 = {"Lut0$c;", "Lut0;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "topic", "Lnx1;", "Lnx1;", "()Lnx1;", "expiry", "<init>", "(Ljava/lang/String;Lnx1;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: ut0$c */
    /* compiled from: Core.kt */
    public static final class C6578c extends ut0 {

        /* renamed from: a */
        public final String f34702a;

        /* renamed from: b */
        public final nx1 f34703b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6578c(String str, nx1 nx1) {
            super((DefaultConstructorMarker) null);
            vx2.m53591g(str, "topic");
            vx2.m53591g(nx1, "expiry");
            this.f34702a = str;
            this.f34703b = nx1;
        }

        /* renamed from: a */
        public final nx1 mo48514a() {
            return this.f34703b;
        }

        /* renamed from: b */
        public final String mo48515b() {
            return this.f34702a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C6578c)) {
                return false;
            }
            C6578c cVar = (C6578c) obj;
            return vx2.m53586b(this.f34702a, cVar.f34702a) && vx2.m53586b(this.f34703b, cVar.f34703b);
        }

        public int hashCode() {
            return (this.f34702a.hashCode() * 31) + this.f34703b.hashCode();
        }

        public String toString() {
            String str = this.f34702a;
            nx1 nx1 = this.f34703b;
            return "UpdateExpiry(topic=" + str + ", expiry=" + nx1 + ")";
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0013\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\u0017\u0010\u0017\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\f\u0010\u0015\u001a\u0004\b\n\u0010\u0016¨\u0006\u001a"}, mo44877d2 = {"Lut0$d;", "Lut0;", "", "toString", "", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "topic", "Ltt0$a;", "b", "Ltt0$a;", "()Ltt0$a;", "metadata", "Lcom/walletconnect/android/internal/common/model/AppMetaDataType;", "Lcom/walletconnect/android/internal/common/model/AppMetaDataType;", "()Lcom/walletconnect/android/internal/common/model/AppMetaDataType;", "metaDataType", "<init>", "(Ljava/lang/String;Ltt0$a;Lcom/walletconnect/android/internal/common/model/AppMetaDataType;)V", "sdk_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: ut0$d */
    /* compiled from: Core.kt */
    public static final class C6579d extends ut0 {

        /* renamed from: a */
        public final String f34704a;

        /* renamed from: b */
        public final tt0.C6536a f34705b;

        /* renamed from: c */
        public final AppMetaDataType f34706c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6579d(String str, tt0.C6536a aVar, AppMetaDataType appMetaDataType) {
            super((DefaultConstructorMarker) null);
            vx2.m53591g(str, "topic");
            vx2.m53591g(aVar, "metadata");
            vx2.m53591g(appMetaDataType, "metaDataType");
            this.f34704a = str;
            this.f34705b = aVar;
            this.f34706c = appMetaDataType;
        }

        /* renamed from: a */
        public final AppMetaDataType mo48519a() {
            return this.f34706c;
        }

        /* renamed from: b */
        public final tt0.C6536a mo48520b() {
            return this.f34705b;
        }

        /* renamed from: c */
        public final String mo48521c() {
            return this.f34704a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C6579d)) {
                return false;
            }
            C6579d dVar = (C6579d) obj;
            return vx2.m53586b(this.f34704a, dVar.f34704a) && vx2.m53586b(this.f34705b, dVar.f34705b) && this.f34706c == dVar.f34706c;
        }

        public int hashCode() {
            return (((this.f34704a.hashCode() * 31) + this.f34705b.hashCode()) * 31) + this.f34706c.hashCode();
        }

        public String toString() {
            String str = this.f34704a;
            tt0.C6536a aVar = this.f34705b;
            AppMetaDataType appMetaDataType = this.f34706c;
            return "UpdateMetadata(topic=" + str + ", metadata=" + aVar + ", metaDataType=" + appMetaDataType + ")";
        }
    }

    public ut0() {
    }

    public /* synthetic */ ut0(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
