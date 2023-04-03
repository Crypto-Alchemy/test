package p000;

import android.content.Context;
import java.text.SimpleDateFormat;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, mo44877d2 = {"Ll21;", "", "a", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: l21 */
/* compiled from: DateFormat.kt */
public final class l21 {

    /* renamed from: a */
    public static final C7817a f40561a = new C7817a((DefaultConstructorMarker) null);

    /* renamed from: b */
    public static final String f40562b = "MMM d, yyyy";

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0004R\u001a\u0010\u000b\u001a\u00020\u00048\u0006XD¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, mo44877d2 = {"Ll21$a;", "", "Landroid/content/Context;", "context", "", "c", "Ljava/text/SimpleDateFormat;", "b", "dateFormat", "Lr37;", "d", "DATE_FORMAT", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "<init>", "()V", "development-V3.40(117)_netMainRelease"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: l21$a */
    /* compiled from: DateFormat.kt */
    public static final class C7817a {
        public C7817a() {
        }

        public /* synthetic */ C7817a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final String mo55804a() {
            return l21.f40562b;
        }

        /* renamed from: b */
        public final SimpleDateFormat mo55805b(Context context) {
            vx2.m53591g(context, "context");
            return new SimpleDateFormat(mo55806c(context));
        }

        /* renamed from: c */
        public final String mo55806c(Context context) {
            vx2.m53591g(context, "context");
            String j = f06.m57519j(context, "DEFAULT_DATE_FORMAT", mo55804a());
            vx2.m53590f(j, "getString(context, Share…DATE_FORMAT, DATE_FORMAT)");
            return j;
        }

        /* renamed from: d */
        public final void mo55807d(Context context, String str) {
            vx2.m53591g(context, "context");
            vx2.m53591g(str, "dateFormat");
            f06.m57524o(context, "DEFAULT_DATE_FORMAT", str);
        }
    }
}
