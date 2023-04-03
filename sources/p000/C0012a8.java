package p000;

import android.view.accessibility.AccessibilityEvent;

/* renamed from: a8 */
/* compiled from: AccessibilityEventCompat */
public final class C0012a8 {

    /* renamed from: a8$a */
    /* compiled from: AccessibilityEventCompat */
    public static class C0013a {
        /* renamed from: a */
        public static int m108a(AccessibilityEvent accessibilityEvent) {
            return accessibilityEvent.getContentChangeTypes();
        }

        /* renamed from: b */
        public static void m109b(AccessibilityEvent accessibilityEvent, int i) {
            accessibilityEvent.setContentChangeTypes(i);
        }
    }

    /* renamed from: a */
    public static int m106a(AccessibilityEvent accessibilityEvent) {
        return C0013a.m108a(accessibilityEvent);
    }

    /* renamed from: b */
    public static void m107b(AccessibilityEvent accessibilityEvent, int i) {
        C0013a.m109b(accessibilityEvent, i);
    }
}
