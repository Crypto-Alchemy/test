package p000;

import android.text.Editable;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.View;
import androidx.emoji2.text.C0593c;

/* renamed from: go1 */
/* compiled from: EmojiKeyListener */
public final class go1 implements KeyListener {

    /* renamed from: a */
    public final KeyListener f12514a;

    /* renamed from: b */
    public final C2413a f12515b;

    /* renamed from: go1$a */
    /* compiled from: EmojiKeyListener */
    public static class C2413a {
        /* renamed from: a */
        public boolean mo20720a(Editable editable, int i, KeyEvent keyEvent) {
            return C0593c.m4519f(editable, i, keyEvent);
        }
    }

    public go1(KeyListener keyListener) {
        this(keyListener, new C2413a());
    }

    public void clearMetaKeyState(View view, Editable editable, int i) {
        this.f12514a.clearMetaKeyState(view, editable, i);
    }

    public int getInputType() {
        return this.f12514a.getInputType();
    }

    public boolean onKeyDown(View view, Editable editable, int i, KeyEvent keyEvent) {
        if (this.f12515b.mo20720a(editable, i, keyEvent) || this.f12514a.onKeyDown(view, editable, i, keyEvent)) {
            return true;
        }
        return false;
    }

    public boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f12514a.onKeyOther(view, editable, keyEvent);
    }

    public boolean onKeyUp(View view, Editable editable, int i, KeyEvent keyEvent) {
        return this.f12514a.onKeyUp(view, editable, i, keyEvent);
    }

    public go1(KeyListener keyListener, C2413a aVar) {
        this.f12514a = keyListener;
        this.f12515b = aVar;
    }
}
