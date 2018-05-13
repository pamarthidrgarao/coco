package com.coco.api.coco.object;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/coco")
public class CocoObjectController {
	
	private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private CocoObjectService cocoObjectService;

	@GetMapping("/{id}")
	private CocoObject get(long id) {
		return cocoObjectService.get(id);
	}

	@GetMapping("/getAll")
	private List<CocoObject> getAll() {
		return cocoObjectService.getAll();
	}

	@PostMapping("/add")
	private CocoObject add(@RequestBody CocoObject cocoObject) {
		LOGGER.info("Create coco called");
		return cocoObjectService.saveOrUpdate(cocoObject);
	}
}
