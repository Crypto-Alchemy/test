package zendesk.messaging;

import android.content.res.Resources;
import androidx.lifecycle.LiveData;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import zendesk.configurations.Configuration;
import zendesk.messaging.Engine;
import zendesk.messaging.Event;
import zendesk.messaging.MessagingItem;
import zendesk.messaging.ObservableCounter;
import zendesk.messaging.Update;

class MessagingModel implements MessagingApi, EventListener, Engine.UpdateObserver {
    private static final AttachmentSettings DEFAULT_ATTACHMENT_SETTINGS;
    private static final Update DEFAULT_INPUT_STATE_UPDATE;
    private static final Update DEFAULT_MENU_ITEMS = new Update.ApplyMenuItems(new MenuItem[0]);
    private final List<Configuration> configurations;
    private final MessagingConversationLog conversationLog;
    private Engine currentEngine;
    private final AgentDetails defaultAgentDetails;
    private final Map<Engine, List<MessagingItem>> engineItems;
    private final List<Engine> engines;
    private final k04<AttachmentSettings> liveAttachmentSettings;
    private final k04<Boolean> liveComposerEnabled;
    private final k04<String> liveComposerHint;
    private final k04<ConnectionState> liveConnection;
    private final SingleLiveEvent<DialogContent> liveDialogUpdates;
    private final SingleLiveEvent<Banner> liveInterfaceUpdates;
    private final k04<Integer> liveKeyboardInputType;
    private final k04<List<MenuItem>> liveMenuItems;
    private final k04<List<MessagingItem>> liveMessagingItems;
    private final SingleLiveEvent<Update.Action.Navigation> liveNavigationUpdates;
    private final k04<Typing> liveTyping;

    static {
        AttachmentSettings attachmentSettings = new AttachmentSettings(0, false);
        DEFAULT_ATTACHMENT_SETTINGS = attachmentSettings;
        DEFAULT_INPUT_STATE_UPDATE = new Update.State.UpdateInputFieldState("", Boolean.TRUE, attachmentSettings, 131073);
    }

    public MessagingModel(Resources resources, List<Engine> list, MessagingConfiguration messagingConfiguration, MessagingConversationLog messagingConversationLog) {
        this.engines = new ArrayList(list.size());
        for (Engine next : list) {
            if (next != null) {
                this.engines.add(next);
            }
        }
        this.conversationLog = messagingConversationLog;
        this.configurations = messagingConfiguration.getConfigurations();
        this.defaultAgentDetails = messagingConfiguration.getBotAgentDetails(resources);
        this.engineItems = new LinkedHashMap();
        this.liveMessagingItems = new k04<>();
        this.liveMenuItems = new k04<>();
        this.liveTyping = new k04<>();
        this.liveConnection = new k04<>();
        this.liveComposerHint = new k04<>();
        this.liveKeyboardInputType = new k04<>();
        this.liveComposerEnabled = new k04<>();
        this.liveAttachmentSettings = new k04<>();
        this.liveNavigationUpdates = new SingleLiveEvent<>();
        this.liveInterfaceUpdates = new SingleLiveEvent<>();
        this.liveDialogUpdates = new SingleLiveEvent<>();
    }

    private void startEngine(Engine engine) {
        Engine engine2 = this.currentEngine;
        if (!(engine2 == null || engine2 == engine)) {
            stopEngine(engine2);
        }
        this.currentEngine = engine;
        engine.registerObserver(this);
        update(DEFAULT_INPUT_STATE_UPDATE);
        update(DEFAULT_MENU_ITEMS);
        engine.start(this);
    }

    private void startInitialEngine(final List<Engine> list) {
        if (!kj0.m47116g(list)) {
            if (list.size() == 1) {
                startEngine(list.get(0));
                return;
            }
            final ArrayList arrayList = new ArrayList();
            final ObservableCounter observableCounter = new ObservableCounter(new ObservableCounter.OnCountCompletedListener() {
            });
            observableCounter.increment(list.size());
            for (Engine isConversationOngoing : list) {
                isConversationOngoing.isConversationOngoing(new Engine.ConversationOnGoingCallback() {
                });
            }
        }
    }

    private void stopEngine(Engine engine) {
        engine.stop();
        engine.unregisterObserver(this);
    }

    public k04<AttachmentSettings> getLiveAttachmentSettings() {
        return this.liveAttachmentSettings;
    }

    public k04<Boolean> getLiveComposerEnabled() {
        return this.liveComposerEnabled;
    }

    public k04<String> getLiveComposerHint() {
        return this.liveComposerHint;
    }

    public LiveData<ConnectionState> getLiveConnection() {
        return this.liveConnection;
    }

    public SingleLiveEvent<DialogContent> getLiveDialogUpdates() {
        return this.liveDialogUpdates;
    }

    public SingleLiveEvent<Banner> getLiveInterfaceUpdates() {
        return this.liveInterfaceUpdates;
    }

    public k04<Integer> getLiveKeyboardInputType() {
        return this.liveKeyboardInputType;
    }

    public LiveData<List<MenuItem>> getLiveMenuItems() {
        return this.liveMenuItems;
    }

