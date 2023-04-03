package p000;

import android.view.View;
import android.view.accessibility.AccessibilityRecord;

/* renamed from: x8 */
/* compiled from: AccessibilityRecordCompat */
public class C3576x8 {

    /* renamed from: x8$a */
    /* compiled from: AccessibilityRecordCompat */
    public static class C3577a {
        /* renamed from: a */
        public static int m29930a(AccessibilityRecord accessibilityRecord) {
            return accessibilityRecord.getMaxScrollX();
        }

        /* renamed from: b */
        public static int m29931b(AccessibilityRecord accessibilityRecord) {
            return accessibilityRecord.getMaxScrollY();
        }

        /* renamed from: c */
        public static void m29932c(AccessibilityRecord accessibilityRecord, int i) {
            accessibilityRecord.setMaxScrollX(i);
        }

        /* renamed from: d */
        public static void m29933d(AccessibilityRecord accessibilityRecord, int i) {
            accessibilityRecord.setMaxScrollY(i);
        }
    }

    /* renamed from: x8$b */
    /* compiled from: AccessibilityRecordCompat */
    public static class C3578b {
        /* renamed from: a */
        public static void m29934a(AccessibilityRecord accessibilityRecord, View view, int i) {
            accessibilityRecord.setSource(view, i);
        }
    }

    /* renamed from: a */
    public static void m29927a(AccessibilityRecord accessibilityRecord, int i) {
        C3577a.m29932c(accessibilityRecord, i);
    }

    /* renamed from: b */
    public static void m29928b(AccessibilityRecord accessibilityRecord, int i) {
        C3577a.m29933d(accessibilityRecord, i);
    }

    /* renamed from: c */
    public static void m29929c(AccessibilityRecord accessibilityRecord, View view, int i) {
        C3578b.m29934a(accessibilityRecord, view, i);
    }
}
