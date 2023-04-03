package p000;

import com.walletconnect.foundation.network.data.ConnectionEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0002\u0006\u0007¨\u0006\b"}, mo44877d2 = {"Lop0;", "", "<init>", "()V", "a", "b", "Lop0$a;", "Lop0$b;", "foundation"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: op0 */
/* compiled from: ConnectionController.kt */
public abstract class op0 {

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo44877d2 = {"Lop0$a;", "Lop0;", "<init>", "()V", "foundation"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: op0$a */
    /* compiled from: ConnectionController.kt */
    public static final class C6321a extends op0 {

        /* renamed from: a */
        public static final C6321a f32417a = new C6321a();

        public C6321a() {
            super((DefaultConstructorMarker) null);
        }
    }

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0004\u0010\n¨\u0006\u000e"}, mo44877d2 = {"Lop0$b;", "Lop0;", "Lu04;", "Lcom/walletconnect/foundation/network/data/ConnectionEvent;", "a", "Lu04;", "_connectionEvent", "Lt86;", "b", "Lt86;", "()Lt86;", "connectionEventFlow", "<init>", "()V", "foundation"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: op0$b */
    /* compiled from: ConnectionController.kt */
    public static final class C6322b extends op0 {

        /* renamed from: a */
        public final u04<ConnectionEvent> f32418a;

        /* renamed from: b */
        public final t86<ConnectionEvent> f32419b;

        public C6322b() {
            super((DefaultConstructorMarker) null);
            u04<ConnectionEvent> a = u86.m72658a(ConnectionEvent.DISCONNECT);
            this.f32418a = a;
            this.f32419b = e52.m57210b(a);
        }

        /* renamed from: a */
        public final t86<ConnectionEvent> mo46445a() {
            return this.f32419b;
        }
    }

    public op0() {
    }

    public /* synthetic */ op0(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
