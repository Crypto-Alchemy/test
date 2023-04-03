package p000;

import android.annotation.SuppressLint;
import android.text.Editable;

/* renamed from: do1 */
/* compiled from: EmojiEditableFactory */
public final class do1 extends Editable.Factory {

    /* renamed from: a */
    public static final Object f10803a = new Object();

    /* renamed from: b */
    public static volatile Editable.Factory f10804b;

    /* renamed from: c */
    public static Class<?> f10805c;

    @SuppressLint({"PrivateApi"})
    public do1() {
        try {
            f10805c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, do1.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    public static Editable.Factory getInstance() {
        if (f10804b == null) {
            synchronized (f10803a) {
                if (f10804b == null) {
                    f10804b = new do1();
                }
            }
        }
        return f10804b;
    }

    public Editable newEditable(CharSequence charSequence) {
        Class<?> cls = f10805c;
        if (cls != null) {
            return e66.m15954c(cls, charSequence);
        }
        return super.newEditable(charSequence);
    }
}