    public LiveData<List<MessagingItem>> getLiveMessagingItems() {
        return this.liveMessagingItems;
    }

    public SingleLiveEvent<Update.Action.Navigation> getLiveNavigationUpdates() {
        return this.liveNavigationUpdates;
    }

    public LiveData<Typing> getLiveTyping() {
        return this.liveTyping;
    }

    public void onEvent(Event event) {
        this.conversationLog.addEvent(event);
        if (event.getType().equals("transfer_option_clicked")) {
            Event.EngineSelection engineSelection = (Event.EngineSelection) event;
            for (Engine next : this.engines) {
                if (engineSelection.getSelectedEngine().getEngineId().equals(next.getId())) {
                    startEngine(next);
                    return;
                }
            }
            return;
        }
        Engine engine = this.currentEngine;
        if (engine != null) {
            engine.onEvent(event);
        }
    }

    public void start() {
        update(Update.State.UpdateInputFieldState.updateInputFieldEnabled(false));
        startInitialEngine(this.engines);
    }

    public void stop() {
        Engine engine = this.currentEngine;
        if (engine != null) {
            engine.stop();
            this.currentEngine.unregisterObserver(this);
        }
    }

    public void update(Update update) {
        String type = update.getType();
        type.hashCode();
        char c = 65535;
        switch (type.hashCode()) {
            case -1524638175:
                if (type.equals("update_input_field_state")) {
                    c = 0;
                    break;
                }
                break;
            case -358781964:
                if (type.equals("apply_messaging_items")) {
                    c = 1;
                    break;
                }
                break;
            case 35633838:
                if (type.equals("show_banner")) {
                    c = 2;
                    break;
                }
                break;
            case 64608020:
                if (type.equals("hide_typing")) {
                    c = 3;
                    break;
                }
                break;
            case 99891402:
                if (type.equals("show_dialog")) {
                    c = 4;
                    break;
                }
                break;
            case 381787729:
                if (type.equals("apply_menu_items")) {
                    c = 5;
                    break;
                }
                break;
            case 573178105:
                if (type.equals("show_typing")) {
                    c = 6;
                    break;
                }
                break;
            case 1766276262:
                if (type.equals("update_connection_state")) {
                    c = 7;
                    break;
                }
                break;
            case 1862666772:
                if (type.equals("navigation")) {
                    c = 8;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                Update.State.UpdateInputFieldState updateInputFieldState = (Update.State.UpdateInputFieldState) update;
                String hint = updateInputFieldState.getHint();
                if (hint != null) {
                    this.liveComposerHint.postValue(hint);
                }
                Boolean isEnabled = updateInputFieldState.isEnabled();
                if (isEnabled != null) {
                    this.liveComposerEnabled.postValue(isEnabled);
                }
                AttachmentSettings attachmentSettings = updateInputFieldState.getAttachmentSettings();
                if (attachmentSettings != null) {
                    this.liveAttachmentSettings.postValue(attachmentSettings);
                }
                Integer inputType = updateInputFieldState.getInputType();
                if (inputType != null) {
                    this.liveKeyboardInputType.postValue(inputType);
                    return;
                } else {
                    this.liveKeyboardInputType.postValue(131073);
                    return;
                }
            case 1:
                this.engineItems.put(this.currentEngine, ((Update.State.ApplyMessagingItems) update).getMessagingItems());
                ArrayList arrayList = new ArrayList();
                for (Map.Entry next : this.engineItems.entrySet()) {
                    for (MessagingItem messagingItem : (List) next.getValue()) {
                        if (messagingItem instanceof MessagingItem.TransferResponse) {
                            Date timestamp = messagingItem.getTimestamp();
                            String id = messagingItem.getId();
                            MessagingItem.TransferResponse transferResponse = (MessagingItem.TransferResponse) messagingItem;
                            messagingItem = new MessagingItem.TransferResponse(timestamp, id, transferResponse.getAgentDetails(), transferResponse.getMessage(), transferResponse.getEngineOptions(), this.currentEngine != null && ((Engine) next.getKey()).equals(this.currentEngine));
                        }
                        arrayList.add(messagingItem);
                    }
                }
                this.liveMessagingItems.postValue(arrayList);
                this.conversationLog.setMessagingItems(arrayList);
                return;
            case 2:
                this.liveInterfaceUpdates.postValue(((Update.ShowBanner) update).getBanner());
                return;
            case 3:
                this.liveTyping.postValue(new Typing(false));
                return;
            case 4:
                this.liveDialogUpdates.postValue(((Update.ShowDialog) update).getDialogContent());
                return;
            case 5:
                this.liveMenuItems.postValue(((Update.ApplyMenuItems) update).getMenuItems());
                return;
            case 6:
                this.liveTyping.postValue(new Typing(true, ((Update.State.ShowTyping) update).getAgentDetails()));
                return;
            case 7:
                this.liveConnection.postValue(((Update.State.UpdateConnectionState) update).getConnectionState());
                return;
            case 8:
                this.liveNavigationUpdates.postValue((Update.Action.Navigation) update);
                return;
            default:
                return;
        }
    }
}
