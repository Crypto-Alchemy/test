package com.onesignal;

import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.onesignal.k0 */
/* compiled from: OSObservable */
public class C5277k0<ObserverType, StateType> {

    /* renamed from: a */
    public String f26439a;

    /* renamed from: b */
    public List<Object> f26440b = new ArrayList();

    /* renamed from: c */
    public boolean f26441c;

    /* renamed from: com.onesignal.k0$a */
    /* compiled from: OSObservable */
    public class C5278a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Method f26442a;

        /* renamed from: d */
        public final /* synthetic */ Object f26443d;

        /* renamed from: e */
        public final /* synthetic */ Object f26444e;

        public C5278a(Method method, Object obj, Object obj2) {
            this.f26442a = method;
            this.f26443d = obj;
            this.f26444e = obj2;
        }

        public void run() {
            try {
                this.f26442a.invoke(this.f26443d, new Object[]{this.f26444e});
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e2) {
                e2.printStackTrace();
            }
        }
    }

    public C5277k0(String str, boolean z) {
        this.f26439a = str;
        this.f26441c = z;
    }

    /* renamed from: a */
    public void mo38948a(ObserverType observertype) {
        this.f26440b.add(new WeakReference(observertype));
    }

    /* renamed from: b */
    public void mo38949b(ObserverType observertype) {
        this.f26440b.add(observertype);
    }

    /* renamed from: c */
    public boolean mo38950c(StateType statetype) {
        Iterator<Object> it = this.f26440b.iterator();
        boolean z = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (next instanceof WeakReference) {
                next = ((WeakReference) next).get();
            }
            if (next != null) {
                try {
                    Method declaredMethod = next.getClass().getDeclaredMethod(this.f26439a, new Class[]{statetype.getClass()});
                    declaredMethod.setAccessible(true);
                    if (this.f26441c) {
                        OSUtils.m40270S(new C5278a(declaredMethod, next, statetype));
                    } else {
                        try {
                            declaredMethod.invoke(next, new Object[]{statetype});
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        } catch (InvocationTargetException e2) {
                            e2.printStackTrace();
                        }
                    }
                    z = true;
                } catch (NoSuchMethodException e3) {
                    e3.printStackTrace();
                }
            }
        }
        return z;
    }
}
