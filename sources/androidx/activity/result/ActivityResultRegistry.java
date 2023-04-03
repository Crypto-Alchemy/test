package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.C0715e;
import androidx.lifecycle.Lifecycle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

public abstract class ActivityResultRegistry {

    /* renamed from: a */
    public Random f370a = new Random();

    /* renamed from: b */
    public final Map<Integer, String> f371b = new HashMap();

    /* renamed from: c */
    public final Map<String, Integer> f372c = new HashMap();

    /* renamed from: d */
    public final Map<String, C0107d> f373d = new HashMap();

    /* renamed from: e */
    public ArrayList<String> f374e = new ArrayList<>();

    /* renamed from: f */
    public final transient Map<String, C0106c<?>> f375f = new HashMap();

    /* renamed from: g */
    public final Map<String, Object> f376g = new HashMap();

    /* renamed from: h */
    public final Bundle f377h = new Bundle();

    /* renamed from: androidx.activity.result.ActivityResultRegistry$a */
    public class C0104a extends C3529wa<I> {

        /* renamed from: a */
        public final /* synthetic */ String f382a;

        /* renamed from: b */
        public final /* synthetic */ C3253sa f383b;

        public C0104a(String str, C3253sa saVar) {
            this.f382a = str;
            this.f383b = saVar;
        }

        /* renamed from: b */
        public void mo937b(I i, C2945oa oaVar) {
            Integer num = ActivityResultRegistry.this.f372c.get(this.f382a);
            if (num != null) {
                ActivityResultRegistry.this.f374e.add(this.f382a);
                try {
                    ActivityResultRegistry.this.mo909f(num.intValue(), this.f383b, i, oaVar);
                } catch (Exception e) {
                    ActivityResultRegistry.this.f374e.remove(this.f382a);
                    throw e;
                }
            } else {
                throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + this.f383b + " and input " + i + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
            }
        }

        /* renamed from: c */
        public void mo938c() {
            ActivityResultRegistry.this.mo936l(this.f382a);
        }
    }

    /* renamed from: androidx.activity.result.ActivityResultRegistry$b */
    public class C0105b extends C3529wa<I> {

        /* renamed from: a */
        public final /* synthetic */ String f385a;

        /* renamed from: b */
        public final /* synthetic */ C3253sa f386b;

        public C0105b(String str, C3253sa saVar) {
            this.f385a = str;
            this.f386b = saVar;
        }

        /* renamed from: b */
        public void mo937b(I i, C2945oa oaVar) {
            Integer num = ActivityResultRegistry.this.f372c.get(this.f385a);
            if (num != null) {
                ActivityResultRegistry.this.f374e.add(this.f385a);
                try {
                    ActivityResultRegistry.this.mo909f(num.intValue(), this.f386b, i, oaVar);
                } catch (Exception e) {
                    ActivityResultRegistry.this.f374e.remove(this.f385a);
                    throw e;
                }
            } else {
                throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + this.f386b + " and input " + i + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
            }
        }

        /* renamed from: c */
        public void mo938c() {
            ActivityResultRegistry.this.mo936l(this.f385a);
        }
    }

    /* renamed from: androidx.activity.result.ActivityResultRegistry$c */
    public static class C0106c<O> {

        /* renamed from: a */
        public final C3191ra<O> f388a;

        /* renamed from: b */
        public final C3253sa<?, O> f389b;

        public C0106c(C3191ra<O> raVar, C3253sa<?, O> saVar) {
            this.f388a = raVar;
            this.f389b = saVar;
        }
    }

    /* renamed from: androidx.activity.result.ActivityResultRegistry$d */
    public static class C0107d {

        /* renamed from: a */
        public final Lifecycle f390a;

        /* renamed from: b */
        public final ArrayList<C0715e> f391b = new ArrayList<>();

        public C0107d(Lifecycle lifecycle) {
            this.f390a = lifecycle;
        }

        /* renamed from: a */
        public void mo939a(C0715e eVar) {
            this.f390a.mo6295a(eVar);
            this.f391b.add(eVar);
        }

        /* renamed from: b */
        public void mo940b() {
            Iterator<C0715e> it = this.f391b.iterator();
            while (it.hasNext()) {
                this.f390a.mo6297c(it.next());
            }
            this.f391b.clear();
        }
    }

    /* renamed from: a */
    public final void mo926a(int i, String str) {
        this.f371b.put(Integer.valueOf(i), str);
        this.f372c.put(str, Integer.valueOf(i));
    }

    /* renamed from: b */
    public final boolean mo927b(int i, int i2, Intent intent) {
        String str = this.f371b.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        mo929d(str, i2, intent, this.f375f.get(str));
        return true;
    }

    /* renamed from: c */
    public final <O> boolean mo928c(int i, @SuppressLint({"UnknownNullness"}) O o) {
        C3191ra<O> raVar;
        String str = this.f371b.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        C0106c cVar = this.f375f.get(str);
        if (cVar == null || (raVar = cVar.f388a) == null) {
            this.f377h.remove(str);
            this.f376g.put(str, o);
            return true;
        } else if (!this.f374e.remove(str)) {
            return true;
        } else {
            raVar.mo6032a(o);
            return true;
        }
    }

