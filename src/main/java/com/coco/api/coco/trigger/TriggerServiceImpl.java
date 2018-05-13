package com.coco.api.coco.trigger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TriggerServiceImpl implements TriggerService {

	@Autowired
	private TriggerValidator validator;

	@Autowired
	private TriggerAPI triggerApi;

	@Override
	public boolean validate(TriggerModel trigger) {

		return validator.validate();
	}

	@Override
	public String create(TriggerModel trigger) {
		triggerApi.create(trigger);
		return "Trigger create successfully";
	}

	@Override
	public String update(TriggerModel trigger) {
		triggerApi.update(trigger);
		return "Trigger update successfully";
	}

	@Override
	public String delete(TriggerModel trigger) {
		triggerApi.delete(trigger);
		return "Trigger deleted successfully";
	}

}
