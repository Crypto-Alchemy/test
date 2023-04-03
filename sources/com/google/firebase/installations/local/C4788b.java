package com.google.firebase.installations.local;

import com.google.auto.value.AutoValue;
import com.google.firebase.installations.local.C4785a;
import com.google.firebase.installations.local.PersistedInstallation;

@AutoValue
/* renamed from: com.google.firebase.installations.local.b */
/* compiled from: PersistedInstallationEntry */
public abstract class C4788b {

    /* renamed from: a */
    public static C4788b f25363a = m38485a().mo36144a();

    @AutoValue.Builder
    /* renamed from: com.google.firebase.installations.local.b$a */
    /* compiled from: PersistedInstallationEntry */
    public static abstract class C4789a {
        /* renamed from: a */
        public abstract C4788b mo36144a();

        /* renamed from: b */
        public abstract C4789a mo36145b(String str);

        /* renamed from: c */
        public abstract C4789a mo36146c(long j);

        /* renamed from: d */
        public abstract C4789a mo36147d(String str);

        /* renamed from: e */
        public abstract C4789a mo36148e(String str);

        /* renamed from: f */
        public abstract C4789a mo36149f(String str);

        /* renamed from: g */
        public abstract C4789a mo36150g(PersistedInstallation.RegistrationStatus registrationStatus);

        /* renamed from: h */
        public abstract C4789a mo36151h(long j);
    }

    /* renamed from: a */
    public static C4789a m38485a() {
        return new C4785a.C4787b().mo36151h(0).mo36150g(PersistedInstallation.RegistrationStatus.ATTEMPT_MIGRATION).mo36146c(0);
    }

    /* renamed from: b */
    public abstract String mo36133b();

    /* renamed from: c */
    public abstract long mo36134c();

    /* renamed from: d */
    public abstract String mo36135d();

    /* renamed from: e */
    public abstract String mo36136e();

    /* renamed from: f */
    public abstract String mo36138f();

    /* renamed from: g */
    public abstract PersistedInstallation.RegistrationStatus mo36139g();

    /* renamed from: h */
    public abstract long mo36140h();

    /* renamed from: i */
    public boolean mo36152i() {
        if (mo36139g() == PersistedInstallation.RegistrationStatus.REGISTER_ERROR) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public boolean mo36153j() {
        if (mo36139g() == PersistedInstallation.RegistrationStatus.NOT_GENERATED || mo36139g() == PersistedInstallation.RegistrationStatus.ATTEMPT_MIGRATION) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public boolean mo36154k() {
        if (mo36139g() == PersistedInstallation.RegistrationStatus.REGISTERED) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public boolean mo36155l() {
        if (mo36139g() == PersistedInstallation.RegistrationStatus.UNREGISTERED) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public boolean mo36156m() {
        if (mo36139g() == PersistedInstallation.RegistrationStatus.ATTEMPT_MIGRATION) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public abstract C4789a mo36142n();

    /* renamed from: o */
    public C4788b mo36157o(String str, long j, long j2) {
        return mo36142n().mo36145b(str).mo36146c(j).mo36151h(j2).mo36144a();
    }

    /* renamed from: p */
    public C4788b mo36158p() {
        return mo36142n().mo36145b((String) null).mo36144a();
    }

    /* renamed from: q */
    public C4788b mo36159q(String str) {
        return mo36142n().mo36148e(str).mo36150g(PersistedInstallation.RegistrationStatus.REGISTER_ERROR).mo36144a();
    }

    /* renamed from: r */
    public C4788b mo36160r() {
        return mo36142n().mo36150g(PersistedInstallation.RegistrationStatus.NOT_GENERATED).mo36144a();
    }

    /* renamed from: s */
    public C4788b mo36161s(String str, String str2, long j, String str3, long j2) {
        return mo36142n().mo36147d(str).mo36150g(PersistedInstallation.RegistrationStatus.REGISTERED).mo36145b(str3).mo36149f(str2).mo36146c(j2).mo36151h(j).mo36144a();
    }

    /* renamed from: t */
    public C4788b mo36162t(String str) {
        return mo36142n().mo36147d(str).mo36150g(PersistedInstallation.RegistrationStatus.UNREGISTERED).mo36144a();
    }
}
