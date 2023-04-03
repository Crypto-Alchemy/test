package p000;

import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

/* renamed from: al7 */
/* compiled from: WindowCallbackWrapper */
public class al7 implements Window.Callback {

    /* renamed from: a */
    public final Window.Callback f188a;

    /* renamed from: al7$a */
    /* compiled from: WindowCallbackWrapper */
    public static class C0035a {
        /* renamed from: a */
        public static boolean m390a(Window.Callback callback, SearchEvent searchEvent) {
            return callback.onSearchRequested(searchEvent);
        }

        /* renamed from: b */
        public static ActionMode m391b(Window.Callback callback, ActionMode.Callback callback2, int i) {
            return callback.onWindowStartingActionMode(callback2, i);
        }
    }

    /* renamed from: al7$b */
    /* compiled from: WindowCallbackWrapper */
    public static class C0036b {
        /* renamed from: a */
        public static void m392a(Window.Callback callback, List<KeyboardShortcutGroup> list, Menu menu, int i) {
            callback.onProvideKeyboardShortcuts(list, menu, i);
        }
    }

    /* renamed from: al7$c */
    /* compiled from: WindowCallbackWrapper */
    public static class C0037c {
        /* renamed from: a */
        public static void m393a(Window.Callback callback, boolean z) {
            callback.onPointerCaptureChanged(z);
        }
    }

    public al7(Window.Callback callback) {
        if (callback != null) {
            this.f188a = callback;
            return;
        }
        throw new IllegalArgumentException("Window callback may not be null");
    }

    /* renamed from: a */
    public final Window.Callback mo386a() {
        return this.f188a;
    }

    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f188a.dispatchGenericMotionEvent(motionEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return this.f188a.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        return this.f188a.dispatchKeyShortcutEvent(keyEvent);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f188a.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f188a.dispatchTouchEvent(motionEvent);
    }

    public boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f188a.dispatchTrackballEvent(motionEvent);
    }

    public void onActionModeFinished(ActionMode actionMode) {
        this.f188a.onActionModeFinished(actionMode);
    }

    public void onActionModeStarted(ActionMode actionMode) {
        this.f188a.onActionModeStarted(actionMode);
    }

    public void onAttachedToWindow() {
        this.f188a.onAttachedToWindow();
    }

    public boolean onCreatePanelMenu(int i, Menu menu) {
        return this.f188a.onCreatePanelMenu(i, menu);
    }

    public View onCreatePanelView(int i) {
        return this.f188a.onCreatePanelView(i);
    }

    public void onDetachedFromWindow() {
        this.f188a.onDetachedFromWindow();
    }

    public boolean onMenuItemSelected(int i, MenuItem menuItem) {
        return this.f188a.onMenuItemSelected(i, menuItem);
    }

    public boolean onMenuOpened(int i, Menu menu) {
        return this.f188a.onMenuOpened(i, menu);
    }

    public void onPanelClosed(int i, Menu menu) {
        this.f188a.onPanelClosed(i, menu);
    }

    public void onPointerCaptureChanged(boolean z) {
        C0037c.m393a(this.f188a, z);
    }

    public boolean onPreparePanel(int i, View view, Menu menu) {
        return this.f188a.onPreparePanel(i, view, menu);
    }

    public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> list, Menu menu, int i) {
        C0036b.m392a(this.f188a, list, menu, i);
    }

    public boolean onSearchRequested(SearchEvent searchEvent) {
        return C0035a.m390a(this.f188a, searchEvent);
    }

    public void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f188a.onWindowAttributesChanged(layoutParams);
    }

    public void onWindowFocusChanged(boolean z) {
        this.f188a.onWindowFocusChanged(z);
    }

    public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i) {
        return C0035a.m391b(this.f188a, callback, i);
    }

    public boolean onSearchRequested() {
        return this.f188a.onSearchRequested();
    }
}
