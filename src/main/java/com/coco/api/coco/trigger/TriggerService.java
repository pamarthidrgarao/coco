package com.coco.api.coco.trigger;

public interface TriggerService {

	public boolean validate(TriggerModel trigger);

	public String create(TriggerModel trigger);

	public String update(TriggerModel trigger);

	public String delete(TriggerModel trigger);
}
