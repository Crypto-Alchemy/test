package p018io.reactivex.internal.queue;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: io.reactivex.internal.queue.MpscLinkedQueue */
public final class MpscLinkedQueue<T> implements r26<T> {

    /* renamed from: a */
    public final AtomicReference<LinkedQueueNode<T>> f30044a = new AtomicReference<>();

    /* renamed from: d */
    public final AtomicReference<LinkedQueueNode<T>> f30045d = new AtomicReference<>();

    /* renamed from: io.reactivex.internal.queue.MpscLinkedQueue$LinkedQueueNode */
    public static final class LinkedQueueNode<E> extends AtomicReference<LinkedQueueNode<E>> {
        private static final long serialVersionUID = 2404266111789071508L;
        private E value;

        public LinkedQueueNode() {
        }

        public E getAndNullValue() {
            E lpValue = lpValue();
            spValue((Object) null);
            return lpValue;
        }

        public E lpValue() {
            return this.value;
        }

        public LinkedQueueNode<E> lvNext() {
            return (LinkedQueueNode) get();
        }

        public void soNext(LinkedQueueNode<E> linkedQueueNode) {
            lazySet(linkedQueueNode);
        }

        public void spValue(E e) {
            this.value = e;
        }

        public LinkedQueueNode(E e) {
            spValue(e);
        }
    }

    public MpscLinkedQueue() {
        LinkedQueueNode linkedQueueNode = new LinkedQueueNode();
        mo43806d(linkedQueueNode);
        mo43807e(linkedQueueNode);
    }

    /* renamed from: a */
    public LinkedQueueNode<T> mo43803a() {
        return this.f30045d.get();
    }

    /* renamed from: b */
    public LinkedQueueNode<T> mo43804b() {
        return this.f30045d.get();
    }

    /* renamed from: c */
    public LinkedQueueNode<T> mo43805c() {
        return this.f30044a.get();
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:3:0x000a, LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void clear() {
        /*
            r1 = this;
        L_0x0000:
            java.lang.Object r0 = r1.poll()
            if (r0 == 0) goto L_0x000d
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x000d
            goto L_0x0000
        L_0x000d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p018io.reactivex.internal.queue.MpscLinkedQueue.clear():void");
    }

    /* renamed from: d */
    public void mo43806d(LinkedQueueNode<T> linkedQueueNode) {
        this.f30045d.lazySet(linkedQueueNode);
    }

    /* renamed from: e */
    public LinkedQueueNode<T> mo43807e(LinkedQueueNode<T> linkedQueueNode) {
        return this.f30044a.getAndSet(linkedQueueNode);
    }

    public boolean isEmpty() {
        if (mo43804b() == mo43805c()) {
            return true;
        }
        return false;
    }

    public boolean offer(T t) {
        if (t != null) {
            LinkedQueueNode linkedQueueNode = new LinkedQueueNode(t);
            mo43807e(linkedQueueNode).soNext(linkedQueueNode);
            return true;
        }
        throw new NullPointerException("Null is not a valid element");
    }

    public T poll() {
        LinkedQueueNode lvNext;
        LinkedQueueNode a = mo43803a();
        LinkedQueueNode lvNext2 = a.lvNext();
        if (lvNext2 != null) {
            T andNullValue = lvNext2.getAndNullValue();
            mo43806d(lvNext2);
            return andNullValue;
        } else if (a == mo43805c()) {
            return null;
        } else {
            do {
                lvNext = a.lvNext();
            } while (lvNext == null);
            T andNullValue2 = lvNext.getAndNullValue();
            mo43806d(lvNext);
            return andNullValue2;
        }
    }
}
