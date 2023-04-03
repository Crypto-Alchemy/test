package p000;

import android.content.Context;
import android.content.ContextWrapper;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import net.safemoon.androidwallet.EasyAppInitializer;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, mo44877d2 = {"Lao;", "Landroid/content/ContextWrapper;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: ao */
/* compiled from: AppInitializer.kt */
public class C6833ao extends ContextWrapper {

    /* renamed from: a */
    public static final C6834a f36525a = new C6834a((DefaultConstructorMarker) null);

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, mo44877d2 = {"Lao$a;", "", "Landroid/content/Context;", "context", "Lnet/safemoon/androidwallet/EasyAppInitializer;", "a", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: ao$a */
    /* compiled from: AppInitializer.kt */
    public static final class C6834a {
        public C6834a() {
        }

        public /* synthetic */ C6834a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final EasyAppInitializer mo50271a(Context context) {
            vx2.m53591g(context, "context");
            return new EasyAppInitializer(context);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6833ao(Context context) {
        super(context);
        vx2.m53591g(context, "context");
    }
}
