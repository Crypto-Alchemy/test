package p000;

import android.view.KeyEvent;
import kotlin.Metadata;

@Metadata(mo44875bv = {}, mo44876d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b@\u0018\u00002\u00020\u0001B\u0016\u0012\n\u0010\u0012\u001a\u00060\fj\u0002`\rø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001b\u0010\u0012\u001a\u00060\fj\u0002`\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\u0001\u0012\u0001\u00060\fj\u0002`\rø\u0001\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, mo44877d2 = {"Lja3;", "", "", "e", "(Landroid/view/KeyEvent;)Ljava/lang/String;", "", "d", "(Landroid/view/KeyEvent;)I", "other", "", "c", "(Landroid/view/KeyEvent;Ljava/lang/Object;)Z", "Landroid/view/KeyEvent;", "Landroidx/compose/ui/input/key/NativeKeyEvent;", "a", "Landroid/view/KeyEvent;", "getNativeKeyEvent", "()Landroid/view/KeyEvent;", "nativeKeyEvent", "b", "(Landroid/view/KeyEvent;)Landroid/view/KeyEvent;", "ui_release"}, mo44878k = 1, mo44879mv = {1, 7, 1})
/* renamed from: ja3 */
/* compiled from: KeyEvent.kt */
public final class ja3 {

    /* renamed from: a */
    public final KeyEvent f13567a;

    public /* synthetic */ ja3(KeyEvent keyEvent) {
        this.f13567a = keyEvent;
    }

    /* renamed from: a */
    public static final /* synthetic */ ja3 m20053a(KeyEvent keyEvent) {
        return new ja3(keyEvent);
    }

    /* renamed from: b */
    public static KeyEvent m20054b(KeyEvent keyEvent) {
        vx2.m53591g(keyEvent, "nativeKeyEvent");
        return keyEvent;
    }

    /* renamed from: c */
    public static boolean m20055c(KeyEvent keyEvent, Object obj) {
        return (obj instanceof ja3) && vx2.m53586b(keyEvent, ((ja3) obj).mo21797f());
    }

    /* renamed from: d */
    public static int m20056d(KeyEvent keyEvent) {
        return keyEvent.hashCode();
    }

    /* renamed from: e */
    public static String m20057e(KeyEvent keyEvent) {
        return "KeyEvent(nativeKeyEvent=" + keyEvent + ')';
    }

    public boolean equals(Object obj) {
        return m20055c(this.f13567a, obj);
    }

    /* renamed from: f */
    public final /* synthetic */ KeyEvent mo21797f() {
        return this.f13567a;
    }

    public int hashCode() {
        return m20056d(this.f13567a);
    }

    public String toString() {
        return m20057e(this.f13567a);
    }
}
