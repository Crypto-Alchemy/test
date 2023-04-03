package p000;

import android.graphics.drawable.Drawable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

/* renamed from: d9 */
/* compiled from: ActionBarOnDestinationChangedListener */
public class C2141d9 extends C3122q5 {

    /* renamed from: f */
    public final AppCompatActivity f10574f;

    public C2141d9(AppCompatActivity appCompatActivity, C3083pm pmVar) {
        super(appCompatActivity.getDrawerToggleDelegate().mo1164a(), pmVar);
        this.f10574f = appCompatActivity;
    }

    /* renamed from: c */
    public void mo18591c(Drawable drawable, int i) {
        ActionBar supportActionBar = this.f10574f.getSupportActionBar();
        if (drawable == null) {
            supportActionBar.mo967t(false);
            return;
        }
        supportActionBar.mo967t(true);
        this.f10574f.getDrawerToggleDelegate().mo1165b(drawable, i);
    }

    /* renamed from: d */
    public void mo18592d(CharSequence charSequence) {
        this.f10574f.getSupportActionBar().mo971x(charSequence);
    }
}
