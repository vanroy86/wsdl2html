package org.jaxws.stub2html.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.jaxws.stub2html.model.StubTypeTree;

/**
 * 
 * @author chenjianjx
 *
 */
public class StubTypeTreeRepository {

	private Map<Class<?>, StubTypeTree> repository = new HashMap<Class<?>, StubTypeTree>();

	public StubTypeTree getStubTypeTree(Class<?> type) {
		StubTypeTree tree = repository.get(type);

		if (tree == null) {
			tree = new StubTypeTree();
			tree.setType(type);
			repository.put(type, tree);
		}
		return tree;
	}

	public Collection<StubTypeTree> getAllTrees() {
		return repository.values();
	}

	public boolean isEmpty() {
		return repository.isEmpty();
	}

}
