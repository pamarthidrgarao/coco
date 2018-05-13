package com.coco.api.coco.object;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coco.api.coco.table.TableGenerator;

@Service
@Transactional
public class CocoObjectServiceImpl implements CocoObjectService {

	@Autowired
	private CocoObjectRepository repository;

	@Autowired
	private CocoObjectFieldRepository fieldRepository;

	@Autowired
	private TableGenerator tableGenerator;

	@Override
	public CocoObject get(long id) {
		return repository.findById(id).get();
	}

	@Override
	public List<CocoObject> getAll() {
		return (List<CocoObject>) repository.findAll();
	}

	@Override
	public void delet(long id) {
		repository.deleteById(id);
	}

	@Override
	public CocoObject saveOrUpdate(CocoObject cocoObject) {
		CocoObject cocoObject2 = repository.save(cocoObject);
		for (CocoObjectFields field : cocoObject.getFields()) {
			field.setObject(cocoObject2);
			fieldRepository.save(field);
		}
		tableGenerator.generate(cocoObject2);
		return cocoObject2;
	}

}
