package zendesk.messaging.p026ui;

import java.util.ArrayList;
import zendesk.belvedere.C9800a;
import zendesk.belvedere.C9802b;
import zendesk.belvedere.MediaResult;
import zendesk.messaging.BelvedereMediaHolder;
import zendesk.messaging.BelvedereMediaResolverCallback;
import zendesk.messaging.EventFactory;
import zendesk.messaging.EventListener;
import zendesk.messaging.p026ui.InputBox;

/* renamed from: zendesk.messaging.ui.InputBoxConsumer */
public class InputBoxConsumer implements InputBox.InputTextConsumer {
    private final C9800a belvedere;
    private final BelvedereMediaHolder belvedereMediaHolder;
    private final BelvedereMediaResolverCallback belvedereMediaResolverCallback;
    private final EventFactory eventFactory;
    private final EventListener eventListener;
    private final C9802b imageStream;

    public InputBoxConsumer(EventListener eventListener2, EventFactory eventFactory2, C9802b bVar, C9800a aVar, BelvedereMediaHolder belvedereMediaHolder2, BelvedereMediaResolverCallback belvedereMediaResolverCallback2) {
        this.eventListener = eventListener2;
        this.eventFactory = eventFactory2;
        this.imageStream = bVar;
        this.belvedere = aVar;
        this.belvedereMediaHolder = belvedereMediaHolder2;
        this.belvedereMediaResolverCallback = belvedereMediaResolverCallback2;
    }

    public boolean onConsumeText(String str) {
        if (kb6.m46949b(str)) {
            this.eventListener.onEvent(this.eventFactory.textInput(str));
        }
        ArrayList arrayList = new ArrayList();
        for (MediaResult m : this.belvedereMediaHolder.getSelectedMedia()) {
            arrayList.add(m.mo73704m());
        }
        if (!arrayList.isEmpty()) {
            this.belvedere.mo73729h(arrayList, "zendesk/messaging", this.belvedereMediaResolverCallback);
            this.belvedereMediaHolder.clear();
        }
        if (!this.imageStream.mo73736n()) {
            return true;
        }
        this.imageStream.mo73733k();
        return true;
    }
}
