package p000;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import net.sqlcipher.database.SQLiteDatabase;

/* renamed from: hm6 */
/* compiled from: TaskStackBuilder */
public final class hm6 implements Iterable<Intent> {

    /* renamed from: a */
    public final ArrayList<Intent> f12965a = new ArrayList<>();

    /* renamed from: d */
    public final Context f12966d;

    /* renamed from: hm6$a */
    /* compiled from: TaskStackBuilder */
    public interface C2494a {
        Intent getSupportParentActivityIntent();
    }

    public hm6(Context context) {
        this.f12966d = context;
    }

    /* renamed from: o */
    public static hm6 m19090o(Context context) {
        return new hm6(context);
    }

    /* renamed from: e */
    public hm6 mo21300e(Intent intent) {
        this.f12965a.add(intent);
        return this;
    }

    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f12965a.iterator();
    }

    /* renamed from: j */
    public hm6 mo21302j(Intent intent) {
        ComponentName component = intent.getComponent();
        if (component == null) {
            component = intent.resolveActivity(this.f12966d.getPackageManager());
        }
        if (component != null) {
            mo21304n(component);
        }
        mo21300e(intent);
        return this;
    }

    /* renamed from: k */
    public hm6 mo21303k(Activity activity) {
        Intent intent;
        if (activity instanceof C2494a) {
            intent = ((C2494a) activity).getSupportParentActivityIntent();
        } else {
            intent = null;
        }
        if (intent == null) {
            intent = q44.m25386a(activity);
        }
        if (intent != null) {
            ComponentName component = intent.getComponent();
            if (component == null) {
                component = intent.resolveActivity(this.f12966d.getPackageManager());
            }
            mo21304n(component);
            mo21300e(intent);
        }
        return this;
    }

    /* renamed from: n */
    public hm6 mo21304n(ComponentName componentName) {
        int size = this.f12965a.size();
        try {
            Intent b = q44.m25387b(this.f12966d, componentName);
            while (b != null) {
                this.f12965a.add(size, b);
                b = q44.m25387b(this.f12966d, b.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: q */
    public Intent mo21305q(int i) {
        return this.f12965a.get(i);
    }

    /* renamed from: r */
    public int mo21306r() {
        return this.f12965a.size();
    }

    /* renamed from: s */
    public void mo21307s() {
        mo21308t((Bundle) null);
    }

    /* renamed from: t */
    public void mo21308t(Bundle bundle) {
        if (!this.f12965a.isEmpty()) {
            Intent[] intentArr = (Intent[]) this.f12965a.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            if (!zr0.m31447j(this.f12966d, intentArr, bundle)) {
                Intent intent = new Intent(intentArr[intentArr.length - 1]);
                intent.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
                this.f12966d.startActivity(intent);
                return;
            }
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }
}
