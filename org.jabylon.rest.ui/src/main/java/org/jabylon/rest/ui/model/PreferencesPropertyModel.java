/**
 * (C) Copyright 2013 Jabylon (http://www.jabylon.org) and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
/**
 *
 */
package org.jabylon.rest.ui.model;

import org.apache.wicket.model.IModel;
import org.apache.wicket.model.Model;
import org.osgi.service.prefs.Preferences;

/**
 * @author Johannes Utzig (jutzig.dev@googlemail.com)
 *
 */
public class PreferencesPropertyModel extends Model<String> {

    private static final long serialVersionUID = 8851885506195822461L;
    private Preferences prefs;

    public PreferencesPropertyModel(Preferences prefs, String key, String defaultValue) {
        this(prefs,key,Model.of(defaultValue));
    }
    
    public PreferencesPropertyModel(Preferences prefs, String key, IModel<String> defaultValue) {
        super();
        this.prefs = prefs;
        this.key = key;
        this.defaultValue = defaultValue;
    }

    private String key;
    private IModel<String> defaultValue;

    @Override
    public String getObject() {
        return prefs.get(key, defaultValue.getObject());
    }

    @Override
    public void setObject(String object) {
        prefs.put(key, object);
    }


}
