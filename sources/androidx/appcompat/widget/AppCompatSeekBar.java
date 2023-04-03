package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;

public class AppCompatSeekBar extends SeekBar {

    /* renamed from: a */
    public final C2614jn f1037a;

    public AppCompatSeekBar(Context context) {
        this(context, (AttributeSet) null);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.f1037a.mo21971h();
    }

    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f1037a.mo21972i();
    }

    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f1037a.mo21970g(canvas);
    }

    public AppCompatSeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, m15.seekBarStyle);
    }

    public AppCompatSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        xo6.m30262a(this, getContext());
        C2614jn jnVar = new C2614jn(this);
        this.f1037a = jnVar;
        jnVar.mo20018c(attributeSet, i);
    }
}
