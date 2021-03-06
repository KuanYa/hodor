package org.dromara.hodor.common.event;


public class Event<V> {

    private V value;
    private String eventType;

    /**
     * @param value     自定义参数
     * @param eventType 事件类型
     */
    public Event(V value, String eventType) {
        this.value = value;
        this.eventType = eventType;
    }

    public String getEventType() {
        return eventType;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

}
