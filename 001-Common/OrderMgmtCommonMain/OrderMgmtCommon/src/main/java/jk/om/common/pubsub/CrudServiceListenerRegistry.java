package jk.om.common.pubsub;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import jk.om.common.dto.CrudServiceUpdateInfo;
import jk.om.common.pubsub.services.CrudServiceListener;

@Service("CrudServiceListenerRegistry")
public class CrudServiceListenerRegistry {

	private static final Logger LOGGER = LoggerFactory.getLogger(CrudServiceListenerRegistry.class);

	@SuppressWarnings("rawtypes")
	private Map<String, List<CrudServiceListener>> curdServiceListeners = new HashMap<>();

	@SuppressWarnings("rawtypes")
	public void addCrudServiceListener(String key, CrudServiceListener crudServiceListener) throws Exception {
		LOGGER.debug("Enter key " + key);

		List<CrudServiceListener> listeners = this.curdServiceListeners.get(key);

		if (listeners == null) {
			listeners = new ArrayList<>();
			this.curdServiceListeners.put(key, listeners);
		}

		listeners.add(crudServiceListener);

		LOGGER.debug("Exit key " + key);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void invokeCrudServiceListeners(String crudType, CrudServiceUpdateInfo crudUpdateInfo) throws Exception {
		LOGGER.debug("Enter crudType " + crudType);

		List<CrudServiceListener> listeners = this.curdServiceListeners.get(crudType);

		if (listeners == null || listeners.size() == 0) {

			LOGGER.debug("Exit crudType " + crudType + " listeners are zero");
			return;
		}

		for (CrudServiceListener alistener : listeners) {
			alistener.handleEvent(crudType, crudUpdateInfo);
		}

		LOGGER.debug("Exit crudType " + crudType);
	}
}
