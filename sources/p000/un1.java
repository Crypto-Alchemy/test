package p000;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;

@SuppressLint({"PrivateConstructorForUtilityClass"})
/* renamed from: un1 */
/* compiled from: EditorInfoCompat */
public final class un1 {

    /* renamed from: a */
    public static final String[] f18540a = new String[0];

    /* renamed from: un1$a */
    /* compiled from: EditorInfoCompat */
    public static class C3425a {
        /* renamed from: a */
        public static void m28367a(EditorInfo editorInfo, CharSequence charSequence, int i) {
            editorInfo.setInitialSurroundingSubText(charSequence, i);
        }
    }

    /* renamed from: a */
    public static String[] m28359a(EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 25) {
            String[] strArr = editorInfo.contentMimeTypes;
            if (strArr != null) {
                return strArr;
            }
            return f18540a;
        }
        Bundle bundle = editorInfo.extras;
        if (bundle == null) {
            return f18540a;
        }
        String[] stringArray = bundle.getStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
        if (stringArray == null) {
            stringArray = editorInfo.extras.getStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES");
        }
        if (stringArray != null) {
            return stringArray;
        }
        return f18540a;
    }

    /* renamed from: b */
    public static boolean m28360b(CharSequence charSequence, int i, int i2) {
        if (i2 == 0) {
            return Character.isLowSurrogate(charSequence.charAt(i));
        }
        if (i2 != 1) {
            return false;
        }
        return Character.isHighSurrogate(charSequence.charAt(i));
    }

    /* renamed from: c */
    public static boolean m28361c(int i) {
        int i2 = i & 4095;
        return i2 == 129 || i2 == 225 || i2 == 18;
    }

    /* renamed from: d */
    public static void m28362d(EditorInfo editorInfo, String[] strArr) {
        if (Build.VERSION.SDK_INT >= 25) {
            editorInfo.contentMimeTypes = strArr;
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putStringArray("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArr);
        editorInfo.extras.putStringArray("android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES", strArr);
    }

    /* renamed from: e */
    public static void m28363e(EditorInfo editorInfo, CharSequence charSequence, int i) {
        int i2;
        int i3;
        gu4.m18428f(charSequence);
        if (Build.VERSION.SDK_INT >= 30) {
            C3425a.m28367a(editorInfo, charSequence, i);
            return;
        }
        int i4 = editorInfo.initialSelStart;
        int i5 = editorInfo.initialSelEnd;
        if (i4 > i5) {
            i2 = i5 - i;
        } else {
            i2 = i4 - i;
        }
        if (i4 > i5) {
            i3 = i4 - i;
        } else {
            i3 = i5 - i;
        }
        int length = charSequence.length();
        if (i < 0 || i2 < 0 || i3 > length) {
            m28365g(editorInfo, (CharSequence) null, 0, 0);
        } else if (m28361c(editorInfo.inputType)) {
            m28365g(editorInfo, (CharSequence) null, 0, 0);
        } else if (length <= 2048) {
            m28365g(editorInfo, charSequence, i2, i3);
        } else {
            m28366h(editorInfo, charSequence, i2, i3);
        }
    }

    /* renamed from: f */
    public static void m28364f(EditorInfo editorInfo, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            C3425a.m28367a(editorInfo, charSequence, 0);
        } else {
            m28363e(editorInfo, charSequence, 0);
        }
    }

    /* renamed from: g */
    public static void m28365g(EditorInfo editorInfo, CharSequence charSequence, int i, int i2) {
        SpannableStringBuilder spannableStringBuilder;
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        if (charSequence != null) {
            spannableStringBuilder = new SpannableStringBuilder(charSequence);
        } else {
            spannableStringBuilder = null;
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", spannableStringBuilder);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i2);
    }

    /* renamed from: h */
    public static void m28366h(EditorInfo editorInfo, CharSequence charSequence, int i, int i2) {
        int i3;
        CharSequence charSequence2;
        int i4 = i2 - i;
        if (i4 > 1024) {
            i3 = 0;
        } else {
            i3 = i4;
        }
        int i5 = 2048 - i3;
        int min = Math.min(charSequence.length() - i2, i5 - Math.min(i, (int) (((double) i5) * 0.8d)));
        int min2 = Math.min(i, i5 - min);
        int i6 = i - min2;
        if (m28360b(charSequence, i6, 0)) {
            i6++;
            min2--;
        }
        if (m28360b(charSequence, (i2 + min) - 1, 1)) {
            min--;
        }
        int i7 = min2 + i3 + min;
        if (i3 != i4) {
            charSequence2 = TextUtils.concat(new CharSequence[]{charSequence.subSequence(i6, i6 + min2), charSequence.subSequence(i2, min + i2)});
        } else {
            charSequence2 = charSequence.subSequence(i6, i7 + i6);
        }
        int i8 = min2 + 0;
        m28365g(editorInfo, charSequence2, i8, i3 + i8);
    }
}
