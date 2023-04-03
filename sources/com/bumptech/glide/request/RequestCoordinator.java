package com.bumptech.glide.request;

public interface RequestCoordinator {

    public enum RequestState {
        RUNNING(false),
        PAUSED(false),
        CLEARED(false),
        SUCCESS(true),
        FAILED(true);
        
        private final boolean isComplete;

        /* access modifiers changed from: public */
        RequestState(boolean z) {
            this.isComplete = z;
        }

        public boolean isComplete() {
            return this.isComplete;
        }
    }

    /* renamed from: a */
    boolean mo12654a(ae5 ae5);

    /* renamed from: b */
    void mo12655b(ae5 ae5);

    /* renamed from: d */
    boolean mo12656d();

    /* renamed from: e */
    void mo12657e(ae5 ae5);

    RequestCoordinator getRoot();

    /* renamed from: i */
    boolean mo12659i(ae5 ae5);

    /* renamed from: j */
    boolean mo12660j(ae5 ae5);
}