    /* renamed from: d */
    public final <O> void mo929d(String str, int i, Intent intent, C0106c<O> cVar) {
        if (cVar == null || cVar.f388a == null || !this.f374e.contains(str)) {
            this.f376g.remove(str);
            this.f377h.putParcelable(str, new ActivityResult(i, intent));
            return;
        }
        cVar.f388a.mo6032a(cVar.f389b.mo6045c(i, intent));
        this.f374e.remove(str);
    }

    /* renamed from: e */
    public final int mo930e() {
        int nextInt = this.f370a.nextInt(2147418112);
        while (true) {
            int i = nextInt + 65536;
            if (!this.f371b.containsKey(Integer.valueOf(i))) {
                return i;
            }
            nextInt = this.f370a.nextInt(2147418112);
        }
    }

    /* renamed from: f */
    public abstract <I, O> void mo909f(int i, C3253sa<I, O> saVar, @SuppressLint({"UnknownNullness"}) I i2, C2945oa oaVar);

    /* renamed from: g */
    public final void mo931g(Bundle bundle) {
        if (bundle != null) {
            ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
            ArrayList<String> stringArrayList = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
            if (stringArrayList != null && integerArrayList != null) {
                this.f374e = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                this.f370a = (Random) bundle.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
                this.f377h.putAll(bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
                for (int i = 0; i < stringArrayList.size(); i++) {
                    String str = stringArrayList.get(i);
                    if (this.f372c.containsKey(str)) {
                        Integer remove = this.f372c.remove(str);
                        if (!this.f377h.containsKey(str)) {
                            this.f371b.remove(remove);
                        }
                    }
                    mo926a(integerArrayList.get(i).intValue(), stringArrayList.get(i));
                }
            }
        }
    }

    /* renamed from: h */
    public final void mo932h(Bundle bundle) {
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList(this.f372c.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList(this.f372c.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList(this.f374e));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) this.f377h.clone());
        bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", this.f370a);
    }

    /* renamed from: i */
    public final <I, O> C3529wa<I> mo933i(String str, C3253sa<I, O> saVar, C3191ra<O> raVar) {
        mo935k(str);
        this.f375f.put(str, new C0106c(raVar, saVar));
        if (this.f376g.containsKey(str)) {
            Object obj = this.f376g.get(str);
            this.f376g.remove(str);
            raVar.mo6032a(obj);
        }
        ActivityResult activityResult = (ActivityResult) this.f377h.getParcelable(str);
        if (activityResult != null) {
            this.f377h.remove(str);
            raVar.mo6032a(saVar.mo6045c(activityResult.mo918b(), activityResult.mo917a()));
        }
        return new C0105b(str, saVar);
    }

    /* renamed from: j */
    public final <I, O> C3529wa<I> mo934j(final String str, ug3 ug3, final C3253sa<I, O> saVar, final C3191ra<O> raVar) {
        Lifecycle lifecycle = ug3.getLifecycle();
        if (!lifecycle.mo6296b().isAtLeast(Lifecycle.State.STARTED)) {
            mo935k(str);
            C0107d dVar = this.f373d.get(str);
            if (dVar == null) {
                dVar = new C0107d(lifecycle);
            }
            dVar.mo939a(new C0715e() {
                /* renamed from: f */
                public void mo907f(ug3 ug3, Lifecycle.Event event) {
                    if (Lifecycle.Event.ON_START.equals(event)) {
                        ActivityResultRegistry.this.f375f.put(str, new C0106c(raVar, saVar));
                        if (ActivityResultRegistry.this.f376g.containsKey(str)) {
                            Object obj = ActivityResultRegistry.this.f376g.get(str);
                            ActivityResultRegistry.this.f376g.remove(str);
                            raVar.mo6032a(obj);
                        }
                        ActivityResult activityResult = (ActivityResult) ActivityResultRegistry.this.f377h.getParcelable(str);
                        if (activityResult != null) {
                            ActivityResultRegistry.this.f377h.remove(str);
                            raVar.mo6032a(saVar.mo6045c(activityResult.mo918b(), activityResult.mo917a()));
                        }
                    } else if (Lifecycle.Event.ON_STOP.equals(event)) {
                        ActivityResultRegistry.this.f375f.remove(str);
                    } else if (Lifecycle.Event.ON_DESTROY.equals(event)) {
                        ActivityResultRegistry.this.mo936l(str);
                    }
                }
            });
            this.f373d.put(str, dVar);
            return new C0104a(str, saVar);
        }
        throw new IllegalStateException("LifecycleOwner " + ug3 + " is attempting to register while current state is " + lifecycle.mo6296b() + ". LifecycleOwners must call register before they are STARTED.");
    }

    /* renamed from: k */
    public final void mo935k(String str) {
        if (this.f372c.get(str) == null) {
            mo926a(mo930e(), str);
        }
    }

    /* renamed from: l */
    public final void mo936l(String str) {
        Integer remove;
        if (!this.f374e.contains(str) && (remove = this.f372c.remove(str)) != null) {
            this.f371b.remove(remove);
        }
        this.f375f.remove(str);
        if (this.f376g.containsKey(str)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Dropping pending result for request ");
            sb.append(str);
            sb.append(": ");
            sb.append(this.f376g.get(str));
            this.f376g.remove(str);
        }
        if (this.f377h.containsKey(str)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Dropping pending result for request ");
            sb2.append(str);
            sb2.append(": ");
            sb2.append(this.f377h.getParcelable(str));
            this.f377h.remove(str);
        }
        C0107d dVar = this.f373d.get(str);
        if (dVar != null) {
            dVar.mo940b();
            this.f373d.remove(str);
        }
    }
}
