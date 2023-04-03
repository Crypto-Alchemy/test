package p000;

import android.app.Person;
import android.graphics.drawable.Icon;
import androidx.core.graphics.drawable.IconCompat;

/* renamed from: io4 */
/* compiled from: Person */
public class io4 {

    /* renamed from: a */
    public CharSequence f13343a;

    /* renamed from: b */
    public IconCompat f13344b;

    /* renamed from: c */
    public String f13345c;

    /* renamed from: d */
    public String f13346d;

    /* renamed from: e */
    public boolean f13347e;

    /* renamed from: f */
    public boolean f13348f;

    /* renamed from: io4$a */
    /* compiled from: Person */
    public static class C2562a {
        /* renamed from: a */
        public static io4 m19743a(Person person) {
            IconCompat iconCompat;
            C2563b f = new C2563b().mo21598f(person.getName());
            if (person.getIcon() != null) {
                iconCompat = IconCompat.m4317a(person.getIcon());
            } else {
                iconCompat = null;
            }
            return f.mo21595c(iconCompat).mo21599g(person.getUri()).mo21597e(person.getKey()).mo21594b(person.isBot()).mo21596d(person.isImportant()).mo21593a();
        }

        /* renamed from: b */
        public static Person m19744b(io4 io4) {
            Icon icon;
            Person.Builder name = new Person.Builder().setName(io4.mo21587c());
            if (io4.mo21585a() != null) {
                icon = io4.mo21585a().mo5367q();
            } else {
                icon = null;
            }
            return name.setIcon(icon).setUri(io4.mo21588d()).setKey(io4.mo21586b()).setBot(io4.mo21589e()).setImportant(io4.mo21590f()).build();
        }
    }

    /* renamed from: io4$b */
    /* compiled from: Person */
    public static class C2563b {

        /* renamed from: a */
        public CharSequence f13349a;

        /* renamed from: b */
        public IconCompat f13350b;

        /* renamed from: c */
        public String f13351c;

        /* renamed from: d */
        public String f13352d;

        /* renamed from: e */
        public boolean f13353e;

        /* renamed from: f */
        public boolean f13354f;

        /* renamed from: a */
        public io4 mo21593a() {
            return new io4(this);
        }

        /* renamed from: b */
        public C2563b mo21594b(boolean z) {
            this.f13353e = z;
            return this;
        }

        /* renamed from: c */
        public C2563b mo21595c(IconCompat iconCompat) {
            this.f13350b = iconCompat;
            return this;
        }

        /* renamed from: d */
        public C2563b mo21596d(boolean z) {
            this.f13354f = z;
            return this;
        }

        /* renamed from: e */
        public C2563b mo21597e(String str) {
            this.f13352d = str;
            return this;
        }

        /* renamed from: f */
        public C2563b mo21598f(CharSequence charSequence) {
            this.f13349a = charSequence;
            return this;
        }

        /* renamed from: g */
        public C2563b mo21599g(String str) {
            this.f13351c = str;
            return this;
        }
    }

    public io4(C2563b bVar) {
        this.f13343a = bVar.f13349a;
        this.f13344b = bVar.f13350b;
        this.f13345c = bVar.f13351c;
        this.f13346d = bVar.f13352d;
        this.f13347e = bVar.f13353e;
        this.f13348f = bVar.f13354f;
    }

    /* renamed from: a */
    public IconCompat mo21585a() {
        return this.f13344b;
    }

    /* renamed from: b */
    public String mo21586b() {
        return this.f13346d;
    }

    /* renamed from: c */
    public CharSequence mo21587c() {
        return this.f13343a;
    }

    /* renamed from: d */
    public String mo21588d() {
        return this.f13345c;
    }

    /* renamed from: e */
    public boolean mo21589e() {
        return this.f13347e;
    }

    /* renamed from: f */
    public boolean mo21590f() {
        return this.f13348f;
    }

    /* renamed from: g */
    public String mo21591g() {
        String str = this.f13345c;
        if (str != null) {
            return str;
        }
        if (this.f13343a == null) {
            return "";
        }
        return "name:" + this.f13343a;
    }

    /* renamed from: h */
    public Person mo21592h() {
        return C2562a.m19744b(this);
    }
}
