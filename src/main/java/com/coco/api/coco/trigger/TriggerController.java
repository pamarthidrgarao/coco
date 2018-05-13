package com.coco.api.coco.trigger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/coco/trigger")
public class TriggerController {

	@Autowired
	private TriggerService triggerService;

	@PostMapping("/validate/cocoTrigger")
	public boolean validate(@RequestBody TriggerModel trigger) {
		return triggerService.validate(trigger);
	}

	@PostMapping("/create/cocoTrigger")
	public String create(@RequestBody TriggerModel trigger) {
		return triggerService.create(trigger);
	}

	@PutMapping("/update/cocoTrigger")
	public String update(@RequestBody TriggerModel trigger) {
		return triggerService.update(trigger);
	}

	@DeleteMapping("/delete/cocoTrigger")
	public String delete(@RequestBody TriggerModel trigger) {
		return triggerService.delete(trigger);
	}
}
