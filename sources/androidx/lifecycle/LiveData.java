package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import java.util.Iterator;
import java.util.Map;

public abstract class LiveData<T> {
    public static final Object NOT_SET = new Object();
    public int mActiveCount;
    private boolean mChangingActiveState;
    private volatile Object mData;
    public final Object mDataLock;
    private boolean mDispatchInvalidated;
    private boolean mDispatchingValue;
    private ok5<pf4<? super T>, LiveData<T>.C6913c> mObservers;
    public volatile Object mPendingData;
    private final Runnable mPostValueRunnable;
    private int mVersion;

    public class LifecycleBoundObserver extends LiveData<T>.C6913c implements C0715e {

        /* renamed from: k */
        public final ug3 f3910k;

        public LifecycleBoundObserver(ug3 ug3, pf4<? super T> pf4) {
            super(pf4);
            this.f3910k = ug3;
        }

        /* renamed from: b */
        public void mo6325b() {
            this.f3910k.getLifecycle().mo6297c(this);
        }

        /* renamed from: c */
        public boolean mo6326c(ug3 ug3) {
            if (this.f3910k == ug3) {
                return true;
            }
            return false;
        }

        /* renamed from: d */
        public boolean mo6327d() {
            return this.f3910k.getLifecycle().mo6296b().isAtLeast(Lifecycle.State.STARTED);
        }

        /* renamed from: f */
        public void mo907f(ug3 ug3, Lifecycle.Event event) {
            Lifecycle.State b = this.f3910k.getLifecycle().mo6296b();
            if (b == Lifecycle.State.DESTROYED) {
                LiveData.this.removeObserver(this.f3914a);
                return;
            }
            Lifecycle.State state = null;
            while (state != b) {
                mo6329a(mo6327d());
                state = b;
                b = this.f3910k.getLifecycle().mo6296b();
            }
        }
    }

    /* renamed from: androidx.lifecycle.LiveData$a */
    public class C0698a implements Runnable {
        public C0698a() {
        }

        public void run() {
            Object obj;
            synchronized (LiveData.this.mDataLock) {
                obj = LiveData.this.mPendingData;
                LiveData.this.mPendingData = LiveData.NOT_SET;
            }
            LiveData.this.setValue(obj);
        }
    }

    /* renamed from: androidx.lifecycle.LiveData$b */
    public class C0699b extends LiveData<T>.C6913c {
        public C0699b(pf4<? super T> pf4) {
            super(pf4);
        }

        /* renamed from: d */
        public boolean mo6327d() {
            return true;
        }
    }

    /* renamed from: androidx.lifecycle.LiveData$c */
    public abstract class C0700c {

        /* renamed from: a */
        public final pf4<? super T> f3914a;

        /* renamed from: d */
        public boolean f3915d;

        /* renamed from: e */
        public int f3916e = -1;

        public C0700c(pf4<? super T> pf4) {
            this.f3914a = pf4;
        }

        /* renamed from: a */
        public void mo6329a(boolean z) {
            int i;
            if (z != this.f3915d) {
                this.f3915d = z;
                LiveData liveData = LiveData.this;
                if (z) {
                    i = 1;
                } else {
                    i = -1;
                }
                liveData.changeActiveCounter(i);
                if (this.f3915d) {
                    LiveData.this.dispatchingValue(this);
                }
            }
        }

        /* renamed from: b */
        public void mo6325b() {
        }

        /* renamed from: c */
        public boolean mo6326c(ug3 ug3) {
            return false;
        }

        /* renamed from: d */
        public abstract boolean mo6327d();
    }

    public LiveData(T t) {
        this.mDataLock = new Object();
        this.mObservers = new ok5<>();
        this.mActiveCount = 0;
        this.mPendingData = NOT_SET;
        this.mPostValueRunnable = new C0698a();
        this.mData = t;
        this.mVersion = 0;
    }

    public static void assertMainThread(String str) {
        if (!C3634xp.m30269f().mo134c()) {
            throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
        }
    }

    private void considerNotify(LiveData<T>.C6913c cVar) {
        if (cVar.f3915d) {
            if (!cVar.mo6327d()) {
                cVar.mo6329a(false);
                return;
            }
            int i = cVar.f3916e;
            int i2 = this.mVersion;
            if (i < i2) {
                cVar.f3916e = i2;
                cVar.f3914a.onChanged(this.mData);
            }
        }
    }

