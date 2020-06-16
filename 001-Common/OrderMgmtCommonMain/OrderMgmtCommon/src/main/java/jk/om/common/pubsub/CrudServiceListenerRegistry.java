package jk.om.common.pubsub;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import jk.om.common.dto.CrudServiceUpdateInfo;
import jk.om.common.pubsub.services.CrudServiceListener;

@Service
public class CrudServiceListenerRegistry {

	@SuppressWarnings("rawtypes")
	private Map<String, List<CrudServiceListener>> curdServiceListeners = new HashMap<>();

	@SuppressWarnings("rawtypes")
	public void addCrudServiceListener(String key, CrudServiceListener crudServiceListener) throws Exception {

		List<CrudServiceListener> listeners = this.curdServiceListeners.get(key);

		if (listeners == null) {
			listeners = new ArrayList<>();
			this.curdServiceListeners.put(key, listeners);
		}

		listeners.add(crudServiceListener);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void invokeCrudServiceListeners(String crudType, CrudServiceUpdateInfo crudUpdateInfo) throws Exception {

		List<CrudServiceListener> listeners = this.curdServiceListeners.get(crudType);

		if (listeners == null) {
			return;
		}

		for(CrudServiceListener alistener: listeners) {
			alistener.handleEvent(crudType, crudUpdateInfo);
		}
		
	}
}
