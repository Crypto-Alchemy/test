package com.google.android.material.badge;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.internal.ParcelableSparseArray;

/* renamed from: com.google.android.material.badge.a */
/* compiled from: BadgeUtils */
public class C4184a {

    /* renamed from: a */
    public static final boolean f23376a = false;

    /* renamed from: a */
    public static void m34695a(BadgeDrawable badgeDrawable, View view, FrameLayout frameLayout) {
        m34699e(badgeDrawable, view, frameLayout);
        if (badgeDrawable.mo31733i() != null) {
            badgeDrawable.mo31733i().setForeground(badgeDrawable);
        } else if (!f23376a) {
            view.getOverlay().add(badgeDrawable);
        } else {
            throw new IllegalArgumentException("Trying to reference null customBadgeParent");
        }
    }

    /* renamed from: b */
    public static SparseArray<BadgeDrawable> m34696b(Context context, ParcelableSparseArray parcelableSparseArray) {
        SparseArray<BadgeDrawable> sparseArray = new SparseArray<>(parcelableSparseArray.size());
        int i = 0;
        while (i < parcelableSparseArray.size()) {
            int keyAt = parcelableSparseArray.keyAt(i);
            BadgeDrawable.SavedState savedState = (BadgeDrawable.SavedState) parcelableSparseArray.valueAt(i);
            if (savedState != null) {
                sparseArray.put(keyAt, BadgeDrawable.m34637e(context, savedState));
                i++;
            } else {
                throw new IllegalArgumentException("BadgeDrawable's savedState cannot be null");
            }
        }
        return sparseArray;
    }

    /* renamed from: c */
    public static ParcelableSparseArray m34697c(SparseArray<BadgeDrawable> sparseArray) {
        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
        int i = 0;
        while (i < sparseArray.size()) {
            int keyAt = sparseArray.keyAt(i);
            BadgeDrawable valueAt = sparseArray.valueAt(i);
            if (valueAt != null) {
                parcelableSparseArray.put(keyAt, valueAt.mo31738m());
                i++;
            } else {
                throw new IllegalArgumentException("badgeDrawable cannot be null");
            }
        }
        return parcelableSparseArray;
    }

    /* renamed from: d */
    public static void m34698d(BadgeDrawable badgeDrawable, View view) {
        if (badgeDrawable != null) {
            if (f23376a || badgeDrawable.mo31733i() != null) {
                badgeDrawable.mo31733i().setForeground((Drawable) null);
            } else {
                view.getOverlay().remove(badgeDrawable);
            }
        }
    }

    /* renamed from: e */
    public static void m34699e(BadgeDrawable badgeDrawable, View view, FrameLayout frameLayout) {
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        badgeDrawable.setBounds(rect);
        badgeDrawable.mo31721F(view, frameLayout);
    }

    /* renamed from: f */
    public static void m34700f(Rect rect, float f, float f2, float f3, float f4) {
        rect.set((int) (f - f3), (int) (f2 - f4), (int) (f + f3), (int) (f2 + f4));
    }
}
