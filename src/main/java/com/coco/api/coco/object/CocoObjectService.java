package com.coco.api.coco.object;

import java.util.List;

public interface CocoObjectService {

	public CocoObject get(long id);

	public List<CocoObject> getAll();

	public void delet(long id);

	public CocoObject saveOrUpdate(CocoObject cocoObject);
}
