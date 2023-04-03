package p000;

import androidx.compose.p004ui.text.font.AsyncFontListLoader;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0007\u0004R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0001\u0002\b\tø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, mo44877d2 = {"Lt27;", "Lr86;", "", "", "b", "()Z", "cacheable", "a", "Lt27$a;", "Lt27$b;", "ui-text_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: t27 */
/* compiled from: FontFamilyResolver.kt */
public interface t27 extends r86<Object> {

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\t\u001a\u00020\u00048\u0000X\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\u00038\u0016X\u0005¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, mo44877d2 = {"Lt27$a;", "Lt27;", "Lr86;", "", "Landroidx/compose/ui/text/font/AsyncFontListLoader;", "a", "Landroidx/compose/ui/text/font/AsyncFontListLoader;", "getCurrent$ui_text_release", "()Landroidx/compose/ui/text/font/AsyncFontListLoader;", "current", "getValue", "()Ljava/lang/Object;", "value", "", "b", "()Z", "cacheable", "<init>", "(Landroidx/compose/ui/text/font/AsyncFontListLoader;)V", "ui-text_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: t27$a */
    /* compiled from: FontFamilyResolver.kt */
    public static final class C3321a implements t27, r86<Object> {

        /* renamed from: a */
        public final AsyncFontListLoader f17878a;

        public C3321a(AsyncFontListLoader asyncFontListLoader) {
            vx2.m53591g(asyncFontListLoader, "current");
            this.f17878a = asyncFontListLoader;
        }

        /* renamed from: b */
        public boolean mo26029b() {
            return this.f17878a.mo4090e();
        }

        public Object getValue() {
            return this.f17878a.getValue();
        }
    }

    /* renamed from: b */
    boolean mo26029b();

    @Metadata(mo44875bv = {}, mo44876d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0016X\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, mo44877d2 = {"Lt27$b;", "Lt27;", "", "a", "Ljava/lang/Object;", "getValue", "()Ljava/lang/Object;", "value", "", "d", "Z", "b", "()Z", "cacheable", "<init>", "(Ljava/lang/Object;Z)V", "ui-text_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
    /* renamed from: t27$b */
    /* compiled from: FontFamilyResolver.kt */
    public static final class C3322b implements t27 {

        /* renamed from: a */
        public final Object f17879a;

        /* renamed from: d */
        public final boolean f17880d;

        public C3322b(Object obj, boolean z) {
            vx2.m53591g(obj, "value");
            this.f17879a = obj;
            this.f17880d = z;
        }

        /* renamed from: b */
        public boolean mo26029b() {
            return this.f17880d;
        }

        public Object getValue() {
            return this.f17879a;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C3322b(Object obj, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, (i & 2) != 0 ? true : z);
        }
    }
}