    public void changeActiveCounter(int i) {
        boolean z;
        boolean z2;
        int i2 = this.mActiveCount;
        this.mActiveCount = i + i2;
        if (!this.mChangingActiveState) {
            this.mChangingActiveState = true;
            while (true) {
                try {
                    int i3 = this.mActiveCount;
                    if (i2 != i3) {
                        if (i2 != 0 || i3 <= 0) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (i2 <= 0 || i3 != 0) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if (z) {
                            onActive();
                        } else if (z2) {
                            onInactive();
                        }
                        i2 = i3;
                    } else {
                        return;
                    }
                } finally {
                    this.mChangingActiveState = false;
                }
            }
        }
    }

    public void dispatchingValue(LiveData<T>.C6913c cVar) {
        if (this.mDispatchingValue) {
            this.mDispatchInvalidated = true;
            return;
        }
        this.mDispatchingValue = true;
        do {
            this.mDispatchInvalidated = false;
            if (cVar == null) {
                ok5<K, V>.C6956d k = this.mObservers.mo23970k();
                while (k.hasNext()) {
                    considerNotify((C0700c) ((Map.Entry) k.next()).getValue());
                    if (this.mDispatchInvalidated) {
                        break;
                    }
                }
            } else {
                considerNotify(cVar);
                cVar = null;
            }
        } while (this.mDispatchInvalidated);
        this.mDispatchingValue = false;
    }

    public T getValue() {
        T t = this.mData;
        if (t != NOT_SET) {
            return t;
        }
        return null;
    }

    public int getVersion() {
        return this.mVersion;
    }

    public boolean hasActiveObservers() {
        if (this.mActiveCount > 0) {
            return true;
        }
        return false;
    }

    public boolean hasObservers() {
        if (this.mObservers.size() > 0) {
            return true;
        }
        return false;
    }

    public void observe(ug3 ug3, pf4<? super T> pf4) {
        assertMainThread("observe");
        if (ug3.getLifecycle().mo6296b() != Lifecycle.State.DESTROYED) {
            LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(ug3, pf4);
            C0700c q = this.mObservers.mo18386q(pf4, lifecycleBoundObserver);
            if (q != null && !q.mo6326c(ug3)) {
                throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
            } else if (q == null) {
                ug3.getLifecycle().mo6295a(lifecycleBoundObserver);
            }
        }
    }

    public void observeForever(pf4<? super T> pf4) {
        assertMainThread("observeForever");
        C0699b bVar = new C0699b(pf4);
        C0700c q = this.mObservers.mo18386q(pf4, bVar);
        if (q instanceof LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        } else if (q == null) {
            bVar.mo6329a(true);
        }
    }

    public void onActive() {
    }

    public void onInactive() {
    }

    public void postValue(T t) {
        boolean z;
        synchronized (this.mDataLock) {
            if (this.mPendingData == NOT_SET) {
                z = true;
            } else {
                z = false;
            }
            this.mPendingData = t;
        }
        if (z) {
            C3634xp.m30269f().mo135d(this.mPostValueRunnable);
        }
    }

    public void removeObserver(pf4<? super T> pf4) {
        assertMainThread("removeObserver");
        C0700c r = this.mObservers.mo18387r(pf4);
        if (r != null) {
            r.mo6325b();
            r.mo6329a(false);
        }
    }

    public void removeObservers(ug3 ug3) {
        assertMainThread("removeObservers");
        Iterator<Map.Entry<pf4<? super T>, LiveData<T>.C6913c>> it = this.mObservers.iterator();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            if (((C0700c) next.getValue()).mo6326c(ug3)) {
                removeObserver((pf4) next.getKey());
            }
        }
    }

    public void setValue(T t) {
        assertMainThread("setValue");
        this.mVersion++;
        this.mData = t;
        dispatchingValue((LiveData<T>.C6913c) null);
    }

    public LiveData() {
        this.mDataLock = new Object();
        this.mObservers = new ok5<>();
        this.mActiveCount = 0;
        Object obj = NOT_SET;
        this.mPendingData = obj;
        this.mPostValueRunnable = new C0698a();
        this.mData = obj;
        this.mVersion = -1;
    }
}
